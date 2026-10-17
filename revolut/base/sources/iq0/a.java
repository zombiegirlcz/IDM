package iq0;

import koi.c;
import kotlin.jvm.internal.Intrinsics;
import z4l.j;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends j {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(c delegatesManager, boolean z, int i) {
        z = (i & 4) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        super(delegatesManager, false, z, true);
    }

    @Override // z4l.j, koi.h, koi.a
    public final koi.j a(int i) {
        z4l.c cVar = this.f319395l;
        return (koi.j) cVar.get(i % cVar.size());
    }

    @Override // z4l.j, koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f319395l.isEmpty() ? 0 : Integer.MAX_VALUE;
    }
}
