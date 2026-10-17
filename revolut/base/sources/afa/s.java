package afa;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.retail.trading.core.domain.PocketOwnerInfo;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pcd.f0;
import pcd.g0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io3.d f4002b;

    public /* synthetic */ s(io3.d dVar, int i) {
        this.f4001a = i;
        this.f4002b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        StakingInfo stakingInfo;
        io3.g gVar;
        Data data;
        pcd.s sVar;
        Object next;
        switch (this.f4001a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LinkedHashMap linkedHashMapZ = r0.z(update.e);
                xi0.a aVar = xi0.b.Companion;
                String str = this.f4002b.f163147c;
                aVar.getClass();
                linkedHashMapZ.put(xi0.a.a(str), Boolean.valueOf(!((Boolean) linkedHashMapZ.getOrDefault(r0, Boolean.FALSE)).booleanValue()));
                return g.a(update, null, null, null, null, linkedHashMapZ, null, null, null, 239);
            case 1:
                io3.d dVar = this.f4002b;
                Intrinsics.h(dVar);
                return bg2.g.a((bg2.g) obj2, null, null, dVar, null, null, null, false, null, 8175);
            case 2:
                StakingAvailability stakingAvailability = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
                StakingProduct stakingProduct = stakingAvailability.f88058a;
                if (((stakingProduct == null || (stakingInfo = stakingProduct.f88087b) == null) ? null : stakingInfo.k) != vtd.b.MANUAL) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                ExchangeStakingData exchangeStakingData = new ExchangeStakingData(this.f4002b.f163145a, stakingAvailability);
                hVar.getClass();
                return od0.h.a(exchangeStakingData);
            case 3:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new Pair(this.f4002b, transactions);
            case 4:
                List transactions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions2, "transactions");
                return new Pair(this.f4002b, transactions2);
            case 5:
                hea.o update2 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hea.o.a(update2, this.f4002b, false, null, null, null, null, null, null, false, null, null, false, null, null, false, 32766);
            case 6:
                return hud.i.a((hud.i) obj2, null, null, this.f4002b, null, null, null, null, 1983);
            case 7:
                io3.d pocket = this.f4002b;
                Intrinsics.h(pocket);
                DirectDebitData directDebitData = ((i69.f) obj2).f158893a;
                Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new i69.f(directDebitData, pocket);
            case 8:
                io3.d dVar2 = this.f4002b;
                return ku1.h.a((ku1.h) obj2, null, null, zi0.c.P(dVar2, false, null, 3), new Data(null, null, true, 3, null), dVar2.f163145a, null, 35);
            case 9:
                io3.d dVar3 = this.f4002b;
                return ku1.h.a((ku1.h) obj2, null, null, zi0.c.P(dVar3, false, null, 3), null, dVar3.f163145a, null, 43);
            case 10:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, this.f4002b, false, false, null, null, null, null, null, null, null, null, null, -67108865, 63);
            case 11:
                return new Pair((od0.i) obj2, this.f4002b);
            case 12:
                return o9a.j.a((o9a.j) obj2, this.f4002b, null, null, null, false, null, ISO781611.SMT_TAG);
            case 13:
                io3.d dVar4 = this.f4002b;
                Intrinsics.h(dVar4);
                return qba.h.a((qba.h) obj2, null, null, dVar4, null, 495);
            case 14:
                qwd.m update3 = (qwd.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return qwd.m.a(update3, 0L, null, null, false, new Data(this.f4002b, null, false, 6, null), null, null, null, 959);
            case 15:
                return qwd.m.a((qwd.m) obj2, 0L, null, null, false, new Data(this.f4002b, null, false, 6, null), null, null, null, 959);
            case 16:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                List list = (List) data2.getContent();
                if (list == null || (gVar = (io3.g) zhm.d0.d0(list)) == null) {
                    gVar = new io3.g(this.f4002b, null, null, 30);
                }
                return new Data(gVar, data2.getError(), data2.getLoading());
            case 17:
                PocketOwnerInfo ownerInfo = (PocketOwnerInfo) obj2;
                Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
                return rbh.r.e(this.f4002b, ownerInfo);
            case 18:
                PocketOwnerInfo pocketOwnerInfo = (PocketOwnerInfo) obj2;
                Intrinsics.checkNotNullParameter(pocketOwnerInfo, "pocketOwnerInfo");
                io3.d dVar5 = this.f4002b;
                return new PocketInfo.Pro(dVar5.f163145a, io3.h.e(dVar5), null, pocketOwnerInfo, new TextLocalisedClause(R$string.wealth_invest_add_withdraw_money_pocket_picker_pro, zhm.u.c(new TextClause(dVar5.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
            case 19:
                PocketOwnerInfo pocketOwnerInfo2 = (PocketOwnerInfo) obj2;
                Intrinsics.checkNotNullParameter(pocketOwnerInfo2, "pocketOwnerInfo");
                return rbh.r.e(this.f4002b, pocketOwnerInfo2);
            case 20:
                io3.d dVar6 = this.f4002b;
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                try {
                    Object content = it8.getContent();
                    if (content != null) {
                        Iterator it9 = ((List) content).iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                g0 g0Var = ((pcd.s) next).f234885h;
                                f0 f0Var = g0Var instanceof f0 ? (f0) g0Var : null;
                                if (Intrinsics.f(f0Var != null ? f0Var.d.f234875a : null, dVar6.f163145a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        sVar = (pcd.s) next;
                    } else {
                        sVar = null;
                    }
                    data = new Data(sVar, it8.getError(), it8.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, it8.getLoading());
                }
                return (pcd.s) zi0.c.I(data);
            default:
                io3.d dVar7 = this.f4002b;
                Intrinsics.h(dVar7);
                return zba.f.a((zba.f) obj2, null, io3.h.e(dVar7), null, 5);
        }
    }

    public /* synthetic */ s(rbh.r rVar, io3.d dVar, int i) {
        this.f4001a = i;
        this.f4002b = dVar;
    }
}
