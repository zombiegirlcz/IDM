package bd7;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.j;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.x;
import nyb.k;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f14538c;
    public final Context d;

    public c(k revPointsInteractor, eub.a revPointsAvailabilityInteractor, j1c.a assetsProvider, Context context) {
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14537b = revPointsInteractor;
        this.f14538c = revPointsAvailabilityInteractor;
        this.d = context;
    }

    public static AvatarWidgetDelegate.Model i(String str, CdnImage cdnImage, LottieImage lottieImage, double d, g gVar, x xVar) {
        return new AvatarWidgetDelegate.Model(str, cdnImage, new TextLocalisedClause(R$string.rev_points_widget, u.c(nub.a.h(d, new nub.b(0), null, 5)), null, 12), new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.widgets_catalogue_rev_points_title, null, null, 14), null, null, lottieImage, gVar, null, xVar, null, 10480);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "RevPointsSmall")) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(((nyb.b) this.f14538c).b(), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "RevPointsSmall")) {
            return new AvatarWidgetLoadingDelegate.Model(id10, null, null);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        if (Intrinsics.f(str2, "RevPointsSmall")) {
            return q.x(q.Q(((nyb.b) this.f14538c).b(), new a32.b((Continuation) null, this, str, 8)), fVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "RevPointsSmall")) {
            return q.Q(((nyb.b) this.f14538c).b(), new a32.b((Continuation) null, this, id10, 8));
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }
}
