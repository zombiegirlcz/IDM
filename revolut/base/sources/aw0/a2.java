package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10223b;

    public a2(float f, Clause clause) {
        this.f10222a = f;
        this.f10223b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Float.compare(this.f10222a, a2Var.f10222a) == 0 && Intrinsics.f(this.f10223b, a2Var.f10223b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10222a) * 31;
        Clause clause = this.f10223b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
