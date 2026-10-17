package jhk;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f174293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f174295c;
    public final boolean d;

    public j(Clause clause, boolean z, Integer num, boolean z3) {
        this.f174293a = clause;
        this.f174294b = z;
        this.f174295c = num;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f174293a, jVar.f174293a) && this.f174294b == jVar.f174294b && Intrinsics.f(this.f174295c, jVar.f174295c) && this.d == jVar.d;
    }

    public final int hashCode() {
        Clause clause = this.f174293a;
        int iC = j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f174294b);
        Integer num = this.f174295c;
        return Boolean.hashCode(this.d) + ((iC + (num != null ? num.hashCode() : 0)) * 31);
    }
}
