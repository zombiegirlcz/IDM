package jid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oid.e f174430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ihm.b f174431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f174432c;
    public final Object d;

    public d(oid.e shopsCarouselTilesRepository, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(shopsCarouselTilesRepository, "shopsCarouselTilesRepository");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f174430a = shopsCarouselTilesRepository;
        this.f174431b = j6.a.h("create(...)");
        this.d = te0.w.y0(new b(this, schedulerProvider));
    }
}
