package d1h;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public interface j {
    /* JADX INFO: renamed from: H0 */
    FooterTextDelegate getZ();

    /* JADX INFO: renamed from: Q */
    FullScreenStateDelegate getU();

    default Flow y() {
        return vkm.i.f290039a;
    }
}
