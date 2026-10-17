package r3b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f251257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f251258b;

    public o(m header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251257a = header;
        this.f251258b = items;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        o oVar = oldState instanceof o ? (o) oldState : null;
        if (oVar == null) {
            return null;
        }
        m mVar = oVar.f251257a;
        return new n(this.f251257a.f251251a != mVar.f251251a, !r1.f251252b.equals(mVar.f251252b), !Intrinsics.f(r1.d, mVar.d), !Intrinsics.f(r1.f251253c, mVar.f251253c));
    }

    @Override // cli.p
    public final List c() {
        return this.f251258b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f251257a, oVar.f251257a) && Intrinsics.f(this.f251258b, oVar.f251258b);
    }

    public final int hashCode() {
        return this.f251258b.hashCode() + (this.f251257a.hashCode() * 31);
    }
}
