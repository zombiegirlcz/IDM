package klm;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.s;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Comparable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f185654c = new b(new byte[0]);
    public static final char[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f185655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185656b;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        d = charArray;
    }

    public b(byte[] bArr) {
        this.f185655a = bArr;
    }

    public final byte a(int i) {
        byte[] bArr = this.f185655a;
        if (i < 0 || i >= bArr.length) {
            throw new IndexOutOfBoundsException(j6.a.t(d.w(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, CoreConstants.RIGHT_PARENTHESIS_CHAR));
        }
        return bArr[i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        b other = (b) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = other.f185655a;
        byte[] bArr2 = this.f185655a;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            byte b4 = bArr2[i];
            s.Companion companion = s.INSTANCE;
            int iK = Intrinsics.k(b4 & UnsignedBytes.MAX_VALUE, bArr[i] & UnsignedBytes.MAX_VALUE);
            if (iK != 0) {
                return iK;
            }
        }
        return Intrinsics.k(bArr2.length, other.f185655a.length);
    }

    public final boolean equals(Object obj2) {
        int i;
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || b.class != obj2.getClass()) {
            return false;
        }
        b bVar = (b) obj2;
        byte[] bArr = bVar.f185655a;
        int length = bArr.length;
        byte[] bArr2 = this.f185655a;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = bVar.f185656b;
        if (i2 == 0 || (i = this.f185656b) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f185656b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f185655a);
        this.f185656b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        byte[] bArr = this.f185655a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb6 = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb6.append("ByteString(size=");
        sb6.append(strValueOf);
        sb6.append(" hex=");
        for (byte b4 : bArr) {
            char[] cArr = d;
            sb6.append(cArr[(b4 >>> 4) & 15]);
            sb6.append(cArr[b4 & 15]);
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ b(byte[] bArr, int i) {
        this(bArr, 0, bArr.length);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(byte[] data, int i, int i2) {
        this(p.m(data, i, i2));
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
