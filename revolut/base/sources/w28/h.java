package w28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t28.e f293979b;

    public h(v28.f popularAssetsWidgetMapper, t9h.a popularAssetsPresentationModel, uc.d popularStocksWidgetVariant) {
        Intrinsics.checkNotNullParameter(popularAssetsWidgetMapper, "popularAssetsWidgetMapper");
        Intrinsics.checkNotNullParameter(popularAssetsPresentationModel, "popularAssetsPresentationModel");
        Intrinsics.checkNotNullParameter(popularStocksWidgetVariant, "popularStocksWidgetVariant");
        this.f293979b = new t28.e(popularAssetsWidgetMapper, popularAssetsPresentationModel, popularStocksWidgetVariant);
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return this.f293979b.a(widgetType, inputConfig);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        this.f293979b.getClass();
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.f293979b.d.d(str, (gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return this.f293979b.d(id10, widgetType, eVar);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        this.f293979b.getClass();
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return this.f293979b.f((InvestWidgetContext) widgetContext, str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return this.f293979b.g(widgetContext2, id10, widgetType, config);
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        this.f293979b.h(widgetContext2, widgetType, inputConfig);
        return null;
    }
}
