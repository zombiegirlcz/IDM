package ny0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements l {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f220606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f220607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f220608c;
    public final int d;
    public final boolean e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f220609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f220610h;
    public final ArrayMap i;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public q(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f220606a = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = c8g.c.e(context, 720.0f);
        this.e = ((Boolean) jo0.g.f176833q.getValue()).booleanValue();
        this.f = new p(0);
        this.f220609g = Integer.MIN_VALUE;
        this.f220610h = new p(0);
        this.i = new ArrayMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    @Override // ny0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r4, java.lang.Object r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            java.lang.String r0 = "requestToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.f()
            ny0.m r0 = new ny0.m
            r1 = 0
            if (r4 >= 0) goto Le
            r4 = r1
        Le:
            if (r6 >= 0) goto L11
            r6 = r1
        L11:
            if (r7 >= 0) goto L14
            r7 = r1
        L14:
            if (r8 >= 0) goto L17
            r8 = r1
        L17:
            r0.<init>(r4, r6, r7, r8)
            androidx.collection.ArrayMap r2 = r3.i
            if (r4 != 0) goto L28
            if (r6 != 0) goto L28
            if (r7 != 0) goto L28
            if (r8 != 0) goto L28
            r2.remove(r5)
            goto L2b
        L28:
            r2.put(r5, r0)
        L2b:
            boolean r4 = r3.f220607b
            if (r4 != 0) goto L31
        L2f:
            r4 = r1
            goto L65
        L31:
            android.view.ViewGroup r4 = r3.f220606a
            int r5 = r4.getWidth()
            if (r5 <= 0) goto L5a
            int r4 = r4.getWidth()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            boolean r5 = r3.e
            if (r5 == 0) goto L2f
            boolean r5 = r3.f220607b
            if (r5 != 0) goto L4c
            goto L2f
        L4c:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r5 = r3.d
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r4 = java.lang.Math.max(r1, r4)
            goto L65
        L5a:
            boolean r4 = r3.f220608c
            if (r4 != 0) goto L2f
            int r4 = r3.f220609g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L65
            goto L2f
        L65:
            r3.c(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0.q.b(int, java.lang.Object, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, boolean z) {
        p pVar = this.f;
        if (pVar.e) {
            ArrayMap arrayMap = this.i;
            int size = arrayMap.getSize();
            int i2 = 0;
            int i3 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                m mVar = (m) arrayMap.valueAt(i21);
                i2 += mVar.f220600a;
                i3 += mVar.f220601b;
                i5 += mVar.f220602c;
                i6 += mVar.d;
            }
            int i22 = pVar.f220603a + i + i2;
            int i32 = pVar.f220604b + i3;
            int i33 = pVar.f220605c + i + i5;
            int i43 = pVar.d + i6;
            ViewGroup viewGroup = this.f220606a;
            if (viewGroup.getPaddingStart() == i22 && viewGroup.getPaddingTop() == i32 && viewGroup.getPaddingEnd() == i33 && viewGroup.getPaddingBottom() == i43) {
                return;
            }
            try {
                ((o) viewGroup).setSuppressLayout(z);
                viewGroup.setPaddingRelative(i22, i32, i33, i43);
                ((o) viewGroup).setSuppressLayout(false);
                p pVar2 = this.f220610h;
                pVar2.f220603a = i22;
                pVar2.f220604b = i32;
                pVar2.f220605c = i33;
                pVar2.d = i43;
                pVar2.e = true;
            } catch (Throwable th10) {
                ((o) viewGroup).setSuppressLayout(false);
                throw th10;
            }
        }
    }

    public final void d(int i) {
        int iMax = (this.e && this.f220607b) ? Math.max(0, (View.MeasureSpec.getSize(i) - this.d) / 2) : 0;
        this.f220609g = iMax;
        f();
        c(iMax, true);
        this.f220608c = false;
    }

    public final void e(boolean z) {
        if (this.f220607b == z) {
            return;
        }
        this.f220607b = z;
        this.f220608c = true;
        this.f220606a.requestLayout();
    }

    public final void f() {
        p pVar = this.f;
        boolean z = pVar.e;
        ViewGroup view = this.f220606a;
        if (z) {
            p comparedTo = this.f220610h;
            if (comparedTo.e) {
                int paddingStart = view.getPaddingStart();
                int paddingTop = view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                Intrinsics.checkNotNullParameter(comparedTo, "comparedTo");
                if (paddingStart != comparedTo.f220603a) {
                    pVar.f220603a = paddingStart;
                }
                if (paddingTop != comparedTo.f220604b) {
                    pVar.f220604b = paddingTop;
                }
                if (paddingEnd != comparedTo.f220605c) {
                    pVar.f220605c = paddingEnd;
                }
                if (paddingBottom != comparedTo.d) {
                    pVar.d = paddingBottom;
                    return;
                }
                return;
            }
        }
        Intrinsics.checkNotNullParameter(view, "view");
        int paddingStart2 = view.getPaddingStart();
        int paddingTop2 = view.getPaddingTop();
        int paddingEnd2 = view.getPaddingEnd();
        int paddingBottom2 = view.getPaddingBottom();
        pVar.f220603a = paddingStart2;
        pVar.f220604b = paddingTop2;
        pVar.f220605c = paddingEnd2;
        pVar.d = paddingBottom2;
        pVar.e = true;
    }
}
