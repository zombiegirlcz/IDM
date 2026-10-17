package sq5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265007a;

    public h(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265007a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f265007a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f265007a, ((h) obj2).f265007a);
    }

    public final int hashCode() {
        return this.f265007a.hashCode();
    }
}
