package n85;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanRepaymentsListScreen f213207a;

    public e(LoanRepaymentsListScreen loanRepaymentsListScreen) {
        this.f213207a = loanRepaymentsListScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
        this.f213207a.i3();
    }
}
