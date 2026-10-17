package aie;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountSpacesScreen f5247a;

    public k(AccountSpacesScreen accountSpacesScreen) {
        this.f5247a = accountSpacesScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0 || i == 1) {
            com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = (com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f5247a.k3();
            iVar.K2();
            iVar.H2(iVar.I, new agh.h(26));
        }
    }
}
