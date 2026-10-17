package wx7;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nx7.n;
import nx7.z;
import zhm.v;
import zhm.w;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f300775b;

    public /* synthetic */ f(j jVar, int i) {
        this.f300774a = i;
        this.f300775b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Media urlImage;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        switch (this.f300774a) {
            case 0:
                c0 type = (c0) obj2;
                Intrinsics.checkNotNullParameter(type, "type");
                j jVar = this.f300775b;
                pfm.a aVarE = ((n) jVar.f300780l).I(type).e(((z) jVar.f300781m).m());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            default:
                List options = (List) obj2;
                Intrinsics.checkNotNullParameter(options, "options");
                this.f300775b.f300782n.getClass();
                Intrinsics.checkNotNullParameter(options, "options");
                List list = options;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                int i = 0;
                for (Object obj3 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    c0 type2 = (c0) obj3;
                    String strN = a0.d.n("SMALL_CARD_LIST_ID_PREFIX_", i);
                    Intrinsics.checkNotNullParameter(type2, "type");
                    int i3 = yx7.g.f317589a[type2.ordinal()];
                    if (i3 == 1) {
                        m70.a.c(t0.f186434a);
                        urlImage = new UrlImage("", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    } else if (i3 == 2) {
                        urlImage = new CdnImage("tile_dog", "mobile/pet/rev_10/onboarding", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        urlImage = new CdnImage("tile_cat", "mobile/pet/rev_10/onboarding", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                    }
                    ec ecVar = new ec(urlImage);
                    int[] iArr = xx7.b.f309406a;
                    int i5 = iArr[type2.ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pets_models_pet_pet_type_dog, null, null, 14);
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.pets_models_pet_pet_type_cat, null, null, 14);
                    }
                    int i6 = iArr[type2.ordinal()];
                    if (i6 == 1 || i6 == 2) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_type_selection_dog, null, null, 14);
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_type_selection_cat, null, null, 14);
                    }
                    ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(strN, ecVar, textLocalisedClause, textLocalisedClause2, null, type2, null, false, false, false, 976);
                    int i21 = R$attr.uikit_dp4;
                    yp0.b.l(model, i21, i21, i21, i21, null, false, 48);
                    arrayList.add(model);
                    i = i2;
                }
                return arrayList;
        }
    }
}
