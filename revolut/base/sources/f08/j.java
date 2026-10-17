package f08;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nd.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.d f131018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f131019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f131020c;
    public final f01.c d;
    public final nhi.j e;

    public j(mm.d actionDispatcher, ln.a navigationCommandsDispatcher, o naviCommandFactory, t08.a petStoriesNavigationCommandFactory, f80.a uriHelper, f01.c uiKitResources, nhi.j featuresRegistry) {
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(naviCommandFactory, "naviCommandFactory");
        Intrinsics.checkNotNullParameter(petStoriesNavigationCommandFactory, "petStoriesNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        this.f131018a = actionDispatcher;
        this.f131019b = navigationCommandsDispatcher;
        this.f131020c = uriHelper;
        this.d = uiKitResources;
        this.e = featuresRegistry;
    }

    public final efm.b a() {
        return okl.m.w(null, null, null, 7, this.f131019b);
    }

    public final efm.b b() {
        return this.f131019b.a(new FeatureCommand(new FaqFeatureConfig.Starter("topic.pet-insurance", true)));
    }

    public final efm.b c(PolicyDocument document) {
        NaviCommand activityNavigateCommand;
        Intrinsics.checkNotNullParameter(document, "document");
        if (document instanceof PolicyDocument.Custom) {
            activityNavigateCommand = ((PolicyDocument.Custom) document).f76266b;
        } else {
            if (!(document instanceof PolicyDocument.Text)) {
                if ((document instanceof PolicyDocument.ExternalLink) || (document instanceof PolicyDocument.Pdf)) {
                    throw new IllegalArgumentException(a0.d.q("Policy document ", document.getClass(), " is not a supported local document"));
                }
                throw new NoWhenBranchMatchedException();
            }
            hy7.f.Companion.getClass();
            PolicyDocument.Text text = (PolicyDocument.Text) document;
            activityNavigateCommand = new ActivityNavigateCommand(hy7.a.f156745b, new TextDocumentContract$Configuration(text.f76273a, "PET_PROFILE_FLOW", text.f76274b), null, null, 0, null, null, null, null, false, 1020);
        }
        return this.f131019b.a(activityNavigateCommand);
    }
}
