package ow6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230311a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f230311a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f230311a, ((d) obj2).f230311a);
    }

    public final int hashCode() {
        return this.f230311a.hashCode();
    }
}
