package tpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
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
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.c f273327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f273328c;

    public c(rpb.c savingsWidgetsInteractor, rpb.b commonMapper, g mapper, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsWidgetsInteractor, "savingsWidgetsInteractor");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f273327b = savingsWidgetsInteractor;
        this.f273328c = savingsWidgetsVisibilityInteractor;
    }

    public static void j(String str) {
        WidgetNotAvailableException widgetNotAvailableException = new WidgetNotAvailableException(a0.d.r(str, " is not eligible for Savings cashflow"), 2);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, widgetNotAvailableException, h0Var);
        throw widgetNotAvailableException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "SavingsCashflowSmall")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "SavingsCashflowSmall")) {
            return Boolean.TRUE;
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "SavingsCashflowSmall")) {
            Intrinsics.checkNotNullParameter(id10, "id");
            return new TileLoadingWidgetDelegate.Model(6, (Clause) null, id10);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f273328c.d(str, ((HomeFeedWidgetContext.Savings) widgetContext).getType().getF74700a(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        HomeFeedWidgetContext.Savings savings = (HomeFeedWidgetContext.Savings) widgetContext;
        if (Intrinsics.f(str2, "SavingsCashflowSmall")) {
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
        if (Intrinsics.f(widgetType, "SavingsCashflowSmall")) {
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
        Flow flowD;
        HomeFeedWidgetContext.Savings.Type type = savings.getType();
        u uVar = (u) this.f273327b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof HomeFeedWidgetContext.Savings.Type.Personal) {
            String str2 = ((HomeFeedWidgetContext.Savings.Type.Personal) type).f74697a;
            nib.c.Companion.getClass();
            flowD = uVar.d(str2, nib.b.f215667b, j.d.f234867a);
        } else if (type instanceof HomeFeedWidgetContext.Savings.Type.Joint) {
            String str3 = ((HomeFeedWidgetContext.Savings.Type.Joint) type).f74696a;
            nib.c.Companion.getClass();
            flowD = uVar.d(str3, nib.b.f215668c, j.c.f234866a);
        } else if (type instanceof HomeFeedWidgetContext.Savings.Type.Youth) {
            HomeFeedWidgetContext.Savings.Type.Youth youth = (HomeFeedWidgetContext.Savings.Type.Youth) type;
            flowD = uVar.d(youth.f74700a, "NOT_SUPPORTED_FOR_JUNIOR", new l(youth.f74701b));
        } else {
            if (!(type instanceof HomeFeedWidgetContext.Savings.Type.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            HomeFeedWidgetContext.Savings.Type.Teen teen = (HomeFeedWidgetContext.Savings.Type.Teen) type;
            String str4 = teen.f74698a;
            String str5 = teen.f74699b;
            flowD = uVar.d(str4, gjb.b.a(str5), new k(str5));
        }
        return rd0.e.e(mo3.a.g(nim.a.v(flowD, new te8.a(this, str)), null, new tj9.d(22), 1), h0.f322473a, new b(this, str, null));
    }
}
