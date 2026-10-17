package ldi;

import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f194143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f194144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f194145c;

    public k(f revPointsPocketInteractor, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f194143a = revPointsPocketInteractor;
        this.f194144b = j6.a.h("create(...)");
        this.f194145c = w.y0(new i(this, schedulerProvider));
    }
}
