package ahg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5122b;

    public l(List items, i header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f5121a = items;
        this.f5122b = header;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof l) {
            return new j(!Intrinsics.f(((l) oldState).f5122b, this.f5122b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f5121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f5121a, lVar.f5121a) && Intrinsics.f(this.f5122b, lVar.f5122b);
    }

    public final int hashCode() {
        return this.f5122b.hashCode() + (this.f5121a.hashCode() * 31);
    }
}
