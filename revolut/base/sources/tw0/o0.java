package tw0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f274858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f274859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ koi.h f274860c;

    public o0(l0 l0Var, koi.h hVar) {
        this.f274859b = l0Var;
        this.f274860c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 2) {
            return;
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jq0.a.a(context)) {
            this.f274859b.a(recyclerView, this.f274860c, true);
        } else if (this.f274859b.f274842q) {
            recyclerView.post(new b0.d(this.f274859b, 29, recyclerView, this.f274860c));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        l0 l0Var = this.f274859b;
        long jLongValue = ((Number) l0Var.i.invoke()).longValue();
        if (jLongValue - this.f274858a < 500) {
            return;
        }
        this.f274858a = jLongValue;
        l0Var.a(recyclerView, this.f274860c, i2 != 0);
    }
}
