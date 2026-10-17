package avc;

import cli.y;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardControllerContract$InputData;
import ha3.x;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends oki.h implements f {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f10006p;

    public r(t statesMapper, LostCardControllerContract$InputData inputData, l93.f cardInteractor) {
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        this.o = cardInteractor;
        this.f10006p = mra.d.b(this, new e(inputData.f85629a), statesMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(m70.a.g(((x) this.o).v(((e) ((j2) this.f10006p.f22677a).getValue()).f9995a.f150110a), null, null, 3)), null, null, new ap7.k(this, null, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f10006p;
    }
}
