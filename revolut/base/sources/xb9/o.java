package xb9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingListAwaitingScreenContract$InputData f304030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f304031b;

    public o(WaitingListAwaitingScreenContract$InputData inputData, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f304030a = inputData;
        this.f304031b = countryInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.waiting_list_awaiting_title_v3, null, null, 14);
        int i = R$string.waiting_list_awaiting_subtitle_v3;
        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = this.f304030a;
        return new k(u.c(new PromptMarketingContentDelegate.Model("WAITING_LIST_AWAITING_PROMPT_ID", textLocalisedClause, new TextLocalisedClause(i, u.c(((o8b.c) this.f304031b).b(waitingListAwaitingScreenContract$InputData.f78499a.f297794a)), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(new CountryImage(waitingListAwaitingScreenContract$InputData.f78499a.f297794a, (Integer) null, (ez0.e) null, 14), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.waiting_list_awaiting_action_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.waiting_list_awaiting_copy_your_link_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, new TextLocalisedClause(R$string.waiting_list_awaiting_change_country_button, null, null, 14), null, null, null, 1964464)));
    }
}
