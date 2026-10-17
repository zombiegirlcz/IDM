package aeg;

import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f3583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3584b;

    public f() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f3583a = fullScreenStateDelegate;
        this.f3584b = v.k(fullScreenStateDelegate, new ListingCardDelegate(), new PropertyCardDelegate(), new ListCellDelegate(), new ListingCardLoadingDelegate(), new CellDetailsLoadingDelegate());
    }
}
