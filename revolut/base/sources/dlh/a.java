package dlh;

import a0.d;
import com.revolut.core.ui_kit.delegates.RewardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import jbh.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import yp0.b;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f115766a;

    public a(e performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f115766a = performanceAssetMapper;
    }

    public static List a() {
        IntRange intRangeO = f.o(0, 4);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new pe(d.n("RECENTLY_VIEWED_LOADING_INSTRUMENT_", it8.nextInt()), RewardLoadingDelegate.b.a.f53198a));
        }
        eg egVar = new eg("RECENTLY_VIEWED_LOADING_SCROLLER_ID", arrayList, new dg.b(), 16.0f, 0, R$attr.uikit_dp48, 880);
        b.l(egVar, 0, 0, 0, 0, null, false, 63);
        return u.c(egVar);
    }
}
