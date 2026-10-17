package nge;

import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements rfe.b {
    @Override // rfe.b
    public final ProductAccountDescriptor$Value a(List accounts) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List list = accounts;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((AccountContent) next).d) {
                break;
            }
        }
        AccountContent accountContent = (AccountContent) next;
        if (accountContent != null) {
            return new ProductAccountDescriptor$Value.Main(accountContent.f89475b.getF89504c(), accountContent.f89474a);
        }
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            AccountContent accountContent2 = (AccountContent) next2;
            if (accountContent2.f89474a == ProductId.CURRENCY && accountContent2.f89475b.getK()) {
                break;
            }
        }
        AccountContent accountContent3 = (AccountContent) next2;
        if (accountContent3 == null && (accountContent3 = (AccountContent) d0.d0(accounts)) == null) {
            return null;
        }
        return new ProductAccountDescriptor$Value.Main(accountContent3.f89475b.getF89504c(), accountContent3.f89474a);
    }
}
