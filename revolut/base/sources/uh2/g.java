package uh2;

import h12.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh2.a f280058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f280059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ki2.b f280060c;

    public g(qh2.a weroInteractor, h apmAreaProvider, ki2.b weroPayInteractor) {
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        Intrinsics.checkNotNullParameter(weroPayInteractor, "weroPayInteractor");
        this.f280058a = weroInteractor;
        this.f280059b = apmAreaProvider;
        this.f280060c = weroPayInteractor;
    }
}
