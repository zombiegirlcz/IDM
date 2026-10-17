package zfi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f321990c;
    public final dj0.d d;

    public p(String queryParamMin, String queryParamMax, dj0.d minValue, dj0.d maxValue) {
        Intrinsics.checkNotNullParameter(queryParamMin, "queryParamMin");
        Intrinsics.checkNotNullParameter(queryParamMax, "queryParamMax");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f321988a = queryParamMin;
        this.f321989b = queryParamMax;
        this.f321990c = minValue;
        this.d = maxValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f321988a, pVar.f321988a) && Intrinsics.f(this.f321989b, pVar.f321989b) && Intrinsics.f(this.f321990c, pVar.f321990c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f321988a.hashCode() * 31, 31, this.f321989b), 31, this.f321990c);
    }
}
