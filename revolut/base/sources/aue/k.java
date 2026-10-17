package aue;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f9816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f9817c;
    public final dj0.d d;
    public final j e;

    public k(c type, dj0.d totalLimit, dj0.d usedLimit, dj0.d remainingLimit, j jVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        this.f9815a = type;
        this.f9816b = totalLimit;
        this.f9817c = usedLimit;
        this.d = remainingLimit;
        this.e = jVar;
    }

    @Override // aue.l
    public final c a() {
        return this.f9815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f9815a == kVar.f9815a && Intrinsics.f(this.f9816b, kVar.f9816b) && Intrinsics.f(this.f9817c, kVar.f9817c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(this.f9815a.hashCode() * 31, 31, this.f9816b), 31, this.f9817c), 31, this.d);
        j jVar = this.e;
        return iC + (jVar == null ? 0 : jVar.hashCode());
    }
}
