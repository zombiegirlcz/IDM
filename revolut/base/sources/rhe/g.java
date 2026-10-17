package rhe;

import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import tof.i1;
import yhm.o;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f254417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f254418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f254419y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Set set, Set set2, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f254417w = set;
        this.f254418x = set2;
        this.f254419y = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f254417w, this.f254418x, this.f254419y, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterable iterableC;
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Set set = this.f254417w;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : set) {
                ProductId productId = ((ProductAccountDescriptor$Value.Main) obj3).f89727a;
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj3);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(e0.g(coroutineScope, null, null, new f(this.f254419y, (ProductId) entry.getKey(), (List) entry.getValue(), null), 3));
            }
            this.v = null;
            this.u = 1;
            obj2 = e0.h(arrayList2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Set setI1 = d0.i1(w.u(d0.Z((Iterable) obj2)));
        Set<NonProductAccountFilter> set2 = this.f254418x;
        ArrayList arrayList3 = new ArrayList();
        for (NonProductAccountFilter nonProductAccountFilter : set2) {
            if (Intrinsics.f(nonProductAccountFilter, NonProductAccountFilter.Crypto.f89715a)) {
                iterableC = u.c(i1.f272794a);
            } else {
                if (!(nonProductAccountFilter instanceof NonProductAccountFilter.Invest)) {
                    throw new NoWhenBranchMatchedException();
                }
                iterableC = f0.f322471a;
            }
            a0.x(iterableC, arrayList3);
        }
        return a1.l(setI1, arrayList3);
    }
}
