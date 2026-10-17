package rui;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements Function0 {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CdnImage f257562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CdnImage f257563c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f257564a;

    static {
        UrlImageDrawable.Shimmering.Companion companion = UrlImageDrawable.Shimmering.INSTANCE;
        f257562b = new CdnImage("logo_v2_light", "mobile/lounges/dp", null, null, companion, null, Constants.TAG_OS_VERSION);
        f257563c = new CdnImage("logo_v2_dark", "mobile/lounges/dp", null, null, companion, null, Constants.TAG_OS_VERSION);
    }

    public k(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f257564a = uiResources;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CdnImage invoke() {
        return CdnImage.a(this.f257564a.d() ? f257563c : f257562b, new ImageTransformations(null, null, null, null, null, 220, null, 95));
    }
}
