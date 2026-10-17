package o7e;

import ahf.v;
import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.Subaccount;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k71.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qua.p;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f222777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f222777w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f222777w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f222777w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f222777w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f222777w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Subaccount subaccount = (Subaccount) pair.f186385a;
                List list = (List) pair.f186386b;
                ZonedDateTime zonedDateTimeK = ((l80.f) kVar.v).k();
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(((p) it8.next()).i);
                }
                linkedHashSet.remove(subaccount.a());
                ArrayList arrayList = new ArrayList(w.t(linkedHashSet, 10));
                for (String str : linkedHashSet) {
                    xi0.b.Companion.getClass();
                    arrayList.add(new Pair(xi0.a.a(str), subaccount.getCurrency()));
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.x2(new nsl.g(data, 26));
                break;
            default:
                q qVar = (q) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.x2(new v(qVar, 4));
                break;
        }
        return Unit.f186387a;
    }
}
