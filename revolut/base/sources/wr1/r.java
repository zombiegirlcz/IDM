package wr1;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import wp5.w;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.i implements Function1 {
    public AccountId.Personal u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f299505w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Continuation continuation) {
        super(1, continuation);
        this.f299505w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f299505w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AccountId.Personal accountId;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        u uVar = this.f299505w;
        if (i == 0) {
            yhm.o.b(obj2);
            wsg.n nVar = uVar.o;
            xi0.b.Companion.getClass();
            z zVarI = ue0.e.I(osg.b.r(nVar, xi0.b.z, null, null, null, 62), h0.f322473a, new w(17));
            AccountId.Personal personal = AccountId.Personal.f51414a;
            this.u = personal;
            this.v = 1;
            obj2 = nim.a.b(zVarI, this);
            if (obj2 == aVar) {
                return aVar;
            }
            accountId = personal;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountId = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        io3.d pocket = (io3.d) obj2;
        tr1.f fVar = uVar.f299510s;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        yji.l.a1(uVar, new t38.e(vo9.a.a(fVar.f273633a, pocket, accountId, 4), 6, accountId, pocket), null, null, new p(uVar, null, 2), 3);
        return Unit.f186387a;
    }
}
