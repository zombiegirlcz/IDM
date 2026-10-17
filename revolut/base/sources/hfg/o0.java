package hfg;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f151878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f151879c;
    public final ArrayList d;
    public final p0 e;

    public o0(String id10, Instant createdDate, Instant updatedDate, ArrayList transactions, p0 p0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f151877a = id10;
        this.f151878b = createdDate;
        this.f151879c = updatedDate;
        this.d = transactions;
        this.e = p0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f151877a, o0Var.f151877a) && Intrinsics.f(this.f151878b, o0Var.f151878b) && Intrinsics.f(this.f151879c, o0Var.f151879c) && this.d.equals(o0Var.d) && this.e == o0Var.e;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, r6.b.c(r6.b.c(this.f151877a.hashCode() * 31, 31, this.f151878b), 31, this.f151879c), 31);
        p0 p0Var = this.e;
        return iB + (p0Var == null ? 0 : p0Var.hashCode());
    }
}
