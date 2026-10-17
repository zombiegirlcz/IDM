package as1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmQuote f8780b;

    public /* synthetic */ t(ApmQuote apmQuote, int i) {
        this.f8779a = i;
        this.f8780b = apmQuote;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8779a) {
            case 0:
                return g.a((g) obj2, null, null, this.f8780b, null, 47);
            case 1:
                bg2.g gVar = (bg2.g) obj2;
                ApmQuote apmQuote = this.f8780b;
                return bg2.g.a(gVar, null, null, null, null, null, null, false, apmQuote != null ? apmQuote.e : null, 6143);
            case 2:
                g22.b bVar = (g22.b) obj2;
                dj0.d targetMoney = bVar.f139762a;
                boolean z = bVar.f139764c;
                Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
                ApmQuote apmQuote2 = this.f8780b;
                Intrinsics.checkNotNullParameter(apmQuote2, "apmQuote");
                return new g22.b(apmQuote2, targetMoney, z);
            default:
                return wr1.g.a((wr1.g) obj2, null, null, null, this.f8780b, 63);
        }
    }
}
