package byi;

import c7i.r;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f19837b;

    public /* synthetic */ i(Data data, int i) {
        this.f19836a = i;
        this.f19837b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        c42.b bVar;
        switch (this.f19836a) {
            case 0:
                Data data2 = this.f19837b;
                Intrinsics.h(data2);
                return d.a((d) obj2, null, data2, null, null, null, 59);
            case 1:
                return d.a((d) obj2, null, null, this.f19837b, null, null, 55);
            case 2:
                Data data3 = this.f19837b;
                Intrinsics.h(data3);
                return d.a((d) obj2, null, null, null, data3, null, 47);
            case 3:
                Data data4 = this.f19837b;
                Intrinsics.h(data4);
                return d.a((d) obj2, null, null, null, null, data4, 31);
            case 4:
                return d.a((d) obj2, this.f19837b, null, null, null, null, 62);
            case 5:
                Data data5 = this.f19837b;
                Intrinsics.h(data5);
                return bzc.j.a((bzc.j) obj2, data5, null, 6);
            case 6:
                Data data6 = this.f19837b;
                Intrinsics.h(data6);
                return bzc.j.a((bzc.j) obj2, null, data6, 5);
            case 7:
                return bzg.k.a((bzg.k) obj2, null, null, null, null, null, null, null, null, false, null, null, false, null, null, this.f19837b, null, null, 1966079);
            case 8:
                return bzg.k.a((bzg.k) obj2, null, null, null, null, null, null, null, null, false, null, null, false, null, this.f19837b, null, null, null, 2031615);
            case 9:
                return bzg.k.a((bzg.k) obj2, null, null, null, null, null, this.f19837b, null, null, false, null, null, false, null, null, null, null, null, 2096895);
            case 10:
                return bzg.k.a((bzg.k) obj2, null, null, null, null, null, null, null, null, false, this.f19837b, null, false, null, null, null, null, null, 2093055);
            case 11:
                return bzg.k.a((bzg.k) obj2, null, this.f19837b, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 2097147);
            case 12:
                return c0c.k.a((c0c.k) obj2, null, null, null, null, null, null, this.f19837b, 63);
            case 13:
                return c0c.k.a((c0c.k) obj2, null, this.f19837b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 14:
                return c0c.k.a((c0c.k) obj2, null, null, null, this.f19837b, null, null, null, LDSFile.EF_SOD_TAG);
            case 15:
                Data data7 = this.f19837b;
                Intrinsics.h(data7);
                return c0c.k.a((c0c.k) obj2, data7, null, null, null, null, null, null, 126);
            case 16:
                Data data8 = this.f19837b;
                Intrinsics.h(data8);
                return c0c.k.a((c0c.k) obj2, null, null, data8, null, null, null, null, 123);
            case 17:
                return c0c.k.a((c0c.k) obj2, null, null, null, null, this.f19837b, null, null, LDSFile.EF_DG15_TAG);
            case 18:
                ((c2f.d) obj2).getClass();
                Data agentDetails = this.f19837b;
                Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
                return new c2f.d(agentDetails);
            case 19:
                return c3k.c.a((c3k.c) obj2, this.f19837b, null, 2);
            case 20:
                Data data9 = this.f19837b;
                c42.a aVar = (c42.a) obj2;
                try {
                    Object content = data9.getContent();
                    if (content != null) {
                        Pair pair = (Pair) content;
                        bVar = new c42.b((List) pair.f186385a, (List) pair.f186386b);
                    } else {
                        bVar = null;
                    }
                    data = new Data(bVar, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data9.getLoading());
                }
                return c42.a.a(aVar, data, null, false, 30);
            case 21:
                c46.c cVar = (c46.c) obj2;
                DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) this.f19837b.getContent();
                return c46.c.a(cVar, null, null, deFiAssetDetails != null ? deFiAssetDetails.k : null, 3);
            case 22:
                return c5a.l.a((c5a.l) obj2, null, null, this.f19837b, null, null, false, null, null, null, null, null, null, null, null, false, false, null, false, null, 524283);
            case 23:
                return c5a.l.a((c5a.l) obj2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, false, this.f19837b, 262143);
            case 24:
                return c5a.l.a((c5a.l) obj2, null, null, null, null, null, false, null, null, null, null, this.f19837b, null, null, null, false, false, null, false, null, 523263);
            case 25:
                Data data10 = this.f19837b;
                Intrinsics.h(data10);
                return c5a.l.a((c5a.l) obj2, null, data10, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, false, null, 524285);
            case 26:
                Data loans = this.f19837b;
                Intrinsics.h(loans);
                ((c75.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(loans, "loans");
                return new c75.d(loans);
            case 27:
                ((c7b.i) obj2).getClass();
                Data planDashboardData = this.f19837b;
                Intrinsics.checkNotNullParameter(planDashboardData, "planDashboardData");
                return new c7b.i(planDashboardData);
            case 28:
                return r.a((r) obj2, this.f19837b, 0L, 0L, null, null, null, null, null, null, 510);
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Data data11 = this.f19837b;
                Intrinsics.h(data11);
                return Data.copy$default(data11, it8, null, false, 6, null);
        }
    }
}
