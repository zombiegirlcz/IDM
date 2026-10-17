package vge;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f288981a = new q1();

    private q1() {
    }

    @Override // vge.j0
    public final Flow a(uf0.b originFlow, qfe.g mode) {
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return originFlow;
    }

    @Override // vge.j0
    public final Flow b(Flow originFlow, qfe.h mode) {
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return originFlow;
    }
}
