package hfh;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151914a;

    public e(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f151914a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f151914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f151914a, ((e) obj2).f151914a);
    }

    public final int hashCode() {
        return this.f151914a.hashCode();
    }
}
