package uz7;

import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f284615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhi.j f284616b;

    public q(ln.a navigationCommandsDispatcher, nhi.j featuresRegistry) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        this.f284615a = navigationCommandsDispatcher;
        this.f284616b = featuresRegistry;
    }

    public final efm.b a() {
        return okl.m.w(null, null, null, 7, this.f284615a);
    }

    public final efm.b b(PolicyDocument document) {
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
            activityNavigateCommand = new ActivityNavigateCommand(hy7.a.f156745b, new TextDocumentContract$Configuration(text.f76273a, "PET_PLAN_BUILDER_FLOW", text.f76274b), null, null, 0, null, null, null, null, false, 1020);
        }
        return this.f284615a.a(activityNavigateCommand);
    }
}
