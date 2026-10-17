package hoi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.ViewHolder f154312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f154313b;

    public d(c cVar, RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f154313b = cVar;
        this.f154312a = holder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        View itemView = this.f154312a.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hx7.i.b(itemView);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        c cVar = this.f154313b;
        ArrayList arrayList = cVar.e;
        RecyclerView.ViewHolder viewHolder = this.f154312a;
        arrayList.remove(viewHolder);
        if (!cVar.e.contains(viewHolder)) {
            cVar.dispatchAddFinished(viewHolder);
        }
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hx7.i.b(itemView);
        cVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        c cVar = this.f154313b;
        ArrayList arrayList = cVar.e;
        RecyclerView.ViewHolder viewHolder = this.f154312a;
        if (!arrayList.contains(viewHolder)) {
            cVar.dispatchAddStarting(viewHolder);
        }
        cVar.e.add(viewHolder);
    }
}
