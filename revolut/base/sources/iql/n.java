package iql;

import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.Identifier;
import ip0.w10;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ gnl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b f167907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gnl.i iVar, com.revolut.sso.impl.ui.signup.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f167907w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f167907w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.sso.impl.ui.signup.b bVar = this.f167907w;
        qki.d dVar = bVar.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            gnl.k kVar = (gnl.k) this.v;
            Identifier identifier = kVar.f145039a;
            if (identifier instanceof Identifier.Email) {
                bVar.H2(dVar, new ik3.a(((Identifier.Email) identifier).f106149a, 4));
            } else {
                if (!(identifier instanceof Identifier.Phone)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.H2(dVar, new w10(identifier, 27));
            }
            Claim claimB = yjl.h.b(kVar.f145039a);
            this.u = 1;
            if (com.revolut.sso.impl.ui.signup.b.J2(bVar, claimB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
