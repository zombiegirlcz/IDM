package ov7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreen;
import gu7.a4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoverageDetailsScreen f229972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CoverageDetailsScreen coverageDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229972w = coverageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f229972w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f229972w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CoverageDetailsScreen coverageDetailsScreen = this.f229972w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Clause clause = aVar.f275447c;
                Object obj3 = aVar.d;
                String str = aVar.f275445a;
                if (clause instanceof HtmlClause) {
                    l lVarE3 = coverageDetailsScreen.e3();
                    String str2 = aVar.f275446b;
                    ((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) lVarE3).I2(new a4(obj3, str2, str), str2);
                } else {
                    ((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) coverageDetailsScreen.e3()).I2(obj3, str);
                }
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = coverageDetailsScreen.e3();
                String str3 = aVar3.f275446b;
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) lVarE32;
                bVar.I2(new a4(aVar3.d, str3, aVar3.f275445a), str3);
                break;
        }
        return Unit.f186387a;
    }
}
