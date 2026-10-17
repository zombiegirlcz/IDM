package kp0;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends koi.b {
    public final et0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f188041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a5h.g f188042h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(et0.n itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "view");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f188042h = new a5h.g((ViewGroup) itemView);
    }
}
