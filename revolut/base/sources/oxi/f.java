package oxi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f230848a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230848a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f230848a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f230848a.equals(((f) obj2).f230848a);
    }

    public final int hashCode() {
        return this.f230848a.hashCode();
    }
}
