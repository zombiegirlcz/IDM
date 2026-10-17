package vfg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f288629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f288630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f288631c;
    public final ihm.f d;

    public o(yk0.d schedulerProvider, r travelMilesSearchInteractor) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(travelMilesSearchInteractor, "travelMilesSearchInteractor");
        this.f288629a = travelMilesSearchInteractor;
        this.f288630b = v0.a.d("create(...)");
        this.f288631c = j6.a.h("create(...)");
        this.d = v0.a.d("create(...)");
    }
}
