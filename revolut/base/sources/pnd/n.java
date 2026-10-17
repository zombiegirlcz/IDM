package pnd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f237702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f237703b;

    public n(c accountMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237702a = accountMapper;
        this.f237703b = featureToggleInteractor;
    }
}
