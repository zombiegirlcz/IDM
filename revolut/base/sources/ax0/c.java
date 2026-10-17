package ax0;

import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10825c;
    public final List d;
    public final BasicNavBar e;
    public final ProgressPagingIndicatorView f;

    public c(yw0.f parent, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10823a = parent;
        this.f10824b = titleView;
        this.f10825c = descriptionView;
        this.d = v.k(titleView, descriptionView);
        this.e = parent.getNavigationBar();
        this.f = parent.getProgressView();
    }

    @Override // ax0.l
    public final List b() {
        return this.d;
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10823a;
    }

    @Override // ax0.l
    public final void recycle() {
        UIKitTextView uIKitTextView = this.f10824b;
        yw0.f fVar = this.f10823a;
        fVar.n0(uIKitTextView);
        fVar.n0(this.f10825c);
    }
}
