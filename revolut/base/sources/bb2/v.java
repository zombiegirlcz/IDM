package bb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        AliasType aliasType = ((Alias) obj3).f61878a;
        AliasType.PHONE phone = AliasType.PHONE.f61895b;
        return cim.b.b(Boolean.valueOf(Intrinsics.f(aliasType, phone)), Boolean.valueOf(Intrinsics.f(((Alias) obj2).f61878a, phone)));
    }
}
