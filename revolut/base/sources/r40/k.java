package r40;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30.n f251339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f251340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f251341c;
    public final i d;
    public final j e;
    public final i f;

    public k(w30.n chatAndCallDetails, UUID uuid, i primaryAction, i secondaryAction, j dismissAction, i iVar) {
        Intrinsics.checkNotNullParameter(chatAndCallDetails, "chatAndCallDetails");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        this.f251339a = chatAndCallDetails;
        this.f251340b = uuid;
        this.f251341c = primaryAction;
        this.d = secondaryAction;
        this.e = dismissAction;
        this.f = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f251339a, kVar.f251339a) && Intrinsics.f(this.f251340b, kVar.f251340b) && this.f251341c == kVar.f251341c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f251339a.hashCode() * 31;
        UUID uuid = this.f251340b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.f251341c.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31)) * 31)) * 31)) * 31;
        i iVar = this.f;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public /* synthetic */ k(w30.n nVar, UUID uuid, i iVar, i iVar2, j jVar, i iVar3, int i) {
        this(nVar, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? i.NONE : iVar, (i & 8) != 0 ? i.NONE : iVar2, jVar, (i & 32) != 0 ? null : iVar3);
    }
}
