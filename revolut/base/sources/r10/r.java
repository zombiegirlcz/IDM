package r10;

import a08.p0;
import ael.i0;
import afj.g1;
import afj.q0;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData;
import com.revolut.feature.travel.hotel.transfers.api.TravelHotelTransfersApi$Toggles$StaysHotelTransfers;
import com.revolut.kompot.navigable.vc.ViewController;
import dfj.s3;
import ip0.y10;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import nyb.m0;
import s2h.f;
import wli.x;
import wtc.g0;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements vzg.a, cij.a, f, stc.e, el.b, ix0.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f250851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f250853c;

    public /* synthetic */ r(Object obj2, Object obj3, Object obj4) {
        this.f250851a = obj2;
        this.f250852b = obj3;
        this.f250853c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final stc.b f(r rVar, String transactionId, SecurityDelayInfo securityDelayInfo) {
        List listA;
        l80.e eVar = ((xtc.a) rVar.f250852b).f308804a;
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(securityDelayInfo, "securityDelayInfo");
        if (securityDelayInfo instanceof SecurityDelayInfo.InProgress) {
            SecurityDelayInfo.InProgress inProgress = (SecurityDelayInfo.InProgress) securityDelayInfo;
            long j2 = inProgress.f85414c;
            l80.f fVar = (l80.f) eVar;
            if (j2 <= fVar.b().toEpochMilli()) {
                listA = xtc.a.a(transactionId, securityDelayInfo);
            } else {
                String str = inProgress.f85412a;
                long epochMilli = j2 - fVar.b().toEpochMilli();
                Image image = null;
                sa saVar = new sa("SECURITY_DELAY_BANNER_ITEM_LIST_ID", (Clause) new TextLocalisedClause(R$string.security_delay_banner_title_time_left, zhm.u.c(new TimeClause(epochMilli >= 0 ? epochMilli : 0L, new TimeClause.Format.Duration(0), null, null, 12)), null, 12), (Clause) new TextLocalisedClause(R$string.security_delay_banner_in_progress_subtitle, null, null, 14), zhm.v.k(new ActionsView.Item("SECURITY_DELAY_BANNER_CANCEL_BUTTON_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.security_delay_banner_cancel, null, null, 14), null, image, null, null, false, null, null, new SecurityDelayBannerActionData(str, transactionId), null, 24476), new ActionsView.Item("SECURITY_DELAY_BANNER_LEARN_MORE_BUTTON_ID", mx0.d.SEMIACCENT, false, 0 == true ? 1 : 0, null, new TextLocalisedClause(R$string.security_delay_banner_in_progress_learn_more, null, null, 14), image, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, new SecurityDelayBannerActionData(str, transactionId), null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                listA = zhm.u.c(saVar);
            }
        } else if (securityDelayInfo instanceof SecurityDelayInfo.Ready) {
            listA = xtc.a.a(transactionId, securityDelayInfo);
        } else if (securityDelayInfo instanceof SecurityDelayInfo.Created) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_delay_banner_created_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.security_delay_banner_created_subtitle, null, null, 14);
            mx0.d dVar = mx0.d.ACCENT;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.security_delay_banner_created_start_delay, null, null, 14);
            String str2 = ((SecurityDelayInfo.Created) securityDelayInfo).f85411a;
            Image image2 = null;
            List listC = zhm.u.c(new sa("SECURITY_DELAY_BANNER_ITEM_LIST_ID", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, zhm.v.k(new ActionsView.Item("SECURITY_DELAY_BANNER_START_BUTTON_ID", dVar, false, null, null, textLocalisedClause3, null, image2, null, null, false, null, null, new SecurityDelayBannerActionData(str2, transactionId), null, 24476), new ActionsView.Item("SECURITY_DELAY_BANNER_CANCEL_BUTTON_ID", mx0.d.SEMIACCENT, false, 0 == true ? 1 : 0, null, new TextLocalisedClause(R$string.security_delay_banner_cancel, null, null, 14), image2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, new SecurityDelayBannerActionData(str2, transactionId), null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            listA = listC;
        } else {
            if (!(securityDelayInfo instanceof SecurityDelayInfo.NotFound) && !(securityDelayInfo instanceof SecurityDelayInfo.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            listA = f0.f322471a;
        }
        return new stc.b(listA);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(kv1.g r7) {
        /*
            kv1.h r0 = r7.getAlias()
            java.lang.String r1 = "none"
            if (r0 == 0) goto L27
            java.lang.String r2 = r0.getType()
            java.lang.String r3 = r0.getValue()
            java.lang.String r0 = r0.getStatus()
            java.lang.String r4 = "|value="
            java.lang.String r5 = "|status="
            java.lang.String r6 = "type="
            java.lang.StringBuilder r2 = v0.a.m(r6, r2, r4, r3, r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L28
        L27:
            r0 = r1
        L28:
            jo3.a r7 = r7.getAmount()
            if (r7 == 0) goto L50
            long r2 = r7.getAmount()
            java.lang.String r7 = r7.getCurrency()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "amount="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = "|currency="
            r4.append(r2)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r1 = r7
        L50:
            java.lang.String r7 = "alias:"
            java.lang.String r2 = ";amount:"
            java.lang.String r7 = a0.d.s(r7, r0, r2, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.r.j(kv1.g):java.lang.String");
    }

    @Override // ix0.u
    public int B(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String strY = ((ix0.m) this.f250851a).y();
        return strY != null ? d0.W(strY) ^ true : false ? s(model) : ((Number) ((mm7.h) this.f250852b).invoke(((bw0.a) this.f250853c).f19174c)).intValue();
    }

    @Override // ix0.u
    public int E(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return s(model);
    }

    @Override // cij.a
    public cij.a a(ViewController viewController) {
        this.f250853c = viewController;
        return this;
    }

    @Override // s2h.f
    public ListSubheaderDelegate b() {
        return (ListSubheaderDelegate) this.f250852b;
    }

    @Override // cij.a
    public g1 build() {
        vc.s.h((ViewController) this.f250853c, ViewController.class);
        return new g1((afj.b) this.f250851a, (q0) this.f250852b);
    }

    @Override // ix0.u
    public int d() {
        return ((Number) ((mm7.h) this.f250852b).invoke(((bw0.a) this.f250853c).f19172a)).intValue();
    }

    public bd.i g() throws GeneralSecurityException {
        t1 t1Var;
        bd.k kVar = (bd.k) this.f250851a;
        if (kVar == null || (t1Var = (t1) this.f250852b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f14487b != ((od.a) t1Var.f185240b).f224252a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        bd.j jVar = kVar.e;
        bd.j jVar2 = bd.j.e;
        if (jVar != jVar2 && ((Integer) this.f250853c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.f250853c) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            od.a.a(new byte[0]);
        } else if (jVar == bd.j.d) {
            od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f250853c).intValue()).array());
        } else {
            if (jVar != bd.j.f14476c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((bd.k) this.f250851a).e);
            }
            od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f250853c).intValue()).array());
        }
        return new bd.i();
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        OnfidoConfig onfidoConfig = (OnfidoConfig) ((il.f) this.f250851a).get();
        ol.e internalRepository = (ol.e) ((k7i.i) this.f250852b).get();
        ol.c externalRepository = (ol.c) ((jx0.a) this.f250853c).get();
        il.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(internalRepository, "internalRepository");
        Intrinsics.checkNotNullParameter(externalRepository, "externalRepository");
        return onfidoConfig.getBiometricTokenCallback() != null ? externalRepository : internalRepository;
    }

    public id.a h() throws GeneralSecurityException {
        t1 t1Var;
        od.a aVarA;
        id.d dVar = (id.d) this.f250851a;
        if (dVar == null || (t1Var = (t1) this.f250852b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f160355b != ((od.a) t1Var.f185240b).f224252a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        id.c cVar = dVar.d;
        id.c cVar2 = id.c.f;
        if (cVar != cVar2 && ((Integer) this.f250853c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.f250853c) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = od.a.a(new byte[0]);
        } else if (cVar == id.c.e || cVar == id.c.d) {
            aVarA = od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f250853c).intValue()).array());
        } else {
            if (cVar != id.c.f160346c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((id.d) this.f250851a).d);
            }
            aVarA = od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f250853c).intValue()).array());
        }
        return new id.a((id.d) this.f250851a, aVarA);
    }

    @Override // ix0.u
    public int i() {
        return ((Number) ((mm7.h) this.f250852b).invoke(((bw0.a) this.f250853c).f19174c)).intValue();
    }

    public vkm.d k(Alias alias, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        x4l.c cVar = (x4l.c) this.f250853c;
        Intrinsics.checkNotNullParameter(alias, "<this>");
        return cVar.b(new kv1.g(new kv1.h(alias.f61878a.f61891a, alias.f61879b, alias.f61880c.f61884a), dVar != null ? mo3.a.p(dVar) : null), w4l.h.f294642c);
    }

    @Override // s2h.f
    public ListCellDelegate l() {
        return (ListCellDelegate) this.f250851a;
    }

    public ufm.i m(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (!((o8b.c) ((n8b.a) this.f250852b)).g()) {
            return ((wsg.n) this.f250851a).x(accountId);
        }
        x0i.f fVar = (x0i.f) this.f250853c;
        xi0.b.Companion.getClass();
        ufm.i iVar = new ufm.i(fVar.b(xi0.b.E, wd6.c.FIAT_ONLY, h0.f322473a), new fwj.h(new g1.c(5), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public foc.h n(hoc.d chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (!(chart instanceof hoc.b)) {
            if (chart instanceof hoc.c) {
                return (joc.a) this.f250852b;
            }
            throw new IllegalArgumentException("ChartUiMapperProvider.getMapper for unknown chart type: " + chart);
        }
        int i = foc.i.f136919a[((hoc.b) chart).f154269c.ordinal()];
        if (i == 1) {
            return (ioc.d) this.f250853c;
        }
        if (i == 2 || i == 3) {
            return (f61.a) this.f250851a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // s2h.f
    public PlainTextDelegate o() {
        return (PlainTextDelegate) this.f250853c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        if (r1 == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(gim.c r21) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.r.p(gim.c):java.lang.Object");
    }

    @Override // ix0.u
    public int q(bw0.h model) {
        bw0.a aVar = (bw0.a) this.f250853c;
        mm7.h hVar = (mm7.h) this.f250852b;
        Intrinsics.checkNotNullParameter(model, "model");
        ix0.m mVar = (ix0.m) this.f250851a;
        String strY = mVar.y();
        return strY != null ? d0.W(strY) ^ true : false ? mVar.f() ? ((Number) hVar.invoke(aVar.f19172a)).intValue() : s(model) : ((Number) hVar.invoke(aVar.f19174c)).intValue();
    }

    public Object r(String str, String str2, gim.c cVar) {
        x xVar = (x) this.f250852b;
        jf0.c cVarD = ((s06.c) ((q06.d) this.f250851a)).d(str);
        if (cVarD == null) {
            return Boolean.FALSE;
        }
        if (!Intrinsics.f(cVarD.e(1), "savings") || !Intrinsics.f(cVarD.e(2), "info-sheets")) {
            return Boolean.FALSE;
        }
        if (cVarD.d.get("productId") != null || str2 == null) {
            return xVar.L1(str, lg0.a.IGNORE, Boolean.FALSE, cVar);
        }
        String string = ((f80.b) ((f80.a) this.f250853c)).f(str).buildUpon().appendQueryParameter("productId", str2).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return xVar.L1(string, lg0.a.IGNORE, Boolean.FALSE, cVar);
    }

    public int s(bw0.h hVar) {
        bw0.a aVar = (bw0.a) this.f250853c;
        Object obj2 = aVar.f19174c;
        mm7.h hVar2 = (mm7.h) this.f250852b;
        if (hVar.o.a()) {
            obj2 = aVar.d;
        } else {
            String strZ = ((ix0.m) this.f250851a).z();
            if ((strZ == null || strZ.length() == 0) && hVar.d) {
                obj2 = aVar.f19172a;
            }
        }
        return ((Number) hVar2.invoke(obj2)).intValue();
    }

    public boolean t() {
        return ((jte.d) ((gte.a) this.f250851a)).c(TravelHotelTransfersApi$Toggles$StaysHotelTransfers.f93599c) && (((jla.h) this.f250853c).d("HOTELS_POINTS", null) == bla.c.ENABLED) && ((nyb.b) ((eub.a) this.f250852b)).f();
    }

    public Flow u(String portfolioId, xi0.b bVar, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new a9h.a(this, portfolioId, loadingStrategy, (Continuation) null, 0), u0.m(nim.a.v(((i0) ((ybl.j) this.f250853c)).a(cfl.p.MARGIN_TRADING, portfolioId), new a82.l(27)), bVar != null ? zi0.c.i(bVar) : ((x8h.k) this.f250852b).b()));
    }

    public Flow v(String portfolioId, w4l.k loadingStrategy, n9l.b updatePeriod, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        return xam.a.h(new a9h.c(0, this, portfolioId, updatePeriod, loadingStrategy, (Continuation) null), u0.m(nim.a.v(((i0) ((ybl.j) this.f250853c)).a(cfl.p.MARGIN_TRADING, portfolioId), new a82.l(27)), bVar != null ? zi0.c.i(bVar) : ((x8h.k) this.f250852b).b()));
    }

    public r(r7i.u balancePairEligibilityChecker, h6i.o pocketInteractor, h6i.a defaultAdditionalBalancesFilterInteractor) {
        Intrinsics.checkNotNullParameter(balancePairEligibilityChecker, "balancePairEligibilityChecker");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(defaultAdditionalBalancesFilterInteractor, "defaultAdditionalBalancesFilterInteractor");
        this.f250851a = balancePairEligibilityChecker;
        this.f250852b = pocketInteractor;
        this.f250853c = defaultAdditionalBalancesFilterInteractor;
    }

    public r(cej.b mobilePlansFeatureAvailabilityInteractor, hij.b dataPlansContentMapper, hij.k mobilePlansContentMapper) {
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(dataPlansContentMapper, "dataPlansContentMapper");
        Intrinsics.checkNotNullParameter(mobilePlansContentMapper, "mobilePlansContentMapper");
        this.f250851a = mobilePlansFeatureAvailabilityInteractor;
        this.f250852b = dataPlansContentMapper;
        this.f250853c = mobilePlansContentMapper;
    }

    public r(f61.a historicalPerformanceChartUiMapper, joc.a totalValueChartUiMapper, ioc.d simulatedPerformanceChartUiMapper) {
        Intrinsics.checkNotNullParameter(historicalPerformanceChartUiMapper, "historicalPerformanceChartUiMapper");
        Intrinsics.checkNotNullParameter(totalValueChartUiMapper, "totalValueChartUiMapper");
        Intrinsics.checkNotNullParameter(simulatedPerformanceChartUiMapper, "simulatedPerformanceChartUiMapper");
        this.f250851a = historicalPerformanceChartUiMapper;
        this.f250852b = totalValueChartUiMapper;
        this.f250853c = simulatedPerformanceChartUiMapper;
    }

    public r(x8h.g collectionsInteractor, jbh.e performanceAssetMapper, x8h.p sortOptionsInteractor) {
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(sortOptionsInteractor, "sortOptionsInteractor");
        this.f250851a = collectionsInteractor;
        this.f250852b = performanceAssetMapper;
        this.f250853c = sortOptionsInteractor;
    }

    public r(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f250851a = uiKitResources;
        this.f250852b = new LinkedHashSet();
        Integer[] elements = {Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_esim), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_internet), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_data), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_mobile), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_international), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_travel), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_number), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_phone), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_sms), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_text), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_voice), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.lifestyle_search_products_keywords_call), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_roaming), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_plan), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_package), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_connectivity), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_signal), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_network), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_abroad), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_trip), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_holiday), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.lifestyle_search_products_keywords_online), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_minutes), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_line), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_get_esim), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_add_esim), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_esim_setup), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_activate_esim), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_mobile_plan), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_travel_plan), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_data_plan), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_mobile_data), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_international_data), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_roaming), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_sim_card), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_virtual_sim), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_buy_data), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_buy_internet), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_data_abroad), Integer.valueOf(com.revolut.feature.globalsearch.api.R$string.esim_global_search_keywords_travel_internet)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        ArrayList arrayList = new ArrayList(zhm.w.t(setY0, 10));
        Iterator it8 = setY0.iterator();
        while (it8.hasNext()) {
            arrayList.add(new TextLocalisedClause(((Number) it8.next()).intValue(), null, null, 14));
        }
        this.f250853c = arrayList;
    }

    public r(ufm.d securityDelayInteractor, xtc.a securityDelayBannerItemMapper, g0 streetModeInteractor) {
        Intrinsics.checkNotNullParameter(securityDelayInteractor, "securityDelayInteractor");
        Intrinsics.checkNotNullParameter(securityDelayBannerItemMapper, "securityDelayBannerItemMapper");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        this.f250851a = securityDelayInteractor;
        this.f250852b = securityDelayBannerItemMapper;
        this.f250853c = streetModeInteractor;
    }

    public r(f8h.d repository, x8h.k displayCurrencyInteractor, ybl.j tradingAccountProductGroupOnboardingStateInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupOnboardingStateInteractor, "tradingAccountProductGroupOnboardingStateInteractor");
        this.f250851a = repository;
        this.f250852b = displayCurrencyInteractor;
        this.f250853c = tradingAccountProductGroupOnboardingStateInteractor;
    }

    public r(s3 esimSubscriptionsInteractor, m0 revPointsTransactionsInteractor, whf.b transactionsListContentProvider) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        this.f250851a = esimSubscriptionsInteractor;
        this.f250852b = revPointsTransactionsInteractor;
        this.f250853c = transactionsListContentProvider;
    }

    public r(p71.a externalCardsRepository, wsg.n walletInteractor, vte.a topUpInteractor, wwh.a cpgInteractor, sh3.a checkoutInteractor, l93.f revolutCardsInteractor, dha.c pricingPlansRepository, lfm.c compositeDisposable) {
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f250851a = externalCardsRepository;
        this.f250852b = walletInteractor;
        this.f250853c = cpgInteractor;
        ihm.f fVarD = v0.a.d("create(...)");
        ihm.f fVarD2 = v0.a.d("create(...)");
        efm.r rVarSwitchMap = te0.w.w0(fVarD).switchMap(new dz7.l(new e0f.a(this, 2), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarFlatMapSingle = rVarSwitchMap.flatMapSingle(new dz7.l(new e0f.a(this, 1), 24));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r rVarOnErrorResumeNext = rVarFlatMapSingle.onErrorResumeNext(new a0d.g(12, new e05.h(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(9, e0f.e.f121595a), new p0(9, e0f.f.f121599a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        te0.w.j0(compositeDisposable, cVarSubscribe);
        efm.b bVarSwitchMapCompletable = te0.w.w0(fVarD2).switchMapCompletable(new dz7.l(new e0f.a(this, 0), 22));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        a0d.g gVar = new a0d.g(12, new e05.h(new BreadcrumbException(), 4));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new p0(9, e0f.h.f121607a), e0f.g.f121602a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(compositeDisposable, hVarW);
    }

    public r(IntRange argumentRange, List[] unboxParameters, Method method) {
        Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
        Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
        this.f250851a = argumentRange;
        this.f250852b = unboxParameters;
        this.f250853c = method;
    }
}
