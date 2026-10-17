package vz7;

import android.os.Parcelable;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.assumptions.PetPlanAssumptionsActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import ofm.h;
import qv0.i;
import te0.w;
import tx0.j0;
import vfg.p;
import vx5.r;
import xpi.g;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f293407j;
    public final uz7.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wz7.a f293408l;

    public e(g navBar, uz7.b router, wz7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f293407j = navBar;
        this.k = router;
        this.f293408l = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_assumptions_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f293407j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new vx9.b(this, 13)), new p(new r(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        d function = d.f293406a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new m3l.d(28, this.i), new a1l.c(23));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
        this.f293408l.getClass();
        s0 s0Var = new s0(4);
        s0Var.a(new ListSubheaderDelegate.Model("CONDITIONS_GENERAL_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pets_assumptions_section_general_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ArrayList arrayListN = v.n(wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_general_item1, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_RESIDENCY_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_general_item2, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_AGE_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_general_item3, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_PURPOSE_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_general_item4, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_PREVIOUS_INSURANCE_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_general_item5, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_CRIME_LIST_ID"));
        yp0.b.k(arrayListN, 0, 0, 0, 0, 31);
        s0Var.b((i[]) arrayListN.toArray(new i[0]));
        s0Var.a(new ListSubheaderDelegate.Model("CONDITIONS_ONLY_DOG_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pets_assumptions_section_dog_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ArrayList arrayListN2 = v.n(wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_dog_item1, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_AGGRESSIVE_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_dog_item2, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_CROSS_BREED_LIST_ID"), wz7.a.a(new TextLocalisedClause(R$string.pets_assumptions_section_dog_item3, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "CONDITIONS_ITEM_LIVE_NO_ALCOHOL_LIST_ID"));
        yp0.b.k(arrayListN2, 0, R$attr.uikit_dp32, 0, 0, 29);
        s0Var.b((i[]) arrayListN2.toArray(new i[0]));
        ArrayList arrayList = s0Var.f186433a;
        ((PetPlanAssumptionsActivity) view).setItems(v.k(arrayList.toArray(new i[arrayList.size()])));
    }
}
