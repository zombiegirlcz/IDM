package t4h;

import ael.h0;
import cfl.p;
import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import efm.d0;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import q06.k;
import s65.o;
import sri.m;
import szb.f;
import wp5.y;
import ybl.i;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements jf0.d, k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f267997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f267998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f267999c;
    public final i0h.c d;
    public final b4f.b e;
    public final Lazy f;

    public e(ybl.b instrumentTickerInteractor, i tradingAccountProductGroupAvailabilityInteractor, m navigator, i0h.c investTransactionsDeeplinkActionPerformer, b4f.b refProvider) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor, "tradingAccountProductGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(investTransactionsDeeplinkActionPerformer, "investTransactionsDeeplinkActionPerformer");
        Intrinsics.checkNotNullParameter(refProvider, "refProvider");
        this.f267997a = instrumentTickerInteractor;
        this.f267998b = tradingAccountProductGroupAvailabilityInteractor;
        this.f267999c = navigator;
        this.d = investTransactionsDeeplinkActionPerformer;
        this.e = refProvider;
        this.f = j.b(new szl.a(11));
    }

    public static a b(jf0.c cVar) {
        String strE = cVar.e(3);
        HashMap map = cVar.d;
        String str = (String) map.get("ref");
        String str2 = (String) map.get("focus");
        vqk.c cVar2 = Intrinsics.f(str2, c.NEWS.a()) ? vqk.c.NEWS : Intrinsics.f(str2, c.FINANCIALS.a()) ? vqk.c.FINANCIALS : null;
        String str3 = (String) map.get("compoundId");
        String str4 = (String) map.get("insightId");
        return new a(strE, str, cVar2, str4 != null ? new StartNavigation.InsightsFlow(str4) : null, str3);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "stocks") && cVar.e(4).length() == 0;
    }

    public final d0 c(a aVar) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(((h0) this.f267998b).b(p.BONDS), g.f186406a), null, new f(29), 1).firstOrError();
        d0 d0VarA = this.e.a(aVar.f267993a, aVar.f267994b);
        t45.a aVar2 = new t45.a(new sx8.a(this, 28), 6);
        d0VarA.getClass();
        ufm.i iVar = new ufm.i(d0VarA, aVar2, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        d0 d0VarD = d0.D(d0VarFirstOrError, iVar, new t45.a(new qce.b(this, aVar, 22), 7));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        return d0VarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t4h.d
            if (r0 == 0) goto L13
            r0 = r7
            t4h.d r0 = (t4h.d) r0
            int r1 = r0.f267996w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267996w = r1
            goto L1a
        L13:
            t4h.d r0 = new t4h.d
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267996w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L54
        L38:
            yhm.o.b(r7)
            t4h.a r6 = b(r6)
            java.lang.String r7 = r6.e
            if (r7 == 0) goto L57
            i0h.c r6 = r5.d
            s8h.m r6 = (s8h.m) r6
            pfm.z r6 = r6.c(r7)
            r0.f267996w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L54
            goto L63
        L54:
            com.revolut.kompot.common.ParcelableDestination r7 = (com.revolut.kompot.common.ParcelableDestination) r7
            goto L66
        L57:
            efm.d0 r6 = r5.c(r6)
            r0.f267996w = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            com.revolut.kompot.common.ParcelableDestination r7 = (com.revolut.kompot.common.ParcelableDestination) r7
        L66:
            q06.h r6 = new q06.h
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0 = 0
            r6.<init>(r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t4h.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        a aVarB = b(deeplink);
        String compoundId = aVarB.e;
        if (compoundId == null) {
            ufm.i iVar = new ufm.i(c(aVarB), new t45.a(new l3d.f(this, z, 29), 5), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        s8h.m mVar = (s8h.m) this.d;
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        z zVarD = new pfm.a(mVar.c(compoundId), new o(new s8h.g(z, mVar, 1), 14), 4).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
