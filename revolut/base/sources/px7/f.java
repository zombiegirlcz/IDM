package px7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nx7.n;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f240574b;

    public /* synthetic */ f(h hVar, int i) {
        this.f240573a = i;
        this.f240574b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        switch (this.f240573a) {
            case 0:
                z gender = (z) obj2;
                Intrinsics.checkNotNullParameter(gender, "gender");
                this.f240574b.f240579n.getClass();
                Intrinsics.checkNotNullParameter(gender, "gender");
                int i = qx7.b.f250029a[gender.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_header_title_male, null, null, 14);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m70.a.c(t0.f186434a);
                        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_header_title_female, null, null, 14);
                }
                return textLocalisedClause;
            case 1:
                Clause clause = (Clause) obj2;
                xpi.g gVar = this.f240574b.f240576j;
                Intrinsics.h(clause);
                xpi.c cVar = (xpi.c) gVar;
                cVar.n0(clause);
                cVar.p0(clause);
                cVar.f0(new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_header_caption, null, null, 14));
                cVar.l0(true);
                cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
                return Unit.f186387a;
            case 2:
                DOBInputData dOBInputData = (DOBInputData) obj2;
                nx7.b bVar = this.f240574b.f240578m;
                Intrinsics.h(dOBInputData);
                return ((n) bVar).u(dOBInputData);
            default:
                DOBInputData data = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                this.f240574b.f240579n.getClass();
                return qx7.a.a(data);
        }
    }
}
