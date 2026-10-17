package tab;

import android.content.Context;
import bbb.f;
import bbb.g;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.retail.legacy.login.api.TwoFaFeatureConfig;
import com.revolut.feature.retail.legacy.login.impl.twofa.TwoFaContract$Config;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import tjg.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TwoFaFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ChannelType channelType;
        TwoFaFeatureConfig config = (TwoFaFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof TwoFaFeatureConfig.Sms)) {
            throw new NoWhenBranchMatchedException();
        }
        f.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = bbb.b.f14225b;
        TwoFaFeatureConfig.Sms sms = (TwoFaFeatureConfig.Sms) config;
        String str = sms.f82667a;
        e eVar = sms.f82669c;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        switch (g.f14227b[eVar.ordinal()]) {
            case 1:
                channelType = ChannelType.PUSH;
                break;
            case 2:
                channelType = ChannelType.SMS;
                break;
            case 3:
                channelType = ChannelType.EMAIL;
                break;
            case 4:
                channelType = ChannelType.CALL;
                break;
            case 5:
                channelType = ChannelType.PASSCODE;
                break;
            case 6:
                channelType = ChannelType.SESSION;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ChannelType channelType2 = channelType;
        navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new TwoFaContract$Config(sms.f82670g, channelType2, sab.b.SIGN_2FA, null, str, sms.d, sms.f, sms.f82668b, sms.e), null, null, 0, null, null, null, null, false, 1020));
    }
}
