package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r80 extends s80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n80 f166145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n80 f166146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n80 f166147c;

    public r80(n80 first, n80 second, n80 third) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(third, "third");
        this.f166145a = first;
        this.f166146b = second;
        this.f166147c = third;
    }

    @Override // ip0.s80
    public final int a() {
        return 32;
    }

    @Override // ip0.s80
    public final int b() {
        return 40;
    }

    @Override // ip0.s80
    public final List c() {
        return zhm.v.k(this.f166145a, this.f166146b, this.f166147c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj2;
        return Intrinsics.f(this.f166145a, r80Var.f166145a) && Intrinsics.f(this.f166146b, r80Var.f166146b) && Intrinsics.f(this.f166147c, r80Var.f166147c);
    }

    public final int hashCode() {
        return this.f166147c.hashCode() + ((this.f166146b.hashCode() + (this.f166145a.hashCode() * 31)) * 31);
    }
}
