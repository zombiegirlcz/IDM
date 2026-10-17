package jk5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f175092b;

    public d(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f175091a = items;
        this.f175092b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f175091a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f175091a, dVar.f175091a) && Intrinsics.f(this.f175092b, dVar.f175092b);
    }

    public final int hashCode() {
        return this.f175092b.hashCode() + (this.f175091a.hashCode() * 31);
    }
}
