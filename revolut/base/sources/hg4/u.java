package hg4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreenContract$InputData;
import ft3.h1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements q {

    @NotNull
    private static final s Companion = new s();
    public final vx3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f152104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f152105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f152106r;

    public u(cli.n stateMapper, PersonalDetailsScreenContract$InputData inputData, vx3.a personalDetailsInteractor, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalDetailsInteractor, "personalDetailsInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = personalDetailsInteractor;
        this.f152104p = bottomExpandableDialogControllerExtension;
        this.f152105q = w0.F(inputData.f68188a);
        this.f152106r = mra.d.b(this, new j(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    public final void I2() {
        vx3.a aVar = this.o;
        aVar.getClass();
        h1 productPayload = this.f152105q;
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        z34.b bVar = aVar.f292810a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Continuation continuation = null;
        yji.l.b1(this, new q0(pyd.c.m(nim.a.v(u0.m(bVar.d.b(new z34.a(productPayload), w4l.i.f294643c), rd0.e.b(aVar.f292811b.k(false))), new vw4.j(5))), new d4f.m(2, 25, continuation), 1), null, new hba.k(this, continuation, 13), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152106r;
    }
}
