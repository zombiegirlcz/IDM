package fci;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f133770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f133771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f133772c;
    public final ArrayList d;
    public FrameLayout e;
    public boolean f;

    public d0(ControllerContainerCoordinatorLayout hostView, ScreenContentRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f133770a = recyclerView;
        this.f133771b = hostView;
        this.f133772c = new ArrayList();
        this.d = new ArrayList();
    }

    public static Rect b(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        return new Rect(i, iArr[1] - iArr2[1], view.getWidth() + i, view.getHeight() + (iArr[1] - iArr2[1]));
    }

    public final void a() {
        this.f = true;
        ArrayList arrayList = this.f133772c;
        Iterator it8 = zhm.d0.d1(arrayList).iterator();
        while (it8.hasNext()) {
            ((ValueAnimator) it8.next()).cancel();
        }
        arrayList.clear();
        Iterator it9 = this.d.iterator();
        while (it9.hasNext()) {
            ((View) it9.next()).animate().cancel();
        }
    }

    public final void c() {
        a();
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            this.f133771b.removeView(frameLayout);
        }
        this.e = null;
        ArrayList<View> arrayList = this.d;
        for (View view : arrayList) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        arrayList.clear();
    }
}
