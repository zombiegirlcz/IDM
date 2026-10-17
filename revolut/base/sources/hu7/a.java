package hu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu7.k f155567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155568b;

    public a(bu7.k coverageGroup) {
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        this.f155567a = coverageGroup;
        this.f155568b = "COVERAGE_" + coverageGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f155567a == ((a) obj2).f155567a;
    }

    public final int hashCode() {
        return this.f155567a.hashCode();
    }
}
