package jsl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends oki.h implements c0 {

    @NotNull
    public static final q0 Companion = new q0();
    public final bul.o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dtl.b f178239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f178240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i7d.o f178241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f178242s;

    public u0(InvestOrderDetailsContract$InputData inputData, d0 stateMapper, bul.o activeInvestOrderControllerModelExtensionProvider, dtl.b investOrderCancellationControllerModelExtension, j60.a bottomExpandableDialogControllerExtension, i7d.o helpWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(activeInvestOrderControllerModelExtensionProvider, "activeInvestOrderControllerModelExtensionProvider");
        Intrinsics.checkNotNullParameter(investOrderCancellationControllerModelExtension, "investOrderCancellationControllerModelExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        this.o = activeInvestOrderControllerModelExtensionProvider;
        this.f178239p = investOrderCancellationControllerModelExtension;
        this.f178240q = bottomExpandableDialogControllerExtension;
        this.f178241r = helpWidgetControllerModelExtension;
        this.f178242s = te0.w.y0(new jnf.a(this, stateMapper, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new s0(this, null, 0), new jlh.g(this, 17));
        yji.l.a1(this, ((dtl.m) this.f178239p).f117483n, null, null, new jkc.g(this, continuation, 14), 3);
        yji.l.a1(this, this.f178241r.Z2(new i7d.j("invest-order-details", new TextLocalisedClause(R.string.contact_us, null, null, 14), i7d.d.f159267a)), null, null, new r0(this, continuation, 1), 3);
    }

    public final void I2(p0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, k0.f178220a)) {
            B2();
            return;
        }
        Continuation continuation = null;
        if (event instanceof l0) {
            InvestOrder investOrder = ((l0) event).f178222a;
            dtl.c displayOptions = new dtl.c(true);
            dtl.m mVar = (dtl.m) this.f178239p;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(investOrder, "investOrder");
            Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
            mVar.T2(new dce.s0(mVar, investOrder, displayOptions, continuation, 22), new dtl.h(mVar, investOrder, 0));
            return;
        }
        if (event instanceof m0) {
            j60.a.v(this.f178240q, false, null, 3);
        } else if (event instanceof n0) {
            C1(zh9.u0.c(new FaqFeatureConfig.Starter(((n0) event).f178226a, 2)));
        } else {
            if (!(event instanceof o0)) {
                throw new NoWhenBranchMatchedException();
            }
            A1(new t0(this, event, continuation, 0), new yi5.b(25));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f178242s.getValue();
    }
}
