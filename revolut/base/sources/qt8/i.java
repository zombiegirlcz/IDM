package qt8;

import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f249025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249025w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f249025w, continuation, 0);
            case 1:
                return new i(this.f249025w, continuation, 1);
            default:
                return new i(this.f249025w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVarA;
        switch (this.u) {
            case 0:
                Object aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    UserKycService userKycService = this.f249025w.f249028a;
                    this.v = 1;
                    obj2 = userKycService.fetchCitizenshipFromDeclarations("CITIZENSHIP", this);
                    if (obj2 != aVar) {
                    }
                    return aVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                st8.b bVar = (st8.b) obj2;
                if (bVar.getValue().getCountries().isEmpty()) {
                    od0.i.Companion.getClass();
                    iVarA = od0.i.f224256b;
                } else {
                    od0.h hVar = od0.i.Companion;
                    wi0.a aVar2 = wi0.b.Companion;
                    String str = (String) d0.a0(bVar.getValue().getCountries());
                    aVar2.getClass();
                    wi0.b bVarA = wi0.a.a(str);
                    hVar.getClass();
                    iVarA = od0.h.a(bVarA);
                }
                aVar = new zt8.a(iVarA);
                return aVar;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    UserKycService userKycService2 = this.f249025w.f249028a;
                    this.v = 1;
                    obj2 = userKycService2.getSelfieConsents(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = ((Iterable) obj2).iterator();
                while (it8.hasNext()) {
                    my8.k kVar = (my8.k) vt8.d.f291929g.get((String) it8.next());
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                }
                return d0.i1(arrayList);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    UserKycService userKycService3 = this.f249025w.f249028a;
                    this.v = 1;
                    obj2 = userKycService3.selfieCheck(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                wt8.a aVar5 = (wt8.a) obj2;
                return new bu8.a(aVar5.getToken(), aVar5.getCheckId());
        }
    }
}
