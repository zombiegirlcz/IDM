package p4i;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StackedBreakdownActivity f232931b;

    public /* synthetic */ a(StackedBreakdownActivity stackedBreakdownActivity, int i) {
        this.f232930a = i;
        this.f232931b = stackedBreakdownActivity;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f232930a;
        StackedBreakdownActivity stackedBreakdownActivity = this.f232931b;
        switch (i) {
            case 0:
                int i2 = StackedBreakdownActivity.C0;
                p5i.a aVar = stackedBreakdownActivity.f97153r0;
                if (aVar != null) {
                    return (opi.b) aVar.f233128l.get();
                }
                Intrinsics.r("component");
                throw null;
            default:
                int i3 = StackedBreakdownActivity.C0;
                return v.k((LargeActionButtonDelegate) stackedBreakdownActivity.f97155t0.getValue(), (RowDelegate) stackedBreakdownActivity.u0.getValue(), (CellDetailsDelegate) stackedBreakdownActivity.f97157w0.getValue(), (CellDetailsActionDelegate) stackedBreakdownActivity.f97158x0.getValue(), (TextDelegate) stackedBreakdownActivity.A0.getValue(), (ActionWidgetDelegate) stackedBreakdownActivity.y0.getValue(), (BannerDelegate) stackedBreakdownActivity.z0.getValue(), new CellDetailsLoadingDelegate(), (HighlightTileDelegate) stackedBreakdownActivity.f97156v0.getValue(), new HighlightTileLoadingDelegate(), stackedBreakdownActivity.B0);
        }
    }
}
