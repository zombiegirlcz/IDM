package wrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f299628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f299629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f299630c;

    public a(b ask2, b bid2, b last) {
        Intrinsics.checkNotNullParameter(ask2, "ask");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        Intrinsics.checkNotNullParameter(last, "last");
        this.f299628a = ask2;
        this.f299629b = bid2;
        this.f299630c = last;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299628a, aVar.f299628a) && Intrinsics.f(this.f299629b, aVar.f299629b) && Intrinsics.f(this.f299630c, aVar.f299630c);
    }

    public final int hashCode() {
        return this.f299630c.hashCode() + ((this.f299629b.hashCode() + (this.f299628a.hashCode() * 31)) * 31);
    }
}
