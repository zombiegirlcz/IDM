package pzd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240980a;

    public v(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f240980a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f240980a, ((v) obj2).f240980a);
    }

    public final int hashCode() {
        return this.f240980a.hashCode();
    }
}
