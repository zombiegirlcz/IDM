package we6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f296695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f296696c;

    public y0(dj0.d limitPerTransfer, dj0.d limitPerMonth, String issuerInstitutionId) {
        Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        this.f296694a = issuerInstitutionId;
        this.f296695b = limitPerTransfer;
        this.f296696c = limitPerMonth;
    }

    public final String a() {
        return this.f296694a;
    }

    public final dj0.d b() {
        return this.f296696c;
    }

    public final dj0.d c() {
        return this.f296695b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f296694a, y0Var.f296694a) && Intrinsics.f(this.f296695b, y0Var.f296695b) && Intrinsics.f(this.f296696c, y0Var.f296696c);
    }

    public final int hashCode() {
        return this.f296696c.hashCode() + v7.c(this.f296694a.hashCode() * 31, 31, this.f296695b);
    }
}
