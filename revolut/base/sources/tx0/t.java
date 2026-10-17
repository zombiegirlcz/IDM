package tx0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f275245a = new t();

    private t() {
    }

    @Override // tx0.u
    public final void a(ActionsView actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        mx0.p pVarA = mx0.p.a(actions.getMoreActionState(), "_more_actions_", null, 4);
        if (Intrinsics.f(actions.getMoreActionState(), pVarA)) {
            return;
        }
        actions.moreActionState = pVarA;
        actions.f();
    }
}
