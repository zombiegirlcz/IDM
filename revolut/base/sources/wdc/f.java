package wdc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f296546a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296546a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f296546a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f296546a.equals(((f) obj2).f296546a);
    }

    public final int hashCode() {
        return this.f296546a.hashCode();
    }
}
