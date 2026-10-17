package kw4;

import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditScheduledPayment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mw4.a;
import nii.k1;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public z u;
    public z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f190246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f190247x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Continuation continuation, z zVar) {
        super(1, continuation);
        this.f190247x = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(continuation, this.f190247x);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        a.b cVar;
        Throwable th10;
        z zVar;
        z zVar2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f190246w;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar3 = this.f190247x;
            dj0.d dVar = zVar3.I2().f190228m;
            Long l2 = zVar3.I2().d.f196561j;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            Long l3 = zVar3.I2().d.f196563m;
            if (!((jte.d) zVar3.f190256t).c(CreditCardApi$Toggles$CreditScheduledPayment.f68691c) || l3 == null) {
                long j2 = dVar.f115082a;
                cVar = j2 == jLongValue ? a.b.C1182a.f209327a : j2 < jLongValue ? new mw4.c(dVar) : new mw4.b(dVar);
            } else {
                cVar = new mw4.d(dVar, new dj0.d(Math.max(0L, l3.longValue() - dVar.f115082a), dVar.f115083b));
            }
            try {
                j2 j2Var = zVar3.B;
                Boolean bool = Boolean.TRUE;
                j2Var.getClass();
                j2Var.g(null, bool);
                q qVar = new q(zVar3);
                r rVar = new r(zVar3, cVar);
                s sVar = new s(zVar3, continuation, 0);
                this.u = zVar3;
                this.v = zVar3;
                this.f190246w = 1;
                obj2 = n14.k.V(zVar3, null, qVar, rVar, sVar, this, 1);
                if (obj2 == aVar) {
                    return aVar;
                }
                zVar2 = zVar3;
                zVar = zVar2;
            } catch (Throwable th11) {
                th10 = th11;
                zVar = zVar3;
                j2 j2VarL0 = zVar.L0();
                Boolean bool2 = Boolean.FALSE;
                j2VarL0.getClass();
                j2VarL0.g(null, bool2);
                throw th10;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar2 = this.v;
            zVar = this.u;
            try {
                yhm.o.b(obj2);
            } catch (Throwable th12) {
                th10 = th12;
                j2 j2VarL02 = zVar.L0();
                Boolean bool22 = Boolean.FALSE;
                j2VarL02.getClass();
                j2VarL02.g(null, bool22);
                throw th10;
            }
        }
        nii.h hVar = (nii.h) obj2;
        if ((hVar instanceof nii.g) && (((nii.g) hVar).f216153b instanceof k1)) {
            zVar2.C2(j.f190231a);
        }
        Unit unit = Unit.f186387a;
        j2 j2VarL03 = zVar.L0();
        Boolean bool3 = Boolean.FALSE;
        j2VarL03.getClass();
        j2VarL03.g(null, bool3);
        return Unit.f186387a;
    }
}
