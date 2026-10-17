package wce;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.support.api.navigation.LegacyHelpCentreFeatureConfig;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import f01.c;
import gde.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pgi.h;
import pgi.k;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f296412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f296413b;

    public a(c uiKitResources, d helpCentreNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        this.f296412a = uiKitResources;
        this.f296413b = helpCentreNaviCommandProvider;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof LegacyHelpCentreFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        LegacyHelpCentreFeatureConfig config = (LegacyHelpCentreFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(config, LegacyHelpCentreFeatureConfig.HelpCentre.f89360a)) {
            navigator.c(this.f296413b.a());
            return;
        }
        if (Intrinsics.f(config, LegacyHelpCentreFeatureConfig.Search.f89361a)) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.Search(null), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
            return;
        }
        boolean zF = Intrinsics.f(config, LegacyHelpCentreFeatureConfig.Community.f89359a);
        c cVar = this.f296412a;
        if (zF) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.social_community_url, null, null, 14);
            k.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(cVar.b(textLocalisedClause).toString(), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.support_troubleshooting_ask_community, null, null, 14), 0, false, true, true, (String) null, (Parcelable) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false, 130972), null, null, 0, null, null, null, null, false, 1020));
        } else if (Intrinsics.f(config, LegacyHelpCentreFeatureConfig.Blog.f89357a)) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.social_blog_url, null, null, 14);
            k.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(cVar.b(textLocalisedClause2).toString(), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.support_troubleshooting_read_blog, null, null, 14), 0, false, true, true, (String) null, (Parcelable) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false, 130972), null, null, 0, null, null, null, null, false, 1020));
        } else if (Intrinsics.f(config, LegacyHelpCentreFeatureConfig.Chat.f89358a)) {
            navigator.c(u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true)));
        } else {
            if (!Intrinsics.f(config, LegacyHelpCentreFeatureConfig.SystemStatus.f89362a)) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.support_status_page_url, null, null, 14);
            k.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(cVar.b(textLocalisedClause3).toString(), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.support_contact_status_pages_title, null, null, 14), 0, false, true, true, (String) null, (Parcelable) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false, 130972), null, null, 0, null, null, null, null, false, 1020));
        }
    }
}
