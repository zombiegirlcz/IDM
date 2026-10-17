package nui;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219317a;

    public j(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219317a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f219317a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f219317a, ((j) obj2).f219317a);
    }

    public final int hashCode() {
        return this.f219317a.hashCode();
    }
}
