package rnd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uib.c f255590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f255591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f255592c;

    public a(uib.c umbrellaNameType, dj0.d balance, int i) {
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f255590a = umbrellaNameType;
        this.f255591b = balance;
        this.f255592c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f255590a == aVar.f255590a && Intrinsics.f(this.f255591b, aVar.f255591b) && this.f255592c == aVar.f255592c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255592c) + v7.c(this.f255590a.hashCode() * 31, 31, this.f255591b);
    }
}
