package um;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.a f281172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f281173b;

    public a(mm.a action, Throwable error) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f281172a = action;
        this.f281173b = error;
    }

    public final mm.a a() {
        return this.f281172a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281172a, aVar.f281172a) && Intrinsics.f(this.f281173b, aVar.f281173b);
    }

    public final int hashCode() {
        return this.f281173b.hashCode() + (this.f281172a.hashCode() * 31);
    }
}
