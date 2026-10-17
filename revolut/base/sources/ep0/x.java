package ep0;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.style.LeadingMarginSpan;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements Html.TagHandler {

    @NotNull
    private static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128056c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f128057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f128058h;

    public x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128054a = context;
        this.f = 1;
        this.f128057g = new ArrayDeque();
        this.f128058h = new ArrayDeque();
    }

    public final void a(Editable editable, m mVar, String str) {
        int length = editable.length();
        Object[] spans = editable.getSpans(0, length, v.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        Object obj2 = (v) kotlin.collections.d.f0(spans);
        if (obj2 != null) {
            int spanStart = editable.getSpanStart(obj2);
            editable.removeSpan(obj2);
            if (spanStart != length) {
                Object[] spans2 = editable.getSpans(spanStart, length, LeadingMarginSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
                for (Object obj3 : spans2) {
                    if (!(((LeadingMarginSpan) obj3) instanceof t)) {
                        return;
                    }
                }
                int size = this.f128058h.size();
                String str2 = (size <= 1 ? "" : kotlin.text.a0.C("  ", size - 1)) + str;
                editable.insert(spanStart, str2);
                editable.setSpan(new b0(), spanStart, str2.length() + spanStart, 18);
                editable.setSpan(mVar, spanStart, str2.length() + length, 33);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String tag2, Editable output, XMLReader xmlReader) {
        int length;
        int[][] iArr;
        int i;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(xmlReader, "xmlReader");
        if (this.f128055b == 0) {
            Context context = this.f128054a;
            this.f128055b = kli.a.k(context, 28.0f);
            this.f128056c = kli.a.k(context, 20.0f);
            this.d = kli.a.k(context, 8.0f);
            this.e = d.a(context);
        }
        String lowerCase = tag2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        int i2 = 0;
        ArrayDeque arrayDeque = this.f128058h;
        switch (iHashCode) {
            case 103737637:
                if (lowerCase.equals("md_li")) {
                    if (output.length() != 0 && (!z || f0.S0(output) != '\n')) {
                        output.append('\n');
                    }
                    if (z) {
                        v vVar = new v();
                        int length2 = output.length();
                        output.setSpan(vVar, length2, length2, 17);
                        return;
                    }
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    String str = (String) arrayDeque.last();
                    int size = arrayDeque.size();
                    if (!arrayDeque.isEmpty()) {
                        Iterator it8 = arrayDeque.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f((String) it8.next(), str) && (i2 = i2 + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                    }
                    int i3 = i2;
                    if (Intrinsics.f(str, "md_ol")) {
                        a(output, new y(this.f, size, this.f128055b, this.f128056c, this.d, this.e), a0.d.h(this.f, ". "));
                        this.f++;
                        return;
                    } else {
                        if (Intrinsics.f(str, "md_ul")) {
                            a(output, new q(this.f128054a, size, i3, this.f128055b, this.f128056c, this.d), i3 <= 1 ? "• " : "◦ ");
                            return;
                        }
                        return;
                    }
                }
                return;
            case 103737733:
                if (lowerCase.equals("md_ol")) {
                    ArrayDeque arrayDeque2 = this.f128057g;
                    if (z) {
                        arrayDeque.addLast("md_ol");
                        arrayDeque2.addLast(Integer.valueOf(this.f));
                        this.f = 1;
                        return;
                    } else {
                        if (Intrinsics.f(arrayDeque.e(), "md_ol")) {
                            arrayDeque.removeLast();
                            if (arrayDeque2.isEmpty()) {
                                return;
                            }
                            this.f = ((Number) arrayDeque2.removeLast()).intValue();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 103737834:
                if (!lowerCase.equals("md_rt") || z || (length = output.length()) == 0) {
                    return;
                }
                t[] tVarArr = (t[]) output.getSpans(0, length, t.class);
                Intrinsics.h(tVarArr);
                if (tVarArr.length == 0) {
                    iArr = new int[0][];
                } else {
                    int length3 = tVarArr.length;
                    int[][] iArr2 = new int[length3][];
                    for (int i5 = 0; i5 < length3; i5++) {
                        iArr2[i5] = new int[]{output.getSpanStart(tVarArr[i5]), output.getSpanEnd(tVarArr[i5])};
                    }
                    if (length3 > 1) {
                        zhm.p.B(new w(), iArr2);
                    }
                    iArr = iArr2;
                }
                int i6 = 0;
                while (i6 < length) {
                    if (output.charAt(i6) != '\n') {
                        i6++;
                    } else {
                        int i21 = i6;
                        while (i21 < length && output.charAt(i21) == '\n') {
                            i21++;
                        }
                        int i22 = i21 - i6;
                        if (i22 >= 2) {
                            int i32 = i6 + 1;
                            while (i32 < i21) {
                                int i33 = i32 + 1;
                                output.setSpan(new z(), i32, i33, 33);
                                i32 = i33;
                            }
                        }
                        if (i22 == 1 && i21 < length) {
                            int length4 = iArr.length - 1;
                            int i43 = 0;
                            while (true) {
                                if (i43 > length4) {
                                    i = -1;
                                } else {
                                    int i59 = (i43 + length4) >>> 1;
                                    int[] iArr3 = iArr[i59];
                                    int i66 = iArr3[0];
                                    if (i66 < i21) {
                                        i43 = i59 + 1;
                                    } else if (i66 > i21) {
                                        length4 = i59 - 1;
                                    } else {
                                        i = iArr3[1];
                                    }
                                }
                            }
                            if (i >= 0) {
                                int length5 = iArr.length;
                                int i74 = 0;
                                while (true) {
                                    if (i74 < length5) {
                                        if (iArr[i74][1] == i21) {
                                            output.setSpan(new s(i21), i21, i, 51);
                                        } else {
                                            i74++;
                                        }
                                    }
                                }
                            }
                        }
                        i6 = i21;
                    }
                }
                return;
            case 103737919:
                if (lowerCase.equals("md_ul")) {
                    if (z) {
                        arrayDeque.addLast("md_ul");
                        return;
                    } else {
                        if (Intrinsics.f(arrayDeque.e(), "md_ul")) {
                            arrayDeque.removeLast();
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
