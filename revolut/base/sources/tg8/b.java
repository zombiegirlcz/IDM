package tg8;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f271107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271108c;

    public b(d balance, a type, String name) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f271106a = balance;
        this.f271107b = type;
        this.f271108c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f271106a, bVar.f271106a) && this.f271107b == bVar.f271107b && Intrinsics.f(this.f271108c, bVar.f271108c);
    }

    public final int hashCode() {
        return this.f271108c.hashCode() + ((this.f271107b.hashCode() + (this.f271106a.hashCode() * 31)) * 31);
    }
}
