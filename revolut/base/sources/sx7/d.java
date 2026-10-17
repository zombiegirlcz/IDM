package sx7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import ip0.iq;
import ip0.kr;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.f0;
import zhm.v;
import zhm.w;
import zw7.c0;
import zw7.e;
import zw7.f;
import zw7.g;
import zw7.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public d(yx7.d labelUIBuilder) {
        Intrinsics.checkNotNullParameter(labelUIBuilder, "labelUIBuilder");
    }

    public static InputTextDelegate.Model a(AmountData amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        long j2 = amount.f76345a;
        xi0.b bVar = amount.f76347c;
        MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_questions_paid_amount_field_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_questions_paid_amount_field_caption, null, null, 14);
        InputTextDelegate.Model model = new InputTextDelegate.Model("AMOUNT_INPUT_TEXT_LIST_ID", moneyClause, textLocalisedClause, new TextClause(cp5.d.J(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, false, textLocalisedClause2, null, null, null, null, null, false, null, null, false, false, false, false, kr.f165065a, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, amount.f76347c, null, null, 0, 0, 0, 0, -2097296, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ArrayList b(ArrayList breeds) {
        Intrinsics.checkNotNullParameter(breeds, "breeds");
        ArrayList arrayList = new ArrayList(w.t(breeds, 10));
        int i = 0;
        for (Object obj2 : breeds) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            e eVar = (e) obj2;
            arrayList.add(new RowDelegate.Model(a0.d.n("BREED_ROW_ITEM_ID_PREFIX_", i), null, new TextClause(eVar.f325774b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532674554));
            i = i2;
        }
        int i3 = R$attr.uikit_dp16;
        yp0.b.k(arrayList, i3, i3, 0, 0, 28);
        return arrayList;
    }

    public static InputChecklistDelegate.Model e(boolean z) {
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("STERILIZED_INPUT_CHECK_LIST_ID", new TextLocalisedClause(R$string.pets_onboarding_questions_is_sterilised_field_title, null, null, 14), z, false, new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524232);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final InputTextDelegate.Model[] c(c0 petType, h breedType, PetBreedDetailsContract$BreedParam breed) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("BREED_TYPE_INPUT_TEXT_LIST_ID", yx7.d.a(breedType), new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_field_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, true, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        String str = breed.f76233b;
        TextClause textClause = !d0.W(str) ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        int i = c.f266366b[breedType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_field_title, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = petType == c0.DOG ? new TextLocalisedClause(R$string.pets_onboarding_pet_details_size_field_title, null, null, 14) : new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_field_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        h.Companion.getClass();
        InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model("BREED_TYPE_TEXT_LIST_ID", textClause, textLocalisedClause2, null, false, null, false, null, null, null, null, null, null, false, null, null, false, g.a().contains(breedType) && !breed.f76234c, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        return new InputTextDelegate.Model[]{modelA, modelA2};
    }

    public final ArrayList d(c0 petType) {
        RandomAccess randomAccessA;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(petType, "petType");
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(petType, "petType");
        int i = f.f325778a[petType.ordinal()];
        if (i == 1) {
            randomAccessA = g.a();
        } else if (i == 2) {
            ArrayList arrayListA = g.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListA) {
                if (((h) obj2) != h.CROSS) {
                    arrayList.add(obj2);
                }
            }
            randomAccessA = arrayList;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            randomAccessA = f0.f322471a;
        }
        Iterable iterable = (Iterable) randomAccessA;
        ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
        int i2 = 0;
        for (Object obj3 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            h hVar = (h) obj3;
            String strN = a0.d.n("BREED_TYPE_ROW_ITEM_ID_PREFIX_", i2);
            Clause clauseA = yx7.d.a(hVar);
            int i5 = c.f266366b[hVar.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_pedigree_subtitle, null, null, 14);
                } else if (i5 == 3) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_cross_subtitle, null, null, 14);
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause2 = petType == c0.CAT ? new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_mixed_cat_subtitle, null, null, 14) : new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_mixed_subtitle, null, null, 14);
                }
                textLocalisedClause = textLocalisedClause2;
            } else {
                textLocalisedClause = null;
            }
            arrayList2.add(new RowDelegate.Model(strN, null, clauseA, null, 0, textLocalisedClause, null, null, 0, null, true, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532674522));
            i2 = i3;
        }
        int i6 = R$attr.uikit_dp16;
        yp0.b.k(arrayList2, i6, i6, 0, 0, 28);
        return arrayList2;
    }
}
