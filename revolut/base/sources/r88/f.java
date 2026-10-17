package r88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import f28.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lk7.p;
import q97.g3;
import r7i.r;
import te8.z;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements a78.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f252380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final prl.e f252381c;
    public final c d;

    public f(z juniorProductsInteractor, prl.e provider, c factory) {
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f252380b = juniorProductsInteractor;
        this.f252381c = provider;
        this.d = factory;
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
        return new PaymentLinkWidgetLoadingDelegate.Model(new TextLocalisedClause(R$string.junior_widgets_payment_junior_title, null, null, 14), id10);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return q.x(rd0.e.e(new g3(mo3.a.g(rd0.e.b(z.b(this.f252380b, ((HomeFeedWidgetContext.Junior) widgetContext).getJuniorId(), false, 6)), null, new r6d.h(14), 1), 7), h0.f322473a, new e(3, null)), eVar);
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
        String juniorId = widgetContext.getJuniorId();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        prl.e eVar = this.f252381c;
        return mo3.a.f(boh.f.e(nim.a.v(((kd8.e) eVar.f239325b).e(juniorId, w4l.h.f294642c), new r(3)), new k(eVar, juniorId, 0)), new b0(this, id10, 18), new p(this, 23, id10, widgetContext), new r6d.h(13));
    }
}
