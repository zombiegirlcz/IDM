package usj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f282975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282976b;

    public /* synthetic */ x(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(v.f282974a.getDescriptor(), i, 3);
            throw null;
        }
        this.f282975a = j2;
        this.f282976b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f282975a == xVar.f282975a && Intrinsics.f(this.f282976b, xVar.f282976b);
    }

    public final int hashCode() {
        return this.f282976b.hashCode() + (Long.hashCode(this.f282975a) * 31);
    }

    public x(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f282975a = j2;
        this.f282976b = currency;
    }
}
