package lfk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Llfk/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Llfk/c;", "Ljava/util/List;", "f", "()Ljava/util/List;", "members", "Llfk/f;", "c", "d", "invitations", "familyPlanId", "e", "individualPlanId", "Llfk/a$a;", "Llfk/a$a;", "g", "()Llfk/a$a;", "plan", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "legacyFamilyPlan", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("members")
    @NotNull
    private final List<c> members;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("invitations")
    @NotNull
    private final List<f> invitations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("familyPlanId")
    @NotNull
    private final String familyPlanId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("individualPlanId")
    @NotNull
    private final String individualPlanId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("plan")
    private final C1103a plan;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("legacyFamilyPlan")
    private final Boolean legacyFamilyPlan;

    /* JADX INFO: renamed from: lfk.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Llfk/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1103a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        public C1103a(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1103a) && Intrinsics.f(this.id, ((C1103a) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }
    }

    public a(String id10, ArrayList members, ArrayList invitations, String familyPlanId, String individualPlanId, C1103a c1103a, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(invitations, "invitations");
        Intrinsics.checkNotNullParameter(familyPlanId, "familyPlanId");
        Intrinsics.checkNotNullParameter(individualPlanId, "individualPlanId");
        this.id = id10;
        this.members = members;
        this.invitations = invitations;
        this.familyPlanId = familyPlanId;
        this.individualPlanId = individualPlanId;
        this.plan = c1103a;
        this.legacyFamilyPlan = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFamilyPlanId() {
        return this.familyPlanId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIndividualPlanId() {
        return this.individualPlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getInvitations() {
        return this.invitations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getLegacyFamilyPlan() {
        return this.legacyFamilyPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.members, aVar.members) && Intrinsics.f(this.invitations, aVar.invitations) && Intrinsics.f(this.familyPlanId, aVar.familyPlanId) && Intrinsics.f(this.individualPlanId, aVar.individualPlanId) && Intrinsics.f(this.plan, aVar.plan) && Intrinsics.f(this.legacyFamilyPlan, aVar.legacyFamilyPlan);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C1103a getPlan() {
        return this.plan;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.d(p.a.d(this.id.hashCode() * 31, 31, this.members), 31, this.invitations), 31, this.familyPlanId), 31, this.individualPlanId);
        C1103a c1103a = this.plan;
        int iHashCode = (iC + (c1103a == null ? 0 : c1103a.hashCode())) * 31;
        Boolean bool = this.legacyFamilyPlan;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
