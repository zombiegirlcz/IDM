package dej;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f113612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f113613c;

    public o2(String id10, Instant dueDate, dj0.d amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f113611a = id10;
        this.f113612b = dueDate;
        this.f113613c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f113611a, o2Var.f113611a) && Intrinsics.f(this.f113612b, o2Var.f113612b) && Intrinsics.f(this.f113613c, o2Var.f113613c);
    }

    public final int hashCode() {
        return this.f113613c.hashCode() + r6.b.c(this.f113611a.hashCode() * 31, 31, this.f113612b);
    }
}
