package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowContract$Step;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowOutputData;
import com.revolut.kompot.common.ModalDestination;
import g37.z;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;
import zlg.d;
import zlg.e;
import zlg.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f97628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f97628w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f97628w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        String str = this.f97628w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            if (bVar.f97632s.a()) {
                h.w2(bVar.f97633t, new EmailVerificationOtpFlowContract$Step.Cooldown(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            }
            z zVar = new z(bVar, str, continuation, 25);
            this.u = 1;
            obj2 = bVar.p2(this, zVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        f fVar = (f) obj2;
        if (fVar instanceof e) {
            h.u2(bVar, bVar.f97633t, new EmailVerificationOtpFlowContract$Step.Onboarding(str, ((e) fVar).f323254a), null, 6);
        } else {
            if (!Intrinsics.f(fVar, d.f323253a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.C2(EmailVerificationOtpFlowOutputData.Verified.f97627a);
        }
        return Unit.f186387a;
    }
}
