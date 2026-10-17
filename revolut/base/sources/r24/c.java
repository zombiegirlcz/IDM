package r24;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f251045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f251046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f251047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, String str, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251045w = dVar;
        this.f251046x = str;
        this.f251047y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f251045w, this.f251046x, this.f251047y, continuation, 0);
            default:
                return new c(this.f251045w, this.f251046x, this.f251047y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                d dVar = this.f251045w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = dVar.f251048a;
                    List list = this.f251047y;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(oo3.a.d((Address) it8.next()));
                    }
                    this.v = 1;
                    obj2 = creditPluginsService.submitAddressHistory(this.f251046x, arrayList, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dVar.f251049b.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                d dVar2 = this.f251045w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = dVar2.f251048a;
                    List list2 = this.f251047y;
                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((hv3.a) it9.next()).f155783a);
                    }
                    this.v = 1;
                    obj2 = creditPluginsService2.submitAddressSelection(this.f251046x, arrayList2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dVar2.f251049b.p((tt3.a) obj2);
        }
    }
}
