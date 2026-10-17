package hul;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f155760c;

    public r(q toolbar, aim.e items, aw0.e actionFooter) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f155758a = toolbar;
        this.f155759b = items;
        this.f155760c = actionFooter;
    }

    @Override // cli.p
    public final List c() {
        return this.f155759b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f155758a, rVar.f155758a) && Intrinsics.f(this.f155759b, rVar.f155759b) && Intrinsics.f(this.f155760c, rVar.f155760c);
    }

    public final int hashCode() {
        return this.f155760c.hashCode() + p.a.d(this.f155758a.hashCode() * 31, 31, this.f155759b);
    }
}
