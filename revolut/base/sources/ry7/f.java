package ry7;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract$CoPaySelection;
import com.revolut.retail.common.ui.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.text.a0;
import rp0.t;
import rp0.y;
import te0.w;
import zhm.u;
import zhm.v;
import zw7.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f258243b;

    public /* synthetic */ f(o oVar, int i) {
        this.f258242a = i;
        this.f258243b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258242a) {
            case 0:
                LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f52613a, "COPAY_COVERAGE_HEADER_LIST_ID")) {
                    return ((opi.b) this.f258243b.f258257p).O();
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 1:
                ListSubheaderDelegate.Model model2 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                if (!Intrinsics.f(model2.f52708a, "COPAY_COVERAGE_HEADER_LIST_ID")) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                o oVar = this.f258243b;
                opi.d dVar = oVar.f258257p;
                oVar.f258258q.getClass();
                rp0.l lVar = rp0.l.WINDOW;
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                int i = R$attr.uikit_dp16;
                return ((opi.b) dVar).a0(new y(u.c(new LargeActionButtonDelegate.Model("COPAY_COVERAGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496)), new t(new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_plan_builder_details_copayment_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_plan_builder_details_copayment_description, null, null, 14), null, 28), lVar, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832));
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((ly7.j) this.f258243b.f258254l).a();
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                o oVar2 = this.f258243b;
                return ((ly7.j) oVar2.f258254l).c((String) ((ly7.k) ((ly7.h) oVar2.f258255m).f200733l).w0().get());
            case 4:
                InputChecklistDelegate.Model model3 = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                if (!a0.H(model3.f52519a, "INPUT_RADIO_COPAY_LIST_ID_PREFIX_", false)) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                ly7.a aVar = this.f258243b.f258255m;
                Object obj3 = model3.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract.CoPaySelection");
                PetEditQuoteContract$CoPaySelection coPaySelection = (PetEditQuoteContract$CoPaySelection) obj3;
                ly7.h hVar = (ly7.h) aVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(coPaySelection, "coPaySelection");
                return w.z0(((ly7.k) hVar.f200733l).x0(), coPaySelection);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                PetEditQuoteContract$CoPaySelection selectedCoPaySelection = (PetEditQuoteContract$CoPaySelection) pair.f186385a;
                r rVar = (r) pair.f186386b;
                o oVar3 = this.f258243b;
                sy7.a aVar2 = oVar3.f258258q;
                ly7.a aVar3 = oVar3.f258255m;
                ArrayList quotes = rVar.f325837b;
                ly7.h hVar2 = (ly7.h) aVar3;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(quotes, "quotes");
                hVar2.o.getClass();
                List coPayOptions = q.a(quotes);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedCoPaySelection, "selectedCoPaySelection");
                Intrinsics.checkNotNullParameter(coPayOptions, "coPayOptions");
                s0 s0Var = new s0(2);
                s0Var.a(new ListSubheaderDelegate.Model("COPAY_COVERAGE_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_plan_builder_copayment_section_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114));
                List list = coPayOptions;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                int i2 = 0;
                for (Object obj4 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(new InputChecklistDelegate.Model(a0.d.n("INPUT_RADIO_COPAY_LIST_ID_PREFIX_", i2), new TextClause(a0.d.r((String) obj4, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i2 == selectedCoPaySelection.f76302a, false, new InputChecklistDelegate.a.b(null), iq.RADIO_BUTTON, null, null, new PetEditQuoteContract$CoPaySelection(i2), null, 0, 0, 0, 523976));
                    i2 = i3;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                s0Var.b((koi.j[]) arrayList.toArray(new InputChecklistDelegate.Model[0]));
                ArrayList arrayList2 = s0Var.f186433a;
                return v.k(arrayList2.toArray(new koi.j[arrayList2.size()]));
        }
    }
}
