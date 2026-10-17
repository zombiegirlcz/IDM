package u6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f277543b;

    public a0(String str, List additionalConditions) {
        Intrinsics.checkNotNullParameter(additionalConditions, "additionalConditions");
        this.f277542a = str;
        this.f277543b = additionalConditions;
    }

    @Override // u6c.f0
    public final boolean a() {
        return true;
    }

    @Override // u6c.f0
    public final String b() {
        return this.f277542a;
    }

    @Override // u6c.f0
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f277542a, a0Var.f277542a) && Intrinsics.f(this.f277543b, a0Var.f277543b);
    }

    public final int hashCode() {
        String str = this.f277542a;
        return this.f277543b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
