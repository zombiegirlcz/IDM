package joi;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import fci.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f177092a;

    public final void a(RecyclerView recyclerView, f fVar, float f, Function0 function0) {
        ValueAnimator valueAnimator = this.f177092a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f177092a = null;
        float f4 = fVar.e;
        if (f4 == f) {
            fVar.c(f);
            if (recyclerView != null) {
                recyclerView.invalidate();
            }
            function0.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(fVar, recyclerView, 15));
        valueAnimatorOfFloat.addListener(new c0(new Ref$BooleanRef(), 1, this, function0));
        this.f177092a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }
}
