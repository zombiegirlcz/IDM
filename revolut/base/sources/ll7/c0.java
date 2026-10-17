package ll7;

import com.revolut.feature.insurance_car.impl.data.model.DocumentFilesGroup;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import kl7.h2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f196601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196601w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f196601w, continuation, 0);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.f196601w, continuation, 1);
                c0Var2.v = obj2;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(this.f196601w, continuation, 2);
                c0Var3.v = obj2;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0(this.f196601w, continuation, 3);
                c0Var4.v = obj2;
                return c0Var4;
            default:
                c0 c0Var5 = new c0(this.f196601w, continuation, 4);
                c0Var5.v = obj2;
                return c0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e0 e0Var = this.f196601w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(h2.class, e0Var.f196611c, j6.a.q("TELEMATICS_DEVICE_UNPLUGGED_PREFIX_", str));
            case 1:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(DocumentFilesGroup.class, e0Var.f196611c, j6.a.q("DOCUMENT_FILES_PREFIX_", str2));
            case 2:
                String str3 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.f196610b.remove("DOCUMENT_FILES_PREFIX_" + str3);
                e0Var.f196611c.I0("DOCUMENT_FILES_PREFIX_" + str3);
                return Unit.f186387a;
            case 3:
                String str4 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(MtaAvailabilityContainer.class, e0Var.f196611c, j6.a.q("MTA_AVAILABILITY_PREFIX_", str4));
            default:
                String str5 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hl7.i iVar = (hl7.i) j6.a.k(hl7.i.class, e0Var.f196611c, j6.a.q("POLICY_APPLICATION_FORM_PREFIX_", str5));
                if (iVar != null) {
                    return jl7.c.a(iVar);
                }
                return null;
        }
    }
}
