package ll7;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f196625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ApplicationForm f196626x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, ApplicationForm applicationForm, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196625w = hVar;
        this.f196626x = applicationForm;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f196625w, this.f196626x, continuation, 0);
            default:
                return new g(this.f196625w, this.f196626x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f196625w;
        ApplicationForm applicationForm = this.f196626x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService = hVar.f196631a;
                    String str = applicationForm.f75166a;
                    hl7.i iVarD = jl7.c.d(applicationForm);
                    this.v = 1;
                    if (insuranceCarService.sendApplicationForm(str, iVarD, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                d dVar = h.Companion;
                List listA = hVar.a();
                if (listA == null) {
                    listA = zhm.f0.f322471a;
                }
                ArrayList arrayListF1 = zhm.d0.f1(listA);
                Iterator it8 = arrayListF1.iterator();
                int i3 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i3 = -1;
                    } else if (!Intrinsics.f(((ApplicationForm) it8.next()).f75166a, applicationForm.f75166a)) {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    arrayListF1.set(i3, applicationForm);
                } else {
                    arrayListF1.add(0, applicationForm);
                }
                w4l.f fVar = hVar.f196635h;
                Unit unit = Unit.f186387a;
                fVar.j(unit, arrayListF1);
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService2 = hVar.f196631a;
                    String str2 = applicationForm.f75166a;
                    hl7.i iVarD2 = jl7.c.d(applicationForm);
                    this.v = 1;
                    if (insuranceCarService2.sendRenewalApplicationForm(str2, iVarD2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar = hVar.i;
                String str3 = applicationForm.f75166a;
                this.v = 2;
                if (cVar.f(str3, applicationForm, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
