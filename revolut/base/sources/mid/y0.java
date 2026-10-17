package mid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205782c;

    public y0(String str) {
        this.f205782c = str;
        w0.Companion.getClass();
    }

    @Override // mid.w0
    public final aw0.d0 a() {
        return w0.f205770b;
    }

    @Override // mid.w0
    public final String b() {
        return this.f205782c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f205782c, ((y0) obj2).f205782c);
    }

    public final int hashCode() {
        String str = this.f205782c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
