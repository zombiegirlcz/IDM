package e34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dx4.a1;
import dx4.y0;
import gim.i;
import ht3.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import my3.f;
import st3.u;
import t04.h;
import t04.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f122193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122193w = cVar;
        this.f122194x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f122193w, this.f122194x, continuation, 0);
            case 1:
                return new b(this.f122193w, this.f122194x, continuation, 1);
            default:
                return new b(this.f122193w, this.f122194x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f122193w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f122195a;
                    this.v = 1;
                    obj2 = creditPluginsService.confirmOutstandingDebtsV3(this.f122194x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar.d.p((tt3.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f122193w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar2.f122195a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getOutstandingDebtsV3Config(this.f122194x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                n dto = (n) obj2;
                t04.o oVar = cVar2.f122196b;
                Intrinsics.checkNotNullParameter(dto, "dto");
                u intro = dto.getIntro();
                l0 l0VarA = intro != null ? oVar.f266904a.a(intro, new su0.c(1, oVar, t04.o.class, "mapAction", "mapAction(Ljava/lang/String;)Lcom/revolut/feature/credit/application/models/prompt/CreditPromptContent$Action;", 0, 5)) : null;
                f fVarA = oVar.a(dto.getDebtsHub());
                t04.i typeSelector = dto.getTypeSelector();
                String title = typeSelector.getTitle();
                List<h> debtTypes = typeSelector.getDebtTypes();
                ArrayList arrayList = new ArrayList(w.t(debtTypes, 10));
                for (h hVar : debtTypes) {
                    String id10 = hVar.getId();
                    y0 y0Var = a1.Companion;
                    String image = hVar.getImage();
                    y0Var.getClass();
                    arrayList.add(new my3.b(id10, y0.a(image), hVar.getTitle(), hVar.getSubtitle(), oVar.f266905b.a(hVar.getForm())));
                }
                return new my3.h(l0VarA, fVarA, new my3.c(title, arrayList));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = this.f122193w.f122195a;
                    this.v = 1;
                    if (creditPluginsService3.skipOutstandingDebtsV3Intro(this.f122194x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
