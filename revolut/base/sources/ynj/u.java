package ynj;

import dej.d3;
import dej.f3;
import dej.g3;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f315492a = new u();

    private u() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num;
        d3 first = (d3) obj2;
        d3 second = (d3) obj3;
        Integer num2 = 0;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        g3 g3Var = first.f113523a.f113663t;
        f3 f3Var = g3Var != null ? g3Var.f113541a : null;
        int i = f3Var == null ? -1 : t.f315491a[f3Var.ordinal()];
        if (i == -1) {
            num = 3;
        } else if (i == 1) {
            num = num2;
        } else if (i == 2) {
            num = 1;
        } else if (i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            num = 3;
        } else {
            num = 2;
        }
        g3 g3Var2 = second.f113523a.f113663t;
        f3 f3Var2 = g3Var2 != null ? g3Var2.f113541a : null;
        int i2 = f3Var2 == null ? -1 : t.f315491a[f3Var2.ordinal()];
        if (i2 == -1) {
            num2 = 3;
        } else if (i2 != 1) {
            if (i2 == 2) {
                num2 = 1;
            } else if (i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                num2 = 3;
            } else {
                num2 = 2;
            }
        }
        return cim.b.b(num, num2);
    }
}
