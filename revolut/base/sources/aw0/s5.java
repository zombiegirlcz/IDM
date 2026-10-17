package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s5 {

    @NotNull
    public static final r5 Companion = new r5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10523c;
    public final Integer d;

    public s5(float f, Clause clause, int i, Integer num) {
        this.f10521a = f;
        this.f10522b = clause;
        this.f10523c = i;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Float.compare(this.f10521a, s5Var.f10521a) == 0 && Intrinsics.f(this.f10522b, s5Var.f10522b) && this.f10523c == s5Var.f10523c && Intrinsics.f(this.d, s5Var.d);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10521a) * 31;
        Clause clause = this.f10522b;
        int iB = j6.a.b(this.f10523c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Integer num = this.d;
        return iB + (num != null ? num.hashCode() : 0);
    }
}
