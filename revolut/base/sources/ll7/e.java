package ll7;

import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import hl7.p0;
import hl7.u4;
import hl7.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f196603w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196603w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f196603w, continuation, 0);
            case 1:
                return new e(this.f196603w, continuation, 1);
            default:
                return new e(this.f196603w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f196603w;
        switch (i) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService = hVar.f196631a;
                    this.v = 1;
                    obj2 = insuranceCarService.getApplicationForms(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                List list = ((u4) obj2).f153329a;
                arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(jl7.c.a((hl7.i) it8.next()));
                }
                return arrayList;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService2 = hVar.f196631a;
                    this.v = 1;
                    obj2 = insuranceCarService2.getCarMakes(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                p0 p0Var = (p0) obj2;
                Object obj3 = jl7.f.f175621a;
                Intrinsics.checkNotNullParameter(p0Var, "<this>");
                return new kl7.d(p0Var.f153249a);
            default:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService3 = hVar.f196631a;
                    this.v = 1;
                    obj2 = insuranceCarService3.getOccupations(this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable<v5> iterable = (Iterable) obj2;
                arrayList2 = new ArrayList(zhm.w.t(iterable, 10));
                for (v5 v5Var : iterable) {
                    Intrinsics.checkNotNullParameter(v5Var, "<this>");
                    arrayList2.add(new Occupation(v5Var.f153338a, v5Var.f153339b));
                }
                return arrayList2;
        }
    }
}
