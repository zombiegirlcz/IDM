package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225064a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f225064a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f225064a, ((b) obj2).f225064a);
    }

    public final int hashCode() {
        return this.f225064a.hashCode();
    }
}
