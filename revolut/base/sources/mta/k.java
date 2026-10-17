package mta;

import android.graphics.drawable.GradientDrawable;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.raffle.api.R$string;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import java.util.ArrayList;
import java.util.List;
import kad.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f208788a;

    public k(kdh.b shareRaffleCardGradientProvider, ota.a shareRaffleActionsMapper, ota.b shareRaffleQrCodeMapper) {
        Intrinsics.checkNotNullParameter(shareRaffleCardGradientProvider, "shareRaffleCardGradientProvider");
        Intrinsics.checkNotNullParameter(shareRaffleActionsMapper, "shareRaffleActionsMapper");
        Intrinsics.checkNotNullParameter(shareRaffleQrCodeMapper, "shareRaffleQrCodeMapper");
        this.f208788a = shareRaffleCardGradientProvider;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        QrCodeImage qrCodeImage;
        r rVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$drawable.uikit_icn_rect_background;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGroupedBackground);
        gz0.b bVar = gz0.b.CenterCrop;
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, numValueOf, (List) null, new ImageTransformations(null, null, null, bVar, 24, null, null, 103), (Clause) null, 182);
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo = domainState.f208776a;
        UrlImage urlImage = new UrlImage(raffleCampaign$ShareInfo.f81625a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, bVar, 24, null, null, 103), null, null, false, false, 507902);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_revolut_logo, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f208788a.f182900c.getValue();
        i80.a qrCode = domainState.f208777b;
        if (qrCode != null) {
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            qrCodeImage = new QrCodeImage(qrCode.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(700, 7, new QrCodeAppearance.Layer.Image(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, Integer.valueOf(R$attr.uikit_colorGreyTone2), R$attr.uikit_colorForeground, 1.5f, null, null, 48), false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
        } else {
            qrCodeImage = null;
        }
        TextClause textClause = new TextClause(raffleCampaign$ShareInfo.f81626b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(raffleCampaign$ShareInfo.f81627c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ArrayList<kad.a> actions = domainState.f208778c;
        Intrinsics.checkNotNullParameter(actions, "actions");
        ArrayList arrayList = new ArrayList(w.t(actions, 10));
        for (kad.a aVar : actions) {
            if (aVar instanceof kad.b) {
                rVar = new r("INSTAGRAM", Integer.valueOf(R$string.crypto_raffle_share_action_instagram), Integer.valueOf(R$drawable.uikit_icn_24_logo_instagram));
            } else if (aVar instanceof a.C1040a) {
                rVar = new r("MORE", Integer.valueOf(R$string.crypto_raffle_share_action_more), Integer.valueOf(R$drawable.uikit_icn_24_more));
            } else if (aVar instanceof kad.d) {
                rVar = new r("X", Integer.valueOf(R$string.crypto_raffle_share_action_x), Integer.valueOf(R$drawable.uikit_icn_24_logo_twitter));
            } else {
                if (!(aVar instanceof kad.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVar = new r("WHATSAPP", Integer.valueOf(R$string.crypto_raffle_share_action_whatsapp), Integer.valueOf(R$drawable.uikit_icn_24_logo_whatsapp));
            }
            arrayList.add(new ActionsView.Item((String) rVar.f314201a, mx0.d.CONTEXTUAL, false, null, null, new TextLocalisedClause(((Number) rVar.f314202b).intValue(), null, null, 14), new ResourceImage(((Number) rVar.f314203c).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, aVar, null, 24476));
        }
        return new g(arrayList, resourceImage, urlImage, gradientDrawable, qrCodeImage, resourceImage2, textClause, textClause2);
    }
}
