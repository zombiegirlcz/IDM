package tob;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f272566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272567b;

    public g(List items, m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272566a = header;
        this.f272567b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f272567b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f272566a, gVar.f272566a) && Intrinsics.f(this.f272567b, gVar.f272567b);
    }

    public final int hashCode() {
        return this.f272567b.hashCode() + (this.f272566a.hashCode() * 31);
    }
}
