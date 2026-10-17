package yrb;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements j0b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedTabsDelegate f316243a = new FixedTabsDelegate();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CenteredAmountDelegate f316244b = new CenteredAmountDelegate(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputSliderDelegate f316245c = new InputSliderDelegate();
    public final LargeActionButtonDelegate d = new LargeActionButtonDelegate();
    public final TextDelegate e = new TextDelegate();

    @Override // j0b.b
    public final List a() {
        return zhm.v.k(this.f316243a, this.f316244b, this.e, this.f316245c, this.d, new FullScreenStateDelegate());
    }
}
