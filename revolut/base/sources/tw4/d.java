package tw4;

import au.c0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f274905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bm4.b f274906c;
    public final j d;

    public d(g creditCardInstalmentWidgetMapper, a creditCardInstalmentWidgetAvailabilityProvider, bm4.b creditCardInstalmentWidgetUiInteractor, j creditCardInstalmentWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetMapper, "creditCardInstalmentWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetAvailabilityProvider, "creditCardInstalmentWidgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetUiInteractor, "creditCardInstalmentWidgetUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetVisibilityProvider, "creditCardInstalmentWidgetVisibilityProvider");
        this.f274905b = creditCardInstalmentWidgetAvailabilityProvider;
        this.f274906c = creditCardInstalmentWidgetUiInteractor;
        this.d = creditCardInstalmentWidgetVisibilityProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        this.f274905b.getClass();
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new TileLoadingWidgetDelegate.Model(4, new TextLocalisedClause(R$string.credit_card_instalment_widget_title, null, null, 14), widgetId);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.d.b(((CreditCardWidgetContext) widgetContext).getCreditCardFacilityId(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(i(str, (CreditCardWidgetContext) widgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10, widgetContext2);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CreditCardWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str, CreditCardWidgetContext creditCardWidgetContext) {
        String facilityId = creditCardWidgetContext.getCreditCardFacilityId();
        ht4.c cVar = (ht4.c) this.f274906c;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Continuation continuation = null;
        return rd0.e.e(new t38.e(mo3.a.g(q.q(xam.a.h(new c0(continuation, cVar, facilityId, 9), cVar.e.c(facilityId, yw4.f.INSTALMENT_PLAN_VIEW, w4l.h.f294642c))), null, new tq0.j(26), 1), 9, this, str), h0.f322473a, new tik.b((Object) new c(this, str, null), continuation, 11));
    }
}
