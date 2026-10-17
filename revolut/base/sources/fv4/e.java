package fv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f138324b;

    public e(List statements, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(statements, "statements");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f138323a = statements;
        this.f138324b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f138323a, eVar.f138323a) && Intrinsics.f(this.f138324b, eVar.f138324b);
    }

    public final int hashCode() {
        return this.f138324b.f297794a.hashCode() + (this.f138323a.hashCode() * 31);
    }
}
