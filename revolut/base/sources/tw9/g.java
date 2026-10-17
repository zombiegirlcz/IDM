package tw9;

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
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.models.g0;
import com.revolut.core.ui_kit.models.q;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.profile.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f274958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f274959b;

    public g(fkg.a qrGenerator, gw9.a helper) {
        Intrinsics.checkNotNullParameter(qrGenerator, "qrGenerator");
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f274958a = qrGenerator;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_logo_revolut;
        int i2 = R$attr.uikit_colorBlack;
        this.f274959b = LayeredImage.Companion.p(companion, i, Integer.valueOf(i2), R$attr.uikit_colorWhite, 4.0f, 24.0f);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String username = domainState.f274954a;
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(username, "username");
        String url2 = j6.a.q("https://", "revolut.me/" + username);
        h90.a aVar = new h90.a(33, 33);
        i80.c cVar = i80.c.H;
        Intrinsics.checkNotNullParameter(url2, "url");
        i80.a aVarL = fkg.a.l(this.f274958a, url2, aVar, cVar, i80.b.QR_CODE, url2.length() > 30 ? null : 4, 4);
        g0 g0Var = new g0(new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarL, 30), new QrCodeAppearance.Layer.Image(this.f274959b, false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28));
        String str = domainState.f274954a;
        return new e(new ProfileCardModel.Loaded(null, g0Var, new q(new TextClause(a10.b.t(str, "username", "@", str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.payment_profile_disclaimer_description, null, null, 14), 1), new a0(new TextLocalisedClause(R$string.payment_profile_action_share_link, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 12), null, 113), domainState.f274955b);
    }
}
