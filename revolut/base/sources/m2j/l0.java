package m2j;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeenProfile f202058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pcd.s f202059b;

    public l0(TeenProfile teenProfile, pcd.s vault) {
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f202058a = teenProfile;
        this.f202059b = vault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f202058a, l0Var.f202058a) && Intrinsics.f(this.f202059b, l0Var.f202059b);
    }

    public final int hashCode() {
        return this.f202059b.hashCode() + (this.f202058a.hashCode() * 31);
    }
}
