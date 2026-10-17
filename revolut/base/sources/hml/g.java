package hml;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dml.h f153991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge.Qr.Delegated f153992x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.sso.impl.ui.consent.qr.b bVar, dml.h hVar, ConsentChallenge.Qr.Delegated delegated, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f153991w = hVar;
        this.f153992x = delegated;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f153991w, this.f153992x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            dml.f fVar = (dml.f) this.f153991w;
            fVar.getClass();
            ConsentChallenge.Qr.Delegated.Selection.Identity identity = fVar.f116195a;
            this.u = 1;
            if (this.v.L2("TAG_BUTTON_CONTINUE", identity, this.f153992x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
