package o7c;

import android.net.Uri;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import efm.d0;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import wli.u;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements z5c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f222751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cdc.f f222752b;

    public c(sri.m navigator, cdc.f oAuthReturnUrlFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(oAuthReturnUrlFactory, "oAuthReturnUrlFactory");
        this.f222751a = navigator;
        this.f222752b = oAuthReturnUrlFactory;
    }

    public static aim.f c(jf0.c cVar) {
        aim.f builder = new aim.f();
        Uri uri2 = Uri.parse(cVar.f173627a);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        for (Pair pair : n14.e.y(uri2, u.FORM_URL_ENCODED)) {
            builder.putIfAbsent((String) pair.f186385a, (String) pair.f186386b);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "payments-revolut-pay-oauth-authorization");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o7c.b b(jf0.c r9, aim.f r10) {
        /*
            r8 = this;
            java.lang.String r0 = "client_id"
            java.lang.Object r0 = r10.get(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            if (r2 != 0) goto Le
            goto La1
        Le:
            java.lang.String r1 = "redirect_uri"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto La1
            cdc.f r3 = r8.f222752b
            boolean r4 = r3.b(r1)
            if (r4 == 0) goto L21
            goto L22
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto La1
            java.lang.String r4 = "scope"
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L30
            goto La1
        L30:
            java.lang.String r5 = "state"
            java.lang.Object r10 = r10.get(r5)
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L3c
            goto La1
        L3c:
            java.lang.String r9 = r9.f173627a
            java.lang.String r10 = "rawUri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            java.lang.String r10 = "paramName"
            java.lang.String r6 = "authorization_details"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r10)
            f80.a r10 = r3.f23230a
            f80.b r10 = (f80.b) r10
            android.net.Uri r9 = r10.g(r9)
            if (r9 == 0) goto L96
            java.lang.String r9 = r9.getEncodedQuery()
            if (r9 != 0) goto L5b
            goto L96
        L5b:
            java.lang.String r10 = "&"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            r3 = 6
            r6 = 0
            java.util.List r9 = kotlin.text.d0.n0(r9, r10, r6, r3)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L6d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L83
            java.lang.Object r10 = r9.next()
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "authorization_details="
            boolean r3 = kotlin.text.a0.H(r3, r7, r6)
            if (r3 == 0) goto L6d
            goto L84
        L83:
            r10 = r0
        L84:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L96
            java.lang.String r9 = "="
            java.lang.String r9 = kotlin.text.d0.v0(r10, r9, r10)
            if (r9 == 0) goto L96
            java.lang.String r9 = m70.a.l(r9)
            r6 = r9
            goto L97
        L96:
            r6 = r0
        L97:
            if (r6 != 0) goto L9a
            goto La1
        L9a:
            r3 = r1
            o7c.b r1 = new o7c.b
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7c.c.b(jf0.c, aim.f):o7c.b");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        boolean zF = Intrinsics.f(cVar.e(1), "payments-revolut-pay-oauth-authorization");
        HashMap map = cVar.d;
        if (zF) {
            b bVarB = b(cVar, c(cVar));
            if (bVarB != null) {
                return new q06.h(new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination(new RevolutPayOrderSummaryContract$InputData.OAuthAuthorization(bVarB.f222748a, bVarB.f222749b, bVarB.f222750c, bVarB.d, bVarB.e)), null);
            }
            String str = (String) map.get("redirect_uri");
            String str2 = (String) map.get("state");
            if (str != null) {
                cdc.f fVar = this.f222752b;
                if (fVar.b(str)) {
                    return new q06.h(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new BrowserCommand(fVar.a(str, u7c.c.INVALID_REQUEST.a(), str2)), new FinishCommand(null, null, null, 7))), null);
                }
            }
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (!y.D(cVar, "deeplink", 1, "payments-revolut-pay-oauth-authorization")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        aim.f fVarC = c(cVar);
        b bVarB = b(cVar, fVarC);
        if (bVarB != null) {
            ufm.c cVar2 = new ufm.c(new t(this, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination(new RevolutPayOrderSummaryContract$InputData.OAuthAuthorization(bVarB.f222748a, bVarB.f222749b, bVarB.f222750c, bVarB.d, bVarB.e)), false, (Integer) null, 0, 61)), 16), 2);
            Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return ue0.e.C(cVar2, bVarM2);
        }
        String str = (String) fVarC.get("redirect_uri");
        String str2 = (String) fVarC.get("state");
        if (str != null) {
            cdc.f fVar = this.f222752b;
            if (fVar.b(str)) {
                ufm.c cVar3 = new ufm.c(new t(this, fVar.a(str, u7c.c.INVALID_REQUEST.a(), str2), 17), 2);
                Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
                ufm.b bVarM3 = d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return ue0.e.C(cVar3, bVarM3);
            }
        }
        ufm.c cVar4 = new ufm.c(new nc0.a(this, 5), 2);
        Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
        ufm.b bVarM4 = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
        return ue0.e.C(cVar4, bVarM4);
    }
}
