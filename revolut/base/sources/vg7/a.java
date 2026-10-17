package vg7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareControllerContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LotteryShareController f288782b;

    public /* synthetic */ a(LotteryShareController lotteryShareController, int i) {
        this.f288781a = i;
        this.f288782b = lotteryShareController;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f288781a;
        LotteryShareController lotteryShareController = this.f288782b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = LotteryShareController.R;
                return (e) ((cf7.j) lotteryShareController.Q.getValue()).f23625c.get();
            case 1:
                KProperty[] kPropertyArr2 = LotteryShareController.R;
                return n14.e.a(lotteryShareController, (e) lotteryShareController.O.getValue());
            case 2:
                KProperty[] kPropertyArr3 = LotteryShareController.R;
                qji.b bVarU2 = lotteryShareController.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.di.LotteryShareControllerComponent.Injector");
                cf7.g gVar = (cf7.g) bVarU2;
                cf7.b bVar = gVar.f23615b;
                cf7.g gVar2 = gVar.f23616c;
                LotteryShareControllerContract$InputData lotteryShareControllerContract$InputData = lotteryShareController.K;
                lotteryShareControllerContract$InputData.getClass();
                return new cf7.j(bVar, gVar2, lotteryShareControllerContract$InputData);
            default:
                KProperty[] kPropertyArr4 = LotteryShareController.R;
                ConstraintLayout lotteryShareCardContainer = lotteryShareController.d3().e;
                Intrinsics.checkNotNullExpressionValue(lotteryShareCardContainer, "lotteryShareCardContainer");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(lotteryShareCardContainer.getWidth(), lotteryShareCardContainer.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                lotteryShareCardContainer.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
        }
    }
}
