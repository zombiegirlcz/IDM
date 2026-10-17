package cf6;

import bf6.g;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import se6.h;
import yhm.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f23561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f23561w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f23561w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f23561w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        int i = this.u;
        ArrayList arrayList = null;
        e eVar = this.f23561w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List<af6.c> list = (List) p.a.j(af6.c.class, KTypeProjection.INSTANCE, List.class, eVar.f23568h, j6.a.q("BRANCHES_STORAGE_KEY_", str));
                if (list == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (af6.c entity : list) {
                    Intrinsics.checkNotNullParameter(entity, "entity");
                    try {
                        String strA = entity.getId();
                        String strC = entity.getName();
                        uo3.a institutionLogoEntity = entity.getLogo();
                        Intrinsics.checkNotNullParameter(institutionLogoEntity, "institutionLogoEntity");
                        hVar = new h(strA, strC, new io3.b(io3.a.valueOf(institutionLogoEntity.getType()), institutionLogoEntity.getValue()));
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                    break;
                }
                return arrayList2;
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list2 = (List) p.a.j(af6.d.class, KTypeProjection.INSTANCE, List.class, eVar.f23567g, j6.a.q("COUNTRY_DEPARTMENTS_STORAGE_KEY_PREFIX_", str2));
                if (list2 != null) {
                    List list3 = list2;
                    g gVar = eVar.e;
                    arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(gVar.a((af6.d) it8.next()));
                    }
                }
                return arrayList;
        }
    }
}
