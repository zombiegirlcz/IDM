package zli;

import kotlin.jvm.internal.Intrinsics;
import q06.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f323282b;

    public c(String path, phm.a provider) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f323281a = path;
        this.f323282b = provider;
    }

    public final b60.c a() {
        b60.c cVar = (b60.c) this.f323282b.get();
        if ((cVar instanceof jf0.d) || (cVar instanceof k)) {
            return cVar;
        }
        throw new IllegalStateException(a0.d.s("Unsupported deeplink binding for path '", this.f323281a, "': ", cVar.getClass().getName()).toString());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f323281a, cVar.f323281a) && Intrinsics.f(this.f323282b, cVar.f323282b);
    }

    public final int hashCode() {
        return this.f323282b.hashCode() + (this.f323281a.hashCode() * 31);
    }
}
