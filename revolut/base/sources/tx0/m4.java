package tx0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;

/* JADX INFO: loaded from: classes20.dex */
public final class m4 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j4 f275203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ au0.o f275204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SlidingFromTopViewContainer f275205c;

    public m4(au0.o oVar, SlidingFromTopViewContainer slidingFromTopViewContainer, j4 j4Var) {
        this.f275203a = j4Var;
        this.f275204b = oVar;
        this.f275205c = slidingFromTopViewContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r6 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            int[] r5 = tx0.l4.f275191a
            tx0.j4 r6 = r4.f275203a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 0
            r0 = 0
            au0.o r1 = r4.f275204b
            r2 = 1
            if (r5 == r2) goto L34
            r3 = 2
            if (r5 != r3) goto L2e
            float r5 = r1.getExpandRatio()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L23
            if (r7 <= 0) goto L2c
        L23:
            float r5 = r1.getExpandRatio()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L2c
            goto L3d
        L2c:
            r6 = r2
            goto L3d
        L2e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L34:
            float r5 = r1.getExpandRatio()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L2c
        L3d:
            com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer r5 = r4.f275205c
            r5.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.m4.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
