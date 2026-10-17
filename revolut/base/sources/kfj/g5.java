package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\f\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkfj/g5;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "e", "state", "Lkfj/h5;", "c", "Lkfj/h5;", "()Lkfj/h5;", "mobilePlan", "Lkfj/i5;", "d", "Lkfj/i5;", "()Lkfj/i5;", "simProfile", "Lkfj/v4;", "Lkfj/v4;", "f", "()Lkfj/v4;", "usage", "", "Lkfj/r4;", "Ljava/util/List;", "()Ljava/util/List;", "roamingAllowances", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlan")
    @NotNull
    private final h5 mobilePlan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("simProfile")
    @NotNull
    private final i5 simProfile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("usage")
    private final v4 usage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("roamingAllowances")
    @NotNull
    private final List<r4> roamingAllowances;

    public g5(String id10, String state, h5 mobilePlan, i5 simProfile, v4 v4Var, ArrayList roamingAllowances) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(roamingAllowances, "roamingAllowances");
        this.id = id10;
        this.state = state;
        this.mobilePlan = mobilePlan;
        this.simProfile = simProfile;
        this.usage = v4Var;
        this.roamingAllowances = roamingAllowances;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h5 getMobilePlan() {
        return this.mobilePlan;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRoamingAllowances() {
        return this.roamingAllowances;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i5 getSimProfile() {
        return this.simProfile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.id, g5Var.id) && Intrinsics.f(this.state, g5Var.state) && Intrinsics.f(this.mobilePlan, g5Var.mobilePlan) && Intrinsics.f(this.simProfile, g5Var.simProfile) && Intrinsics.f(this.usage, g5Var.usage) && Intrinsics.f(this.roamingAllowances, g5Var.roamingAllowances);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v4 getUsage() {
        return this.usage;
    }

    public final int hashCode() {
        int iHashCode = (this.simProfile.hashCode() + ((this.mobilePlan.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.state)) * 31)) * 31;
        v4 v4Var = this.usage;
        return this.roamingAllowances.hashCode() + ((iHashCode + (v4Var == null ? 0 : v4Var.hashCode())) * 31);
    }
}
