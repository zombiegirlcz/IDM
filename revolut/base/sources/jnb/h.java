package jnb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f176674b;

    public h(List items, f screenHeader) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenHeader, "screenHeader");
        this.f176673a = items;
        this.f176674b = screenHeader;
    }

    @Override // cli.p
    public final List c() {
        return this.f176673a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f176673a, hVar.f176673a) && Intrinsics.f(this.f176674b, hVar.f176674b);
    }

    public final int hashCode() {
        return this.f176674b.hashCode() + (this.f176673a.hashCode() * 31);
    }
}
