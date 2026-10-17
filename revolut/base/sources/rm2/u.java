package rm2;

import cli.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.backgroundpicker.impl.flow.catalogue.b f255201w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255201w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f255201w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f255201w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = this.f255201w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) pair.f186385a;
                Map map = (Map) pair.f186386b;
                Set setKeySet = map.keySet();
                y yVar = bVar.v;
                em2.b bVar2 = ((h) ((j2) yVar.f22677a).getValue()).d;
                if (bVar2 == null || !setKeySet.contains(bVar2)) {
                    if (str == null) {
                        bVar2 = (em2.b) d0.a0(setKeySet);
                    } else {
                        Iterator it8 = map.entrySet().iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                List list = (List) ((bn2.t) ((Map.Entry) next).getValue()).f17041a.getContent();
                                if (list != null) {
                                    List list2 = list;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator it9 = list2.iterator();
                                        while (it9.hasNext()) {
                                            if (Intrinsics.f(((em2.e) it9.next()).a(), str)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        bVar2 = entry != null ? (em2.b) entry.getKey() : null;
                        if (bVar2 == null) {
                            bVar2 = (em2.b) d0.a0(setKeySet);
                        }
                    }
                }
                bVar.H2(yVar, new qz9.o(map, 21, str, bVar2));
                break;
            default:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    String path = ((e60.m) lVar).b().getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    bVar.C2(new m(path));
                }
                break;
        }
        return Unit.f186387a;
    }
}
