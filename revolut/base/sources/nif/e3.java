package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f215781b;

    public e3(String str, d3 promisedAmount) {
        Intrinsics.checkNotNullParameter(promisedAmount, "promisedAmount");
        this.f215780a = str;
        this.f215781b = promisedAmount;
    }

    public final d3 a() {
        return this.f215781b;
    }

    public final String b() {
        return this.f215780a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return Intrinsics.f(this.f215780a, e3Var.f215780a) && Intrinsics.f(this.f215781b, e3Var.f215781b);
    }

    public final int hashCode() {
        String str = this.f215780a;
        return this.f215781b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
