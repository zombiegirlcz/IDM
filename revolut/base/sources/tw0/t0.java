package tw0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.a f274880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f274882c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g1 f274883g;

    public t0(koi.a adapter, boolean z) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f274880a = adapter;
        this.f274881b = z;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.f274883g = f1.f274808a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(android.graphics.Rect r19, android.view.View r20, androidx.recyclerview.widget.RecyclerView r21, androidx.recyclerview.widget.RecyclerView.State r22) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw0.t0.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
