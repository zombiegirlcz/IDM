package w38;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.feature.joint.impl.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g48.r0 f294190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r38.b f294191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f294192c;

    public m(g48.r0 jointAccountsInteractor, r38.b jointProductInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f294190a = jointAccountsInteractor;
        this.f294191b = jointProductInteractor;
        this.f294192c = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return new go.g(zi0.c.P(new qf1.m(new TextLocalisedClause(R$string.joint_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.joint_add_new_widget_subtitle, null, null, 14), new TextLocalisedClause(R$string.joint_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_joint, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.d(new JointAccountsFeatureConfig.Invite.Destination());
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.f294192c).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : new v1(new vnl.o(this, null, 27));
    }
}
