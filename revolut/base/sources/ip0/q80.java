package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q80 extends s80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n80 f165936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o80 f165937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o80 f165938c;
    public final o80 d;
    public final n80 e;
    public final Clause f;

    public q80(n80 first, o80 second, o80 third, o80 fourth, n80 fifth, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(third, "third");
        Intrinsics.checkNotNullParameter(fourth, "fourth");
        Intrinsics.checkNotNullParameter(fifth, "fifth");
        this.f165936a = first;
        this.f165937b = second;
        this.f165938c = third;
        this.d = fourth;
        this.e = fifth;
        this.f = textLocalisedClause;
    }

    @Override // ip0.s80
    public final int a() {
        return 26;
    }

    @Override // ip0.s80
    public final int b() {
        return 32;
    }

    @Override // ip0.s80
    public final List c() {
        return zhm.v.k(this.f165936a, this.f165937b, this.f165938c, this.d, this.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj2;
        return Intrinsics.f(this.f165936a, q80Var.f165936a) && Intrinsics.f(this.f165937b, q80Var.f165937b) && Intrinsics.f(this.f165938c, q80Var.f165938c) && Intrinsics.f(this.d, q80Var.d) && Intrinsics.f(this.e, q80Var.e) && Intrinsics.f(this.f, q80Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.f165637a.hashCode() + ((this.f165938c.f165637a.hashCode() + ((this.f165937b.f165637a.hashCode() + (this.f165936a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Clause clause = this.f;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
