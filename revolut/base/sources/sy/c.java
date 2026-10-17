package sy;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f266533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv.l f266534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f266535c;
    public final gv.d d;
    public final Locale e;
    public final boolean f;

    public c(boolean z, xv.l lVar, boolean z3, gv.d screenFlashState, Locale locale, boolean z4) {
        Intrinsics.checkNotNullParameter(screenFlashState, "screenFlashState");
        this.f266533a = z;
        this.f266534b = lVar;
        this.f266535c = z3;
        this.d = screenFlashState;
        this.e = locale;
        this.f = z4;
    }

    public static c a(c cVar, boolean z, xv.l lVar, boolean z3, gv.d dVar, Locale locale, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = cVar.f266533a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            lVar = cVar.f266534b;
        }
        xv.l lVar2 = lVar;
        if ((i & 4) != 0) {
            z3 = cVar.f266535c;
        }
        boolean z11 = z3;
        if ((i & 8) != 0) {
            dVar = cVar.d;
        }
        gv.d screenFlashState = dVar;
        if ((i & 16) != 0) {
            locale = cVar.e;
        }
        Locale locale2 = locale;
        if ((i & 32) != 0) {
            z4 = cVar.f;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(screenFlashState, "screenFlashState");
        return new c(z6, lVar2, z11, screenFlashState, locale2, z4);
    }

    @Override // sy.e
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f266533a == cVar.f266533a && Intrinsics.f(this.f266534b, cVar.f266534b) && this.f266535c == cVar.f266535c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    @Override // sy.e
    public final Locale f0() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f266533a) * 31;
        xv.l lVar = this.f266534b;
        int iHashCode2 = (this.d.hashCode() + j6.a.c((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f266535c)) * 31;
        Locale locale = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (locale != null ? locale.hashCode() : 0)) * 31);
    }
}
