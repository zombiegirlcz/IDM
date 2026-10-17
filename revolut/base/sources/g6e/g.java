package g6e;

import com.revolut.feature.subaccount.api.SubaccountEditRecurringTransferDestination;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import ibd.h;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import v6e.r;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public interface g {
    static FeatureCommand b(g gVar, Subaccount subaccount, boolean z, TransferScheduleData transferScheduleData, Long l2, FeatureCommand featureCommand, p pVar, int i) {
        StartUpPocket juniorVaultAccount;
        TransferScheduleData transferScheduleData2 = (i & 16) != 0 ? null : transferScheduleData;
        boolean z3 = (i & 32) == 0;
        if ((i & 64) != 0) {
            l2 = null;
        }
        FeatureCommand featureCommand2 = (i & 128) != 0 ? null : featureCommand;
        if ((i & 256) != 0) {
            pVar = null;
        }
        ((r) gVar).getClass();
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        if (pVar != null) {
            if (pVar.f249314a.f160152c == h.WALLET) {
                return u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.EditScheduledPayment(v8i.c.a(pVar), l2), (Set) null, 6), null));
            }
            String subaccountId = subaccount.getF88959a().f234881a;
            SubaccountType subaccountType = subaccount.c();
            xi0.b currency = subaccount.getCurrency();
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return u0.f(new SubaccountEditRecurringTransferDestination(subaccountId, currency.f306286a, transferScheduleData2, null, z3, featureCommand2));
        }
        if ((subaccount instanceof Subaccount.Group) || (subaccount instanceof Subaccount.Personal)) {
            juniorVaultAccount = new StartUpPocket.VaultAccount(x8e.a.b(subaccount));
        } else if (subaccount instanceof Subaccount.Joint) {
            juniorVaultAccount = new StartUpPocket.JointVaultAccount(x8e.a.b(subaccount));
        } else if ((subaccount instanceof Subaccount.Pro) || (subaccount instanceof Subaccount.ProTax)) {
            juniorVaultAccount = new StartUpPocket.ProVaultAccount(x8e.a.b(subaccount));
        } else {
            if (!(subaccount instanceof Subaccount.Junior)) {
                if (subaccount instanceof Subaccount.Teen) {
                    throw new IllegalArgumentException("Subaccount.Teen not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            juniorVaultAccount = new StartUpPocket.JuniorVaultAccount(x8e.a.b(subaccount));
        }
        return u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.AddNewScheduledPayment(juniorVaultAccount, l2), (Set) null, 6), null));
    }
}
