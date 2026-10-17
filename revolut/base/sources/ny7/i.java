package ny7;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.text.d0;
import zhm.f0;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f220693b;

    public /* synthetic */ i(y yVar, int i) {
        this.f220692a = i;
        this.f220693b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        InputChecklistDelegate.Model modelE;
        switch (this.f220692a) {
            case 0:
                c0 petType = (c0) obj2;
                Intrinsics.checkNotNullParameter(petType, "petType");
                y yVar = this.f220693b;
                os2.g gVar = yVar.f220716q;
                oy7.a aVar = yVar.f220718s;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(petType, "petType");
                ArrayList listItems = aVar.f230911b.d(petType);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(listItems, "listItems");
                pfm.h hVar = new pfm.h(new rx7.a(gVar, listItems, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                zw7.z gender = (zw7.z) obj2;
                Intrinsics.checkNotNullParameter(gender, "gender");
                return ((ly7.h) this.f220693b.f220714n).M1(gender);
            case 2:
                sx7.b model = (sx7.b) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return ((ly7.h) this.f220693b.f220714n).E0(model.f266364c).g(te0.w.h(model));
            case 3:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                vx7.b baseDetails = (vx7.b) rVar.f314201a;
                DOBInputData dob2 = (DOBInputData) rVar.f314202b;
                sx7.b breedDetails = (sx7.b) rVar.f314203c;
                y yVar2 = this.f220693b;
                oy7.a aVar2 = yVar2.f220718s;
                Intrinsics.h(baseDetails);
                Intrinsics.h(dob2);
                Intrinsics.h(breedDetails);
                boolean zD = yVar2.f220711j.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(baseDetails, "baseDetails");
                Intrinsics.checkNotNullParameter(dob2, "dob");
                Intrinsics.checkNotNullParameter(breedDetails, "breedDetails");
                s0 s0Var = new s0(5);
                s0Var.b(aVar2.f230910a.a(baseDetails).toArray(new koi.j[0]));
                s0Var.b(qx7.a.a(dob2).toArray(new koi.j[0]));
                s0Var.b(aVar2.f230911b.c(breedDetails.f266362a, breedDetails.f266363b, breedDetails.f266364c));
                InputTextDelegate.Model modelA = sx7.d.a(breedDetails.d);
                if (zD) {
                    yp0.b.l(modelA, 0, R$attr.uikit_two_button_margin, 0, 0, null, false, 61);
                }
                s0Var.a(modelA);
                if (zD) {
                    modelE = null;
                } else {
                    modelE = sx7.d.e(breedDetails.e);
                    yp0.b.l(modelE, 0, R$attr.uikit_two_button_margin, 0, 0, null, false, 61);
                }
                s0Var.a(modelE);
                ArrayList arrayList = s0Var.f186433a;
                return zhm.v.m(arrayList.toArray(new koi.j[arrayList.size()]));
            case 4:
                y yVar3 = this.f220693b;
                opi.d dVar = yVar3.f220717r;
                ly7.a aVar3 = yVar3.f220714n;
                RowDelegate.Model listItem = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(listItem, "listItem");
                String str = listItem.f53228a;
                Object obj3 = listItem.u;
                if (kotlin.text.a0.H(str, "BREED_TYPE_ROW_ITEM_ID_PREFIX_", false)) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.BreedType");
                    return ((ly7.h) aVar3).r2((zw7.h) obj3).e(((ly7.h) aVar3).E0(new PetBreedDetailsContract$BreedParam((String) null, (String) null, 7))).e(((opi.b) dVar).O());
                }
                if (!kotlin.text.a0.H(listItem.f53228a, "BREED_ROW_ITEM_ID_PREFIX_", false)) {
                    return pfm.m.f235744a;
                }
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Breed");
                zw7.e eVar = (zw7.e) obj3;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                return ((ly7.h) aVar3).E0(new PetBreedDetailsContract$BreedParam(eVar.f325773a, eVar.f325774b, false)).e(((opi.b) dVar).O());
            case 5:
                return ((ly7.h) this.f220693b.f220714n).r(d0.F0(((InputTextDelegate.TextData) obj2).f52598b).toString());
            case 6:
                ((rpi.b) this.f220693b.f220712l).N(false);
                return Unit.f186387a;
            case 7:
                if (Intrinsics.f(((InputChecklistDelegate.Model) obj2).f52519a, "STERILIZED_INPUT_CHECK_LIST_ID")) {
                    return ((ly7.h) this.f220693b.f220714n).f200731h.Z1(!r14.f52521c);
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 8:
                ((rpi.b) this.f220693b.f220712l).N(false);
                return Unit.f186387a;
            case 9:
                y yVar4 = this.f220693b;
                ly7.a aVar4 = yVar4.f220714n;
                String str2 = ((InputTextDelegate.Model) obj2).f52580a;
                if (Intrinsics.f(str2, "BREED_TYPE_INPUT_TEXT_LIST_ID")) {
                    efm.d0 d0VarFirstOrError = ((ly7.h) aVar4).f200728b.F().firstOrError();
                    nx7.i iVar = new nx7.i(new i(yVar4, 0), 23);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar5 = new pfm.a(d0VarFirstOrError, iVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                    return aVar5;
                }
                if (!Intrinsics.f(str2, "BREED_TYPE_TEXT_LIST_ID")) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                ly7.h hVar2 = (ly7.h) aVar4;
                pfm.a aVar6 = new pfm.a(efm.d0.C(hVar2.f200730g.O1().firstOrError(), hVar2.f200730g.t2().firstOrError(), hVar2.f200728b.F().firstOrError(), new j(new ngh.i(11), 0)), new j(new i(yVar4, 10), 1), 4);
                Intrinsics.checkNotNullExpressionValue(aVar6, "flatMapCompletable(...)");
                return aVar6;
            case 10:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                Object obj4 = rVar2.f314201a;
                Intrinsics.checkNotNullExpressionValue(obj4, "component1(...)");
                List list = (List) obj4;
                Object obj5 = rVar2.f314202b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                zw7.h hVar3 = (zw7.h) obj5;
                Object obj6 = rVar2.f314203c;
                Intrinsics.checkNotNullExpressionValue(obj6, "component3(...)");
                c0 c0Var = (c0) obj6;
                c0 c0Var2 = c0.DOG;
                y yVar5 = this.f220693b;
                if (c0Var != c0Var2 || hVar3 != zw7.h.MIXED) {
                    ly7.j jVar = (ly7.j) yVar5.f220713m;
                    ln.a aVar7 = jVar.f200737a;
                    com.revolut.feature.chooser.b bVar = qi3.t.Companion;
                    f01.c cVar = jVar.f200738b;
                    String string = cVar.b(new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_title, null, null, 14)).toString();
                    String string2 = cVar.b(new TextLocalisedClause(R$string.pets_common_search_field_placeholder, null, null, 14)).toString();
                    f0 f0Var = f0.f322471a;
                    ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
                    return aVar7.a(com.revolut.feature.chooser.b.a(bVar, f0Var, "PET_EDIT_DETAILS_FLOW", string, string2, ChooserConfiguration.ConfigurationType.Companion.f65901b, R$string.pets_onboarding_pet_details_breed_search_no_results_single_text));
                }
                ArrayList breeds = new ArrayList();
                for (Object obj7 : list) {
                    if (((zw7.e) obj7).f325775c == hVar3) {
                        breeds.add(obj7);
                    }
                }
                os2.g gVar2 = yVar5.f220716q;
                yVar5.f220718s.getClass();
                Intrinsics.checkNotNullParameter(breeds, "breeds");
                ArrayList listItems2 = sx7.d.b(breeds);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(listItems2, "listItems");
                pfm.h hVar4 = new pfm.h(new rx7.a(gVar2, listItems2, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            case 11:
                nqi.a inputText = (nqi.a) obj2;
                Intrinsics.checkNotNullParameter(inputText, "inputText");
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) inputText.f218467a;
                if (!Intrinsics.f(model2.f52580a, "AMOUNT_INPUT_TEXT_LIST_ID")) {
                    return pfm.m.f235744a;
                }
                Object obj8 = model2.P;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                xi0.b currency = (xi0.b) obj8;
                String formattedPriceString = inputText.f218468b;
                y yVar6 = this.f220693b;
                ly7.a aVar8 = yVar6.f220714n;
                sz7.b bVar2 = yVar6.f220715p;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(formattedPriceString, "formattedPriceString");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return ((ly7.h) aVar8).w2(new AmountData(bVar2.f266771a.b(formattedPriceString, currency.f306286a), formattedPriceString, currency));
            case 12:
                DOBInputData dOBInputData = (DOBInputData) obj2;
                ly7.a aVar9 = this.f220693b.f220714n;
                Intrinsics.h(dOBInputData);
                return ((ly7.h) aVar9).u(dOBInputData);
            default:
                ((rpi.b) this.f220693b.f220712l).N(false);
                return Unit.f186387a;
        }
    }
}
