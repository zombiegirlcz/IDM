package owk;

import boh.f;
import cxe.u;
import kotlin.jvm.internal.Intrinsics;
import om4.t3;
import ou6.o;
import rd0.e;
import ybl.q;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f230462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f230463b;

    public a(ybl.b instrumentTickerInteractor, q wealthInstrumentStateDetailsInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        this.f230462a = instrumentTickerInteractor;
        this.f230463b = wealthInstrumentStateDetailsInteractor;
    }

    public final u a(String instrumentRef, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        return nim.a.A(e.n(f.e(nim.a.v(e.b(ybl.b.c(this.f230462a)), new t3(instrumentRef, 11)), new l3d.f(z, this, 18)), h0.f322473a), new o(17));
    }
}
