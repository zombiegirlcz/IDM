package rq4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f256465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f256466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f256467c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public j(Data content, Long l2, Long l3, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f256465a = content;
        this.f256466b = l2;
        this.f256467c = l3;
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    public static j a(j jVar, Data data, Long l2, Long l3, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = jVar.f256465a;
        }
        Data content = data;
        if ((i & 2) != 0) {
            l2 = jVar.f256466b;
        }
        Long l4 = l2;
        if ((i & 4) != 0) {
            l3 = jVar.f256467c;
        }
        Long l5 = l3;
        if ((i & 8) != 0) {
            z = jVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = jVar.e;
        }
        boolean z6 = jVar.f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new j(content, l4, l5, z4, z3, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f256465a, jVar.f256465a) && Intrinsics.f(this.f256466b, jVar.f256466b) && Intrinsics.f(this.f256467c, jVar.f256467c) && this.d == jVar.d && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f256465a.hashCode() * 31;
        Long l2 = this.f256466b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f256467c;
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
