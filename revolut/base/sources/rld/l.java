package rld;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.w1;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f255023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ akd.a f255024x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, akd.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255023w = mVar;
        this.f255024x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f255023w, this.f255024x, continuation, 0);
            default:
                return new l(this.f255023w, this.f255024x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    m mVar = this.f255023w;
                    SlotContext slotContextH = mVar.f255027r.h();
                    skd.i iVar = mVar.f255026q;
                    SlotDefaultPrompt slotDefaultPrompt = mVar.o.f87376a;
                    this.v = 1;
                    if (iVar.i(slotContextH, slotDefaultPrompt, this.f255024x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    w1 w1Var = w1.f264016b;
                    l lVar = new l(this.f255023w, this.f255024x, null, 0);
                    this.v = 1;
                    if (e0.J(w1Var, lVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
