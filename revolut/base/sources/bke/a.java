package bke;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends yji.n {
    public abstract void L(ty0.a aVar);

    public abstract void N1(RowDelegate.Model model);

    public abstract void Q(AccountSelectionNavBarContentView.b bVar);

    public abstract void V1(ux0.s sVar);

    public abstract void W1();

    public abstract void Z2(ThemedBackgroundKey themedBackgroundKey);

    public abstract void b3();

    public abstract void c1();

    public abstract Object c3(ActionsView.Item item, Continuation continuation);

    public abstract void d3(String str);

    public abstract ViewController e3(TabCryptoFlowContract$ModalStep tabCryptoFlowContract$ModalStep);

    public abstract CryptoPortfolioScreen f3();

    public abstract void j();
}
