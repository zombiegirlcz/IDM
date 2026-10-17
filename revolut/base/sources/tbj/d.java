package tbj;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Ltbj/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "confirmations", "b", "requiredConfirmations", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmations")
    private final int confirmations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiredConfirmations")
    private final int requiredConfirmations;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConfirmations() {
        return this.confirmations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRequiredConfirmations() {
        return this.requiredConfirmations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.confirmations == dVar.confirmations && this.requiredConfirmations == dVar.requiredConfirmations;
    }

    public final int hashCode() {
        return Integer.hashCode(this.requiredConfirmations) + (Integer.hashCode(this.confirmations) * 31);
    }
}
