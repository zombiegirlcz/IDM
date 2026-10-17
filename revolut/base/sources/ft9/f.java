package ft9;

import do3.n;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f137965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f137966b;

    public f(c0 settlement, n user) {
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f137965a = settlement;
        this.f137966b = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137965a, fVar.f137965a) && Intrinsics.f(this.f137966b, fVar.f137966b);
    }

    public final int hashCode() {
        return this.f137966b.hashCode() + (this.f137965a.hashCode() * 31);
    }
}
