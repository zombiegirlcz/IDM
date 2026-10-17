package gm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144772a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f144772a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f144772a, ((d) obj2).f144772a);
    }

    public final int hashCode() {
        return this.f144772a.hashCode();
    }
}
