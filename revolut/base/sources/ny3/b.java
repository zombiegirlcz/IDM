package ny3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220625a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f220625a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f220625a, ((b) obj2).f220625a);
    }

    public final int hashCode() {
        return this.f220625a.hashCode();
    }
}
