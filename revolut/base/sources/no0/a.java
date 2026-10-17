package no0;

import androidx.recyclerview.widget.RecyclerView;
import ix0.m1;
import java.lang.ref.WeakReference;
import koi.c;
import kotlin.jvm.internal.Intrinsics;
import z4l.j;

/* JADX INFO: loaded from: classes19.dex */
public class a extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f217896m;

    public a() {
        this(null, 15);
    }

    public final void e() {
        RecyclerView recyclerView;
        WeakReference weakReference = this.f217896m;
        if (weakReference == null || (recyclerView = (RecyclerView) weakReference.get()) == null) {
            return;
        }
        m1.a(recyclerView);
    }

    @Override // z4l.j, koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f217896m = new WeakReference(recyclerView);
    }

    @Override // koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        WeakReference weakReference = this.f217896m;
        if (Intrinsics.f(weakReference != null ? (RecyclerView) weakReference.get() : null, recyclerView)) {
            this.f217896m = null;
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(c delegatesManager, int i) {
        delegatesManager = (i & 1) != 0 ? new c(0) : delegatesManager;
        boolean z = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        super(delegatesManager, z3, z, true);
    }
}
