package ru5;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityScreen f257413a;

    public h(ActivityScreen activityScreen) {
        this.f257413a = activityScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ActivityScreen.Companion aVar = ActivityScreen.INSTANCE;
        ActivityScreen activityScreen = this.f257413a;
        activityScreen.j3();
        k kVarI3 = activityScreen.T2();
        RecyclerView.LayoutManager layoutManager = activityScreen.h3().d.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        z zVar = (z) kVarI3;
        List list = ((uu5.d) zVar.f257443w).f283138b;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((Number) ((Pair) objPrevious).f186385a).intValue() <= iFindFirstCompletelyVisibleItemPosition) {
                    break;
                }
            }
        }
        Pair pair = (Pair) objPrevious;
        String str = pair != null ? (String) pair.f186386b : null;
        if (Intrinsics.f(str, ((j) zVar.t2()).k)) {
            return;
        }
        zVar.x2(new n0(str, 27));
    }
}
