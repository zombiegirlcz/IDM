package ehk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfk.a f126203a;

    public a(xfk.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f126203a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f126203a, ((a) obj2).f126203a);
    }

    public final int hashCode() {
        return this.f126203a.hashCode();
    }
}
