package sw6;

import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerProfileSettings f266117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l71.d f266118c;

    public f(List pluginFee, FreelancerProfileSettings settings, l71.d userCompany) {
        Intrinsics.checkNotNullParameter(pluginFee, "pluginFee");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f266116a = pluginFee;
        this.f266117b = settings;
        this.f266118c = userCompany;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266116a, fVar.f266116a) && Intrinsics.f(this.f266117b, fVar.f266117b) && Intrinsics.f(this.f266118c, fVar.f266118c);
    }

    public final int hashCode() {
        return this.f266118c.hashCode() + ((this.f266117b.hashCode() + (this.f266116a.hashCode() * 31)) * 31);
    }
}
