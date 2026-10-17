package xn8;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f307341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307342b;

    public f(ArrayList items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f307341a = header;
        this.f307342b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f307342b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f307341a.equals(fVar.f307341a) && this.f307342b.equals(fVar.f307342b);
    }

    public final int hashCode() {
        return this.f307342b.hashCode() + (this.f307341a.hashCode() * 31);
    }
}
