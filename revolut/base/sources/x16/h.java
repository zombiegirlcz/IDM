package x16;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import hs3.z1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import whf.p;
import x18.q;
import xka.r;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f302315b;

    public /* synthetic */ h(Data data, int i) {
        this.f302314a = i;
        this.f302315b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data debts;
        switch (this.f302314a) {
            case 0:
                return DeFiAccountsExtensionState.a((DeFiAccountsExtensionState) obj2, null, this.f302315b, null, null, null, null, 61);
            case 1:
                return q.a((q) obj2, null, null, null, this.f302315b, 7);
            case 2:
                return q.a((q) obj2, null, this.f302315b, null, null, 13);
            case 3:
                return q.a((q) obj2, null, null, this.f302315b, null, 11);
            case 4:
                return x1g.i.a((x1g.i) obj2, null, null, null, null, false, this.f302315b, null, null, null, 30719);
            case 5:
                Data data = this.f302315b;
                Intrinsics.h(data);
                return x1g.i.a((x1g.i) obj2, null, null, null, null, false, null, null, data, null, 24575);
            case 6:
                x1g.i iVar = (x1g.i) obj2;
                od0.i.Companion.getClass();
                return x1g.i.a(iVar, null, null, null, null, false, null, null, null, od0.h.a(this.f302315b), 16383);
            case 7:
                return x1g.i.a((x1g.i) obj2, null, null, null, null, false, null, this.f302315b, null, null, 28671);
            case 8:
                return x23.j.a((x23.j) obj2, this.f302315b, null, null, false, false, false, false, null, null, 4094);
            case 9:
                return x4e.d.a((x4e.d) obj2, this.f302315b, null, null, 6);
            case 10:
                return x4e.d.a((x4e.d) obj2, null, this.f302315b, null, 5);
            case 11:
                x64.j update = (x64.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return x64.j.a(update, null, this.f302315b, 5);
            case 12:
                ((y5h.c) obj2).getClass();
                return new y5h.c(this.f302315b);
            case 13:
                return x82.b.a((x82.b) obj2, this.f302315b, null, 0L, 6);
            case 14:
                return x82.b.a((x82.b) obj2, null, (p) this.f302315b.getContent(), 0L, 5);
            case 15:
                Data data2 = this.f302315b;
                x84.g gVar = (x84.g) obj2;
                try {
                    Object content = data2.getContent();
                    debts = new Data(content != null ? ((pu3.g) content).f239813a : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    debts = new Data(null, th10, data2.getLoading());
                }
                gVar.getClass();
                Intrinsics.checkNotNullParameter(debts, "debts");
                return new x84.g(debts);
            case 16:
                ((x9b.a) obj2).getClass();
                Data data3 = this.f302315b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new x9b.a(data3);
            case 17:
                Data data4 = this.f302315b;
                Intrinsics.h(data4);
                return new xb6.c(data4);
            case 18:
                ((xd2.k) obj2).getClass();
                Data data5 = this.f302315b;
                Intrinsics.checkNotNullParameter(data5, "data");
                return new xd2.k(data5);
            case 19:
                Data cashbackByCurrenciesData = this.f302315b;
                Intrinsics.h(cashbackByCurrenciesData);
                ((xd3.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
                return new xd3.b(cashbackByCurrenciesData);
            case 20:
                z1 metadata = ((xd4.a) obj2).f304255a;
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Data ticketProgression = this.f302315b;
                Intrinsics.checkNotNullParameter(ticketProgression, "ticketProgression");
                return new xd4.a(metadata, ticketProgression);
            case 21:
                return xdi.g.a((xdi.g) obj2, this.f302315b, null, 0, 6);
            case 22:
                return xec.e.a((xec.e) obj2, this.f302315b, null, null, null, null, 254);
            case 23:
                return xec.e.a((xec.e) obj2, null, null, null, null, this.f302315b, 191);
            case 24:
                Data alertItems = this.f302315b;
                Intrinsics.h(alertItems);
                FavouritesAssetTypeKey selectedAssetTypeKey = ((xed.e) obj2).f304616a;
                Intrinsics.checkNotNullParameter(selectedAssetTypeKey, "selectedAssetTypeKey");
                Intrinsics.checkNotNullParameter(alertItems, "alertItems");
                return new xed.e(selectedAssetTypeKey, alertItems);
            case 25:
                ((xg7.d) obj2).getClass();
                Data lotteryEnrollmentDetails = this.f302315b;
                Intrinsics.checkNotNullParameter(lotteryEnrollmentDetails, "lotteryEnrollmentDetails");
                return new xg7.d(lotteryEnrollmentDetails);
            case 26:
                return xhj.e.a((xhj.e) obj2, this.f302315b, null, 2);
            case 27:
                return xhj.e.a((xhj.e) obj2, null, this.f302315b, 1);
            case 28:
                ((whh.j) obj2).getClass();
                Data accountsClosures = this.f302315b;
                Intrinsics.checkNotNullParameter(accountsClosures, "accountsClosures");
                return new whh.j(accountsClosures);
            default:
                return r.a((r) obj2, this.f302315b, null, 2);
        }
    }
}
