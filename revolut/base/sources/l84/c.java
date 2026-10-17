package l84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192778a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f192778a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f192778a, ((c) obj2).f192778a);
    }

    public final int hashCode() {
        return this.f192778a.hashCode();
    }
}
