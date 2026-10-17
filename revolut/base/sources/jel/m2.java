package jel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f173510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f173511c;

    public m2(String placeholder, t2 t2Var, LocalDate value) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173509a = placeholder;
        this.f173510b = t2Var;
        this.f173511c = value;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173509a;
    }

    @Override // jel.s2
    public final t2 b() {
        return this.f173510b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f173509a, m2Var.f173509a) && this.f173510b == m2Var.f173510b && Intrinsics.f(this.f173511c, m2Var.f173511c);
    }

    public final int hashCode() {
        int iHashCode = this.f173509a.hashCode() * 31;
        t2 t2Var = this.f173510b;
        return this.f173511c.hashCode() + ((iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31);
    }
}
