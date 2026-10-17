package mf7;

import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import q06.k;
import r10.q;
import sri.m;
import te0.w;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jf0.d, k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f204959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f204960b;

    public g(m navigator, q interactor, a addMoneyNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(addMoneyNaviCommandFactory, "addMoneyNaviCommandFactory");
        this.f204959a = navigator;
        this.f204960b = interactor;
    }

    public static NaviCommand b(NaviCommand naviCommand, boolean z) {
        return z ? com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), naviCommand) : naviCommand;
    }

    public static IncentiveRewardDetailsParams d(jf0.c cVar) {
        if (!Intrinsics.f(cVar.e(2), "rewards")) {
            return null;
        }
        String strE = cVar.e(3);
        if (strE.length() == 0) {
            return null;
        }
        return new IncentiveRewardDetailsParams(strE);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (y.D(cVar, "deeplink", 1, "incentives")) {
            return d(cVar) != null || Intrinsics.f(cVar.e(2), "add-money");
        }
        return false;
    }

    public final ActivityNavigateCommand c(gf7.c promptData, jf0.c cVar) {
        xi0.b bVarA;
        String str;
        Long lN;
        String str2 = (String) cVar.d.get("currency");
        if (str2 != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str2);
        } else {
            bVarA = null;
        }
        xi0.b bVar = cp5.d.A(bVarA) ? bVarA : null;
        dj0.d dVar = (bVar == null || (str = (String) cVar.d.get("amount")) == null || (lN = z.n(str)) == null) ? null : new dj0.d(lN.longValue(), bVar);
        FeatureCommand primaryActionCommand = u0.f(new SalarySwitchDestination(null, null));
        FeatureCommand secondaryActionCommand = u0.f(new InitTopUpDestination(dVar != null ? TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30) : TopUpConfig.Companion.c(TopUpConfig.INSTANCE, bVar, null, null, null, 30)));
        Intrinsics.checkNotNullParameter(promptData, "promptData");
        Intrinsics.checkNotNullParameter(primaryActionCommand, "primaryActionCommand");
        Intrinsics.checkNotNullParameter(secondaryActionCommand, "secondaryActionCommand");
        return os2.b.a(os2.e.Companion, promptData.f143354a, promptData.f143355b, new BluePromptContent.MediaContent(promptData.f143356c), promptData.d, promptData.e, com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), primaryActionCommand), com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), secondaryActionCommand), 1048088);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf7.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(kotlin.coroutines.g.f186406a, new l10.m(this, deeplink, z, (Continuation) null, 2));
    }
}
