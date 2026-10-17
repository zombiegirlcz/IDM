package tw0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f274801a = new d1();

    private d1() {
    }

    @Override // tw0.g1
    public final int a(op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        int i = c1.f274798a[widgetSize.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return 4;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i2;
    }

    @Override // tw0.g1
    public final aw0.d0 b(op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        int i = c1.f274798a[widgetSize.ordinal()];
        if (i == 1) {
            aw0.d0.Companion.getClass();
            return aw0.d0.f10273c;
        }
        aw0.d0 d0Var = aw0.d0.d;
        if (i == 2) {
            aw0.d0.Companion.getClass();
            return d0Var;
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
        return 4;
    }
}
