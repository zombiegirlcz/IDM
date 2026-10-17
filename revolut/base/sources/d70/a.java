package d70;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f111732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111733b;

    public final byte a(int i) {
        if (i < 0 || i >= this.f111733b) {
            throw new IndexOutOfBoundsException(d.g(i, this.f111733b, "Index ", " must be in 0.."));
        }
        return this.f111732a[i];
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (aVar.f111733b == this.f111733b) {
                byte[] bArr = this.f111732a;
                byte[] bArr2 = aVar.f111732a;
                for (int i = 0; i < this.f111733b; i++) {
                    if (bArr[i] != bArr2[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.f111732a;
        int i = this.f111733b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        return i2;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb6 = new StringBuilder();
        sb6.append((CharSequence) "[");
        byte[] bArr = this.f111732a;
        int i = this.f111733b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb6.append((CharSequence) "]");
                break;
            }
            byte b4 = bArr[i2];
            if (i2 == -1) {
                sb6.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb6.append((CharSequence) ", ");
            }
            sb6.append(Byte.valueOf(b4));
            i2++;
        }
        return sb6.toString();
    }
}
