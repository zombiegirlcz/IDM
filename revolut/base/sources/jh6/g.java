package jh6;

import ald.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.destinations.MandateResult;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import ix6.l0;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oe6.j;
import xg6.x;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MandateResultScreenContract$InputData f174147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f174148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f174149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f174150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f174151t;
    public final c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MandateResultScreenContract$InputData inputData, x mandateInteractor, j mandateAnalyticsInteractor, a dialogProvider, wj0.a idempotencyKeyHolder) {
        super(new e());
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(mandateAnalyticsInteractor, "mandateAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f174147p = inputData;
        this.f174148q = mandateInteractor;
        this.f174149r = mandateAnalyticsInteractor;
        this.f174150s = dialogProvider;
        this.f174151t = idempotencyKeyHolder;
        this.u = new c(false);
    }

    @Override // yji.l
    public final void I1() {
        this.f174151t.a("TOPUP_IDEMPOTENCY_TAG");
    }

    @Override // yji.l
    public final void T1(long j2) {
        MandateResult mandateResult = this.f174147p.f72464a;
        boolean z = mandateResult.f72364a;
        String str = mandateResult.f72365b;
        dj0.d dVar = mandateResult.f72366c;
        boolean z3 = mandateResult.d;
        if (!z) {
            z2();
            return;
        }
        Continuation continuation = null;
        if (dVar == null) {
            n2(new m(this, str, z3, continuation, 25), new whi.b(6));
        } else if (((c) t2()).f174146a) {
            y2();
        } else {
            n2(new l0(this, str, dVar, continuation, 15), new jeg.g(this, 12));
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        return true;
    }

    @Override // jki.g
    public final i r2() {
        return this.u;
    }

    public final void y2() {
        C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
    }

    public final void z2() {
        ((b) this.f174150s).getClass();
        l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, new f(this, null, 0), 3);
    }
}
