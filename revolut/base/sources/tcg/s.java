package tcg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a f269803w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269803w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f269803w, continuation, 0);
            default:
                return new s(this.f269803w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar2 = this.f269803w;
                    Object objP2 = aVar2.p2(this, new sb4.i(aVar2, null, 18));
                    if (objP2 != aVar) {
                        objP2 = Unit.f186387a;
                    }
                    if (objP2 == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarS1 = lg0.b.s1(this.f269803w.f93944w, "revolut://app/faq?key=f74ea88b-2189-43c6-97b0-609df6481e0b", null, null, 6);
                this.v = 1;
                Object objB = nim.a.b(d0VarS1, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
