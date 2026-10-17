package ull;

import cli.y;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends oki.h implements e {
    public final y o;

    public g(AccountsToApplyChangesBottomSheetContract$InputData inputData, h stateMapper) {
        Object next;
        UserInfoAccount.Claim claim;
        List list;
        UserInfoAccount.Claim claim2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        String str = inputData.f106442a;
        List list2 = inputData.f106444c;
        c cVar = inputData.d;
        Iterator it8 = list2.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (Intrinsics.f(((UserInfoAccount) next).f106203a, inputData.f106443b)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UserInfoAccount userInfoAccount = (UserInfoAccount) next;
        if (userInfoAccount == null) {
            list = f0.f322471a;
        } else {
            int i = f.f281053a[cVar.ordinal()];
            if (i == 1) {
                claim = userInfoAccount.f106206g;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                claim = userInfoAccount.f;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                UserInfoAccount userInfoAccount2 = (UserInfoAccount) obj2;
                int i2 = f.f281053a[cVar.ordinal()];
                if (i2 == 1) {
                    claim2 = userInfoAccount2.f106206g;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    claim2 = userInfoAccount2.f;
                }
                if (Intrinsics.f(claim, claim2)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        this.o = mra.d.b(this, new b(str, list2, list), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
