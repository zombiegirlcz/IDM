package com.revolut.feature.alipay_plus.mpm.webcontainer;

import a0.d;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreen;
import com.revolut.feature.statements.impl.tools.ReportUtilsImpl;
import com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreen;
import com.revolut.network.NetworkChangedReceiver;
import cpb.i;
import cpb.l;
import cq9.f;
import cqi.g;
import gr.n;
import gr.o;
import gr.q;
import ip0.dg;
import ip0.nb0;
import ip0.pb0;
import ip0.yo0;
import j61.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.p;
import wp5.y;
import zhm.d0;
import zhm.u;
import zhm.v;
import zp.b;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61104a;

    public /* synthetic */ a(int i) {
        this.f61104a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f61104a) {
            case 0:
                return APMPMWebContainerClient._init_$lambda$1((String) obj2);
            case 1:
                Byte b4 = (Byte) obj2;
                b4.byteValue();
                return d.v(new Object[]{b4}, 1, "%02x", "format(...)");
            case 2:
                return Boolean.valueOf(ReportUtilsImpl.cryptoWithdrawTotal$lambda$0((TransactionDbModel) obj2));
            case 3:
                return Boolean.valueOf(ReportUtilsImpl.cardPaymentsTotal$lambda$0((TransactionDbModel) obj2));
            case 4:
                return Boolean.valueOf(ReportUtilsImpl.cardRevolutFeesTotal$lambda$0((TransactionDbModel) obj2));
            case 5:
                return Boolean.valueOf(ReportUtilsImpl.cardRevolutFeesTotal$lambda$1((TransactionDbModel) obj2));
            case 6:
                return Boolean.valueOf(ReportUtilsImpl.cardTopUpTotal$lambda$0((TransactionDbModel) obj2));
            case 7:
                return Boolean.valueOf(ReportUtilsImpl.cryptoWithdrawTotalFees$lambda$0((TransactionDbModel) obj2));
            case 8:
                return Boolean.valueOf(ReportUtilsImpl.cardAtmWithdrawalTotal$lambda$0((TransactionDbModel) obj2));
            case 9:
                return Boolean.valueOf(ReportUtilsImpl.cardSentTotal$lambda$0((TransactionDbModel) obj2));
            case 10:
                return Boolean.valueOf(ReportUtilsImpl.cardReceivedTotal$lambda$0((TransactionDbModel) obj2));
            case 11:
                return Boolean.valueOf(ReportUtilsImpl.cardReceivedTotal$lambda$1((TransactionDbModel) obj2));
            case 12:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$10((Throwable) obj2);
            case 13:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$2((List) obj2);
            case 14:
                return Boolean.valueOf(NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$4((List) obj2));
            case 15:
                return Boolean.valueOf(NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$6((Long) obj2));
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new i(u.c(l.a("", true)), false);
            case 17:
                yoj.a it8 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(hx7.i.v(it8.b()));
            case 18:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 19:
                yoj.a it9 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(hx7.i.v(it9.b()));
            case 20:
                b it10 = (b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.f324085b.f280280a < 100);
            case 21:
                int i = ChallengesOverviewDetailsScreen.U;
                Intrinsics.checkNotNullParameter((dg) obj2, "it");
                return cq8.d.f108026a;
            case 22:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, 0L, null, update.f108049c + 1, 3);
            case 23:
                p reason = (p) obj2;
                Intrinsics.checkNotNullParameter(reason, "reason");
                int i2 = cqi.i.f108136a[reason.ordinal()];
                if (i2 == 1) {
                    return g.PROGRAMMATICALLY;
                }
                if (i2 == 2) {
                    return g.USER;
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                q state = (q) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof gr.p) {
                    gr.p pVar = (gr.p) state;
                    return d.j(pVar.f145791b, ")", com.google.android.gms.internal.mlkit_vision_face.a.v(pVar.f145790a, "Progress(uploadedBytes=", ", totalBytes="));
                }
                if (state instanceof o) {
                    o oVar = (o) state;
                    return "Error(error=" + oVar.f145788a + ", totalBytes=" + oVar.f145789b + ")";
                }
                if (!(state instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                n nVar = (n) state;
                return "Completed(key=" + nVar.f145786a + ", totalBytes=" + nVar.f145787b + ")";
            case 25:
                String str = (String) obj2;
                if (str != null) {
                    return new hs3.l(str);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new cr5.b(it11);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "SPENDING_CYCLE_LOADING_ITEMS_ID1", false, 0, false, 30), nb0.b(nb0Var, "SPENDING_CYCLE_LOADING_ITEMS_ID2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 28:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (c) d0.d0(it12);
            default:
                yo0 it13 = (yo0) obj2;
                KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 == yo0.LOADING_FINISHED);
        }
    }
}
