package j2f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f170854b;

    public l(List items, i header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f170853a = items;
        this.f170854b = header;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof l) {
            return new j(!Intrinsics.f(((l) oldState).f170854b, this.f170854b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f170853a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f170853a, lVar.f170853a) && Intrinsics.f(this.f170854b, lVar.f170854b);
    }

    public final int hashCode() {
        return this.f170854b.hashCode() + (this.f170853a.hashCode() * 31);
    }
}
