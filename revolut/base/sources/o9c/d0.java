package o9c;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f223188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f223189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f223190c;

    public d0(int i, Clause clause, c0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f223188a = i;
        this.f223189b = clause;
        this.f223190c = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f223188a == d0Var.f223188a && Intrinsics.f(this.f223189b, d0Var.f223189b) && Intrinsics.f(this.f223190c, d0Var.f223190c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f223188a) * 31;
        Clause clause = this.f223189b;
        return this.f223190c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
