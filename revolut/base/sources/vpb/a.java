package vpb;

import a0.d;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
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
import vb2.r;
import vkm.q;
import vo8.t;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f291144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f291145c;

    public a(w savingsVaultInteractor, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f291144b = savingsVaultInteractor;
        this.f291145c = savingsWidgetsVisibilityInteractor;
    }

    public static void i(String str) {
        WidgetNotAvailableException widgetNotAvailableException = new WidgetNotAvailableException(d.r(str, " is not eligible for SavingsFixedTermAccountInterestEarnedWidget"), 2);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, widgetNotAvailableException, h0Var);
        throw widgetNotAvailableException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "SavingsFixedTermAccountInterestEarnedWidget")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "SavingsFixedTermAccountInterestEarnedWidget")) {
            return Boolean.TRUE;
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "SavingsFixedTermAccountInterestEarnedWidget")) {
            return new TileLoadingWidgetDelegate.Model(6, (Clause) null, id10);
        }
        i(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str, "SavingsFixedTermAccountInterestEarnedWidget")) {
            return this.f291145c.d(str, savings.getType().getF74700a(), eVar);
        }
        i(str);
        throw null;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "SavingsFixedTermAccountInterestEarnedWidget")) {
            return q.x(mo3.a.g(nim.a.v(this.f291144b.b(savings.getType().getF74700a()), new r(this, str)), null, new t(7), 1), fVar);
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
        if (Intrinsics.f(widgetType, "SavingsFixedTermAccountInterestEarnedWidget")) {
            return mo3.a.g(nim.a.v(this.f291144b.b(widgetContext2.getType().getF74700a()), new r(this, id10)), null, new t(7), 1);
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
