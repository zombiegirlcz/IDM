package wji;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;
import lki.z;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uji.b f298143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jpf.a f298144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f298145c;

    public g(uji.b hooksProvider) {
        Intrinsics.checkNotNullParameter(hooksProvider, "hooksProvider");
        this.f298143a = hooksProvider;
    }

    @Override // wji.d
    public final ViewGroup a() {
        ViewGroup viewGroup = this.f298145c;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // wji.d
    public final void add(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jpf.a aVar = this.f298144b;
        if (aVar != null) {
            aVar.add(view);
        }
    }

    @Override // wji.d
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jpf.a aVar = this.f298144b;
        if (aVar != null) {
            aVar.c(view);
        }
    }

    @Override // wji.d
    public final void d(View view, View view2, TransitionAnimation animation, boolean z, z transitionListener) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        jpf.a aVar = this.f298144b;
        if (aVar != null) {
            aVar.d(view, view2, animation, z, transitionListener);
        }
    }

    @Override // wji.d
    public final void e(y99.c onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        jpf.a aVar = this.f298144b;
        if (aVar != null) {
            aVar.e(onDismiss);
        }
    }

    @Override // wji.d
    public final void remove(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jpf.a aVar = this.f298144b;
        if (aVar != null) {
            aVar.remove(view);
        }
    }
}
