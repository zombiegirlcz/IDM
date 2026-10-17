package sda;

import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f261843a;

    public e(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f261843a = deeplinkParser;
    }

    public final PocketDetailsInitialAction.ShowCountryPicker a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (Intrinsics.f((String) deeplink.d.get("action"), "country_picker")) {
            return PocketDetailsInitialAction.ShowCountryPicker.f80778a;
        }
        return null;
    }
}
