package v9f;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreenContract$ScreenConfig;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends oki.h implements j {
    public final o9f.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InstrumentsListScreenContract$ScreenConfig f287040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.c f287041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f287042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f287043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f287044t;

    public p(o9f.c transferInteractor, InstrumentsListScreenContract$ScreenConfig screenConfig, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transferInteractor;
        this.f287040p = screenConfig;
        this.f287041q = new vii.c();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.f287042r = vkm.q.c("");
        this.f287043s = yhm.j.b(new ur2.a(this, 27));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f287044t = mra.d.b(this, new g(null, ""), stateMapper, new a(), false, 8);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Object value;
        yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("InstrumentsListScreenModel", "observeInstrumentsList", nim.a.v(vkm.q.Q(this.f287041q.a(Unit.f186387a, w4l.h.f294642c), new uec.d((Continuation) null, this, 18)), new v80.a(7))), null, new l(this, null, 0), 3);
        l lVar = new l(this, null, 1);
        j2 j2Var = this.f287042r;
        yji.l.b1(this, j2Var, null, lVar, 3);
        if (this.f226127l) {
            y yVar = this.f287044t;
            if (((g) ((j2) yVar.f22677a).getValue()).f287033a.length() > 0) {
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, ((g) ((j2) yVar.f22677a).getValue()).f287033a));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f287044t;
    }
}
