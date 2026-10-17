package e34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import gim.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import t04.k;
import t04.n;
import t04.q;
import yhm.o;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f122190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f122191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f122192y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, ArrayList arrayList, c cVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.f122192y = str;
        this.f122190w = arrayList;
        this.f122191x = cVar;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f122192y, this.f122190w, this.f122191x, this.z, continuation);
            default:
                return new a(this.f122190w, this.f122191x, this.f122192y, this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f122191x;
                if (i == 0) {
                    o.b(obj2);
                    ArrayList<my3.o> arrayList = this.f122190w;
                    int iB = q0.b(w.t(arrayList, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (my3.o oVar : arrayList) {
                        String id10 = oVar.getId();
                        q qVar = cVar.f122197c;
                        linkedHashMap.put(id10, q.a(oVar));
                    }
                    t04.b bVar = new t04.b(linkedHashMap, this.f122192y);
                    CreditPluginsService creditPluginsService = cVar.f122195a;
                    this.v = 1;
                    obj2 = creditPluginsService.addOutstandingDebtV3(this.z, bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar.f122196b.a(((n) obj2).getDebtsHub());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f122191x;
                if (i2 == 0) {
                    o.b(obj2);
                    ArrayList<my3.o> arrayList2 = this.f122190w;
                    int iB2 = q0.b(w.t(arrayList2, 10));
                    if (iB2 < 16) {
                        iB2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                    for (my3.o oVar2 : arrayList2) {
                        String id11 = oVar2.getId();
                        q qVar2 = cVar2.f122197c;
                        linkedHashMap2.put(id11, q.a(oVar2));
                    }
                    k kVar = new k(linkedHashMap2);
                    CreditPluginsService creditPluginsService2 = cVar2.f122195a;
                    this.v = 1;
                    obj2 = creditPluginsService2.editOutstandingDebtV3(this.f122192y, this.z, kVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar2.f122196b.a(((n) obj2).getDebtsHub());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList, c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f122190w = arrayList;
        this.f122191x = cVar;
        this.f122192y = str;
        this.z = str2;
    }
}
