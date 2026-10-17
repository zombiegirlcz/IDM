package com.revolut.retail.feature.esim.impl.ui.screens.country_picker;

import cej.b;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOption;
import com.revolut.retail.feature.esim.impl.R$string;
import hhj.h;
import ip0.zj;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import jhj.e;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCountryPickerScreenContract$InputData f100957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f100958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xnj.a f100959c;
    public final e d;
    public final b e;
    public final LinkedHashMap f;

    public a(EsimCountryPickerScreenContract$InputData inputData, f01.a uiKitResources, ynj.e commonUiBuilder, xnj.a queryMatcher, e sectionsMapper, b mobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(queryMatcher, "queryMatcher");
        Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f100957a = inputData;
        this.f100958b = uiKitResources;
        this.f100959c = queryMatcher;
        this.d = sectionsMapper;
        this.e = mobilePlansFeatureAvailabilityInteractor;
        this.f = new LinkedHashMap();
    }

    public static FullScreenStateDelegate.Model c(String str) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_NO_RESULTS_FOUND_ITEM", new TextLocalisedClause(R$string.esim_country_picker_search_no_results_title, null, null, 14), new TextLocalisedClause(R$string.esim_country_picker_search_no_results_subtitle, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r40) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a.a(jki.i):jki.m");
    }

    public final String b(EsimDataPlanOption esimDataPlanOption) {
        String str = esimDataPlanOption.getF100244a().f100235a;
        LinkedHashMap linkedHashMap = this.f;
        Object string = linkedHashMap.get(str);
        if (string == null) {
            string = this.f100958b.b(d(esimDataPlanOption)).toString();
            linkedHashMap.put(str, string);
        }
        return (String) string;
    }

    public final Clause d(EsimDataPlanOption esimDataPlanOption) {
        if (esimDataPlanOption instanceof EsimDataPlanOption.CountryOption) {
            return new CountryClause(((EsimDataPlanOption.CountryOption) esimDataPlanOption).f100238a, null);
        }
        if ((esimDataPlanOption instanceof EsimDataPlanOption.RegionalOption) || (esimDataPlanOption instanceof EsimDataPlanOption.GlobalOption)) {
            return ynj.e.l(esimDataPlanOption.getF100244a());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean e(EsimDataPlanOption esimDataPlanOption, String str) {
        String strB = b(esimDataPlanOption);
        this.f100959c.getClass();
        boolean zA = xnj.a.a(strB, str);
        if (esimDataPlanOption instanceof EsimDataPlanOption.CountryOption) {
            return zA;
        }
        List<wi0.b> f100245b = esimDataPlanOption.getF100245b();
        if (!(f100245b instanceof Collection) || !f100245b.isEmpty()) {
            for (wi0.b bVar : f100245b) {
                String str2 = bVar.f297794a;
                LinkedHashMap linkedHashMap = this.f;
                Object string = linkedHashMap.get(str2);
                if (string == null) {
                    string = this.f100958b.b(new CountryClause(bVar, null)).toString();
                    linkedHashMap.put(str2, string);
                }
                if (xnj.a.a((String) string, str)) {
                    return true;
                }
            }
        }
        return zA;
    }
}
