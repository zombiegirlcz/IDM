package c7e;

import aii.u;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import efm.d0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n7i.s;
import v6e.r;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f21960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Subaccount f21961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Subaccount subaccount, Continuation continuation) {
        super(1, continuation);
        this.f21960w = nVar;
        this.f21961x = subaccount;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f21960w, this.f21961x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        u bridgeDestination;
        StartUpPocket jointVaultAccount;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Subaccount subaccount = this.f21961x;
        n nVar2 = this.f21960w;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarE = ((s) nVar2.f21968p).e(subaccount);
            this.u = nVar2;
            this.v = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
            nVar = nVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.u;
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            nVar2.getClass();
            if (subaccount instanceof Subaccount.Group) {
                jointVaultAccount = new StartUpPocket.VaultAccount(((Subaccount.Group) subaccount).f88953a.f());
            } else if (subaccount instanceof Subaccount.Personal) {
                jointVaultAccount = new StartUpPocket.VaultAccount(((Subaccount.Personal) subaccount).f88956a.f());
            } else if (subaccount instanceof Subaccount.Pro) {
                jointVaultAccount = new StartUpPocket.ProVaultAccount(((Subaccount.Pro) subaccount).f88957a.f());
            } else if (subaccount instanceof Subaccount.ProTax) {
                jointVaultAccount = new StartUpPocket.ProVaultAccount(((Subaccount.ProTax) subaccount).f88958a.f());
            } else if (subaccount instanceof Subaccount.Junior) {
                jointVaultAccount = new StartUpPocket.JuniorVaultAccount(((Subaccount.Junior) subaccount).f88955a.f());
            } else {
                if (!(subaccount instanceof Subaccount.Joint)) {
                    if (subaccount instanceof Subaccount.Teen) {
                        throw new IllegalArgumentException("Subaccount.Teen not supported");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                jointVaultAccount = new StartUpPocket.JointVaultAccount(((Subaccount.Joint) subaccount).f88954a.f());
            }
            bridgeDestination = new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(jointVaultAccount, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null);
        } else {
            ((r) nVar2.o).getClass();
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            bridgeDestination = new BridgeDestination(new FeatureCommand(new VaultsFeatureConfig.Withdraw(subaccount.getF88959a())));
        }
        return nVar.A2(bridgeDestination);
    }
}
