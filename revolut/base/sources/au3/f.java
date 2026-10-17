package au3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9475a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f9475a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f9475a, ((f) obj2).f9475a);
    }

    public final int hashCode() {
        return this.f9475a.hashCode();
    }
}
