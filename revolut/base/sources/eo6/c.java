package eo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127867a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f127867a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f127867a, ((c) obj2).f127867a);
    }

    public final int hashCode() {
        return this.f127867a.hashCode();
    }
}
