package ara;

import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerInfoState f8601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f8602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f8603c;
    public final do3.n d;

    public i(CardOwnerInfoState cardOwnerInfo, m eligibilityState, o oVar, do3.n nVar) {
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        Intrinsics.checkNotNullParameter(eligibilityState, "eligibilityState");
        this.f8601a = cardOwnerInfo;
        this.f8602b = eligibilityState;
        this.f8603c = oVar;
        this.d = nVar;
    }

    public static i a(i iVar, CardOwnerInfoState cardOwnerInfo, m eligibilityState, o oVar, do3.n nVar, int i) {
        if ((i & 1) != 0) {
            cardOwnerInfo = iVar.f8601a;
        }
        if ((i & 2) != 0) {
            eligibilityState = iVar.f8602b;
        }
        if ((i & 4) != 0) {
            oVar = iVar.f8603c;
        }
        if ((i & 8) != 0) {
            nVar = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        Intrinsics.checkNotNullParameter(eligibilityState, "eligibilityState");
        return new i(cardOwnerInfo, eligibilityState, oVar, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f8601a, iVar.f8601a) && Intrinsics.f(this.f8602b, iVar.f8602b) && Intrinsics.f(this.f8603c, iVar.f8603c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f8602b.hashCode() + (this.f8601a.hashCode() * 31)) * 31;
        o oVar = this.f8603c;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        do3.n nVar = this.d;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
