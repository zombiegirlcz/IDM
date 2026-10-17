package ms0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f208238a = new e3();

    private e3() {
    }

    @Override // ms0.h3
    public final h3 q(t2 model, u2 sharedState) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        if (model instanceof o2) {
            return v4.a((o2) model, sharedState);
        }
        if (model instanceof p2) {
            return new c3(model, new RuntimeException("Model.Error received"));
        }
        if (model instanceof q2) {
            return new f3(null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
