package t4c;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f267971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f267972b;

    public c(xi0.b currency) {
        a breakdownStyle = a.VERBOSE;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(breakdownStyle, "breakdownStyle");
        this.f267971a = currency;
        this.f267972b = breakdownStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267971a, cVar.f267971a) && this.f267972b == cVar.f267972b;
    }

    public final int hashCode() {
        return this.f267972b.hashCode() + (this.f267971a.hashCode() * 31);
    }
}
