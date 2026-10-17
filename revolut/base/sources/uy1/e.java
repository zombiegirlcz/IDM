package uy1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import wim.z;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = jVar.f284044b;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = o0.b(wy1.e.class);
                companion.getClass();
                List list = (List) eVar.T2("ALIAS_KEY", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    Alias aliasA = vy1.b.a((wy1.e) it8.next());
                    if (aliasA != null) {
                        arrayList.add(aliasA);
                    }
                }
                return arrayList;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.f284045c.remove(jVar.f);
                jVar.f284044b.I0("ALIAS_KEY");
                return Unit.f186387a;
        }
    }
}
