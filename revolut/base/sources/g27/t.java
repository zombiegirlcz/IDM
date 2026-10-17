package g27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends oki.h implements o {
    public final vii.b A;
    public final cli.y B;
    public final b9k.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bbd.b f139932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hr6.l f139933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f139934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l17.a f139935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tqi.g f139936t;
    public final OrderInitPageDetailsScreenContract$InputData u;
    public final s70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c70.a f139937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f139938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f80.a f139939y;
    public final vii.b z;

    public t(b9k.f acquiringOrderInteractor, bbd.b orderInitiationPageInteractor, hr6.l freelancerCommandFactory, ang.f userInteractor, l17.a shareTextGenerator, tqi.g shareCommandFactory, OrderInitPageDetailsScreenContract$InputData inputData, s70.a intentProvider, c70.a clipboard, g1 shotDialogDisplayer, f80.a uriHelper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(orderInitiationPageInteractor, "orderInitiationPageInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(shareTextGenerator, "shareTextGenerator");
        Intrinsics.checkNotNullParameter(shareCommandFactory, "shareCommandFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringOrderInteractor;
        this.f139932p = orderInitiationPageInteractor;
        this.f139933q = freelancerCommandFactory;
        this.f139934r = userInteractor;
        this.f139935s = shareTextGenerator;
        this.f139936t = shareCommandFactory;
        this.u = inputData;
        this.v = intentProvider;
        this.f139937w = clipboard;
        this.f139938x = shotDialogDisplayer;
        this.f139939y = uriHelper;
        this.z = new vii.b();
        this.A = new vii.b();
        this.B = mra.d.b(this, new n(0), stateMapper, null, false, 12);
    }

    public static final void I2(t tVar, TextLocalisedClause textLocalisedClause) {
        tVar.X1(new mii.k("STATUS_DIALOG_ID", textLocalisedClause, null, null, null, 28));
        tVar.z.a();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.z, new q(continuation, this, 0)), null, new g06.k(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
