package com.revolut.feature.passcode.ui.biometric_passcode_verification;

import com.revolut.data.model.Data;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me9.c;
import me9.d;
import me9.e;
import me9.f;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f78639w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f78639w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f78639w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        f fVar = (f) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            b bVar = this.f78639w;
            BiometricPasscodeVerificationFlowContract$Step biometricPasscodeVerificationFlowContract$Step = (BiometricPasscodeVerificationFlowContract$Step) bVar.u.d();
            e eVar = e.f204637a;
            c cVar = c.f204635a;
            d dVar = d.f204636a;
            me9.b bVar2 = me9.b.f204634a;
            if (biometricPasscodeVerificationFlowContract$Step == null) {
                if (Intrinsics.f(fVar, bVar2)) {
                    bVar.J2();
                } else if (!Intrinsics.f(fVar, dVar) && !Intrinsics.f(fVar, cVar) && !Intrinsics.f(fVar, eVar)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!biometricPasscodeVerificationFlowContract$Step.equals(BiometricPasscodeVerificationFlowContract$Step.Passcode.f78638a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.f(fVar, bVar2)) {
                    data = new Data(oe9.b.f224565a, null, false, 6, null);
                } else if (Intrinsics.f(fVar, cVar)) {
                    data = new Data(null, null, true, 3, null);
                } else if (Intrinsics.f(fVar, eVar)) {
                    data = new Data(oe9.d.f224567a, null, false, 6, null);
                } else {
                    if (!Intrinsics.f(fVar, dVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    data = new Data(oe9.c.f224566a, null, false, 6, null);
                }
                oe9.a aVar2 = bVar.f78644t;
                this.v = null;
                this.u = 1;
                if (aVar2.a(data, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
