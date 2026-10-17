package fub;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138164a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f138164a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f138164a, ((b) obj2).f138164a);
    }

    public final int hashCode() {
        return this.f138164a.hashCode();
    }
}
