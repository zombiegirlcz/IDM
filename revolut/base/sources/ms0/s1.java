package ms0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s1 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f208411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f208413c;
    public final r1 d;

    public s1(float f, int i, Clause clause, r1 labelLocation) {
        Intrinsics.checkNotNullParameter(labelLocation, "labelLocation");
        this.f208411a = f;
        this.f208412b = i;
        this.f208413c = clause;
        this.d = labelLocation;
    }

    @Override // ms0.t1
    public final Clause a() {
        return this.f208413c;
    }

    @Override // ms0.t1
    public final r1 b() {
        return this.d;
    }

    @Override // ms0.t1
    public final float c() {
        return this.f208411a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Float.compare(this.f208411a, s1Var.f208411a) == 0 && this.f208412b == s1Var.f208412b && Intrinsics.f(this.f208413c, s1Var.f208413c) && this.d == s1Var.d;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f208412b, Float.hashCode(this.f208411a) * 31, 31);
        Clause clause = this.f208413c;
        return this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public /* synthetic */ s1(float f, int i, TextLocalisedClause textLocalisedClause, int i2) {
        this(f, i, (i2 & 4) != 0 ? null : textLocalisedClause, r1.MIDDLE);
    }
}
