package gig;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f144205c;
    public final aw0.i d;

    public q(List items, boolean z, i headerState, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f144203a = items;
        this.f144204b = z;
        this.f144205c = headerState;
        this.d = eVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof q) {
            return new p(((q) oldState).f144204b != this.f144204b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f144203a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f144203a, qVar.f144203a) && this.f144204b == qVar.f144204b && Intrinsics.f(this.f144205c, qVar.f144205c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f144205c.hashCode() + j6.a.c(this.f144203a.hashCode() * 31, 31, this.f144204b)) * 31;
        aw0.i iVar = this.d;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
