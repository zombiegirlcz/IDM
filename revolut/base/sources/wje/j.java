package wje;

import cli.y;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.settings.a f298074b;

    public /* synthetic */ j(com.revolut.feature.tab.crypto.impl.ui.settings.a aVar, int i) {
        this.f298073a = i;
        this.f298074b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298073a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, this.f298074b.f89808y.d("security_hub.wealth_protection", null) == bla.c.ENABLED, null, null, false, false, false, Constants.TAG_FB_CHARGING_STATUS);
            case 1:
                aq6.e output = (aq6.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof aq6.c) {
                    com.revolut.feature.tab.crypto.impl.ui.settings.a aVar = this.f298074b;
                    aVar.X1(aVar.D.a(true));
                }
                return Unit.f186387a;
            case 2:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    com.revolut.feature.tab.crypto.impl.ui.settings.a aVar2 = this.f298074b;
                    aVar2.A1(new k(aVar2, null, 0), new yi5.b(25));
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.tab.crypto.impl.ui.settings.a aVar3 = this.f298074b;
                jl5.a aVar4 = aVar3.f89805t;
                y yVar = aVar3.F;
                jl5.e eVar = (jl5.e) obj2;
                if (Intrinsics.f(eVar, jl5.c.f175596a)) {
                    aVar3.H2(yVar, new wdb.b(new CryptoSpareChangeInfo(null, null), 28));
                    aVar3.X1(((tl5.a) aVar4).b());
                } else if (eVar instanceof jl5.d) {
                    jl5.d dVar = (jl5.d) eVar;
                    aVar3.H2(yVar, new wdb.b(new CryptoSpareChangeInfo(dVar.f175597a, Integer.valueOf(dVar.f175598b)), 28));
                    aVar3.X1(((tl5.a) aVar4).c());
                } else {
                    if (!(eVar instanceof jl5.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jl5.b bVar = (jl5.b) eVar;
                    aVar3.H2(yVar, new wdb.b(new CryptoSpareChangeInfo(bVar.f175594a, Integer.valueOf(bVar.f175595b)), 28));
                    aVar3.X1(((tl5.a) aVar4).a());
                }
                return Unit.f186387a;
        }
    }
}
