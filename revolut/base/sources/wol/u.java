package wol;

import android.os.Parcelable;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.ud;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import ip0.fm;
import ip0.h70;
import ip0.i70;
import ip0.jh0;
import ip0.l70;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        List listC2;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        l lVar = domainState.f298969a;
        if (lVar instanceof i) {
            i80.a aVar = ((i) lVar).f298965a;
            l70 l70Var = new l70("ID_QR_CODE_DATA_STATE_ITEM", new QrCodeImage(aVar.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVar, 20), new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, Integer.valueOf(R$attr.uikit_colorBackground), R$attr.uikit_colorForeground, 2.0f, 24.0f), false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), false, 0, SyslogConstants.LOG_CLOCK);
            yp0.b.r(l70Var, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 12);
            listC = zhm.u.c(l70Var);
        } else if (lVar instanceof j) {
            ud udVar = new ud(new TextLocalisedClause(R$string.revolut_sso_qr_code_expired_action, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_qr_code_expired_description, null, null, 14));
            int i = R$attr.uikit_dp0;
            List listC3 = zhm.u.c(new QRCodeDelegate.Model("ID_QR_CODE_DATA_STATE_ITEM", null, udVar, null, null, i, i, i, i, 50050));
            int i2 = R$attr.uikit_dp32;
            int i3 = R$attr.uikit_dp16;
            int i5 = R$attr.uikit_dp48;
            yp0.b.k(listC3, i2, i3, i5, i5, 16);
            listC = listC3;
        } else {
            if (!lVar.equals(k.f298968a)) {
                throw new NoWhenBranchMatchedException();
            }
            i70 i70Var = new i70("ID_LOADING_QR_CODE_CHALLENGE", h70.NO_LINES, 2);
            yp0.b.r(i70Var, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 12);
            listC = zhm.u.c(i70Var);
        }
        eVarB.addAll(listC);
        h hVar = domainState.f298970b;
        if (hVar.equals(e.f298961a)) {
            listC2 = f0.f322471a;
        } else if (hVar instanceof f) {
            f fVar = (f) hVar;
            RowDelegate.Model model = new RowDelegate.Model("ID_QR_CODE_FOOTER", null, new TextLocalisedClause(R$string.revolut_sso_qr_code_operation_title, zhm.u.c(fVar.f298962a), null, 12), null, 0, new TextLocalisedClause(R$string.revolut_sso_qr_code_operation_description, zhm.u.c(fVar.f298963b), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC2 = zhm.u.c(model);
        } else {
            if (!hVar.equals(g.f298964a)) {
                throw new NoWhenBranchMatchedException();
            }
            List listC4 = zhm.u.c(new fm("OPERATION_BANNER_STATE_LOADING"));
            yp0.b.k(listC4, 0, 0, 0, 0, 31);
            listC2 = listC4;
        }
        eVarB.addAll(listC2);
        l lVar2 = domainState.f298969a;
        od0.a aVar2 = od0.a.f224253a;
        eVarB.addAll((od0.a.e() && (lVar2 instanceof i)) ? yp0.b.i(new nh("ID_DEBUG_SUGGESTIONS", v.k(new SuggestionsBarDelegate.Suggestion("ID_DEBUG_COPY_BUTTON", new TextClause("Copy", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, 508), new SuggestionsBarDelegate.Suggestion("ID_DEBUG_OPEN_BUTTON", new TextClause("Open", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, 508), new SuggestionsBarDelegate.Suggestion("ID_DEBUG_REFRESH_BUTTON", new TextClause("Refresh", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, 508), new SuggestionsBarDelegate.Suggestion("ID_DEBUG_SKIP_BUTTON", new TextClause("Skip", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, 508)), null, jh0.HORIZONTAL_SCROLLER, 0, 0, 0, 0, 0, 32756), new ListSubheaderDelegate.Model("ID_DEBUG_TITLE", (Image) new ResourceImage(R$drawable.uikit_icn_24_bug, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) new TextClause("[DEV] Debug utils", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126) : f0.f322471a);
        return new q(zhm.u.a(eVarB));
    }
}
