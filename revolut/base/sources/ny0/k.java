package ny0;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f220597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f220598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f220599c;

    public k(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f220597a = view;
    }

    public static void a(ConstraintSet constraintSet, View view, int i, int i2) {
        ConstraintSet.Constraint constraint = constraintSet.getConstraint(view.getId());
        if (constraint == null) {
            return;
        }
        j jVarC = c(i2, view);
        ConstraintSet.Layout layout = constraint.layout;
        Integer num = jVarC.f220596c;
        if (num == null || layout.startMargin != num.intValue()) {
            jVarC.f220594a = layout.startMargin;
        }
        Integer num2 = jVarC.d;
        if (num2 == null || layout.endMargin != num2.intValue()) {
            jVarC.f220595b = layout.endMargin;
        }
        int i3 = jVarC.f220594a;
        int i5 = i3 != -1 ? i3 + i : -1;
        int i6 = jVarC.f220595b;
        int i21 = i6 != -1 ? i6 + i : -1;
        if (i5 != -1) {
            constraintSet.setMargin(view.getId(), 6, i5);
        }
        if (i21 != -1) {
            constraintSet.setMargin(view.getId(), 7, i21);
        }
        jVarC.f220596c = Integer.valueOf(i5);
        jVarC.d = Integer.valueOf(i21);
    }

    public static j c(int i, View view) {
        Object tag2 = view.getTag(i);
        if (tag2 instanceof j) {
            return (j) tag2;
        }
        j jVar = new j(0);
        view.setTag(i, jVar);
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0222 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r17) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0.k.b(int):void");
    }

    public final void d(boolean z) {
        if (this.f220598b == z) {
            return;
        }
        this.f220598b = z;
        this.f220599c = true;
        this.f220597a.requestLayout();
    }
}
