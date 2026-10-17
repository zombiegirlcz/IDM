package w34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import cv3.c0;
import cv3.h;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import t14.n;
import t14.p;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f294142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f294143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f294144y;
    public final /* synthetic */ c0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, h hVar, c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f294142w = bVar;
        this.f294143x = str;
        this.f294144y = hVar;
        this.z = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f294142w, this.f294143x, this.f294144y, this.z, continuation, 0);
            case 1:
                return new a(this.f294142w, this.f294143x, this.f294144y, this.z, continuation, 1);
            default:
                return new a(this.f294142w, this.f294143x, this.f294144y, this.z, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objAcceptOfferV2;
        Object offerV2Content;
        Object objSaveOfferV2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f294142w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = bVar.f294146b;
                    String strName = this.f294144y.name();
                    c0 c0Var = this.z;
                    List list = c0Var.f109244a;
                    Long l2 = c0Var.f109245b;
                    Long l3 = c0Var.f109246c;
                    Integer num = c0Var.d;
                    fu3.a aVar2 = c0Var.e;
                    n nVar = new n(list, l2, l3, num, aVar2 != null ? aVar2.name() : null, c0Var.f);
                    this.v = 1;
                    objAcceptOfferV2 = creditPluginsService.acceptOfferV2(this.f294143x, strName, nVar, this);
                    if (objAcceptOfferV2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objAcceptOfferV2 = obj2;
                }
                return bVar.f294145a.p((tt3.a) objAcceptOfferV2);
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                b bVar2 = this.f294142w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = bVar2.f294146b;
                    String strName2 = this.f294144y.name();
                    c0 c0Var2 = this.z;
                    List list2 = c0Var2.f109244a;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    String strK0 = list2 != null ? d0.k0(list2, ",", null, null, 0, null, 62) : null;
                    Long l4 = c0Var2.f109245b;
                    String str = strK0;
                    Long l5 = c0Var2.f109246c;
                    String strName3 = null;
                    Integer num2 = c0Var2.d;
                    fu3.a aVar4 = c0Var2.e;
                    if (aVar4 != null) {
                        strName3 = aVar4.name();
                    }
                    String str2 = c0Var2.f;
                    this.v = 1;
                    offerV2Content = creditPluginsService2.getOfferV2Content(this.f294143x, strName2, str, l4, l5, num2, strName3, str2, false, this);
                    if (offerV2Content == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    offerV2Content = obj2;
                }
                p pVar = bVar2.f294147c;
                return p.a((t14.o) offerV2Content);
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                b bVar3 = this.f294142w;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = bVar3.f294146b;
                    String strName4 = this.f294144y.name();
                    c0 c0Var3 = this.z;
                    List list3 = c0Var3.f109244a;
                    Long l22 = c0Var3.f109245b;
                    Long l31 = c0Var3.f109246c;
                    Integer num3 = c0Var3.d;
                    fu3.a aVar6 = c0Var3.e;
                    n nVar2 = new n(list3, l22, l31, num3, aVar6 != null ? aVar6.name() : null, c0Var3.f);
                    this.v = 1;
                    objSaveOfferV2 = creditPluginsService3.saveOfferV2(this.f294143x, strName4, nVar2, this);
                    if (objSaveOfferV2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objSaveOfferV2 = obj2;
                }
                return bVar3.f294145a.p((tt3.a) objSaveOfferV2);
        }
    }
}
