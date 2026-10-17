package t8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n7i.f;
import n7i.f0;
import n8i.g0;
import n8i.n;
import n8i.o;
import n8i.p;
import n8i.w;
import n8i.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f268898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f268899m;

    public c(f excludedScheduledPaymentsAccountTypesProvider, f0 moveMoneySchedulingSupportDelegate) {
        Intrinsics.checkNotNullParameter(excludedScheduledPaymentsAccountTypesProvider, "excludedScheduledPaymentsAccountTypesProvider");
        Intrinsics.checkNotNullParameter(moveMoneySchedulingSupportDelegate, "moveMoneySchedulingSupportDelegate");
        this.f268898l = excludedScheduledPaymentsAccountTypesProvider;
        this.f268899m = moveMoneySchedulingSupportDelegate;
    }

    @Override // n8i.g0
    public final o c3(y yVar) {
        w wVar = (w) yVar;
        if (wVar == null) {
            return null;
        }
        AccountWrapper accountWrapper = wVar.f213478a;
        AccountWrapper accountWrapper2 = wVar.f213479b;
        this.f268899m.getClass();
        boolean zA = f0.a(accountWrapper2, accountWrapper);
        if (wVar.f213480c.f115082a > 0) {
            this.f268898l.getClass();
            Set setA = f.a();
            z = !(setA.contains(accountWrapper.f97224a) || setA.contains(accountWrapper2.f97224a));
        }
        return new n(zA, z, p.CALENDAR);
    }
}
