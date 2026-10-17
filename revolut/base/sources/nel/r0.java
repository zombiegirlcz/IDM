package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f214615a;

    public r0(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f214615a = instrument;
    }

    @Override // nel.w0
    public final boolean a() {
        return false;
    }

    @Override // nel.w0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f214615a, ((r0) obj2).f214615a);
    }

    public final int hashCode() {
        return this.f214615a.hashCode();
    }

    @Override // nel.w0
    public final n n() {
        return this.f214615a;
    }
}
