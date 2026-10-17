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
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.invitation.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.e f194514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_coparent.impl.ui.invitation.b bVar, zm3.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f194514w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f194514w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
            obj2 = vVar.o(this.f194514w, this);
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
