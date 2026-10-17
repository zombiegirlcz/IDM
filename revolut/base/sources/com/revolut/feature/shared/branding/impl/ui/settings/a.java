package com.revolut.feature.shared.branding.impl.ui.settings;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import e60.s;
import et6.r0;
import et6.t0;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mra.d;
import nii.y0;
import nii.z;
import oki.h;
import s42.f;
import s65.r;
import s6d.i;
import s6d.j;
import s6d.l;
import s6d.n;
import s6d.w;
import yi5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements l {
    public final t0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f86078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e60.a f86079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f86080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l6d.a f86081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x80.a f86082t;
    public final r0 u;
    public final s6d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BrandingSharedDestination.InputData f86083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f86084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f86085y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(t0 brandingSharedInteractor, n60.a keyboardControllerExtension, e60.a mediaPickerControllerExtension, w stateMapper, l6d.a brandingPreviewUrlProvider, x80.a packageNameProvider, r0 brandingNavigationProvider, s6d.a brandingMenuItemsFactory, BrandingSharedDestination.InputData inputData, mc4.h colorMapper) {
        Intrinsics.checkNotNullParameter(brandingSharedInteractor, "brandingSharedInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(brandingPreviewUrlProvider, "brandingPreviewUrlProvider");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(brandingNavigationProvider, "brandingNavigationProvider");
        Intrinsics.checkNotNullParameter(brandingMenuItemsFactory, "brandingMenuItemsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.o = brandingSharedInteractor;
        this.f86078p = keyboardControllerExtension;
        this.f86079q = mediaPickerControllerExtension;
        this.f86080r = stateMapper;
        this.f86081s = brandingPreviewUrlProvider;
        this.f86082t = packageNameProvider;
        this.u = brandingNavigationProvider;
        this.v = brandingMenuItemsFactory;
        this.f86083w = inputData;
        n.Companion.getClass();
        List list = i.f260239b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(colorMapper.a(((Number) it8.next()).intValue()));
        }
        this.f86084x = arrayList;
        this.o.getClass();
        this.f86085y = d.b(this, new j(new Data(null, null, true, 3, null), false, f0.f322471a, null, null, ""), this.f86080r, null, false, 12);
        this.z = e.a(this, new f(this, 8));
    }

    public static final void I2(a aVar) {
        aVar.getClass();
        aVar.X1(new y0("VERIFICATION_FAILED_ID", new z(new TextLocalisedClause(R$string.merchant_profile_branding_image_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.merchant_profile_branding_image_verification_failed_subtitle, null, null, 14), new TextLocalisedClause(R$string.merchant_profile_branding_common_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new s64.a(this, continuation, 3), new b(26));
        yji.l.a1(this, rd0.e.b(((s) this.f86079q).f122868g), null, null, new s6d.s(this, continuation, 2), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void J2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        y yVar = this.f86085y;
        switch (iHashCode) {
            case -927118475:
                if (id10.equals("COLOR_CUSTOM_ITEM_ID")) {
                    H2(yVar, new r(7));
                    return;
                }
                break;
            case -220027209:
                if (id10.equals("BRANDING_MENU_ID")) {
                    h.v2(this.z, BrandingSettingsScreenContract$ModalStep.MenuItems.f86076a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return;
                }
                break;
            case -120589769:
                if (id10.equals("BUSINESS_DETAILS_ID")) {
                    this.u.getClass();
                    return;
                }
                break;
            case 1399473338:
                if (id10.equals("ASSETS_FOOTER_CLICK_ID")) {
                    this.o.getClass();
                    C1(new ExternalDestination.Browser("https://www.revolut.com/legal/payment-terms-paylinks/", null));
                    return;
                }
                break;
        }
        if (a0.H(id10, "COLOR_ITEM_ID", false)) {
            this.f86078p.Q();
            H2(yVar, new ib6.j(obj2, 25));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void K1() {
        s1();
    }

    public final void K2() {
        X1(new y0("VERIFICATION_FAILED_ID", new z(new TextLocalisedClause(R$string.merchant_profile_branding_image_invalid_format_title, null, null, 14), new TextLocalisedClause(R$string.merchant_profile_branding_image_invalid_format_subtitle, null, null, 14), new TextLocalisedClause(R$string.merchant_profile_branding_common_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
    }

    @Override // cli.z
    public final g getState() {
        return this.f86085y;
    }
}
