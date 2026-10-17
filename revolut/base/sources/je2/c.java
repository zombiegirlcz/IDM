package je2;

import com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus;
import com.revolut.feature.apm.swish.impl.ui.SwishFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import imk.p0;
import ke2.g;
import ke2.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import til.n;
import til.o;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.swish.impl.ui.a f173188b;

    public /* synthetic */ c(com.revolut.feature.apm.swish.impl.ui.a aVar, int i) {
        this.f173187a = i;
        this.f173188b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f173187a) {
            case 0:
                i result = (i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, ke2.e.f182957a);
                com.revolut.feature.apm.swish.impl.ui.a aVar = this.f173188b;
                if (zF) {
                    h.D2(aVar.f62919r);
                } else if (Intrinsics.f(result, ke2.f.f182958a)) {
                    h.t2(aVar, aVar.f62919r, new SwishFlowContract$Step.Area(null), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (Intrinsics.f(result, g.f182959a)) {
                    aVar.I2();
                } else {
                    if (!Intrinsics.f(result, ke2.h.f182960a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(aVar, aVar.f62919r, SwishFlowContract$Step.PendingUserAction.f62914a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 1:
                ne2.b result2 = (ne2.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                SwishRegistrationStatus swishRegistrationStatus = result2.f214405a;
                boolean z = swishRegistrationStatus instanceof SwishRegistrationStatus.Registered;
                com.revolut.feature.apm.swish.impl.ui.a aVar2 = this.f173188b;
                if (z) {
                    h.t2(aVar2, aVar2.f62919r, new SwishFlowContract$Step.Area(((SwishRegistrationStatus.Registered) swishRegistrationStatus).f62906a), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (swishRegistrationStatus instanceof SwishRegistrationStatus.NotRegistered) {
                    h.t2(aVar2, aVar2.f62919r, new SwishFlowContract$Step.ProductArticle((SwishRegistrationStatus.NotRegistered) swishRegistrationStatus), false, null, false, 12);
                } else if (swishRegistrationStatus instanceof SwishRegistrationStatus.RemediationRequired) {
                    aVar2.J2(((SwishRegistrationStatus.RemediationRequired) swishRegistrationStatus).f62907a);
                } else if (swishRegistrationStatus instanceof SwishRegistrationStatus.Pending) {
                    aVar2.I2();
                } else {
                    if (!(swishRegistrationStatus instanceof SwishRegistrationStatus.PendingUserAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(aVar2, aVar2.f62919r, SwishFlowContract$Step.PendingUserAction.f62914a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.apm.swish.impl.ui.a aVar3 = this.f173188b;
                yki.a aVar4 = aVar3.f62919r;
                u result3 = (u) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof q) {
                    h.D2(aVar4);
                } else {
                    if (!(result3 instanceof p) && !(result3 instanceof r) && !(result3 instanceof s) && !(result3 instanceof t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.l2(new p0(aVar3, null, 26), new yi5.b(26));
                    h.D2(aVar4);
                }
                return Unit.f186387a;
            default:
                til.r result4 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof til.q) && !(result4 instanceof n) && !(result4 instanceof o) && !(result4 instanceof til.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f173188b.f62919r);
                return Unit.f186387a;
        }
    }
}
