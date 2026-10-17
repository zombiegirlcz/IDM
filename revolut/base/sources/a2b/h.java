package a2b;

import dfl.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f726a;

    public h(v trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f726a = trade;
    }

    public final v b() {
        return this.f726a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f726a, ((h) obj2).f726a);
    }

    public final int hashCode() {
        return this.f726a.hashCode();
    }
}
