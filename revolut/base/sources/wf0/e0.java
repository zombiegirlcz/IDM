package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296879a;

    public e0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f296879a = query;
    }

    public final boolean equals(Object obj2) {
        Object obj3 = 6;
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f296879a, ((e0) obj2).f296879a) && obj3.equals(obj3);
    }

    public final int hashCode() {
        Integer num = 6;
        return num.hashCode() + (this.f296879a.hashCode() * 31);
    }
}
