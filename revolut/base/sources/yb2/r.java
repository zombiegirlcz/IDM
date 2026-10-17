package yb2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import e0f.r1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import xg6.b0;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends oki.h implements f {

    @NotNull
    public static final l Companion = new l();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f312170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u51.a f312171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe6.a f312172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f312173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f312174t;

    public r(e inputData, wj0.a idempotencyKeyHolder, u51.a topupMethodsInteractor, oe6.a externalInstitutionsInteractor, b0 payToStoredMethodTopUpRepository, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(payToStoredMethodTopUpRepository, "payToStoredMethodTopUpRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f312170p = idempotencyKeyHolder;
        this.f312171q = topupMethodsInteractor;
        this.f312172r = externalInstitutionsInteractor;
        this.f312173s = payToStoredMethodTopUpRepository;
        this.f312174t = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f312170p.a("TOPUP_IDEMPOTENCY_TAG");
    }

    public final com.revolut.feature.topup_screen.api.model.b I2() {
        StoredMethod storedMethod = (StoredMethod) ((d) ((j2) this.f312174t.f22677a).getValue()).f312161a.getContent();
        StoredMethod.Mandate mandate = storedMethod != null ? storedMethod.f : null;
        StoredMethod.Mandate.PayTo payTo = mandate instanceof StoredMethod.Mandate.PayTo ? (StoredMethod.Mandate.PayTo) mandate : null;
        if (payTo != null) {
            return payTo.d;
        }
        return null;
    }

    public final void J2() {
        C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))));
    }

    public final void K2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(g.f312164a)) {
            B2();
        } else {
            if (!event.equals(h.f312165a)) {
                throw new NoWhenBranchMatchedException();
            }
            J2();
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (I2() == null || I2() == com.revolut.feature.topup_screen.api.model.b.INIT) {
            String storedMethodId = this.o.f312162a;
            yte.m mVar = yte.m.PAY_TO;
            r1 r1Var = (r1) this.f312171q;
            r1Var.getClass();
            Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
            hve.o oVar = (hve.o) r1Var.f121679a;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
            yji.l.b1(this, vkm.q.R(qe0.o.a(oVar.o, new hve.a(storedMethodId, mVar != null ? mVar.name() : null), 5L, null, true, null, 20), new o(3, null)), null, new q(this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312174t;
    }
}
