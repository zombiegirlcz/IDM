package vy5;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f293188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
        this.f293188w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f293188w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = this.v.b3(this.f293188w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        io3.d dVar = (io3.d) obj2;
        if (dVar != null) {
            return new StartUpPocket.FiatCurrencyAccount(dVar.f163145a);
        }
        return null;
    }
}
