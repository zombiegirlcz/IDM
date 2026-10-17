package zjc;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rewards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f322789a;

    public l(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f322789a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = this.f322789a;
        lw0.a aVar2 = new lw0.a(new TextClause(aVar.f322779c.f84807a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new lw0.b(new UrlImage(aVar.f322778b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null), null, false, 26);
        f0 f0Var = f0.f322471a;
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.perks_rewards_subscription_check_existing_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.perks_rewards_subscription_check_existing_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "EXISTING_SUBSCRIPTION_CHECK_SECONDARY_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121), f0Var, aVar2);
    }
}
