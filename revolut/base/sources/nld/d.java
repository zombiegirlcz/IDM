package nld;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.i4;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pld.h f217116a;

    public d(pld.h errorCodeParser, sqb.d inAppRecommendationsProvider) {
        Intrinsics.checkNotNullParameter(errorCodeParser, "errorCodeParser");
        Intrinsics.checkNotNullParameter(inAppRecommendationsProvider, "inAppRecommendationsProvider");
        this.f217116a = errorCodeParser;
    }

    public static cii.b a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, Image image) {
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, new lw0.b(image, null), null, false, 24);
        SmallActionButtonDelegate.Model model = new SmallActionButtonDelegate.Model("ERROR_INFO_LIST_ID", h4.ACCENT, null, null, textLocalisedClause3, null, new i4(), null, null, 0, 0, 0, 0, 32600);
        yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        return new cii.b(null, u.c(model), aVar);
    }
}
