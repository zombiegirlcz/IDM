package rwb;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import rt4.o;
import ru6.r;
import vkm.q;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements d {
    public final RevPointsGiftcardsCheckoutController$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jwb.e f257882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nyb.k f257883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nwb.a f257884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f257885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f257886t;
    public final vii.b u;
    public final y v;

    public h(n stateMapper, i90.b uuidUtils, RevPointsGiftcardsCheckoutController$InputData inputData, jwb.e revPointsGiftcardsInteractor, nyb.k revPointsInteractor, nwb.a giftcardsCheckoutExtension, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(giftcardsCheckoutExtension, "giftcardsCheckoutExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f257882p = revPointsGiftcardsInteractor;
        this.f257883q = revPointsInteractor;
        this.f257884r = giftcardsCheckoutExtension;
        this.f257885s = userInteractor;
        this.f257886t = new vii.b();
        this.u = new vii.b();
        this.v = mra.d.b(this, new c(new Data(null, null, true, 3, null), wp5.y.u(uuidUtils, "toString(...)")), stateMapper, null, false, 12);
    }

    public static final void I2(h hVar) {
        hVar.f257886t.a();
        hVar.u.a();
    }

    public static y0 J2() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly while fetching data in RevPointsGiftcardCheckoutScreenModel, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(u0.i(nim.a.v(q.Q(this.f257886t, new e(0, continuation, this)), new r(15)), q.Q(this.u, new e(1, continuation, this)), this.f257885s.j(w4l.h.f294642c)), new r(16)), null, null, new o(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
