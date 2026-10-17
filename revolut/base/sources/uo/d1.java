package uo;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d1 {
    public final c1 a(View view) {
        Pair pair;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int bindingAdapterPosition;
        Intrinsics.checkNotNullParameter(view, "view");
        while (true) {
            if (view == null) {
                pair = null;
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                pair = new Pair(parent, view);
                break;
            }
            Object parent2 = view.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
        }
        if (pair != null && (viewHolderFindContainingViewHolder = (recyclerView = (RecyclerView) pair.f186385a).findContainingViewHolder((View) pair.f186386b)) != null && (bindingAdapterPosition = viewHolderFindContainingViewHolder.getBindingAdapterPosition()) != -1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
            if (hVar != null) {
                return new c1(recyclerView, hVar, bindingAdapterPosition);
            }
        }
        return null;
    }
}
