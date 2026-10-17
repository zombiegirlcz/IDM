package au0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import au0.i4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p5 f9315a = new p5();

    private p5() {
    }

    public static q5 a(View fromView, Integer num) {
        Intrinsics.checkNotNullParameter(fromView, "fromView");
        i4.Companion.getClass();
        i4 i4VarA = i4.a.a(fromView);
        Object obj2 = null;
        if (i4VarA == null) {
            return null;
        }
        int childCount = i4VarA.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = i4VarA.getChildAt(i);
            Intrinsics.h(childAt);
            if ((childAt instanceof q5) && num != null && Intrinsics.f(childAt.getTag(num.intValue()), Boolean.TRUE)) {
                obj2 = childAt;
                break;
            }
            i++;
        }
        if (obj2 != null) {
            return (q5) obj2;
        }
        Context context = i4VarA.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u5 u5Var = new u5(context);
        if (num != null) {
            u5Var.setTag(num.intValue(), Boolean.TRUE);
        }
        i4VarA.addView(u5Var, new ViewGroup.LayoutParams(-1, -1));
        return u5Var;
    }
}
