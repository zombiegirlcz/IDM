package ll7;

import com.revolut.feature.insurance_car.impl.data.model.Contact;
import com.revolut.feature.insurance_car.impl.data.model.DrivingStatisticNotExistsException;
import com.revolut.feature.insurance_car.impl.data.model.TodoItem;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import hl7.b3;
import hl7.fa;
import hl7.ia;
import hl7.k9;
import hl7.l1;
import hl7.o1;
import hl7.w6;
import hl7.w9;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl7.f2;
import kl7.g2;
import kl7.h1;
import kl7.j2;
import kl7.k2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f196593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f196594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(e0 e0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196593w = e0Var;
        this.f196594x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f196593w, this.f196594x, continuation, 0);
            case 1:
                return new a0(this.f196593w, this.f196594x, continuation, 1);
            case 2:
                return new a0(this.f196593w, this.f196594x, continuation, 2);
            case 3:
                return new a0(this.f196593w, this.f196594x, continuation, 3);
            case 4:
                return new a0(this.f196593w, this.f196594x, continuation, 4);
            case 5:
                return new a0(this.f196593w, this.f196594x, continuation, 5);
            default:
                return new a0(this.f196593w, this.f196594x, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v18, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws DrivingStatisticNotExistsException {
        int i = this.u;
        String str = this.f196594x;
        e0 e0Var = this.f196593w;
        switch (i) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService.getContacts(str, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable<o1> iterable = (Iterable) obj2;
                arrayList = new ArrayList(zhm.w.t(iterable, 10));
                for (o1 o1Var : iterable) {
                    Object obj3 = jl7.g.f175624a;
                    Intrinsics.checkNotNullParameter(o1Var, "<this>");
                    String str2 = o1Var.f153238a;
                    String str3 = o1Var.f153239b;
                    List<l1> list = o1Var.f153240c;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                    for (l1 l1Var : list) {
                        Intrinsics.checkNotNullParameter(l1Var, "<this>");
                        arrayList2.add(new Contact((kl7.e) u1.u(l1Var.f153181a, jl7.g.f175624a), l1Var.f153182b, l1Var.f153183c, l1Var.d));
                    }
                    arrayList.add(new kl7.f(str2, str3, arrayList2));
                }
                return arrayList;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService2 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService2.getDrivingStatistics(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response = (Response) obj2;
                if (response.code() == 204) {
                    throw DrivingStatisticNotExistsException.f75215a;
                }
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                b3 b3Var = (b3) response.body();
                if (b3Var != null) {
                    return cp5.d.S(b3Var);
                }
                throw DrivingStatisticNotExistsException.f75215a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService3 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService3.getCancellationRefund(str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cj9.c.S((hl7.g0) obj2);
            case 3:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService4 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService4.getPolicyPlan(str, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                w6 w6Var = (w6) obj2;
                String baseUrl = e0Var.e;
                Intrinsics.checkNotNullParameter(w6Var, "<this>");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                List list2 = w6Var.f153353a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(jl7.d.b((hl7.l) it8.next(), baseUrl));
                }
                return new h1(arrayList3);
            case 4:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService5 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService5.getRequestedDocuments(str, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return jl7.n.a((k9) obj2);
            case 5:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService6 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService6.getTelematicsDeviceDelivery(str, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                w9 w9Var = (w9) obj2;
                Intrinsics.checkNotNullParameter(w9Var, "<this>");
                LocalDate localDate = LocalDate.parse(w9Var.f153355a);
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                return new g2(localDate, oo3.a.a(w9Var.f153356b), new f2(w9Var.f153357c, w9Var.d));
            default:
                Object arrayList4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService7 = e0Var.f196609a;
                    this.v = 1;
                    obj2 = insuranceCarService7.getTodoItems(str, this);
                    if (obj2 != arrayList4) {
                    }
                    return arrayList4;
                }
                if (i32 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                ia iaVar = (ia) obj2;
                Object obj4 = jl7.o.f175635a;
                Intrinsics.checkNotNullParameter(iaVar, "<this>");
                List<fa> list3 = iaVar.f153153a;
                arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                for (fa faVar : list3) {
                    Intrinsics.checkNotNullParameter(faVar, "<this>");
                    arrayList4.add(new TodoItem((k2) u1.t(faVar.f153105a, k2.UNKNOWN, jl7.o.f175635a), faVar.f153106b, faVar.f153107c, faVar.d, (j2) u1.t(faVar.e, j2.INFO, jl7.o.f175636b), faVar.f, faVar.f153108g));
                }
                return arrayList4;
        }
    }
}
