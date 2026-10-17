package mid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205778c;

    public x0(String str) {
        this.f205778c = str;
        w0.Companion.getClass();
    }

    @Override // mid.w0
    public final aw0.d0 a() {
        return w0.f205769a;
    }

    @Override // mid.w0
    public final String b() {
        return this.f205778c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && Intrinsics.f(this.f205778c, ((x0) obj2).f205778c);
    }

    public final int hashCode() {
        String str = this.f205778c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
