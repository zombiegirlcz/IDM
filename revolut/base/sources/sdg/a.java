package sdg;

import i9g.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f261872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f261873b;

    public a(yk0.d schedulerProvider, b0 travelHotelsPropertyInteractor) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        this.f261872a = travelHotelsPropertyInteractor;
        this.f261873b = j6.a.h("create(...)");
    }
}
