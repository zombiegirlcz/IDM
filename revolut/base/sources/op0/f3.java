package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f3 extends com.revolut.core.ui_kit.delegates.widgets.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f227247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d3 f227248t;
    public d3 u;
    public d3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d3 f227249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        NewsDelegate newsDelegate = new NewsDelegate();
        this.f227247s = zhm.v.k(newsDelegate, new NewsLoadingDelegate());
        I();
        newsDelegate.q().subscribe(new x(21, new e3(this, 0)));
        newsDelegate.r().subscribe(new x(22, new e3(this, 1)));
        newsDelegate.p().subscribe(new x(23, new e3(this, 2)));
        efm.r rVarHide = newsDelegate.f.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        rVarHide.subscribe(new x(24, new e3(this, 3)));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.m
    public final List H() {
        return this.f227247s;
    }
}
