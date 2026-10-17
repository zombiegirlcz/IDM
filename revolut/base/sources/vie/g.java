package vie;

import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements rfe.b {
    @Override // rfe.b
    public final ProductAccountDescriptor$Value a(List accounts) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List list = accounts;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((AccountContent) next).f89474a == ProductId.CREDIT_HUB) {
                break;
            }
        }
        AccountContent accountContent = (AccountContent) next;
        if (accountContent == null) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                AccountContent accountContent2 = (AccountContent) next2;
                if (accountContent2.d && accountContent2.f89474a == ProductId.CREDIT) {
                    break;
                }
            }
            accountContent = (AccountContent) next2;
            if (accountContent == null) {
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it10.next();
                    AccountContent accountContent3 = (AccountContent) next3;
                    if (accountContent3.d && c.a(accountContent3.f89474a, accountContent3.f89475b.getF89504c().f89730b)) {
                        break;
                    }
                }
                accountContent = (AccountContent) next3;
                if (accountContent == null) {
                    Iterator it11 = list.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it11.next();
                        if (((AccountContent) next4).f89474a == ProductId.CREDIT) {
                            break;
                        }
                    }
                    accountContent = (AccountContent) next4;
                    if (accountContent == null) {
                        Iterator it12 = list.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it12.next();
                            AccountContent accountContent4 = (AccountContent) next5;
                            if (c.a(accountContent4.f89474a, accountContent4.f89475b.getF89504c().f89730b)) {
                                break;
                            }
                        }
                        accountContent = (AccountContent) next5;
                        if (accountContent == null) {
                            return null;
                        }
                    }
                }
            }
        }
        ProductAccount.ValueItem valueItem = accountContent.f89475b;
        return com.revolut.feature.tab.accounts.api.model.a.c(valueItem, accountContent.f89474a, valueItem.getF89504c());
    }
}
