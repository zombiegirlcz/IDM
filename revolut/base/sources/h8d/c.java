package h8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FaqSearchRev10Screen f149992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FaqSearchRev10Screen faqSearchRev10Screen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149992w = faqSearchRev10Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f149992w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f149992w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f149992w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FaqSearchRev10Screen faqSearchRev10Screen = this.f149992w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT2 = faqSearchRev10Screen.T2();
                Intrinsics.h(query);
                v vVar = (v) nVarT2;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                vVar.f150015t.k(new o(d0.F0(query).toString(), 0, false, false));
                break;
            case 1:
                String query2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT22 = faqSearchRev10Screen.T2();
                Intrinsics.h(query2);
                v vVar2 = (v) nVarT22;
                vVar2.getClass();
                Intrinsics.checkNotNullParameter(query2, "query");
                vVar2.f150015t.k(new o(d0.F0(query2).toString(), 0, false, true));
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT23 = faqSearchRev10Screen.T2();
                v vVar3 = (v) nVarT23;
                vVar3.y2(aVar3.d, aVar3.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
