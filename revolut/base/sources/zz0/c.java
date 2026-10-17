package zz0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f326474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f326475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f326476c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f326477g;

    public c(f source, a aVar, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f326474a = source;
        this.f326475b = aVar;
        this.f326476c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
        this.f326477g = i6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f326474a == cVar.f326474a && Intrinsics.f(this.f326475b, cVar.f326475b) && this.f326476c == cVar.f326476c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.f326477g == cVar.f326477g;
    }

    public final int hashCode() {
        int iHashCode = this.f326474a.hashCode() * 31;
        a aVar = this.f326475b;
        return Integer.hashCode(this.f326477g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f326476c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31), 31);
    }
}
