package ip0;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class eg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditView f164096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartTileExchangeDelegate.Model f164097c;

    public /* synthetic */ eg0(AmountEditView amountEditView, SmartTileExchangeDelegate.Model model, int i) {
        this.f164095a = i;
        this.f164096b = amountEditView;
        this.f164097c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f164095a;
        SmartTileExchangeDelegate.Model model = this.f164097c;
        AmountEditView amountEditView = this.f164096b;
        Unit it8 = (Unit) obj2;
        switch (i) {
            case 0:
                SmartTileExchangeDelegate.Companion aVar = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                py0.f fVarN0 = or0.u.k(amountEditView).n0();
                TrackableItem.Companion companion = TrackableItem.INSTANCE;
                AnalyticsContext analyticsContext = model.f53423b.f164420h;
                companion.getClass();
                fVarN0.a(amountEditView, TrackableItem.Companion.a(amountEditView, analyticsContext), null);
                return new com.revolut.core.ui_kit.delegates.yg(lg0.TOP, model);
            default:
                SmartTileExchangeDelegate.Companion aVar2 = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                py0.f fVarN02 = or0.u.k(amountEditView).n0();
                TrackableItem.Companion companion2 = TrackableItem.INSTANCE;
                AnalyticsContext analyticsContext2 = model.f53424c.f164420h;
                companion2.getClass();
                fVarN02.a(amountEditView, TrackableItem.Companion.a(amountEditView, analyticsContext2), null);
                return new com.revolut.core.ui_kit.delegates.yg(lg0.BOTTOM, model);
        }
    }
}
