package chj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.EsimRestrictedException;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.CheckoutErrorDialogPayload;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.CheckoutSuccessDialogResult;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.extensions.EsimRevPayScaAbandonedException;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.extensions.EsimRevPayScaFailedException;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.extensions.EsimRevPayScaTimeoutException;
import dej.c;
import dej.r1;
import dfj.t3;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.u1;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 extends c0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sf0.h f24308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a f24309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t3 f24310n;
    public final ugc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pjj.b f24311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f24312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f24313r;

    public u0(sf0.h serverErrorParser, com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a dialogBuilder, t3 purchaseInteractor, ugc.a giftRecipientNameResolver, pjj.b planChangeDialogBuilder, q revPayPaymentProcessor) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(dialogBuilder, "dialogBuilder");
        Intrinsics.checkNotNullParameter(purchaseInteractor, "purchaseInteractor");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        Intrinsics.checkNotNullParameter(planChangeDialogBuilder, "planChangeDialogBuilder");
        Intrinsics.checkNotNullParameter(revPayPaymentProcessor, "revPayPaymentProcessor");
        this.f24308l = serverErrorParser;
        this.f24309m = dialogBuilder;
        this.f24310n = purchaseInteractor;
        this.o = giftRecipientNameResolver;
        this.f24311p = planChangeDialogBuilder;
        this.f24312q = revPayPaymentProcessor;
        this.f24313r = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    public static final nii.w g3(u0 u0Var, Throwable th10) {
        ServerErrorParams serverErrorParams;
        com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a aVar = u0Var.f24309m;
        ServerError serverErrorA = u0Var.f24308l.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        dj0.d lackingMoney = (serverErrorA == null || (serverErrorParams = serverErrorA.f51364c) == null) ? null : serverErrorParams.f51370a;
        if ((th10 instanceof EsimRestrictedException) || (th10 instanceof EsimRevPayScaAbandonedException)) {
            return null;
        }
        if (th10 instanceof EsimRevPayScaTimeoutException) {
            aVar.getClass();
            return com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a.a();
        }
        if (th10 instanceof EsimRevPayScaFailedException) {
            Clause clause = ((EsimRevPayScaFailedException) th10).f100938a;
            if (clause != null) {
                return new nii.z(clause, null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            }
            aVar.getClass();
            return com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a.a();
        }
        if (numValueOf != null && numValueOf.intValue() == 1006 && lackingMoney != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
            return new nii.z(new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_subtitle, zhm.u.c(new MoneyClause(lackingMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_top_up_button, null, null, 14), null, null, new CheckoutErrorDialogPayload.InsufficientFunds(lackingMoney), false, null, null, null, null, null, null, 32628);
        }
        if (numValueOf != null && numValueOf.intValue() == 12400030) {
            aVar.getClass();
            return new nii.z(new TextLocalisedClause(R$string.esim_statement_price_change_title, null, null, 14), new TextLocalisedClause(R$string.esim_statement_price_change_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_statement_price_change_action, null, null, 14), null, null, CheckoutErrorDialogPayload.PriceChanged.f100930a, false, null, null, null, null, null, null, 32628);
        }
        if (numValueOf != null && numValueOf.intValue() == 12400032) {
            aVar.getClass();
            return new nii.z(new TextLocalisedClause(R$string.esim_mobile_plans_checkout_error_phone_number_expired_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_checkout_error_phone_number_expired_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_checkout_error_phone_number_expired_cta, null, null, 14), null, null, CheckoutErrorDialogPayload.PhoneNumberNoLongerAvailable.f100929a, false, null, null, null, null, null, null, 32628);
        }
        if (tj0.a.a(th10)) {
            aVar.getClass();
            return new nii.e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020);
        }
        if (numValueOf != null && numValueOf.intValue() == 9401) {
            return null;
        }
        aVar.getClass();
        return com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a.a();
    }

    public static final nii.j0 h3(u0 u0Var, String subscriptionId, EsimProfile esimProfile, EsimDataPlanOfferInfo esimDataPlanOfferInfo, l71.d dVar, dej.m mVar, String str, boolean z, EsimGiftRecipient esimGiftRecipient, dej.c cVar) {
        com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a aVar = u0Var.f24309m;
        if (esimDataPlanOfferInfo != null) {
            return aVar.c(esimProfile, aVar.d, null);
        }
        if (mVar != dej.m.MOBILE_PLAN) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            return esimGiftRecipient != null ? com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a.b(esimProfile, esimGiftRecipient.d) : aVar.c(esimProfile, aVar.f100937c, dVar);
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        if (esimGiftRecipient != null && str != null && z) {
            return new nii.j0((Clause) new TextLocalisedClause(R$string.esim_checkout_success_gifted_plan_all_set_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_checkout_success_gifted_plan_subtitle, zhm.u.c(esimGiftRecipient.d), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) new CheckoutSuccessDialogResult.PhoneNumberPorting(subscriptionId), (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4084);
        }
        if (esimGiftRecipient != null) {
            return com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a.b(esimProfile, esimGiftRecipient.d);
        }
        if (str != null && z && Intrinsics.f(cVar, c.a.f113503a)) {
            return new nii.j0((Clause) new TextLocalisedClause(R$string.esim_checkout_flexible_start_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_checkout_flexible_start_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) new CheckoutSuccessDialogResult.PhoneNumberPorting(subscriptionId), (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4084);
        }
        if (str != null && z) {
            return new nii.j0((Clause) new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_checkout_success_mobile_plan_ready_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) new CheckoutSuccessDialogResult.PhoneNumberPorting(subscriptionId), (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4084);
        }
        if ((esimProfile != null ? esimProfile.f100427h : null) != null) {
            return null;
        }
        return aVar.c(esimProfile, aVar.e, null);
    }

    public static final k0 i3(u0 u0Var, PaymentMethod paymentMethod, String str) {
        q qVar = u0Var.f24312q;
        m mVar = !((jte.d) qVar.f24291c).c(EsimApi$Toggles.EsimRevPaySca.f100182c) ? null : new m(qVar, paymentMethod, str, null);
        if (mVar == null) {
            return null;
        }
        return new k0(mVar, u0Var, null);
    }

    public static final void j3(u0 u0Var, nii.h hVar) {
        z1 z1Var = u0Var.f24313r;
        z1 z1Var2 = u0Var.f24313r;
        if (!(hVar instanceof nii.g)) {
            if (!(hVar instanceof nii.f)) {
                throw new NoWhenBranchMatchedException();
            }
            n1 n1Var = ((nii.f) hVar).f216147b;
            boolean z = n1Var instanceof l1;
            v vVar = v.f24314a;
            if (!z) {
                if (n1Var instanceof k1) {
                    if (((k1) n1Var).f216182a.a() instanceof CheckoutErrorDialogPayload.PriceChanged) {
                        z1Var2.k(vVar);
                        return;
                    }
                    return;
                } else {
                    if (!(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            if (parcelableA instanceof CheckoutErrorDialogPayload.InsufficientFunds) {
                z1Var.k(new t(((CheckoutErrorDialogPayload.InsufficientFunds) parcelableA).f100928a));
                return;
            } else if (parcelableA instanceof CheckoutErrorDialogPayload.PriceChanged) {
                z1Var2.k(vVar);
                return;
            } else {
                if (parcelableA instanceof CheckoutErrorDialogPayload.PhoneNumberNoLongerAvailable) {
                    z1Var.k(u.f24307a);
                    return;
                }
                return;
            }
        }
        n1 n1Var2 = ((nii.g) hVar).f216153b;
        boolean z3 = n1Var2 instanceof l1;
        w wVar = w.f24315a;
        if (!z3) {
            if (!(n1Var2 instanceof k1)) {
                if (!(n1Var2 instanceof j1) && !(n1Var2 instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            Parcelable parcelableA2 = ((k1) n1Var2).f216182a.a();
            CheckoutSuccessDialogResult checkoutSuccessDialogResult = parcelableA2 instanceof CheckoutSuccessDialogResult ? (CheckoutSuccessDialogResult) parcelableA2 : null;
            if (checkoutSuccessDialogResult == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Can't handle subscription purchase result");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, illegalStateException, h0Var);
                return;
            }
            if (checkoutSuccessDialogResult instanceof CheckoutSuccessDialogResult.PhoneNumberPorting) {
                z1Var2.k(new s(((CheckoutSuccessDialogResult.PhoneNumberPorting) checkoutSuccessDialogResult).f100933a));
                return;
            } else {
                z1Var2.k(wVar);
                return;
            }
        }
        Parcelable parcelableA3 = ((l1) n1Var2).f216190a.a();
        CheckoutSuccessDialogResult checkoutSuccessDialogResult2 = parcelableA3 instanceof CheckoutSuccessDialogResult ? (CheckoutSuccessDialogResult) parcelableA3 : null;
        if (checkoutSuccessDialogResult2 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Can't handle subscription purchase result");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, illegalStateException2, h0Var2);
            return;
        }
        if (checkoutSuccessDialogResult2 instanceof CheckoutSuccessDialogResult.InstallationAvailable) {
            z1Var.k(new a0(((CheckoutSuccessDialogResult.InstallationAvailable) checkoutSuccessDialogResult2).f100931a));
            return;
        }
        if (checkoutSuccessDialogResult2 instanceof CheckoutSuccessDialogResult.InstallationUnavailable) {
            z1Var2.k(wVar);
        } else if (checkoutSuccessDialogResult2 instanceof CheckoutSuccessDialogResult.ShareEsim) {
            z1Var.k(new y(((CheckoutSuccessDialogResult.ShareEsim) checkoutSuccessDialogResult2).f100934a));
        } else {
            if (!(checkoutSuccessDialogResult2 instanceof CheckoutSuccessDialogResult.PhoneNumberPorting)) {
                throw new NoWhenBranchMatchedException();
            }
            z1Var2.k(new s(((CheckoutSuccessDialogResult.PhoneNumberPorting) checkoutSuccessDialogResult2).f100933a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k3(chj.u0 r16, java.time.Instant r17, java.lang.String r18, java.lang.String r19, dej.r1 r20, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket r21, dj0.d r22, com.revolut.retail.feature.esim.api.model.EsimContractMetadata r23, boolean r24, java.lang.String r25, gim.c r26) {
        /*
            r1 = r16
            r0 = r26
            r1.getClass()
            boolean r2 = r0 instanceof chj.l0
            if (r2 == 0) goto L1b
            r2 = r0
            chj.l0 r2 = (chj.l0) r2
            int r3 = r2.f24269w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f24269w = r3
        L19:
            r12 = r2
            goto L21
        L1b:
            chj.l0 r2 = new chj.l0
            r2.<init>(r1, r0)
            goto L19
        L21:
            java.lang.Object r0 = r12.u
            fim.a r13 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.f24269w
            r14 = 1
            if (r2 == 0) goto L38
            if (r2 != r14) goto L30
            yhm.o.b(r0)
            goto L62
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            yhm.o.b(r0)
            tji.f r15 = r1.q2()
            chj.j0 r0 = new chj.j0
            r11 = 0
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r10 = r21
            r6 = r22
            r8 = r23
            r7 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f24269w = r14
            java.lang.String r2 = "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG"
            java.lang.Object r0 = zh9.u0.b0(r15, r2, r0, r12)
            if (r0 != r13) goto L62
            return r13
        L62:
            dej.b3 r0 = (dej.b3) r0
            vkm.z1 r1 = r1.f24313r
            chj.z r2 = new chj.z
            r3 = 0
            r4 = 0
            r2.<init>(r4, r3)
            r1.k(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.u0.k3(chj.u0, java.time.Instant, java.lang.String, java.lang.String, dej.r1, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket, dj0.d, com.revolut.retail.feature.esim.api.model.EsimContractMetadata, boolean, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l3(chj.u0 r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod r26, java.lang.String r27, java.lang.String r28, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo r29, boolean r30, dej.j1 r31, java.lang.Boolean r32, dj0.d r33, java.lang.String r34, java.lang.Long r35, java.lang.String r36, dej.c r37, java.lang.String r38, gim.c r39) {
        /*
            r1 = r22
            r0 = r39
            boolean r2 = r0 instanceof chj.m0
            if (r2 == 0) goto L18
            r2 = r0
            chj.m0 r2 = (chj.m0) r2
            int r3 = r2.f24274x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f24274x = r3
        L16:
            r0 = r2
            goto L1e
        L18:
            chj.m0 r2 = new chj.m0
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r2 = r0.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.f24274x
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            java.lang.String r0 = r0.u
            yhm.o.b(r2)
            r15 = r0
            r0 = r2
            r2 = r5
            goto L83
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            yhm.o.b(r2)
            tji.f r2 = r1.q2()
            r4 = r0
            chj.n0 r0 = new chj.n0
            r18 = 0
            r5 = r24
            r6 = r25
            r7 = r27
            r10 = r28
            r8 = r29
            r11 = r30
            r9 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r21 = r2
            r20 = r3
            r19 = r4
            r4 = r23
            r2 = r26
            r3 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r19
            r4.u = r15
            r2 = 1
            r4.f24274x = r2
            java.lang.String r3 = "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG"
            r5 = r21
            java.lang.Object r0 = zh9.u0.b0(r5, r3, r0, r4)
            r3 = r20
            if (r0 != r3) goto L83
            return r3
        L83:
            dej.b3 r0 = (dej.b3) r0
            vkm.z1 r1 = r1.f24313r
            chj.z r3 = new chj.z
            com.revolut.retail.feature.esim.api.model.EsimProfile r4 = r0.f113499b
            if (r15 == 0) goto L8f
            r5 = r2
            goto L90
        L8f:
            r5 = 0
        L90:
            r3.<init>(r4, r5)
            r1.k(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.u0.l3(chj.u0, java.lang.String, java.lang.String, java.lang.String, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod, java.lang.String, java.lang.String, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo, boolean, dej.j1, java.lang.Boolean, dj0.d, java.lang.String, java.lang.Long, java.lang.String, dej.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3(chj.u0 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod r20, dj0.d r21, dej.j1 r22, java.lang.Boolean r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, gim.c r27) {
        /*
            r1 = r16
            r0 = r27
            r1.getClass()
            boolean r2 = r0 instanceof chj.o0
            if (r2 == 0) goto L1b
            r2 = r0
            chj.o0 r2 = (chj.o0) r2
            int r3 = r2.f24282w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f24282w = r3
        L19:
            r13 = r2
            goto L21
        L1b:
            chj.o0 r2 = new chj.o0
            r2.<init>(r1, r0)
            goto L19
        L21:
            java.lang.Object r0 = r13.u
            fim.a r14 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.f24282w
            r15 = 1
            if (r2 == 0) goto L38
            if (r2 != r15) goto L30
            yhm.o.b(r0)
            goto L6a
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            yhm.o.b(r0)
            tji.f r0 = r1.q2()
            r2 = r0
            chj.p0 r0 = new chj.p0
            r12 = 0
            r7 = r17
            r8 = r18
            r9 = r19
            r4 = r21
            r3 = r22
            r5 = r23
            r10 = r24
            r6 = r25
            r11 = r26
            r27 = r14
            r14 = r2
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f24282w = r15
            java.lang.String r2 = "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG"
            java.lang.Object r0 = zh9.u0.b0(r14, r2, r0, r13)
            r2 = r27
            if (r0 != r2) goto L6a
            return r2
        L6a:
            dej.b3 r0 = (dej.b3) r0
            vkm.z1 r1 = r1.f24313r
            chj.z r2 = new chj.z
            com.revolut.retail.feature.esim.api.model.EsimProfile r3 = r0.f113499b
            r4 = 0
            r2.<init>(r3, r4)
            r1.k(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.u0.m3(chj.u0, java.lang.String, java.lang.String, java.lang.String, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod, dj0.d, dej.j1, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, gim.c):java.lang.Object");
    }

    public static nii.c0 n3(boolean z) {
        return new nii.c0(new TextLocalisedClause(R$string.esim_checkout_progress_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_progress_subtitle, null, null, 14), null, z, null, false, false, null, 1900);
    }

    @Override // chj.c0
    public final void Z2(String dataPlanId, String idempotencyKey, EsimDataPlanOfferInfo esimDataPlanOfferInfo, EsimContractMetadata esimContractMetadata, l71.d dVar) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        T2(new s0(this, esimDataPlanOfferInfo, dVar, null, null, null, null, null, null, null, null, dataPlanId, idempotencyKey, false, null, null, null, esimContractMetadata != null ? esimContractMetadata.f100202a : null, esimContractMetadata != null ? esimContractMetadata.f100203b : null, null), new yi5.b(27));
    }

    @Override // chj.c0
    public final void b3(dej.k request, EsimDataPlan newPlan) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(newPlan, "newPlan");
        T2(new c34.d(this, newPlan, request, (Continuation) null, 18), new yi5.b(27));
    }

    @Override // chj.c0
    public final void c3(Instant instant, String subscriptionId, String mobilePlanId, boolean z, r1 r1Var, dj0.d price, EsimContractMetadata esimContractMetadata, dej.e eVar, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        T2(new bf2.b(this, eVar, instant, r1Var, mobilePlanId, subscriptionId, price, esimContractMetadata, z, idempotencyKey, (Continuation) null), new yi5.b(27));
    }

    @Override // chj.c0
    public final Flow d3() {
        return this.f24313r;
    }

    @Override // chj.c0
    public final void e3(String str, r1 r1Var, String dataPlanId, String idempotencyKey, EsimDataPlanOfferInfo esimDataPlanOfferInfo, dej.m mVar, boolean z, dej.j1 j1Var, Boolean bool, dj0.d dVar, EsimContractMetadata esimContractMetadata, l71.d dVar2, String str2, dej.c cVar, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        T2(new s0(this, esimDataPlanOfferInfo, dVar2, mVar, str2, esimGiftRecipient, cVar, str, r1Var.f113637a, r1Var.f113638b, r1Var.f113639c, dataPlanId, idempotencyKey, z, j1Var, bool, dVar, esimContractMetadata.f100202a, esimContractMetadata.f100203b, null), new yi5.b(27));
    }

    @Override // chj.c0
    public final void f3(String subscriptionId, r1 r1Var, dj0.d dVar, dej.j1 j1Var, Boolean bool, EsimContractMetadata esimContractMetadata, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        String str = r1Var.f113637a;
        String str2 = r1Var.f113638b;
        T2(new t0(this, r1Var.f113639c, j1Var, dVar, bool, esimContractMetadata.f100203b, subscriptionId, str, str2, esimContractMetadata.f100202a, idempotencyKey, null), new yi5.b(27));
    }
}
