package eq8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128371b;

    public c0(List tasks, List coparents) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        this.f128370a = tasks;
        this.f128371b = coparents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f128370a, c0Var.f128370a) && Intrinsics.f(this.f128371b, c0Var.f128371b);
    }

    public final int hashCode() {
        return this.f128371b.hashCode() + (this.f128370a.hashCode() * 31);
    }
}
