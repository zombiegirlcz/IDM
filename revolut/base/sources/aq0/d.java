package aq0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends koi.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public an4.f f8216j;

    @Override // koi.a, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        an4.f fVar = this.f8216j;
        if (fVar != null) {
            fVar.invoke(holder);
        }
        super.onViewRecycled(holder);
    }
}
