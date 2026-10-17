package wf0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ u0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(u0 u0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = u0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s0(this.v, continuation, 0);
            case 1:
                return new s0(this.v, continuation, 1);
            default:
                return new s0(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        u0 u0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar = u0Var.f296929c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(cg0.p.class);
                companion.getClass();
                List list = (List) cVar.T2("QUICK_ACTIONS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list != null) {
                    List<cg0.p> list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (cg0.p pVar : list2) {
                        Intrinsics.checkNotNullParameter(pVar, "<this>");
                        arrayList.add(new cj0.a(pVar.getTitle(), pVar.getDeeplink(), pVar.getIcon()));
                    }
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar2 = u0Var.f296929c;
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KType kTypeB2 = kotlin.jvm.internal.o0.b(cg0.t.class);
                companion2.getClass();
                List list3 = (List) cVar2.T2("SUGGESTED_ARTICLES_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB2))));
                if (list3 != null) {
                    List<cg0.t> list4 = list3;
                    arrayList = new ArrayList(zhm.w.t(list4, 10));
                    for (cg0.t tVar : list4) {
                        Intrinsics.checkNotNullParameter(tVar, "<this>");
                        arrayList.add(new cj0.b(tVar.getTitle(), tVar.getDeeplink()));
                    }
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar3 = u0Var.f296929c;
                KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
                KType kTypeB3 = kotlin.jvm.internal.o0.b(cg0.v.class);
                companion3.getClass();
                List list5 = (List) cVar3.T2("TROUBLESHOOT_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB3))));
                if (list5 != null) {
                    List list6 = list5;
                    arrayList = new ArrayList(zhm.w.t(list6, 10));
                    Iterator it8 = list6.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(knm.b.C((cg0.v) it8.next()));
                    }
                }
                break;
        }
        return arrayList;
    }
}
