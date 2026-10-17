package rj5;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f254613a;

    public b() {
        this(0);
    }

    public final c b() {
        return this.f254613a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f254613a == ((b) obj2).f254613a;
    }

    public final int hashCode() {
        return this.f254613a.hashCode();
    }

    public /* synthetic */ b(int i) {
        this(c.ASSETS);
    }

    public b(c tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f254613a = tab2;
    }
}
