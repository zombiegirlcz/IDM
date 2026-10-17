package a8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f2197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f2198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2199c;
    public final String d;
    public final l0 e;
    public final String f;

    public /* synthetic */ a0(int i, i0 i0Var, i0 i0Var2, String str, String str2, l0 l0Var, String str3) {
        if (55 != (i & 55)) {
            j1.f(y.f2246a.getDescriptor(), i, 55);
            throw null;
        }
        this.f2197a = i0Var;
        this.f2198b = i0Var2;
        this.f2199c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        this.e = l0Var;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f2197a, a0Var.f2197a) && Intrinsics.f(this.f2198b, a0Var.f2198b) && Intrinsics.f(this.f2199c, a0Var.f2199c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f2198b.hashCode() + (this.f2197a.hashCode() * 31)) * 31, 31, this.f2199c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public a0(i0 origin, i0 destination, String departureDate, String str, l0 passengers, String cabinClass) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        this.f2197a = origin;
        this.f2198b = destination;
        this.f2199c = departureDate;
        this.d = str;
        this.e = passengers;
        this.f = cabinClass;
    }
}
