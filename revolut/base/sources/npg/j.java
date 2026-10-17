package npg;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import pcd.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f218217c;
    public final h0 d;
    public final LocalDateTime e;
    public final String f;

    public j(String id10, String name, dj0.d balance, h0 state, LocalDateTime createdDate, String productId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f218215a = id10;
        this.f218216b = name;
        this.f218217c = balance;
        this.d = state;
        this.e = createdDate;
        this.f = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f218215a, jVar.f218215a) && Intrinsics.f(this.f218216b, jVar.f218216b) && Intrinsics.f(this.f218217c, jVar.f218217c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.i(this.e, (this.d.hashCode() + v7.c(p.a.c(this.f218215a.hashCode() * 31, 31, this.f218216b), 31, this.f218217c)) * 31, 31);
    }
}
