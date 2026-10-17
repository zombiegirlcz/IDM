package lxi;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CdnImage a(String str) {
        return new CdnImage(str, "mobile/premium/plan_animations/images", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
    }

    public static CdnImage b(r0 walletStyle) {
        Intrinsics.checkNotNullParameter(walletStyle, "walletStyle");
        int i = l.f200590a[walletStyle.ordinal()];
        if (i == 1) {
            return a("ultra");
        }
        if (i == 2) {
            return a("metal");
        }
        if (i == 3) {
            return a("pb");
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
