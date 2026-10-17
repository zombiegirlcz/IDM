package cni;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.oauth.impl.R$string;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f25446w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25446w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f25446w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f25446w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = th10 instanceof UserCancelledSsoException;
                boolean z3 = true;
                z3 = true;
                q qVar = this.f25446w;
                if (z) {
                    qVar.C2(j.f25441a);
                } else if (tj0.a.a(th10)) {
                    z3 = false;
                } else {
                    yji.l.a1(qVar, qVar.X1(new y0("generic_failure_dialog", new z(new TextLocalisedClause(R$string.revolut_oauth_consent_failure_title_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new o(qVar, null, z3 ? 1 : 0), 3);
                }
                return Boolean.valueOf(z3);
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data.getError();
                if (error != null && !tj0.a.a(error)) {
                    throw error;
                }
                q qVar2 = this.f25446w;
                qVar2.H2(qVar2.f25450s, new ck2.c(data, 11));
                return Unit.f186387a;
        }
    }
}
