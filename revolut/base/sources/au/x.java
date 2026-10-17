package au;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.m1;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a f9133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9133w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f9133w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            default:
                x xVar2 = new x(this.f9133w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((kmi.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar = this.f9133w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof m1) {
                    aVar.N2(q.f9127a);
                } else {
                    aVar.N2(o.f9125a);
                }
                return Unit.f186387a;
            default:
                kmi.h hVar = (kmi.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = z.f9136a[hVar.ordinal()];
                final int i3 = 1;
                if (i2 == 1) {
                    final int i5 = 0;
                    aVar.H2(aVar.getState(), new Function1() { // from class: au.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h hVar2 = (h) obj3;
                            switch (i5) {
                                case 0:
                                    return com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.K2(aVar, hVar2, true);
                                default:
                                    return com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.K2(aVar, hVar2, false);
                            }
                        }
                    });
                } else if (i2 == 2) {
                    aVar.H2(aVar.getState(), new Function1() { // from class: au.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h hVar2 = (h) obj3;
                            switch (i3) {
                                case 0:
                                    return com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.K2(aVar, hVar2, true);
                                default:
                                    return com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.K2(aVar, hVar2, false);
                            }
                        }
                    });
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("NFC unavailable");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BiometricVerificationNfcV2ConsolidatedScreenModel", null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
