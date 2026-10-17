package fuf;

import ax4.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import wsg.n;
import yqi.c;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138202a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f138203b;

    public b(jh4.a ibanValidator) {
        Intrinsics.checkNotNullParameter(ibanValidator, "ibanValidator");
        this.f138203b = ibanValidator;
    }

    public d a(j validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (!validationData.d) {
            d.Companion.getClass();
            return c.a(validationData);
        }
        List list = ((jh4.a) this.f138203b).validate(new ih4.b(a0.D(validationData.f10884c, " ", "", false))).f316033b;
        if (!list.isEmpty()) {
            return new d(validationData, list);
        }
        d.Companion.getClass();
        return c.a(validationData);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yqi.d b(fuf.a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "validationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            xi0.b r2 = r12.d
            xi0.b r0 = r12.f138201c
            long r3 = r12.f138200b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            hrf.c r5 = r12.e
            if (r5 != 0) goto L14
            goto L3d
        L14:
            boolean r6 = r5 instanceof hrf.a
            if (r6 == 0) goto L4b
            if (r1 == 0) goto L3b
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            boolean r6 = cp5.d.z(r0)
            if (r6 != 0) goto L2b
            boolean r0 = cp5.d.y(r0)
            if (r0 == 0) goto L3b
        L2b:
            hrf.a r5 = (hrf.a) r5
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r0 = r5.f154810a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r0.d
            if (r0 == 0) goto L39
            dj0.d r0 = a.a.L(r0)
            long r3 = r0.f115082a
        L39:
            r7 = r3
            goto L58
        L3b:
            if (r1 == 0) goto L3e
        L3d:
            goto L39
        L3e:
            hrf.a r5 = (hrf.a) r5
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r0 = r5.f154810a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r0.f104754c
            dj0.d r0 = a.a.L(r0)
            long r3 = r0.f115082a
            goto L39
        L4b:
            boolean r0 = r5 instanceof hrf.b
            if (r0 == 0) goto L8c
            hrf.b r5 = (hrf.b) r5
            nrf.c r0 = r5.f154811a
            dj0.d r0 = r0.f218628l
            long r3 = r0.f115082a
            goto L39
        L58:
            long r9 = r12.f138199a
            java.lang.Object r0 = r11.f138203b
            r1 = r0
            wsg.n r1 = (wsg.n) r1
            r5 = 0
            r6 = 30
            r3 = 0
            r4 = 0
            io3.d r0 = osg.b.b(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L73
            java.lang.Long r0 = r0.f163152m
            if (r0 == 0) goto L73
            long r0 = r0.longValue()
            goto L75
        L73:
            r0 = 0
        L75:
            long r9 = r9 + r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L82
            yqi.d r0 = new yqi.d
            srf.a r1 = srf.a.f265206a
            r0.<init>(r12, r1)
            return r0
        L82:
            yqi.c r0 = yqi.d.Companion
            r0.getClass()
            yqi.d r12 = yqi.c.a(r12)
            return r12
        L8c:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fuf.b.b(fuf.a):yqi.d");
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ d validate(Object obj2) {
        switch (this.f138202a) {
            case 0:
                return b((a) obj2);
            default:
                return a((j) obj2);
        }
    }

    public b(n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f138203b = walletInteractor;
    }
}
