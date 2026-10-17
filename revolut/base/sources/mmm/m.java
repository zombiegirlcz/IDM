package mmm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import net.sf.scuba.smartcards.ISO7816;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class m implements Serializable, Comparable {

    @NotNull
    public static final l Companion = new l();
    public static final m d = new m(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f207285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f207286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f207287c;

    public m(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f207285a = data;
    }

    public static int h(m mVar, m other) {
        mVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return mVar.f(0, other.i());
    }

    public static int m(m mVar, m other) {
        mVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return mVar.l(other.i());
    }

    public static /* synthetic */ m s(m mVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return mVar.r(i, i2);
    }

    public String a() {
        byte[] map = a.f207244a;
        byte[] bArr = this.f207285a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b4 = bArr[i];
            int i3 = i + 2;
            byte b5 = bArr[i + 1];
            i += 3;
            byte b7 = bArr[i3];
            bArr2[i2] = map[(b4 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b4 & 3) << 4) | ((b5 & UnsignedBytes.MAX_VALUE) >> 4)];
            int i5 = i2 + 3;
            bArr2[i2 + 2] = map[((b5 & 15) << 2) | ((b7 & UnsignedBytes.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr2[i5] = map[b7 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i];
            bArr2[i2] = map[(b13 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[(b13 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i6 = i + 1;
            byte b15 = bArr[i];
            byte b17 = bArr[i6];
            bArr2[i2] = map[(b15 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b15 & 3) << 4) | ((b17 & UnsignedBytes.MAX_VALUE) >> 4)];
            bArr2[i2 + 2] = map[(b17 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i = 0; i < iMin; i++) {
            int iK = k(i) & UnsignedBytes.MAX_VALUE;
            int iK2 = other.k(i) & UnsignedBytes.MAX_VALUE;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public m c(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f207285a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.h(bArrDigest);
        return new m(bArrDigest);
    }

    public int d() {
        return this.f207285a.length;
    }

    public String e() {
        byte[] bArr = this.f207285a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b4 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = nmm.b.f217394a;
            cArr[i] = cArr2[(b4 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b4 & 15];
        }
        return kotlin.text.a0.r(cArr);
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof m) {
            m mVar = (m) obj2;
            int iD = mVar.d();
            byte[] bArr = this.f207285a;
            if (iD == bArr.length && mVar.n(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] bArr = this.f207285a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(iMax, bArr, 0, other, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i = this.f207286b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f207285a);
        this.f207286b = iHashCode;
        return iHashCode;
    }

    public byte[] i() {
        return this.f207285a;
    }

    public byte k(int i) {
        return this.f207285a[i];
    }

    public int l(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iD = d();
        byte[] bArr = this.f207285a;
        for (int iMin = Math.min(iD, bArr.length - other.length); -1 < iMin; iMin--) {
            if (b.a(iMin, bArr, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean n(int i, int i2, int i3, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f207285a;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && b.a(i, bArr, i2, other, i3);
    }

    public boolean o(int i, m other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.n(0, i, i2, this.f207285a);
    }

    public final boolean p(m prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return o(0, prefix, prefix.d());
    }

    public String q(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f207285a, charset);
    }

    public m r(int i, int i2) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f207285a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(j6.a.t(new StringBuilder("endIndex > length("), bArr.length, CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new m(zhm.p.m(bArr, i, i2));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public m t() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f207285a;
            if (i >= bArr.length) {
                return this;
            }
            byte b4 = bArr[i];
            if (b4 >= 65 && b4 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b4 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b5 = bArrCopyOf[i2];
                    if (b5 >= 65 && b5 <= 90) {
                        bArrCopyOf[i2] = (byte) (b5 + 32);
                    }
                }
                return new m(bArrCopyOf);
            }
            i++;
        }
    }

    public String toString() {
        byte b4;
        int i;
        byte[] bArr = this.f207285a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b5 = bArr[i2];
            if (b5 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (127 <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i3 += b5 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i5 = i6;
                    if (i2 < length && (b4 = bArr[i2]) >= 0) {
                        i2++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (127 <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        i3 += b4 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
                Unit unit = Unit.f186387a;
            } else if ((b5 >> 5) == -2) {
                int i21 = i2 + 1;
                if (length > i21) {
                    byte b7 = bArr[i21];
                    if ((b7 & ISO7816.INS_GET_RESPONSE) == 128) {
                        int i22 = (b7 ^ 3968) ^ (b5 << 6);
                        if (i22 >= 128) {
                            i = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                                break;
                            }
                            i3 += i22 < 65536 ? 1 : 2;
                            Unit unit2 = Unit.f186387a;
                            i2 += 2;
                            i5 = i;
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b5 >> 4) == -2) {
                int i32 = i2 + 2;
                if (length > i32) {
                    byte b13 = bArr[i2 + 1];
                    if ((b13 & ISO7816.INS_GET_RESPONSE) == 128) {
                        byte b15 = bArr[i32];
                        if ((b15 & ISO7816.INS_GET_RESPONSE) == 128) {
                            int i33 = ((b15 ^ (-123008)) ^ (b13 << 6)) ^ (b5 << 12);
                            if (i33 < 2048) {
                                if (i5 != 64) {
                                    break;
                                }
                            } else if (55296 > i33 || i33 >= 57344) {
                                i = i5 + 1;
                                if (i5 == 64) {
                                    break;
                                }
                                if ((i33 != 10 && i33 != 13 && ((i33 >= 0 && i33 < 32) || (127 <= i33 && i33 < 160))) || i33 == 65533) {
                                    break;
                                }
                                i3 += i33 < 65536 ? 1 : 2;
                                Unit unit3 = Unit.f186387a;
                                i2 += 3;
                                i5 = i;
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b5 >> 3) == -2) {
                int i43 = i2 + 3;
                if (length > i43) {
                    byte b17 = bArr[i2 + 1];
                    if ((b17 & ISO7816.INS_GET_RESPONSE) == 128) {
                        byte b40 = bArr[i2 + 2];
                        if ((b40 & ISO7816.INS_GET_RESPONSE) == 128) {
                            byte b61 = bArr[i43];
                            if ((b61 & ISO7816.INS_GET_RESPONSE) == 128) {
                                int i59 = (((b61 ^ 3678080) ^ (b40 << 6)) ^ (b17 << 12)) ^ (b5 << 18);
                                if (i59 > 1114111) {
                                    if (i5 != 64) {
                                        break;
                                    }
                                } else if (55296 > i59 || i59 >= 57344) {
                                    if (i59 >= 65536) {
                                        i = i5 + 1;
                                        if (i5 == 64) {
                                            break;
                                        }
                                        if ((i59 != 10 && i59 != 13 && ((i59 >= 0 && i59 < 32) || (127 <= i59 && i59 < 160))) || i59 == 65533) {
                                            break;
                                        }
                                        i3 += i59 < 65536 ? 1 : 2;
                                        Unit unit4 = Unit.f186387a;
                                        i2 += 4;
                                        i5 = i;
                                    } else if (i5 != 64) {
                                        break;
                                    }
                                } else if (i5 != 64) {
                                    break;
                                }
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if (i5 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strV = v();
            String strSubstring = strV.substring(0, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strD = kotlin.text.a0.D(kotlin.text.a0.D(kotlin.text.a0.D(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strV.length()) {
                return p.a.l(']', "[text=", strD);
            }
            return "[size=" + bArr.length + " text=" + strD + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb6 = new StringBuilder("[size=");
        sb6.append(bArr.length);
        sb6.append(" hex=");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(j6.a.t(new StringBuilder("endIndex > length("), bArr.length, CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        sb6.append((64 == bArr.length ? this : new m(zhm.p.m(bArr, 0, 64))).e());
        sb6.append("…]");
        return sb6.toString();
    }

    public byte[] u() {
        byte[] bArr = this.f207285a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String v() {
        String str = this.f207287c;
        if (str != null) {
            return str;
        }
        byte[] bArrI = i();
        Intrinsics.checkNotNullParameter(bArrI, "<this>");
        String str2 = new String(bArrI, Charsets.UTF_8);
        this.f207287c = str2;
        return str2;
    }

    public void w(h buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(this.f207285a, 0, i);
    }
}
