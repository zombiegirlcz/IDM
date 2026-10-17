package kne;

import efm.d0;
import jf0.c;
import kkf.b4;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import sri.m;
import ufm.f;
import ufm.i;
import w4l.h;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements vme.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f186162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wme.a f186163b;

    public b(m navigator, wme.a taxExemptionAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(taxExemptionAvailabilityInteractor, "taxExemptionAvailabilityInteractor");
        this.f186162a = navigator;
        this.f186163b = taxExemptionAvailabilityInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "tax-exemption");
    }

    public final d0 b(String str) {
        d0 d0VarFirstOrError = m70.a.g(e.c(((nne.a) this.f186163b).a(str, h.f294642c), g.f186406a), null, new b4(24), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
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
            boolean r0 = r7 instanceof kne.a
            if (r0 == 0) goto L13
            r0 = r7
            kne.a r0 = (kne.a) r0
            int r1 = r0.f186161x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186161x = r1
            goto L1a
        L13:
            kne.a r0 = new kne.a
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186161x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            java.util.HashMap r6 = r6.d
            java.lang.String r7 = "productType"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L49
            boolean r7 = kotlin.text.d0.W(r6)
            if (r7 == 0) goto L4a
        L49:
            r6 = r4
        L4a:
            efm.d0 r7 = r5.b(r6)
            r0.u = r6
            r0.f186161x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            xme.e r7 = (xme.e) r7
            boolean r0 = r7 instanceof xme.d
            if (r0 == 0) goto L70
            xme.d r7 = (xme.d) r7
            boolean r7 = r7.f307229a
            if (r7 != 0) goto L70
            q06.h r7 = new q06.h
            com.revolut.feature.tax_residency.api.exemption.TaxExemptionDestination$TaxExemption r0 = new com.revolut.feature.tax_residency.api.exemption.TaxExemptionDestination$TaxExemption
            r0.<init>(r6)
            r7.<init>(r0, r4)
            return r7
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kne.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("productType");
        String str2 = null;
        if (str != null) {
            if (kotlin.text.d0.W(str)) {
                str = null;
            }
            str2 = str;
        }
        d0 d0VarB = b(str2);
        int i = 3;
        km2.b bVar = new km2.b(i, new k79.b(this, str2, 27));
        d0VarB.getClass();
        i iVar = new i(new f(d0VarB, bVar, i), new km2.b(4, new knd.a(10)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
