package q4a;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.WhoToTransferApi$Toggles;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pig.y;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a f242110b;

    public /* synthetic */ l(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar, int i) {
        this.f242109a = i;
        this.f242110b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List availableFilters;
        r rVarW;
        r rVarJust;
        switch (this.f242109a) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                String str = (String) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                List availableFilters2 = (List) rVar.f314203c;
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar = this.f242110b;
                t4a.g gVar = aVar.f80132s;
                String str2 = !d0.W(str) ? str : null;
                WhoToTransferFilter whoToTransferFilter = (WhoToTransferFilter) iVar.f224257a;
                Intrinsics.h(availableFilters2);
                TransferFlowType transferFlowType = aVar.u.f80127c;
                gVar.getClass();
                gte.a aVar2 = gVar.f;
                Intrinsics.checkNotNullParameter(availableFilters2, "availableFilters");
                Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
                List list = availableFilters2;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(t4a.g.b((WhoToTransferFilter) it8.next()));
                }
                List listU = zhm.d0.U(arrayList);
                if (whoToTransferFilter == null) {
                    aim.e eVarB = u.b();
                    eVarB.addAll(listU);
                    d3a.a aVar3 = d3a.a.DEVICE;
                    if (!eVarB.contains(aVar3)) {
                        eVarB.add(aVar3);
                    }
                    eVarB.add(d3a.a.REVTAG);
                    if (((jte.d) aVar2).c(WhoToTransferApi$Toggles.TransferVendorFiltering.f80047c)) {
                        d3a.a aVar4 = d3a.a.MOBILE_WALLET;
                        if (!eVarB.contains(aVar4)) {
                            eVarB.add(aVar4);
                        }
                    }
                    listU = u.a(eVarB);
                }
                jq9.a juniorIncludingMode = gVar.d.a();
                if (str2 == null || d0.W(str2)) {
                    if (whoToTransferFilter == null || (availableFilters = u.c(whoToTransferFilter)) == null) {
                        availableFilters = availableFilters2;
                    }
                    t3a.g gVar2 = gVar.f267958b;
                    Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
                    Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
                    rVarW = nim.a.w(gVar2.f267719a.a(false, juniorIncludingMode), new s78.n(availableFilters, 8));
                } else {
                    rVarW = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarW);
                }
                r rVarD = ((u3a.n) gVar.f267957a).d(str2, listU, juniorIncludingMode);
                r map = gVar.f267959c.p(str2).map(new t45.a(new t3b.g(14), 3));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                if (((jte.d) aVar2).c(WhoToTransferApi$Toggles.TransferVendorFiltering.f80047c)) {
                    rVarJust = rd0.e.c(mo3.a.g(n14.k.p(gVar.e.a(), new t3b.g(15)), new szb.f(26), null, 2), kotlin.coroutines.g.f186406a).map(new t45.a(new t3b.g(16), 4));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "map(...)");
                } else {
                    rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                }
                r rVarFilter = nim.a.w(mif.a.f(rVarW, rVarD, map, rVarJust), new sc7.b(gVar, availableFilters2, whoToTransferFilter, transferFlowType, 2)).filter(new q3d.c(10, new q3d.i(10)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar5 = this.f242110b;
                aVar5.H2(aVar5.A, new ocb.u(zBooleanValue, 17));
                break;
            case 2:
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar6 = this.f242110b;
                aVar6.H2(aVar6.A, new y((String) obj2, 17));
                break;
            default:
                j4a.a output = (j4a.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar7 = this.f242110b;
                aVar7.A1(new q03.m(aVar7, output, null, 8), new yi5.b(25));
                break;
        }
        return Unit.f186387a;
    }
}
