package wf0;

import com.revolut.core.faq.data.network.HelpCenterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f296919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(u0 u0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f296919w = u0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new q0(this.f296919w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new q0(this.f296919w, continuation, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new q0(this.f296919w, continuation, 2).invokeSuspend(Unit.f186387a);
            default:
                return new q0(this.f296919w, continuation, 3).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fim.a] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        u0 u0Var = this.f296919w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    skm.p0 p0Var = skm.p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    w76.a aVar2 = new w76.a(u0Var, null, 6);
                    this.v = 1;
                    obj2 = skm.e0.J(fVar, aVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((cg0.b) obj2).getDeeplink();
            case 1:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    HelpCenterService helpCenterService = u0Var.f296927a;
                    this.v = 1;
                    obj2 = helpCenterService.getQuickActions(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                List<cg0.p> actions = ((cg0.q) obj2).getActions();
                arrayList = new ArrayList(zhm.w.t(actions, 10));
                for (cg0.p pVar : actions) {
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    arrayList.add(new cj0.a(pVar.getTitle(), pVar.getDeeplink(), pVar.getIcon()));
                }
                return arrayList;
            case 2:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    HelpCenterService helpCenterService2 = u0Var.f296927a;
                    this.v = 1;
                    obj2 = helpCenterService2.getSuggestedArticles(this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                List<cg0.t> articles = ((cg0.u) obj2).getArticles();
                arrayList2 = new ArrayList(zhm.w.t(articles, 10));
                for (cg0.t tVar : articles) {
                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                    arrayList2.add(new cj0.b(tVar.getTitle(), tVar.getDeeplink()));
                }
                return arrayList2;
            default:
                Object arrayList3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    HelpCenterService helpCenterService3 = u0Var.f296927a;
                    this.v = 1;
                    obj2 = helpCenterService3.getTroubleshootingSuggestions(this);
                    if (obj2 != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                List suggestions = ((cg0.w) obj2).getSuggestions();
                arrayList3 = new ArrayList(zhm.w.t(suggestions, 10));
                Iterator it8 = suggestions.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(knm.b.C((cg0.v) it8.next()));
                }
                return arrayList3;
        }
    }
}
