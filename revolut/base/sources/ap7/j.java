package ap7;

import aqd.t;
import b4b.n;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f8109b;

    public /* synthetic */ j(Data data, int i) {
        this.f8108a = i;
        this.f8109b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        od0.i iVar;
        FreelancerTaxProfile freelancerTaxProfile;
        switch (this.f8108a) {
            case 0:
                Data data = this.f8109b;
                Intrinsics.h(data);
                return d.a((d) obj2, null, data, 1);
            case 1:
                return aqb.f.a((aqb.f) obj2, null, this.f8109b, false, null, null, 29);
            case 2:
                return t.a((t) obj2, this.f8109b, null, null, null, false, null, null, 126);
            case 3:
                return aqh.i.a((aqh.i) obj2, null, this.f8109b, null, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 4:
                Data data2 = this.f8109b;
                Intrinsics.h(data2);
                return arf.d.a((arf.d) obj2, data2);
            case 5:
                ((atk.d) obj2).getClass();
                Data instrumentIsRisky = this.f8109b;
                Intrinsics.checkNotNullParameter(instrumentIsRisky, "instrumentIsRisky");
                return new atk.d(instrumentIsRisky);
            case 6:
                ((aui.e) obj2).getClass();
                Data airportsList = this.f8109b;
                Intrinsics.checkNotNullParameter(airportsList, "airportsList");
                return new aui.e(airportsList);
            case 7:
                return av7.e.a((av7.e) obj2, this.f8109b);
            case 8:
                av8.j jVar = (av8.j) obj2;
                Data data3 = this.f8109b;
                List list2 = (List) data3.getContent();
                return av8.j.a(jVar, null, data3, (list2 == null || !(list2.isEmpty() ^ true) || (list = (List) data3.getContent()) == null) ? null : (av8.i) d0.b0(list), 1);
            case 9:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f8109b, null, 49151);
            case 10:
                return avk.m.c((avk.m) obj2, null, null, null, null, this.f8109b, null, null, null, null, null, null, null, null, null, null, null, 65519);
            case 11:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, this.f8109b, null, null, null, null, null, null, null, null, null, 65471);
            case 12:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, this.f8109b, null, null, null, null, null, null, null, null, 65407);
            case 13:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, null, this.f8109b, null, null, null, null, null, null, null, 65279);
            case 14:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f8109b, null, null, null, 61439);
            case 15:
                ((aw1.g) obj2).getClass();
                Data aliases = this.f8109b;
                Intrinsics.checkNotNullParameter(aliases, "aliases");
                return new aw1.g(aliases);
            case 16:
                aw7.g gVar = (aw7.g) obj2;
                aw7.f fVar = gVar.f10741c;
                String str = fVar != null ? fVar.f10736a : null;
                Data data4 = this.f8109b;
                return aw7.g.a(gVar, data4, boh.f.d(data4, str), 1);
            case 17:
                ((axb.d) obj2).getClass();
                Data userVoucherListData = this.f8109b;
                Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
                return new axb.d(userVoucherListData);
            case 18:
                return axi.l.a((axi.l) obj2, 0, null, null, null, null, false, null, null, null, null, this.f8109b, 2047);
            case 19:
                return axi.l.a((axi.l) obj2, 0, null, null, null, null, false, null, null, null, null, this.f8109b, 2047);
            case 20:
                yte.m mVar = ((aye.d) obj2).f11137b;
                Data storedMethodDetail = this.f8109b;
                Intrinsics.checkNotNullParameter(storedMethodDetail, "storedMethodDetail");
                return new aye.d(storedMethodDetail, mVar);
            case 21:
                OrderQuote previousQuote = ((b0i.a) obj2).f11672a;
                Intrinsics.checkNotNullParameter(previousQuote, "previousQuote");
                Data newQuote = this.f8109b;
                Intrinsics.checkNotNullParameter(newQuote, "newQuote");
                return new b0i.a(previousQuote, newQuote);
            case 22:
                ((b27.f) obj2).getClass();
                Data data5 = this.f8109b;
                Intrinsics.checkNotNullParameter(data5, "data");
                return new b27.f(data5);
            case 23:
                b28.a aVar = (b28.a) obj2;
                boolean z = aVar.f11921a;
                boolean z3 = aVar.f11922b;
                Data wealthDisclaimersData = this.f8109b;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                return new b28.a(wealthDisclaimersData, z, z3);
            case 24:
                b47.e eVar = (b47.e) obj2;
                Boolean boolValueOf = eVar.f12189b;
                Data data6 = this.f8109b;
                if (boolValueOf == null) {
                    b47.f fVar2 = (b47.f) data6.getContent();
                    boolValueOf = (fVar2 == null || (iVar = fVar2.f12191a) == null || (freelancerTaxProfile = (FreelancerTaxProfile) iVar.f224257a) == null) ? null : Boolean.valueOf(freelancerTaxProfile.d);
                }
                return b47.e.a(eVar, data6, boolValueOf, 4);
            case 25:
                return n.a((n) obj2, null, null, null, null, null, this.f8109b, null, null, null, false, null, null, 8127);
            case 26:
                return n.a((n) obj2, null, null, null, null, null, null, this.f8109b, null, null, false, null, null, 8063);
            case 27:
                return n.a((n) obj2, null, null, null, null, null, null, null, this.f8109b, null, false, null, null, 7935);
            case 28:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, false, this.f8109b, null, 6143);
            default:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, this.f8109b, false, null, null, 7679);
        }
    }
}
