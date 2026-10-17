package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.drawables.CountdownTimerDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w implements yy0.d {
    public static CountdownTimerDrawable g(CountdownTimerImage countdownTimerImage, Context context) {
        long j2 = countdownTimerImage.f59898a;
        long j3 = countdownTimerImage.f59899b;
        int iS = kli.a.s(countdownTimerImage.f59900c, context);
        float fK = kli.a.k(context, countdownTimerImage.d);
        ez0.d dVar = countdownTimerImage.e;
        int iS2 = kli.a.s(countdownTimerImage.f, context);
        float fK2 = kli.a.k(context, countdownTimerImage.f59901g);
        List<CountdownTimerImage.ProgressCycle> listP0 = zhm.d0.P0(countdownTimerImage.f59902h, new v());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (CountdownTimerImage.ProgressCycle progressCycle : listP0) {
            arrayList.add(new sp0.f(progressCycle.getF59903a(), kli.a.s(progressCycle.getF59904b(), context)));
        }
        return new CountdownTimerDrawable(j2, j3, iS, fK, dVar, iS2, fK2, arrayList, hzl.c.f157253a, context);
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CountdownTimerDrawable countdownTimerDrawableG = g((CountdownTimerImage) image, context);
        to6.setImageDrawable(countdownTimerDrawableG);
        if (function1 != null) {
            function1.invoke(countdownTimerDrawableG);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Drawable drawable = imageView.getDrawable();
        CountdownTimerDrawable countdownTimerDrawable = drawable instanceof CountdownTimerDrawable ? (CountdownTimerDrawable) drawable : null;
        if (countdownTimerDrawable == null) {
            return;
        }
        countdownTimerDrawable.stop();
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CountdownTimerImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        CountdownTimerDrawable countdownTimerDrawableG = g((CountdownTimerImage) image, context);
        countdownTimerDrawableG.setBounds(0, 0, i, i2);
        if (mVar != null) {
            mVar.invoke(countdownTimerDrawableG);
        }
    }
}
