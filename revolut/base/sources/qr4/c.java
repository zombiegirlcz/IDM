package qr4;

import cli.j;
import hha.w0;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f248647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f248649c;
    public final LocalDate d;
    public final boolean e;

    public c(w0 planTier, dj0.d threshold, dj0.d spent, LocalDate statementDate, boolean z) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        this.f248647a = planTier;
        this.f248648b = threshold;
        this.f248649c = spent;
        this.d = statementDate;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f248647a == cVar.f248647a && Intrinsics.f(this.f248648b, cVar.f248648b) && Intrinsics.f(this.f248649c, cVar.f248649c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + y.a(v7.c(v7.c(this.f248647a.hashCode() * 31, 31, this.f248648b), 31, this.f248649c), 31, this.d);
    }
}
