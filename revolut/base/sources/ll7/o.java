package ll7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import hl7.j5;
import hl7.p2;
import hl7.s2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import le.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Survey.Licence f196647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f196648x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Survey.Licence licence, String str, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
        this.f196647w = licence;
        this.f196648x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f196647w, this.f196648x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            String strU = wp5.y.u(pVar.f196650b, "toString(...)");
            Object obj3 = jl7.c.f175619a;
            Survey.Licence licence = this.f196647w;
            Intrinsics.checkNotNullParameter(licence, "<this>");
            Answer.LicenceType licenceType = licence.f75327a;
            Object obj4 = jl7.b.f175612a;
            Intrinsics.checkNotNullParameter(licenceType, "<this>");
            String strG = u1.g(licenceType, jl7.b.f175612a);
            Answer.LicenceDuration licenceDuration = licence.f75328b;
            Intrinsics.checkNotNullParameter(licenceDuration, "<this>");
            s2 s2Var = new s2(strU, new p2(strG, u1.g(licenceDuration, jl7.b.f175613b)));
            InsuranceCarService insuranceCarService = pVar.f196649a;
            this.u = 1;
            obj2 = insuranceCarService.createDrivingLicenceMta(this.f196648x, s2Var, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        String str = ((j5) obj2).f153161a;
        this.u = 2;
        Object objA = m.a(pVar, str, this);
        return objA == aVar ? aVar : objA;
    }
}
