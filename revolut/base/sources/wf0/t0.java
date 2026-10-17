package wf0;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f296926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f296926w = u0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(this.f296926w, continuation, 0);
                t0Var.v = list;
                return t0Var.invokeSuspend(Unit.f186387a);
            case 1:
                t0 t0Var2 = new t0(this.f296926w, continuation, 1);
                t0Var2.v = list;
                return t0Var2.invokeSuspend(Unit.f186387a);
            default:
                t0 t0Var3 = new t0(this.f296926w, continuation, 2);
                t0Var3.v = list;
                return t0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        u0 u0Var = this.f296926w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar = u0Var.f296929c;
                List<cj0.a> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (cj0.a aVar2 : list2) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    arrayList.add(new cg0.p(aVar2.f24567a, aVar2.f24568b, aVar2.f24569c));
                }
                cVar.G(arrayList, "QUICK_ACTIONS_STORAGE_KEY", kii.e.o(cg0.p.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 1:
                List list3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar2 = u0Var.f296929c;
                List<cj0.b> list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                for (cj0.b bVar : list4) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    arrayList2.add(new cg0.t(bVar.f24570a, bVar.f24571b));
                }
                cVar2.G(arrayList2, "SUGGESTED_ARTICLES_STORAGE_KEY", kii.e.o(cg0.t.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            default:
                List list5 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar3 = u0Var.f296929c;
                List<cj0.c> list6 = list5;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list6, 10));
                for (cj0.c cVar4 : list6) {
                    Intrinsics.checkNotNullParameter(cVar4, "<this>");
                    UUID uuid = cVar4.f24572a;
                    cj0.d type = cVar4.f24573b;
                    Intrinsics.checkNotNullParameter(type, "type");
                    int i2 = bg0.b.f15043a[type.ordinal()];
                    if (i2 == 1) {
                        str = "TRANSACTION";
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "CARD";
                    }
                    arrayList3.add(new cg0.v(uuid, str));
                }
                cVar3.G(arrayList3, "TROUBLESHOOT_STORAGE_KEY", kii.e.o(cg0.v.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
        }
    }
}
