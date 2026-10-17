package zeb;

import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import wim.z;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Map map = (Map) this.u.f321655c.T2("REVERYWHERE_CONFIG_STORAGE_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(c.class)))));
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ReverywhereMiniAppName.INSTANCE.getClass();
            linkedHashMap.put(ReverywhereMiniAppName.Companion.a(str), entry.getValue());
        }
        return linkedHashMap;
    }
}
