package o88;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kp0.m;
import n78.e;
import njj.c1;
import te8.z;
import vkm.q;
import w4l.i;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements z68.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f222958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p88.a f222959c;

    public b(e juniorDashboardSectionChallengeInteractor, p88.a juniorChallengesWidgetMapper) {
        Intrinsics.checkNotNullParameter(juniorDashboardSectionChallengeInteractor, "juniorDashboardSectionChallengeInteractor");
        Intrinsics.checkNotNullParameter(juniorChallengesWidgetMapper, "juniorChallengesWidgetMapper");
        this.f222958b = juniorDashboardSectionChallengeInteractor;
        this.f222959c = juniorChallengesWidgetMapper;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ChallengesSmall")) {
            throw new IllegalStateException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ((p88.b) this.f222959c).getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new AvatarWidgetLoadingDelegate.Model(listId, null, null);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return q.x(i(str, ((HomeFeedWidgetContext.Junior) widgetContext).getJuniorId()), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10, widgetContext2.getJuniorId());
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Junior) widgetContext, str, eVar);
        return null;
    }

    public final jhi.b i(String str, String juniorId) {
        e eVar = this.f222958b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return mo3.a.f(nim.a.v(u0.i(rd0.e.b(eVar.f213043a.a(juniorId, true)), rd0.e.b(z.b(eVar.f213044b, juniorId, true, 4)), eVar.f213045c.c(juniorId, i.f294643c)), new n5k.c(15)), new m(this, str, 18), new c1(this, str, 13), new o4a.a(17));
    }
}
