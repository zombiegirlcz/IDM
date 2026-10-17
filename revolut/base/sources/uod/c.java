package uod;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ppd.f1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripsShareController f281632b;

    public /* synthetic */ c(TripsShareController tripsShareController, int i) {
        this.f281631a = i;
        this.f281632b = tripsShareController;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f281631a;
        TripsShareController tripsShareController = this.f281632b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TripsShareController.P;
                return (g) ((f1) tripsShareController.M.getValue()).d.get();
            case 1:
                KProperty[] kPropertyArr2 = TripsShareController.P;
                return n14.e.a(tripsShareController, (g) tripsShareController.N.getValue());
            default:
                KProperty[] kPropertyArr3 = TripsShareController.P;
                FrameLayout tripShareCardContainer = tripsShareController.d3().f;
                Intrinsics.checkNotNullExpressionValue(tripShareCardContainer, "tripShareCardContainer");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tripShareCardContainer.getWidth(), tripShareCardContainer.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                tripShareCardContainer.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
        }
    }
}
