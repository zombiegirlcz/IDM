package ox2;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cards_core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yik.h;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy2.f f230548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f230549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f230550c;
    public final Object d;

    public f(hy2.f cardDesignInteractor, h pricingPlanStringMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f230548a = cardDesignInteractor;
        this.f230549b = pricingPlanStringMapper;
        this.f230550c = featureToggleInteractor;
        this.d = w.y0(new os2.a(this, 9));
    }

    public static lw0.a a() {
        return new lw0.a(new TextLocalisedClause(R$string.card_choose_header_customisable_hint_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_header_customisable_hint_description, null, null, 14), null, null, false, 28);
    }

    public static aw0.e b() {
        return new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.card_cards_upgrade_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "UPGRADE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(t1.t(domainState.f230543b, domainState.f230544c), new ou6.o(this, 20), new oq3.e(this), new d(this, domainState, 0));
    }
}
