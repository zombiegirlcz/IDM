package tw0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f274787a = new a1();

    private a1() {
    }

    @Override // tw0.g1
    public final int a(op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        return 1;
    }

    @Override // tw0.g1
    public final aw0.d0 b(op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        int i = z0.f274895a[widgetSize.ordinal()];
        aw0.d0 d0Var = aw0.d0.f10273c;
        if (i == 1) {
            aw0.d0.Companion.getClass();
            return d0Var;
        }
        if (i == 2) {
            aw0.d0.Companion.getClass();
            return aw0.d0.d;
        }
        if (i == 3) {
            aw0.d0.Companion.getClass();
            return d0Var;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // tw0.g1
    public final int getColumnCount() {
        return 1;
    }
}
