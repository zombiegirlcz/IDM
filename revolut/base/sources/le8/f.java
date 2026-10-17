package le8;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import r10.v;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.invitation.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.f f194515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.junior_coparent.impl.ui.invitation.b bVar, zm3.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f194515w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f194515w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.junior_coparent.impl.ui.invitation.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = bVar.f76892r;
            this.u = 1;
            obj2 = vVar.t(this.f194515w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.C1(new ExternalDestination.ByIntent((Intent) obj2, null));
        h.D2(bVar.f76893s);
        return Unit.f186387a;
    }
}
