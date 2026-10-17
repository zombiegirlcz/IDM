package mll;

import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.Identifier;
import gnl.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ gnl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207076w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(gnl.i iVar, com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f207076w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f207076w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Claim claim;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            gnl.i iVar = this.v;
            if (iVar instanceof gnl.k) {
                Identifier identifier = ((gnl.k) iVar).f145039a;
                if (identifier instanceof Identifier.Email) {
                    claim = (Claim.Email) yjl.h.b(identifier);
                } else {
                    if (!(identifier instanceof Identifier.Phone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    claim = (Claim.Phone) yjl.h.b(identifier);
                }
            } else {
                if (!(iVar instanceof i.e) && !(iVar instanceof gnl.j) && !(iVar instanceof i.a) && !(iVar instanceof gnl.l) && !(iVar instanceof i.b) && !(iVar instanceof i.c) && !(iVar instanceof i.f) && !(iVar instanceof i.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", iVar.getClass() + " is not supported here. Please review screen configuration", null, h0Var);
                claim = null;
            }
            if (claim == null) {
                return Unit.f186387a;
            }
            this.u = 1;
            if (this.f207076w.Z2(claim, this) == aVar) {
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
