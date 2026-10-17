package ku1;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.confirmation.InvalidPendingTransactionState;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kkf.x5;
import kkf.z7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 extends jki.g implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f189599y = zhm.v.k(34201, 34208, 34209, 34210, 34211, 1006);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlikConfirmationScreenContract$InputData f189600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eu1.a f189601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w39.b f189602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.n f189603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final du1.b f189604t;
    public final d u;
    public final a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l80.e f189605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f189606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(jki.p stateMapper, BlikConfirmationScreenContract$InputData inputData, eu1.a blikInteractor, w39.b locationInteractor, wsg.n walletInteractor, du1.b blikErrorProvider, d confirmationObserver, a balancesFilterInteractor, l80.e dateProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(blikErrorProvider, "blikErrorProvider");
        Intrinsics.checkNotNullParameter(confirmationObserver, "confirmationObserver");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f189600p = inputData;
        this.f189601q = blikInteractor;
        this.f189602r = locationInteractor;
        this.f189603s = walletInteractor;
        this.f189604t = blikErrorProvider;
        this.u = confirmationObserver;
        this.v = balancesFilterInteractor;
        this.f189605w = dateProvider;
        this.f189606x = new h(null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null);
    }

    public static final c02.j y2(e0 e0Var) {
        c02.j jVar = ((h) e0Var.t2()).f189608a;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void I1() {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.b(rd0.c.INFO, "APM-BLIK", j6.a.q("Blik Confirmation Screen: create: ", this.f189600p.f61670a), null, null, 16);
        ((b) this.u).D(Boolean.TRUE);
        l2(new u(this, continuation, 2), new yi5.b(26));
        yji.l.a1(this, new z7(vkm.q.q(new x5(q2(), 17)), this, 12), null, null, new z(this, continuation, 0), 3);
        int i = 3;
        l2(new u(this, continuation, i), new yi5.b(26));
        yji.l.a1(this, vkm.q.q(vkm.q.Q(vkm.q.q(q2()), new bwb.k(i, 9, continuation))), null, null, new z(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void K1() {
        ((b) this.u).D(Boolean.FALSE);
    }

    @Override // yji.l
    public final void T1(long j2) {
        c02.j jVar = ((h) t2()).f189608a;
        Continuation continuation = null;
        Long lValueOf = jVar != null ? Long.valueOf(jVar.f20118h) : null;
        ((l80.f) this.f189605w).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lValueOf == null || jCurrentTimeMillis <= lValueOf.longValue()) {
            return;
        }
        l2(new u(this, continuation, 1), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) throws IOException {
        ServerError serverErrorC;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean z = throwable instanceof HttpException;
        du1.b bVar = this.f189604t;
        Continuation continuation = null;
        if (z) {
            HttpException exception = (HttpException) throwable;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(exception, "exception");
            serverErrorC = bVar.f117532a.c(exception);
        } else {
            serverErrorC = throwable instanceof ServerErrorException ? ((ServerErrorException) throwable).f : null;
        }
        if (throwable instanceof UserFailedSsoException) {
            l2(new u(this, continuation, 0), new yi5.b(26));
            return true;
        }
        if (serverErrorC != null && serverErrorC.f51362a == 34201) {
            z2();
            return true;
        }
        if (throwable instanceof InvalidPendingTransactionState) {
            yji.l.a1(this, X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_not_available, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new s(this, null, 0), 3);
        } else if (serverErrorC != null) {
            yji.l.b1(this, X1(new y0(null, bVar.a(serverErrorC, ((h) t2()).f189608a), false, 5)), null, new d0(this, serverErrorC, null), 3);
            return true;
        }
        super.o1(throwable);
        return false;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f189606x;
    }

    public final void z2() {
        s1();
        yji.l.a1(this, X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_timeout, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new s(this, null, 1), 3);
    }
}
