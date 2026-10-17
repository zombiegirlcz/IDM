package yw6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw6.a f317339b;

    public f(List items, xw6.a header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f317338a = items;
        this.f317339b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f317338a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f317338a, fVar.f317338a) && Intrinsics.f(this.f317339b, fVar.f317339b);
    }

    public final int hashCode() {
        return this.f317339b.hashCode() + (this.f317338a.hashCode() * 31);
    }
}
