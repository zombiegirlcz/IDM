package k37;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180648a;

    public w(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f180648a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f180648a, ((w) obj2).f180648a);
    }

    public final int hashCode() {
        return this.f180648a.hashCode();
    }
}
