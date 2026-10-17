package qxj;

import b9d.k;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import f28.b0;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import w4l.h;
import w4l.i;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements mxj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq.a f250098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kgm.c f250099c;
    public final hj8.a d;

    public b(rxj.b juniorAppAccessWidgetMapper, zq.a juniorRemoteLoginInteractor, kgm.c juniorDeviceInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(juniorAppAccessWidgetMapper, "juniorAppAccessWidgetMapper");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        Intrinsics.checkNotNullParameter(juniorDeviceInteractor, "juniorDeviceInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f250098b = juniorRemoteLoginInteractor;
        this.f250099c = juniorDeviceInteractor;
        this.d = juniorProfileInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "JuniorAppAccess")) {
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

    public final jhi.b i(String str, String str2) {
        zq.a aVar = this.f250098b;
        i iVar = i.f294643c;
        return mo3.a.f(u0.i(aVar.u(str2, iVar), this.f250099c.d(str2, iVar), hj8.a.a(this.d, str2, h.f294642c)), new b0(this, str, 17), new k(10, str, this), new qsk.d(24));
    }
}
