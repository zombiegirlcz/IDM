package aw0;

import android.view.View;
import aw0.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m1 {
    public static final ht0.v a(l1 l1Var, View view) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (l1Var instanceof l1.d) {
            return new ht0.u();
        }
        if (l1Var instanceof l1.a) {
            return new ht0.e();
        }
        if (l1Var instanceof l1.b) {
            return new ht0.q(new ht0.e(), view, false, 8.0f);
        }
        if (l1Var instanceof l1.c) {
            return new ht0.q(new ht0.e(), view, true, ((l1.c) l1Var).f10400a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
