package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import ux0.s0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7362c;

    public /* synthetic */ j(View view, View view2) {
        this.f7360a = 17;
        this.f7362c = view;
        this.f7361b = view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x018a  */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r21) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.j.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f7360a = i;
        this.f7361b = obj2;
        this.f7362c = obj3;
    }

    public /* synthetic */ j(s0 s0Var, RecyclerView recyclerView, NavBarWithContainer navBarWithContainer) {
        this.f7360a = 28;
        this.f7361b = recyclerView;
        this.f7362c = navBarWithContainer;
    }
}
