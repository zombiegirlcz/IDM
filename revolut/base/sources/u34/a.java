package u34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dx4.e1;
import ft3.h1;
import fx4.h;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nd.n;
import nx4.f1;
import nx4.m0;
import nx4.o0;
import nx4.r;
import r14.c;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f276775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f276776x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276775w = bVar;
        this.f276776x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f276775w, this.f276776x, continuation, 0);
            default:
                return new a(this.f276775w, this.f276776x, continuation, 1);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f276775w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = bVar.f276777a;
                    String str = this.f276776x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.acceptMortgageValuation(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return bVar.f276779c.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                b bVar2 = this.f276775w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = bVar2.f276777a;
                    String str2 = this.f276776x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getMortgageValuationConfiguration(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                c dto = (c) obj2;
                n nVar = bVar2.f276778b;
                Intrinsics.checkNotNullParameter(dto, "dto");
                h hVarA = f1.a(dto.getHeader());
                ArrayList arrayListZ = d0.Z(dto.getItems());
                ArrayList arrayList = new ArrayList();
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
                    if (e1VarP != null) {
                        arrayList.add(e1VarP);
                    }
                }
                fx4.c cVarA = r.a(dto.getActionFooter());
                List<r14.b> actions = dto.getActions();
                ArrayList arrayList2 = new ArrayList(w.t(actions, 10));
                for (r14.b bVar3 : actions) {
                    if (!(bVar3 instanceof r14.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r14.a aVar3 = (r14.a) bVar3;
                    arrayList2.add(new zy3.a(aVar3.getId(), aVar3.getUrl()));
                }
                return new zy3.b(hVarA, arrayList, cVarA, arrayList2);
        }
    }
}
