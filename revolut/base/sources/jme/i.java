package jme;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.lifestyle.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.c f176613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fme.f f176614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hme.a f176615c;
    public final m19.c d;
    public final gte.a e;

    public i(itb.c headerUiProvider, fme.f revPointsHeaderMapper, hme.a lifestyleIntroV2Provider, m19.c contentGatewayHeaderPostSlotMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        Intrinsics.checkNotNullParameter(revPointsHeaderMapper, "revPointsHeaderMapper");
        Intrinsics.checkNotNullParameter(lifestyleIntroV2Provider, "lifestyleIntroV2Provider");
        Intrinsics.checkNotNullParameter(contentGatewayHeaderPostSlotMapper, "contentGatewayHeaderPostSlotMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176613a = headerUiProvider;
        this.f176614b = revPointsHeaderMapper;
        this.f176615c = lifestyleIntroV2Provider;
        this.d = contentGatewayHeaderPostSlotMapper;
        this.e = featureToggleInteractor;
    }

    public static IconNavBarMenuItem a() {
        return new IconNavBarMenuItem("CARDS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.tab_lifestyle_accessibility_cards, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
