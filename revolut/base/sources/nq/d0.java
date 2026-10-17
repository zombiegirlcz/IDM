package nq;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationDocument f218287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(BiometricVerificationDocument document, List mediaKeys) {
        super(mediaKeys);
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f218286b = mediaKeys;
        this.f218287c = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f218286b, d0Var.f218286b) && Intrinsics.f(this.f218287c, d0Var.f218287c);
    }

    @Override // nq.i0
    public final List f() {
        return this.f218286b;
    }

    public final int hashCode() {
        return this.f218287c.hashCode() + (this.f218286b.hashCode() * 31);
    }
}
