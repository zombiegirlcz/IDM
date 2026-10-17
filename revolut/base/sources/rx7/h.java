package rx7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import qi3.t;
import rd3.x;
import te0.w;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f258067b;

    public /* synthetic */ h(m mVar, int i) {
        this.f258066a = i;
        this.f258067b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258066a) {
            case 0:
                m mVar = this.f258067b;
                opi.d dVar = mVar.f258075n;
                nx7.b bVar = mVar.f258073l;
                RowDelegate.Model listItem = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(listItem, "listItem");
                String str = listItem.f53228a;
                Object obj3 = listItem.u;
                if (a0.H(str, "BREED_TYPE_ROW_ITEM_ID_PREFIX_", false)) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.BreedType");
                    return ((nx7.n) bVar).r2((zw7.h) obj3).e(((nx7.n) bVar).E0(new PetBreedDetailsContract$BreedParam((String) null, (String) null, 7))).e(((opi.b) dVar).O());
                }
                if (!a0.H(listItem.f53228a, "BREED_ROW_ITEM_ID_PREFIX_", false)) {
                    return pfm.m.f235744a;
                }
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Breed");
                zw7.e eVar = (zw7.e) obj3;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                return ((nx7.n) bVar).E0(new PetBreedDetailsContract$BreedParam(eVar.f325773a, eVar.f325774b, false)).e(((opi.b) dVar).O());
            case 1:
                m mVar2 = this.f258067b;
                nx7.b bVar2 = mVar2.f258073l;
                InputTextDelegate.Model dropDown = (InputTextDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(dropDown, "dropDown");
                String str2 = dropDown.f52580a;
                if (Intrinsics.f(str2, "BREED_TYPE_INPUT_TEXT_LIST_ID")) {
                    d0 d0VarFirstOrError = ((nx7.n) bVar2).f220459b.F().firstOrError();
                    rw9.d dVar2 = new rw9.d(new h(mVar2, 5), 6);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar = new pfm.a(d0VarFirstOrError, dVar2, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                    return aVar;
                }
                if (!Intrinsics.f(str2, "BREED_TYPE_TEXT_LIST_ID")) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                nx7.n nVar = (nx7.n) bVar2;
                pfm.a aVar2 = new pfm.a(d0.C(nVar.f220461g.O1().firstOrError(), nVar.f220461g.t2().firstOrError(), nVar.f220459b.F().firstOrError(), new rw9.d(new x(14), 4)), new rw9.d(new h(mVar2, 4), 5), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String name = (String) pair.f186385a;
                z gender = (z) pair.f186386b;
                this.f258067b.f258076p.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(gender, "gender");
                int i = sx7.c.f266365a[gender.ordinal()];
                if (i == 1) {
                    return new TextLocalisedClause(R$string.pets_onboarding_pet_details_2_header_title_male, u.c(name), null, 12);
                }
                if (i == 2) {
                    return new TextLocalisedClause(R$string.pets_onboarding_pet_details_2_header_title_female, u.c(name), null, 12);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 3:
                Clause clause = (Clause) obj2;
                xpi.g gVar = this.f258067b.f258072j;
                Intrinsics.h(clause);
                xpi.c cVar = (xpi.c) gVar;
                cVar.n0(clause);
                cVar.p0(clause);
                cVar.l0(false);
                cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
                return Unit.f186387a;
            case 4:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Object obj4 = rVar.f314201a;
                Intrinsics.checkNotNullExpressionValue(obj4, "component1(...)");
                List list = (List) obj4;
                Object obj5 = rVar.f314202b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                zw7.h hVar = (zw7.h) obj5;
                Object obj6 = rVar.f314203c;
                Intrinsics.checkNotNullExpressionValue(obj6, "component3(...)");
                c0 c0Var = (c0) obj6;
                c0 c0Var2 = c0.DOG;
                m mVar4 = this.f258067b;
                if (c0Var != c0Var2 || hVar != zw7.h.MIXED) {
                    nx7.z zVar = (nx7.z) mVar4.f258074m;
                    ln.a aVar3 = zVar.f220482c;
                    com.revolut.feature.chooser.b bVar3 = t.Companion;
                    t70.g gVar2 = zVar.d;
                    String string = gVar2.getString(R$string.pets_onboarding_pet_details_breed_title);
                    String string2 = gVar2.getString(R$string.pets_common_search_field_placeholder);
                    f0 f0Var = f0.f322471a;
                    ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
                    return aVar3.a(com.revolut.feature.chooser.b.a(bVar3, f0Var, "PET_ADD_FLOW", string, string2, ChooserConfiguration.ConfigurationType.Companion.f65901b, R$string.pets_onboarding_pet_details_breed_search_no_results_single_text));
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list) {
                    if (((zw7.e) obj7).f325775c == hVar) {
                        arrayList.add(obj7);
                    }
                }
                os2.g gVar3 = mVar4.o;
                mVar4.f258076p.getClass();
                ArrayList listItems = sx7.d.b(arrayList);
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(listItems, "listItems");
                pfm.h hVar2 = new pfm.h(new a(gVar3, listItems, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 5:
                c0 petType = (c0) obj2;
                Intrinsics.checkNotNullParameter(petType, "petType");
                m mVar5 = this.f258067b;
                os2.g gVar4 = mVar5.o;
                ArrayList listItems2 = mVar5.f258076p.d(petType);
                gVar4.getClass();
                Intrinsics.checkNotNullParameter(listItems2, "listItems");
                pfm.h hVar3 = new pfm.h(new a(gVar4, listItems2, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            case 6:
                nqi.a inputText = (nqi.a) obj2;
                Intrinsics.checkNotNullParameter(inputText, "inputText");
                InputTextDelegate.Model model = (InputTextDelegate.Model) inputText.f218467a;
                if (!Intrinsics.f(model.f52580a, "AMOUNT_INPUT_TEXT_LIST_ID")) {
                    return pfm.m.f235744a;
                }
                Object obj8 = model.P;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                xi0.b currency = (xi0.b) obj8;
                String formattedPriceString = inputText.f218468b;
                m mVar6 = this.f258067b;
                nx7.b bVar4 = mVar6.f258073l;
                sz7.b bVar5 = mVar6.f258077q;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(formattedPriceString, "formattedPriceString");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return ((nx7.n) bVar4).w2(new AmountData(bVar5.f266771a.b(formattedPriceString, currency.f306286a), formattedPriceString, currency));
            case 7:
                sx7.b model2 = (sx7.b) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                return ((nx7.n) this.f258067b.f258073l).E0(model2.f266364c).g(w.h(model2));
            case 8:
                sx7.b model3 = (sx7.b) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                sx7.d dVar3 = this.f258067b.f258076p;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                s0 s0Var = new s0(3);
                s0Var.b(dVar3.c(model3.f266362a, model3.f266363b, model3.f266364c));
                s0Var.a(sx7.d.a(model3.d));
                s0Var.a(sx7.d.e(model3.e));
                ArrayList arrayList2 = s0Var.f186433a;
                return v.k(arrayList2.toArray(new koi.j[arrayList2.size()]));
            default:
                InputChecklistDelegate.Model model4 = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                if (Intrinsics.f(model4.f52519a, "STERILIZED_INPUT_CHECK_LIST_ID")) {
                    return ((nx7.n) this.f258067b.f258073l).f220462h.Z1(!model4.f52521c);
                }
                pfm.m mVar7 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar7, "complete(...)");
                return mVar7;
        }
    }
}
