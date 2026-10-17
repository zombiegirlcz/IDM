package r34;

import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$MortgageOfferV5;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import cv3.u;
import ft3.h1;
import gim.i;
import java.util.Map;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o14.e;
import o14.f;
import o14.g;
import o14.h;
import wy3.k;
import wy3.l;
import wy3.m;
import wy3.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f251144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f251145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f251146y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, h1 h1Var, u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251144w = bVar;
        this.f251145x = h1Var;
        this.f251146y = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f251144w, this.f251145x, this.f251146y, continuation, 0);
            default:
                return new a(this.f251144w, this.f251145x, this.f251146y, continuation, 1);
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
        tt3.a aVar;
        g dto;
        switch (this.u) {
            case 0:
                Map<String, Object> map = this.f251146y.f109270a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f251144w;
                if (i == 0) {
                    o.b(obj2);
                    gte.a aVar3 = bVar.e;
                    CreditPluginsService creditPluginsService = bVar.f251149c;
                    boolean zC = ((d) aVar3).c(CreditApplicationPluginsApi$Toggles$MortgageOfferV5.f66280c);
                    h1 h1Var = this.f251145x;
                    if (zC) {
                        String str = h1Var.f137835a;
                        this.v = 1;
                        obj2 = creditPluginsService.acceptMortgageOfferV5(str, map, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        aVar = (tt3.a) obj2;
                    } else {
                        String str2 = h1Var.f137835a;
                        this.v = 2;
                        obj2 = creditPluginsService.acceptMortgageOfferV4(str2, map, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        aVar = (tt3.a) obj2;
                    }
                } else if (i == 1) {
                    o.b(obj2);
                    aVar = (tt3.a) obj2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    aVar = (tt3.a) obj2;
                }
                return bVar.f251148b.p(aVar);
            default:
                Map<String, Object> map2 = this.f251146y.f109270a;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                b bVar2 = this.f251144w;
                if (i2 == 0) {
                    o.b(obj2);
                    gte.a aVar5 = bVar2.e;
                    CreditPluginsService creditPluginsService2 = bVar2.f251149c;
                    boolean zC2 = ((d) aVar5).c(CreditApplicationPluginsApi$Toggles$MortgageOfferV5.f66280c);
                    h1 h1Var2 = this.f251145x;
                    if (zC2) {
                        String str3 = h1Var2.f137835a;
                        this.v = 1;
                        obj2 = creditPluginsService2.validateMortgageOfferV5(str3, map2, this);
                        if (obj2 == aVar4) {
                            return aVar4;
                        }
                        dto = (g) obj2;
                    } else {
                        String str4 = h1Var2.f137835a;
                        this.v = 2;
                        obj2 = creditPluginsService2.validateMortgageOfferV4(str4, map2, this);
                        if (obj2 == aVar4) {
                            return aVar4;
                        }
                        dto = (g) obj2;
                    }
                } else if (i2 == 1) {
                    o.b(obj2);
                    dto = (g) obj2;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    dto = (g) obj2;
                }
                h hVar = bVar2.f251147a;
                Intrinsics.checkNotNullParameter(dto, "dto");
                if (dto instanceof f) {
                    return l.f301081a;
                }
                if (!(dto instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVar = (e) dto;
                return new k(new n(eVar.getTitle(), eVar.getDescription(), new m(eVar.getPrimaryButton().getText())));
        }
    }
}
