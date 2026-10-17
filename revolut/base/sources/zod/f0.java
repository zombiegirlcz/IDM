package zod;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f323985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynd.k f323986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f323987c;

    public f0(dj0.d currentValue, ynd.k earnings, g gVar) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(earnings, "earnings");
        this.f323985a = currentValue;
        this.f323986b = earnings;
        this.f323987c = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f323985a.equals(f0Var.f323985a) && Intrinsics.f(this.f323986b, f0Var.f323986b) && this.f323987c.equals(f0Var.f323987c);
    }

    public final int hashCode() {
        return this.f323987c.hashCode() + v7.c(this.f323985a.hashCode() * 31, 31, this.f323986b.f315459a);
    }
}
