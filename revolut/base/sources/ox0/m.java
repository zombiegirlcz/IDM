package ox0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f230487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f230488b;

    public m(n nVar, boolean z) {
        this.f230487a = nVar;
        this.f230488b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
        n nVar = this.f230487a;
        if (i == 0 && !zCanScrollVertically) {
            nVar.b();
        } else if (this.f230488b) {
            nVar.e();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (((Boolean) jo0.g.Q.getValue()).booleanValue()) {
            n nVar = this.f230487a;
            if (i == 0 && i2 == 0) {
                nVar.e();
            } else {
                nVar.g();
            }
        }
    }
}
