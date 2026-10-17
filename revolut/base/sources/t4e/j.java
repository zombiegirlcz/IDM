package t4e;

import ael.d0;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f267982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f267983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f267984n;
    public final vki.a o;

    public j(e inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f267982l = inputData;
        this.f267983m = stocksInteractor;
        this.f267984n = instrumentTickerInteractor;
        this.o = pyd.c.a(this, new d(null, null));
    }

    @Override // yji.n
    public final void H2() {
        e eVar = this.f267982l;
        n.l2(this, nim.a.v(rd0.e.b(this.f267983m.a(eVar.f267978a, false)), new t3b.g(17)), null, new i(this, null, 0), 3);
        n.l2(this, rd0.e.b(((ael.k) this.f267984n).f(eVar.f267978a)), null, new i(this, null, 1), 3);
    }

    @Override // t4e.b
    public final void Z2() {
        A2(new AboutNoteScreenContract$Destination(new AboutNoteScreenContract$InputData(this.f267982l.f267978a)));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
