package m7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import hy1.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m56.g;
import w4l.h;
import ypg.p;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f203400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f203401c;

    public b(ppg.b vaultsInteractor, ang.f userInteractor, d groupPocketMembersWidgetMapper) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(groupPocketMembersWidgetMapper, "groupPocketMembersWidgetMapper");
        this.f203400b = vaultsInteractor;
        this.f203401c = userInteractor;
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
        Intrinsics.checkNotNullParameter(id10, "id");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.moneyboxes_details_shared_vault_members, null, null, 14), 1, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new IllegalStateException(a0.d.r(str2, " doesn't support the catalogue preview mode"));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.GroupPocket widgetContext2 = (HomeFeedWidgetContext.GroupPocket) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new b0(mo3.a.g(u0.m(rd0.e.b(((p) this.f203400b).j(widgetContext2.getSubaccountId(), h.f294642c)), rd0.e.b(this.f203401c.k(false))), null, new g(12), 1), this, id10, 24);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.GroupPocket) widgetContext, str, eVar);
        return null;
    }
}
