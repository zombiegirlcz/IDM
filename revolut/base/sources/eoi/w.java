package eoi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f127980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f127981b;

    public w(p state, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f127980a = state;
        this.f127981b = recyclerView;
    }

    public final RecyclerView a() {
        return this.f127981b;
    }

    public final p b() {
        return this.f127980a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f127980a == wVar.f127980a && Intrinsics.f(this.f127981b, wVar.f127981b);
    }

    public final int hashCode() {
        return this.f127981b.hashCode() + (this.f127980a.hashCode() * 31);
    }
}
