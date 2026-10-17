package g5k;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.retail.feature.payments.bank_transfer.api.PaymentsBankTransferApi$FeatureToggles;
import com.revolut.retail.feature.payments.bank_transfer.api.widgets.p2p_international.P2PInternationalWidgetContext;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f140802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw9.d f140803c;
    public final fkg.a d;

    public c(gte.a featureToggleInteractor, cw9.d paymentsProductFeatureChecker, fkg.a p2pInternationalWidgetInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(p2pInternationalWidgetInteractor, "p2pInternationalWidgetInteractor");
        this.f140802b = featureToggleInteractor;
        this.f140803c = paymentsProductFeatureChecker;
        this.d = p2pInternationalWidgetInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(this.f140803c.g(), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new QuickActionWidgetLoadingDelegate.Model(id10);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.valueOf(((jte.d) this.f140802b).c(PaymentsBankTransferApi$FeatureToggles.RemittanceFlagWidget.f101897c));
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new WidgetNotAvailableException("P2PInternationalWidget isn't available in widget catalogue", 2);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        P2PInternationalWidgetContext widgetContext2 = (P2PInternationalWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new b(config, this, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((P2PInternationalWidgetContext) widgetContext, str, eVar);
        return null;
    }
}
