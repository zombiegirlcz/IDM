package kl7;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f185403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185404b;

    public x1(String applicationFormId, YearMonth date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
        this.f185403a = date;
        this.f185404b = applicationFormId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f185403a, x1Var.f185403a) && Intrinsics.f(this.f185404b, x1Var.f185404b);
    }

    public final int hashCode() {
        return this.f185404b.hashCode() + (this.f185403a.hashCode() * 31);
    }
}
