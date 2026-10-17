package knd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f186104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f186105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f186106c;
    public final Interval d;

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        zhm.h0 h0Var = zhm.h0.f322473a;
        this(false, h0Var, h0Var, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f186104a == lVar.f186104a && Intrinsics.f(this.f186105b, lVar.f186105b) && Intrinsics.f(this.f186106c, lVar.f186106c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f(p.a.f(Boolean.hashCode(this.f186104a) * 31, 31, this.f186105b), 31, this.f186106c);
        Interval interval = this.d;
        return iF + (interval == null ? 0 : interval.hashCode());
    }

    public l(boolean z, Set includedTransactionIds, Set excludedTransactionIds, Interval interval) {
        Intrinsics.checkNotNullParameter(includedTransactionIds, "includedTransactionIds");
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f186104a = z;
        this.f186105b = includedTransactionIds;
        this.f186106c = excludedTransactionIds;
        this.d = interval;
    }
}
