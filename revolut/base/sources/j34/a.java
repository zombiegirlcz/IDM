package j34;

import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getDocumentsType$1;
import ft3.h1;
import gim.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1 f170960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ry3.a f170961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, h1 h1Var, ry3.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = gVar;
        this.f170960w = h1Var;
        this.f170961x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, this.f170960w, this.f170961x, continuation, 0);
            default:
                return new a(this.v, this.f170960w, this.f170961x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ry3.a aVar = this.f170961x;
        h1 h1Var = this.f170960w;
        g gVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ve0.c cVar = gVar.e;
                String strC = g.c(h1Var);
                ArrayList arrayListF0 = d0.F0(s.L(aVar), g.a(gVar, h1Var));
                Type type = new FinancialEvidenceRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "access$getDocumentsType(...)");
                cVar.G(arrayListF0, strC, type);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ve0.c cVar2 = gVar.e;
                String strC2 = g.c(h1Var);
                ArrayList arrayListA0 = d0.A0(g.a(gVar, h1Var), s.L(aVar));
                Type type2 = new FinancialEvidenceRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "access$getDocumentsType(...)");
                cVar2.G(arrayListA0, strC2, type2);
                break;
        }
        return Unit.f186387a;
    }
}
