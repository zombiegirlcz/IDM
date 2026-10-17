package ty7;

import android.os.Parcelable;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract$CoPaySelection;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import ip0.ak0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jmrtd.lds.LDSFile;
import org.joda.time.LocalDate;
import rp0.t;
import rp0.y;
import te0.w;
import zhm.r0;
import zhm.u;
import zhm.v;
import zw7.d0;
import zw7.h1;
import zw7.r;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f275495b;

    public /* synthetic */ g(p pVar, int i) {
        this.f275494a = i;
        this.f275495b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model model2;
        CellDetailsDelegate.Model model3;
        switch (this.f275494a) {
            case 0:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator it8 = items.iterator();
                while (true) {
                    obj3 = null;
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        String f55206b = ((koi.j) next).getF55206b();
                        koi.j jVar = this.f275495b.f275511q.f284104b;
                        if (jVar == null) {
                            Intrinsics.r("lastItem");
                            throw null;
                        }
                        if (Intrinsics.f(f55206b, jVar.getF55206b())) {
                            obj3 = next;
                        }
                    }
                }
                return Boolean.valueOf(obj3 != null);
            case 1:
                ((iqi.b) this.f275495b.k).R(!((Boolean) obj2).booleanValue(), true);
                return Unit.f186387a;
            case 2:
                opi.d dVar = this.f275495b.f275510p;
                LargeActionButtonDelegate.Model model4 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                String str = model4.f52613a;
                if (!Intrinsics.f(str, "REVIEW_PRICE_REFUND") && !Intrinsics.f(str, "REVIEW_PRICE_ONE_TIME_PAYMENT")) {
                    pfm.m mVar = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                return ((opi.b) dVar).O();
            case 3:
                p pVar = this.f275495b;
                uy7.f fVar = pVar.f275511q;
                opi.d dVar2 = pVar.f275510p;
                CellDetailsDelegate.Model it9 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                String str2 = it9.f51832a;
                if (Intrinsics.f(str2, "REVIEW_PRICE_ONE_TIME_PAYMENT")) {
                    fVar.getClass();
                    rp0.l lVar = rp0.l.WINDOW;
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                    int i = R$attr.uikit_dp16;
                    return ((opi.b) dVar2).a0(new y(u.c(new LargeActionButtonDelegate.Model("REVIEW_PRICE_ONE_TIME_PAYMENT", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496)), new t(new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_surcharge_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_surcharge_info_description, null, null, 14), null, 28), lVar, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832));
                }
                if (!Intrinsics.f(str2, "REVIEW_PRICE_REFUND")) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                fVar.getClass();
                rp0.l lVar2 = rp0.l.WINDOW;
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                int i2 = R$attr.uikit_dp16;
                return ((opi.b) dVar2).a0(new y(u.c(new LargeActionButtonDelegate.Model("REVIEW_PRICE_REFUND", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i2, i2, i2, i2, 496)), new t(new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_refund_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_refund_info_description, null, null, 14), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832));
            case 4:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f275445a, "REVIEW_FOOTER_ITEM_DOC_LIST_ID")) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                ly7.b bVar = this.f275495b.f275507l;
                Object obj4 = clickData.d;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Text");
                PolicyDocument.Text document = (PolicyDocument.Text) obj4;
                ly7.j jVar2 = (ly7.j) bVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                ln.a aVar = jVar2.f200737a;
                hy7.f.Companion.getClass();
                return aVar.a(new ActivityNavigateCommand(hy7.a.f156745b, new TextDocumentContract$Configuration(document.f76273a, "PET_EDIT_DETAILS_FLOW", document.f76274b), null, null, 0, null, null, null, null, false, 1020));
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                d0 d0Var = (d0) pair.f186385a;
                r rVar = (r) pair.f186386b;
                ly7.a aVar2 = this.f275495b.f275508m;
                ufm.i iVar = new ufm.i(w.H0(((ly7.h) aVar2).k3(), w.j(r0.h("SUITABILITY_STATEMENT", (Map) ((ly7.h) aVar2).f200736p.f191187a.getValue()))), new ty1.c(new twg.a(d0Var, rVar, 10), 10), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 6:
                vf0.h hVar = (vf0.h) obj2;
                d0 pet = (d0) hVar.f288433a;
                PetEditDetailsContract$PetEditResult editedPet = (PetEditDetailsContract$PetEditResult) hVar.f288434b;
                r rVar2 = (r) hVar.f288435c;
                PolicyDocument document2 = (PolicyDocument) hVar.d;
                LocalDate fromDate = rVar2.f325838c;
                if (fromDate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                p pVar2 = this.f275495b;
                ly7.h hVar2 = (ly7.h) pVar2.f275508m;
                h1 updateQuote = hVar2.j3(rVar2.f325837b, (PetEditQuoteContract$CoPaySelection) ((ly7.k) hVar2.f200733l).x0().get());
                uy7.f fVar2 = pVar2.f275511q;
                if (updateQuote == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(pet, "pet");
                Intrinsics.checkNotNullParameter(editedPet, "editedPet");
                Intrinsics.checkNotNullParameter(updateQuote, "updateQuote");
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(document2, "document");
                dj0.d dVar3 = updateQuote.f;
                if (dVar3 != null) {
                    dj0.d.Companion.getClass();
                    dj0.d dVar4 = dj0.d.e;
                    Object cVar = dVar3.f(dVar4) ? new uy7.c(pet, editedPet, updateQuote, fromDate, document2) : dVar3.i(dVar4) ? new uy7.d(pet, editedPet, updateQuote, fromDate, document2) : null;
                    if (cVar != null) {
                        return cVar;
                    }
                }
                return new uy7.b(pet, editedPet, updateQuote, fromDate, document2);
            case 7:
                uy7.e model5 = (uy7.e) obj2;
                Intrinsics.checkNotNullParameter(model5, "model");
                uy7.f fVar3 = this.f275495b.f275511q;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(model5, "model");
                s0 s0Var = new s0(7);
                s0Var.a(new ListSubheaderDelegate.Model("REVIEW_PRICE_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_sections_price_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                Image imageA = fVar3.f284103a.a(model5.d());
                TextClause textClause = new TextClause(model5.b().f76292b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_new_price_start_date, u.c(new TimeClause(jli.b.b(model5.c()), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
                TextClause textClause2 = new TextClause(model5.e().f325792b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                zw7.s0 s0Var2 = model5.d().o;
                Intrinsics.checkNotNullParameter(s0Var2, "<this>");
                RowDelegate.Model model6 = new RowDelegate.Model("REVIEW_PRICE_PROFILE_CELL", imageA, null, null, textClause, textLocalisedClause3, null, null, 0, new RowDelegate.Model.c.b(textClause2, new TextClause(((zw7.r0) s0Var2).f325843h, (Style) null, (Integer) null, true, (o9) null, (List) null, LDSFile.EF_DG4_TAG), null, false, 124), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                s0Var.a(model6);
                if (model5 instanceof uy7.b) {
                    model2 = null;
                } else {
                    if (model5 instanceof uy7.c) {
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_surcharge_title, null, null, 14);
                        dj0.d dVar5 = ((uy7.c) model5).f284099c.f;
                        if (dVar5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        model = new CellDetailsDelegate.Model("REVIEW_PRICE_ONE_TIME_PAYMENT", textLocalisedClause4, new MoneyClause(dVar5, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
                    } else {
                        if (!(model5 instanceof uy7.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_refund_title, null, null, 14);
                        dj0.d dVar6 = ((uy7.d) model5).f284102c.f;
                        if (dVar6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        model = new CellDetailsDelegate.Model("REVIEW_PRICE_REFUND", textLocalisedClause5, new MoneyClause(dVar6, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
                    }
                    model2 = model;
                }
                if (model2 != null) {
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model3 = model2;
                } else {
                    model3 = null;
                }
                s0Var.a(model3);
                s0Var.a(new ListSubheaderDelegate.Model("REVIEW_CHANGES_SUMMARY_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_sections_summary_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                d0 d0VarD = model5.d();
                PetEditDetailsContract$PetEditResult petEditDetailsContract$PetEditResultB = model5.b();
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_name_title, null, null, 14);
                String str3 = petEditDetailsContract$PetEditResultB.f76292b;
                boolean z = petEditDetailsContract$PetEditResultB.i;
                AmountData amountData = petEditDetailsContract$PetEditResultB.f76295h;
                PetBreedDetailsContract$BreedParam petBreedDetailsContract$BreedParam = petEditDetailsContract$PetEditResultB.f;
                zw7.h hVar3 = petEditDetailsContract$PetEditResultB.e;
                DOBInputData dOBInputData = petEditDetailsContract$PetEditResultB.f76294g;
                z zVar = petEditDetailsContract$PetEditResultB.d;
                CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model("REVIEW_PET_NAME_LIST_ID", textLocalisedClause6, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
                String str4 = petEditDetailsContract$PetEditResultB.f76292b;
                String str5 = d0VarD.d;
                zw7.e eVar = d0VarD.f;
                CellDetailsDelegate.Model model8 = !Intrinsics.f(str4, str5) ? model7 : null;
                CellDetailsDelegate.Model model9 = zVar != d0VarD.e ? new CellDetailsDelegate.Model("REVIEW_PET_SEX_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_gender_title, null, null, 14), yx7.d.b(petEditDetailsContract$PetEditResultB.f76293c, zVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_birthday_title, null, null, 14);
                Date f76348a = dOBInputData.getF76348a();
                if (f76348a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CellDetailsDelegate.Model model10 = new CellDetailsDelegate.Model("REVIEW_PET_BIRTHDAY_LIST_ID", textLocalisedClause7, new TimeClause(f76348a.getTime(), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                Date f76348a2 = dOBInputData.getF76348a();
                CellDetailsDelegate.Model[] elements = {model8, model9, (f76348a2 == null || f76348a2.getTime() != jli.b.b(d0VarD.f325767g)) ? model10 : null, hVar3 != eVar.f325775c ? new CellDetailsDelegate.Model("REVIEW_PET_BREED_TYPE_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_breed_type_title, null, null, 14), yx7.d.a(hVar3), 0, null, null, null, null, null, false, 0, 0, 32760) : null, !Intrinsics.f(petBreedDetailsContract$BreedParam.f76232a, eVar.f325773a) ? new CellDetailsDelegate.Model("REVIEW_PET_BREED_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_breed_title, null, null, 14), new TextClause(petBreedDetailsContract$BreedParam.f76233b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760) : null, !nz8.d.K(amountData).equals(d0VarD.f325769j) ? new CellDetailsDelegate.Model("REVIEW_PET_AMOUNT_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_price_paid_title, null, null, 14), new MoneyClause(nz8.d.K(amountData), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760) : null, z != d0VarD.f325768h ? new CellDetailsDelegate.Model("REVIEW_PET_STERILIZED_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_sterilized_title, null, null, 14), z ? new TextLocalisedClause(R$string.common_action_yes, null, null, 14) : new TextLocalisedClause(R$string.common_action_no, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                s0Var.b((koi.j[]) listL.toArray(new CellDetailsDelegate.Model[0]));
                h1 h1VarE = model5.e();
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_copay_excess_title, v.k(h1VarE.f325793c, h1VarE.d), null, 12);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                RowDelegate.Model.b.c cVar2 = RowDelegate.Model.b.c.f53268a;
                RowDelegate.Model model11 = new RowDelegate.Model("REVIEW_QUOTE_COPAY_EXCESS_LIST_ID", resourceImage, null, null, textLocalisedClause8, null, null, null, 0, null, false, false, null, cVar2, null, null, null, null, null, 0, 0, 0, 0, 1073704940);
                zw7.l lVar3 = h1VarE.e;
                RowDelegate.Model[] elements2 = {model11, lVar3 != null ? new RowDelegate.Model("REVIEW_PRICE_DISCOUNT_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_time_and_money, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_promotion_price_title, v.k(lVar3.f325811a, h1VarE.f325792b), null, 12), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_cells_promotion_price_subtitle, null, null, 14), null, null, 0, null, false, false, null, cVar2, null, null, null, null, null, 0, 0, 0, 0, 1073704812) : null};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                s0Var.b((koi.j[]) listL2.toArray(new RowDelegate.Model[0]));
                TextDelegate.Model model12 = new TextDelegate.Model("REVIEW_FOOTER_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_review_changes_footer_caption, u.c(new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_all_documents_suitability_statement_name, null, new Click(28, (Integer) null, (Object) model5.a(), "REVIEW_FOOTER_ITEM_DOC_LIST_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model12, 0, R$attr.uikit_dp16, 0, 0, 13);
                s0Var.a(model12);
                ArrayList arrayList = s0Var.f186433a;
                List listM = v.m(arrayList.toArray(new koi.j[arrayList.size()]));
                fVar3.f284104b = (koi.j) zhm.d0.m0(listM);
                return new Pair(model5, listM);
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                PetEditDetailsContract$PetEditResult petEditDetailsContract$PetEditResult = (PetEditDetailsContract$PetEditResult) pair2.f186385a;
                r rVar3 = (r) pair2.f186386b;
                ly7.a aVar3 = this.f275495b.f275508m;
                h1 h1VarJ3 = ((ly7.h) aVar3).j3(rVar3.f325837b, (PetEditQuoteContract$CoPaySelection) ((ly7.k) ((ly7.h) aVar3).f200733l).x0().get());
                if (h1VarJ3 != null) {
                    return new PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction(petEditDetailsContract$PetEditResult, h1VarJ3.f325791a, rVar3.f325836a, pyd.c.M(h1VarJ3.f));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction it10 = (PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f275495b.f275512r.c0(it10);
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                p pVar3 = this.f275495b;
                ly7.a aVar4 = pVar3.f275508m;
                ufm.i iVarK3 = ((ly7.h) aVar4).k3();
                efm.d0 d0VarFirstOrError = m70.a.g(((ly7.h) aVar4).m3(), null, new tw8.g(9), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                pfm.a aVar5 = new pfm.a(new ufm.i(w.H0(iVarK3, d0VarFirstOrError), new ty1.c(new g(pVar3, 8), 8), 1), new ty1.c(new g(pVar3, 9), 9), 4);
                Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                return aVar5;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((ly7.j) this.f275495b.f275507l).a();
        }
    }
}
