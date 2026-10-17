package lxi;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f200584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hxi.l f200585b;

    public f(gte.a featureToggleInteractor, hxi.l eventMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        this.f200584a = featureToggleInteractor;
        this.f200585b = eventMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("ID_PASS_ACTIVITY_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.airport_lounges_pass_activity_home_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.airport_lounges_pass_activity_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }
}
