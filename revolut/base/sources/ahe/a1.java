package ahe;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import kotlin.jvm.internal.Intrinsics;
import vge.e2;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f4974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tul.b f4975b;

    public a1(e2 productAccountRepository, tul.b sorter) {
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        Intrinsics.checkNotNullParameter(sorter, "sorter");
        this.f4974a = productAccountRepository;
        this.f4975b = sorter;
    }

    public static SubSpaceAccountItem a(ohe.a aVar) {
        ProductAccount productAccountT = aVar.f225352b;
        if (productAccountT instanceof ProductAccount.ValueItem.Main) {
            productAccountT = ProductAccount.ValueItem.Main.T((ProductAccount.ValueItem.Main) productAccountT, null, null, null, null, 383);
        }
        return new SubSpaceAccountItem(aVar.f225351a, productAccountT);
    }
}
