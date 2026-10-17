package flc;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f135941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f135943c;
    public final d d;

    public a(d investment, d percentile25, d percentile50, d percentile75) {
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(percentile25, "percentile25");
        Intrinsics.checkNotNullParameter(percentile50, "percentile50");
        Intrinsics.checkNotNullParameter(percentile75, "percentile75");
        this.f135941a = investment;
        this.f135942b = percentile25;
        this.f135943c = percentile50;
        this.d = percentile75;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135941a, aVar.f135941a) && Intrinsics.f(this.f135942b, aVar.f135942b) && Intrinsics.f(this.f135943c, aVar.f135943c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f135941a.hashCode() * 31, 31, this.f135942b), 31, this.f135943c);
    }
}
