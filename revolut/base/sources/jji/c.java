package jji;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;
import yp0.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f174957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f174958b;

    public c(f fVar, View from, View to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f174957a = from;
        this.f174958b = to6;
    }

    public final View a() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view = this.f174957a;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewPager2 viewPager2 = (ViewPager2) ((ViewGroup) view).findViewById(R$id.internalDelegateNewRevolutCards_viewPager);
        if (viewPager2 == null || (viewHolderFindViewHolderForAdapterPosition = j0.a(viewPager2).findViewHolderForAdapterPosition(viewPager2.getCurrentItem())) == null) {
            return null;
        }
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }
}
