package kuj;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SmallCardGridWidgetDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHubWidget;
import com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext;
import dsh.j;
import hy1.b0;
import ip0.nf0;
import ip0.of0;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;
import op0.q;
import stj.h;
import vkm.v1;
import vkm.y;
import w4l.i;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f189837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f189838c;

    public e(h rewardsHubInteractor, gte.a featureToggleInteractor, g mapper) {
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f189837b = rewardsHubInteractor;
        this.f189838c = featureToggleInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((jte.d) this.f189838c).c(RewardsHubApi$Toggles$RewardsHubWidget.f99249c));
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        SmallCardGridWidgetDelegate.Model.Companion companion = SmallCardGridWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause title = new TextLocalisedClause(R$string.rewards_hub_widget_title, null, null, 14);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        q qVar = q.MEDIUM;
        CompositeClause compositeClauseA = yh5.b.a(title);
        IntRange intRange = new IntRange(0, 1, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            nf0 nf0Var = new nf0(String.valueOf(it8.nextInt()), of0.PURPLE);
            yp0.b.l(nf0Var, 0, 0, 0, 0, qv0.h.LARGE, false, 47);
            arrayList.add(nf0Var);
        }
        return new SmallCardGridWidgetDelegate.Model(listId, qVar, compositeClauseA, arrayList, true);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.valueOf(((jte.d) this.f189838c).c(RewardsHubApi$Toggles$RewardsHub.f99247c));
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return vkm.q.x(i((RewardsHubWidgetContext) widgetContext, str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        RewardsHubWidgetContext widgetContext2 = (RewardsHubWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new d(this, widgetType, widgetContext2, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((RewardsHubWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(RewardsHubWidgetContext rewardsHubWidgetContext, String str) {
        String screen = rewardsHubWidgetContext.getScreen();
        h hVar = this.f189837b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        mtj.q qVar = (mtj.q) hVar.f265610a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.e(new b0(mo3.a.g(nim.a.v(qVar.f208896g.b(screen, loadingStrategy), new ksk.h(this, 20)), null, new f0(9), 1), this, str, 19), h0.f322473a, new c(this, str, null));
    }
}
