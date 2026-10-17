package lv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl4.g f200295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f200296b;

    public f(vl4.g statement, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f200295a = statement;
        this.f200296b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f200295a, fVar.f200295a) && Intrinsics.f(this.f200296b, fVar.f200296b);
    }

    public final int hashCode() {
        return this.f200296b.f297794a.hashCode() + (this.f200295a.hashCode() * 31);
    }
}
