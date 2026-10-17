package v58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r58.c f286160a;

    public a(r58.c result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f286160a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f286160a, ((a) obj2).f286160a);
    }

    public final int hashCode() {
        return this.f286160a.hashCode();
    }
}
