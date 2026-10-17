package hu1;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreenContract$InputData;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import skm.a2;
import tof.f7;
import tof.h7;
import tof.i7;
import tof.q6;
import tof.sa;
import tof.v5;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 extends jki.g implements q {

    @NotNull
    public static final v Companion = new v();
    public final uw1.c A;
    public final ang.f B;
    public final g1 C;
    public final v02.c D;
    public final ry9.d E;
    public final o F;
    public a2 G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlikCodeScreenContract$InputData f155512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eu1.a f155513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h12.a f155514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f155515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final df0.b f155516t;
    public final ju1.a u;
    public final fnc.s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fmc.z f155517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lx1.d f155518x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wt1.b f155519y;
    public final h12.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(BlikCodeScreenContract$InputData inputData, eu1.a blikInteractor, h12.a apmAreaHandler, c70.a clipboard, df0.b dateProvider, ju1.a codeUsageObservable, fnc.s newContactNavigationProvider, fmc.z recipientListNavigationProvider, lx1.d apmContactsInteractor, wt1.b blikDestinationProvider, h12.h apmAreaProvider, uw1.c apmFeatureChecker, ang.f userInteractor, g1 shotDialogDisplayer, v02.c aliasDialogMapper, ry9.d sendFromClipboardExtension, j0 stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(codeUsageObservable, "codeUsageObservable");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(blikDestinationProvider, "blikDestinationProvider");
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(aliasDialogMapper, "aliasDialogMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f155512p = inputData;
        this.f155513q = blikInteractor;
        this.f155514r = apmAreaHandler;
        this.f155515s = clipboard;
        this.f155516t = dateProvider;
        this.u = codeUsageObservable;
        this.v = newContactNavigationProvider;
        this.f155517w = recipientListNavigationProvider;
        this.f155518x = apmContactsInteractor;
        this.f155519y = blikDestinationProvider;
        this.z = apmAreaProvider;
        this.A = apmFeatureChecker;
        this.B = userInteractor;
        this.C = shotDialogDisplayer;
        this.D = aliasDialogMapper;
        this.E = sendFromClipboardExtension;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, false, 7, null);
        m70.a.c(t0.f186434a);
        this.F = new o(data, data3, data2, false, false, false, false, null, "");
    }

    public static void y2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "BlikArea: handling not supported: "));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void A2(a aVar) {
        int i = w.f155542a[aVar.ordinal()];
        if (i == 1) {
            E2(new t(this, 1));
            return;
        }
        if (i == 2) {
            E2(new t(this, 2));
        } else if (i == 3) {
            E2(new t(this, 3));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
    }

    public final void B2(Object obj2) {
        if (obj2 instanceof a) {
            A2((a) obj2);
        } else if (obj2 instanceof ty9.a) {
            this.E.Z2();
        } else {
            E2(new hl6.b(this, obj2, 18));
        }
    }

    public final void C2(h12.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof h12.d) {
            C1(((h12.d) event).f148447a);
            return;
        }
        if (event instanceof h12.c) {
            B2(((h12.c) event).f148446a);
            return;
        }
        if (event instanceof h12.b) {
            A2(a.AddContact);
            return;
        }
        if (event instanceof h12.e) {
            C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmBlik.f79987a, 29));
        } else {
            if (!(event instanceof h12.f)) {
                throw new NoWhenBranchMatchedException();
            }
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {new f7(tof.l.BLIK_P2P), new h7(tof.n.BLIK), new sa(v5.BLIK_P2P)};
            cVar.getClass();
            C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7.c.b(i7VarArr), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
        }
    }

    public final void D2(long j2) {
        a2 a2Var = this.G;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.G = yji.l.b1(this, vkm.q.q(zi0.c.M(mo3.a.g(rd0.e.b(jpf.a.v(((eu1.h) this.f155513q).f129469a.f308744c, Unit.f186387a, 3L, w4l.h.f294642c)), null, null, 3), Boolean.FALSE, kotlin.time.c.h(Math.max(j2 - z2(), 0L) + 30000, pkm.e.MILLISECONDS), null)), null, new a2g.q(this, (Continuation) null, 27), 3);
    }

    public final void E2(Function0 function0) {
        l2(new hg0.n(this, function0, null, 25), new yi5.b(26));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new y(this, continuation, 0), new yi5.b(26));
        yji.l.a1(this, rd0.e.b(this.u.f255130a), null, null, new y(this, continuation, 1), 3);
        l2(new a0(this, continuation, 1), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new u(this, 0));
        BlikCode blikCode = (BlikCode) ((o) t2()).f155532a.getContent();
        D2(blikCode != null ? blikCode.d : 0L);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Integer numM = n14.e.m(throwable);
        if (numM != null && numM.intValue() == 422) {
            x2(new hqk.a(24));
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.F;
    }

    public final long z2() {
        return this.f155516t.a().toEpochMilli();
    }
}
