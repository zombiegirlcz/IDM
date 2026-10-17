package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f207114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q token) {
        super(0);
        Intrinsics.checkNotNullParameter(token, "token");
        this.f207114b = token;
    }

    @Override // mm0.o
    public final q a() {
        return this.f207114b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f207114b, ((m) obj2).f207114b);
    }

    public final int hashCode() {
        return this.f207114b.hashCode();
    }
}
