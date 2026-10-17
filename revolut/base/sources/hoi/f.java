package hoi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.ViewHolder f154317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f154318b;

    public f(c cVar, RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f154318b = cVar;
        this.f154317a = holder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.ViewHolder viewHolder = this.f154317a;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hx7.i.b(itemView);
        c cVar = this.f154318b;
        cVar.f.remove(viewHolder);
        if (!cVar.f.contains(viewHolder)) {
            cVar.dispatchRemoveFinished(viewHolder);
        }
        cVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c cVar = this.f154318b;
        ArrayList arrayList = cVar.f;
        RecyclerView.ViewHolder viewHolder = this.f154317a;
        if (!arrayList.contains(viewHolder)) {
            cVar.dispatchRemoveStarting(viewHolder);
        }
        cVar.f.add(viewHolder);
    }
}
