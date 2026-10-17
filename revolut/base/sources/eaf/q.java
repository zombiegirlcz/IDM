package eaf;

import cli.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends oki.h implements k {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o9f.c f124243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.c f124244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f124245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f124246s;

    public q(g inputData, o9f.c transferInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f124243p = transferInteractor;
        this.f124244q = new vii.c();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.f124245r = vkm.q.c("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f124246s = mra.d.b(this, new f("", null, inputData.f124233a, inputData.f124234b), stateMapper, new t(), false, 8);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Object value;
        yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("BrokerSelectionScreenModel", "observeBrokersList", nim.a.v(vkm.q.Q(this.f124244q.a(Unit.f186387a, w4l.h.f294642c), new dz6.n(null, this, 7)), new e8e.y(18))), null, new m(this, null, 0), 3);
        m mVar = new m(this, null, 1);
        j2 j2Var = this.f124245r;
        yji.l.b1(this, j2Var, null, mVar, 3);
        if (this.f226127l) {
            y yVar = this.f124246s;
            if (((f) ((j2) yVar.f22677a).getValue()).f124230a.length() > 0) {
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, ((f) ((j2) yVar.f22677a).getValue()).f124230a));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124246s;
    }
}
