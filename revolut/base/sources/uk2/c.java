package uk2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f280644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280645b;

    public c(List items, lw0.m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280644a = header;
        this.f280645b = items;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof cli.p)) {
            return null;
        }
        List listC = ((cli.p) oldState).c();
        List list = this.f280645b;
        return new b(!Intrinsics.f(listC, list), !Intrinsics.f(r4.c(), list));
    }

    @Override // cli.p
    public final List c() {
        return this.f280645b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280644a, cVar.f280644a) && Intrinsics.f(this.f280645b, cVar.f280645b);
    }

    public final int hashCode() {
        return this.f280645b.hashCode() + (this.f280644a.hashCode() * 31);
    }
}
