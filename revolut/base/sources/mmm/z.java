package mmm;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class z extends u {

    @NotNull
    public static final y Companion = new y();
    public final MessageDigest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g sink) throws NoSuchAlgorithmException {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(...)");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.d = digest;
    }

    public final m d() {
        MessageDigest messageDigest = this.d;
        if (messageDigest == null) {
            Intrinsics.h(null);
            throw null;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.h(bArrDigest);
        return new m(bArrDigest);
    }

    @Override // mmm.u, mmm.q0
    public final void write(h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f207266b, 0L, j2);
        n0 n0Var = source.f207265a;
        Intrinsics.h(n0Var);
        long j3 = 0;
        while (j3 < j2) {
            int iMin = (int) Math.min(j2 - j3, n0Var.f207293c - n0Var.f207292b);
            MessageDigest messageDigest = this.d;
            if (messageDigest == null) {
                Intrinsics.h(null);
                throw null;
            }
            messageDigest.update(n0Var.f207291a, n0Var.f207292b, iMin);
            j3 += (long) iMin;
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
        }
        super.write(source, j2);
    }
}
