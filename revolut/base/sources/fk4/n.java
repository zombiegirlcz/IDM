package fk4;

import com.revolut.feature.credit.autopay.models.AccountDetails;
import fg8.i0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q0;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f135713w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f135713w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f135713w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            y yVarD = rd0.e.d(new f1l.e(mo3.a.g(new q0(((hk4.b) qVar.f135716p).a(), new m(qVar, null), 1), null, new i0(29), 1), this.f135713w, 1), h0.f322473a);
            this.u = 1;
            obj2 = vkm.q.x(yVarD, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        AccountDetails.LinkedAccount selectedAccount = (AccountDetails.LinkedAccount) obj2;
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        qVar.v2(new g(selectedAccount));
        return Unit.f186387a;
    }
}
