package au0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f9390c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public u4(yt0.h hVar, boolean z, View view, Function0 function0) {
        this.d = hVar;
        this.f9389b = z;
        this.e = view;
        this.f9390c = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f9388a) {
            case 0:
                Function1 function1 = (Function1) this.e;
                SearchView searchView = (SearchView) this.d;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9389b) {
                    searchView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    searchView.setVisibility(4);
                    function1.invoke(Boolean.FALSE);
                } else {
                    searchView.setAlpha(1.0f);
                    function1.invoke(Boolean.TRUE);
                }
                break;
            default:
                View view = (View) this.e;
                Intrinsics.checkNotNullParameter(animation, "animation");
                yt0.h hVar = (yt0.h) this.d;
                Object token = hVar.f316548r;
                Intrinsics.checkNotNullParameter(token, "token");
                if (Intrinsics.f(hVar.e, token)) {
                    hVar.e = null;
                }
                boolean z = this.f9389b;
                if (z && view.getVisibility() == 4) {
                    view.setVisibility(0);
                } else if (!z && view.getVisibility() == 0) {
                    view.setVisibility(4);
                }
                if (z) {
                    hVar.e();
                }
                this.f9390c.invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f9388a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((SearchView) this.d).setVisibility(0);
                this.f9390c.invoke();
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public u4(SearchView searchView, Function0 function0, boolean z, Function1 function1) {
        this.d = searchView;
        this.f9390c = function0;
        this.f9389b = z;
        this.e = function1;
    }
}
