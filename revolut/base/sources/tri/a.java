package tri;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f273797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f273798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f273799c;
    public final long d;

    public a(int i, Function0 action, b type, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f273797a = i;
        this.f273798b = action;
        this.f273799c = type;
        this.d = j2;
    }

    public final Function0 a() {
        return this.f273798b;
    }

    public final int b() {
        return this.f273797a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        a other = (a) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        b bVar = other.f273799c;
        b bVar2 = this.f273799c;
        return bVar != bVar2 ? Intrinsics.k(bVar2.a(), other.f273799c.a()) : Intrinsics.l(other.d, this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f273797a == aVar.f273797a && Intrinsics.f(this.f273798b, aVar.f273798b) && this.f273799c == aVar.f273799c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.f273799c.hashCode() + ((this.f273798b.hashCode() + (Integer.hashCode(this.f273797a) * 31)) * 31)) * 31);
    }
}
