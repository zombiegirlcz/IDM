package daa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112503b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f112502a = items;
        this.f112503b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f112502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f112502a, kVar.f112502a) && this.f112503b == kVar.f112503b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112503b) + (this.f112502a.hashCode() * 31);
    }
}
