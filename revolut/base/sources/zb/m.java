package zb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.c f320786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f320787b;

    public m(wb.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f320786a = cVar;
        this.f320787b = bArr;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        if (this.f320786a.equals(mVar.f320786a)) {
            return Arrays.equals(this.f320787b, mVar.f320787b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f320786a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f320787b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f320786a + ", bytes=[...]}";
    }
}
