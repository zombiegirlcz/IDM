package mn6;

import aie.v;
import ch.qos.logback.core.spi.ComponentTracker;
import com.revolut.domain.models.openbanking.ExternalPaymentStatus$State;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import in6.k;
import java.util.Set;
import kn6.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mk5.s;
import org.jetbrains.annotations.NotNull;
import skm.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oe6.a f207383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nn6.a f207384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i90.b f207385n;
    public final PennyTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final on6.a f207386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final on6.a f207387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f207388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f207389s;

    public j(oe6.a externalInstitutionsInteractor, nn6.a uiContentProvider, i90.b uuidUtils, PennyTopUpFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(uiContentProvider, "uiContentProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.f207383l = externalInstitutionsInteractor;
        this.f207384m = uiContentProvider;
        this.f207385n = uuidUtils;
        this.o = flowInputData;
        this.f207386p = new on6.a(ComponentTracker.DEFAULT_TIMEOUT);
        this.f207387q = new on6.a(60000L);
        ExternalPaymentStatus$State[] elements = {ExternalPaymentStatus$State.FAILED, ExternalPaymentStatus$State.CANCELLED, ExternalPaymentStatus$State.REJECTED, ExternalPaymentStatus$State.EXECUTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f207389s = kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(mn6.j r18, com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution r19, ho3.a r20, java.lang.String r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn6.j.e3(mn6.j, com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution, ho3.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(mn6.j r18, java.lang.String r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn6.j.f3(mn6.j, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // mn6.a
    public final void Z2(String consentId, k onCompleteSuccess, k onCompleteFailure) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(onCompleteSuccess, "onCompleteSuccess");
        Intrinsics.checkNotNullParameter(onCompleteFailure, "onCompleteFailure");
        L2(this.f207384m.a());
        c cVar = new c(this, consentId, null, 0);
        a2 a2Var = this.f207388r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f207388r = T2(new v(this.f207387q, this, onCompleteFailure, cVar, onCompleteSuccess, null), new s(this, onCompleteFailure, 15));
    }

    @Override // mn6.a
    public final void b3(ExternalInstitution institution, String paymentId, m onCompleteSuccess, m onCompleteFailure) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(onCompleteSuccess, "onCompleteSuccess");
        Intrinsics.checkNotNullParameter(onCompleteFailure, "onCompleteFailure");
        L2(this.f207384m.a());
        c cVar = new c(this, paymentId, null, 1);
        a2 a2Var = this.f207388r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f207388r = T2(new v(this.f207387q, this, onCompleteFailure, cVar, onCompleteSuccess, null), new s(this, onCompleteFailure, 15));
    }

    @Override // mn6.a
    public final void c3(ExternalInstitution institution, ho3.a aVar, k onRetryClickAfterRedirect) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(onRetryClickAfterRedirect, "onRetryClickAfterRedirect");
        T2(new fc0.e(this, institution, aVar, institution.f66108b, onRetryClickAfterRedirect, (Continuation) null), new yi5.b(27));
    }

    @Override // mn6.a
    public final void d3(ExternalInstitution institution, ho3.a aVar, String str, Function0 onCompleteSuccess, Function0 onCompleteFailure, Function0 onRetryClickAfterRedirect) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(onCompleteSuccess, "onCompleteSuccess");
        Intrinsics.checkNotNullParameter(onCompleteFailure, "onCompleteFailure");
        Intrinsics.checkNotNullParameter(onRetryClickAfterRedirect, "onRetryClickAfterRedirect");
        T2(new ac8.h(this, institution, aVar, str, onRetryClickAfterRedirect, onCompleteSuccess, onCompleteFailure, null, 16), new yi5.b(27));
    }
}
