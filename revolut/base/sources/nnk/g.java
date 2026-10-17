package nnk;

import com.revolut.core.model.FileExtension;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.n;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f217719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PricingPlanTerms f217720x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, PricingPlanTerms pricingPlanTerms, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f217719w = str;
        this.f217720x = pricingPlanTerms;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f217719w, this.f217720x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.v;
        if (i == 0) {
            o.b(obj2);
            n nVarB = hVar.f217721p.b(this.f217719w, true, FileExtension.Pdf.f51406b);
            this.u = 1;
            obj2 = nim.a.b(nVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        File file = (File) obj2;
        tqi.g gVar = hVar.f217722q;
        String str = this.f217720x.f103309b;
        Intrinsics.h(file);
        hVar.C1(u0.b(gVar.c(str, file, "application/pdf", new Integer(10013))));
        hVar.H2(hVar.f217723r, new nnf.h(3));
        return Unit.f186387a;
    }
}
