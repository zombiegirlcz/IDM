package le3;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsAccount f194456b;

    public /* synthetic */ c(AnalyticsAccount analyticsAccount, int i) {
        this.f194455a = i;
        this.f194456b = analyticsAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f194455a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f194456b, it8);
            default:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                if (!ta6.a.G(pocket)) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                xi0.a aVar = xi0.b.Companion;
                String str = pocket.f163147c;
                aVar.getClass();
                ynd.d dVar = new ynd.d(this.f194456b, xi0.a.a(str));
                hVar.getClass();
                return od0.h.a(dVar);
        }
    }
}
