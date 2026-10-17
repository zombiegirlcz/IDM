package w5k;

import efm.d0;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import ufm.i;
import w38.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f295347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rq9.a f295348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9e.c f295349c;
    public final wo9.a d;
    public final cw9.d e;
    public final Set f;

    public d(m navigator, rq9.a groupBillsNaviCommandProvider, c9e.c subscriptionNavigationProvider, wo9.a naviCommandProvider, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f295347a = navigator;
        this.f295348b = groupBillsNaviCommandProvider;
        this.f295349c = subscriptionNavigationProvider;
        this.d = naviCommandProvider;
        this.e = paymentsProductFeatureChecker;
        String[] elements = {"bank-transfers", "transfers", "payments", "request-money-list", "send-money-list", "request-payment", "push-to-card", "bank-accounts", "contacts", "pago-pa-option", "accept-payment-link", "payment-links"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = kotlin.collections.d.y0(elements);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f.contains(deeplink.e(1));
    }

    public final i b(jf0.c cVar) {
        kotlinx.coroutines.d dVar = p0.f264003c;
        Continuation continuation = null;
        d0 d0VarB = d0.B(w.o0(dVar, new b(this, continuation, 0)), w.o0(dVar, new b(this, continuation, 1)), w.o0(dVar, new b(this, continuation, 2)), w.o0(dVar, new b(this, continuation, 3)), new w4l.c(new dr0.w(4), 8));
        Intrinsics.checkNotNullExpressionValue(d0VarB, "zip(...)");
        i iVar = new i(d0VarB, new w4l.c(new hta.a(this, cVar, 1), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bf, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d9, code lost:
    
        if (r1.equals("send-money-list") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e2, code lost:
    
        if (r1.equals("request-payment") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x030d, code lost:
    
        if (r1.equals("bank-transfers") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0322, code lost:
    
        return new q06.h(new com.revolut.kompot.bridge.navigation.BridgeDestination(jbb.a.a(ibb.c.f160142c, null, null, null, 14)), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0329, code lost:
    
        if (r1.equals("request-money-list") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x032c, code lost:
    
        r1 = ((zt9.a) r11).a();
        r2.u = null;
        r2.f295346x = 2;
        r1 = nim.a.b(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x033a, code lost:
    
        if (r1 != r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017f, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f2, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0265, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5k.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(b(deeplink), new w4l.c(new v(this, deeplink, 12), 5), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
