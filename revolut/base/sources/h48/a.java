package h48;

import com.revolut.feature.joint.api.data.JointAccountSupportedDeeplink;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {
    @Override // xii.b
    public final Set a() {
        JointAccountSupportedDeeplink.INSTANCE.getClass();
        return JointAccountSupportedDeeplink.templates;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("invitationId");
        if (str != null) {
            return new JointAccountsFeatureConfig.Deeplink(new JointDeeplink.Invitation(str));
        }
        return null;
    }
}
