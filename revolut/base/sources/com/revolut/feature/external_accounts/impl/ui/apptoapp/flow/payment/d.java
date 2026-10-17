package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import f8l.e;
import fj6.f;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oe6.m;
import oki.h;
import pfk.o0;
import pi6.j;
import pi6.k;
import pi6.o;
import pi6.p;
import pi6.t;
import pi6.u;
import yji.l;
import yki.i;
import zh9.u0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements j {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f72518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ad2.a f72519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f72520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pi6.d f72521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e52.c f72522t;
    public final f u;
    public final t1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f72523w;

    public d(k inputData, m openBankingInteractor, ad2.a idealRepository, u relay, pi6.d brexitErrorHandler, e52.c outboundConsentsServerErrorHandler, f paymentBreakdownItemFactory, t1 currencyRateNaviProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(idealRepository, "idealRepository");
        Intrinsics.checkNotNullParameter(relay, "relay");
        Intrinsics.checkNotNullParameter(brexitErrorHandler, "brexitErrorHandler");
        Intrinsics.checkNotNullParameter(outboundConsentsServerErrorHandler, "outboundConsentsServerErrorHandler");
        Intrinsics.checkNotNullParameter(paymentBreakdownItemFactory, "paymentBreakdownItemFactory");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        this.o = inputData;
        this.f72518p = openBankingInteractor;
        this.f72519q = idealRepository;
        this.f72520r = relay;
        this.f72521s = brexitErrorHandler;
        this.f72522t = outboundConsentsServerErrorHandler;
        this.u = paymentBreakdownItemFactory;
        this.v = currencyRateNaviProvider;
        this.f72523w = d8l.d.a(this, new p5f.c(this, 26));
    }

    public static final x61.h I2(d dVar, String str) {
        k kVar = dVar.o;
        String str2 = kVar.e;
        String str3 = kVar.d;
        String str4 = kVar.f236445b;
        String strL = str4 != null ? m70.a.l(str4) : null;
        String str5 = kVar.f236444a;
        String strL2 = str5 != null ? m70.a.l(str5) : null;
        List listL = v.l(str);
        String str6 = strL2;
        String str7 = kVar.f236446c;
        String str8 = kVar.f;
        return new x61.h(str2, str3, strL, str6, str7, listL, str8 != null ? m70.a.l(str8) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pi6.s
            if (r0 == 0) goto L13
            r0 = r7
            pi6.s r0 = (pi6.s) r0
            int r1 = r0.f236456w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236456w = r1
            goto L18
        L13:
            pi6.s r0 = new pi6.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236456w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L68
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            ad2.a r7 = r5.f72519q
            bd2.e r7 = (bd2.e) r7
            r7.getClass()
            java.lang.String r2 = "redirectUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.apm.services.ideal.impl.data.network.IDealService r2 = r7.f14520a
            efm.d0 r6 = r2.callRedirectUrl(r6)
            ufm.n r6 = te0.w.i0(r6)
            bd2.a r2 = new bd2.a
            r4 = 0
            r2.<init>(r7, r4)
            bce.e r7 = new bce.e
            r4 = 5
            r7.<init>(r2, r4)
            ufm.i r2 = new ufm.i
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.f236456w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            com.revolut.retail.core.navigation.feature.FeatureConfig r7 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r7
            pi6.l r6 = new pi6.l
            kotlin.jvm.internal.Intrinsics.h(r7)
            r6.<init>(r7)
            r5.C2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.J2(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String, kotlin.coroutines.Continuation] */
    public static final void K2(d dVar, String str) {
        TextLocalisedClause textLocalisedClause;
        Object obj2;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.open_banking_consent_flow_error_unsupported_country_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.open_banking_consent_flow_error_unsupported_country_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.oba_authorize_accounts_brexit_error_take_me_back_button, null, null, 14);
        if (str != null) {
            textLocalisedClause = textLocalisedClause4;
            obj2 = null;
        } else {
            textLocalisedClause = null;
            obj2 = null;
        }
        ?? r72 = obj2;
        l.a1(dVar, dVar.X1(new y0(r72, new z(textLocalisedClause2, textLocalisedClause3, textLocalisedClause, null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new o0(str, dVar, (Continuation) r72), 3);
    }

    public final void L2(OutboundPaymentExtras outboundPaymentExtras) {
        BigDecimal bigDecimal;
        if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.LegacyQuote)) {
            if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.PaymentBreakdown)) {
                throw new NoWhenBranchMatchedException();
            }
            OutboundPaymentBreakdown outboundPaymentBreakdown = ((OutboundPaymentExtras.PaymentBreakdown) outboundPaymentExtras).f72532a;
            if (outboundPaymentBreakdown.getF72385c() == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Fees clicked but charges are null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            }
            Charges f72385c = outboundPaymentBreakdown.getF72385c();
            if (f72385c == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ChargeBreakdown chargeBreakdown = f72385c.f104731a;
            OrderQuoteParams orderQuoteParams = new OrderQuoteParams(outboundPaymentBreakdown.getF72384b().f115083b, outboundPaymentBreakdown.getF72383a().f115083b, e.MARKET, pyd.c.Y(outboundPaymentBreakdown.getF72383a()), f8l.b.TO, f8l.b.FROM, null, false, null, null, null, null, null, null, 16128);
            c4i.a aVar = c4i.a.EXCHANGE;
            k9 k9Var = k9.OpenBanking;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            C1(u0.c(new FeeBreakdownFeatureConfig(orderQuoteParams, chargeBreakdown, aVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (xi0.b) null, false, (Clause) null, (HtmlLocalisedClause) null, 1968)));
            return;
        }
        OrderQuote orderQuote = ((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a;
        xi0.b bVar = orderQuote.f104754c.f104718b.f104721c;
        Amount amount = orderQuote.e;
        xi0.b bVar2 = amount.f104718b.f104721c;
        e eVar = orderQuote.k;
        int i = p.f236452a[orderQuote.f104752a.ordinal()];
        if (i == 1) {
            bigDecimal = orderQuote.f104754c.f104717a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimal = amount.f104717a;
        }
        OrderQuoteParams orderQuoteParams2 = new OrderQuoteParams(bVar, bVar2, eVar, bigDecimal, orderQuote.f104752a, orderQuote.f104753b, orderQuote.f104758l, false, null, null, null, null, null, null, 16128);
        ChargeBreakdown chargeBreakdown2 = orderQuote.f104755g.f104731a;
        c4i.a aVar2 = c4i.a.EXCHANGE;
        k9 k9Var2 = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        C1(u0.c(new FeeBreakdownFeatureConfig(orderQuoteParams2, chargeBreakdown2, aVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), (xi0.b) null, false, (Clause) null, (HtmlLocalisedClause) null, 1968)));
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null), new o(this, 0));
    }

    public final void M2(Throwable th10) {
        l.a1(this, X1(this.f72522t.c(th10)), null, null, new t(this, null, 1), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72523w;
    }
}
