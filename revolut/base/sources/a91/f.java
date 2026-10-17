package a91;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2291a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2291a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f2291a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f2291a, ((f) obj2).f2291a);
    }

    public final int hashCode() {
        return this.f2291a.hashCode();
    }
}
