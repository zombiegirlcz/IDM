package rx9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import cu8.r0;
import dj0.d;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ks8.j;
import ks8.m;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.a f258083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f258084x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, zm3.a aVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f258083w = aVar;
        this.f258084x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f258083w, this.f258084x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r0 r0Var = cVar.f258086a;
            this.u = 1;
            obj2 = m.b(r0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = (j) obj2;
        if (jVar instanceof ks8.i) {
            return ((ks8.i) jVar).f189312a;
        }
        if (!Intrinsics.f(jVar, j.a.f189313a)) {
            throw new NoWhenBranchMatchedException();
        }
        return gc0.c.f(((uz9.a) cVar.f258088c).a(new ChatTransferRecipient.ContactRecipient(this.f258083w), new TransferMoneyPocket(this.f258084x, null, 2)));
    }
}
