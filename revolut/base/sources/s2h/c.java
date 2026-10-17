package s2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259347a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f259347a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f259347a, ((c) obj2).f259347a);
    }

    public final int hashCode() {
        return this.f259347a.hashCode();
    }
}
