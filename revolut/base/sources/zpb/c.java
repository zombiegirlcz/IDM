package zpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import djb.k;
import djb.l;
import djb.m;
import dsh.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rp0.n0;
import rpb.a0;
import rpb.u;
import vkm.q;
import vkm.y;
import zh9.u0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.c f324222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f324223c;

    public c(rpb.c savingsWidgetsInteractor, rpb.b commonMapper, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsWidgetsInteractor, "savingsWidgetsInteractor");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f324222b = savingsWidgetsInteractor;
        this.f324223c = savingsWidgetsVisibilityInteractor;
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
        if (Intrinsics.f(str, "TotalSavingsSmall")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "TotalSavingsSmall")) {
            return Boolean.TRUE;
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "TotalSavingsSmall")) {
            return new TileLoadingWidgetDelegate.Model(6, (Clause) null, id10);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f324223c.d(str, ((HomeFeedWidgetContext.Savings) widgetContext).getType().getF74700a(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "TotalSavingsSmall")) {
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
        if (Intrinsics.f(widgetType, "TotalSavingsSmall")) {
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
        Flow flowV;
        HomeFeedWidgetContext.Savings.Type type = savings.getType();
        u uVar = (u) this.f324222b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        cxe.u uVarA = uVar.f256343b.a(w4l.j.f294644c);
        if ((type instanceof HomeFeedWidgetContext.Savings.Type.Personal) || (type instanceof HomeFeedWidgetContext.Savings.Type.Joint)) {
            List listK = v.k(k.b.f115282a, k.a.f115281a);
            ArrayList arrayList = new ArrayList(w.t(listK, 10));
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                arrayList.add(uVar.b((k) it8.next()));
            }
            flowV = nim.a.v(u0.k(arrayList), new n0(16));
        } else if (type instanceof HomeFeedWidgetContext.Savings.Type.Youth) {
            flowV = uVar.b(new m(((HomeFeedWidgetContext.Savings.Type.Youth) type).f74701b));
        } else {
            if (!(type instanceof HomeFeedWidgetContext.Savings.Type.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = uVar.b(new l(((HomeFeedWidgetContext.Savings.Type.Teen) type).f74699b));
        }
        t38.e eVarM = u0.m(uVarA, flowV);
        int i = 19;
        return rd0.e.e(mo3.a.g(nim.a.v(nim.a.v(eVarM, new n0(i)), new yui.v(this, str, 23)), null, new znc.j(i), 1), h0.f322473a, new b(this, str, null));
    }
}
