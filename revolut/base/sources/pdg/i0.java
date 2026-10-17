package pdg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import fag.o0;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.p0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends oki.h implements x {

    @NotNull
    public static final a0 Companion = new a0();
    public final m0 A;
    public final odg.a B;
    public final fcg.e C;
    public boolean D;
    public final cli.y E;
    public final TravelHotelsPropertyDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9g.b0 f235190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9g.h0 f235191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9g.y f235192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9g.l f235193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p8g.b f235194t;
    public final xcg.b u;
    public final p8g.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p0 f235195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i9g.u f235196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f235197y;
    public final j60.a z;

    public i0(cli.n stateMapper, TravelHotelsPropertyDetailsScreenContract$InputData inputData, i9g.b0 travelHotelsPropertyInteractor, i9g.h0 travelSearchParamsInteractor, i9g.y travelHotelsInventoryProviderInteractor, i9g.l travelHotelsBookingDraftInteractor, p8g.b travelHotelsDropoffSearchInteractor, xcg.b packageRatesDetailsDialogFactory, p8g.c travelHotelsFeatureInteractor, p0 revPointsUpgradeBannerInfoInteractor, i9g.u travelHotelsFavoritesInteractor, ang.f userInteractor, j60.a expandableDialogControllerExtension, m0 propertyShareDelegate, odg.a cashbackBadgeControllerExtension, fcg.e filtersRejectedDialogFactory) {
        String str;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsInventoryProviderInteractor, "travelHotelsInventoryProviderInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingDraftInteractor, "travelHotelsBookingDraftInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchInteractor, "travelHotelsDropoffSearchInteractor");
        Intrinsics.checkNotNullParameter(packageRatesDetailsDialogFactory, "packageRatesDetailsDialogFactory");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsUpgradeBannerInfoInteractor, "revPointsUpgradeBannerInfoInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFavoritesInteractor, "travelHotelsFavoritesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(propertyShareDelegate, "propertyShareDelegate");
        Intrinsics.checkNotNullParameter(cashbackBadgeControllerExtension, "cashbackBadgeControllerExtension");
        Intrinsics.checkNotNullParameter(filtersRejectedDialogFactory, "filtersRejectedDialogFactory");
        this.o = inputData;
        this.f235190p = travelHotelsPropertyInteractor;
        this.f235191q = travelSearchParamsInteractor;
        this.f235192r = travelHotelsInventoryProviderInteractor;
        this.f235193s = travelHotelsBookingDraftInteractor;
        this.f235194t = travelHotelsDropoffSearchInteractor;
        this.u = packageRatesDetailsDialogFactory;
        this.v = travelHotelsFeatureInteractor;
        this.f235195w = revPointsUpgradeBannerInfoInteractor;
        this.f235196x = travelHotelsFavoritesInteractor;
        this.f235197y = userInteractor;
        this.z = expandableDialogControllerExtension;
        this.A = propertyShareDelegate;
        this.B = cashbackBadgeControllerExtension;
        this.C = filtersRejectedDialogFactory;
        HotelsPropertyInputData hotelsPropertyInputData = inputData.f93981a;
        String str2 = null;
        HotelsPropertyPreview hotelsPropertyPreview = hotelsPropertyInputData instanceof HotelsPropertyInputData.BookablePreview ? ((HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData).f93671b : null;
        Data data = hotelsPropertyInputData instanceof HotelsPropertyInputData.BookableProperty ? new Data(((HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData).f93673b, null, false, 6, null) : new Data(null, null, true, 3, null);
        LocalDate localDateL2 = L2(inputData);
        localDateL2 = localDateL2 == null ? travelSearchParamsInteractor.b() : localDateL2;
        LocalDate localDateM2 = M2(inputData);
        localDateM2 = localDateM2 == null ? travelSearchParamsInteractor.c() : localDateM2;
        List listO2 = O2(inputData);
        listO2 = listO2 == null ? travelSearchParamsInteractor.f159799a.a().d : listO2;
        HotelsPropertyInputData hotelsPropertyInputData2 = inputData.f93981a;
        boolean z = !(hotelsPropertyInputData2 instanceof HotelsPropertyInputData.BookedProperty);
        HotelsPropertyInputData.BookablePreview bookablePreview = hotelsPropertyInputData2 instanceof HotelsPropertyInputData.BookablePreview ? (HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData2 : null;
        if (bookablePreview == null || (str = bookablePreview.f) == null) {
            HotelsPropertyInputData.BookableProperty bookableProperty = hotelsPropertyInputData2 instanceof HotelsPropertyInputData.BookableProperty ? (HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData2 : null;
            if (bookableProperty != null) {
                str2 = bookableProperty.f;
            }
        } else {
            str2 = str;
        }
        this.E = mra.d.b(this, new m(hotelsPropertyPreview, data, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), zhm.f0.f322471a, localDateL2, localDateM2, listO2, z, false, str2), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r2 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r2 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(pdg.i0 r9, com.revolut.feature_travel_hotels_models.property.HotelsProperty r10, java.time.LocalDate r11, java.time.LocalDate r12, gim.c r13) {
        /*
            i9g.l r0 = r9.f235193s
            cli.y r1 = r9.E
            boolean r2 = r13 instanceof pdg.f0
            if (r2 == 0) goto L18
            r2 = r13
            pdg.f0 r2 = (pdg.f0) r2
            int r3 = r2.f235185w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f235185w = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            pdg.f0 r2 = new pdg.f0
            r2.<init>(r9, r13)
            goto L16
        L1e:
            java.lang.Object r2 = r13.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r3 = r13.f235185w
            r4 = 2
            r8 = 1
            if (r3 == 0) goto L3d
            if (r3 == r8) goto L39
            if (r3 != r4) goto L31
            yhm.o.b(r2)
            goto Laa
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r2)
            goto L8e
        L3d:
            yhm.o.b(r2)
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r2 = r2.getValue()
            pdg.m r2 = (pdg.m) r2
            java.lang.String r2 = r2.f235208m
            p8g.c r9 = r9.v
            i9g.v r9 = (i9g.v) r9
            boolean r9 = r9.c()
            if (r9 == 0) goto L94
            if (r2 == 0) goto L94
            r9 = r1
            r1 = r2
            java.lang.String r2 = r10.f97981a
            java.lang.Object r10 = r9.getValue()
            pdg.m r10 = (pdg.m) r10
            java.time.LocalDate r3 = r10.f235205h
            java.lang.Object r10 = r9.getValue()
            pdg.m r10 = (pdg.m) r10
            java.time.LocalDate r4 = r10.i
            java.lang.Object r9 = r9.getValue()
            pdg.m r9 = (pdg.m) r9
            java.util.List r5 = r9.f235206j
            r6 = 0
            efm.r r9 = r0.c(r1, r2, r3, r4, r5, r6)
            r10 = 3
            java.lang.String r11 = "firstOrError(...)"
            r12 = 0
            efm.d0 r9 = prk.o.l(r9, r12, r12, r10, r11)
            r13.f235185w = r8
            java.lang.Object r2 = nim.a.b(r9, r13)
            if (r2 != r7) goto L8e
            goto La9
        L8e:
            kotlin.jvm.internal.Intrinsics.h(r2)
            afi.a r2 = (afi.a) r2
            return r2
        L94:
            r9 = r1
            java.lang.Object r9 = r9.getValue()
            pdg.m r9 = (pdg.m) r9
            java.util.List r9 = r9.f235206j
            ufm.i r9 = r0.b(r10, r9, r11, r12)
            r13.f235185w = r4
            java.lang.Object r2 = nim.a.b(r9, r13)
            if (r2 != r7) goto Laa
        La9:
            return r7
        Laa:
            kotlin.jvm.internal.Intrinsics.h(r2)
            afi.a r2 = (afi.a) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdg.i0.I2(pdg.i0, com.revolut.feature_travel_hotels_models.property.HotelsProperty, java.time.LocalDate, java.time.LocalDate, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(pdg.i0 r17, com.revolut.feature_travel_hotels_models.property.HotelsProperty r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pdg.i0.J2(pdg.i0, com.revolut.feature_travel_hotels_models.property.HotelsProperty, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(pdg.i0 r5, kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            cli.y r0 = r5.E
            boolean r1 = r7 instanceof pdg.h0
            if (r1 == 0) goto L15
            r1 = r7
            pdg.h0 r1 = (pdg.h0) r1
            int r2 = r1.f235189w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f235189w = r2
            goto L1a
        L15:
            pdg.h0 r1 = new pdg.h0
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f235189w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L48
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            pd4.u r7 = new pd4.u     // Catch: java.lang.Throwable -> L29
            r3 = 5
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L29
            r5.H2(r0, r7)     // Catch: java.lang.Throwable -> L29
            r1.f235189w = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L29
            if (r7 != r2) goto L48
            return r2
        L48:
            pd4.u r6 = new pd4.u
            r1 = 6
            r6.<init>(r1)
            r5.H2(r0, r6)
            return r7
        L52:
            pd4.u r7 = new pd4.u
            r1 = 6
            r7.<init>(r1)
            r5.H2(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdg.i0.K2(pdg.i0, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static LocalDate L2(TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData) {
        HotelsPropertyInputData hotelsPropertyInputData = travelHotelsPropertyDetailsScreenContract$InputData.f93981a;
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookableProperty) {
            return ((HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData).f93674c;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookablePreview) {
            return ((HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData).f93672c;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookedProperty) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LocalDate M2(TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData) {
        HotelsPropertyInputData hotelsPropertyInputData = travelHotelsPropertyDetailsScreenContract$InputData.f93981a;
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookableProperty) {
            return ((HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData).d;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookablePreview) {
            return ((HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData).d;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookedProperty) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List O2(TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData) {
        HotelsPropertyInputData hotelsPropertyInputData = travelHotelsPropertyDetailsScreenContract$InputData.f93981a;
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookableProperty) {
            return ((HotelsPropertyInputData.BookableProperty) hotelsPropertyInputData).e;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookablePreview) {
            return ((HotelsPropertyInputData.BookablePreview) hotelsPropertyInputData).e;
        }
        if (hotelsPropertyInputData instanceof HotelsPropertyInputData.BookedProperty) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(i9g.y.b(this.f235192r, 1)), null, null, new e0(this, continuation, 0), 3);
        i9g.h0 h0Var = this.f235191q;
        efm.r rVarE = h0Var.e();
        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = this.o;
        efm.r rVarSkip = rVarE.skip(L2(travelHotelsPropertyDetailsScreenContract$InputData) == null ? 0L : 1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
        yji.l.a1(this, rd0.e.b(rVarSkip), null, null, new e0(this, continuation, 1), 3);
        efm.r rVarSkip2 = h0Var.f().skip(M2(travelHotelsPropertyDetailsScreenContract$InputData) == null ? 0L : 1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip2, "skip(...)");
        yji.l.a1(this, rd0.e.b(rVarSkip2), null, null, new e0(this, continuation, 2), 3);
        efm.r rVarSkip3 = h0Var.g().skip(O2(travelHotelsPropertyDetailsScreenContract$InputData) == null ? 0L : 1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip3, "skip(...)");
        yji.l.a1(this, rd0.e.b(rVarSkip3), null, null, new e0(this, continuation, 3), 3);
        yji.l.a1(this, rd0.e.b(nim.a.w(nim.a.w(this.f235196x.f159841a.N.f(Unit.f186387a, false), new o0(7)), new i6j.p(23))), null, null, new e0(this, continuation, 4), 3);
        if (travelHotelsPropertyDetailsScreenContract$InputData.f93982b) {
            X1(new mii.e("PRICE_UPDATED_DIALOG_ID", new TextLocalisedClause(R$string.hotels_property_details_tooltip_price_updated, null, null, 14), null, 28));
        }
        if (travelHotelsPropertyDetailsScreenContract$InputData.f93983c) {
            this.C.getClass();
            X1(fcg.e.a());
        }
    }

    public final String N2() {
        HotelsProperty hotelsProperty = (HotelsProperty) ((m) ((j2) this.E.f22677a).getValue()).f235202b.getContent();
        if (hotelsProperty != null) {
            return hotelsProperty.f97981a;
        }
        return null;
    }

    @Override // yji.l
    public final void T1(long j2) {
        pd4.u uVar = new pd4.u(2);
        cli.y yVar = this.E;
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(yh5.b.e(yVar.B(uVar), yVar.B(new pd4.u(3)), yVar.B(new pd4.u(4))), new okf.m(continuation, this, 23)), null, new e0(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
