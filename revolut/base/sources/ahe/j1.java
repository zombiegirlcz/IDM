package ahe;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.i implements Function2 {
    public final /* synthetic */ k1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Continuation continuation) {
        super(2, continuation);
        this.u = k1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j1(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k1 k1Var = this.u;
        ue0.c cVar = k1Var.f5010b;
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kTypeB = kotlin.jvm.internal.o0.b(e1.class);
            companion.getClass();
            List list = (List) cVar.T2("descriptors_cache_key", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    ProductAccountDescriptor$Value.Main mainA = k1Var.a((e1) it8.next());
                    if (mainA != null) {
                        arrayList.add(mainA);
                    }
                }
                return zhm.d0.i1(arrayList);
            }
        } catch (SerializationException e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            cVar.I0("descriptors_cache_key");
        } catch (Throwable th10) {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
        }
        return null;
    }
}
