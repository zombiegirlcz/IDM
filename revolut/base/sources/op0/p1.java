package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 extends com.revolut.core.ui_kit.delegates.widgets.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f227375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ood.k f227376t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f227375s = zhm.u.c(fullScreenStateDelegate);
        I();
        fullScreenStateDelegate.f52371h.f121375b.subscribe(new x(13, new ok7.c(this, 19)));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.m
    public final List H() {
        return this.f227375s;
    }
}
