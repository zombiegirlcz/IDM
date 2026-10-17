package ms0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.HorizontalProgressView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 extends LinearLayoutManager {

    @NotNull
    private static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HorizontalProgressView f208200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208202c;
    public final int d;
    public final int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f208203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f208204h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(HorizontalProgressView recyclerView) {
        super(recyclerView.getContext(), 0, false);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f208200a = recyclerView;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f208201b = kli.a.k(context, 80.0f);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f208202c = kli.a.k(context2, 113.0f);
        Context context3 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.d = kli.a.k(context3, 8.0f);
        Context context4 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.e = kli.a.k(context4, 4.0f);
        this.f = -1;
        this.f208203g = -1;
        this.f208204h = -1;
        this.i = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return (getItemCount() > 3 || this.i == this.f208201b) && super.getF53278a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getPaddingLeft() {
        Integer numM = m();
        return numM != null ? numM.intValue() : super.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getPaddingRight() {
        Integer numM = m();
        return numM != null ? numM.intValue() : super.getPaddingRight();
    }

    public final Integer m() {
        HorizontalProgressView horizontalProgressView = this.f208200a;
        int measuredWidth = horizontalProgressView.getMeasuredWidth();
        RecyclerView.Adapter adapter = horizontalProgressView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        if (this.f != measuredWidth || this.f208203g != itemCount || this.f208204h == -1) {
            this.f208204h = (1 > itemCount || itemCount >= 4) ? this.e : this.d;
        }
        return Integer.valueOf(this.f208204h);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void measureChildWithMargins(android.view.View r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            r1 = -1
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            int r2 = r11.getWidth()
            int r3 = r11.getItemCount()
            int r4 = r11.getPosition(r12)
            if (r3 != 0) goto L20
            r1 = 0
            goto L72
        L20:
            int r5 = r11.f
            r6 = 3
            int r7 = r11.d
            r8 = 1
            if (r5 != r2) goto L30
            int r5 = r11.f208203g
            if (r5 != r3) goto L30
            int r5 = r11.i
            if (r5 != r1) goto L65
        L30:
            r11.f208203g = r3
            r11.f = r2
            if (r8 > r3) goto L47
            r1 = 4
            if (r3 >= r1) goto L47
            if (r3 != r6) goto L3c
            goto L3d
        L3c:
            r1 = 2
        L3d:
            int r1 = r1 * r7
            int r2 = r2 - r1
            int r2 = r2 / r3
            int r1 = r11.f208201b
            int r1 = java.lang.Math.max(r2, r1)
            goto L63
        L47:
            int r1 = r11.e
            int r5 = r1 * 2
            int r9 = r11.f208202c
            int r10 = r9 * r3
            int r10 = r10 + r5
            if (r2 >= r10) goto L60
            int r2 = r2 - r1
            float r1 = (float) r2
            float r2 = (float) r9
            float r2 = r1 / r2
            double r9 = (double) r2
            double r9 = java.lang.Math.floor(r9)
            float r2 = (float) r9
            float r1 = r1 / r2
            int r1 = (int) r1
            goto L63
        L60:
            int r2 = r2 - r5
            int r1 = r2 / r3
        L63:
            r11.i = r1
        L65:
            if (r3 != r6) goto L70
            if (r4 == 0) goto L6c
            int r3 = r3 - r8
            if (r4 != r3) goto L70
        L6c:
            int r1 = r11.i
            int r1 = r1 + r7
            goto L72
        L70:
            int r1 = r11.i
        L72:
            r0.width = r1
            super.measureChildWithMargins(r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.c1.measureChildWithMargins(android.view.View, int, int):void");
    }
}
