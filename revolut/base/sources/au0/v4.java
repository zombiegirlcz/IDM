package au0;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f9404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f9405c;
    public final /* synthetic */ float d;

    public /* synthetic */ v4(SearchView searchView, float f, float f4, int i) {
        this.f9403a = i;
        this.f9404b = searchView;
        this.f9405c = f;
        this.d = f4;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f9403a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f9403a;
        float f = this.d;
        float f4 = this.f9405c;
        SearchView searchView = this.f9404b;
        switch (i) {
            case 0:
                SearchView.a aVar = SearchView.Companion;
                searchView.p(BitmapDescriptorFactory.HUE_RED, f4, f);
                searchView.invalidate();
                searchView.invalidateOutline();
                searchView.v = BitmapDescriptorFactory.HUE_RED;
                searchView.f57344w = BitmapDescriptorFactory.HUE_RED;
                break;
            default:
                SearchView.a aVar2 = SearchView.Companion;
                searchView.p(1.0f, f4, f);
                searchView.invalidate();
                searchView.invalidateOutline();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f9403a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f9403a;
    }
}
