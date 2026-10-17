package m88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import f28.b0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yhm.j;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements x68.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f203451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n78.a f203452c;
    public final Function1[] d;
    public final Lazy e;

    public f(b allowanceInfoMapper, n78.a juniorDashboardSectionAllowanceInteractor) {
        Intrinsics.checkNotNullParameter(allowanceInfoMapper, "allowanceInfoMapper");
        Intrinsics.checkNotNullParameter(juniorDashboardSectionAllowanceInteractor, "juniorDashboardSectionAllowanceInteractor");
        this.f203451b = allowanceInfoMapper;
        this.f203452c = juniorDashboardSectionAllowanceInteractor;
        this.d = new Function1[]{new e(1, 0, f.class, this, "allowanceItem", "allowanceItem(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;")};
        this.e = j.b(new m3g.c(12));
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
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, (Clause) this.e.getValue(), this.d.length, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        HomeFeedWidgetContext.Junior junior = (HomeFeedWidgetContext.Junior) widgetContext;
        if (eVar == null) {
            dsh.e.Companion.getClass();
            eVar = dsh.d.a();
        }
        return q.x(g(junior, str, str2, eVar), fVar);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Junior) widgetContext, str, eVar);
        return null;
    }

    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Flow g(HomeFeedWidgetContext.Junior widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Function1[] function1Arr = this.d;
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1 function1 : function1Arr) {
            arrayList.add((Flow) function1.invoke(widgetContext.getJuniorId()));
        }
        return mo3.a.f(u0.k(arrayList), new b0(this, id10, 8), new c(this, id10, 0), new m56.g(14));
    }
}
