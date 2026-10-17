package l48;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.core.navigation.FeatureCommand;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import u38.m;
import ufm.i;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements o38.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f192074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k38.a f192075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f192076c;

    public e(r0 jointAccountsInteractor, k38.a initialArticleNavigationDecorator, n walletInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(initialArticleNavigationDecorator, "initialArticleNavigationDecorator");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f192074a = jointAccountsInteractor;
        this.f192075b = initialArticleNavigationDecorator;
        this.f192076c = walletInteractor;
    }

    public final FeatureCommand a(String str, TabAccountsInitialPayload tabAccountsInitialPayload) {
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        ProductId productId = ProductId.JOINT;
        if (str == null) {
            m.Companion.getClass();
            str = m.e;
        }
        return jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), productId), tabAccountsInitialPayload), null, null, 12);
    }

    public final i b() {
        i iVar = new i(w.o0(p0.f264003c, new b(this, null, 0)), new l2d.b(new a(this, 0), 26), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
