package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265890a;

    public c1(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f265890a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f265890a, ((c1) obj2).f265890a);
    }

    public final int hashCode() {
        return this.f265890a.hashCode();
    }
}
