package hh6;

import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreenContract$InputData;
import ghk.a0;
import hh6.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.v1;
import xg6.t;
import xg6.u;
import xg6.x;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends jki.g implements k {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MandateDetailsScreenContract$InputData f152268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bh6.a f152269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f152270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bh6.j f152271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f152272t;
    public final b u;
    public final oe6.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wj0.a f152273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j.a f152274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, MandateDetailsScreenContract$InputData inputData, bh6.a mandateDetailsInteractor, x mandateInteractor, bh6.j uriDestinationProvider, j60.a bottomDialogExtension, b mandateDetailsDialogMapper, oe6.j mandateAnalyticsInteractor, wj0.a idempotencyKeyHolder) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateDetailsInteractor, "mandateDetailsInteractor");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(mandateDetailsDialogMapper, "mandateDetailsDialogMapper");
        Intrinsics.checkNotNullParameter(mandateAnalyticsInteractor, "mandateAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f152268p = inputData;
        this.f152269q = mandateDetailsInteractor;
        this.f152270r = mandateInteractor;
        this.f152271s = uriDestinationProvider;
        this.f152272t = bottomDialogExtension;
        this.u = mandateDetailsDialogMapper;
        this.v = mandateAnalyticsInteractor;
        this.f152273w = idempotencyKeyHolder;
        this.f152274x = j.a.f152262a;
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarA = this.f152269q.a();
        x xVar = this.f152270r;
        xVar.getClass();
        w4l.j externalInstitutionsLoadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(externalInstitutionsLoadingStrategy, "externalInstitutionsLoadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, new t38.e(dVarA, 24, new a0(mo3.a.g(vkm.q.Q(new v1(new u(1, null, xVar)), new t(1, continuation, xVar)), null, new hb6.g(24), 1), this, 17), o.f152267a), null, null, new hba.k(this, continuation, 16), 3);
        this.f152273w.a("CREATE_MANDATE_IDEMPOTENCY_TAG");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f152274x;
    }
}
