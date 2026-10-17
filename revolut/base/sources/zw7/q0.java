package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f325834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f325835c;
    public final p0 d;

    public q0(String petId, LocalDate renewalDate, boolean z, p0 renewalQuote) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(renewalDate, "renewalDate");
        Intrinsics.checkNotNullParameter(renewalQuote, "renewalQuote");
        this.f325833a = petId;
        this.f325834b = renewalDate;
        this.f325835c = z;
        this.d = renewalQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f325833a, q0Var.f325833a) && Intrinsics.f(this.f325834b, q0Var.f325834b) && this.f325835c == q0Var.f325835c && Intrinsics.f(this.d, q0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(com.revolut.data.database.models.openbanking.d.g(this.f325834b, this.f325833a.hashCode() * 31, 31), 31, this.f325835c);
    }
}
