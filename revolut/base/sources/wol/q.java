package wol;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298973a;

    public q(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298973a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f298973a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f298973a, ((q) obj2).f298973a);
    }

    public final int hashCode() {
        return this.f298973a.hashCode();
    }
}
