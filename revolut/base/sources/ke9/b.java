package ke9;

import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlow;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wl0.k;
import wl0.l;
import wl0.m;
import wl0.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BiometricPasscodeVerificationFlow f183051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f183051w = biometricPasscodeVerificationFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f183051w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f183051w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ee9.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = this.f183051w;
        switch (i) {
            case 0:
                n value = (n) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.passcode.ui.biometric_passcode_verification.b bVar = (com.revolut.feature.passcode.ui.biometric_passcode_verification.b) ((c) biometricPasscodeVerificationFlow.N.getValue());
                bVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                bVar.f78642r.f3(value);
                if (value instanceof wl0.j) {
                    bVar.J2();
                } else if (!(value instanceof k)) {
                    if (value instanceof l) {
                        bVar.J2();
                    } else {
                        if (!(value instanceof m)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m mVar = (m) value;
                        bVar.C2(new d((Cipher) mVar.f298358a, mVar.f298359b));
                    }
                }
                return Unit.f186387a;
            default:
                ee9.g gVar = (ee9.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fe9.e) ((fe9.a) biometricPasscodeVerificationFlow.K.getValue())).R(gVar);
                return Unit.f186387a;
        }
    }
}
