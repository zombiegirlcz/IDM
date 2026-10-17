package nqf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public b(pqf.b overseasGoodsFieldMapper, pqf.a customReasonFieldMapper) {
        Intrinsics.checkNotNullParameter(overseasGoodsFieldMapper, "overseasGoodsFieldMapper");
        Intrinsics.checkNotNullParameter(customReasonFieldMapper, "customReasonFieldMapper");
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        krf.c cVar = domainState.f218439a;
        wi0.b bVar = domainState.e;
        wi0.b bVar2 = domainState.d;
        boolean z = false;
        if (cVar instanceof krf.d) {
            krf.d transferReason = (krf.d) cVar;
            Intrinsics.checkNotNullParameter(transferReason, "transferReason");
            InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_CUSTOM_REASON_ID", new TextClause(transferReason.f188860a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reason_custom_field_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
            List listC = u.c(model);
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            krf.c cVar2 = domainState.f218439a;
            if ((cVar2 instanceof krf.d) && ((krf.d) cVar2).f188860a.length() > 0) {
                z = true;
            }
            return new n(listC, z);
        }
        if (!(cVar instanceof krf.e)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("INPUT_PRODUCT_NAME_ID", new TextClause(domainState.f218440b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_product_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("SELECTOR_ORIGIN_COUNTRY_ID", bVar2 != null ? new CountryClause(bVar2, null) : null, new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_country_origin, null, null, 14), null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, 524288, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -35655688, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("INPUT_SHIPPINGPORT_ID", new TextClause(domainState.f218441c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_shipping_port, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        InputTextDelegate.Model model5 = new InputTextDelegate.Model("SELECTOR_DESTINATION_COUNTRY_ID", bVar != null ? new CountryClause(bVar, null) : null, new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_country_destination, null, null, 14), null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, 524288, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -35655688, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model5, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        List listK = v.k(model2, model3, model4, model5);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f218440b.length() > 0 && domainState.f218441c.length() > 0 && bVar2 != null && bVar != null) {
            z = true;
        }
        return new n(listK, z);
    }
}
