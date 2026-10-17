package kxj;

import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.sso.api.models.PasswordScreenCustomization;
import com.revolut.sso.api.models.UICustomization;
import efm.d0;
import efm.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import sri.m;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements u0j.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f190585a;

    public d(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f190585a = navigator;
    }

    public static ufm.b b(jf0.c cVar) {
        UserAuthFeatureConfig.UseCase signIn;
        String strE = cVar.e(1);
        if (Intrinsics.f(strE, "login")) {
            if (a0.H(cVar.f173627a, "revolut-revolutx://app", false)) {
                signIn = new UserAuthFeatureConfig.UseCase.SignIn(new UserAuthFeatureConfig.SignInParams(null, SignInOrigin.Default.f99273a, new UICustomization(new PasswordScreenCustomization(23), null, 23)));
            } else {
                signIn = new UserAuthFeatureConfig.UseCase.SignIn(0);
            }
        } else {
            if (!Intrinsics.f(strE, "signup")) {
                throw new IllegalStateException("Can perform actions only for Login or SignUp");
            }
            signIn = UserAuthFeatureConfig.UseCase.SignUp.f99360a;
        }
        ufm.b bVarM = d0.m(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, false, signIn, 15));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        return Intrinsics.f(strE, "login") || Intrinsics.f(strE, "signup");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        k kVarW = new i(b(cVar), new ksb.a(new kxb.c(3), 27), 1).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return nim.a.i(ue0.e.x(kVarW), continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(new ufm.f(b(deeplink), new ksb.a(new kv7.g(this, 16), 25), 3), new ksb.a(new kxb.c(2), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
