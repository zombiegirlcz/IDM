package eye;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import vge.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductId f130851b;

    public /* synthetic */ d(ProductId productId, int i) {
        this.f130850a = i;
        this.f130851b = productId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f130850a) {
            case 0:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                h hVar = i.Companion;
                FeatureCommand featureCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(pocket.f163145a, null), this.f130851b), null), null, 4)));
                hVar.getClass();
                return h.a(featureCommandF);
            case 1:
                eda.e result = (eda.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return new ProductAccountDescriptor$Value.Main(new ProductAccountId(result.f124961a.f163145a, null), this.f130851b);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Set set = (Set) pair.f186385a;
                List list = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    ProductAccount productAccount = (ProductAccount) obj3;
                    if (!(productAccount instanceof ProductAccount.ValueItem.Discover) || !set.contains(x0.a(com.revolut.feature.tab.accounts.api.model.a.b(productAccount, this.f130851b)))) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                ProductAccountDescriptor$Value descriptor = (ProductAccountDescriptor$Value) obj2;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return Boolean.valueOf(descriptor.getF89727a() == this.f130851b);
        }
    }
}
