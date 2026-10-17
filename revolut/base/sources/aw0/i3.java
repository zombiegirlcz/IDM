package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10352a;

    public i3(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f10352a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i3) && Intrinsics.f(this.f10352a, ((i3) obj2).f10352a);
    }

    public final int hashCode() {
        return this.f10352a.hashCode();
    }
}
