package ix7;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lix7/y;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "petLoss", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("petLoss")
    private final boolean petLoss;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getPetLoss() {
        return this.petLoss;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.petLoss == ((y) obj2).petLoss;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.petLoss);
    }
}
