package jkb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import ish.f;
import java.util.concurrent.CopyOnWriteArrayList;
import jfb.v0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rpb.a0;
import rpb.r;
import rpb.u;
import vkm.q;
import vkm.y;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.c f175142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f175143c;

    public b(rpb.c savingsWidgetsInteractor, rpb.b commonMapper, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsWidgetsInteractor, "savingsWidgetsInteractor");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f175142b = savingsWidgetsInteractor;
        this.f175143c = savingsWidgetsVisibilityInteractor;
    }

    public static void j(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.r(str, " is not eligible for SavingsChallengeGoalWidget"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        throw illegalStateException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "SavingsChallengeGoal")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "SavingsChallengeGoal")) {
            return Boolean.TRUE;
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "SavingsChallengeGoal")) {
            return new GoalProgressLoadingTileWidgetDelegate.Model(new TextLocalisedClause(R$string.savings_challenge_widget_goal_title, null, null, 14), id10);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (!Intrinsics.f(str, "SavingsChallengeGoal")) {
            return Boolean.FALSE;
        }
        return this.f175143c.d(str, savings.getType().getF74700a(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "SavingsChallengeGoal")) {
            return q.x(i(str, savings), fVar);
        }
        j(str2);
        throw null;
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "SavingsChallengeGoal")) {
            return i(id10, widgetContext2);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Savings) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str, HomeFeedWidgetContext.Savings savings) {
        HomeFeedWidgetContext.Savings.Type type = savings.getType();
        u uVar = (u) this.f175142b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return rd0.e.e(mo3.a.g(nim.a.v(boh.f.e(uVar.f256344c.c(type.getF74700a(), h.f294642c), new r(uVar, 3)), new jb8.a(6, str, this)), null, new v0(19), 1), h0.f322473a, new a(this, str, null));
    }
}
