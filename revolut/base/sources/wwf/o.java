package wwf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.transport.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends yji.n implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ouf.a f300665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final twf.a f300666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.e f300667n;

    public o(ouf.a transportInteractor, twf.a transitCheckoutMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(transitCheckoutMapper, "transitCheckoutMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300665l = transportInteractor;
        this.f300666m = transitCheckoutMapper;
        this.f300667n = dateProvider;
    }

    public static final j0 Z2(o oVar) {
        return new j0((Clause) new TextLocalisedClause(R$string.transport_ticket_purchase_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transport_ticket_purchase_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(wwf.o r17, bxf.e r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wwf.o.b3(wwf.o, bxf.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.util.List r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wwf.m
            if (r0 == 0) goto L13
            r0 = r7
            wwf.m r0 = (wwf.m) r0
            int r1 = r0.f300662x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300662x = r1
            goto L18
        L13:
            wwf.m r0 = new wwf.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300662x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.List r6 = r0.u
            java.util.List r6 = (java.util.List) r6
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L59
        L2c:
            r7 = move-exception
            goto La2
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            ouf.a r7 = r5.f300665l     // Catch: java.lang.Exception -> L2c
            r2 = r6
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L2c
            r0.u = r2     // Catch: java.lang.Exception -> L2c
            r0.f300662x = r4     // Catch: java.lang.Exception -> L2c
            ivf.r r7 = (ivf.r) r7     // Catch: java.lang.Exception -> L2c
            suf.h r7 = r7.f168858a     // Catch: java.lang.Exception -> L2c
            r7.getClass()     // Catch: java.lang.Exception -> L2c
            suf.g r2 = new suf.g     // Catch: java.lang.Exception -> L2c
            r2.<init>(r7, r6, r3, r4)     // Catch: java.lang.Exception -> L2c
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L2c
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L59
            return r1
        L59:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L2c
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> L2c
            boolean r1 = r0 instanceof java.util.Collection     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L6c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Exception -> L2c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L6c
            goto L86
        L6c:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2c
        L70:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2c
            com.revolut.feature.transport.models.transit.PurchasedTransitTicket r1 = (com.revolut.feature.transport.models.transit.PurchasedTransitTicket) r1     // Catch: java.lang.Exception -> L2c
            boolean r1 = r1 instanceof com.revolut.feature.transport.models.transit.PurchasedTransitTicket.Pending     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L70
            wwf.g r7 = new wwf.g     // Catch: java.lang.Exception -> L2c
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2c
            return r7
        L86:
            int r0 = r7.size()     // Catch: java.lang.Exception -> L2c
            if (r0 != r4) goto L9c
            wwf.i r0 = new wwf.i     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = zhm.d0.b0(r7)     // Catch: java.lang.Exception -> L2c
            com.revolut.feature.transport.models.transit.PurchasedTransitTicket r7 = (com.revolut.feature.transport.models.transit.PurchasedTransitTicket) r7     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = r7.getF92682a()     // Catch: java.lang.Exception -> L2c
            r0.<init>(r7)     // Catch: java.lang.Exception -> L2c
            return r0
        L9c:
            wwf.h r7 = new wwf.h     // Catch: java.lang.Exception -> L2c
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2c
            return r7
        La2:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r7, r0)
            wwf.g r7 = new wwf.g
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wwf.o.c3(java.util.List, gim.c):java.lang.Object");
    }
}
