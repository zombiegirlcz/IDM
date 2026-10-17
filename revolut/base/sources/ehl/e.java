package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126244c;
    public final jo3.b d;

    public e(String symbol, String ref2, LocalDate localDate, jo3.b amount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f126242a = symbol;
        this.f126243b = ref2;
        this.f126244c = localDate;
        this.d = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126242a, eVar.f126242a) && Intrinsics.f(this.f126243b, eVar.f126243b) && Intrinsics.f(this.f126244c, eVar.f126244c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126242a.hashCode() * 31, 31, this.f126243b);
        LocalDate localDate = this.f126244c;
        return this.d.hashCode() + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
