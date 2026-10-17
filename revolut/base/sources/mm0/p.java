package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f207119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q token) {
        super(0);
        Intrinsics.checkNotNullParameter(token, "token");
        this.f207119b = token;
    }

    @Override // mm0.o
    public final q a() {
        return this.f207119b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f207119b, ((p) obj2).f207119b);
    }

    public final int hashCode() {
        return this.f207119b.hashCode();
    }
}
