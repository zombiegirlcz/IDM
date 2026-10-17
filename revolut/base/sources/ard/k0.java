package ard;

import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f8663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f8664c;

    public /* synthetic */ k0(FlowCollector flowCollector, ScreenContentRecyclerView screenContentRecyclerView, int i) {
        this.f8662a = i;
        this.f8663b = flowCollector;
        this.f8664c = screenContentRecyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f8662a
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof ard.o0
            if (r0 == 0) goto L18
            r0 = r6
            ard.o0 r0 = (ard.o0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            ard.o0 r0 = new ard.o0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            r6 = r5
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.revolut.recyclerkit.ScreenContentRecyclerView r6 = r4.f8664c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
            boolean r2 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L47
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L48
        L47:
            r6 = 0
        L48:
            if (r6 != 0) goto L4b
            goto L5d
        L4b:
            int r6 = r6.findFirstVisibleItemPosition()
            r2 = 5
            if (r6 > r2) goto L5d
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f8663b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5f:
            return r1
        L60:
            boolean r0 = r6 instanceof ard.j0
            if (r0 == 0) goto L73
            r0 = r6
            ard.j0 r0 = (ard.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L73
            int r1 = r1 - r2
            r0.v = r1
            goto L78
        L73:
            ard.j0 r0 = new ard.j0
            r0.<init>(r4, r6)
        L78:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L8f
            if (r2 != r3) goto L87
            yhm.o.b(r6)
            goto Lbd
        L87:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L8f:
            yhm.o.b(r6)
            r6 = r5
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.revolut.recyclerkit.ScreenContentRecyclerView r6 = r4.f8664c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
            boolean r2 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto La2
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto La3
        La2:
            r6 = 0
        La3:
            if (r6 != 0) goto La6
            goto Lbd
        La6:
            int r2 = r6.findLastCompletelyVisibleItemPosition()
            int r6 = r6.getItemCount()
            int r6 = r6 + (-5)
            if (r2 <= r6) goto Lbd
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f8663b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto Lbd
            goto Lbf
        Lbd:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ard.k0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
