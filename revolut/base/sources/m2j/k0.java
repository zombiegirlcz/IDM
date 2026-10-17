package m2j;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeenProfile f202053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f202054b;

    public k0(TeenProfile teenProfile, io3.d pocket) {
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f202053a = teenProfile;
        this.f202054b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f202053a, k0Var.f202053a) && Intrinsics.f(this.f202054b, k0Var.f202054b);
    }

    public final int hashCode() {
        return this.f202054b.hashCode() + (this.f202053a.hashCode() * 31);
    }
}
