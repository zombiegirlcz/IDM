package gkc;

import g8i.h;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import n80.c;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkc.a f144371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f144372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f144373c;

    public b(jkc.a rewardsWidgetRepository, c metricsProvider) {
        Intrinsics.checkNotNullParameter(rewardsWidgetRepository, "rewardsWidgetRepository");
        Intrinsics.checkNotNullParameter(metricsProvider, "metricsProvider");
        this.f144371a = rewardsWidgetRepository;
        this.f144372b = metricsProvider;
        this.f144373c = j.b(new h(this, 13));
    }
}
