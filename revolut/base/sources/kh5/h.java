package kh5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownDisplayMode;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.crypto.locked.balance.impl.ui.excluded_locked_balances.ExcludedLockedBalancesScreen;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExcludedLockedBalancesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ExcludedLockedBalancesScreen excludedLockedBalancesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = excludedLockedBalancesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.U.getValue();
        Object obj3 = model.u;
        g gVar = (g) bVar;
        gVar.getClass();
        eh5.b bVar2 = obj3 instanceof eh5.b ? (eh5.b) obj3 : null;
        if (bVar2 != null) {
            xi0.b bVar3 = bVar2.f125736a;
            String str = bVar3.f306286a;
            long j2 = bVar2.d.f115082a;
            long j3 = bVar2.f125738c.f115082a;
            long j5 = bVar2.f125737b.f115082a;
            List listK = v.k(Long.valueOf(j5), Long.valueOf(j3), Long.valueOf(j2));
            if ((listK instanceof Collection) && listK.isEmpty()) {
                i = 0;
            } else {
                Iterator it8 = listK.iterator();
                i = 0;
                while (it8.hasNext()) {
                    if (((Number) it8.next()).longValue() > 0 && (i = i + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            CryptoBalanceBreakdownDisplayMode.LockedAllocationsOnly lockedAllocationsOnly = CryptoBalanceBreakdownDisplayMode.LockedAllocationsOnly.f70871a;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (i == 1) {
                StakingPocket stakingPocket = bVar2.e;
                if (j5 > 0 && stakingPocket != null) {
                    l.j2(gVar, gVar.e1(new nc5.e(stakingPocket)), bottom_dialog, null, 2);
                } else if (j3 > 0) {
                    l.j2(gVar, gVar.e1(new t4c.b(bVar3)), bottom_dialog, null, 2);
                } else if (j2 > 0) {
                    ViewController viewControllerE1 = gVar.e1(new og5.a(new CryptoGiftAssetTransferInfoInputData(bVar3, false)));
                    k79.b block = new k79.b(gVar, bVar3, 13);
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    l.j2(gVar, viewControllerE1, bottom_dialog, null, 2);
                } else {
                    gVar.f2(gVar.e1(new fh5.a(new CryptoBalanceBreakdownInputData(str, true, lockedAllocationsOnly))), bottom_dialog, new k79.b(gVar, str, 12));
                }
            } else {
                gVar.f2(gVar.e1(new fh5.a(new CryptoBalanceBreakdownInputData(str, true, lockedAllocationsOnly))), bottom_dialog, new k79.b(gVar, str, 12));
            }
        }
        return Unit.f186387a;
    }
}
