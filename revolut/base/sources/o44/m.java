package o44;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreenContract$InputData;
import efm.d0;
import efm.r;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import te0.w;
import vkm.q;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends jki.g implements jki.h {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f222000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CreditAddressSearchScreenContract$InputData f222001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0m.f f222002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f222003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f222004t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hw3.c creditApplicationAddressInteractor, p stateMapper, CreditAddressSearchScreenContract$InputData inputData, e0m.f postcodeValidator) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(creditApplicationAddressInteractor, "creditApplicationAddressInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(postcodeValidator, "postcodeValidator");
        this.f222000p = creditApplicationAddressInteractor;
        this.f222001q = inputData;
        this.f222002r = postcodeValidator;
        this.f222003s = new e(null, inputData.f66962a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f222003s;
    }

    public final r y2() {
        String applicationId = this.f222001q.f66964c.f66892b;
        hw3.c cVar = this.f222000p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        p24.p pVar = cVar.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        d0<vz3.c> addressLookupResult = pVar.f232057c.getAddressLookupResult(applicationId);
        p24.b bVar = new p24.b(14, new p0g.b(4));
        addressLookupResult.getClass();
        ufm.i iVar = new ufm.i(addressLookupResult, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return new sfm.b(w.i0(iVar), new o28.g(new o2g.f(17), 27), 2).retryWhen(new o28.g(new o2g.f(18), 28));
    }

    public final void z2() {
        a2 a2Var = this.f222004t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f222004t = yji.l.a1(this, pyd.c.m(q.Q(t1.d(q.q(new lfg.d0(q2(), 25)), 300L), new ns9.h(continuation, this, 13))), null, null, new nwc.f(this, continuation, 22), 3);
    }
}
