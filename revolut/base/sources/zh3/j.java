package zh3;

import com.google.firebase.messaging.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import di3.w;
import efm.d0;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements mm.b, g3l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di3.k f322229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f322230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3l.a f322231c;
    public final ln.a d;
    public final rh3.d e;
    public final ym.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AnalyticsProduct f322232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm.g f322233h;

    public j(di3.k createCheckoutHandler, w preorderResultHandler, g3l.a statusDialogViewConfigurationDispatcher, ln.a navigationCommandsDispatcher, rh3.d checkoutDelegateState, ym.d loadingDispatcher, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(createCheckoutHandler, "createCheckoutHandler");
        Intrinsics.checkNotNullParameter(preorderResultHandler, "preorderResultHandler");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(checkoutDelegateState, "checkoutDelegateState");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f322229a = createCheckoutHandler;
        this.f322230b = preorderResultHandler;
        this.f322231c = statusDialogViewConfigurationDispatcher;
        this.d = navigationCommandsDispatcher;
        this.e = checkoutDelegateState;
        this.f = loadingDispatcher;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137496c;
        this.f322232g = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.f322233h = actionDelegateFactory.f(new h(this, 1));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        rh3.a action = (rh3.a) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        this.f322232g = action.f254303b;
        return this.f322233h.a(action);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return te0.w.o0(p0.f264003c, new zah.f(this, result, null, 9));
    }
}
