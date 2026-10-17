package z4l;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class j extends koi.h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f319394j;
    public final koi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f319395l;

    public /* synthetic */ j(koi.c cVar, boolean z, int i) {
        this(cVar, false, (i & 4) != 0 ? false : z, (i & 8) != 0);
    }

    @Override // koi.h, koi.a
    public koi.j a(int i) {
        return (koi.j) this.f319395l.get(i);
    }

    @Override // koi.h
    public final List b() {
        return this.f319395l;
    }

    @Override // koi.h
    public final void c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("RxDiffAdapter.setItems() was called from worker thread");
        }
        this.k.setItems(items);
    }

    public void d() {
        this.f319395l.clear();
        notifyDataSetChanged();
    }

    @Override // koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f319395l.size();
    }

    @Override // koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f319394j && !(recyclerView instanceof AsyncDiffRecyclerView) && !(recyclerView instanceof ScreenContentRecyclerView)) {
            throw new IllegalStateException("RxDiffAdapter in async mode must be used with AsyncDiffRecyclerView or ScreenContentRecyclerView");
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(koi.c delegatesManager, boolean z, boolean z3, boolean z4) {
        super(delegatesManager, z, z3);
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.f319394j = z;
        koi.i fVar = z ? new f(this, z4) : new i(this, z4);
        this.k = fVar;
        this.f319395l = fVar.getItems();
    }

    public /* synthetic */ j(int i, List list, boolean z) {
        this(list, (i & 1) != 0 ? false : z, (i & 2) == 0, (i & 4) != 0);
    }

    public j(List delegates, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        koi.c cVar = new koi.c(delegates);
        a.a(delegates);
        this(cVar, z, z3, z4);
    }
}
