package wvl;

import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesWidgetParcel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lrk.r;
import org.jetbrains.annotations.NotNull;
import q87.q;
import qr0.i;
import vkm.q0;
import wim.z;
import wli.x;
import wr1.s;
import ybl.l;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends qdf.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f300557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qrk.d f300558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f300559n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f300560p;

    public g(i freeTradesProvider, qrk.d widgetDismissStatusInteractor, l configInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(freeTradesProvider, "freeTradesProvider");
        Intrinsics.checkNotNullParameter(widgetDismissStatusInteractor, "widgetDismissStatusInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f300557l = freeTradesProvider;
        this.f300558m = widgetDismissStatusInteractor;
        this.f300559n = configInteractor;
        this.o = deeplinkHandler;
        this.f300560p = pyd.c.a(this, null);
    }

    @Override // yji.n
    public final void H2() {
        q qVarJ = this.f300557l.j();
        tqk.a widgetType = tqk.a.FREE_TRADES_INCENTIVE;
        qrk.d dVar = this.f300558m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter("FREE_TRADES_INCENTIVE_WIDGET_ID", "id");
        r rVar = dVar.f248738a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter("FREE_TRADES_INCENTIVE_WIDGET_ID", "id");
        n.l2(this, new q0(yh5.b.d(qVarJ, new a44.c(ue0.e.R(rVar.f199549a, p.a.p("until_date_", widgetType.name(), "_FREE_TRADES_INCENTIVE_WIDGET_ID"), z.d(o0.b(Long.TYPE))), 10)), new wuh.q(this, (Continuation) null, 13), 1), null, null, 7);
    }

    @Override // qdf.b
    public final void Z2() {
        V2(new s(this, null, 10), new yi5.b(29));
    }

    @Override // qdf.b
    public final void b3(FreeTradesIncentiveContract$FreeTradesWidgetParcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        V2(new wtj.f(this, null, 3), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f300560p;
    }
}
