package phk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236319a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f236319a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f236319a, ((d) obj2).f236319a);
    }

    public final int hashCode() {
        return this.f236319a.hashCode();
    }
}
