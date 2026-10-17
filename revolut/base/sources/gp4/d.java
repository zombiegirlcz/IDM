package gp4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f145249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145250b;

    public d(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145249a = header;
        this.f145250b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f145250b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f145249a.equals(dVar.f145249a) && Intrinsics.f(this.f145250b, dVar.f145250b);
    }

    public final int hashCode() {
        return this.f145250b.hashCode() + (this.f145249a.hashCode() * 31);
    }
}
