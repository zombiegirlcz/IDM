package da8;

import cli.y;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zh9.u0;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a f112490w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f112490w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f112490w, continuation, 0);
            default:
                return new o(this.f112490w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar2 = this.f112490w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    prl.e eVar = aVar2.f76755s;
                    y yVar = aVar2.v;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    com.revolut.feature.junior_profile.api.models.a aVar3 = (com.revolut.feature.junior_profile.api.models.a) ((g) j2Var.getValue()).f112475a.getContent();
                    String f77098a = aVar3 != null ? aVar3.getF77098a() : null;
                    if (f77098a == null) {
                        throw new IllegalArgumentException("individualId must be present before account creation");
                    }
                    String str = ((g) j2Var2.getValue()).f112477c;
                    String str2 = ((g) j2Var2.getValue()).d;
                    Address address = ((g) j2Var2.getValue()).e;
                    kf8.i iVar = kf8.i.BANKING;
                    Map map = ((g) j2Var2.getValue()).f;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(((ConsentMechanics.OptOut) entry.getKey()).f76951a, entry.getValue());
                    }
                    kf8.e eVar2 = new kf8.e(f77098a, str, str2, linkedHashMap, address, iVar);
                    this.v = 1;
                    obj2 = eVar.k(eVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str3 = ((kf8.d) obj2).f183316a;
                this.v = 2;
                if (com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a.I2(aVar2, str3, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar5 = this.f112490w;
                    o oVar = new o(aVar5, null, 0);
                    this.v = 1;
                    if (u0.b0(aVar5.X(), "CONTINUE_BUTTON_LOADING_TAG", oVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
