package h66;

import ack.n;
import cli.y;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import do3.q;
import dx6.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f149597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f149597w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f149597w, continuation, 0);
            case 1:
                return new d(this.f149597w, continuation, 1);
            default:
                return new d(this.f149597w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
            case 0:
                d dVar = (d) create(continuation);
                Unit unit = Unit.f186387a;
                dVar.invokeSuspend(unit);
                break;
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h5i.b bVar;
        Object objP;
        int i = this.u;
        int i2 = 3;
        Continuation continuation = null;
        e eVar = this.f149597w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f66.a aVar2 = eVar.f149598p;
                new h54.o(eVar, continuation, i2);
                this.v = 1;
                aVar2.getClass();
                throw new IllegalStateException("TODO(DEFI-1205): Replace with the shared P256KeyAgreementInteractor");
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d dVar = new d(eVar, continuation, 0);
                this.v = 1;
                Object objT = q.t(eVar, dVar, this);
                return objT == aVar3 ? aVar3 : objT;
            default:
                y yVar = eVar.f149601s;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                int i22 = 15;
                try {
                    if (i21 == 0) {
                        o.b(obj2);
                        m mVar = new m(eVar.f149599q, i2);
                        n nVar = new n(21);
                        d dVar2 = new d(eVar, continuation, i3);
                        this.v = 1;
                        objP = k.P(eVar.X(), null, mVar, nVar, dVar2, this);
                        if (objP == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objP = obj2;
                    }
                    nii.e eVar2 = (nii.e) objP;
                    if (eVar2 instanceof nii.d) {
                        eVar.C2(new b((c66.e) ((nii.d) eVar2).f216133a));
                    }
                    bVar = new h5i.b(i22);
                    break;
                } catch (UserDeclinedTwoFaException unused) {
                    bVar = new h5i.b(i22);
                } catch (Throwable th10) {
                    eVar.H2(yVar, new h5i.b(i22));
                    throw th10;
                }
                eVar.H2(yVar, bVar);
                return Unit.f186387a;
        }
    }
}
