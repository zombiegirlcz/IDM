package zmm;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import ymm.g;
import ymm.i;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d implements Serializable {
    public static final d DEFAULT_STYLE = new c(0);
    public static final d JSON_STYLE;
    public static final d MULTI_LINE_STYLE;
    public static final d NO_CLASS_NAME_STYLE;
    public static final d NO_FIELD_NAMES_STYLE;
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY;
    public static final d SHORT_PREFIX_STYLE;
    public static final d SIMPLE_STYLE;
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean useFieldNames = true;
    private boolean useClassName = true;
    private boolean useShortClassName = false;
    private boolean useIdentityHashCode = true;
    private String contentStart = "[";
    private String contentEnd = "]";
    private String fieldNameValueSeparator = "=";
    private boolean fieldSeparatorAtStart = false;
    private boolean fieldSeparatorAtEnd = false;
    private String fieldSeparator = ",";
    private String arrayStart = "{";
    private String arraySeparator = ",";
    private boolean arrayContentDetail = true;
    private String arrayEnd = "}";
    private boolean defaultFullDetail = true;
    private String nullText = "<null>";
    private String sizeStartText = "<size=";
    private String sizeEndText = ">";
    private String summaryObjectStartText = "<";
    private String summaryObjectEndText = ">";

    static {
        c cVar = new c(2);
        cVar.setContentStart("[");
        cVar.setFieldSeparator(System.lineSeparator() + "  ");
        cVar.setFieldSeparatorAtStart(true);
        cVar.setContentEnd(System.lineSeparator() + "]");
        MULTI_LINE_STYLE = cVar;
        c cVar2 = new c(4);
        cVar2.setUseFieldNames(false);
        NO_FIELD_NAMES_STYLE = cVar2;
        c cVar3 = new c(5);
        cVar3.setUseShortClassName(true);
        cVar3.setUseIdentityHashCode(false);
        SHORT_PREFIX_STYLE = cVar3;
        c cVar4 = new c(6);
        cVar4.setUseClassName(false);
        cVar4.setUseIdentityHashCode(false);
        cVar4.setUseFieldNames(false);
        cVar4.setContentStart("");
        cVar4.setContentEnd("");
        SIMPLE_STYLE = cVar4;
        c cVar5 = new c(3);
        cVar5.setUseClassName(false);
        cVar5.setUseIdentityHashCode(false);
        NO_CLASS_NAME_STYLE = cVar5;
        c cVar6 = new c(1);
        cVar6.setUseClassName(false);
        cVar6.setUseIdentityHashCode(false);
        cVar6.setContentStart("{");
        cVar6.setContentEnd("}");
        cVar6.setArrayStart("[");
        cVar6.setArrayEnd("]");
        cVar6.setFieldSeparator(",");
        cVar6.setFieldNameValueSeparator(":");
        cVar6.setNullText("null");
        cVar6.setSummaryObjectStartText("\"<");
        cVar6.setSummaryObjectEndText(">\"");
        cVar6.setSizeStartText("\"<size=");
        cVar6.setSizeEndText(">\"");
        JSON_STYLE = cVar6;
        REGISTRY = new ThreadLocal<>();
    }

    public static Map<Object, Object> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj2) {
        Map<Object, Object> registry = getRegistry();
        return registry != null && registry.containsKey(obj2);
    }

    public static void register(Object obj2) {
        if (obj2 != null) {
            if (getRegistry() == null) {
                REGISTRY.set(new WeakHashMap<>());
            }
            getRegistry().put(obj2, null);
        }
    }

    public static void unregister(Object obj2) {
        Map<Object, Object> registry;
        if (obj2 == null || (registry = getRegistry()) == null) {
            return;
        }
        registry.remove(obj2);
        if (registry.isEmpty()) {
            REGISTRY.remove();
        }
    }

    public void append(StringBuffer stringBuffer, String str, Object obj2, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (obj2 == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj2, isFullDetail(bool));
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendClassName(StringBuffer stringBuffer, Object obj2) {
        if (!this.useClassName || obj2 == null) {
            return;
        }
        register(obj2);
        if (this.useShortClassName) {
            stringBuffer.append(getShortClassName(obj2.getClass()));
        } else {
            stringBuffer.append(obj2.getClass().getName());
        }
    }

    public void appendContentEnd(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentEnd);
    }

    public void appendContentStart(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentStart);
    }

    public void appendCyclicObject(StringBuffer stringBuffer, String str, Object obj2) {
        Objects.requireNonNull(obj2, new i("Cannot get the toString of a null object", new Object[0]));
        String name = obj2.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj2));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Object obj2) {
        stringBuffer.append(obj2);
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj2) {
        if (!this.fieldSeparatorAtEnd) {
            removeLastFieldSeparator(stringBuffer);
        }
        appendContentEnd(stringBuffer);
        unregister(obj2);
    }

    public void appendFieldEnd(StringBuffer stringBuffer, String str) {
        appendFieldSeparator(stringBuffer);
    }

    public void appendFieldSeparator(StringBuffer stringBuffer) {
        stringBuffer.append(this.fieldSeparator);
    }

    public void appendFieldStart(StringBuffer stringBuffer, String str) {
        if (!this.useFieldNames || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.fieldNameValueSeparator);
    }

    public void appendIdentityHashCode(StringBuffer stringBuffer, Object obj2) {
        if (!isUseIdentityHashCode() || obj2 == null) {
            return;
        }
        register(obj2);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj2)));
    }

    public void appendInternal(StringBuffer stringBuffer, String str, Object obj2, boolean z) {
        if (isRegistered(obj2) && !(obj2 instanceof Number) && !(obj2 instanceof Boolean) && !(obj2 instanceof Character)) {
            appendCyclicObject(stringBuffer, str, obj2);
            return;
        }
        register(obj2);
        try {
            if (obj2 instanceof Collection) {
                if (z) {
                    appendDetail(stringBuffer, str, (Collection<?>) obj2);
                } else {
                    appendSummarySize(stringBuffer, str, ((Collection) obj2).size());
                }
            } else if (obj2 instanceof Map) {
                if (z) {
                    appendDetail(stringBuffer, str, (Map<?, ?>) obj2);
                } else {
                    appendSummarySize(stringBuffer, str, ((Map) obj2).size());
                }
            } else if (obj2 instanceof long[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (long[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (long[]) obj2);
                }
            } else if (obj2 instanceof int[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (int[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (int[]) obj2);
                }
            } else if (obj2 instanceof short[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (short[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (short[]) obj2);
                }
            } else if (obj2 instanceof byte[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (byte[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (byte[]) obj2);
                }
            } else if (obj2 instanceof char[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (char[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (char[]) obj2);
                }
            } else if (obj2 instanceof double[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (double[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (double[]) obj2);
                }
            } else if (obj2 instanceof float[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (float[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (float[]) obj2);
                }
            } else if (obj2 instanceof boolean[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (boolean[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (boolean[]) obj2);
                }
            } else if (obj2.getClass().isArray()) {
                if (z) {
                    appendDetail(stringBuffer, str, (Object[]) obj2);
                } else {
                    appendSummary(stringBuffer, str, (Object[]) obj2);
                }
            } else if (z) {
                appendDetail(stringBuffer, str, obj2);
            } else {
                appendSummary(stringBuffer, str, obj2);
            }
            unregister(obj2);
        } catch (Throwable th10) {
            unregister(obj2);
            throw th10;
        }
    }

    public void appendNullText(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.nullText);
    }

    public void appendStart(StringBuffer stringBuffer, Object obj2) {
        if (obj2 != null) {
            appendClassName(stringBuffer, obj2);
            appendIdentityHashCode(stringBuffer, obj2);
            appendContentStart(stringBuffer);
            if (this.fieldSeparatorAtStart) {
                appendFieldSeparator(stringBuffer);
            }
        }
    }

    public void appendSummary(StringBuffer stringBuffer, String str, Object obj2) {
        stringBuffer.append(this.summaryObjectStartText);
        stringBuffer.append(getShortClassName(obj2.getClass()));
        stringBuffer.append(this.summaryObjectEndText);
    }

    public void appendSummarySize(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.sizeStartText);
        stringBuffer.append(i);
        stringBuffer.append(this.sizeEndText);
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        if (str != null) {
            int length = this.contentStart.length() + str.indexOf(this.contentStart);
            int iLastIndexOf = str.lastIndexOf(this.contentEnd);
            if (length == iLastIndexOf || length < 0 || iLastIndexOf < 0) {
                return;
            }
            if (this.fieldSeparatorAtStart) {
                removeLastFieldSeparator(stringBuffer);
            }
            stringBuffer.append((CharSequence) str, length, iLastIndexOf);
            appendFieldSeparator(stringBuffer);
        }
    }

    public String getArrayEnd() {
        return this.arrayEnd;
    }

    public String getArraySeparator() {
        return this.arraySeparator;
    }

    public String getArrayStart() {
        return this.arrayStart;
    }

    public String getContentEnd() {
        return this.contentEnd;
    }

    public String getContentStart() {
        return this.contentStart;
    }

    public String getFieldNameValueSeparator() {
        return this.fieldNameValueSeparator;
    }

    public String getFieldSeparator() {
        return this.fieldSeparator;
    }

    public String getNullText() {
        return this.nullText;
    }

    public String getShortClassName(Class<?> cls) {
        HashMap map = ymm.b.f315058a;
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (g.d(name)) {
            return "";
        }
        StringBuilder sb6 = new StringBuilder();
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb6.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = a0.d.o(name, 1, 1);
            }
            Map map2 = ymm.b.f315060c;
            if (map2.containsKey(name)) {
                name = (String) map2.get(name);
            }
        }
        int iLastIndexOf = name.lastIndexOf(46);
        int iIndexOf = name.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = name.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace(CoreConstants.DOLLAR, CoreConstants.DOT);
        }
        return strSubstring + ((Object) sb6);
    }

    public String getSizeEndText() {
        return this.sizeEndText;
    }

    public String getSizeStartText() {
        return this.sizeStartText;
    }

    public String getSummaryObjectEndText() {
        return this.summaryObjectEndText;
    }

    public String getSummaryObjectStartText() {
        return this.summaryObjectStartText;
    }

    public boolean isArrayContentDetail() {
        return this.arrayContentDetail;
    }

    public boolean isDefaultFullDetail() {
        return this.defaultFullDetail;
    }

    public boolean isFieldSeparatorAtEnd() {
        return this.fieldSeparatorAtEnd;
    }

    public boolean isFieldSeparatorAtStart() {
        return this.fieldSeparatorAtStart;
    }

    public boolean isFullDetail(Boolean bool) {
        return bool == null ? this.defaultFullDetail : bool.booleanValue();
    }

    public boolean isUseClassName() {
        return this.useClassName;
    }

    public boolean isUseFieldNames() {
        return this.useFieldNames;
    }

    public boolean isUseIdentityHashCode() {
        return this.useIdentityHashCode;
    }

    public boolean isUseShortClassName() {
        return this.useShortClassName;
    }

    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj2) {
        stringBuffer.append(this.arrayStart);
        int length = Array.getLength(obj2);
        for (int i = 0; i < length; i++) {
            appendDetail(stringBuffer, str, i, Array.get(obj2, i));
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeLastFieldSeparator(java.lang.StringBuffer r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.fieldSeparator
            int r1 = ymm.g.f315066a
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L4d
            if (r0 != 0) goto Lb
            goto L4d
        Lb:
            int r3 = r0.length()
            int r4 = r9.length()
            if (r3 <= r4) goto L16
            goto L50
        L16:
            int r3 = r9.length()
            int r4 = r0.length()
            int r3 = r3 - r4
            int r4 = r0.length()
            r5 = 0
            int r6 = r9.length()
            int r6 = r6 - r3
            int r7 = r0.length()
            if (r3 < 0) goto L50
            if (r4 >= 0) goto L32
            goto L50
        L32:
            if (r6 < r4) goto L50
            if (r7 >= r4) goto L37
            goto L50
        L37:
            int r6 = r4 + (-1)
            if (r4 <= 0) goto L51
            int r4 = r3 + 1
            char r3 = r9.charAt(r3)
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r3 != r5) goto L50
            r3 = r4
            r4 = r6
            r5 = r7
            goto L37
        L4d:
            if (r9 != r0) goto L50
            goto L51
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L61
            int r0 = r9.length()
            java.lang.String r1 = r8.fieldSeparator
            int r1 = r1.length()
            int r0 = r0 - r1
            r9.setLength(r0)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zmm.d.removeLastFieldSeparator(java.lang.StringBuffer):void");
    }

    public void setArrayContentDetail(boolean z) {
        this.arrayContentDetail = z;
    }

    public void setArrayEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayEnd = str;
    }

    public void setArraySeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.arraySeparator = str;
    }

    public void setArrayStart(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayStart = str;
    }

    public void setContentEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.contentEnd = str;
    }

    public void setContentStart(String str) {
        if (str == null) {
            str = "";
        }
        this.contentStart = str;
    }

    public void setDefaultFullDetail(boolean z) {
        this.defaultFullDetail = z;
    }

    public void setFieldNameValueSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldNameValueSeparator = str;
    }

    public void setFieldSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldSeparator = str;
    }

    public void setFieldSeparatorAtEnd(boolean z) {
        this.fieldSeparatorAtEnd = z;
    }

    public void setFieldSeparatorAtStart(boolean z) {
        this.fieldSeparatorAtStart = z;
    }

    public void setNullText(String str) {
        if (str == null) {
            str = "";
        }
        this.nullText = str;
    }

    public void setSizeEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeEndText = str;
    }

    public void setSizeStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeStartText = str;
    }

    public void setSummaryObjectEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectEndText = str;
    }

    public void setSummaryObjectStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectStartText = str;
    }

    public void setUseClassName(boolean z) {
        this.useClassName = z;
    }

    public void setUseFieldNames(boolean z) {
        this.useFieldNames = z;
    }

    public void setUseIdentityHashCode(boolean z) {
        this.useIdentityHashCode = z;
    }

    public void setUseShortClassName(boolean z) {
        this.useShortClassName = z;
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(this.arrayStart);
        Iterator<?> it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            appendDetail(stringBuffer, str, i, it8.next());
            i++;
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, Object[] objArr) {
        appendSummarySize(stringBuffer, str, objArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, long j2) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, j2);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, long[] jArr) {
        appendSummarySize(stringBuffer, str, jArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, int[] iArr) {
        appendSummarySize(stringBuffer, str, iArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, short[] sArr) {
        appendSummarySize(stringBuffer, str, sArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, int i) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, i);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, byte[] bArr) {
        appendSummarySize(stringBuffer, str, bArr.length);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, long j2) {
        stringBuffer.append(j2);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, char[] cArr) {
        appendSummarySize(stringBuffer, str, cArr.length);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, double[] dArr) {
        appendSummarySize(stringBuffer, str, dArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, short s2) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, s2);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, short s2) {
        stringBuffer.append((int) s2);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, float[] fArr) {
        appendSummarySize(stringBuffer, str, fArr.length);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, byte b4) {
        stringBuffer.append((int) b4);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, boolean[] zArr) {
        appendSummarySize(stringBuffer, str, zArr.length);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, char c2) {
        stringBuffer.append(c2);
    }

    public void append(StringBuffer stringBuffer, String str, byte b4) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, b4);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public void append(StringBuffer stringBuffer, String str, char c2) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, c2);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < objArr.length; i++) {
            appendDetail(stringBuffer, str, i, objArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, double d) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, d);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int i, Object obj2) {
        if (i > 0) {
            stringBuffer.append(this.arraySeparator);
        }
        if (obj2 == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj2, this.arrayContentDetail);
        }
    }

    public void append(StringBuffer stringBuffer, String str, float f) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, f);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, boolean z) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, z);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (objArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, objArr);
        } else {
            appendSummary(stringBuffer, str, objArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (jArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, jArr);
        } else {
            appendSummary(stringBuffer, str, jArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (iArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, iArr);
        } else {
            appendSummary(stringBuffer, str, iArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (sArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, sArr);
        } else {
            appendSummary(stringBuffer, str, sArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (bArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, bArr);
        } else {
            appendSummary(stringBuffer, str, bArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (cArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, cArr);
        } else {
            appendSummary(stringBuffer, str, cArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (dArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, dArr);
        } else {
            appendSummary(stringBuffer, str, dArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (fArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, fArr);
        } else {
            appendSummary(stringBuffer, str, fArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (zArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, zArr);
        } else {
            appendSummary(stringBuffer, str, zArr);
        }
        appendFieldEnd(stringBuffer, str);
    }
}
