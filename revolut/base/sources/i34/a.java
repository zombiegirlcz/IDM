package i34;

import c14.c;
import c14.d;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dx4.e1;
import ft3.h1;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nx4.m0;
import nx4.o0;
import qy3.e;
import qy3.f;
import qy3.g;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f158090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f158091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f158092y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, h1 h1Var, f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158090w = bVar;
        this.f158091x = h1Var;
        this.f158092y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f158090w, this.f158091x, this.f158092y, continuation, 0);
            default:
                return new a(this.f158090w, this.f158091x, this.f158092y, continuation, 1);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = this.f158090w.f158093a;
                    String str = this.f158091x.f137835a;
                    f fVar = this.f158092y;
                    Boolean boolValueOf = fVar != null ? Boolean.valueOf(fVar.f250149a) : null;
                    Long l2 = fVar != null ? new Long(fVar.f250150b) : null;
                    Long l3 = fVar != null ? fVar.f250151c : null;
                    this.v = 1;
                    obj2 = creditPluginsService.getFamilyCreditCardSettings(str, boolValueOf, l2, l3, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                c cVar = (c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                d parameters = cVar.getParameters();
                g gVar = new g(parameters.getMonthlySpendingLimit(), parameters.getSinglePurchaseLimit(), parameters.getRestrictSensitivePurchases());
                c14.b content = cVar.getContent();
                String title = content.getTitle();
                String description = content.getDescription();
                String primaryButtonTitle = content.getPrimaryButtonTitle();
                List items = content.getItems();
                if (items != null) {
                    ArrayList arrayListZ = d0.Z(items);
                    arrayList = new ArrayList();
                    Iterator it8 = arrayListZ.iterator();
                    while (it8.hasNext()) {
                        e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
                        if (e1VarP != null) {
                            arrayList.add(e1VarP);
                        }
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                e eVar = new e(title, description, primaryButtonTitle, arrayList);
                List<c14.a> actions = cVar.getActions();
                ArrayList arrayList2 = new ArrayList(w.t(actions, 10));
                for (c14.a aVar2 : actions) {
                    arrayList2.add(new qy3.d(aVar2.getParameterKey(), aVar2.getMessage()));
                }
                return new qy3.c(arrayList2, gVar, eVar);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                b bVar = this.f158090w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = bVar.f158093a;
                    String str2 = this.f158091x.f137835a;
                    f fVar2 = this.f158092y;
                    c14.e eVar2 = new c14.e(fVar2.f250150b, fVar2.f250151c, fVar2.f250149a);
                    this.v = 1;
                    obj2 = creditPluginsService2.saveFamilyCreditCardSettings(str2, eVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return bVar.f158094b.p((tt3.a) obj2);
        }
    }
}
