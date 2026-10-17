package ix7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lix7/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "campaign", "Lix7/d;", "b", "Lix7/d;", "()Lix7/d;", "label", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaign")
    @NotNull
    private final String campaign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final d label;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.campaign, a0Var.campaign) && Intrinsics.f(this.label, a0Var.label);
    }

    public final int hashCode() {
        int iHashCode = this.campaign.hashCode() * 31;
        d dVar = this.label;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
