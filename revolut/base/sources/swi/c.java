package swi;

import d8l.d;
import dwi.t0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements b {
    public final t0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xyi.a f266227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f266228q;

    public c(t0 schemeAirportLoungesInteractor, xyi.a schemeAirportLoungesPromptProvider) {
        Intrinsics.checkNotNullParameter(schemeAirportLoungesInteractor, "schemeAirportLoungesInteractor");
        Intrinsics.checkNotNullParameter(schemeAirportLoungesPromptProvider, "schemeAirportLoungesPromptProvider");
        this.o = schemeAirportLoungesInteractor;
        this.f266227p = schemeAirportLoungesPromptProvider;
        this.f266228q = d.a(this, new suf.a(this, 3));
    }

    @Override // yki.j
    public final void M0() {
        l2(new se4.c(this, null, 23), new sl5.a(this, 27));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f266228q;
    }
}
