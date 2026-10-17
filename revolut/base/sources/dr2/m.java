package dr2;

import aii.s;
import cli.y;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.q0;
import xq2.c;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final BarcodeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ar2.c f117081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vrh.b f117082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f117083r;

    public m(BarcodeScreenContract$InputData inputData, ar2.c frameProcessor, vrh.b interactor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(frameProcessor, "frameProcessor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f117081p = frameProcessor;
        this.f117082q = interactor;
        this.f117083r = mra.d.b(this, new d(c.a.f308054a, f.f117076a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        J2(s.CREATED);
        ((com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a) this.f117082q).getClass();
        yji.l.a1(this, new go.g(f.f117076a, 2), null, null, new dob.c(this, null, 9), 3);
    }

    public final q0 I2() {
        return new q0(q.i(new l(q.r(new dmb.m(19), yh5.b.d(kii.e.t(this.f117081p.f8507g, "hide(...)"), new q0(((com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a) this.f117082q).z, new cyc.c(2, this, m.class, "updateState", "updateState(Lcom/revolut/feature/barcode/BarcodeContract$ProcessingState;)V", 4, 11), 1))), 0), 0, ukm.f.DROP_OLDEST), new dlk.k(this, (Continuation) null, 16), 1);
    }

    public final void J2(s sVar) {
        e eVar = this.o.f64123c;
        if (eVar == e.TillHide && sVar == s.SHOWN) {
            yji.l.b1(this, I2(), null, null, 7);
        } else if (eVar == e.TillFinish && sVar == s.CREATED) {
            yji.l.a1(this, I2(), null, null, null, 7);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        J2(s.SHOWN);
        yji.l.b1(this, q.P(rd0.e.b(this.f117081p.f8505b.f128528a), 1), null, new j(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f117083r;
    }
}
