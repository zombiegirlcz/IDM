package nil;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f216281b = a.a("20", "50", "100");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f216282c = a.a("50", "200", "500");
    public static final ArrayList d = a.a("30", "75", "150");
    public static final ArrayList e = a.a("100", "250", "500");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f216283a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f216283a = featureToggleInteractor;
    }
}
