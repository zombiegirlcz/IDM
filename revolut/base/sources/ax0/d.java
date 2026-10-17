package ax0;

import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f10827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10828c;
    public final List d;
    public final BasicNavBar e;
    public final ProgressPagingIndicatorView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionFooterView f10829g;

    public d(yw0.f parent, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10826a = parent;
        this.f10827b = titleView;
        this.f10828c = descriptionView;
        this.d = v.k(titleView, descriptionView);
        this.e = parent.getNavigationBar();
        this.f = parent.getProgressView();
        this.f10829g = parent.getActionFooterView();
    }

    @Override // ax0.l
    public final List b() {
        return this.d;
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10826a;
    }

    @Override // ax0.l
    public final void recycle() {
        UIKitTextView uIKitTextView = this.f10827b;
        yw0.f fVar = this.f10826a;
        fVar.n0(uIKitTextView);
        fVar.n0(this.f10828c);
    }
}
