package wq0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements nu0.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f299378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatorSet f299379b;

    public g(Iterable views) {
        Intrinsics.checkNotNullParameter(views, "views");
        this.f299378a = views;
    }

    @Override // nu0.d
    public final void a() {
        AnimatorSet animatorSet = this.f299379b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f299379b = null;
        for (View view : this.f299378a) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
    }

    @Override // nu0.d
    public final void b(Function0 startAction, Function0 endAction, boolean z) {
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endAction, "endAction");
        AnimatorSet animatorSet = this.f299379b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        Iterable<View> iterable = this.f299378a;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (View view : iterable) {
            arrayList.add(ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(400L);
        animatorSet2.addListener(new f(this, z, endAction, z, startAction));
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        this.f299379b = animatorSet2;
    }

    @Override // nu0.d
    public final boolean c() {
        return this.f299379b != null;
    }
}
