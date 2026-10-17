package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lp6l/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "cardId", "b", "tokenRequestor", "c", "tokenUniqueReference", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenRequestor")
    @NotNull
    private final String tokenRequestor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenUniqueReference")
    private final String tokenUniqueReference;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTokenRequestor() {
        return this.tokenRequestor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.cardId, jVar.cardId) && Intrinsics.f(this.tokenRequestor, jVar.tokenRequestor) && Intrinsics.f(this.tokenUniqueReference, jVar.tokenUniqueReference);
    }

    public final int hashCode() {
        int iC = p.a.c(this.cardId.hashCode() * 31, 31, this.tokenRequestor);
        String str = this.tokenUniqueReference;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
