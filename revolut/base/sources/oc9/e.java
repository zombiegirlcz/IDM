package oc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsAuthenticationMethod;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$Mode;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import y89.e;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes_terms.h f224141b;

    public /* synthetic */ e(com.revolut.feature.onboarding.impl.qes_terms.h hVar, int i) {
        this.f224140a = i;
        this.f224141b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f224140a) {
            case 0:
                kc9.g result = (kc9.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof kc9.e;
                com.revolut.feature.onboarding.impl.qes_terms.h hVar = this.f224141b;
                if (z) {
                    hVar.Q2();
                } else {
                    if (!(result instanceof kc9.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kc9.f fVar = (kc9.f) result;
                    ESignatureDetails eSignatureDetails = fVar.f182673a;
                    String str = fVar.f182674b;
                    if (str != null) {
                        hVar.T2(eSignatureDetails.f78146c, new WaitingForQesResultScreenContract$Mode.PollResult(eSignatureDetails), str);
                    } else {
                        hVar.l2(new i0(hVar, result, null, 21), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a result2 = (com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2 instanceof mc9.e;
                com.revolut.feature.onboarding.impl.qes_terms.h hVar2 = this.f224141b;
                if (z3) {
                    hVar2.Q2();
                } else {
                    Continuation continuation = null;
                    if (result2 instanceof mc9.f) {
                        hVar2.l2(new k(hVar2, result2, continuation, 0), new yi5.b(26));
                    } else if (result2 instanceof mc9.g) {
                        hVar2.l2(new k(hVar2, result2, continuation, 1), new yi5.b(26));
                    } else {
                        if (!Intrinsics.f(result2, a.C0517a.f78536a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar2.K2(e.b.f311641a);
                    }
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a result3 = (com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z4 = result3 instanceof mc9.e;
                com.revolut.feature.onboarding.impl.qes_terms.h hVar3 = this.f224141b;
                if (z4) {
                    hVar3.Q2();
                } else if (result3 instanceof mc9.f) {
                    hVar3.l2(new o95.c(hVar3, result3, null, 11), new yi5.b(26));
                } else {
                    if (result3 instanceof mc9.g) {
                        throw new IllegalStateException("InvalidOtp is not supported in passcode mode");
                    }
                    if (!Intrinsics.f(result3, a.C0517a.f78536a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar3.K2(e.b.f311641a);
                }
                return Unit.f186387a;
            default:
                w result4 = (w) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof w)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = result4.f224161a;
                com.revolut.feature.onboarding.impl.qes_terms.h hVar4 = this.f224141b;
                QesTermsAuthenticationMethod qesTermsAuthenticationMethod = hVar4.f78563q.f78201a.e;
                Continuation continuation2 = null;
                if ((qesTermsAuthenticationMethod instanceof QesTermsAuthenticationMethod.Otp) || (qesTermsAuthenticationMethod instanceof QesTermsAuthenticationMethod.Sso)) {
                    hVar4.S2(null, arrayList);
                } else {
                    if (!Intrinsics.f(qesTermsAuthenticationMethod, QesTermsAuthenticationMethod.Passcode.f78197a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar4.n2(new i0(hVar4, arrayList, continuation2, 20), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
