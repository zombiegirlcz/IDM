package iek;

import be7.s;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreenContract$InputData;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f160762w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f160762w, continuation, 0);
            default:
                return new l(this.f160762w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        n nVar = this.f160762w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    lek.b bVar = nVar.f160763p;
                    String str = nVar.o.f102585a;
                    this.v = 1;
                    bek.g gVar = ((lek.m) bVar).f194586a;
                    gVar.getClass();
                    s sVar = new s(gVar, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, sVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    PodNomineeDetailsScreenContract$InputData podNomineeDetailsScreenContract$InputData = nVar.o;
                    if (podNomineeDetailsScreenContract$InputData.f102586b) {
                        lek.b bVar2 = nVar.f160763p;
                        String str2 = podNomineeDetailsScreenContract$InputData.f102585a;
                        this.v = 1;
                        if (((lek.m) bVar2).d(str2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l lVar = new l(nVar, continuation, 0);
                        this.v = 2;
                        if (q.t(nVar, lVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
