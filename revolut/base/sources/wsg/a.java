package wsg;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.wallets.api.module.WalletLimit;
import ip0.ek;
import ip0.gu;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import ip0.yl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k71.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wtk.r;
import yw4.p;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299709a;

    public /* synthetic */ a(int i) {
        this.f299709a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f299709a) {
            case 0:
                Map allWalletsWithPockets = (Map) obj2;
                Intrinsics.checkNotNullParameter(allWalletsWithPockets, "allWalletsWithPockets");
                return w.u(allWalletsWithPockets.values());
            case 1:
                fo3.c it8 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.b();
            case 2:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    if (dVar.r() == io3.k.ACTIVE || dVar.r() == io3.k.INACTIVE) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                io3.d it9 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.r() == io3.k.ACTIVE);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 5:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return Boolean.valueOf(pocket.u() == io3.l.CURRENT);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 7:
                fo3.c it10 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.a();
            case 8:
                fo3.c it11 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.a();
            case 9:
                do3.n it12 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f116408a;
            case 10:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM income_sorter_executions");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 11:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM income_sorters");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 12:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                return (p) d0.b0(facilities);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s7 s7Var = new s7("credit-card-overdue-explainer-amount-loading", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, null, false, 60);
                p10 p10Var = p10.f165755a;
                t10 t10Var = new t10("credit-card-overdue-explainer-current-restrictions-loading", p10Var);
                int i = R$attr.uikit_dp8;
                yp0.b.l(t10Var, i, i, 0, 0, null, false, 60);
                t10 t10Var2 = new t10("credit-card-overdue-explainer-delayed-payment-loading", p10Var);
                yp0.b.l(t10Var2, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
                return new wt4.j(v.k(s7Var, t10Var, t10Var2), wt4.h.f299776a, wt4.b.f299769a);
            case 14:
                yh5.a it13 = (yh5.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(yh5.b.x(it13));
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return wt7.j.a((List) getDefaultLoadingItems.invoke(), true);
            case 16:
                q it14 = (q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(it14, false, null, 3);
            case 17:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Data(null, it15, false, 5, null);
            case 18:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : it16) {
                    if (obj4 instanceof WalletLimit.CounterLimit) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 19:
                yoj.a it17 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                yoj.d dVar2 = it17.f315683b;
                return Boolean.valueOf(dVar2 == yoj.d.ENABLED || dVar2 == yoj.d.PENDING);
            case 20:
                return Boolean.valueOf(((WealthProtectionFeatureDetails) obj2) instanceof WealthProtectionFeatureDetails.Enabled);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("HEADER_LOADING_ITEM_ID", 0, 0, 30);
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "ROW_LOADING_ITEM_DELEGATE_ID_1", false, 6), nb0.a(nb0Var, "ROW_LOADING_ITEM_DELEGATE_ID_2", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return ue0.e.J(guVar, listK);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return r.a();
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new yl("header-loading-sharpe-ratio", 0, 30));
            case 24:
                File it18 = (File) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.isFile() && it18.exists() && it18.lastModified() != 0);
            case 25:
                dv9.g it19 = (dv9.g) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f118064a;
            case 26:
                efm.i completions = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(completions, "completions");
                return completions.q(1L).b(5500L, TimeUnit.MILLISECONDS);
            case 27:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(!it20.isEmpty());
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ek ekVar = new ek("ACCOUNT_CLOSURE_PROGRESS_LOADING_ID", 0, 0, 0, 0, false, 122, false);
                yp0.b.l(ekVar, 0, 0, 0, 0, null, false, 63);
                return new wug.f(null, null, null, u.c(ekVar));
            default:
                ((Integer) obj2).getClass();
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f299709a = i;
    }
}
