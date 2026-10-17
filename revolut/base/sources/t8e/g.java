package t8e;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.g0;
import com.revolut.core.ui_kit.models.p;
import com.revolut.core.ui_kit.models.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f268887a;

    public g(fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f268887a = qrCodeGenerator;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i80.a aVarL = fkg.a.l(this.f268887a, domainState.f268880b, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36);
        g0 g0Var = new g0(new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarL, 36), new QrCodeAppearance.Layer.Image(domainState.f268881c, true)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28));
        p pVar = new p(null, new TextClause(domainState.f268879a.f89113c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pocket_link_qr_description, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(domainState.f268880b, (Style) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, (o9) null, (List) null, 122), 1);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pocket_link_qr_action_share_link, null, null, 14);
        mx0.d dVar = mx0.d.INVERTED_PRIMARY;
        return new fpa.g(new ProfileCardModel.Loaded(null, g0Var, pVar, new y(v.k(new ActionsView.Item("SHARE_SUBACCOUNT_LINK_BUTTON_ID", dVar, false, null, null, textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("EDIT_SUBACCOUNT_NAME_BUTTON_ID", dVar, false, null, null, new TextLocalisedClause(R$string.pocket_link_qr_action_edit_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("CHANGE_SUBACCOUNT_WALLPAPER_BUTTON_ID", dVar, false, null, null, new TextLocalisedClause(R$string.pocket_link_qr_action_edit_wallpaper, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_camera, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668))), null, 113), null, null, 6);
    }
}
