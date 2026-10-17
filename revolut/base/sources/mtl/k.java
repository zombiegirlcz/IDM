package mtl;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f208923b;

    public /* synthetic */ k(Data data, int i) {
        this.f208922a = i;
        this.f208923b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f208922a) {
            case 0:
                return a.a((a) obj2, null, null, this.f208923b, null, null, null, 59);
            case 1:
                return a.a((a) obj2, null, null, null, null, this.f208923b, null, 47);
            case 2:
                return a.a((a) obj2, this.f208923b, null, null, null, null, null, 62);
            case 3:
                return a.a((a) obj2, null, null, null, this.f208923b, null, null, 55);
            case 4:
                return a.a((a) obj2, null, null, null, this.f208923b, null, null, 55);
            case 5:
                ((mu4.e) obj2).getClass();
                Data content = this.f208923b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new mu4.e(content);
            case 6:
                return muk.f.a((muk.f) obj2, this.f208923b, null, 2);
            case 7:
                return muk.f.a((muk.f) obj2, null, this.f208923b, 1);
            case 8:
                return mul.h.a((mul.h) obj2, this.f208923b, false, 5);
            case 9:
                return mv7.e.a((mv7.e) obj2, this.f208923b, null, 2);
            case 10:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, this.f208923b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367);
            case 11:
                mwk.i iVar = (mwk.i) obj2;
                List list = (List) this.f208923b.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return mwk.i.f(iVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, 33521663);
            case 12:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f208923b, null, null, null, null, null, null, null, null, null, null, 33538047);
            case 13:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, this.f208923b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919);
            case 14:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, this.f208923b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553407);
            case 15:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f208923b, null, null, 29360127);
            case 16:
                Data loyaltyEngagementLearnItemsData = this.f208923b;
                Intrinsics.h(loyaltyEngagementLearnItemsData);
                ((mzb.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(loyaltyEngagementLearnItemsData, "loyaltyEngagementLearnItemsData");
                return new mzb.h(loyaltyEngagementLearnItemsData);
            case 17:
                return n1g.e.a((n1g.e) obj2, this.f208923b, null, null, false, 30);
            case 18:
                return n1j.m.e((n1j.m) obj2, null, null, null, null, null, null, null, this.f208923b, null, 383);
            case 19:
                SpareChangeRefundQuote spareChangeRefundQuote = ((n2c.b) obj2).f211515b;
                Data spareChangeRefund = this.f208923b;
                Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
                return new n2c.b(spareChangeRefund, spareChangeRefundQuote);
            case 20:
                Data spareChangeRefund2 = this.f208923b;
                Intrinsics.h(spareChangeRefund2);
                SpareChangeRefundQuote spareChangeRefundQuote2 = ((n2c.b) obj2).f211515b;
                Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                return new n2c.b(spareChangeRefund2, spareChangeRefundQuote2);
            case 21:
                return n3j.n.a((n3j.n) obj2, this.f208923b, null, 0, null, null, 62);
            case 22:
                return n3j.n.a((n3j.n) obj2, null, null, 0, this.f208923b, null, 55);
            case 23:
                n4h.h hVar = (n4h.h) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.f208923b.getContent();
                hel.b bVar = tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null;
                hVar.getClass();
                return new n4h.h(bVar);
            case 24:
                return n87.k.a((n87.k) obj2, this.f208923b, false, null, null, 29);
            case 25:
                return n87.k.a((n87.k) obj2, null, false, null, this.f208923b, 15);
            case 26:
                return n8f.h.a((n8f.h) obj2, this.f208923b, null, null, null, null, null, 62);
            case 27:
                return n8i.q.a((n8i.q) obj2, this.f208923b, null, null, 6);
            case 28:
                return n8i.q.a((n8i.q) obj2, null, this.f208923b, null, 5);
            default:
                Data data = this.f208923b;
                Intrinsics.h(data);
                return nb6.d.a((nb6.d) obj2, null, data, 3);
        }
    }
}
