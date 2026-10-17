package mw2;

import com.revolut.feature.add_card_to_google_pay_shared.api.confirm.GooglePayOtpVerificationDestination;
import com.revolut.feature.add_card_to_google_pay_shared.api.confirm.GooglePayRevivalConfirmationDestination;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mv9.h;
import org.jetbrains.annotations.NotNull;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements dw2.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f209316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f209317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f209318c;

    public e(m navigator, l93.f revolutCardsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f209316a = navigator;
        this.f209317b = revolutCardsInteractor;
        this.f209318c = featureToggleInteractor;
    }

    public static c d(jf0.c cVar) {
        String str = (String) cVar.d.get("tokenUniqueReference");
        if (str == null) {
            return null;
        }
        String strE = cVar.e(1);
        int iHashCode = strE.hashCode();
        if (iHashCode == 376525084) {
            if (strE.equals("samsung-wallet-verification")) {
                return new c(str, jg1.g.SAMSUNG_WALLET, cw2.a.GOOGLE_PAY);
            }
            return null;
        }
        if (iHashCode == 1678179635) {
            if (strE.equals("apple-pay-verification")) {
                return new c(str, jg1.g.APPLE_PAY, cw2.a.APPLE_PAY);
            }
            return null;
        }
        if (iHashCode == 1744985140 && strE.equals("google-pay-verification")) {
            return new c(str, jg1.g.GOOGLE_PAY, cw2.a.GOOGLE_PAY);
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return ((y.D(cVar, "deeplink", 1, "mdes") || Intrinsics.f(cVar.e(1), "vts")) && Intrinsics.f(cVar.e(2), "app-otp-verification")) || Intrinsics.f(cVar.e(1), "google-pay-verification") || Intrinsics.f(cVar.e(1), "apple-pay-verification") || Intrinsics.f(cVar.e(1), "samsung-wallet-verification");
    }

    public final KompotDestination b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return ((jte.d) this.f209318c).c(CardsCoreApi$Toggles.SharedAddToGoogle.f65570c) ? new GooglePayOtpVerificationDestination(list, true) : new com.revolut.feature.card_add_to_googlepay.api.confirm.GooglePayOtpVerificationDestination(list);
    }

    public final KompotDestination c(c cVar) {
        String str = cVar.f209311a;
        return ((jte.d) this.f209318c).c(CardsCoreApi$Toggles.SharedAddToGoogle.f65570c) ? new GooglePayRevivalConfirmationDestination(str, cVar.f209312b) : new com.revolut.feature.card_add_to_googlepay.api.confirm.GooglePayRevivalConfirmationDestination(str, cVar.f209313c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mw2.d
            if (r0 == 0) goto L13
            r0 = r7
            mw2.d r0 = (mw2.d) r0
            int r1 = r0.f209315x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209315x = r1
            goto L1a
        L13:
            mw2.d r0 = new mw2.d
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209315x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mw2.e r6 = r0.u
            yhm.o.b(r7)
            goto L56
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            r7 = 2
            java.lang.String r7 = r6.e(r7)
            java.lang.String r2 = "app-otp-verification"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L71
            l93.f r6 = r5.f209317b
            ufm.b r6 = l93.f.e(r6)
            r0.u = r5
            r0.f209315x = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r6 = r5
        L56:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.util.List r7 = (java.util.List) r7
            com.revolut.kompot.bridge.navigation.KompotDestination r6 = r6.b(r7)
            if (r6 != 0) goto L64
            goto L88
        L64:
            q06.h r7 = new q06.h
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r0.<init>(r1, r4)
            r7.<init>(r6, r0)
            return r7
        L71:
            mw2.c r6 = d(r6)
            if (r6 == 0) goto L88
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.KompotDestination r6 = r5.c(r6)
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r0.<init>(r1, r4)
            r7.<init>(r6, r0)
            return r7
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mw2.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 2, "app-otp-verification")) {
            return new i(l93.f.e(this.f209317b), new h(10, new l3d.f(this, z, 7)), 0);
        }
        if (!Intrinsics.f(cVar.e(1), "google-pay-verification") && !Intrinsics.f(cVar.e(1), "apple-pay-verification") && !Intrinsics.f(cVar.e(1), "samsung-wallet-verification")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        c cVarD = d(cVar);
        if (cVarD == null) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        pfm.h hVar = new pfm.h(new br6.a(this, cVarD, z, 6), 2);
        ufm.b bVarM3 = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
        return hVar.f(bVarM3);
    }
}
