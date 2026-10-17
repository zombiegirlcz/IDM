package i4c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        IppProductType ippProductType = (IppProductType) ((Pair) obj3).f186385a;
        IppProductType.AndroidTerminal androidTerminal = IppProductType.AndroidTerminal.f84195a;
        return cim.b.b(Boolean.valueOf(Intrinsics.f(ippProductType, androidTerminal)), Boolean.valueOf(Intrinsics.f((IppProductType) ((Pair) obj2).f186385a, androidTerminal)));
    }
}
