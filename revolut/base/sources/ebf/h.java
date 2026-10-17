package ebf;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f124322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f124323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f124324c;
    public final TradingAccount d;
    public final Data e;
    public final Data f;

    public h(TransferBroker destinationBroker, TransferUserAccountInformation destinationAccountInformation, ArrayList selectedAssets, TradingAccount sourceAccount, Data data, Data data2) {
        Intrinsics.checkNotNullParameter(destinationBroker, "destinationBroker");
        Intrinsics.checkNotNullParameter(destinationAccountInformation, "destinationAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        this.f124322a = destinationBroker;
        this.f124323b = destinationAccountInformation;
        this.f124324c = selectedAssets;
        this.d = sourceAccount;
        this.e = data;
        this.f = data2;
    }

    public static h a(h hVar, Data data, Data data2, int i) {
        TransferBroker destinationBroker = hVar.f124322a;
        TransferUserAccountInformation destinationAccountInformation = hVar.f124323b;
        ArrayList selectedAssets = hVar.f124324c;
        TradingAccount sourceAccount = hVar.d;
        if ((i & 16) != 0) {
            data = hVar.e;
        }
        Data data3 = data;
        if ((i & 32) != 0) {
            data2 = hVar.f;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(destinationBroker, "destinationBroker");
        Intrinsics.checkNotNullParameter(destinationAccountInformation, "destinationAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        return new h(destinationBroker, destinationAccountInformation, selectedAssets, sourceAccount, data3, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f124322a, hVar.f124322a) && Intrinsics.f(this.f124323b, hVar.f124323b) && this.f124324c.equals(hVar.f124324c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iB = prk.o.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f124324c, (this.f124323b.hashCode() + (this.f124322a.hashCode() * 31)) * 31, 31), 31);
        Data data = this.e;
        int iHashCode = (iB + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }
}
