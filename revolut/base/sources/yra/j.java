package yra;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f316175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PushToCardTransferData f316176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f316177c;
    public final int d;
    public final o e;

    public j(CardOwner recipient, PushToCardTransferData pushToCardTransferData, k extraData, int i, o referenceExtraData) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(referenceExtraData, "referenceExtraData");
        this.f316175a = recipient;
        this.f316176b = pushToCardTransferData;
        this.f316177c = extraData;
        this.d = i;
        this.e = referenceExtraData;
    }

    public static j a(j jVar, PushToCardTransferData pushToCardTransferData, k extraData, int i, o oVar, int i2) {
        PushToCardTransferData pushToCardTransferData2 = pushToCardTransferData;
        CardOwner recipient = jVar.f316175a;
        if ((i2 & 2) != 0) {
            pushToCardTransferData2 = jVar.f316176b;
        }
        if ((i2 & 4) != 0) {
            extraData = jVar.f316177c;
        }
        if ((i2 & 8) != 0) {
            i = jVar.d;
        }
        if ((i2 & 16) != 0) {
            oVar = jVar.e;
        }
        o referenceExtraData = oVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(referenceExtraData, "referenceExtraData");
        int i3 = i;
        return new j(recipient, pushToCardTransferData2, extraData, i3, referenceExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f316175a, jVar.f316175a) && Intrinsics.f(this.f316176b, jVar.f316176b) && Intrinsics.f(this.f316177c, jVar.f316177c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f316175a.hashCode() * 31;
        PushToCardTransferData pushToCardTransferData = this.f316176b;
        return this.e.hashCode() + j6.a.b(this.d, (this.f316177c.hashCode() + ((iHashCode + (pushToCardTransferData == null ? 0 : pushToCardTransferData.hashCode())) * 31)) * 31, 31);
    }
}
