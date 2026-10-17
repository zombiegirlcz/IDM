package com.revolut.feature.credit.application.plugins.impl.ui.valuators.details;

import aim.e;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.a9;
import com.revolut.core.ui_kit.delegates.c9;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$Action;
import com.revolut.feature.credit.core.R$string;
import fj4.h;
import ip0.ww;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValuatorDetailsScreenContract$InputData f68506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f68507b;

    public b(ValuatorDetailsScreenContract$InputData inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f68506a = inputData;
        this.f68507b = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.recommended_valuators_details_title;
        ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData = this.f68506a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(valuatorDetailsScreenContract$InputData.f68504a.f169617a), null, 12);
        e eVarB = u.b();
        iy3.b bVar = valuatorDetailsScreenContract$InputData.f68504a;
        co3.a aVar = bVar.f169620g;
        String str = bVar.f169618b;
        ww wwVar = new ww(null, new TextLocalisedClause(R$string.recommended_valuators_details_map_title, u.c(str), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246));
        double d = aVar.f25486a;
        double d5 = aVar.f25487b;
        d9 d9Var = new d9(str, new a9(d, d5), false, new c9(null, u.c(new ah0.a(d, d5))), wwVar, new ValuatorDetailsScreenContract$Action.ShowMap(aVar), null, false, 4036);
        yp0.b.l(d9Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(d9Var);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recommended_valuators_details_phone_title, null, null, 14);
        int i2 = R$string.recommended_valuators_details_phone_action;
        String str2 = bVar.f169619c;
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("cell-phone-number", textLocalisedClause2, 0, null, new TextLocalisedClause(i2, u.c(z80.b.b(this.f68507b, str2, null, null, 6)), null, 12), null, false, false, null, null, new ValuatorDetailsScreenContract$Action.Call(str2), 0, 0, 0, 0, 4192228);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.recommended_valuators_details_website_title, null, null, 14);
        int i3 = R$string.recommended_valuators_details_website_action;
        iy3.a aVar2 = bVar.d;
        CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("cell-website", textLocalisedClause3, 0, null, new TextLocalisedClause(i3, u.c(aVar2.f169615a), null, 12), null, false, false, null, null, new ValuatorDetailsScreenContract$Action.OpenBrowser(aVar2.f169616b), 0, 0, 0, 0, 4192228);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.recommended_valuators_details_email_title, null, null, 14);
        int i5 = R$string.recommended_valuators_details_email_action;
        String str3 = bVar.e;
        List listK = v.k(model, model2, new CellDetailsActionDelegate.Model("cell-email", textLocalisedClause4, 0, null, new TextLocalisedClause(i5, u.c(str3), null, 12), null, false, false, null, null, new ValuatorDetailsScreenContract$Action.SendEmail(str3), 0, 0, 0, 0, 4192228));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new h(u.a(eVarB), textLocalisedClause);
    }
}
