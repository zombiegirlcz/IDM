package soc;

import android.content.Context;
import android.text.InputFilter;
import aw0.o9;
import aw0.r2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.n;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.tracking.v3.SettingsThemingContext;
import grl.zb;
import ip0.b9;
import ip0.jm0;
import ip0.ql;
import ip0.uq;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ms0.e4;
import ms0.h4;
import mx0.r4;
import mx0.s4;
import nel.s0;
import od0.i;
import org.jmrtd.lds.LDSFile;
import qrb.p;
import ueg.h0;
import um2.i0;
import um2.j0;
import vf0.x;
import wff.t;
import xjg.j;
import xjg.k;
import xjg.m;
import y66.s;
import ybh.z;
import yr5.q;
import yrb.a0;
import yrb.b0;
import yy0.l;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f264815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f264816c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj2, int i, Object obj3, Object obj4) {
        this.f264814a = i;
        this.f264815b = obj2;
        this.f264816c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9 */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        jo0.e eVar;
        SettingsThemingContext settingsThemingContext;
        TextLocalisedClause textLocalisedClause;
        String f94454a;
        Image colorImage;
        InactiveCircleBadge inactiveCircleBadge;
        int i;
        ?? r142;
        InactiveCircleBadge inactiveCircleBadge2;
        LayeredImage layeredImageF;
        ThemeCustomisationContract$Page themeCustomisationContract$Page = (ThemeCustomisationContract$Page) this.f264815b;
        j0 j0Var = (j0) this.f264816c;
        um2.a aVar = (um2.a) this.d;
        ThemeCustomisationContract$ThemeInfo themeInfo = (ThemeCustomisationContract$ThemeInfo) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        int i2 = i0.f281201a[themeCustomisationContract$Page.ordinal()];
        int i3 = 3;
        boolean z = false;
        int i5 = -1;
        int i6 = 2;
        Clause clause = null;
        boolean z3 = true;
        if (i2 == 1) {
            AnimationRequest preselectionAnimationRequest = aVar.f281180g;
            Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
            Intrinsics.checkNotNullParameter(preselectionAnimationRequest, "preselectionAnimationRequest");
            AppTheme appTheme = themeInfo.f63778a;
            m d = appTheme.f94561a.getD();
            m mVar = d == null ? appTheme.f94562b : d;
            List list = themeInfo.f;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            int i21 = 0;
            for (Object obj5 : list) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    v.s();
                    throw null;
                }
                m mVar2 = (m) obj5;
                boolean z4 = mVar == mVar2;
                if (z4) {
                    i5 = i21;
                }
                String strName = mVar2.name();
                int[] iArr = xm2.d.f307070a;
                int i32 = iArr[mVar2.ordinal()];
                if (i32 == 1) {
                    eVar = jo0.e.SYSTEM;
                } else if (i32 == i6) {
                    eVar = jo0.e.NIGHT;
                } else {
                    if (i32 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = jo0.e.DAY;
                }
                LayeredImage layeredImage = new LayeredImage(u.c(new LayeredImage.Layer.Drawable(eVar.a(), (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_CROP, 62)), (Float) null, (Float) null, 14);
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                int i33 = iArr[mVar2.ordinal()];
                if (i33 == 1) {
                    SettingsThemingContext.a aVarNewBuilder = SettingsThemingContext.newBuilder();
                    zb zbVar = zb.System;
                    aVarNewBuilder.c();
                    ((SettingsThemingContext) aVarNewBuilder.f49761b).setAppThemeMode(zbVar);
                    settingsThemingContext = (SettingsThemingContext) aVarNewBuilder.a();
                } else if (i33 == i6) {
                    SettingsThemingContext.a aVarNewBuilder2 = SettingsThemingContext.newBuilder();
                    aVarNewBuilder2.h(true);
                    zb zbVar2 = zb.Dark;
                    aVarNewBuilder2.c();
                    ((SettingsThemingContext) aVarNewBuilder2.f49761b).setAppThemeMode(zbVar2);
                    settingsThemingContext = (SettingsThemingContext) aVarNewBuilder2.a();
                } else {
                    if (i33 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SettingsThemingContext.a aVarNewBuilder3 = SettingsThemingContext.newBuilder();
                    aVarNewBuilder3.h(false);
                    zb zbVar3 = zb.Light;
                    aVarNewBuilder3.c();
                    ((SettingsThemingContext) aVarNewBuilder3.f49761b).setAppThemeMode(zbVar3);
                    settingsThemingContext = (SettingsThemingContext) aVarNewBuilder3.a();
                }
                companion.getClass();
                w0 w0VarA = AnalyticsContext.Companion.a(settingsThemingContext);
                int i43 = iArr[mVar2.ordinal()];
                if (i43 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.background_picker_theme_mode_system, null, null, 14);
                } else if (i43 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.background_picker_theme_mode_dark, null, null, 14);
                } else {
                    if (i43 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.background_picker_theme_mode_light, null, null, 14);
                }
                arrayList.add(new IconSelectorDelegate.SelectableIconModel(strName, layeredImage, z4, textLocalisedClause, null, d == null, null, R$attr.uikit_colorGreyTone20, false, mVar2, new AnalyticsContext(w0VarA), 848));
                i21 = i22;
                i3 = 3;
                i6 = 2;
            }
            return new um2.m(new s4(arrayList, new r4(i5, preselectionAnimationRequest)), d != null ? new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_theme_customisation_theme_mode_blocked_note, u.c(appTheme.f94561a.getF94526a()), null, 12) : null);
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            xm2.a aVar2 = j0Var.f281202a;
            AnimationRequest preselectionAnimationRequest2 = aVar.f281180g;
            Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
            Intrinsics.checkNotNullParameter(preselectionAnimationRequest2, "preselectionAnimationRequest");
            List list2 = themeInfo.f63781g;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            int i59 = 0;
            for (Object obj6 : list2) {
                int i66 = i59 + 1;
                if (i59 < 0) {
                    v.s();
                    throw null;
                }
                ColorThemeOption colorThemeOption = (ColorThemeOption) obj6;
                j jVar = colorThemeOption.f94564a;
                boolean z6 = jVar == themeInfo.f63778a.f94563c ? true : z;
                if (z6) {
                    i5 = i59;
                }
                String strD = jVar.d();
                fkg.c cVar = aVar2.f307068a;
                ThemeCustomisationController themeCustomisationController = (ThemeCustomisationController) aVar2.f307069b.f280272b;
                ThemeCustomisationController.Companion aVar3 = ThemeCustomisationController.INSTANCE;
                Context context = themeCustomisationController.d3().f207132a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Image imageA = cVar.a(jVar, z, context);
                Clause clause2 = colorThemeOption.f94565b;
                if (colorThemeOption.f94566c != k.PREMIUM || themeInfo.d) {
                    layeredImageF = null;
                } else {
                    LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                    int i74 = R$drawable.uikit_icn_24_premium;
                    int i92 = R$attr.uikit_colorPopoverBackground;
                    layeredImageF = LayeredImage.Companion.f(companion2, i74, R$attr.uikit_colorStatusInactive, i92, Integer.valueOf(i92), 4.0f, 4.0f, null, 64);
                }
                int i96 = R$attr.uikit_colorGreyTone20;
                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                SettingsThemingContext.a aVarNewBuilder4 = SettingsThemingContext.newBuilder();
                String strA = mo3.a.a(jVar);
                aVarNewBuilder4.c();
                ((SettingsThemingContext) aVarNewBuilder4.f49761b).setAccentColor(strA);
                w0 w0VarA2 = aVarNewBuilder4.a();
                companion3.getClass();
                arrayList2.add(new IconSelectorDelegate.SelectableIconModel(strD, imageA, z6, clause2, null, false, layeredImageF, i96, false, colorThemeOption, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), 816));
                i59 = i66;
                z = false;
            }
            return new um2.m(new s4(arrayList2, new r4(i5, preselectionAnimationRequest2)), null);
        }
        AnimationRequest preselectionAnimationRequest3 = aVar.f281180g;
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        Intrinsics.checkNotNullParameter(preselectionAnimationRequest3, "preselectionAnimationRequest");
        GlobalThemeDeclaration globalThemeDeclaration = themeInfo.f63780c;
        if (globalThemeDeclaration == null || (f94454a = globalThemeDeclaration.getF94454a()) == null) {
            f94454a = themeInfo.f63778a.f94561a.getF94454a();
        }
        List list3 = themeInfo.e;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Clause clauseA = null;
        int i99 = 0;
        for (Object obj7 : list3) {
            int i100 = i99 + 1;
            if (i99 < 0) {
                v.s();
                throw null;
            }
            ThemesInteractor$Theme themesInteractor$Theme = (ThemesInteractor$Theme) obj7;
            GlobalThemeDeclaration globalThemeDeclaration2 = themesInteractor$Theme.f63800a;
            UiAssetLockState state = themesInteractor$Theme.f63801b;
            boolean zF = Intrinsics.f(globalThemeDeclaration2.getF94454a(), f94454a);
            if (zF) {
                clauseA = xm2.h.a(globalThemeDeclaration2, R$attr.uikit_colorGreyTone50);
                i5 = i99;
            }
            boolean z11 = (!globalThemeDeclaration2.getF94528c() || themeInfo.f63782h.contains(globalThemeDeclaration2.getF94454a())) ? false : z3;
            IconSelectorDelegate.SelectableIconModel.Companion companion4 = IconSelectorDelegate.SelectableIconModel.INSTANCE;
            String f94454a2 = globalThemeDeclaration2.getF94454a();
            CoverIcon i101 = globalThemeDeclaration2.getI();
            if (i101 instanceof CoverIcon.Url) {
                CoverIcon.Url url2 = (CoverIcon.Url) i101;
                String str = url2.f94465a;
                String str2 = url2.f94466b;
                colorImage = new UrlImage(str, str2 == null ? str : str2, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507900);
            } else {
                if (!(i101 instanceof CoverIcon.Transparent)) {
                    throw new NoWhenBranchMatchedException();
                }
                colorImage = new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGroupedBackground), clause);
            }
            boolean z12 = globalThemeDeclaration2.getI() instanceof CoverIcon.Transparent;
            Clause f94499a = globalThemeDeclaration2.getF94526a();
            boolean z29 = state instanceof UiAssetLockState.Locked;
            if (z29) {
                UiAssetLockReason uiAssetLockReason = ((UiAssetLockState.Locked) state).f63806a;
                if (uiAssetLockReason instanceof UiAssetLockReason.Challenge) {
                    inactiveCircleBadge2 = new InactiveCircleBadge(dw0.a.Locked);
                } else {
                    if (!(uiAssetLockReason instanceof UiAssetLockReason.Plan)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inactiveCircleBadge2 = new InactiveCircleBadge(dw0.a.Premium);
                }
                inactiveCircleBadge = inactiveCircleBadge2;
            } else {
                inactiveCircleBadge = null;
            }
            int i102 = R$attr.uikit_colorGreyTone20;
            AnalyticsContext.Companion companion5 = AnalyticsContext.INSTANCE;
            SettingsThemingContext.a aVarNewBuilder5 = SettingsThemingContext.newBuilder();
            String f94454a3 = globalThemeDeclaration2.getF94454a();
            aVarNewBuilder5.c();
            String str3 = f94454a;
            ((SettingsThemingContext) aVarNewBuilder5.f49761b).setAppTheme(f94454a3);
            w0 w0VarA3 = aVarNewBuilder5.a();
            companion5.getClass();
            w0 w0VarA4 = AnalyticsContext.Companion.a(w0VarA3);
            Clause label = globalThemeDeclaration2.getF94526a();
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(state, "state");
            aim.e eVarB = u.b();
            eVarB.add(label);
            if (z29) {
                i = 14;
                r142 = 0;
                eVarB.add(new TextLocalisedClause(com.revolut.core.ui_kit.R$string.theme_customisation_selector_value_locked, null, null, 14));
            } else {
                i = 14;
                r142 = 0;
            }
            if (z11) {
                eVarB.add(new TextLocalisedClause(com.revolut.core.ui_kit.R$string.theme_customisation_selector_value_featured, r142, r142, i));
            }
            arrayList3.add(IconSelectorDelegate.SelectableIconModel.Companion.a(companion4, f94454a2, colorImage, zF, f94499a, new CompositeClause(u.a(eVarB), new TextClause(" , ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), inactiveCircleBadge, i102, z12, z11, globalThemeDeclaration2, new AnalyticsContext(w0VarA4), 32));
            i99 = i100;
            f94454a = str3;
            clause = null;
            z3 = true;
        }
        return new um2.m(new s4(arrayList3, new r4(i5, preselectionAnimationRequest3)), clauseA);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) throws Throwable {
        boolean z;
        x88.c cVar;
        char c2;
        y88.c cVar2;
        dj0.d dVarU;
        y88.b bVar;
        Object next;
        SavingsProductData savingsProductData;
        v88.c cVar3 = (v88.c) this.f264815b;
        String str = (String) this.f264816c;
        String str2 = (String) this.d;
        x xVar = (x) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
        sf8.m mVar = (sf8.m) xVar.f288487a;
        i iVar = (i) xVar.f288488b;
        List list = (List) xVar.f288489c;
        boolean zBooleanValue = ((Boolean) xVar.d).booleanValue();
        List list2 = (List) xVar.e;
        w88.e eVar = (w88.e) xVar.f;
        wi0.b bVar2 = (wi0.b) xVar.f288490g;
        x88.c cVar4 = cVar3.f286723h;
        boolean zIsEmpty = list2.isEmpty();
        boolean z3 = !zIsEmpty;
        dj0.d dVarA = (dj0.d) iVar.f224257a;
        if (dVarA == null) {
            dVarA = mVar.a();
        }
        if (!zBooleanValue && zIsEmpty && (eVar instanceof w88.c)) {
            return ((x88.f) cVar4).b(str, mVar, u.c(new y88.a(dVarA)), str2);
        }
        if (!zBooleanValue || zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list) {
                e78.c cVar5 = (e78.c) obj5;
                if (cVar5 instanceof e78.a) {
                    z = z3;
                } else {
                    if (!(cVar5 instanceof e78.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = zBooleanValue;
                }
                if (z) {
                    arrayList.add(obj5);
                }
            }
            list = arrayList;
        }
        if (zIsEmpty || !mVar.i) {
            cVar = cVar4;
            c2 = 1;
            cVar2 = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : list) {
                if (obj6 instanceof e78.a) {
                    arrayList2.add(obj6);
                }
            }
            c2 = 1;
            if (arrayList2.isEmpty()) {
                Iterator it8 = list2.iterator();
                if (it8.hasNext()) {
                    next = it8.next();
                    if (it8.hasNext()) {
                        double d = opg.a.d((SavingsProductData) next);
                        while (true) {
                            Object next2 = it8.next();
                            cVar = cVar4;
                            double d5 = opg.a.d((SavingsProductData) next2);
                            if (Double.compare(d, d5) < 0) {
                                d = d5;
                                next = next2;
                            }
                            if (!it8.hasNext()) {
                                break;
                            }
                            cVar4 = cVar;
                        }
                    } else {
                        cVar = cVar4;
                    }
                } else {
                    cVar = cVar4;
                    next = null;
                }
                savingsProductData = (SavingsProductData) next;
            } else {
                savingsProductData = ((e78.a) d0.b0(arrayList2)).f123101b;
                cVar = cVar4;
            }
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((e78.a) it9.next()).f123100a);
            }
            cVar2 = new y88.c(n14.e.u(arrayList3), !arrayList2.isEmpty(), savingsProductData, bVar2);
        }
        if (zBooleanValue) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj7 : list) {
                if (obj7 instanceof e78.b) {
                    arrayList4.add(obj7);
                }
            }
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                arrayList5.add(((e78.b) it10.next()).f123102a);
            }
            dVarU = n14.e.u(arrayList5);
        } else {
            dVarU = null;
        }
        if (((mVar.i && eVar.a() == u98.a.ELIGIBLE) ? c2 : (char) 0) == 0) {
            bVar = null;
        } else if (eVar instanceof w88.a) {
            bVar = new y88.b(((w88.a) eVar).f295604b, eVar);
        } else if ((eVar instanceof w88.b) || (eVar instanceof w88.d)) {
            bVar = new y88.b(null, eVar);
        } else {
            if (!(eVar instanceof w88.c)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = null;
        }
        dj0.d[] elements = {dVarA, dVarU};
        Intrinsics.checkNotNullParameter(elements, "elements");
        y88.a aVar = new y88.a(n14.e.u(kotlin.collections.d.L(elements)));
        y88.d[] elements2 = new y88.d[3];
        elements2[0] = aVar;
        elements2[c2] = cVar2;
        elements2[2] = bVar;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return ((x88.f) cVar).b(str, mVar, kotlin.collections.d.L(elements2), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x037d A[LOOP:3: B:125:0x0377->B:127:0x037d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: soc.f.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        vy2.c cVar = (vy2.c) this.f264815b;
        com.revolut.feature.card_label.ui.screen.card_label_screen.e eVar = (com.revolut.feature.card_label.ui.screen.card_label_screen.e) this.f264816c;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.d;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
        TextClause textClause = new TextClause(cVar.f293121b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CardLabelScreenContract$InputData cardLabelScreenContract$InputData = eVar.f64772a;
        int i = cardLabelScreenContract$InputData.f64761b;
        CardLabelScreenContract$InputData.InputTextFieldConfiguration inputTextFieldConfiguration = cardLabelScreenContract$InputData.d;
        Clause clause = cVar.f293121b.length() > 0 ? inputTextFieldConfiguration.f64767b : null;
        Clause textLocalisedClause2 = inputTextFieldConfiguration.f64766a;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.card_label.api.R$string.card_label_input_hint, null, null, 14);
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("CARD_LABEL_INPUT_LIST_ID", textClause, clause, textLocalisedClause2, textLocalisedClause, null, null, true, Integer.valueOf(i), textLocalisedClause != null, true, 0, true, 0, true, true, true, v.l(cardLabelScreenContract$InputData.e ? new InputFilter.LengthFilter(cardLabelScreenContract$InputData.f64761b) : null), false, false, 0, false, false, null, 855195504, 131071);
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model, i2, 0, i2, i2, null, false, 50);
        return u.c(model);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: soc.f.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        h0 h0Var = (h0) this.f264815b;
        zfi.a aVar = (zfi.a) this.f264816c;
        weg.i iVar = (weg.i) this.d;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        zfi.c cVar = (zfi.c) pair.f186385a;
        List<zfi.e> list = (List) pair.f186386b;
        h0 h0Var2 = h0.LOADING;
        if (h0Var == h0Var2) {
            aVar = new zfi.a(0);
        }
        e4 e4Var = h0Var == h0Var2 ? e4.EnabledNonClickable : e4.EnabledClickable;
        aim.e eVarB = iVar.f296784a.b(aVar);
        aim.e eVarB2 = u.b();
        boolean zIsEmpty = eVarB.isEmpty();
        eVarB2.add(new ActionsView.Item("FILTERS_ITEM_ID", mx0.d.ON_MEDIA_STATIC, false, e4Var, null, new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_search_header_action_filters, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, !zIsEmpty ? new mx0.e(new NewBadgeContent.Dot(null, n.SMALL, 1)) : null, !zIsEmpty ? new ms0.m(false) : null, false, null, null, null, null, 31892));
        eVarB2.addAll(eVarB);
        if (list.isEmpty()) {
            ArrayList<zfi.d> arrayList = cVar.f321956a;
            ArrayList arrayList2 = new ArrayList();
            for (zfi.d dVar : arrayList) {
                zfi.b bVar = dVar.f321960a;
                zfi.n nVar = dVar.f321962c;
                ActionsView.Item itemB = iVar.b(bVar, nVar != null ? new zfi.v(nVar) : null, aVar, e4Var);
                if (itemB != null) {
                    arrayList2.add(itemB);
                }
            }
            eVarB2.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (zfi.e eVar : list) {
                ActionsView.Item itemB2 = iVar.b(eVar.f321965a, eVar.f321966b, aVar, e4Var);
                if (itemB2 != null) {
                    arrayList3.add(itemB2);
                }
            }
            eVarB2.addAll(arrayList3);
        }
        return u.a(eVarB2);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        t tVar = (t) this.f264815b;
        String str = (String) this.f264816c;
        String str2 = (String) this.d;
        Feedback content = (Feedback) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listA = tVar.f297103a.a(content, l7d.a.d(4, str, str2), bp6.a.FAQ);
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        return listA;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) this.f264815b;
        String str = (String) this.f264816c;
        uih.e eVar = (uih.e) this.d;
        TradingLegalEntityInformation content = (TradingLegalEntityInformation) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model(str, (TextLocalisedClause) function1.invoke(content.f105106a), R$attr.uikit_colorRed, false, eVar, null, null, YearClass.CLASS_2016);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        s sVar = (s) this.f264815b;
        y66.a aVar = (y66.a) this.f264816c;
        List list = (List) this.d;
        List assets = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(assets, "assets");
        if (assets.isEmpty() && zBooleanValue) {
            ArrayList arrayListA = s.a(10, "defi_assets_picker_loading_");
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            return arrayListA;
        }
        if (assets.isEmpty() && aVar.d.length() > 0) {
            return u.c(hn5.a.a(aVar.d));
        }
        List list2 = assets;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((q66.e) it8.next()).f242515a.f71671a);
        }
        Set setI1 = d0.i1(arrayList);
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((e16.g) it9.next()).f121894a.f71635a);
        }
        Set setI12 = d0.i1(arrayList2);
        ArrayList arrayListB = sVar.b(list);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : arrayListB) {
            if (setI1.contains(((e16.g) obj5).f121894a.f71635a)) {
                arrayList3.add(obj5);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            arrayList4.add(sVar.e((e16.g) it10.next()));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : list2) {
            if (!a1.l(setI12, sVar.f311206a.f71881b).contains(((q66.e) obj6).f242515a.f71671a)) {
                arrayList5.add(obj6);
            }
        }
        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
        Iterator it11 = arrayList5.iterator();
        while (it11.hasNext()) {
            arrayList6.add(sVar.d((q66.e) it11.next()));
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList4);
        eVarB.addAll(arrayList6);
        if (zBooleanValue && !assets.isEmpty()) {
            eVarB.addAll(s.a(3, "defi_more_picker_loading_"));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) this.f264815b;
        ybh.x xVar = (ybh.x) this.f264816c;
        z zVar = (z) this.d;
        tsb.f validation = (tsb.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(validation, "validation");
        return new ybh.u(bool, new ybh.t(zVar.f312369b, zVar.f312368a, xVar.f && (validation instanceof tsb.d)));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Function3 function3 = (Function3) this.f264815b;
        String str = (String) this.f264816c;
        List list = (List) this.d;
        TradingLegalEntityInformation legalEntity = (TradingLegalEntityInformation) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(legalEntity, "legalEntity");
        return u.c(function3.invoke(str, legalEntity, list));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        xi0.b bVar;
        jm0 jm0Var;
        q qVar = (q) this.f264815b;
        o9j.b bVar2 = qVar.f316150a;
        yr5.f fVar = (yr5.f) this.f264816c;
        Data data = (Data) this.d;
        qta.d plot = (qta.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(plot, "plot");
        xi0.b bVar3 = fVar.f316133b;
        if (bVar3 == null) {
            return qVar.b(fVar);
        }
        Data data2 = fVar.e;
        if (data2 == null || (bVar = (xi0.b) data2.getContent()) == null) {
            return qVar.b(fVar);
        }
        Pair pair = (Pair) d0.o0(plot.e);
        Double dValueOf = Double.valueOf(pair != null ? ((Number) pair.f186386b).doubleValue() : plot.f249051a);
        qta.f fVar2 = fVar.f316134c;
        TrendViewDelegate.a aVar = fVar.d;
        o9j.a aVar2 = o9j.b.Companion;
        p9j.a aVarD = ((u9j.e) bVar2).d(bVar3, bVar, dValueOf, fVar2, aVar, data, null, null);
        Iterator it8 = o9j.b.a(bVar2, bVar, fVar.f316134c, fVar.d, data, f0.f322471a, null, bVar3, null, null, null, null, 3840).iterator();
        while (true) {
            if (!it8.hasNext()) {
                jm0Var = null;
                break;
            }
            koi.j jVar = (koi.j) it8.next();
            jm0 jm0Var2 = jVar instanceof jm0 ? (jm0) jVar : null;
            if (jm0Var2 != null) {
                jm0Var = jm0Var2;
                break;
            }
        }
        Clause textClause = aVarD.f234323a;
        if (textClause == null) {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return q.a(qVar, fVar, new r2(textClause, q.d(fVar)), new ql(6, null, aVarD.e), yr5.s.a(fVar.f316134c), aVarD.f234325c, aVarD.d, jm0Var, 128);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        Pair pair;
        boolean z;
        b0 b0Var = (b0) this.f264815b;
        yrb.x xVar = (yrb.x) this.f264816c;
        s0 s0Var = (s0) this.d;
        qrb.k tradeInstrumentData = (qrb.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        qrb.b bVar = xVar.f316253c;
        Data data = xVar.f316258m;
        BigDecimal bigDecimal = xVar.d;
        bfl.g gVar = xVar.f316252b;
        nel.n nVarN = tradeInstrumentData.n();
        int i = a0.f316209b[bVar.ordinal()];
        if (i == 1) {
            pair = new Pair(yoj.b.a(nVarN), Integer.valueOf(nVarN.i.c()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(yoj.b.b(nVarN), Integer.valueOf(nVarN.f214602m));
        }
        Asset asset = (Asset) pair.f186385a;
        yrb.u uVar = new yrb.u(asset, ((Number) pair.f186386b).intValue(), tradeInstrumentData);
        int i2 = a0.f316208a[gVar.ordinal()];
        if (i2 == 1) {
            z = s0Var.f214618b;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = s0Var.f214619c;
        }
        boolean z3 = z;
        qrb.b bVar2 = xVar.f316253c;
        String strB = b0Var.f316210a.b(bigDecimal, asset);
        boolean z4 = xVar.f316254g;
        Data data2 = xVar.f316257l;
        nel.n nVarN2 = tradeInstrumentData.n();
        Map map = b0Var.f316212c;
        qrb.q.Companion.getClass();
        qrb.q qVarA = p.a(nVarN2);
        if (qVarA == null || !map.containsKey(qVarA)) {
            throw new IllegalStateException("No " + o0.f186429a.b(esb.a.class) + " found for instrument type " + nVarN2.f214597c);
        }
        esb.a aVar = (esb.a) r0.h(qVarA, map);
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("CENTERED_AMOUNT_LIST_ID", aVar.a(bVar2), new bw0.h(strB, aVar.c(bVar2, nVarN2), true, null, Boolean.valueOf(z4), bw0.e.None, null, z3, 15316), null, aVar.b(tradeInstrumentData, data2), aVar.d(), b9.WRAP_CONTENT, uVar, 11816);
        InputSliderDelegate.Model modelC = b0.c(z3, xVar.f, uVar);
        Map map2 = b0Var.f316211b;
        nel.n nVarN3 = tradeInstrumentData.n();
        qrb.q qVarA2 = p.a(nVarN3);
        if (qVarA2 != null && map2.containsKey(qVarA2)) {
            return v.k(model, modelC, ((dsb.e) ((dsb.d) r0.h(qVarA2, map2))).a(tradeInstrumentData, data), b0.b(z3, gVar, bigDecimal, data, uVar));
        }
        throw new IllegalStateException("No " + o0.f186429a.b(dsb.d.class) + " found for instrument type " + nVarN3.f214597c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r83, java.lang.Object r84, java.lang.Object r85) {
        /*
            Method dump skipped, instruction units count: 1987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: soc.f.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object content, Object obj2, Object obj3) {
        zy.f fVar = (zy.f) this.f264815b;
        String str = (String) this.f264816c;
        Set set = (Set) this.d;
        ((Boolean) obj2).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content instanceof List ? (List) content : null;
        if (list == null) {
            list = f0.f322471a;
        }
        qd0.b bVar = (qd0.b) fVar.f326355a.f312297a;
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                Locale locale = (Locale) obj4;
                List listK = v.k(zy.f.i(locale), locale.getDisplayName(((s80.b) bVar).a()), locale.getLanguage(), locale.getCountry(), locale.getDisplayCountry(((s80.b) bVar).a()), locale.toLanguageTag());
                if (!(listK instanceof Collection) || !listK.isEmpty()) {
                    Iterator it8 = listK.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            String str2 = (String) it8.next();
                            Intrinsics.h(str2);
                            if (kotlin.text.d0.J(str2, str, true)) {
                                arrayList.add(obj4);
                                break;
                            }
                        }
                    }
                }
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("active_liveness_empty_search_state", new TextLocalisedClause(com.revolut.feature.picker.R$string.search_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_language_selector_search_no_results, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_language_selector_clear_search, null, null, 14), null, h4.ACCENT), null, false, s7a.b0.f260602a, null, null, 1760));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_intro_hand_signs, null, null, 14);
            yy0.i iVar = l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            List listC2 = u.c(new RowDelegate.Model("sign_language", null, textLocalisedClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return d0.E0(listC2, listC);
        }
        List<Locale> list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (Locale locale2 : list2) {
            String languageTag = locale2.toLanguageTag();
            Intrinsics.h(languageTag);
            arrayList2.add(new RowDelegate.Model(languageTag, null, new TextClause(zy.f.i(locale2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, set.contains(languageTag) ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null, false, null, false, null, null, null, null, null, null, locale2, null, 0, 0, 0, 0, 532675578));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable, mx0.d7] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v30 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: soc.f.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ f(toc.a aVar, h hVar, dj0.d dVar, uq uqVar) {
        this.f264814a = 0;
        this.f264815b = aVar;
        this.f264816c = dVar;
        this.d = uqVar;
    }
}
