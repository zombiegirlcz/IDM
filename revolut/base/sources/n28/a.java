package n28;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccountType f211450b;

    public /* synthetic */ a(WealthAccountType wealthAccountType, int i) {
        this.f211449a = i;
        this.f211450b = wealthAccountType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        WealthAccountType wealthAccountType;
        Object next;
        switch (this.f211449a) {
            case 0:
                WealthAccount account = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return Boolean.valueOf(account.T0() == this.f211450b && account.Q2());
            case 1:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = accounts.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    WealthAccountType wealthAccountType2 = this.f211450b;
                    if (!zHasNext) {
                        if (!arrayList.isEmpty()) {
                            return arrayList;
                        }
                        throw new IllegalStateException(("Account is not found for type " + wealthAccountType2).toString());
                    }
                    Object next2 = it8.next();
                    if (((WealthAccount) next2).T0() == wealthAccountType2) {
                        arrayList.add(next2);
                    }
                }
                break;
            default:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator it9 = accounts2.iterator();
                while (true) {
                    boolean zHasNext2 = it9.hasNext();
                    wealthAccountType = this.f211450b;
                    if (zHasNext2) {
                        next = it9.next();
                        if (((WealthAccount) next).T0() == wealthAccountType) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount wealthAccount = (WealthAccount) next;
                if (wealthAccount != null) {
                    return wealthAccount;
                }
                throw new IllegalStateException(("Account is not found for type " + wealthAccountType).toString());
        }
    }
}
