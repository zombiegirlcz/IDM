package rnd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uib.c f255605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f255606c;
    public final String d;
    public final ncd.j e;
    public final boolean f;

    public e(String name, uib.c umbrellaNameType, dj0.d balance, String childFirstName, ncd.j displayRate, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(childFirstName, "childFirstName");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.f255604a = name;
        this.f255605b = umbrellaNameType;
        this.f255606c = balance;
        this.d = childFirstName;
        this.e = displayRate;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f255604a, eVar.f255604a) && this.f255605b == eVar.f255605b && Intrinsics.f(this.f255606c, eVar.f255606c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + p.a.c(v7.c((this.f255605b.hashCode() + (this.f255604a.hashCode() * 31)) * 31, 31, this.f255606c), 31, this.d)) * 31);
    }
}
