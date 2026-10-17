package xv7;

import com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f309220a;

    public l(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f309220a = uiKitResources;
    }

    public static nr7.c a(GenericBanner.GenericBannerAction genericBannerAction) {
        Intrinsics.checkNotNullParameter(genericBannerAction, "<this>");
        if (genericBannerAction instanceof GenericBanner.GenericBannerAction.Deeplink) {
            return new nr7.c(((GenericBanner.GenericBannerAction.Deeplink) genericBannerAction).f75943b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
