package xc8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f304106c;
    public final e d;
    public final long e;

    public f(String id10, String juniorId, d code, e state, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f304104a = id10;
        this.f304105b = juniorId;
        this.f304106c = code;
        this.d = state;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304104a, fVar.f304104a) && Intrinsics.f(this.f304105b, fVar.f304105b) && this.f304106c == fVar.f304106c && this.d == fVar.d && this.e == fVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + ((this.f304106c.hashCode() + p.a.c(this.f304104a.hashCode() * 31, 31, this.f304105b)) * 31)) * 31);
    }
}
