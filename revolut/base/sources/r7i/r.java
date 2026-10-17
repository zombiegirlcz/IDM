package r7i;

import aw0.x4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto_deposits.api.interactors.CryptoDepositsInteractor$Companion;
import ip0.s7;
import ip0.t1;
import ip0.v4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import retrofit2.Response;
import zh9.u0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252242a;

    public /* synthetic */ r(int i) {
        this.f252242a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f252242a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 1:
                bla.c it8 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == bla.c.ENABLED);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new s86.i(s86.o.f260920a, (List) getDefaultLoadingItems.invoke());
            case 3:
                xc8.g it9 = (xc8.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                xc8.c cVar = (xc8.c) it9.f304108b.get(v6d.a.PAYMENT_LINKS);
                boolean z = false;
                if (cVar != null && cVar.b()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new r8e.g((do3.n) pair.f186385a, v04.b.c((l71.d) pair.f186386b));
            case 5:
                Function0 function0 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(function0, "default");
                return (List) function0.invoke();
            case 6:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ofm.q.f0((qta.c) d0.b0(it10));
            case 7:
                JuniorBankingProfile it11 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new o9c.q(odc.n.c(odc.g.f224445a, null, m6c.c.PAY));
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new o9c.q(odc.n.c(odc.g.f224445a, null, m6c.c.PAY));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return o9c.a0.f223186a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(1, 2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it12 = intRange.iterator();
                while (it12.f289625c) {
                    arrayList.add(new s7(j6.a.l(it12.nextInt(), "ID_CELL_LOADING_", "_RECIPIENT"), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                IntRange intRange2 = new IntRange(1, 4, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange2, 10));
                vim.f it13 = intRange2.iterator();
                while (it13.f289625c) {
                    arrayList2.add(new s7(j6.a.l(it13.nextInt(), "ID_CELL_LOADING_", "_ORDER"), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                return zhm.u.a(eVarB);
            case 13:
                BackendScreen it14 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.getId();
            case 14:
                io3.d it15 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return io3.h.e(it15);
            case 15:
                qab.a it16 = (qab.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                return new lab.a(it16.getSavingId(), it16.getWithdrawalsEnabled());
            case 16:
                qab.a it17 = (qab.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                return new lab.a(it17.getSavingId(), it17.getWithdrawalsEnabled());
            case 17:
                pad.d dto = (pad.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return new imi.a(dto.getExpiration(), dto.getAccessToken(), dto.getRefreshCode(), dto.getOwnerId());
            case 18:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.h(naviCommand);
                return u0.b(naviCommand);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                v4 v4Var = new v4("CHARITY_BIG_TILE_ITEM_ID", null, 62);
                yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(v4Var);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = rb6.n.c();
                ArrayList arrayListS = d0.S(new IntRange(1, 6, 1), 3);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListS, 10));
                int i = 0;
                for (Object obj3 : arrayListS) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    String strN = a0.d.n("AMOUNTS_CONTAINER_ID_", i);
                    int size = ((List) obj3).size();
                    ArrayList arrayList4 = new ArrayList(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        t1 t1Var = new t1(a0.d.g(i, i3, "AMOUNTS_CONTAINER_ID_", "_"), null, 6);
                        yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                        arrayList4.add(t1Var);
                    }
                    hg hgVar = new hg(strN, arrayList4, 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                    int i5 = R$attr.uikit_dp0;
                    yp0.b.r(hgVar, 0, 0, i5, i5, 3);
                    arrayList3.add(hgVar);
                    i = i2;
                }
                return d0.E0(rb6.n.b(), d0.E0(arrayList3, listC));
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 22:
                Response it18 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Integer.valueOf(it18.code());
            case 23:
                Response it19 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Integer.valueOf(it19.code());
            case 24:
                Response it20 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Integer.valueOf(it20.code());
            case 25:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21 instanceof CryptoDepositsInteractor$Companion.NotCreatedYet);
            case 26:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (Intrinsics.f(error, CryptoDepositsInteractor$Companion.NotCreatedYet.f100036a)) {
                    throw error;
                }
                return te0.w.h(data);
            case 27:
                eda.e it22 = (eda.e) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f124961a.f163145a;
            case 28:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new xj5.a((List) pair2.f186385a, (List) pair2.f186386b);
            default:
                List<jq9.k> recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                ArrayList arrayList5 = new ArrayList();
                for (jq9.k kVar : recents) {
                    jq9.p pVar = kVar instanceof jq9.p ? (jq9.p) kVar : null;
                    zm3.a aVar = pVar != null ? pVar.f177514b : null;
                    if (aVar != null) {
                        arrayList5.add(aVar);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList5) {
                    if (obj4 instanceof zm3.l) {
                        arrayList6.add(obj4);
                    }
                }
                return arrayList6;
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f252242a = i;
    }
}
