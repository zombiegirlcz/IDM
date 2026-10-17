package p1g;

import cli.o;
import cli.p;
import cli.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f231926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231927b;

    public j(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f231926a = items;
        this.f231927b = z;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof j) {
            return new h(((j) oldState).f231927b != this.f231927b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f231926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f231926a.equals(jVar.f231926a) && this.f231927b == jVar.f231927b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231927b) + (this.f231926a.hashCode() * 31);
    }
}
