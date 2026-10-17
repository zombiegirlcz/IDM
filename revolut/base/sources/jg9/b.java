package jg9;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f173937a;

    public b(YearMonth value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173937a = value;
    }

    @Override // jg9.f
    public final String a() {
        return p.a.p("DateMonth(value=", this.f173937a.getMonth().name(), ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f173937a, ((b) obj2).f173937a);
    }

    public final int hashCode() {
        return this.f173937a.hashCode();
    }
}
