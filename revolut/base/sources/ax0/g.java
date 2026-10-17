package ax0;

import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f10835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10836c;
    public final List d;
    public final ActionFooterView e;

    public g(yw0.f parent, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10834a = parent;
        this.f10835b = titleView;
        this.f10836c = descriptionView;
        this.d = v.k(titleView, descriptionView);
        this.e = parent.getActionFooterView();
    }

    @Override // ax0.l
    public final List b() {
        return this.d;
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10834a;
    }

    @Override // ax0.l
    public final void recycle() {
        UIKitTextView uIKitTextView = this.f10835b;
        yw0.f fVar = this.f10834a;
        fVar.n0(uIKitTextView);
        fVar.n0(this.f10836c);
        fVar.getActionFooterView().setVisibility(8);
    }
}
