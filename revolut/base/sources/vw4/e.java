package vw4;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vdl.c1;
import vkm.q;
import vkm.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wu4.a f292629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f292630c;
    public final b d;
    public final Context e;

    public e(wu4.a creditCardRevPointsWidgetInteractor, i creditCardRevPointsWidgetMapper, m creditCardRevPointsWidgetVisibilityProvider, b creditCardRevPointsWidgetAvailabilityProvider, Context context) {
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetInteractor, "creditCardRevPointsWidgetInteractor");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetMapper, "creditCardRevPointsWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetVisibilityProvider, "creditCardRevPointsWidgetVisibilityProvider");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetAvailabilityProvider, "creditCardRevPointsWidgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f292629b = creditCardRevPointsWidgetInteractor;
        this.f292630c = creditCardRevPointsWidgetVisibilityProvider;
        this.d = creditCardRevPointsWidgetAvailabilityProvider;
        this.e = context;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.d.a((gim.c) continuation);
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
        return this.f292630c.b(((CreditCardWidgetContext) widgetContext).getCreditCardFacilityId(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(i(str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CreditCardWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str) {
        wu4.a aVar = this.f292629b;
        Flow flowQ = q.q(boh.f.e(u0.m(rd0.e.b(aVar.f300065b.c(false)), rd0.e.b(aVar.f300064a.q())), new wpj.b(aVar, 17)));
        h0 h0Var = h0.f322473a;
        return rd0.e.e(new t38.e(mo3.a.g(rd0.e.n(flowQ, h0Var), null, new vv7.l(5), 1), 26, this, str), h0Var, new c1((Function3) new d(this, str, null), (Continuation) null, 25));
    }
}
