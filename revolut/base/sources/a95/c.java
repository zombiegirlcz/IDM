package a95;

import a0e.m;
import a31.g;
import a5g.l;
import c55.o0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.widget.LoanWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.y;
import w4l.h;
import y45.i;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2333b;

    public c(i loanProductInteractor, o0 loanWidgetMapper) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanWidgetMapper, "loanWidgetMapper");
        this.f2333b = loanProductInteractor;
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
        return new GoalProgressLoadingWidgetDelegate.Model(widgetId, new TextLocalisedClause(R$string.loan_management_widget_progress_title, null, null, 14), null, 28);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(i(str, (LoanWidgetContext) widgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        LoanWidgetContext widgetContext2 = (LoanWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10, widgetContext2);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((LoanWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str, LoanWidgetContext loanWidgetContext) {
        r map = m70.a.g(this.f2333b.b(loanWidgetContext.getLoanId(), h.f294642c), null, new l(29), 1).map(new a6b.a(new g(11, str, this), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.e(rd0.e.b(map), h0.f322473a, new m((Object) new b(this, str, null), (Continuation) null, 10));
    }
}
