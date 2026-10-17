package com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.api.model.EsimTermsConsent;
import eed.l;
import fhj.k;
import ip0.iq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnj.a f100946a;

    public a(ghj.a termsByAssetTypeExtractor, wnj.a esimDescriptorApplier) {
        Intrinsics.checkNotNullParameter(termsByAssetTypeExtractor, "termsByAssetTypeExtractor");
        Intrinsics.checkNotNullParameter(esimDescriptorApplier, "esimDescriptorApplier");
        this.f100946a = esimDescriptorApplier;
    }

    public final Clause a(EsimTerms esimTerms, String mobilePlanId, String str, PaymentMethod.Pocket pocket, EsimDataPlanOfferInfo esimDataPlanOfferInfo) {
        Intrinsics.checkNotNullParameter(esimTerms, "esimTerms");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        EsimHyperText esimHyperTextA = ghj.a.a(esimTerms, pocket);
        String str2 = esimTerms.f;
        long j2 = esimTerms.e;
        return this.f100946a.a(esimHyperTextA.f100276a, esimHyperTextA.f100277b, null, new l(j2, esimDataPlanOfferInfo, mobilePlanId, str, str2));
    }

    public final Clause b(EsimTerms esimTerms, EsimTermsConsent esimTermsConsent, String mobilePlanId, String str, EsimDataPlanOfferInfo esimDataPlanOfferInfo) {
        Intrinsics.checkNotNullParameter(esimTerms, "esimTerms");
        Intrinsics.checkNotNullParameter(esimTermsConsent, "esimTermsConsent");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        EsimHyperText esimHyperText = esimTermsConsent.f100530a;
        String str2 = esimTerms.f;
        long j2 = esimTerms.e;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        return this.f100946a.a(esimHyperText.f100276a, esimHyperText.f100277b, numValueOf, new l(j2, esimDataPlanOfferInfo, mobilePlanId, str, str2));
    }

    public final InputChecklistDelegate.Model c(EsimHyperText content, boolean z, String listId) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new InputChecklistDelegate.Model(listId, wnj.a.d(this.f100946a, content.f100276a, content.f100277b, Integer.valueOf(R$attr.uikit_colorGreyTone50), 8), z, true, new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, null, content.f100276a, null, 0, 0, 0, 523968);
    }
}
