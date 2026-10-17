package uo;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f281467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.h f281468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281469c;

    public c1(RecyclerView recycler, koi.h adapter, int i) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f281467a = recycler;
        this.f281468b = adapter;
        this.f281469c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f281467a, c1Var.f281467a) && Intrinsics.f(this.f281468b, c1Var.f281468b) && this.f281469c == c1Var.f281469c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281469c) + ((this.f281468b.hashCode() + (this.f281467a.hashCode() * 31)) * 31);
    }
}
