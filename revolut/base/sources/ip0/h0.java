package ip0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.v f164486b;

    public /* synthetic */ h0(com.revolut.core.ui_kit.delegates.v vVar, int i) {
        this.f164485a = i;
        this.f164486b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        bw0.n hintType = (bw0.n) obj2;
        switch (this.f164485a) {
            case 0:
                Intrinsics.checkNotNullParameter(hintType, "hintType");
                int i = q0.f165907b[hintType.ordinal()];
                if (i == 1) {
                    return te0.w.h(this.f164486b);
                }
                if (i == 2) {
                    return efm.r.empty();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Intrinsics.checkNotNullParameter(hintType, "hintType");
                int i2 = q0.f165907b[hintType.ordinal()];
                if (i2 == 1) {
                    return efm.r.empty();
                }
                if (i2 == 2) {
                    return te0.w.h(this.f164486b);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Intrinsics.checkNotNullParameter(hintType, "hintType");
                int i3 = q0.f165907b[hintType.ordinal()];
                if (i3 == 1) {
                    return te0.w.h(this.f164486b);
                }
                if (i3 == 2) {
                    return efm.r.empty();
                }
                throw new NoWhenBranchMatchedException();
            default:
                Intrinsics.checkNotNullParameter(hintType, "hintType");
                int i5 = q0.f165907b[hintType.ordinal()];
                if (i5 == 1) {
                    return efm.r.empty();
                }
                if (i5 == 2) {
                    return te0.w.h(this.f164486b);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
