package oz7;

import a0e.w;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$plurals;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import yx7.f;
import yx7.h;
import yx7.i;
import yx7.s;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zw7.d0;
import zw7.e1;
import zw7.f1;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f231120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f231121b;

    public d(h petImageBuilder, i petNotificationIconBuilder, f petBadgeProvider, w petAgeProvider) {
        Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
        Intrinsics.checkNotNullParameter(petNotificationIconBuilder, "petNotificationIconBuilder");
        Intrinsics.checkNotNullParameter(petBadgeProvider, "petBadgeProvider");
        Intrinsics.checkNotNullParameter(petAgeProvider, "petAgeProvider");
        this.f231120a = petImageBuilder;
        this.f231121b = petAgeProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.revolut.core.ui_kit.models.Style] */
    public final e a(ArrayList arrayList, String str, int i, f1 f1Var) {
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        List list;
        List listC;
        List list2;
        List listC2;
        e eVarB = u.b();
        if (!arrayList.isEmpty()) {
            List list3 = null;
            eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            int i2 = 10;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                d0 pet = (d0) it8.next();
                ?? custom = e0.o(pet) == ky7.c.CANCELLED ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : list3;
                String strQ = j6.a.q("ID_PREFIX_PET_ITEM_", pet.f325764a);
                TextClause textClause = new TextClause(pet.d, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                yx7.b bVarB = this.f231121b.b(pet);
                String str2 = pet.f.f325774b;
                int i3 = bVarB.f317583a;
                int i5 = c.f231119a[bVarB.f317584b.ordinal()];
                if (i5 == 1) {
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.pets_pet_profile_header_description_month, Integer.valueOf(i3), v.k(Integer.valueOf(i3), str2), (Style) null, 24);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.pets_pet_profile_header_description_year, Integer.valueOf(i3), v.k(Integer.valueOf(i3), str2), (Style) null, 24);
                }
                ec ecVar = new ec(this.f231120a.b(pet, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507)));
                Intrinsics.checkNotNullParameter(pet, "pet");
                int i6 = yx7.e.f317588a[e0.o(pet).ordinal()];
                if (i6 == 1) {
                    s0 s0Var = pet.o;
                    r0 r0Var = s0Var instanceof r0 ? (r0) s0Var : null;
                    if (r0Var != null) {
                        TagViewData.Companion companion = TagViewData.INSTANCE;
                        int i21 = R$drawable.uikit_icn_24_star_filled;
                        String str3 = r0Var.d;
                        int i22 = R$attr.uikit_colorGroupedBackground;
                        int i32 = R$attr.uikit_colorForeground;
                        Integer numValueOf = Integer.valueOf(i21);
                        companion.getClass();
                        TagViewData tagViewDataC = TagViewData.Companion.c(str3, i22, i32, numValueOf);
                        list = null;
                        listC = u.c(new pc("active-policy-tag", tagViewDataC, null));
                    } else {
                        list = null;
                        listC = f0.f322471a;
                    }
                } else if (i6 == 2) {
                    if (f1Var != null) {
                        e1 e1Var = f1Var.f325783b;
                        TagViewData.Companion companion2 = TagViewData.INSTANCE;
                        int iA = s.a(e1Var.f325777b);
                        String str4 = e1Var.f325776a;
                        int i33 = R$attr.uikit_colorGroupedBackground;
                        int i43 = R$attr.uikit_colorForeground;
                        Integer numValueOf2 = Integer.valueOf(iA);
                        companion2.getClass();
                        listC2 = u.c(new pc("in-progress-policy-tag", TagViewData.Companion.c(str4, i33, i43, numValueOf2), null));
                    } else {
                        listC2 = f0.f322471a;
                    }
                    list2 = listC2;
                    list = null;
                    list3 = list;
                    ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(strQ, ecVar, textClause, textLocalisedQuantityClause, list2, pet, null, false, false, false, 960);
                    yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                    arrayList2.add(model);
                    i2 = 10;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listC = u.c(new pc("cancelled-policy-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_16_canceled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.pets_dashboard_pet_tile_status_cancelled, list3, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), i2), new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), list3));
                    list = list3;
                }
                list2 = listC;
                list3 = list;
                ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model(strQ, ecVar, textClause, textLocalisedQuantityClause, list2, pet, null, false, false, false, 960);
                yp0.b.l(model2, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                arrayList2.add(model2);
                i2 = 10;
            }
            a0.x(arrayList2, eVarB);
        }
        return u.a(eVarB);
    }
}
