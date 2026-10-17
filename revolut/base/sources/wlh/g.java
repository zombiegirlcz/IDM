package wlh;

import cfl.p;
import cfl.v;
import com.revolut.data.model.Data;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f298492b;

    public /* synthetic */ g(k kVar, int i) {
        this.f298491a = i;
        this.f298492b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setA;
        switch (this.f298491a) {
            case 0:
                ybl.g productGroupAvailability = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
                Map map = this.f298492b.v;
                p pVar = p.BONDS;
                ybl.a aVar = (ybl.a) map.get(pVar);
                if (aVar == null || (setA = aVar.a()) == null) {
                    setA = h0.f322473a;
                }
                v[] elements = {v.AVAILABLE, v.ONBOARDING, v.ACTIVE, v.REMEDIATION_REQUIRED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return productGroupAvailability.b(pVar, setA, kotlin.collections.d.y0(elements));
            default:
                this.f298492b.d3(new wgd.k((Data) obj2, 10));
                return Unit.f186387a;
        }
    }
}
