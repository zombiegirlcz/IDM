package dx6;

import ds4.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.h0;
import pcd.j;
import xwd.o;
import ypg.p;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a f120892b;

    public /* synthetic */ a(com.revolut.feature.freelancer.impl.ui.extension.a aVar, int i) {
        this.f120891a = i;
        this.f120892b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f120891a) {
            case 0:
                ene.d result = (ene.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ene.c) {
                    com.revolut.feature.freelancer.impl.ui.extension.a aVar = this.f120892b;
                    aVar.T2(new y(aVar, null, 5), new yi5.b(27));
                }
                return Unit.f186387a;
            default:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                ppg.b bVar = this.f120892b.f73815r;
                npg.l vaultsSortStrategy = npg.l.AMOUNT_BALANCE;
                Set allowedStatesFilter = y0.b(h0.ACTIVE);
                pcd.h filter = new pcd.h(j.d.f234867a);
                p pVar = (p) bVar;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Intrinsics.checkNotNullParameter(vaultsSortStrategy, "vaultsSortStrategy");
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(allowedStatesFilter, "allowedStatesFilter");
                return pd.b.r(nim.a.w(pVar.l(loadingStrategy, filter), new yj2.b(pVar, allowedStatesFilter, 13)), new o(pVar, 19, baseCurrency, vaultsSortStrategy));
        }
    }
}
