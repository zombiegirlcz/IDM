package q48;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointClosePromptScreenContract$InputData f242078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f242079b;

    public i(JointClosePromptScreenContract$InputData input, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f242078a = input;
        this.f242079b = legalEntityDisclaimerMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = this.f242078a;
        JointAccountCloseReason jointAccountCloseReason = jointClosePromptScreenContract$InputData.f76522a;
        JointAccountCloseReason.UserIntention userIntention = JointAccountCloseReason.UserIntention.f76466a;
        boolean zF = Intrinsics.f(jointAccountCloseReason, userIntention);
        JointAccountCloseReason.ForceOffBoarding forceOffBoarding = JointAccountCloseReason.ForceOffBoarding.f76465a;
        if (zF) {
            textLocalisedClause = new TextLocalisedClause(R$string.joint_offboarding_confirmation_title, null, null, 14);
        } else {
            if (!Intrinsics.f(jointAccountCloseReason, forceOffBoarding)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.joint_offboarding_confirmation_title_offboarding, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        JointAccountCloseReason jointAccountCloseReason2 = jointClosePromptScreenContract$InputData.f76522a;
        if (Intrinsics.f(jointAccountCloseReason2, userIntention)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.joint_offboarding_confirmation_action_keep_joint_account, null, null, 14);
        } else {
            if (!Intrinsics.f(jointAccountCloseReason2, forceOffBoarding)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = null;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.joint_offboarding_confirmation_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        aim.e eVarB = u.b();
        eVarB.add(new we0("CLOSE_IMAGE_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, UrlImageDrawable.Shimmering.INSTANCE, null, 26))));
        List listV = zjh.j.v(this.f242079b, domainState.f242072a);
        yp0.b.q(listV, 0, 0, 0, 0, 15);
        eVarB.addAll(listV);
        Unit unit = Unit.f186387a;
        return new h(textLocalisedClause3, textLocalisedClause4, textLocalisedClause5, textLocalisedClause2, u.a(eVarB));
    }
}
