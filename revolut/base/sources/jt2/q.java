package jt2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws2.g f178332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu.g f178333b;

    public q(ws2.g stepsStateMapper, vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(stepsStateMapper, "stepsStateMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f178332a = stepsStateMapper;
        this.f178333b = resourceProvider;
    }
}
