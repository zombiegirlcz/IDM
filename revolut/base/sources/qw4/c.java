package qw4;

import al4.n;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import om4.x2;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f249765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f249766c;

    public c(n creditCardInteractor, e creditCardCashbackWidgetMapper, f creditCardCashbackWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetMapper, "creditCardCashbackWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardCashbackWidgetVisibilityProvider, "creditCardCashbackWidgetVisibilityProvider");
        this.f249765b = creditCardInteractor;
        this.f249766c = creditCardCashbackWidgetVisibilityProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new AvatarWidgetLoadingDelegate.Model(widgetId, null, null);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f249766c.f249769a.b(((CreditCardWidgetContext) widgetContext).getCreditCardFacilityId(), yw4.f.CASHBACK, eVar);
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
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CreditCardWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str, CreditCardWidgetContext creditCardWidgetContext) {
        return rd0.e.e(new x(mo3.a.g(((x2) this.f249765b).e(creditCardWidgetContext.getCreditCardFacilityId()), null, new qsk.d(13), 1), this, str, 16), h0.f322473a, new q7b.j((Object) new b(this, str, null), (Continuation) null, 22));
    }
}
