package t90;

import com.revolut.feature.backend_flow.domain.models.Action;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public static Action a(q90.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String deeplink = action.getDeeplink();
        return Intrinsics.f(action.getDismissOnSelect(), Boolean.TRUE) ? new Action.Dismiss(action.getId(), action.getTitle()) : deeplink != null ? new Action.Deeplink(action.getId(), action.getTitle(), deeplink) : new Action.Submit(action.getId(), action.getTitle(), pd.b.j(action.getSelected()));
    }

    public static q90.a b(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Action.Dismiss) {
            Action.Dismiss dismiss = (Action.Dismiss) action;
            return new q90.a(dismiss.f63227a, dismiss.f63228b, null, Boolean.TRUE, null);
        }
        if (action instanceof Action.Deeplink) {
            Action.Deeplink deeplink = (Action.Deeplink) action;
            return new q90.a(deeplink.f63224a, deeplink.f63225b, deeplink.f63226c, null, null);
        }
        if (!(action instanceof Action.Submit)) {
            throw new NoWhenBranchMatchedException();
        }
        Action.Submit submit = (Action.Submit) action;
        return new q90.a(submit.f63229a, submit.f63230b, null, null, submit.f63231c ? Boolean.TRUE : null);
    }
}
