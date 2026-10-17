package lq0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends m {

    @NotNull
    private static final h Companion = new h();
    public final ConstraintLayout d;
    public final i e;

    public j(ConstraintLayout rootView, i slideDirection) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(slideDirection, "slideDirection");
        this.d = rootView;
        this.e = slideDirection;
        this.f199172c = false;
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f199181b.put("fractionalHorizontalSlide:visibility", Integer.valueOf(holder.f199180a.getVisibility()));
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HashMap map = holder.f199181b;
        View view = holder.f199180a;
        map.put("fractionalHorizontalSlide:visibility", Integer.valueOf(view.getVisibility()));
        map.put("fractionalHorizontalSlide:translation_x", Float.valueOf(view.getTranslationX()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    @Override // lq0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lq0.b g(lq0.r r8, lq0.r r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L7
            android.view.View r1 = r8.f199180a
            if (r1 != 0) goto Lb
        L7:
            if (r9 == 0) goto L79
            android.view.View r1 = r9.f199180a
        Lb:
            if (r8 == 0) goto L16
            java.util.HashMap r9 = r8.f199181b
            java.lang.String r2 = "fractionalHorizontalSlide:visibility"
            java.lang.Object r9 = r9.get(r2)
            goto L17
        L16:
            r9 = r0
        L17:
            boolean r2 = r9 instanceof java.lang.Integer
            if (r2 == 0) goto L1e
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L1f
        L1e:
            r9 = r0
        L1f:
            if (r9 == 0) goto L26
            int r9 = r9.intValue()
            goto L28
        L26:
            r9 = 8
        L28:
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L2e
            r9 = r3
            goto L2f
        L2e:
            r9 = r2
        L2f:
            lq0.i r4 = r7.e
            lq0.i r5 = lq0.i.LEFT_TO_RIGHT
            if (r4 != r5) goto L38
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3a
        L38:
            r4 = 1065353216(0x3f800000, float:1.0)
        L3a:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.d
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            r5 = 0
            if (r9 == 0) goto L4a
            r8 = r4
            goto L66
        L4a:
            if (r8 == 0) goto L55
            java.util.HashMap r8 = r8.f199181b
            java.lang.String r6 = "fractionalHorizontalSlide:translation_x"
            java.lang.Object r8 = r8.get(r6)
            goto L56
        L55:
            r8 = r0
        L56:
            boolean r6 = r8 instanceof java.lang.Float
            if (r6 == 0) goto L5d
            java.lang.Float r8 = (java.lang.Float) r8
            goto L5e
        L5d:
            r8 = r0
        L5e:
            if (r8 == 0) goto L65
            float r8 = r8.floatValue()
            goto L66
        L65:
            r8 = r5
        L66:
            if (r9 == 0) goto L69
            goto L6a
        L69:
            float r5 = -r4
        L6a:
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 != 0) goto L6f
            r2 = r3
        L6f:
            if (r2 == 0) goto L72
            goto L79
        L72:
            mq0.a r9 = new mq0.a
            r0 = 0
            r9.<init>(r1, r8, r5, r0)
            return r9
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lq0.j.g(lq0.r, lq0.r):lq0.b");
    }
}
