package ppa;

import androidx.appcompat.view.ContextThemeWrapper;
import b90.i;
import f01.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v06.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b90.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f238307c;
    public final g d;
    public final s70.a e;
    public final kpa.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f238308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yzl.a f238309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c uiKitResources, ContextThemeWrapper context, g externalDeeplinkRoutingIntentProvider, s70.a intentProvider, kpa.a pushEventTrackerServiceIntentProvider, Set pushMessageActionIntentProviders, yzl.a randomUtils) {
        super(context, new i(context, intentProvider));
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalDeeplinkRoutingIntentProvider, "externalDeeplinkRoutingIntentProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(pushEventTrackerServiceIntentProvider, "pushEventTrackerServiceIntentProvider");
        Intrinsics.checkNotNullParameter(pushMessageActionIntentProviders, "pushMessageActionIntentProviders");
        Intrinsics.checkNotNullParameter(randomUtils, "randomUtils");
        this.f238307c = uiKitResources;
        this.d = externalDeeplinkRoutingIntentProvider;
        this.e = intentProvider;
        this.f = pushEventTrackerServiceIntentProvider;
        this.f238308g = pushMessageActionIntentProviders;
        this.f238309h = randomUtils;
    }
}
