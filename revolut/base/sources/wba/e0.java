package wba;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import java.time.LocalDate;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends oki.h implements s {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s8a.l f296068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zof.f f296069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f296070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f296071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f296072t;

    public e0(i inputData, s8a.l pixQrCodeInteractor, zof.f transferFeatureScreensProvider, wj0.a idempotencyKeyHolder, v dialogProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pixQrCodeInteractor, "pixQrCodeInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f296068p = pixQrCodeInteractor;
        this.f296069q = transferFeatureScreensProvider;
        this.f296070r = idempotencyKeyHolder;
        this.f296071s = dialogProvider;
        this.f296072t = mra.d.b(this, new h(inputData.f296077b, inputData.f296078c, (PixQrCodeDecodeData) inputData.f.getValue(), inputData.f296080h, inputData.f296079g), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f296070r.a("QR_TRANSFER_IDEMPOTENCY_KEY");
        yji.l.a1(this, this.o.f, null, null, new w50.g(this, (Continuation) null, 13), 3);
    }

    public final void I2() {
        List listC = zhm.u.c(jli.c.PERIOD_SELECTION_NONE);
        cli.y yVar = this.f296072t;
        yji.l.g2(this, ((qpf.h) this.f296069q).d(new ScheduleTransferInputData((TextLocalisedClause) null, ((h) ((j2) yVar.f22677a).getValue()).d, m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, listC, false, (AnalyticsContext) null, (LocalDate) null, ((h) ((j2) yVar.f22677a).getValue()).e, false, false, false, 7657)), null, new z(this, 0), 1);
    }

    public final void J2() {
        Continuation continuation = null;
        if (((h) ((j2) this.f296072t.f22677a).getValue()).d.f104285a == 0) {
            l2(new c0(this, continuation, 1), new yi5.b(26));
        } else {
            l2(new c0(this, continuation, 0), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f296072t;
    }
}
