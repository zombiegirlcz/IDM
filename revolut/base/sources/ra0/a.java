package ra0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static boolean a(BackendScreen backendScreen) {
        if ((backendScreen instanceof DeeplinkScreen) || (backendScreen instanceof StatusDialogScreen) || (backendScreen instanceof BottomPromptScreen) || (backendScreen instanceof HtmlPromptScreen) || (backendScreen instanceof SummaryScreen) || (backendScreen instanceof TutorialScreen) || (backendScreen instanceof StoriesScreen)) {
            return false;
        }
        if ((backendScreen instanceof PromptScreen) || (backendScreen instanceof FormScreen)) {
            return !uc0.b.r(backendScreen);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static BackendScreen b(BackendScreen backendScreen, String str) {
        if (backendScreen instanceof BottomPromptScreen) {
            return BottomPromptScreen.J((BottomPromptScreen) backendScreen, null, null, str, 767);
        }
        if (backendScreen instanceof DeeplinkScreen) {
            return DeeplinkScreen.J((DeeplinkScreen) backendScreen, str);
        }
        if (backendScreen instanceof FormScreen) {
            return FormScreen.J((FormScreen) backendScreen, null, null, null, str, 49151);
        }
        if (backendScreen instanceof HtmlPromptScreen) {
            return HtmlPromptScreen.J((HtmlPromptScreen) backendScreen, str);
        }
        if (backendScreen instanceof PromptScreen) {
            return PromptScreen.J((PromptScreen) backendScreen, null, str, 383);
        }
        if (backendScreen instanceof StatusDialogScreen) {
            return StatusDialogScreen.J((StatusDialogScreen) backendScreen, str);
        }
        if (backendScreen instanceof StoriesScreen) {
            return StoriesScreen.J((StoriesScreen) backendScreen, str);
        }
        if (backendScreen instanceof SummaryScreen) {
            return SummaryScreen.J((SummaryScreen) backendScreen, str);
        }
        if (backendScreen instanceof TutorialScreen) {
            return TutorialScreen.J((TutorialScreen) backendScreen, str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
