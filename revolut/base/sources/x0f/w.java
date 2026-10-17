package x0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kye.a3;
import nii.l1;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f301605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301605w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f301605w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f301605w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f301605w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            default:
                w wVar4 = new w(this.f301605w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((AutoTopUpState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Object next2;
        int i = this.u;
        y yVar = this.f301605w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = list;
                Iterator it8 = list2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((aue.b) next).a() == aue.c.COUNTRY_SPECIFIC_LIMIT) {
                        }
                    } else {
                        next = null;
                    }
                }
                aue.b bVar = (aue.b) next;
                Iterator it9 = list2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (((aue.b) next2).a() == aue.c.UNVERIFIED_CARDS_LIMIT) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                aue.b bVar2 = (aue.b) next2;
                if (bVar == null) {
                    bVar = bVar2;
                }
                aue.a aVar2 = bVar instanceof aue.a ? (aue.a) bVar : null;
                if (aVar2 != null) {
                    yVar.H2(yVar.f301613y, new a3(1, aVar2));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("No limit found for card status with required limit");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f301613y, new wug.i(data, 27));
                break;
            case 2:
                AutoTopUpState autoTopUpState = (AutoTopUpState) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f301613y, new x0b.c(autoTopUpState, 4));
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    yVar.C2(new n(yVar.o.f91099a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
