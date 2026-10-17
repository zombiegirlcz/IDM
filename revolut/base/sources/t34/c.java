package t34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import q14.e;
import q14.l;
import yhm.o;
import yy3.f;
import yy3.g;
import yy3.x;
import yy3.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f267647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f267648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f267649y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, h1 h1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267647w = eVar;
        this.f267648x = h1Var;
        this.f267649y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f267647w, this.f267648x, this.f267649y, continuation, 0);
            case 1:
                return new c(this.f267647w, this.f267648x, this.f267649y, continuation, 1);
            default:
                return new c(this.f267647w, this.f267648x, this.f267649y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x xVar;
        int i = this.u;
        String str = this.f267649y;
        h1 h1Var = this.f267648x;
        e eVar = this.f267647w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = eVar.f267654b;
                    String str2 = h1Var.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.getMortgageSignatureSigningInitializationStatus(str2, str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                q14.e eVar2 = (q14.e) obj2;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                if (eVar2 instanceof e.b) {
                    e.b bVar = (e.b) eVar2;
                    return new g(bVar.getOneTimePassword(), bVar.getExpirationDurationSeconds());
                }
                if (eVar2 instanceof e.c) {
                    return f.b.f317769a;
                }
                if (eVar2 instanceof e.d) {
                    return f.c.f317770a;
                }
                if (eVar2 instanceof e.a) {
                    return f.a.f317768a;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = eVar.f267654b;
                    String str3 = h1Var.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getMortgageSignatureSigningProcessStatus(str3, str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                l lVar = (l) obj2;
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                String state = lVar.getState();
                x[] xVarArrValues = x.values();
                int length = xVarArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        xVar = xVarArrValues[i5];
                        if (!a0.z(xVar.name(), state, true)) {
                            i5++;
                        }
                    } else {
                        xVar = null;
                    }
                }
                if (xVar == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SigningProcessDtoMapper", p.a.p("Can't support ", lVar.getState(), " for SigningProcessStatus"), null, h0Var);
                    xVar = x.FAILED;
                }
                return new y(xVar);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = eVar.f267654b;
                    String str4 = h1Var.f137835a;
                    this.v = 1;
                    if (creditPluginsService3.signMortgageSignatureAgreement(str4, str, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
