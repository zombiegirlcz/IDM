package ahe;

import com.google.common.collect.ImmutableMap;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b {

    @NotNull
    private static final c Companion = new c();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f4982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f4983c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.h(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, pkm.e.MILLISECONDS);
    }

    public d(ImmutableMap providers, m hiddenAccountsDecorator, a1 orderingDecorator) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(hiddenAccountsDecorator, "hiddenAccountsDecorator");
        Intrinsics.checkNotNullParameter(orderingDecorator, "orderingDecorator");
        this.f4981a = providers;
        this.f4982b = hiddenAccountsDecorator;
        this.f4983c = orderingDecorator;
    }
}
