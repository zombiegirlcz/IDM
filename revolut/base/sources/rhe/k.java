package rhe;

import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import tof.i7;
import yhm.o;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ Set A;
    public m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f254428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f254429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f254430y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Set set, Set set2, m mVar, Set set3, Continuation continuation) {
        super(2, continuation);
        this.f254429x = set;
        this.f254430y = set2;
        this.z = mVar;
        this.A = set3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f254429x, this.f254430y, this.z, this.A, continuation);
        kVar.f254428w = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar;
        Object objH;
        Object objB;
        CoroutineScope coroutineScope = (CoroutineScope) this.f254428w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Set set = this.f254430y;
        Set set2 = this.f254429x;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : set2) {
                ProductId productId = ((ProductAccountDescriptor$Value.Main) obj3).f89727a;
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj3);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it8.hasNext();
                mVar = this.z;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it8.next();
                arrayList2.add(e0.g(coroutineScope, null, null, new i(mVar, (ProductId) entry.getKey(), (List) entry.getValue(), this.A, null), 3));
            }
            Set set3 = set;
            ArrayList arrayList3 = new ArrayList(w.t(set3, 10));
            Iterator it9 = set3.iterator();
            while (it9.hasNext()) {
                arrayList3.add(e0.g(coroutineScope, null, null, new qd8.e(mVar, (NonProductAccountFilter) it9.next(), this.A, continuation, 28), 3));
            }
            ArrayList arrayListE0 = d0.E0(arrayList3, arrayList2);
            this.f254428w = coroutineScope;
            this.u = mVar;
            this.v = 1;
            objH = e0.h(arrayListE0, this);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m mVar2 = this.u;
            o.b(obj2);
            mVar = mVar2;
            objH = obj2;
        }
        ArrayList arrayListZ = d0.Z((Iterable) objH);
        c cVar = m.Companion;
        mVar.getClass();
        if (arrayListZ.isEmpty()) {
            objB = null;
        } else if (arrayListZ.size() == 1) {
            objB = (i7) d0.b0(arrayListZ);
        } else {
            i7.c cVar2 = i7.Companion;
            i7[] i7VarArr = (i7[]) arrayListZ.toArray(new i7[0]);
            i7[] i7VarArr2 = (i7[]) Arrays.copyOf(i7VarArr, i7VarArr.length);
            cVar2.getClass();
            objB = i7.c.b(i7VarArr2);
        }
        if (objB != null) {
            return objB;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No TransactionsFilter could be found for accounts: " + set2 + " (additionalFilters=" + set + ")");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }
}
