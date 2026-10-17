package zmm;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import java.util.Objects;
import ymm.f;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323630a;

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str == null) {
                    throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
                }
                if (!isFullDetail(bool)) {
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                super.append(stringBuffer, str, objArr, bool);
                return;
            default:
                super.append(stringBuffer, str, objArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void appendDetail(StringBuffer stringBuffer, String str, char c2) {
        switch (this.f323630a) {
            case 1:
                String strValueOf = String.valueOf(c2);
                stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                stringBuffer.append(f.a(strValueOf));
                stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                break;
            default:
                super.appendDetail(stringBuffer, str, c2);
                break;
        }
    }

    @Override // zmm.d
    public void appendFieldStart(StringBuffer stringBuffer, String str) {
        switch (this.f323630a) {
            case 1:
                if (str == null) {
                    throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
                }
                super.appendFieldStart(stringBuffer, "\"" + f.a(str) + "\"");
                return;
            default:
                super.appendFieldStart(stringBuffer, str);
                return;
        }
    }

    @Override // zmm.d
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj2) {
        switch (this.f323630a) {
            case 1:
                if (obj2 == null) {
                    appendNullText(stringBuffer, str);
                } else if (!(obj2 instanceof String) && !(obj2 instanceof Character)) {
                    if (!(obj2 instanceof Number) && !(obj2 instanceof Boolean)) {
                        String string = obj2.toString();
                        if ((string.startsWith(getContentStart()) && string.endsWith(getContentEnd())) || (string.startsWith(getArrayStart()) && string.endsWith(getArrayEnd()))) {
                            stringBuffer.append(obj2);
                        } else {
                            appendDetail(stringBuffer, str, string);
                        }
                    } else {
                        stringBuffer.append(obj2);
                    }
                } else {
                    String string2 = obj2.toString();
                    stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    stringBuffer.append(f.a(string2));
                    stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                break;
            default:
                super.appendDetail(stringBuffer, str, obj2);
                break;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, jArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, jArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, iArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, iArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, sArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, sArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void appendDetail(StringBuffer stringBuffer, String str, Map map) {
        switch (this.f323630a) {
            case 1:
                if (map != null && !map.isEmpty()) {
                    stringBuffer.append(getContentStart());
                    boolean z = true;
                    for (Map.Entry entry : map.entrySet()) {
                        String string = Objects.toString(entry.getKey(), null);
                        if (string != null) {
                            if (z) {
                                z = false;
                            } else {
                                appendFieldEnd(stringBuffer, string);
                            }
                            appendFieldStart(stringBuffer, string);
                            Object value = entry.getValue();
                            if (value == null) {
                                appendNullText(stringBuffer, string);
                            } else {
                                appendInternal(stringBuffer, string, value, true);
                            }
                        }
                    }
                    stringBuffer.append(getContentEnd());
                } else {
                    stringBuffer.append(map);
                }
                break;
            default:
                super.appendDetail(stringBuffer, str, (Map<?, ?>) map);
                break;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, bArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, bArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, cArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, cArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, dArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, dArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, fArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, fArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, zArr, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, zArr, bool);
                return;
        }
    }

    @Override // zmm.d
    public void append(StringBuffer stringBuffer, String str, Object obj2, Boolean bool) {
        switch (this.f323630a) {
            case 1:
                if (str != null) {
                    if (isFullDetail(bool)) {
                        super.append(stringBuffer, str, obj2, bool);
                        return;
                    }
                    throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
                }
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            default:
                super.append(stringBuffer, str, obj2, bool);
                return;
        }
    }
}
