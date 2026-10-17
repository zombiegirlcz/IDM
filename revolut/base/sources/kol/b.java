package kol;

import bjl.p0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import com.revolut.sso.api.models.PasscodeWelcomeMessage;
import com.revolut.sso.api.models.UserInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import rqk.k;
import u7l.c;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uil.a f186383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f186384b;

    public b(uil.a revolutAccountManager, p0 ssoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(revolutAccountManager, "revolutAccountManager");
        Intrinsics.checkNotNullParameter(ssoDependenciesProvider, "ssoDependenciesProvider");
        this.f186383a = revolutAccountManager;
        this.f186384b = ssoDependenciesProvider;
    }

    public final PasscodeWelcomeMessage a(UserInfo userInfo) {
        String str;
        String str2;
        if (userInfo == null) {
            return null;
        }
        String str3 = userInfo.d;
        if (str3 == null) {
            str2 = null;
            str = null;
        } else {
            List listM0 = d0.m0(d0.F0(str3).toString(), new char[]{p.SPACE_CHAR}, 6);
            Object objD0 = zhm.d0.d0(listM0);
            String str4 = (String) objD0;
            if (str4 == null || d0.W(str4)) {
                objD0 = null;
            }
            str = (String) objD0;
            Object objO0 = zhm.d0.o0(listM0);
            String str5 = (String) objO0;
            if (str5 == null || d0.W(str5) || str5.equals(str)) {
                objO0 = null;
            }
            str2 = (String) objO0;
        }
        k kVar = (k) this.f186384b;
        kVar.getClass();
        p7l.a user = new p7l.a(str, str2, null);
        c cVar = kVar.e;
        Intrinsics.checkNotNullParameter(user, "user");
        WelcomeAppearance welcomeAppearance = (WelcomeAppearance) cVar.f277980a.e(user).e();
        Clause message = welcomeAppearance.f104714a;
        ImageWithAnimatedBackgroundView.Model model = welcomeAppearance.f104715b;
        PasscodeWelcomeMessage passcodeWelcomeMessage = new PasscodeWelcomeMessage(message, model != null ? model.f58653a : null);
        Base64Image base64ImageJ = x5d.b.j(userInfo);
        if (base64ImageJ == null) {
            return passcodeWelcomeMessage;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        return new PasscodeWelcomeMessage(message, base64ImageJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.sso.impl.domain.models.InitialAuthenticationCredential.Account r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kol.a
            if (r0 == 0) goto L13
            r0 = r6
            kol.a r0 = (kol.a) r0
            int r1 = r0.f186382w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186382w = r1
            goto L18
        L13:
            kol.a r0 = new kol.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186382w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = 0
            if (r5 != 0) goto L36
            goto L47
        L36:
            com.revolut.sso.api.accounts.RevolutAccount r5 = r5.f106153a
            r0.f186382w = r3
            uil.a r6 = r4.f186383a
            pjl.z0 r6 = (pjl.z0) r6
            java.lang.Object r6 = r6.l(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.sso.api.models.UserInfo r6 = (com.revolut.sso.api.models.UserInfo) r6
        L47:
            com.revolut.sso.api.models.PasscodeWelcomeMessage r5 = r4.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kol.b.b(com.revolut.sso.impl.domain.models.InitialAuthenticationCredential$Account, gim.c):java.lang.Object");
    }
}
