package eql;

import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f128519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f128520x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f128519w = c0Var;
        this.f128520x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.f128519w, this.f128520x, continuation);
        vVar.v = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((akl.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        akl.l lVar = (akl.l) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = ((rqk.k) this.f128519w.u).f256593p;
            m70.a.c(t0.f186434a);
            Intrinsics.checkNotNullParameter("", "id");
            Claim.Google google = new Claim.Google("");
            GoogleEvidence googleEvidence = new GoogleEvidence(this.f128520x);
            this.v = null;
            this.u = 1;
            if (((akl.r) lVar).e(str, null, google, googleEvidence, this) == aVar) {
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
