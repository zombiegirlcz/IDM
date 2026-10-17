package rqk;

import aim.o;
import bjl.p0;
import cjl.q;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements p0 {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl0.c f256584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf3.l f256585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jma.f f256586c;
    public final l24.c d;
    public final u7l.c e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jx0.a f256587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f256588h;
    public final cn0.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kgm.c f256589j;
    public final zm0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zm0.c f256590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yf.c f256591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ang.f f256592n;
    public final asi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f256593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f256594q;

    public k(wl0.c biometricHelper, rf3.l chatAuthInfoProvider, jma.f closeAccountNavigationHandler, l24.c creditBiometricProvider, u7l.c eventAppearanceInteractor, gte.a featureToggleInteractor, jx0.a countrySelectionScreenModelConfiguration, d0 countrySelectionStateMapperConfiguration, cn0.e primaryAuthCredentialsTypeProvider, afe.b prohibitedAppDetector, kgm.c retailReauthInteractor, yil.b revolutSsoConfiguration, zm0.b sessionController, zm0.c sessionProvider, yf.c tokenEncoder, ang.f userInteractor, asi.d userSessionInteractor) {
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(chatAuthInfoProvider, "chatAuthInfoProvider");
        Intrinsics.checkNotNullParameter(closeAccountNavigationHandler, "closeAccountNavigationHandler");
        Intrinsics.checkNotNullParameter(creditBiometricProvider, "creditBiometricProvider");
        Intrinsics.checkNotNullParameter(eventAppearanceInteractor, "eventAppearanceInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countrySelectionScreenModelConfiguration, "countrySelectionScreenModelConfiguration");
        Intrinsics.checkNotNullParameter(countrySelectionStateMapperConfiguration, "countrySelectionStateMapperConfiguration");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        Intrinsics.checkNotNullParameter(prohibitedAppDetector, "prohibitedAppDetector");
        Intrinsics.checkNotNullParameter(retailReauthInteractor, "retailReauthInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoConfiguration, "revolutSsoConfiguration");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(tokenEncoder, "tokenEncoder");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.f256584a = biometricHelper;
        this.f256585b = chatAuthInfoProvider;
        this.f256586c = closeAccountNavigationHandler;
        this.d = creditBiometricProvider;
        this.e = eventAppearanceInteractor;
        this.f = featureToggleInteractor;
        this.f256587g = countrySelectionScreenModelConfiguration;
        this.f256588h = countrySelectionStateMapperConfiguration;
        this.i = primaryAuthCredentialsTypeProvider;
        this.f256589j = retailReauthInteractor;
        this.k = sessionController;
        this.f256590l = sessionProvider;
        this.f256591m = tokenEncoder;
        this.f256592n = userInteractor;
        this.o = userSessionInteractor;
        revolutSsoConfiguration.getHostUrl();
        this.f256593p = revolutSsoConfiguration.getClientId();
        this.f256594q = revolutSsoConfiguration.getHCaptchaSiteKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rqk.g
            if (r0 == 0) goto L13
            r0 = r5
            rqk.g r0 = (rqk.g) r0
            int r1 = r0.f256579w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256579w = r1
            goto L18
        L13:
            rqk.g r0 = new rqk.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256579w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f256592n
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f256579w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L51
            java.lang.String r5 = r5.f116409b
            if (r5 == 0) goto L51
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            return r5
        L51:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.k.a(gim.c):java.lang.Object");
    }

    public final o b() {
        o oVar = new o();
        oVar.add(q.PHONE);
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            oVar.add(q.GOOGLE);
        }
        return y0.a(oVar);
    }

    public final BridgeDestination c(String phone, String email) {
        rf3.l lVar = this.f256585b;
        if (phone != null) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            lVar.f253690g.set(phone);
        } else {
            if (email == null) {
                throw new IllegalStateException("phone or email must be available to start a chat");
            }
            Intrinsics.checkNotNullParameter(email, "email");
            lVar.f253691h.set(email);
        }
        return new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), (String) null, 11)), false, (Integer) null, 0, 57)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rqk.h
            if (r0 == 0) goto L13
            r0 = r7
            rqk.h r0 = (rqk.h) r0
            int r1 = r0.f256580w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256580w = r1
            goto L18
        L13:
            rqk.h r0 = new rqk.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256580w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L59
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f256592n
            efm.d0 r7 = r7.f(r3)
            rlh.d0 r2 = new rlh.d0
            r4 = 28
            r2.<init>(r6, r4)
            rpi.d r4 = new rpi.d
            r5 = 3
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f256580w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            mm0.q r7 = (mm0.q) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            yf.c r0 = r6.f256591m
            java.lang.String r7 = r0.m(r7)
            java.lang.String r0 = "Basic "
            java.lang.String r7 = kotlin.text.d0.e0(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.k.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rqk.i
            if (r0 == 0) goto L13
            r0 = r5
            rqk.i r0 = (rqk.i) r0
            int r1 = r0.f256581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256581w = r1
            goto L18
        L13:
            rqk.i r0 = new rqk.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256581w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f256592n
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f256581w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L4a
            java.lang.String r5 = r5.i
            return r5
        L4a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.k.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rqk.j
            if (r0 == 0) goto L13
            r0 = r6
            rqk.j r0 = (rqk.j) r0
            int r1 = r0.f256583x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256583x = r1
            goto L18
        L13:
            rqk.j r0 = new rqk.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256583x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f256592n
            zmg.d r6 = r6.d
            efm.k r6 = r6.c()
            r0.u = r5
            r0.f256583x = r3
            java.lang.Object r6 = nim.a.i(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            do3.n r6 = (do3.n) r6
            if (r6 == 0) goto L66
            java.lang.String r6 = r6.f116409b
            if (r6 == 0) goto L66
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L60
            wl0.c r5 = r4.f256584a
            rm0.j r5 = r5.c()
            boolean r5 = r5 instanceof rm0.d
            if (r5 == 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.k.f(java.lang.String, gim.c):java.lang.Object");
    }
}
