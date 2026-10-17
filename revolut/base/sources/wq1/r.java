package wq1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements jki.p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f299400a = m72.b.u(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f299401b = m72.b.u(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f299402c = m72.b.u(11);
    public static final Regex d = new Regex("^[ABCDEFGHJKLMNPRSTVWXYZ]{2}\\d{3}[ABCDEFGHJKLMNPRSTVWXYZ]{2}$");
    public static final Regex e = new Regex("^[ABCDEFGHJKLMNPRSTVWXYZ]{2}\\d{3}\\d{2}$");
    public static final Regex f = new Regex("^[ABCDEFGHJKLMNPRSTVWXYZ]{2}\\d{3}[ABCDEFGHJKLMNPRSTVWXYZ\\d]{2}$");

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model b(TextLocalisedClause textLocalisedClause) {
        return yp0.r.a(new InputTextDelegate.Model("BILL_TYPE_LIST_ID", textLocalisedClause, new TextLocalisedClause(R$string.pago_pa_bill_type_picker_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }

    public static LabelNavBarMenuItem c() {
        return new LabelNavBarMenuItem("SCAN_MENU_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.pagopa_bill_input_scan, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10), null, null, 504);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h hVar = domainState.f299389a;
        g gVar = domainState.f299390b;
        int i = s.f299403a[hVar.ordinal()];
        Regex regex = null;
        boolean z = false;
        if (i == 1) {
            aim.e eVarB = u.b();
            InputTextDelegate.Model modelB = b(new TextLocalisedClause(R$string.pago_pa_bill_type_picker_notice_auxiliary_title, null, null, 14));
            yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelB);
            InputTextDelegate.Model model = new InputTextDelegate.Model("FISCAL_CODE_LIST_ID", new TextClause(gVar.f299387b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pago_pa_fiscal_code_label, null, null, 14), new TextClause("###########", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, false, f299402c, false, false, false, null, null, 0, -1075839008, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("NOTICE_NUMBER_LIST_ID", new TextClause(gVar.f299386a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pago_pa_notice_number_label, null, null, 14), new TextClause("##################", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, false, f299401b, false, false, false, null, null, 0, -1075839008, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
            aim.e eVarA = u.a(eVarB);
            if (gVar.f299387b.length() == 11 && gVar.f299386a.length() == 18) {
                z = true;
            }
            return new m(eVarA, u.c(c()), z);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        aim.e eVarB2 = u.b();
        InputTextDelegate.Model modelB2 = b(new TextLocalisedClause(R$string.pago_pa_bill_type_picker_vehicle_auxiliary_title, null, null, 14));
        yp0.b.l(modelB2, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(modelB2);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("VEHICLE_PLATE_LIST_ID", new TextClause(gVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pago_pa_vehicle_license_plate_title, null, null, 14), new TextClause("#######", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, null, null, null, null, false, null, null, false, false, 528385, 0, null, false, false, null, false, f299400a, false, false, false, null, null, 0, -1075839008, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(model3);
        mq1.a aVar = gVar.f299388c;
        if (aVar != null) {
            int i2 = s.f299404b[aVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_car, null, null, 14);
            } else if (i2 == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_motorcycle, null, null, 14);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_trailer, null, null, 14);
            }
            textLocalisedClause = textLocalisedClause2;
        } else {
            textLocalisedClause = null;
        }
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model("VEHICLE_TYPE_LIST_ID", textLocalisedClause, null, new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_title, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -28, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(modelA);
        aim.e eVarA2 = u.a(eVarB2);
        int i3 = aVar == null ? -1 : s.f299404b[aVar.ordinal()];
        if (i3 == 1) {
            regex = d;
        } else if (i3 == 2) {
            regex = e;
        } else if (i3 == 3) {
            regex = f;
        }
        if (aVar != null && regex != null && regex.f(gVar.d)) {
            z = true;
        }
        return new m(eVarA2, u.c(c()), z);
    }
}
