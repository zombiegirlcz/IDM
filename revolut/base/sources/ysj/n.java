package ysj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f316492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316493b;

    public /* synthetic */ n(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(l.f316491a.getDescriptor(), i, 3);
            throw null;
        }
        this.f316492a = j2;
        this.f316493b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f316492a == nVar.f316492a && Intrinsics.f(this.f316493b, nVar.f316493b);
    }

    public final int hashCode() {
        return this.f316493b.hashCode() + (Long.hashCode(this.f316492a) * 31);
    }

    public n(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f316492a = j2;
        this.f316493b = currency;
    }
}
