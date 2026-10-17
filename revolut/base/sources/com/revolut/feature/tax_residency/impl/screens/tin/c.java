package com.revolut.feature.tax_residency.impl.screens.tin;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0m.f;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import jki.g;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import roe.h;
import roe.i;
import roe.k;
import rp0.t;
import rp0.y;
import skm.a2;
import zh9.u0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaxNumberInputScreenContract$InputData f90134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yme.a f90135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tme.b f90136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f90137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f90138t;
    public final zzl.b u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f90139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f90140x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaxNumberInputScreenContract$InputData inputData, yme.a taxResidencyInteractor, tme.b taxResidencyDialogProvider, mre.c termsNavigationFactory, j60.a bottomExpandableDialog, zzl.b regexMatcher, gte.a featureToggleInteractor, f postcodeValidator, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyDialogProvider, "taxResidencyDialogProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(postcodeValidator, "postcodeValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f90134p = inputData;
        this.f90135q = taxResidencyInteractor;
        this.f90136r = taxResidencyDialogProvider;
        this.f90137s = termsNavigationFactory;
        this.f90138t = bottomExpandableDialog;
        this.u = regexMatcher;
        this.v = postcodeValidator;
        String str = inputData.f90126h;
        TaxNumberInputScreenContract$DomainDataItem.UserName userName = str != null ? new TaxNumberInputScreenContract$DomainDataItem.UserName(str, true, false) : null;
        String str2 = inputData.i;
        TaxNumberInputScreenContract$DomainDataItem.Tin tin = new TaxNumberInputScreenContract$DomainDataItem.Tin(str2, str2, false, false, true);
        String str3 = inputData.f90127j;
        TaxNumberInputScreenContract$DomainDataItem.Postcode postcode = str3 != null ? new TaxNumberInputScreenContract$DomainDataItem.Postcode(str3, false, false) : null;
        List list = inputData.k;
        this.f90140x = new a(userName, tin, postcode, list != null ? new TaxNumberInputScreenContract$DomainDataItem.TaxRegime("", list, false, false) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(com.revolut.feature.tax_residency.impl.screens.tin.c r5, java.lang.String r6, gim.c r7) {
        /*
            com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData r0 = r5.f90134p
            boolean r1 = r7 instanceof roe.m
            if (r1 == 0) goto L15
            r1 = r7
            roe.m r1 = (roe.m) r1
            int r2 = r1.f255990w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f255990w = r2
            goto L1a
        L15:
            roe.m r1 = new roe.m
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f255990w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)
            goto L7b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            zzl.b r7 = r5.u
            zme.l r3 = r0.f90123b
            zme.g r3 = r3.a()
            java.lang.String r3 = r3.f323489h
            zzl.c r7 = (zzl.c) r7
            boolean r7 = r7.a(r3, r6)
            if (r7 == 0) goto L84
            zme.l r7 = r0.f90123b
            zme.g r0 = r7.d
            if (r0 == 0) goto L51
            boolean r0 = r0.f323492m
            if (r0 != 0) goto L51
            goto L85
        L51:
            yme.a r5 = r5.f90135q
            zme.m r0 = new zme.m
            wi0.b r3 = r7.f323500a
            zme.g r7 = r7.a()
            java.lang.String r7 = r7.f
            r0.<init>(r7, r6, r3)
            hoe.a r5 = (hoe.a) r5
            r5.getClass()
            java.lang.String r6 = "taxValidationInput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            joe.b r5 = r5.f154277a
            joe.o r5 = (joe.o) r5
            efm.d0 r5 = r5.b(r0)
            r1.f255990w = r4
            java.lang.Object r7 = nim.a.b(r5, r1)
            if (r7 != r2) goto L7b
            return r2
        L7b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 == 0) goto L84
            goto L85
        L84:
            r4 = 0
        L85:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tax_residency.impl.screens.tin.c.y2(com.revolut.feature.tax_residency.impl.screens.tin.c, java.lang.String, gim.c):java.lang.Object");
    }

    public final void A2() {
        TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = this.f90134p;
        zme.g document = taxNumberInputScreenContract$InputData.f90123b.a();
        String str = document.f323487c;
        if (document.f323486b == zme.b.DISCLOSURE_OPTIONAL) {
            v2(new h(new zme.f(taxNumberInputScreenContract$InputData.f90123b.f323500a, null, null, false, null, null, 62)));
            return;
        }
        if (taxNumberInputScreenContract$InputData.f90125g) {
            v2(i.f255984a);
            return;
        }
        boolean z = taxNumberInputScreenContract$InputData.f90124c;
        tme.b bVar = this.f90136r;
        j60.a aVar = this.f90138t;
        if (z && com.bumptech.glide.d.x(taxNumberInputScreenContract$InputData.f90122a)) {
            ((dpe.a) bVar).getClass();
            Intrinsics.checkNotNullParameter(document, "document");
            t tVar = new t(new TextLocalisedClause(R$string.tax_residency_enter_value_skip_nra_title, u.c(u0.p(document)), null, 12), new TextLocalisedClause(R$string.tax_residency_enter_value_skip_nra_description, v.k(str, new TextLocalisedClause(R$string.tax_residency_enter_value_skip_nra_description_link, null, new Click(30, (Integer) null, (Object) null, "UNAVAILABLE_FEATURES_CLICK_ID", false), 10)), null, 12), null, 28);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SKIP_TIN_LARGE_BUTTON_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_continue, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("SKIP_TIN_LARGE_BUTTON_SECONDARY", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            aVar.x(new y(v.k(model, model2), tVar, null, null, null, null, 1020));
            return;
        }
        ((dpe.a) bVar).getClass();
        Intrinsics.checkNotNullParameter(document, "document");
        String str2 = null;
        AnimatedResourceImage animatedResourceImage = null;
        AnimatedResourceImage animatedResourceImage2 = null;
        aVar.x(new y(u.c(new um0("SKIP_TIN_TWIN_HORIZONTAL_BUTTON_LIST_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, str2, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage2, new TextLocalisedClause(R.string.common_action_continue, null, null, 14), false, str2, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.tax_residency_enter_value_skip_title, u.c(u0.p(document)), null, 12), new TextLocalisedClause(R$string.tax_residency_enter_value_skip_description, u.c(str), null, 12), null, 28), null, null, null, null, 1020));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f90140x;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void z2(InputTextDelegate.TextData textData) {
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        if (!Intrinsics.f(str, "POSTCODE_LIST_ID")) {
            if (Intrinsics.f(str, "REGIMES_LIST_ID")) {
                x2(new a31.i(charSequence.toString(), !d0.W(r5), 11));
                return;
            }
            return;
        }
        String postcode = charSequence.toString();
        wi0.b countryCode = this.f90134p.f90123b.f323500a;
        f fVar = this.v;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String str2 = (String) fVar.f121748b.get(countryCode);
        x2(new a31.i(postcode, str2 != null ? ((zzl.c) fVar.f121747a).a(str2, postcode) : true, 10));
    }
}
