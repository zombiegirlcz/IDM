package da8;

import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import efm.d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a f112489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f112489w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f112489w, continuation);
        nVar.v = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((com.revolut.feature.junior_profile.api.models.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarA = this.f112489w.f76756t.a(aVar.getF77099b(), aVar.getF77100c(), jli.b.i(aVar.getI()));
            this.v = aVar;
            this.u = 1;
            obj2 = nim.a.b(d0VarA, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ArrayList arrayList = ((mh8.a) obj2).f205425b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof ConsentMechanics.OptOut) {
                arrayList2.add(obj3);
            }
        }
        int iB = q0.b(w.t(arrayList2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj4 : arrayList2) {
            linkedHashMap.put(obj4, Boolean.valueOf(((ConsentMechanics.OptOut) obj4).f76953c));
        }
        return new h(aVar, linkedHashMap);
    }
}
