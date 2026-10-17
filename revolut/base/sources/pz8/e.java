package pz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f240912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240913b;

    public /* synthetic */ e(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(c.f240911a.getDescriptor(), i, 3);
            throw null;
        }
        this.f240912a = j2;
        this.f240913b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f240912a == eVar.f240912a && Intrinsics.f(this.f240913b, eVar.f240913b);
    }

    public final int hashCode() {
        return this.f240913b.hashCode() + (Long.hashCode(this.f240912a) * 31);
    }

    public e(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f240912a = j2;
        this.f240913b = currency;
    }
}
