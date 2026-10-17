package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h5 implements k5 {

    @NotNull
    public static final g5 Companion = new g5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10339b;

    public h5(Clause clause, Clause clause2) {
        this.f10338a = clause;
        this.f10339b = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj2;
        return Intrinsics.f(this.f10338a, h5Var.f10338a) && Intrinsics.f(this.f10339b, h5Var.f10339b);
    }

    @Override // aw0.k5
    public final Clause getContentDescription() {
        return this.f10339b;
    }

    public final int hashCode() {
        Clause clause = this.f10338a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f10339b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
