package rqk;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.UICustomization;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements pqk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mli.e f256577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f256578b;

    public e(mli.e logoutInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(logoutInteractor, "logoutInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f256577a = logoutInteractor;
        this.f256578b = navigator;
    }

    public static FeatureCommand b(jf0.c cVar) {
        SignInOrigin lostAccess;
        String str = (String) cVar.d.get("identity_id");
        if (str != null) {
            lostAccess = new SignInOrigin.DuplicateAccount(str, (String) cVar.d.get("rejected_claim"));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Identity id must be present");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            lostAccess = new SignInOrigin.LostAccess(RevolutSsoApi$DefaultIdentifier.Preferred.Phone);
        }
        return gc0.c.f(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, (lostAccess instanceof SignInOrigin.DuplicateAccount) && ((SignInOrigin.DuplicateAccount) lostAccess).f99275b != null, new UserAuthFeatureConfig.UseCase.SignIn(new UserAuthFeatureConfig.SignInParams(null, lostAccess, new UICustomization(null, null, 31))), 7));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "signin") && cVar.d.containsKey("identity_id");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rqk.d
            if (r0 == 0) goto L13
            r0 = r8
            rqk.d r0 = (rqk.d) r0
            int r1 = r0.f256576x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256576x = r1
            goto L1a
        L13:
            rqk.d r0 = new rqk.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256576x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L4b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            skm.w1 r8 = skm.w1.f264016b
            rbh.k r2 = new rbh.k
            r5 = 16
            r2.<init>(r6, r4, r5)
            r0.u = r7
            r0.f256576x = r3
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            q06.h r8 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r7 = b(r7)
            r0.<init>(r7)
            r8.<init>(r0, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new c(this, deeplink, null, 1));
    }
}
