package y3l;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f310756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f310757b;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f310756a = featureToggleInteractor;
        this.f310757b = y0.b("oauth/authorize");
    }

    @Override // xii.b
    public final Set a() {
        return this.f310757b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r11) {
        /*
            r10 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuth r0 = com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuth.f104444c
            gte.a r1 = r10.f310756a
            jte.d r1 = (jte.d) r1
            boolean r0 = r1.c(r0)
            r1 = 0
            if (r0 != 0) goto L14
            goto Lb2
        L14:
            java.lang.String r11 = r11.f195039a
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r0 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            wli.u r0 = wli.u.FORM_URL_ENCODED
            java.util.List r11 = n14.e.y(r11, r0)
            aim.f r0 = new aim.f
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L2e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r11.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.f186385a
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.f186386b
            java.lang.String r2 = (java.lang.String) r2
            r0.putIfAbsent(r3, r2)
            goto L2e
        L46:
            java.lang.String r11 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
            aim.f r11 = r0.b()
            java.lang.String r0 = "response_type"
            java.lang.Object r0 = r11.get(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L5c
        L5a:
            r2 = r1
            goto Lb0
        L5c:
            java.lang.String r0 = "client_id"
            java.lang.Object r0 = r11.get(r0)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L68
            goto L5a
        L68:
            java.lang.String r0 = "redirect_uri"
            java.lang.Object r0 = r11.get(r0)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L74
            goto L5a
        L74:
            java.lang.String r0 = "code_challenge_method"
            java.lang.Object r0 = r11.get(r0)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L80
            goto L5a
        L80:
            java.lang.String r0 = "scope"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L92
            boolean r2 = kotlin.text.d0.W(r0)
            if (r2 != 0) goto L92
            r6 = r0
            goto L93
        L92:
            r6 = r1
        L93:
            java.lang.String r0 = "state"
            java.lang.Object r0 = r11.get(r0)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L9f
            goto L5a
        L9f:
            java.lang.String r0 = "code_challenge"
            java.lang.Object r11 = r11.get(r0)
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto Lab
            goto L5a
        Lab:
            com.revolut.oauth.api.consent.OAuthAuthorizeParams r2 = new com.revolut.oauth.api.consent.OAuthAuthorizeParams
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        Lb0:
            if (r2 != 0) goto Lb3
        Lb2:
            return r1
        Lb3:
            com.revolut.oauth.api.consent.ConsentFlowDestination r11 = new com.revolut.oauth.api.consent.ConsentFlowDestination
            com.revolut.oauth.api.consent.ConsentFlowDestination$InputData r0 = new com.revolut.oauth.api.consent.ConsentFlowDestination$InputData
            r0.<init>(r2)
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y3l.a.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
