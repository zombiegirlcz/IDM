package rsd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f257050a;

    public d(kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f257050a = wealthAccountHeaderUiMapper;
    }

    public final LayeredImage a(n2l.j jVar) {
        return LayeredImage.INSTANCE.i(this.f257050a.g(jVar), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }

    public final TextLocalisedClause b(n2l.j jVar, TradingLegalEntityInformation tradingLegalEntityInformation) {
        return this.f257050a.h(jVar, tradingLegalEntityInformation.f105106a, null);
    }
}
