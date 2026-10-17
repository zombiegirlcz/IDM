package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q3 {

    @NotNull
    public static final p3 Companion = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f153266b;

    public /* synthetic */ q3(int i, dj0.d dVar, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(o3.f153241a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153265a = str;
        this.f153266b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f153265a, q3Var.f153265a) && Intrinsics.f(this.f153266b, q3Var.f153266b);
    }

    public final int hashCode() {
        return this.f153266b.hashCode() + (this.f153265a.hashCode() * 31);
    }

    public q3(dj0.d payment, String cancellationDate) {
        Intrinsics.checkNotNullParameter(cancellationDate, "cancellationDate");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f153265a = cancellationDate;
        this.f153266b = payment;
    }
}
