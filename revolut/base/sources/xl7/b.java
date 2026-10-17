package xl7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final TextLocalisedClause a(AdditionalDriver.Relationship relationship) {
        int i;
        Intrinsics.checkNotNullParameter(relationship, "<this>");
        int i2 = a.f306939a[relationship.ordinal()];
        if (i2 == 1) {
            i = R$string.car_insurance_driver_relationship_spouse;
        } else if (i2 == 2) {
            i = R$string.car_insurance_driver_relationship_family;
        } else if (i2 == 3) {
            i = R$string.car_insurance_driver_relationship_parent;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_driver_relationship_other;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
