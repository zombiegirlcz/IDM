package ww4;

import al4.n;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f300604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f300605c;

    public f(n creditCardInteractor, CreditCardStatementWidgetMapper creditCardStatementWidgetMapper, j creditCardStatementWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardStatementWidgetMapper, "creditCardStatementWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardStatementWidgetVisibilityProvider, "creditCardStatementWidgetVisibilityProvider");
        this.f300604b = creditCardInteractor;
        this.f300605c = creditCardStatementWidgetVisibilityProvider;
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
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return CreditCardStatementWidgetMapper.b(id10);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f300605c.a(((CreditCardWidgetContext) widgetContext).getCreditCardFacilityId(), eVar);
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
        vkm.d dVarT = ((x2) this.f300604b).t(creditCardWidgetContext.getCreditCardFacilityId(), w4l.h.f294642c);
        h0 h0Var = h0.f322473a;
        return rd0.e.e(new wc7.e(rd0.e.n(dVarT, h0Var), 5, this, str), h0Var, new w2a.q((Object) new e(this, str, null), (Continuation) null, 23));
    }
}
