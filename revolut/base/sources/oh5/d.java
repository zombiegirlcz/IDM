package oh5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.locked.balance.api.model.CryptoBalanceBreakdown;
import com.revolut.feature.crypto.locked.balance.api.model.CryptoBalanceBreakdownNotAvailableException;
import com.revolut.feature.staking.api.model.StakingPocket;
import io3.i;
import io3.j;
import io3.k;
import io3.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import yud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f225308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f225309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iy.b f225310c;

    public d(wsg.b walletsInteractor, g stakingInteractor, iy.b cryptoLockedGiftBalanceResolver) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceResolver, "cryptoLockedGiftBalanceResolver");
        this.f225308a = walletsInteractor;
        this.f225309b = stakingInteractor;
        this.f225310c = cryptoLockedGiftBalanceResolver;
    }

    public static final Data a(d dVar, Data data, xi0.b bVar, StakingPocket stakingPocket) {
        Data data2;
        dVar.getClass();
        try {
            Object content = data.getContent();
            data2 = new Data(content != null ? dVar.b((Pair) content, bVar, stakingPocket) : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        Data data3 = data2;
        return (data3.getContent() == null && data3.getError() == null && !data3.getLoading()) ? Data.copy$default(data3, null, new CryptoBalanceBreakdownNotAvailableException(), false, 5, null) : data3;
    }

    public final CryptoBalanceBreakdown b(Pair pair, xi0.b bVar, StakingPocket stakingPocket) {
        Object next;
        dj0.d dVar;
        dj0.d dVar2;
        Iterator it8 = ((List) pair.f186386b).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            io3.d dVar3 = (io3.d) next;
            l lVar = l.CURRENT;
            if (Intrinsics.f(dVar3.f163147c, bVar.f306286a) && dVar3.e == lVar && dVar3.f == k.ACTIVE && dVar3.f163149h == i.INTERNAL && dVar3.f163148g == j.PERSONAL) {
                break;
            }
        }
        io3.d dVar4 = (io3.d) next;
        dj0.d dVar5 = new dj0.d(dVar4 != null ? dVar4.i : 0L, bVar);
        dj0.d dVar6 = (stakingPocket == null || (dVar2 = stakingPocket.e) == null || dVar2.f115082a <= 0) ? null : dVar2;
        dj0.d dVar7 = dVar6 == null ? new dj0.d(0L, bVar) : dVar6;
        long j2 = dVar4 != null ? dVar4.f163151l : 0L;
        dj0.d dVar8 = new dj0.d(j2, bVar);
        if (j2 == 0) {
            dVar = dVar8;
            dVar8 = null;
        } else {
            dVar = dVar8;
        }
        dj0.d dVarB = this.f225310c.b(pair, bVar);
        if (dVarB == null || dVarB.f115082a == 0) {
            dVarB = null;
        }
        dj0.d dVar9 = dVarB == null ? new dj0.d(0L, bVar) : dVarB;
        if (dVar4 == null && dVar6 == null && dVarB == null) {
            return null;
        }
        return new CryptoBalanceBreakdown(pyd.c.O(pyd.c.O(pyd.c.O(dVar5, dVar7), dVar), dVar9), dVar5, dVar6, dVar8, dVarB, (stakingPocket == null || dVar6 == null) ? null : stakingPocket);
    }
}
