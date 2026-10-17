package pui;

import aw0.o9;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$plurals;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import rui.k;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();
    public static final QrCodeAppearance d = new QrCodeAppearance(null, 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f239901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f239902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fkg.a f239903c;

    public f(k providerLogoMapper, c90.c uiResources, fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(providerLogoMapper, "providerLogoMapper");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f239901a = providerLogoMapper;
        this.f239902b = uiResources;
        this.f239903c = qrCodeGenerator;
    }

    public static List b(List list, boolean z) {
        hg hgVar = new hg("list_id_qr_codes_scroller", list, 1, x4.c.f10604a, null, new gg.b(z, 2), false, false, null, null, 0, 0, 0, 0, 32720);
        int i = R$attr.uikit_dp0;
        yp0.b.r(hgVar, 0, 0, i, i, 3);
        return u.c(hgVar);
    }

    public final QRCodeDelegate.Model a(AsftPass asftPass, AsftPassAdmission asftPassAdmission, int i, QRCodeDelegate.Model.a aVar) {
        int i2 = asftPass.f98725s;
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.asft_pass_details_travellers, Integer.valueOf(i2), v.k(Integer.valueOf(i2), Integer.valueOf(i + 1)), (Style) null, 24);
        String strN = a0.d.n("list_id_qr_code_", i);
        CdnImage cdnImageInvoke = this.f239901a.invoke();
        String str = asftPassAdmission.e;
        m70.a.t(t0.f186434a);
        QRCodeDelegate.Model model = new QRCodeDelegate.Model(strN, cdnImageInvoke, aVar, new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str, " ", asftPassAdmission.f), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedQuantityClause, 0, R$attr.uikit_dp16, 0, 0, 63456);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
