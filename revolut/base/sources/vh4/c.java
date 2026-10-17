package vh4;

import c84.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wh4.j;
import yh4.k;
import yh4.l;
import yh4.m;
import yh4.n;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a f289310b;

    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar, int i) {
        this.f289309a = i;
        this.f289310b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289309a) {
            case 0:
                n outputData = (n) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof k;
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar = this.f289310b;
                if (z) {
                    t.J2(aVar, false, null, null, 7);
                } else if (outputData instanceof l) {
                    l lVar = (l) outputData;
                    x35.e eVar = lVar.f313759a;
                    dz3.a aVar2 = lVar.f313760b;
                    aVar.l2(new uvf.b(aVar, aVar2, eVar, (Continuation) null, 26), new c(aVar, 2));
                } else {
                    if (!(outputData instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.K2(null);
                }
                return Unit.f186387a;
            case 1:
                wh4.l outputData2 = (wh4.l) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean z3 = outputData2 instanceof j;
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar3 = this.f289310b;
                if (z3) {
                    t.J2(aVar3, false, null, null, 7);
                } else {
                    if (!(outputData2 instanceof wh4.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wh4.k kVar = (wh4.k) outputData2;
                    x35.e eVar2 = kVar.f297403a;
                    dz3.a aVar4 = kVar.f297404b;
                    aVar3.l2(new uvf.b(aVar3, aVar4, eVar2, (Continuation) null, 26), new c(aVar3, 2));
                }
                return Unit.f186387a;
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar5 = this.f289310b;
                return Boolean.valueOf(aVar5.f68354s.a(aVar5, throwable));
        }
    }
}
