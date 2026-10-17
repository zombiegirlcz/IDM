package yai;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y20.a1;
import y7k.g0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmailScreen f312029w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EmailScreen emailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f312029w = emailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f312029w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f312029w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmailScreen emailScreen = this.f312029w;
        switch (i) {
            case 0:
                String domain = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) emailScreen.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                aVar2.H2(aVar2.f97593w, new g0(aVar2, domain, 5));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = emailScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature_retail_user_declarations.email.screen.a aVar4 = (com.revolut.feature_retail_user_declarations.email.screen.a) lVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f275445a;
                Continuation continuation = null;
                if (Intrinsics.f(str, "PRIVACY_LINK_ID")) {
                    TermsScope.INSTANCE.getClass();
                    aVar4.l2(new a1(aVar4, TermsScope.f90360a0, continuation, 16), new yi5.b(26));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.r(str, " is not handled"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
