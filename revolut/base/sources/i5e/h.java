package i5e;

import ael.d0;
import ael.k;
import cli.y;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$InputData;
import i4h.q;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final AboutNoteGlossaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f158820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f158821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f158822r;

    public h(AboutNoteGlossaryScreenContract$InputData inputData, f mapper, ybl.b instrumentTickerInteractor, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.o = inputData;
        this.f158820p = instrumentTickerInteractor;
        this.f158821q = stocksInteractor;
        this.f158822r = mra.d.b(this, new c(inputData.f88887b, null, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = this.o;
        l.b1(this, nim.a.v(rd0.e.b(this.f158821q.a(aboutNoteGlossaryScreenContract$InputData.f88886a, false)), new q(19)), null, new g(this, null, 1), 3);
        l.b1(this, rd0.e.b(((k) this.f158820p).f(aboutNoteGlossaryScreenContract$InputData.f88886a)), null, new g(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f158822r;
    }
}
