package vr;

import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationStep f291441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f291442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationFeatures f291443c;
    public final String d;
    public final Integer e;

    public f(BiometricVerificationStep step, List resources, BiometricVerificationFeatures features, String str, Integer num) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f291441a = step;
        this.f291442b = resources;
        this.f291443c = features;
        this.d = str;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f291441a, fVar.f291441a) && Intrinsics.f(this.f291442b, fVar.f291442b) && Intrinsics.f(this.f291443c, fVar.f291443c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f291443c.hashCode() + p.a.d(this.f291441a.hashCode() * 31, 31, this.f291442b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
