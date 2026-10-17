package sb3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature.cash_topup.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ek0;
import ip0.i70;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f261495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f261496b;

    public s(fkg.a barcodeGenerator, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(barcodeGenerator, "barcodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f261495a = barcodeGenerator;
        this.f261496b = uiResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        int i;
        qv0.i model;
        int i2;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BarcodeDetails barcodeDetails = domainState.f261480a;
        if (barcodeDetails == null) {
            return new m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new i70("BARCODE_LOADING_LIST_ID", null, 6)));
        }
        b7l.b bVar = barcodeDetails.f65588h;
        c90.c cVar = this.f261496b;
        int iK = kli.a.k(cVar.f22265a, 264.0f);
        int iK2 = kli.a.k(cVar.f22265a, 196.0f);
        int[] iArr = r.f261494a;
        int i3 = iArr[bVar.ordinal()];
        if (i3 == 1) {
            str = "revolut_barzahlen_viacash";
        } else if (i3 == 2) {
            str = "revolut_paysafe";
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "revolut_viacash";
        }
        CdnImage cdnImage = new CdnImage(str, "mobile/logos_and_flags/cash_deposits", null, new ImageTransformations(null, null, null, null, null, 311, 32, 31), null, null, Constants.TAG_E4_CUSTOMER_DATA);
        QrCodeImage qrCodeImage = new QrCodeImage(fkg.a.l(this.f261495a, barcodeDetails.f, new h90.a(iK, iK2), null, i80.b.BARCODE_CODE_128, null, 40).f159408a, new QrCodeAppearance(null, 31), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
        TextClause textClause = new TextClause(barcodeDetails.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_barcode_valid_time, u.c(new TimeClause(barcodeDetails.f65585b.getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
        int i5 = R$attr.uikit_dp16;
        List listC = u.c(new QRCodeDelegate.Model("BARCODE_LIST_ID", cdnImage, qrCodeImage, textClause, textLocalisedClause, null, i5, i5, i5, i5, 50016));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List list = listC;
        qv0.i[] elements = new qv0.i[2];
        dj0.d dVar = barcodeDetails.d;
        if (dVar.k()) {
            model = new CellDetailsDelegate.Model("FEE_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_fee, null, null, 14), new TextLocalisedClause(R$string.topup_cash_barcode_deposit_fee_no_fee, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            i = 14;
        } else {
            i = 14;
            model = new CellDetailsActionDelegate.Model("FEE_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, false, null, null, 0, 0, 32736);
        }
        elements[0] = model;
        elements[1] = new CellDetailsDelegate.Model("ESTIMATED_ARRIVAL_ID", new TextLocalisedClause(R$string.topup_cash_barcode_estimated_arrival, null, null, i), new TextLocalisedClause(R$string.topup_cash_barcode_estimated_arrival_value, null, null, i), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listL, list);
        List listK = v.k(new RowDelegate.Model("LOCATIONS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_map_point, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_barcode_locations_action, null, null, i), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880), new RowDelegate.Model("INSTRUCTIONS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_barcode_instructions_action, null, null, i), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880), new RowDelegate.Model("ISSUE_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_megaphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_barcode_report_action, null, null, i), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ArrayList arrayListE02 = d0.E0(listK, arrayListE0);
        List listC2 = u.c(new CellDetailsChevronDelegate.Model("DELETE_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_cancel_action, null, null, i), R$attr.uikit_colorRed, false, null, null, null, 2032));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        ArrayList arrayListE03 = d0.E0(listC2, arrayListE02);
        int i6 = iArr[bVar.ordinal()];
        if (i6 == 1) {
            i2 = R$string.topup_cash_barcode_disclaimer_grenke;
        } else if (i6 == 2) {
            i2 = R$string.topup_cash_barcode_disclaimer_paysafe;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.topup_cash_barcode_disclaimer_viacash;
        }
        return new m(new TextLocalisedClause(R$string.topup_cash_barcode_title, u.c(new MoneyClause(barcodeDetails.f65586c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), d0.E0(u.c(new TextDelegate.Model("DISCLAIMER_LIST_ID", new HtmlLocalisedClause(i2, u.c("DISCLAIMER_LINK_CLICK_ID"), (Integer) null, (Object) null, 28), false, new ek0(0), null, null, 0, 0, 0, 0, 2036)), arrayListE03));
    }
}
