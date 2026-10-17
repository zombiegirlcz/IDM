package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import bej.e;
import bej.m;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import dfj.s3;
import dfj.w1;
import dmj.a0;
import dmj.b0;
import dmj.h0;
import dmj.i0;
import dmj.l0;
import dmj.q0;
import dmj.s0;
import dmj.v0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nyb.k;
import oki.h;
import q7c.g;
import unj.j;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements b0 {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f101382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f101383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f101384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s3 f101385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f101386t;
    public final m u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f101387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory f101388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f101389y;
    public final y z;

    public c(n stateMapper, EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData inputData, i90.b uuidUtils, e phoneNumberCheckoutInteractor, g paymentMethodsInteractor, k revPointsInteractor, s3 esimSubscriptionsInteractor, x deeplinkHandler, m esimStatementsInteractor, j esimStatementsDialogBuilder, w1 phoneNumberPurchaseInteractor, EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory phoneNumberPurchaseStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(phoneNumberCheckoutInteractor, "phoneNumberCheckoutInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        Intrinsics.checkNotNullParameter(phoneNumberPurchaseInteractor, "phoneNumberPurchaseInteractor");
        Intrinsics.checkNotNullParameter(phoneNumberPurchaseStatusDialogFactory, "phoneNumberPurchaseStatusDialogFactory");
        this.o = inputData;
        this.f101382p = phoneNumberCheckoutInteractor;
        this.f101383q = paymentMethodsInteractor;
        this.f101384r = revPointsInteractor;
        this.f101385s = esimSubscriptionsInteractor;
        this.f101386t = deeplinkHandler;
        this.u = esimStatementsInteractor;
        this.v = esimStatementsDialogBuilder;
        this.f101387w = phoneNumberPurchaseInteractor;
        this.f101388x = phoneNumberPurchaseStatusDialogFactory;
        this.f101389y = new vii.b();
        this.z = d.b(this, new a0(new Data(null, null, true, 3, null), wp5.y.u(uuidUtils, "toString(...)"), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, null), stateMapper, new v0(), false, 8);
        this.A = hx7.e.a(this, new dgj.h(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof dmj.u0
            if (r0 == 0) goto L13
            r0 = r5
            dmj.u0 r0 = (dmj.u0) r0
            int r1 = r0.f116184w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116184w = r1
            goto L18
        L13:
            dmj.u0 r0 = new dmj.u0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f116184w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            dfj.s3 r5 = r4.f101385s
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData r2 = r4.o
            java.lang.String r2 = r2.f101371a
            r0.f116184w = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.a$a r5 = com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.a.C0622a.f101379a
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c.I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        i0 i0Var = new i0(4, this, continuation);
        vii.b bVar = this.f101389y;
        l.a1(this, q.Q(bVar, i0Var), null, null, new q0(2, this, continuation), 3);
        l.a1(this, q.q(q.Q(bVar, new i0(2, this, continuation))), null, null, new q0(1, this, continuation), 3);
        l.a1(this, q.Q(bVar, new i0(3, this, continuation)), null, null, new s0(this, null), 3);
        l.a1(this, q.Q(bVar, new i0(0, this, continuation)), null, null, new l0(this, null), 3);
        l.a1(this, q.Q(bVar, new i0(1, this, continuation)), null, null, new q0(0, this, continuation), 3);
    }

    public final void J2(EsimDynamicTermsMapper$TermsClickData termsClickData) {
        Intrinsics.checkNotNullParameter(termsClickData, "termsClickData");
        if (termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.ActionParcel) {
            return;
        }
        int i = 25;
        Continuation continuation = null;
        if (!(termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel)) {
            if (!(termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.UrlParcel)) {
                throw new NoWhenBranchMatchedException();
            }
            A1(new dlk.k(this, ((EsimDynamicTermsMapper$TermsClickData.UrlParcel) termsClickData).f100945b, continuation, 6), new yi5.b(i));
            return;
        }
        String str = this.o.f101371a;
        EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel downloadContractSummaryParcel = (EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel) termsClickData;
        String str2 = downloadContractSummaryParcel.f100942b;
        long j2 = downloadContractSummaryParcel.f100943c;
        String str3 = downloadContractSummaryParcel.d;
        if (str2 != null) {
            A1(new h0(this, str2, str, str3, j2, null), new yi5.b(i));
            return;
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanPhoneNumberCheckoutScreenModel", "Can't download phone number checkout contract summary, phoneNumberId is null", null, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
