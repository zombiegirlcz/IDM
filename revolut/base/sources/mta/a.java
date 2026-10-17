package mta;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShareRaffleScreen f208775b;

    public /* synthetic */ a(ShareRaffleScreen shareRaffleScreen, int i) {
        this.f208774a = i;
        this.f208775b = shareRaffleScreen;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f208774a;
        ShareRaffleScreen shareRaffleScreen = this.f208775b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ShareRaffleScreen.P;
                return n14.e.a(shareRaffleScreen, (f) shareRaffleScreen.O.getValue());
            case 1:
                KProperty[] kPropertyArr2 = ShareRaffleScreen.P;
                return (f) ((fta.f) shareRaffleScreen.N.getValue()).d.get();
            default:
                KProperty[] kPropertyArr3 = ShareRaffleScreen.P;
                FrameLayout raffleShareCardContainer = shareRaffleScreen.d3().f;
                Intrinsics.checkNotNullExpressionValue(raffleShareCardContainer, "raffleShareCardContainer");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(raffleShareCardContainer.getWidth(), raffleShareCardContainer.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                raffleShareCardContainer.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
        }
    }
}
