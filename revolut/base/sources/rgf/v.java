package rgf;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f254176a;

    public v(w wVar) {
        this.f254176a = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SubSpaceAccountItem accountItem = (SubSpaceAccountItem) obj2;
        Intrinsics.checkNotNullParameter(accountItem, "accountItem");
        ProductId productId = accountItem.f89559a.f89553a;
        ProductAccount productAccount = accountItem.f89560b;
        ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
        if (main == null) {
            return Boolean.FALSE;
        }
        ProductAccountId productAccountId = main.f89504c;
        boolean z = false;
        if (!kotlin.text.d0.J(productAccountId.f89729a, "Total-", false) && (!main.i || !main.e.f89481h)) {
            qfe.a aVar = this.f254176a.f254177a;
            ProductAccountDescriptor$Value.Main account = new ProductAccountDescriptor$Value.Main(productAccountId, productId);
            Intrinsics.checkNotNullParameter(account, "account");
            pfe.f fVar = (pfe.f) ((rhe.m) aVar).f254432a.get(productId);
            if (fVar != null && fVar.c(productAccountId)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
