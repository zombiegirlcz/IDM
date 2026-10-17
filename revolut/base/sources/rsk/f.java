package rsk;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;
import qna.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f257106c;
    public final usc.a d;
    public final qrk.d e;

    public f(b controllerModelExtension, usc.a view, qrk.d widgetDismissStatusInteractor) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetDismissStatusInteractor, "widgetDismissStatusInteractor");
        this.f257106c = controllerModelExtension;
        this.d = view;
        this.e = widgetDismissStatusInteractor;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new n(rd0.e.b(((ActionWidgetDelegate) this.d.f282889b).f51589c.f121375b), this, 24), null, 7);
    }
}
