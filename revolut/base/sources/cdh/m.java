package cdh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.wealth.api.widget.WealthWidgetContext;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzg.l0;
import xzg.n0;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9h.g f23261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0h.f f23262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f23263c;
    public final n d;

    public m(x9h.g topMoversPresentationRouter, w0h.f widgetDataProvider, a0 widgetsUiInteractor, n topMoversWidgetSelectionCache) {
        Intrinsics.checkNotNullParameter(topMoversPresentationRouter, "topMoversPresentationRouter");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(topMoversWidgetSelectionCache, "topMoversWidgetSelectionCache");
        this.f23261a = topMoversPresentationRouter;
        this.f23262b = widgetDataProvider;
        this.f23263c = widgetsUiInteractor;
        this.d = topMoversWidgetSelectionCache;
    }

    @Override // csh.f
    public final Class j() {
        return WealthWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        w0h.c aVar;
        mzg.e eVar;
        n0 n0Var;
        FeatureCommand featureCommandA;
        wnh.d dVar;
        WealthWidgetContext widgetContext2 = (WealthWidgetContext) widgetContext;
        x9h.g gVar = this.f23261a;
        ln.a aVar2 = gVar.f303743a;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d2) {
            return pd.b.n(kotlin.coroutines.g.f186406a, new l(this, event, null));
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        pfm.m mVar = pfm.m.f235744a;
        if (!z) {
            if (!(event instanceof com.revolut.core.ui_kit.delegates.widgets.e)) {
                if (event instanceof q0) {
                    return new pfm.h(new a09.a0(this, 3, event, widgetContext2), 2);
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj2 = ((com.revolut.core.ui_kit.delegates.widgets.e) event).f55333c.f53167l;
            vel.f topMoverAsset = obj2 instanceof vel.f ? (vel.f) obj2 : null;
            if (topMoverAsset == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Intrinsics.checkNotNullParameter(topMoverAsset, "topMoverAsset");
            if (topMoverAsset instanceof vel.e) {
                aVar = new w0h.b(topMoverAsset.a());
            } else {
                if (!(topMoverAsset instanceof vel.d)) {
                    if (!(topMoverAsset instanceof vel.c) && !(topMoverAsset instanceof vel.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g9h.c.b(topMoverAsset);
                    return aVar2.a(DummyCommand.f98635a);
                }
                aVar = new w0h.a(((vel.d) topMoverAsset).f288352a);
            }
            return aVar2.a(new FeatureCommand(ugh.a.a(aVar)));
        }
        BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
        GridWidgetDelegate.Model model2 = model instanceof GridWidgetDelegate.Model ? (GridWidgetDelegate.Model) model : null;
        if (model2 == null) {
            return mVar;
        }
        Object f54968n = model2.getF52946g();
        n0 n0Var2 = f54968n instanceof n0 ? (n0) f54968n : null;
        if (n0Var2 == null) {
            n0Var2 = n0.ALL;
        }
        w0h.d assetType = this.f23262b.h();
        int i = k.f23260a[n0Var2.ordinal()];
        if (i == 1) {
            eVar = mzg.e.ALL;
        } else if (i == 2) {
            eVar = mzg.e.GAINERS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = mzg.e.LOSERS;
        }
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        if (eVar == null) {
            eVar = mzg.e.ALL;
        }
        int i2 = x9h.f.f303741b[eVar.ordinal()];
        if (i2 == 1) {
            n0Var = n0.ALL;
        } else if (i2 == 2) {
            n0Var = n0.GAINERS;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = n0.LOSERS;
        }
        int i3 = x9h.f.f303740a[assetType.ordinal()];
        if (i3 == 1) {
            featureCommandA = gVar.f303744b.a(l0.ONE_DAY, n0Var);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            wnh.e eVar2 = wnh.e.ONE_DAY;
            int i5 = x9h.f.f303742c[n0Var.ordinal()];
            if (i5 == 1) {
                dVar = wnh.d.ALL;
            } else if (i5 == 2) {
                dVar = wnh.d.GAINERS;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = wnh.d.LOSERS;
            }
            featureCommandA = u0.f(new TopMoversDestination.Crypto(eVar2, dVar, 4));
        }
        return aVar2.a(featureCommandA);
    }
}
