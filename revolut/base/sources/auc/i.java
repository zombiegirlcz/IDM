package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lauc/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "addNewCardsToC2P", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("addNewCardsToC2P")
    private final Boolean addNewCardsToC2P;

    public i(Boolean bool) {
        this.addNewCardsToC2P = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAddNewCardsToC2P() {
        return this.addNewCardsToC2P;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.addNewCardsToC2P, ((i) obj2).addNewCardsToC2P);
    }

    public final int hashCode() {
        Boolean bool = this.addNewCardsToC2P;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
