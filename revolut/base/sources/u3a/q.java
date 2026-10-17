package u3a;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoController;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import efm.h0;
import efm.w;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.reactivestreams.Publisher;
import tx0.p4;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements kfm.c, kfm.o, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f276873b;

    public /* synthetic */ q(Function function, int i) {
        this.f276872a = i;
        this.f276873b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f276872a) {
            case 12:
                ((u6k.a) this.f276873b).invoke(obj2);
                break;
            default:
                ((u6b.k) this.f276873b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f276872a;
        Function function = this.f276873b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((g) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.retail.retail_snackbar.mediator.f) ((g) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((u4e.i) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((p4) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((twg.a) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((toh.h) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((p4) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((sc7.b) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Long) ((u4e.i) function).invoke(p0);
            case 10:
            case 12:
            case 13:
            case 16:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p9g.f) ((uag.r) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((u6k.a) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((u6b.k) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p7l.a) ((u4e.i) function).invoke(p0);
            case 17:
                KProperty[] kPropertyArr = IndexOverviewScreen.f74610a0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SwipeToActionDelegate.SwipeAction) ((u4e.i) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((u69.g) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((u6b.k) function).invoke(p0);
            case 20:
                int i2 = CryptoAssetDetailsScreen.f99949w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((u8c.c) function).invoke(p0);
            case 21:
                int i3 = CryptoAssetDetailsScreen.f99949w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((u8c.c) function).invoke(p0);
            case 22:
                int i5 = CryptoAssetDetailsScreen.f99949w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SwipeToActionDelegate.SwipeAction) ((u8c.c) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((u8c.c) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((u8c.c) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((hwg.b) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((hwg.b) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f276872a;
        Function function = this.f276873b;
        switch (i) {
            case 10:
                KProperty[] kPropertyArr = ManagedPortfolioFeesInfoController.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u4e.i) function).invoke(p0)).booleanValue();
            case 16:
                KProperty[] kPropertyArr2 = IndexOverviewScreen.f74610a0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u4e.i) function).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u8c.c) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f276872a) {
            case 0:
                p pVar = (p) this.f276873b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (zm3.b) pVar.invoke(p0, p17);
            default:
                u4i.u uVar = (u4i.u) this.f276873b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (ube.a) uVar.invoke(p0, p17);
        }
    }
}
