package vfg;

import kotlin.jvm.internal.Intrinsics;
import lfg.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f288624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f288625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f288626c;

    public k(yk0.d schedulerProvider, g0 travelMilesSearchRepository) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(travelMilesSearchRepository, "travelMilesSearchRepository");
        this.f288624a = travelMilesSearchRepository;
        this.f288625b = v0.a.d("create(...)");
        this.f288626c = j6.a.h("create(...)");
    }
}
