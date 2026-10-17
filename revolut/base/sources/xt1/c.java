package xt1;

import com.revolut.feature.apm.blik.impl.data.network.BlikService;
import com.revolut.feature.apm.core.models.blik.BlikEligibilityTerms;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.d0;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;
import zt1.e;
import zt1.k;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f308741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308741w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f308741w, continuation, 0);
            default:
                return new c(this.f308741w, continuation, 1);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.f308741w;
        switch (i) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BlikService blikService = dVar.f308742a;
                    this.v = 1;
                    obj2 = blikService.getBlikP2PTerms(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                List<zt1.c> terms = ((e) obj2).getTerms();
                arrayList = new ArrayList(w.t(terms, 10));
                for (zt1.c cVar : terms) {
                    Object obj3 = yt1.a.f316607a;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    String title = cVar.getTitle();
                    String subtitle = cVar.getSubtitle();
                    List scopes = cVar.getScopes();
                    ArrayList arrayList2 = new ArrayList(w.t(scopes, 10));
                    Iterator it8 = scopes.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(new TermsScope((String) it8.next()));
                    }
                    arrayList.add(new BlikEligibilityTerms(title, subtitle, arrayList2));
                }
                return arrayList;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    d0<List<k>> blikTransactions = dVar.f308742a.getBlikTransactions();
                    this.v = 1;
                    obj2 = nim.a.b(blikTransactions, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Intrinsics.h((List) obj2);
                return Boolean.valueOf(!r9.isEmpty());
        }
    }
}
