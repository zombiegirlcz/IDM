package hjd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.a9;
import com.revolut.core.ui_kit.delegates.b9;
import com.revolut.core.ui_kit.delegates.c9;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.z8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.impl.R$string;
import hjd.u;
import ip0.ww;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ljd.b;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4g.g f152720a;

    public w(ljd.b mapper, h4g.g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f152720a = shopsFeatureAvailabilityInteractor;
    }

    public static z8 b(bo3.a aVar) {
        co3.a aVar2 = aVar.f17283b;
        double d = aVar2.f25487b;
        co3.a aVar3 = aVar.f17282a;
        return new z8(d, aVar3.f25487b, aVar3.f25486a, aVar2.f25486a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final List a(u data) {
        qv0.i model;
        Intrinsics.checkNotNullParameter(data, "data");
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("SHOPS_COMBINED_NEARBY_SUB_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.shops_screens_home_subheader_rewards, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, 0, 0, 0, 61434);
        if (data instanceof t) {
            model = new d9("SHOPS_COMBINED_NEARBY_NEARBY_MAP", b(((t) data).f152716a), true, new c9(null, f0.f322471a), new ww(new TextLocalisedClause(R$string.shops_widget_nearby_rewards_cashback_no, null, null, 14), null, null), null, null, false, 4064);
            int i = R$attr.uikit_dp0;
            int i2 = R$attr.uikit_dp8;
            yp0.b.l(model, i, i, i2, i2, null, false, 48);
        } else {
            if (!(data instanceof u.a)) {
                if (data instanceof u.b) {
                    MapPlainLoadingDelegate.INSTANCE.getClass();
                    e9 e9Var = new e9("SHOPS_COMBINED_NEARBY_NEARBY_MAP", MapPlainLoadingDelegate.d, false, null, 506);
                    int i3 = R$attr.uikit_dp0;
                    int i5 = R$attr.uikit_dp8;
                    yp0.b.l(e9Var, i3, i3, i5, i5, null, false, 48);
                    model = e9Var;
                } else if (data instanceof v) {
                    bo3.a aVar = ((v) data).f152719a;
                    d9 d9Var = new d9("SHOPS_COMBINED_NEARBY_NEARBY_MAP", aVar != null ? b(aVar) : new a9(0.0d, 0.0d), false, new c9(null, f0.f322471a), new ww(new TextLocalisedClause(R$string.shops_widget_nearby_rewards_cashback_near, null, null, 14), new TextLocalisedClause(R$string.shops_widget_nearby_rewards_enable_location, null, new Click(30, (Integer) null, (Object) null, "SHOPS_COMBINED_NEARBY_NEARBY_MAP", false), 10), new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, null, false, 4064);
                    int i6 = R$attr.uikit_dp0;
                    int i21 = R$attr.uikit_dp8;
                    yp0.b.l(d9Var, i6, i6, i21, i21, null, false, 48);
                    model = d9Var;
                } else {
                    if (!(data instanceof s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s sVar = (s) data;
                    bo3.a aVar2 = sVar.f152713a;
                    List list = sVar.f152714b;
                    ?? r06 = sVar.f152715c;
                    boolean zE = this.f152720a.e();
                    List<ShopsOutlet> listV0 = d0.V0(lid.d.a(list, aVar2), 20);
                    z8 z8VarB = b(aVar2);
                    ArrayList arrayList = new ArrayList();
                    for (ShopsOutlet shopsOutlet : listV0) {
                        ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) r06.get(shopsOutlet.f87057b);
                        yv0.i iVarB = shopsCampaignOffer == null ? null : ljd.b.b(b.AbstractC1105b.C1106b.f195653a, shopsCampaignOffer, shopsOutlet, null, 14.0f, zE);
                        if (iVarB != null) {
                            arrayList.add(iVarB);
                        }
                    }
                    d9 d9Var2 = new d9("SHOPS_COMBINED_NEARBY_NEARBY_MAP", z8VarB, false, new b9(arrayList), null, null, null, false, 4080);
                    int i22 = R$attr.uikit_dp0;
                    int i32 = R$attr.uikit_dp8;
                    model = d9Var2;
                    yp0.b.l(model, i22, i22, i32, i32, null, false, 48);
                }
                return zhm.v.k(model2, model);
            }
            model = new FullScreenStateDelegate.Model("SHOPS_COMBINED_NEARBY_NEARBY_MAP", new TextLocalisedClause(R$string.shops_widget_nearby_rewards_error_title, null, null, 14), null, null, new l6(12, new TextLocalisedClause(R$string.shops_widget_nearby_rewards_error_button, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2028);
            int i33 = R$attr.uikit_dp32;
            int i43 = R$attr.uikit_dp8;
            yp0.b.l(model, i33, i33, i43, i43, null, false, 48);
        }
        return zhm.v.k(model2, model);
    }
}
