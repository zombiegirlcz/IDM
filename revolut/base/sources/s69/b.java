package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260154a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f260154a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f260154a, ((b) obj2).f260154a);
    }

    public final int hashCode() {
        return this.f260154a.hashCode();
    }
}
