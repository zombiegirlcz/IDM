package ll7;

import com.revolut.feature.insurance_car.impl.data.model.DocumentFile;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFilesGroup;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import hl7.g2;
import hl7.j2;
import hl7.z9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl7.h2;
import kl7.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f196597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f196598x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f196598x = e0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f196598x, continuation, 0);
                b0Var.f196597w = str;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(this.f196598x, continuation, 1);
                b0Var2.f196597w = str;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0(this.f196598x, continuation, 2);
                b0Var3.f196597w = str;
                return b0Var3.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var4 = new b0(this.f196598x, continuation, 3);
                b0Var4.f196597w = str;
                return b0Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f196597w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                ArrayList arrayList = null;
                e0 e0Var = this.f196598x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService = e0Var.f196609a;
                    this.f196597w = null;
                    this.v = 1;
                    obj2 = insuranceCarService.getTelematicsDeviceUnplugged(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z9 z9Var = (z9) obj2;
                String baseUrl = e0Var.e;
                Intrinsics.checkNotNullParameter(z9Var, "<this>");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                String str2 = z9Var.f153400a;
                boolean z = z9Var.f153401b;
                List list = z9Var.f153402c;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(jl7.d.b((hl7.l) it8.next(), baseUrl));
                    }
                }
                return new h2(str2, arrayList, z);
            case 1:
                String str3 = this.f196597w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e0 e0Var2 = this.f196598x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService2 = e0Var2.f196609a;
                    this.f196597w = null;
                    this.v = 1;
                    obj2 = insuranceCarService2.getDocumentFiles(str3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j2 j2Var = (j2) obj2;
                String baseUrl2 = e0Var2.e;
                Intrinsics.checkNotNullParameter(j2Var, "<this>");
                Intrinsics.checkNotNullParameter(baseUrl2, "baseUrl");
                List<g2> list3 = j2Var.f153159a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (g2 g2Var : list3) {
                    Intrinsics.checkNotNullParameter(g2Var, "<this>");
                    Intrinsics.checkNotNullParameter(baseUrl2, "baseUrl");
                    String str4 = g2Var.d;
                    String strO = g2Var.f153116c;
                    boolean zF = Intrinsics.f(str4, "RELATIVE");
                    String str5 = g2Var.f153114a;
                    r0 r0VarO = czi.c.O(g2Var.f153115b);
                    if (zF) {
                        strO = com.google.android.gms.internal.mlkit_vision_face.a.o(kotlin.text.d0.g0(baseUrl2, "/"), "/", kotlin.text.d0.e0(strO, "/"));
                    }
                    arrayList2.add(new DocumentFile(str5, r0VarO, strO));
                }
                return new DocumentFilesGroup(arrayList2);
            case 2:
                String str6 = this.f196597w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                InsuranceCarService insuranceCarService3 = this.f196598x.f196609a;
                this.f196597w = null;
                this.v = 1;
                Object mtaAvailability = insuranceCarService3.getMtaAvailability(str6, this);
                return mtaAvailability == aVar3 ? aVar3 : mtaAvailability;
            default:
                String str7 = this.f196597w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCarService insuranceCarService4 = this.f196598x.f196609a;
                    this.f196597w = null;
                    this.v = 1;
                    obj2 = insuranceCarService4.getPolicyApplicationForm(str7, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return jl7.c.a((hl7.i) obj2);
        }
    }
}
