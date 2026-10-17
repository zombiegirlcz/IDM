package pi3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f236413b;

    public n(String cardId, i iVar) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f236412a = cardId;
        this.f236413b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f236412a, nVar.f236412a) && Intrinsics.f(this.f236413b, nVar.f236413b);
    }

    public final int hashCode() {
        int iHashCode = this.f236412a.hashCode() * 31;
        i iVar = this.f236413b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
