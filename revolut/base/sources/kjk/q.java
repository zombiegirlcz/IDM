package kjk;

import hha.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {
    private q() {
    }

    public static String a(w0 planTier) {
        String str;
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        switch (p.f184463a[planTier.ordinal()]) {
            case 1:
                str = "essential";
                break;
            case 2:
                str = "basic";
                break;
            case 3:
                str = "standard";
                break;
            case 4:
                str = "plus";
                break;
            case 5:
                str = "premium";
                break;
            case 6:
                str = "metal";
                break;
            case 7:
                str = "ultra";
                break;
            case 8:
                str = "private";
                break;
            case 9:
                str = "unknown";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return "PLAN_HUB_ONBOARDING_SEEN_".concat(str);
    }
}
