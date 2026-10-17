package g4c;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f140490b;

    public /* synthetic */ t(Data data, int i) {
        this.f140489a = i;
        this.f140490b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f140489a) {
            case 0:
                return h.a((h) obj2, this.f140490b, null, 2);
            case 1:
                return g57.h.a((g57.h) obj2, this.f140490b, null, 2);
            case 2:
                g5e.d dVar = (g5e.d) obj2;
                Data data2 = dVar.f140771a;
                dVar.getClass();
                return new g5e.d(data2, this.f140490b);
            case 3:
                g5e.d dVar2 = (g5e.d) obj2;
                Data data3 = dVar2.f140772b;
                dVar2.getClass();
                return new g5e.d(this.f140490b, data3);
            case 4:
                return g62.d.a((g62.d) obj2, this.f140490b, false, 2);
            case 5:
                return g6f.b.a((g6f.b) obj2, null, null, this.f140490b, 3);
            case 6:
                Data data4 = this.f140490b;
                g7b.n nVar = (g7b.n) obj2;
                try {
                    Object content = data4.getContent();
                    data = new Data(content != null ? ((CobrandedCardsPlanHubInfo) content).e.f82409a : null, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                Data data5 = data;
                CobrandedCardsPlanHubInfo cobrandedCardsPlanHubInfo = (CobrandedCardsPlanHubInfo) data4.getContent();
                return g7b.n.a(nVar, data5, cobrandedCardsPlanHubInfo != null ? cobrandedCardsPlanHubInfo.d : null, null, false, 12);
            case 7:
                gaf.d dVar3 = (gaf.d) obj2;
                TransferBroker transferBroker = dVar3.f142157a;
                TransferUserAccountInformation.TaaTransferUserAccountInformation transferInAccountInformation = dVar3.f142158b;
                TradingAccount.TaxAdvantage tradingAccount = dVar3.d;
                u8f.b transferType = dVar3.e;
                Map transferYears = dVar3.f;
                boolean z = dVar3.f142160g;
                Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
                Intrinsics.checkNotNullParameter(transferInAccountInformation, "transferInAccountInformation");
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                Intrinsics.checkNotNullParameter(transferType, "transferType");
                Intrinsics.checkNotNullParameter(transferYears, "transferYears");
                return new gaf.d(transferBroker, transferInAccountInformation, this.f140490b, tradingAccount, transferType, transferYears, z);
            case 8:
                Data data6 = this.f140490b;
                Intrinsics.h(data6);
                return gc6.h.a((gc6.h) obj2, null, null, null, null, null, data6, 31);
            case 9:
                Data data7 = this.f140490b;
                Intrinsics.h(data7);
                return gc6.h.a((gc6.h) obj2, null, null, null, null, data7, null, 47);
            case 10:
                Data data8 = this.f140490b;
                Intrinsics.h(data8);
                return gc6.h.a((gc6.h) obj2, data8, null, null, null, null, null, 62);
            case 11:
                Data data9 = this.f140490b;
                Intrinsics.h(data9);
                return gc6.h.a((gc6.h) obj2, null, null, data9, null, null, null, 59);
            case 12:
                Data data10 = this.f140490b;
                Intrinsics.h(data10);
                return gc6.h.a((gc6.h) obj2, null, null, null, data10, null, null, 55);
            case 13:
                Data data11 = this.f140490b;
                Intrinsics.h(data11);
                return gc6.h.a((gc6.h) obj2, null, data11, null, null, null, null, 61);
            case 14:
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, null, null, null, null, false, this.f140490b, 2047);
            case 15:
                Data data12 = this.f140490b;
                Intrinsics.h(data12);
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, null, null, data12, null, false, null, 3967);
            case 16:
                Data data13 = this.f140490b;
                Intrinsics.h(data13);
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, null, null, null, data13, false, null, 3839);
            case 17:
                Data data14 = this.f140490b;
                Intrinsics.h(data14);
                return gcg.j.a((gcg.j) obj2, data14, null, null, null, null, null, null, null, null, false, null, 4094);
            case 18:
                return gcg.j.a((gcg.j) obj2, null, null, this.f140490b, null, null, null, null, null, null, false, null, 4091);
            case 19:
                Data data15 = this.f140490b;
                Intrinsics.h(data15);
                return gcg.j.a((gcg.j) obj2, null, null, null, data15, null, null, null, null, null, false, null, 4087);
            case 20:
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, this.f140490b, null, null, null, false, null, 4063);
            case 21:
                return gcg.j.a((gcg.j) obj2, null, null, null, null, this.f140490b, null, null, null, null, false, null, 4079);
            case 22:
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, null, this.f140490b, null, null, false, null, 4031);
            case 23:
                return gck.l.a((gck.l) obj2, this.f140490b, null, 6);
            case 24:
                return geg.d.a((geg.d) obj2, this.f140490b);
            case 25:
                return gf5.a.a((gf5.a) obj2, this.f140490b, null, null, 6);
            case 26:
                Data data16 = this.f140490b;
                Intrinsics.h(data16);
                return gh1.k.a((gh1.k) obj2, data16, null, 14);
            case 27:
                Data data17 = this.f140490b;
                Intrinsics.h(data17);
                return gh1.k.a((gh1.k) obj2, null, data17, 11);
            case 28:
                ((gh3.e) obj2).getClass();
                Data contentData = this.f140490b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new gh3.e(contentData);
            default:
                return ghg.g.a((ghg.g) obj2, null, this.f140490b, null, null, null, false, false, ISO781611.SMT_TAG);
        }
    }
}
