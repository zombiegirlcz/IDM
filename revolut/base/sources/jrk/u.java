package jrk;

import java.time.Instant;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import m2l.k0;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new jp9.l(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f178077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f178078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko3.a f178079c;

    public /* synthetic */ u(int i, Instant instant, k0 k0Var, ko3.a aVar) {
        if (5 != (i & 5)) {
            j1.f(s.f178076a.getDescriptor(), i, 5);
            throw null;
        }
        this.f178077a = instant;
        if ((i & 2) == 0) {
            this.f178078b = null;
        } else {
            this.f178078b = k0Var;
        }
        this.f178079c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f178077a, uVar.f178077a) && this.f178078b == uVar.f178078b && Intrinsics.f(this.f178079c, uVar.f178079c);
    }

    public final int hashCode() {
        int iHashCode = this.f178077a.hashCode() * 31;
        k0 k0Var = this.f178078b;
        return this.f178079c.hashCode() + ((iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31);
    }

    public u(Instant date, k0 k0Var, ko3.a price) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f178077a = date;
        this.f178078b = k0Var;
        this.f178079c = price;
    }
}
