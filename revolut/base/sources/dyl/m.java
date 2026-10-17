package dyl;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import gw0.t;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f121163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f121164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToChatTransitionFlowContainerLayout f121165c;
    public final /* synthetic */ RecyclerView d;
    public final /* synthetic */ t e;
    public final /* synthetic */ BackgroundWallpaperView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f121166g;

    public m(View view, Ref$ObjectRef ref$ObjectRef, TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, RecyclerView recyclerView, t tVar, BackgroundWallpaperView backgroundWallpaperView, ViewGroup viewGroup) {
        this.f121163a = view;
        this.f121164b = ref$ObjectRef;
        this.f121165c = transferToChatTransitionFlowContainerLayout;
        this.d = recyclerView;
        this.e = tVar;
        this.f = backgroundWallpaperView;
        this.f121166g = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f121163a.setVisibility(0);
        TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = this.f121165c;
        Bitmap bitmap = transferToChatTransitionFlowContainerLayout.i;
        Rect rect = transferToChatTransitionFlowContainerLayout.f107128j;
        t tVar = this.e;
        BackgroundWallpaperView backgroundWallpaperView = this.f;
        View view = this.f121163a;
        RecyclerView recyclerView = this.d;
        j jVar = new j(transferToChatTransitionFlowContainerLayout, bitmap, view, rect, recyclerView, tVar, backgroundWallpaperView);
        this.f121164b.f186409a = jVar;
        recyclerView.addItemDecoration(jVar);
        this.f121166g.setVisibility(8);
        transferToChatTransitionFlowContainerLayout.i = null;
        r70.c hapticEngine = transferToChatTransitionFlowContainerLayout.getHapticEngine();
        if (hapticEngine != null) {
            ((r70.e) hapticEngine).c(r70.b.SHORT, true);
        }
    }
}
