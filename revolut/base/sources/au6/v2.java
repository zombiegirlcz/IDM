package au6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w2 f9645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(w2 w2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9645w = w2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v2 v2Var = new v2(this.f9645w, continuation, 0);
                v2Var.v = obj2;
                return v2Var;
            default:
                v2 v2Var2 = new v2(this.f9645w, continuation, 1);
                v2Var2.v = obj2;
                return v2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ds6.j jVar = (ds6.j) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v2) create(jVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        w2 w2Var = this.f9645w;
        switch (i) {
            case 0:
                ds6.j jVar = (ds6.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wt6.a aVar2 = (wt6.a) wp5.y.t(wt6.a.class, w2Var.f9653c, j6.a.q("freelancer:taxAuthority", jVar.name()));
                if (aVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                return new ds6.q(aVar2.getWebsiteUrl(), aVar2.getPaymentDisclaimerUrl());
            default:
                ds6.j jVar2 = (ds6.j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = w2Var.f9653c;
                String strQ = j6.a.q("freelancer:taxAuthorityPaymentDetails:", jVar2.name());
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(wt6.c.class);
                companion.getClass();
                List list = (List) eVar.T2(strQ, wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        ds6.w wVarG = bu6.f.g((wt6.c) it8.next());
                        if (wVarG != null) {
                            arrayList.add(wVarG);
                        }
                    }
                }
                return arrayList;
        }
    }
}
