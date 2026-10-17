package qsa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f248769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PushToCardTransferData f248770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f248771c;
    public final qv0.i d;
    public final List e;

    public i(CardOwner recipient, PushToCardTransferData transferData, j jVar, qv0.i iVar, List transferSectionData) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        this.f248769a = recipient;
        this.f248770b = transferData;
        this.f248771c = jVar;
        this.d = iVar;
        this.e = transferSectionData;
    }

    public static i a(i iVar, PushToCardTransferData pushToCardTransferData, j jVar, qv0.i iVar2, List list, int i) {
        PushToCardTransferData transferData = pushToCardTransferData;
        CardOwner recipient = iVar.f248769a;
        if ((i & 2) != 0) {
            transferData = iVar.f248770b;
        }
        if ((i & 4) != 0) {
            jVar = iVar.f248771c;
        }
        iVar.getClass();
        if ((i & 16) != 0) {
            iVar2 = iVar.d;
        }
        if ((i & 32) != 0) {
            list = iVar.e;
        }
        List transferSectionData = list;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        qv0.i iVar3 = iVar2;
        return new i(recipient, transferData, jVar, iVar3, transferSectionData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248769a, iVar.f248769a) && Intrinsics.f(this.f248770b, iVar.f248770b) && Intrinsics.f(this.f248771c, iVar.f248771c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f248770b.hashCode() + (this.f248769a.hashCode() * 31)) * 31;
        j jVar = this.f248771c;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 961;
        qv0.i iVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
