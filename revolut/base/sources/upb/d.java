package upb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import pcd.k;
import pcd.l;
import rpb.a0;
import rpb.u;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.c f281944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f281945c;

    public d(rpb.c savingsWidgetsInteractor, rpb.b commonMapper, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsWidgetsInteractor, "savingsWidgetsInteractor");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f281944b = savingsWidgetsInteractor;
        this.f281945c = savingsWidgetsVisibilityInteractor;
    }

    public static void j(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.r(str, " is not eligible for TotalSavingsWidget"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        throw illegalStateException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "EarnedInterestSmall")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "EarnedInterestSmall")) {
            return Boolean.TRUE;
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "EarnedInterestSmall")) {
            return new TileLoadingWidgetDelegate.Model(6, (Clause) null, id10);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f281945c.d(str, ((HomeFeedWidgetContext.Savings) widgetContext).getType().getF74700a(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "EarnedInterestSmall")) {
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
        if (Intrinsics.f(widgetType, "EarnedInterestSmall")) {
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
        Flow flowA;
        HomeFeedWidgetContext.Savings.Type type = savings.getType();
        u uVar = (u) this.f281944b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof HomeFeedWidgetContext.Savings.Type.Personal) {
            String str2 = ((HomeFeedWidgetContext.Savings.Type.Personal) type).f74697a;
            nib.c.Companion.getClass();
            flowA = uVar.a(str2, nib.b.f215667b, j.d.f234867a);
        } else if (type instanceof HomeFeedWidgetContext.Savings.Type.Joint) {
            String str3 = ((HomeFeedWidgetContext.Savings.Type.Joint) type).f74696a;
            nib.c.Companion.getClass();
            flowA = uVar.a(str3, nib.b.f215668c, j.c.f234866a);
        } else if (type instanceof HomeFeedWidgetContext.Savings.Type.Youth) {
            HomeFeedWidgetContext.Savings.Type.Youth youth = (HomeFeedWidgetContext.Savings.Type.Youth) type;
            String str4 = youth.f74700a;
            String str5 = youth.f74701b;
            nib.c.Companion.getClass();
            flowA = uVar.a(str4, nib.b.f215667b, new l(str5));
        } else {
            if (!(type instanceof HomeFeedWidgetContext.Savings.Type.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            HomeFeedWidgetContext.Savings.Type.Teen teen = (HomeFeedWidgetContext.Savings.Type.Teen) type;
            String str6 = teen.f74698a;
            String str7 = teen.f74699b;
            flowA = uVar.a(str6, gjb.b.a(str7), new k(str7));
        }
        return rd0.e.e(mo3.a.g(nim.a.v(flowA, new uo7.k(this, str)), null, new up5.k(7), 1), h0.f322473a, new c(this, str, null));
    }
}
