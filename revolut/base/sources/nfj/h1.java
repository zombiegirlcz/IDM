package nfj;

import dej.u3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.b3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f214955w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(m1 m1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f214955w = m1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h1 h1Var = new h1(this.f214955w, continuation, 0);
                h1Var.v = list;
                return h1Var.invokeSuspend(Unit.f186387a);
            default:
                h1 h1Var2 = new h1(this.f214955w, continuation, 1);
                h1Var2.v = list;
                return h1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m1 m1Var = this.f214955w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m1Var.f214989c.G(ofj.m.c(list), "PROFILES_KEY", kii.e.o(kfj.w2.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                List list2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = m1Var.f214989c;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                List<dej.p1> list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (dej.p1 p1Var : list3) {
                    Intrinsics.checkNotNullParameter(p1Var, "<this>");
                    String str = p1Var.f113614a;
                    ArrayList arrayList2 = p1Var.f113615b;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(((u3) it8.next()).name());
                    }
                    arrayList.add(new b3(str, arrayList3));
                }
                cVar.G(arrayList, "TROUBLESHOOTING_SCOPES_KEY", kii.e.o(b3.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
