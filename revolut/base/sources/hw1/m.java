package hw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av1.c f156042a;

    public m() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f156042a, ((m) obj2).f156042a);
    }

    public final int hashCode() {
        return this.f156042a.hashCode();
    }

    public m(av1.c aliasResolution) {
        Intrinsics.checkNotNullParameter(aliasResolution, "aliasResolution");
        this.f156042a = aliasResolution;
    }

    public /* synthetic */ m(int i) {
        this(new av1.b(""));
    }
}
