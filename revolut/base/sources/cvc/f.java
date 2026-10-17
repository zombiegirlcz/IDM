package cvc;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.b f109329a;

    public f(cej.b esimMobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(esimMobilePlansFeatureAvailabilityInteractor, "esimMobilePlansFeatureAvailabilityInteractor");
        this.f109329a = esimMobilePlansFeatureAvailabilityInteractor;
    }

    public static RowDelegate.Model a(f fVar, int i, TextLocalisedClause textLocalisedClause) {
        return new RowDelegate.Model(a0.d.n("LOST_DEVICE_CELL_ID_", i), new RowDelegate.Model.MainImage.Image24(new BulletImage(new BulletImage.Content.Number(i), Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), (Integer) null, BitmapDescriptorFactory.HUE_RED, 40), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(a(this, 1, ((efj.d) this.f109329a).a() ? new TextLocalisedClause(R$string.security_hub_lost_device_screen_cell_secure_account_subtitle_with_esims, null, null, 14) : new TextLocalisedClause(R$string.security_hub_lost_device_screen_cell_secure_account_subtitle, null, null, 14)), a(this, 2, new TextLocalisedClause(R$string.security_hub_lost_device_screen_cell_verify_identity_title, null, null, 14)), a(this, 3, new TextLocalisedClause(R$string.security_hub_lost_device_screen_cell_reset_passcode_title, null, null, 14)));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d(listK);
    }
}
