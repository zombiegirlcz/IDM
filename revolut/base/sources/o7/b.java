package o7;

import a08.n;
import a41.o0;
import ael.y;
import au6.u1;
import b2b.e;
import b9i.h;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.qvik.impl.data.QvikPayService;
import com.revolut.feature.call_security_info.impl.network.ActiveCallsService;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import cu8.u;
import efm.r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kel.g;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import v1d.j;
import vc.s;
import vkm.f;
import w4l.i;
import w4l.k;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements a4b.c, o, e, zp0.c, DFS.Neighbors, v1d.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f222639b;

    public b(h function) {
        this.f222638a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222639b = function;
    }

    public static String g(String str, a aVar, boolean z) {
        String str2 = z ? ".temp" + aVar.extension : aVar.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb6 = new StringBuilder();
                for (byte b4 : bArrDigest) {
                    sb6.append(String.format("%02x", Byte.valueOf(b4)));
                }
                strReplaceAll = sb6.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return p.a.p("lottie_cache_", strReplaceAll, str2);
    }

    public static f s(b bVar, LegacyOrderQuoteParams params) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        b8l.f fVar = (b8l.f) ((b8l.a) bVar.f222639b);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return se0.c.a(fVar.f13299c, new b8l.b(params), 3L);
    }

    public static vkm.d u(b bVar, OrderQuoteParams params) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        b8l.f fVar = (b8l.f) ((b8l.a) bVar.f222639b);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        qe0.o oVar = fVar.e;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return qe0.o.c(oVar, params, kotlin.time.c.h(3L, pkm.e.SECONDS), null, 28);
    }

    @Override // v1d.d
    public Clause a() {
        return ((j) ((jpc.e) this.f222639b).d).a();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f222638a) {
            case 8:
                return ((h) this.f222639b).invoke(obj2);
            default:
                return ((u) this.f222639b).invoke(obj2);
        }
    }

    public d60.a b(u2l.a activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        w2l.a aVarZ0 = activity.Z0();
        Intrinsics.i(aVarZ0, "null cannot be cast to non-null type com.revolut.feature.mainscreen.impl.toexctract.interfaces.CommandViewApi");
        return new d60.a(((r41.a) ((dwl.b) aVarZ0)).A(), activity.Z0().getProgressView(), (mli.e) this.f222639b);
    }

    @Override // b2b.e
    public SwipeToActionDelegate c() {
        return (SwipeToActionDelegate) this.f222639b;
    }

    @Override // v1d.d
    public TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.shared_watchlist_widget_symbol_header_title, null, null, 14);
    }

    public dyb.a e() {
        Object obj2 = ((phm.a) this.f222639b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (dyb.a) obj2;
    }

    public jhi.b f(String portfolioId, String ref2) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return mo3.a.e(nim.a.v(((y) ((ybl.d) this.f222639b)).e(portfolioId, w4l.h.f294642c), new a4b.d(this, ref2, 1)), new n(22), new n(23));
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj2) {
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = (JvmBuiltInsCustomizer) this.f222639b;
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.i;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj2).getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((KotlinType) it8.next()).getConstructor().mo3795getDeclarationDescriptor();
            ClassDescriptor classDescriptorA = null;
            ClassifierDescriptor original = classifierDescriptorMo3795getDeclarationDescriptor != null ? classifierDescriptorMo3795getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor != null && (classDescriptorA = jvmBuiltInsCustomizer.a(classDescriptor)) == null) {
                classDescriptorA = classDescriptor;
            }
            if (classDescriptorA != null) {
                arrayList.add(classDescriptorA);
            }
        }
        return arrayList;
    }

    public File h(String str) {
        File file = new File(t(), g(str, a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(t(), g(str, a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(t(), g(str, a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public CfdOpenPositionsDelegate$OpenPositions i(wel.e portfolio, String ref2) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        ArrayList arrayList = portfolio.e;
        ArrayList<g> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            g gVar = (g) obj2;
            if (gVar instanceof kel.n) {
                kel.n nVar = (kel.n) gVar;
                if (Intrinsics.f(nVar.e, ref2) && nVar.f183174b.compareTo(BigDecimal.ZERO) > 0) {
                    arrayList2.add(obj2);
                }
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (g gVar2 : arrayList2) {
            Intrinsics.i(gVar2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
            bigDecimalValueOf = bigDecimalValueOf.add(((kel.n) gVar2).f183174b);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        ArrayList<g> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            g gVar3 = (g) obj3;
            if (gVar3 instanceof kel.n) {
                kel.n nVar2 = (kel.n) gVar3;
                if (Intrinsics.f(nVar2.e, ref2) && nVar2.f183174b.compareTo(BigDecimal.ZERO) < 0) {
                    arrayList3.add(obj3);
                }
            }
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        for (g gVar4 : arrayList3) {
            Intrinsics.i(gVar4, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
            BigDecimal bigDecimalAbs = ((kel.n) gVar4).f183174b.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            bigDecimalValueOf2 = bigDecimalValueOf2.add(bigDecimalAbs);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
        }
        return new CfdOpenPositionsDelegate$OpenPositions(bigDecimalValueOf, bigDecimalValueOf2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof c1f.d
            if (r0 == 0) goto L13
            r0 = r7
            c1f.d r0 = (c1f.d) r0
            int r1 = r0.f20466w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20466w = r1
            goto L18
        L13:
            c1f.d r0 = new c1f.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20466w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r4.f222639b
            vte.b r7 = (vte.b) r7
            r0.f20466w = r3
            xve.d r7 = (xve.d) r7
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
        L4c:
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.next()
            aue.b r7 = (aue.b) r7
            boolean r1 = r7 instanceof aue.a
            if (r1 == 0) goto L60
            r0 = r7
            aue.a r0 = (aue.a) r0
        L60:
            if (r0 == 0) goto L4c
            r5.add(r0)
            goto L4c
        L66:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L6d
            goto Laf
        L6d:
            boolean r6 = mra.d.C(r5)
            if (r6 == 0) goto L76
            aue.e r5 = aue.e.f9806a
            return r5
        L76:
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L81
            goto Lab
        L81:
            java.lang.Object r0 = r5.next()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L8c
            goto Lab
        L8c:
            r6 = r0
            aue.a r6 = (aue.a) r6
            dj0.d r6 = r6.e
        L91:
            java.lang.Object r7 = r5.next()
            r1 = r7
            aue.a r1 = (aue.a) r1
            dj0.d r1 = r1.e
            r6.getClass()
            int r2 = r6.compareTo(r1)
            if (r2 <= 0) goto La5
            r0 = r7
            r6 = r1
        La5:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L91
        Lab:
            aue.a r0 = (aue.a) r0
            if (r0 != 0) goto Lb2
        Laf:
            aue.g r5 = aue.g.f9808a
            return r5
        Lb2:
            aue.f r5 = new aue.f
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.j(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        ((MoneyBoxAmountInputScreen) this.f222639b).Z.k(new ccb.g(formattedValue, z));
    }

    public mli.e l() {
        return (mli.e) this.f222639b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(android.nfc.Tag r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bra.h
            if (r0 == 0) goto L13
            r0 = r6
            bra.h r0 = (bra.h) r0
            int r1 = r0.f17973w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17973w = r1
            goto L18
        L13:
            bra.h r0 = new bra.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17973w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f222639b
            w53.b r6 = (w53.b) r6
            f63.d r6 = (f63.d) r6
            rfm.h0 r5 = r6.d(r5)
            r0.f17973w = r3
            java.lang.Object r6 = nim.a.i(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.github.devnied.emvnfccard.model.EmvCard r6 = (com.github.devnied.emvnfccard.model.EmvCard) r6
            r5 = 0
            if (r6 != 0) goto L4b
            return r5
        L4b:
            com.github.devnied.emvnfccard.model.enums.CardStateEnum r0 = r6.getState()
            com.github.devnied.emvnfccard.model.enums.CardStateEnum r1 = com.github.devnied.emvnfccard.model.enums.CardStateEnum.ACTIVE
            if (r0 != r1) goto L57
            java.lang.String r5 = r6.getCardNumber()
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.m(android.nfc.Tag, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cu2.a
            if (r0 == 0) goto L13
            r0 = r5
            cu2.a r0 = (cu2.a) r0
            int r1 = r0.f108799w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108799w = r1
            goto L18
        L13:
            cu2.a r0 = new cu2.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108799w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f222639b
            com.revolut.feature.call_security_info.impl.network.ActiveCallsService r5 = (com.revolut.feature.call_security_info.impl.network.ActiveCallsService) r5
            r0.f108799w = r3
            java.lang.Object r5 = r5.getActiveCall(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            bu2.c r5 = (bu2.c) r5
            boolean r5 = r5.f18667a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.n(gim.c):java.lang.Object");
    }

    public akg.n o(String portfolioId, String ref2, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((y) ((ybl.d) this.f222639b)).e(portfolioId, loadingStrategy), new a4b.d(this, ref2, 0));
    }

    public r p(LegacyOrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        b8l.f fVar = (b8l.f) ((b8l.a) this.f222639b);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        r rVarConcatWith = mo3.a.n(fVar.f13299c.f(new b8l.b(orderQuoteParams), true)).concatWith(fVar.d.a(new b8l.b(orderQuoteParams), 3L, true));
        Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
        return rVarConcatWith;
    }

    public vkm.d q(v1e.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        y1e.d dVar = (y1e.d) this.f222639b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return dVar.f310369c.b(params, loadingStrategy);
    }

    public Flow r(Serializable fallback, Function0 block) {
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Intrinsics.checkNotNullParameter(block, "block");
        return boh.f.e(((et6.g) ((gr6.a) this.f222639b)).e(w4l.h.f294642c), new dt6.a(block, fallback));
    }

    public File t() {
        File file = new File(((o0) this.f222639b).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void v(Class cls, e4m.e eVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f222639b;
        s.i(eVar, "provider");
        linkedHashMap.put(cls, eVar);
    }

    public AcquiringPaymentFilter w(AcquiringPaymentsQuery query) {
        FilteringDateRange custom;
        pr6.k kVar;
        Intrinsics.checkNotNullParameter(query, "query");
        Set set = query.e;
        av6.b bVar = (av6.b) this.f222639b;
        LocalDateTime localDateTime = query.f73371b;
        LocalDateTime localDateTime2 = query.f73372c;
        bVar.getClass();
        if (localDateTime == null || localDateTime2 == null) {
            custom = null;
        } else {
            LocalDate localDateE = ((l80.f) bVar.f9927a).e();
            LocalDate localDate = localDateTime.toLocalDate();
            LocalDate localDate2 = localDateTime2.toLocalDate();
            if (Intrinsics.f(localDate, localDateE) && Intrinsics.f(localDate2, localDateE)) {
                custom = FilteringDateRange.Today.f73467a;
            } else if (Intrinsics.f(localDate, localDateE.with((TemporalAdjuster) DayOfWeek.MONDAY)) && Intrinsics.f(localDate2, localDateE.with((TemporalAdjuster) DayOfWeek.SUNDAY))) {
                custom = FilteringDateRange.ThisWeek.f73466a;
            } else if (Intrinsics.f(localDate, localDateE.withDayOfMonth(1)) && Intrinsics.f(localDate2, localDateE.withDayOfMonth(localDateE.lengthOfMonth()))) {
                custom = FilteringDateRange.ThisMonth.f73464a;
            } else {
                LocalDate localDateOf = LocalDate.of(localDateE.getYear(), (((localDateE.getMonthValue() - 1) / 3) * 3) + 1, 1);
                if (Intrinsics.f(localDate, localDateOf) && Intrinsics.f(localDate2, localDateOf.plusMonths(3L).minusDays(1L))) {
                    custom = FilteringDateRange.ThisQuarter.f73465a;
                } else {
                    Intrinsics.h(localDate);
                    Intrinsics.h(localDate2);
                    custom = new FilteringDateRange.Custom(localDate, localDate2);
                }
            }
        }
        Set set2 = query.d;
        Set set3 = query.f;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set3.iterator();
        while (it8.hasNext()) {
            switch (av6.a.f9926b[((pr6.j) it8.next()).ordinal()]) {
                case 1:
                case 2:
                    kVar = pr6.k.CARD;
                    break;
                case 3:
                    kVar = pr6.k.REVOLUT_PAY;
                    break;
                case 4:
                    kVar = pr6.k.GOOGLE_PAY;
                    break;
                case 5:
                    kVar = pr6.k.APPLE_PAY;
                    break;
                case 6:
                    kVar = pr6.k.TAP_TO_PAY;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    kVar = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        AcquiringPaymentFilter acquiringPaymentFilter = new AcquiringPaymentFilter(set, custom, set2, d0.i1(arrayList));
        if (acquiringPaymentFilter.b()) {
            return null;
        }
        return acquiringPaymentFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.lang.Object r6, kotlin.jvm.functions.Function1 r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof dt6.b
            if (r0 == 0) goto L13
            r0 = r8
            dt6.b r0 = (dt6.b) r0
            int r1 = r0.f117394y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117394y = r1
            goto L18
        L13:
            dt6.b r0 = new dt6.b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f117392w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f117394y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            gim.i r6 = r0.v
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r6 = r0.u
            yhm.o.b(r8)
            goto L58
        L3d:
            yhm.o.b(r8)
            java.lang.Object r8 = r5.f222639b
            gr6.a r8 = (gr6.a) r8
            r0.u = r6
            r2 = r7
            gim.i r2 = (gim.i) r2
            r0.v = r2
            r0.f117394y = r4
            et6.g r8 = (et6.g) r8
            w4l.h r2 = w4l.h.f294642c
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L58
            goto L6d
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6e
            r6 = 0
            r0.u = r6
            r0.v = r6
            r0.f117394y = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.x(java.lang.Object, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public File y(String str, InputStream inputStream, a aVar) throws IOException {
        File file = new File(t(), g(str, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th10) {
                fileOutputStream.close();
                throw th10;
            }
        } finally {
            inputStream.close();
        }
    }

    public b(u function) {
        this.f222638a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222639b = function;
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f222638a = i;
        this.f222639b = obj2;
    }

    public b(MapStyleOptions internal) {
        this.f222638a = 3;
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f222639b = internal;
    }

    public b(ActiveCallsService activeCallsService) {
        this.f222638a = 15;
        Intrinsics.checkNotNullParameter(activeCallsService, "activeCallsService");
        this.f222639b = activeCallsService;
    }

    public b(h4g.g shopsAvailabilityInteractor) {
        this.f222638a = 23;
        Intrinsics.checkNotNullParameter(shopsAvailabilityInteractor, "shopsAvailabilityInteractor");
        this.f222639b = shopsAvailabilityInteractor;
    }

    public b(k5i.c exchangeCurrencyRateMapper) {
        this.f222638a = 28;
        Intrinsics.checkNotNullParameter(exchangeCurrencyRateMapper, "exchangeCurrencyRateMapper");
        this.f222639b = exchangeCurrencyRateMapper;
    }

    public b(av6.b dateRangeMapper) {
        this.f222638a = 5;
        Intrinsics.checkNotNullParameter(dateRangeMapper, "dateRangeMapper");
        this.f222639b = dateRangeMapper;
    }

    public b(QvikPayService service) {
        this.f222638a = 20;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f222639b = service;
    }

    public b(jpc.e widgetDataProvider) {
        this.f222638a = 29;
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        this.f222639b = widgetDataProvider;
    }

    public b(vte.b topUpLimitsInteractor) {
        this.f222638a = 12;
        Intrinsics.checkNotNullParameter(topUpLimitsInteractor, "topUpLimitsInteractor");
        this.f222639b = topUpLimitsInteractor;
    }

    public b(z58.c revPointsKycCheckExtension) {
        this.f222638a = 27;
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        this.f222639b = revPointsKycCheckExtension;
    }

    public b(mli.e logoutController) {
        this.f222638a = 19;
        Intrinsics.checkNotNullParameter(logoutController, "logoutController");
        this.f222639b = logoutController;
    }

    public b(w53.b nfcManager) {
        this.f222638a = 10;
        Intrinsics.checkNotNullParameter(nfcManager, "nfcManager");
        this.f222639b = nfcManager;
    }

    public b(x0d.e repository) {
        this.f222638a = 18;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222639b = repository;
    }

    public b(y1e.d repository) {
        this.f222638a = 7;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222639b = repository;
    }

    public b(exg.a gaugeMapper) {
        this.f222638a = 6;
        Intrinsics.checkNotNullParameter(gaugeMapper, "gaugeMapper");
        this.f222639b = gaugeMapper;
    }

    public b(ybl.k tradingAccountsInteractor) {
        this.f222638a = 24;
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f222639b = tradingAccountsInteractor;
    }

    public b(b8l.a orderQuoteRepository) {
        this.f222638a = 2;
        Intrinsics.checkNotNullParameter(orderQuoteRepository, "orderQuoteRepository");
        this.f222639b = orderQuoteRepository;
    }

    public b(gr6.a freelancerAccountDetailsInteractor) {
        this.f222638a = 21;
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        this.f222639b = freelancerAccountDetailsInteractor;
    }

    public b(yud.g stakingInteractor) {
        this.f222638a = 17;
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f222639b = stakingInteractor;
    }

    public b(rhf.d entryPoint) {
        this.f222638a = 4;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f222639b = entryPoint;
    }

    public b(r10.a repository) {
        this.f222638a = 11;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222639b = repository;
    }

    public b(wdf.a assetFieldHintMapper) {
        this.f222638a = 26;
        Intrinsics.checkNotNullParameter(assetFieldHintMapper, "assetFieldHintMapper");
        this.f222639b = assetFieldHintMapper;
    }

    public b(u1 repository) {
        this.f222638a = 25;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222639b = repository;
    }

    public b(ybl.d portfolioInteractor) {
        this.f222638a = 1;
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f222639b = portfolioInteractor;
    }

    public b() {
        this.f222638a = 22;
        this.f222639b = ue0.e.u(26);
    }

    public b(TabInvestController tabInvestController) {
        this.f222638a = 9;
        this.f222639b = tabInvestController.c0;
    }
}
