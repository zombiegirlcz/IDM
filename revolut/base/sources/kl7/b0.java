package kl7;

import java.time.LocalDate;
import kkf.z5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final x Companion = new x();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f185296c;
    public final LocalDate d;
    public final z e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f185297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f185298h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, yhm.j.c(kVar, new z5(23)), null, yhm.j.c(kVar, new z5(24)), null, null, null};
    }

    public /* synthetic */ b0(int i2, String str, String str2, y yVar, LocalDate localDate, z zVar, wi0.b bVar, String str3, String str4) {
        if (31 != (i2 & 31)) {
            qlm.j1.f(w.f185401a.getDescriptor(), i2, 31);
            throw null;
        }
        this.f185294a = str;
        this.f185295b = str2;
        this.f185296c = yVar;
        this.d = localDate;
        this.e = zVar;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = bVar;
        }
        if ((i2 & 64) == 0) {
            this.f185297g = null;
        } else {
            this.f185297g = str3;
        }
        if ((i2 & 128) == 0) {
            this.f185298h = null;
        } else {
            this.f185298h = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f185294a, b0Var.f185294a) && Intrinsics.f(this.f185295b, b0Var.f185295b) && this.f185296c == b0Var.f185296c && Intrinsics.f(this.d, b0Var.d) && this.e == b0Var.e && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f185297g, b0Var.f185297g) && Intrinsics.f(this.f185298h, b0Var.f185298h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + wp5.y.a((this.f185296c.hashCode() + p.a.c(this.f185294a.hashCode() * 31, 31, this.f185295b)) * 31, 31, this.d)) * 31;
        wi0.b bVar = this.f;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        String str = this.f185297g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f185298h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
