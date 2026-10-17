package ax0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;

/* JADX INFO: loaded from: classes19.dex */
public interface k {
    ActionFooterView getActionFooterView();

    View getBottomGuideline();

    ConstraintLayout getHostView();

    BasicNavBar getNavigationBar();

    ProgressPagingIndicatorView getProgressView();

    View getTopGuideline();
}
