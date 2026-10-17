package fyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends koi.b {
    public final iyl.c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(iyl.c itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "globeView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
