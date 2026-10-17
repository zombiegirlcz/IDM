package bmm;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f16949b = new int[10];

    public final int a() {
        return (this.f16948a & 16) != 0 ? this.f16949b[4] : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public final void b(m0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f16948a) != 0) {
                c(i, other.f16949b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f16949b;
            if (i >= iArr.length) {
                return;
            }
            this.f16948a = (1 << i) | this.f16948a;
            iArr[i] = i2;
        }
    }
}
