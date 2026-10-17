package h26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f148711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148712b;

    public /* synthetic */ c(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f148710a.getDescriptor(), i, 3);
            throw null;
        }
        this.f148711a = j2;
        this.f148712b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f148711a == cVar.f148711a && Intrinsics.f(this.f148712b, cVar.f148712b);
    }

    public final int hashCode() {
        return this.f148712b.hashCode() + (Long.hashCode(this.f148711a) * 31);
    }

    public c(long j2, String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f148711a = j2;
        this.f148712b = rate;
    }
}
