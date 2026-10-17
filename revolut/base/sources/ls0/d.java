package ls0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ViewPager2.PageTransformer {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f199580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f199581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f199582c;

    public d(Function1 function1, Function1 function12, RecyclerView recyclerView) {
        this.f199580a = function1;
        this.f199581b = function12;
        this.f199582c = recyclerView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerView = this.f199582c;
        if (recyclerView.isAnimating()) {
            g.b(recyclerView, new b(f, 0, this, view));
            return;
        }
        Function1 function1 = this.f199581b;
        if (function1 != null) {
            float fFloatValue = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
            view.setScaleX(fFloatValue);
            view.setScaleY(fFloatValue);
        }
        view.setTranslationX(((Number) this.f199580a.invoke(Float.valueOf(f))).floatValue());
    }
}
