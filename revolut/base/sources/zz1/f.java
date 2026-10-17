package zz1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f326485c;
    public final String d;

    public f(String operationId, e state, d alias, String str) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f326483a = operationId;
        this.f326484b = state;
        this.f326485c = alias;
        this.d = str;
    }

    public final d a() {
        return this.f326485c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f326483a;
    }

    public final e d() {
        return this.f326484b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f326483a, fVar.f326483a) && this.f326484b == fVar.f326484b && Intrinsics.f(this.f326485c, fVar.f326485c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f326485c.hashCode() + ((this.f326484b.hashCode() + (this.f326483a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
