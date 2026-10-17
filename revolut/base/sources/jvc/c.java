package jvc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final otc.b f178813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f178814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lvc.c f178815c;
    public final gte.a d;

    public c(otc.b securityHubType, n8b.a countryInteractor, lvc.c securityHubWealthProtectionCellMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(securityHubWealthProtectionCellMapper, "securityHubWealthProtectionCellMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f178813a = securityHubType;
        this.f178814b = countryInteractor;
        this.f178815c = securityHubWealthProtectionCellMapper;
        this.d = featureToggleInteractor;
    }

    public static RowDelegate.Model a(c cVar, String str, int i, int i2) {
        cVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
        tf tfVar = new tf(new yy0.h(new TextLocalisedClause(i, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        int i3 = R$attr.uikit_dp8;
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486538200);
    }
}
