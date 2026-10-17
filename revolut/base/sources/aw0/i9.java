package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f10362c;

    public i9(Clause value, Clause clause, Float f) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10360a = value;
        this.f10361b = clause;
        this.f10362c = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static i9 a(i9 i9Var, Float f) {
        ?? value = i9Var.f10360a;
        Clause clause = i9Var.f10361b;
        i9Var.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return new i9(value, clause, f);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj2;
        return this.f10360a.equals(i9Var.f10360a) && Intrinsics.f(this.f10361b, i9Var.f10361b) && Intrinsics.f(this.f10362c, i9Var.f10362c);
    }

    public final int hashCode() {
        int iHashCode = this.f10360a.hashCode() * 31;
        Clause clause = this.f10361b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Float f = this.f10362c;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }
}
