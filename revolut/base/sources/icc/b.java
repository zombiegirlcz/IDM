package icc;

import efm.d0;
import i9g.f0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements acc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f160237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6c.c f160238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kcc.a f160239c;

    public b(m navigator, b6c.c revolutPayInfoInteractor, kcc.a promotedMerchantsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantsAvailabilityInteractor, "promotedMerchantsAvailabilityInteractor");
        this.f160237a = navigator;
        this.f160238b = revolutPayInfoInteractor;
        this.f160239c = promotedMerchantsAvailabilityInteractor;
    }

    public static boolean c(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "revolut-pay") && Intrinsics.f(cVar.e(2), "article-loyalty");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return c(deeplink);
    }

    public final d0 b() {
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(this.f160239c.a(), null, new i83.m(13), 1), g.f186406a).onErrorReturnItem(Boolean.FALSE).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof icc.a
            if (r0 == 0) goto L13
            r0 = r10
            icc.a r0 = (icc.a) r0
            int r1 = r0.f160236y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160236y = r1
            goto L1a
        L13:
            icc.a r0 = new icc.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.f160234w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160236y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            java.lang.Boolean r9 = r0.v
            jf0.c r0 = r0.u
            yhm.o.b(r10)
            goto L78
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            jf0.c r9 = r0.u
            yhm.o.b(r10)
            goto L58
        L3f:
            yhm.o.b(r10)
            boolean r10 = c(r9)
            if (r10 != 0) goto L49
            return r5
        L49:
            efm.d0 r10 = r8.b()
            r0.u = r9
            r0.f160236y = r3
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L58
            goto L73
        L58:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            kotlinx.coroutines.d r2 = skm.p0.f264003c
            hy2.e r3 = new hy2.e
            r6 = 20
            r3.<init>(r8, r5, r6)
            ufm.b r2 = te0.w.o0(r2, r3)
            r0.u = r9
            r0.v = r10
            r0.f160236y = r4
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L78:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.util.HashMap r1 = r0.d
            java.lang.String r2 = "show_badges"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.util.HashMap r0 = r0.d
            java.lang.String r2 = "presentation_type"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            kotlin.jvm.internal.Intrinsics.h(r9)
            boolean r9 = r9.booleanValue()
            kotlin.jvm.internal.Intrinsics.h(r10)
            boolean r10 = r10.booleanValue()
            com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination r2 = new com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination
            com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination$InputData r3 = new com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination$InputData
            r4 = 0
            r3.<init>(r10, r9, r1, r4)
            r2.<init>(r3)
            q06.h r9 = new q06.h
            java.lang.String r10 = "inline"
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r0, r10)
            if (r10 != 0) goto Lbd
            q06.b r10 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.e
            r10.<init>(r0, r5)
            r5 = r10
        Lbd:
            r9.<init>(r2, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: icc.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!c(deeplink)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        i iVar = new i(w.H0(b(), w.o0(p0.f264003c, new hy2.e(this, null, 20))), new f0(29, new i25.e(deeplink, this, 15)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
