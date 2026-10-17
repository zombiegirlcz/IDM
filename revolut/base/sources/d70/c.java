package d70;

import a0.d;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {
    public c() {
        this(16);
    }

    public final void b(byte b4) {
        e(this.f111733b + 1);
        byte[] bArr = this.f111732a;
        int i = this.f111733b;
        bArr[i] = b4;
        this.f111733b = i + 1;
    }

    public final boolean c(int i, a elements) {
        int i2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i < 0 || i > (i2 = this.f111733b)) {
            throw new IndexOutOfBoundsException(d.g(i, this.f111733b, "Index ", " must be in 0.."));
        }
        int i3 = elements.f111733b;
        if (i3 == 0) {
            return false;
        }
        e(i2 + i3);
        byte[] bArr = this.f111732a;
        int i5 = this.f111733b;
        if (i != i5) {
            p.e(elements.f111733b + i, bArr, i, bArr, i5);
        }
        p.e(i, elements.f111732a, 0, bArr, elements.f111733b);
        this.f111733b += elements.f111733b;
        return true;
    }

    public final boolean d(int i, byte[] elements) {
        int i2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i < 0 || i > (i2 = this.f111733b)) {
            throw new IndexOutOfBoundsException(d.g(i, this.f111733b, "Index ", " must be in 0.."));
        }
        if (elements.length == 0) {
            return false;
        }
        e(i2 + elements.length);
        byte[] bArr = this.f111732a;
        int i3 = this.f111733b;
        if (i != i3) {
            p.e(elements.length + i, bArr, i, bArr, i3);
        }
        p.j(elements, bArr, i, 0, 0, 12);
        this.f111733b += elements.length;
        return true;
    }

    public final void e(int i) {
        byte[] bArr = this.f111732a;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(i, (bArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f111732a = bArrCopyOf;
        }
    }

    public c(int i) {
        this.f111732a = i == 0 ? b.f111734a : new byte[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(byte[] elements) {
        this(elements.length);
        Intrinsics.checkNotNullParameter(elements, "other");
        Intrinsics.checkNotNullParameter(elements, "elements");
        d(this.f111733b, elements);
    }
}
