package sf9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f262373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f262373w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f262373w, continuation, 0);
            default:
                return new f(this.f262373w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        j jVar;
        LinkedHashMap linkedHashMap;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = this.f262373w;
                s15.j jVar2 = new s15.j(gVar, (Continuation) null, 4);
                this.v = 1;
                Object objY2 = gVar.Y2(this, jVar2);
                return objY2 == aVar ? aVar : objY2;
            default:
                g gVar2 = this.f262373w;
                j2 j2Var = gVar2.f262381t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    wo1.b bVar = gVar2.f262375m;
                    xo1.g gVar3 = xo1.g.TAPI;
                    Biller biller = ((j) j2Var.getValue()).f262383a;
                    String str = biller != null ? biller.f61145a : null;
                    if (str == null) {
                        str = "";
                    }
                    xo1.d dVar = new xo1.d(gVar3, str, "1.0", 10);
                    this.v = 1;
                    obj2 = ((vp1.c) bVar).b(dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                List list = (List) obj2;
                do {
                    value = j2Var.getValue();
                    jVar = (j) value;
                    List<BillFormField> list2 = list;
                    int iB = q0.b(w.t(list2, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iB);
                    for (BillFormField billFormField : list2) {
                        String str2 = billFormField.f61274a;
                        String str3 = billFormField.i;
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedHashMap.put(str2, str3);
                    }
                } while (!j2Var.h(value, j.a(jVar, null, list, linkedHashMap, 15)));
                return Unit.f186387a;
        }
    }
}
