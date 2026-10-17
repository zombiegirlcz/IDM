package z0k;

import ael.e1;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f318636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318636w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f318636w, continuation, 0);
            default:
                return new n(this.f318636w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                o oVar = this.f318636w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((ael.k) oVar.f318638q).e(oVar.o.f101857a);
                    this.v = 1;
                    obj2 = nim.a.b(iVarE, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oVar.H2(oVar.f318641t, new e1((nel.n) obj2, 12));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = this.f318636w;
                    m0k.e eVar = oVar2.f318640s;
                    InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = oVar2.o;
                    String assetId = instrumentNewsControllerContract$InputData.f101857a;
                    WealthNewsCategory category = instrumentNewsControllerContract$InputData.f101858b;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(category, "category");
                    Intrinsics.checkNotNullParameter(assetId, "assetId");
                    i0k.h hVar = eVar.f201163a;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(category, "category");
                    efm.b bVarG = hVar.f157426b.g(new o0k.b(category, null, null, assetId, null), false);
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar2) {
                        return aVar2;
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
