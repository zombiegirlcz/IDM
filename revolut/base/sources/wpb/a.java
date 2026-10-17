package wpb;

import a0.d;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import csh.e;
import dsh.j;
import ish.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.c;
import rnb.w;
import rpb.a0;
import vkm.q;
import wm9.k;
import wp5.v;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f299214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f299215c;
    public final a0 d;

    public a(w savingsVaultInteractor, l80.e dateProvider, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f299214b = savingsVaultInteractor;
        this.f299215c = dateProvider;
        this.d = savingsWidgetsVisibilityInteractor;
    }

    public static void i(String str) {
        WidgetNotAvailableException widgetNotAvailableException = new WidgetNotAvailableException(d.r(str, " is not eligible for SavingsFixedTermAccountProgressWidget"), 2);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, widgetNotAvailableException, h0Var);
        throw widgetNotAvailableException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "SavingsFixedTermAccountProgressWidget")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "SavingsFixedTermAccountProgressWidget")) {
            return Boolean.TRUE;
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "SavingsFixedTermAccountProgressWidget")) {
            return new GoalProgressLoadingTileWidgetDelegate.Model(new TextLocalisedClause(R$string.savings_home_widget_fixed_term_goal_title, null, null, 14), id10);
        }
        i(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str, "SavingsFixedTermAccountProgressWidget")) {
            return this.d.d(str, savings.getType().getF74700a(), eVar);
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "SavingsFixedTermAccountProgressWidget")) {
            return q.x(mo3.a.g(nim.a.v(this.f299214b.b(savings.getType().getF74700a()), new v(this, str, 7)), null, new k(17), 1), fVar);
        }
        i(str2);
        throw null;
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "SavingsFixedTermAccountProgressWidget")) {
            return mo3.a.g(nim.a.v(this.f299214b.b(widgetContext2.getType().getF74700a()), new v(this, id10, 7)), null, new k(17), 1);
        }
        i(widgetType);
        throw null;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Savings) widgetContext, str, eVar);
        return null;
    }
}
