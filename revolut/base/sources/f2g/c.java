package f2g;

import aw0.d0;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f131783a = new d0(167, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);

    public static hg a(String str, ArrayList arrayList) {
        hg hgVar = new hg(str, arrayList, 2, new y4(f131783a), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656);
        int i = R$attr.uikit_dp0;
        yp0.b.r(hgVar, 0, 0, i, i, 3);
        return hgVar;
    }
}
