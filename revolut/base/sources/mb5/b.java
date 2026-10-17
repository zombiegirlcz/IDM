package mb5;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();
    public static final List e = zhm.v.k(u.ACH, u.SCHEDULED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f204130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f204132c;
    public final List d;

    public b(long j2, long j3, xi0.b currency, List payments) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f204130a = j2;
        this.f204131b = j3;
        this.f204132c = currency;
        this.d = payments;
    }

    public final s a() {
        Object next;
        Iterator it8 = this.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            u uVar = ((s) next).f204155a;
            if (uVar == u.ACH || uVar == u.DIRECT_DEBIT || uVar == u.SCHEDULED) {
                break;
            }
        }
        return (s) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f204130a == bVar.f204130a && this.f204131b == bVar.f204131b && Intrinsics.f(this.f204132c, bVar.f204132c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f204132c, a0.d.c(Long.hashCode(this.f204130a) * 31, 31, this.f204131b), 31);
    }
}
