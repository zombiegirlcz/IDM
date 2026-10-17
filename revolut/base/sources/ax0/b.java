package ax0;

import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f10821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10822c;
    public final List d;
    public final BasicNavBar e;
    public final ActionFooterView f;

    public b(yw0.f parent, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10820a = parent;
        this.f10821b = titleView;
        this.f10822c = descriptionView;
        this.d = v.k(titleView, descriptionView);
        this.e = parent.getNavigationBar();
        this.f = parent.getActionFooterView();
    }

    @Override // ax0.l
    public final List b() {
        return this.d;
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10820a;
    }

    @Override // ax0.l
    public final void recycle() {
        UIKitTextView uIKitTextView = this.f10821b;
        yw0.f fVar = this.f10820a;
        fVar.n0(uIKitTextView);
        fVar.n0(this.f10822c);
        fVar.getActionFooterView().setVisibility(8);
    }
}
