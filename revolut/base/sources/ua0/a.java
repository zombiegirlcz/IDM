package ua0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import ip0.az;
import kotlinx.coroutines.flow.Flow;
import xl2.v;

/* JADX INFO: loaded from: classes19.dex */
public interface a {
    void F0(ty0.a aVar);

    void N0(ty0.a aVar);

    void S0(String str);

    void U0(BackendScreen backendScreen, LargeActionButtonDelegate.Model model);

    void V0(RowDelegate.Model model);

    Flow X0(v vVar);

    void j1(ProgressStepVerticalV2Delegate.Model model);

    void r1(ty0.a aVar);

    void v0(BackendScreen backendScreen, String str, EntityType entityType);

    void w1(az azVar);
}
