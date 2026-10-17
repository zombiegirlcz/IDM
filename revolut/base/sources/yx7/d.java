package yx7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static Clause a(zw7.h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = c.f317587c[type.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_pedigree_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_cross_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_mixed_title, null, null, 14);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static Clause b(c0 type, z gender) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(gender, "gender");
        int i = c.f317585a[type.ordinal()];
        if (i == 1) {
            int i2 = c.f317586b[gender.ordinal()];
            if (i2 == 1) {
                return new TextLocalisedClause(R$string.pets_models_pet_gender_male_dog, null, null, 14);
            }
            if (i2 == 2) {
                return new TextLocalisedClause(R$string.pets_models_pet_gender_female_dog, null, null, 14);
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        int i3 = c.f317586b[gender.ordinal()];
        if (i3 == 1) {
            return new TextLocalisedClause(R$string.pets_models_pet_gender_male_cat, null, null, 14);
        }
        if (i3 == 2) {
            return new TextLocalisedClause(R$string.pets_models_pet_gender_female_cat, null, null, 14);
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
