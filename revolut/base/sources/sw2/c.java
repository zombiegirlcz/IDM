package sw2;

import cli.y;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import h93.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qw2.l;
import sqd.h0;
import sw2.k;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GooglePayOtpLocationMismatchController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = googlePayOtpLocationMismatchController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final int i2 = 1;
        GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final h hVar = (h) ((i) googlePayOtpLocationMismatchController.O.getValue());
                hVar.getClass();
                hVar.n2(new h0(hVar, null, 2), new Function1() { // from class: sw2.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                qw2.l result = (qw2.l) obj3;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof l.a;
                                k.b bVar = k.b.f266082a;
                                h hVar2 = hVar;
                                if (z || (result instanceof l.b)) {
                                    hVar2.C2(bVar);
                                } else if (!(result instanceof l.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            default:
                                Throwable it8 = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                hVar.C2(k.b.f266082a);
                                return Boolean.TRUE;
                        }
                    }
                });
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) ((i) googlePayOtpLocationMismatchController.O.getValue());
                y yVar = hVar2.f266077q;
                f0 f0Var = (f0) ((j) ((j2) yVar.f22677a).getValue()).f266078a.getContent();
                if (f0Var != null) {
                    hVar2.C2(new l(f0Var, ((j) ((j2) yVar.f22677a).getValue()).f266079b));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final h hVar3 = (h) ((i) googlePayOtpLocationMismatchController.O.getValue());
                y yVar2 = hVar3.f266077q;
                f0 f0Var2 = (f0) ((j) ((j2) yVar2.f22677a).getValue()).f266078a.getContent();
                if (f0Var2 != null) {
                    GooglePayCardSecurityController googlePayCardSecurityController = new GooglePayCardSecurityController(new GooglePayCardSecurityScreenContract$InputData(f0Var2, ((j) ((j2) yVar2.f22677a).getValue()).d));
                    final int i3 = 0;
                    yji.l.j2(hVar3, googlePayCardSecurityController, null, new Function1() { // from class: sw2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    qw2.l result = (qw2.l) obj3;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof l.a;
                                    k.b bVar = k.b.f266082a;
                                    h hVar22 = hVar3;
                                    if (z || (result instanceof l.b)) {
                                        hVar22.C2(bVar);
                                    } else if (!(result instanceof l.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    Throwable it8 = (Throwable) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    hVar3.C2(k.b.f266082a);
                                    return Boolean.TRUE;
                            }
                        }
                    }, 1);
                }
                break;
        }
        return Unit.f186387a;
    }
}
