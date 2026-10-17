package sr7;

import com.revolut.feature.insurance_common.data.model.Banner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final nr7.d a(Banner.Action action) {
        Intrinsics.checkNotNullParameter(action, "<this>");
        if (action instanceof Banner.Action.Faq) {
            return new nr7.e(((Banner.Action.Faq) action).f75703b);
        }
        if (action instanceof Banner.Action.Upgrade) {
            Banner.Action.Upgrade upgrade = (Banner.Action.Upgrade) action;
            return new nr7.f(upgrade.f75705b, upgrade.f75706c);
        }
        if (action instanceof Banner.Action.Deeplink) {
            return new nr7.c(((Banner.Action.Deeplink) action).f75701b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
