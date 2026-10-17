package tw0;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l1 extends ItemTouchHelper {

    @NotNull
    private static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f274844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f274845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f274846c;
    public RecyclerView d;
    public RecyclerView.ViewHolder e;
    public j1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f274847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f274844a = callback;
        this.f = j1.IDLE;
        this.f274847g = new k1(this);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }
}
