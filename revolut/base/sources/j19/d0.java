package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k19.c f170186c;
    public final String d;
    public final k19.q e;

    public /* synthetic */ d0(int i, String str, String str2, k19.c cVar, String str3, k19.q qVar) {
        if (23 != (i & 23)) {
            qlm.j1.f(b0.f170172a.getDescriptor(), i, 23);
            throw null;
        }
        this.f170184a = str;
        this.f170185b = str2;
        this.f170186c = cVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f170184a, d0Var.f170184a) && Intrinsics.f(this.f170185b, d0Var.f170185b) && Intrinsics.f(this.f170186c, d0Var.f170186c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f170186c.hashCode() + p.a.c(this.f170184a.hashCode() * 31, 31, this.f170185b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
