package b4c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        IppProductType ippProductType = ((d3c.p) obj3).f111052a;
        IppProductType.AndroidTerminal androidTerminal = IppProductType.AndroidTerminal.f84195a;
        return cim.b.b(Boolean.valueOf(Intrinsics.f(ippProductType, androidTerminal)), Boolean.valueOf(Intrinsics.f(((d3c.p) obj2).f111052a, androidTerminal)));
    }
}
