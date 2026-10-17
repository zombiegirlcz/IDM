package s06;

import com.revolut.retail.core.navigation.DeeplinkNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements q06.m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final asi.d f258868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fwj.p f258869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.l f258870c;
    public final ami.n d;
    public final x06.b e;
    public final uli.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final onh.b f258871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xjl.h f258872h;
    public final xa9.d i;

    public o(asi.d userSessionInteractor, fwj.p userOnboardingInteractor, q06.l deeplinkRouter, ami.n preAuthDeeplinkSideEffectRegistry, x06.b pincodeBlacklistChecker, q06.g deeplinkPropertiesChecker, uli.g externalDeeplinkRouterAuthorizedCommandProvider, onh.b postActivationStatusProvider, xjl.h revolutSsoClientDeeplinkRestoreManager, xa9.d onboardingEmailOtpDispatcher) {
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(preAuthDeeplinkSideEffectRegistry, "preAuthDeeplinkSideEffectRegistry");
        Intrinsics.checkNotNullParameter(pincodeBlacklistChecker, "pincodeBlacklistChecker");
        Intrinsics.checkNotNullParameter(deeplinkPropertiesChecker, "deeplinkPropertiesChecker");
        Intrinsics.checkNotNullParameter(externalDeeplinkRouterAuthorizedCommandProvider, "externalDeeplinkRouterAuthorizedCommandProvider");
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(revolutSsoClientDeeplinkRestoreManager, "revolutSsoClientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(onboardingEmailOtpDispatcher, "onboardingEmailOtpDispatcher");
        this.f258868a = userSessionInteractor;
        this.f258869b = userOnboardingInteractor;
        this.f258870c = deeplinkRouter;
        this.d = preAuthDeeplinkSideEffectRegistry;
        this.e = pincodeBlacklistChecker;
        this.f = externalDeeplinkRouterAuthorizedCommandProvider;
        this.f258871g = postActivationStatusProvider;
        this.f258872h = revolutSsoClientDeeplinkRestoreManager;
        this.i = onboardingEmailOtpDispatcher;
    }

    public static boolean c(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "sso") && Intrinsics.f(cVar.e(2), "uae-pass");
    }

    public final NaviCommand a(String str, UserAuthFeatureConfig.Main.SSODeeplinkData sSODeeplinkData, DeeplinkNavigateCommand deeplinkNavigateCommand) {
        p0j.a aVar;
        xil.m mVarA = this.f258872h.a();
        if (mVarA instanceof xil.h) {
            return new FeatureCommand(new UserAuthFeatureConfig.Main(str, sSODeeplinkData, false, (UserAuthFeatureConfig.UseCase) UserAuthFeatureConfig.UseCase.ForgotPasscode.f99358a, 2));
        }
        if (mVarA instanceof xil.i) {
            xil.i iVar = (xil.i) mVarA;
            int i = m.f258866a[iVar.getMode().ordinal()];
            if (i == 1) {
                aVar = p0j.a.TWO_BUTTONS_UI;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = p0j.a.UNIFIED_UI;
            }
            p0j.a aVar2 = aVar;
            return new FeatureCommand(new UserAuthFeatureConfig.Main(str, sSODeeplinkData, false, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.CombinedAuthentication(iVar.getDetectedCountryCode(), iVar.getBackgroundVideoUrl(), aVar2, false, aVar2 != p0j.a.UNIFIED_UI, null), 2));
        }
        if (mVarA instanceof xil.j) {
            return new FeatureCommand(new UserAuthFeatureConfig.Main(str, sSODeeplinkData, false, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignIn(0), 2));
        }
        if (mVarA instanceof xil.k) {
            return new FeatureCommand(new UserAuthFeatureConfig.Main(str, sSODeeplinkData, false, (UserAuthFeatureConfig.UseCase) UserAuthFeatureConfig.UseCase.SignUp.f99360a, 2));
        }
        if ((mVarA instanceof xil.a) || (mVarA instanceof xil.e) || (mVarA instanceof xil.f) || (mVarA instanceof xil.g) || (mVarA instanceof xil.l) || mVarA == null) {
            return DeeplinkNavigateCommand.a(deeplinkNavigateCommand);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ufm.i b(d0 d0Var, jf0.c cVar) {
        ufm.i iVar = new ufm.i(d0Var, new ryd.j(new k(this, cVar, 3), 28), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final boolean d() {
        asi.c cVarA = this.f258868a.a();
        return cVarA == asi.c.UNAUTHORIZED || cVarA == asi.c.EXPIRED || cVarA == asi.c.EXIST;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        if (r1.equals("itsme") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0242, code lost:
    
        if (r1.equals("idura") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0249, code lost:
    
        if (r1.equals("dap") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0253, code lost:
    
        if (r1.equals("bank_id") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025d, code lost:
    
        if (r1.equals("id_austria") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0265, code lost:
    
        if (d() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
    
        r1 = new com.revolut.retail.core.navigation.FeatureCommand(new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.Main((java.lang.String) null, (com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.Main.SSODeeplinkData) null, true, (com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.UseCase) new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.UseCase.SignUpWithDeepLink(r5), 7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x022e, code lost:
    
        if (r1.equals("uae_pass") == false) goto L195;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.retail.core.navigation.CompositeCommand e(jf0.c r20, com.revolut.retail.core.navigation.DeeplinkNavigateCommand r21) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.o.e(jf0.c, com.revolut.retail.core.navigation.DeeplinkNavigateCommand):com.revolut.retail.core.navigation.CompositeCommand");
    }
}
