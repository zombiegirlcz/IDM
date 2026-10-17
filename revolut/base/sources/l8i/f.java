package l8i;

import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import kotlin.jvm.internal.Intrinsics;
import kx4.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f192996c;
    public final b d;

    public f(c view, b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f192996c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new f0(rd0.e.b(((MoveMoneyReviewScreen) this.f192996c).f0.s()), 11), new e(this, null), 3);
    }
}
