package com.revolut.core.ui_kit.recycler;

import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import koi.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lqv0/l;", "T", "Lkoi/b;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseGroupRecyclerViewDelegate<T extends l, VH extends b> extends BaseRecyclerViewDelegate<T, VH> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGroupRecyclerViewDelegate(int i, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f58165c = i;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF58164c() {
        return this.f58165c;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public void p(b holder, l data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        q(holder, data, i, payloads);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(koi.b r7, qv0.l r8, int r9, java.util.List r10) {
        /*
            r6 = this;
            java.lang.String r9 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            java.lang.String r9 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r9 = "payloads"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            boolean r9 = r10.isEmpty()
            int r0 = zhm.v.j(r10)
            if (r0 < 0) goto L32
            r1 = 0
        L1b:
            java.lang.Object r2 = r10.get(r1)
            boolean r3 = r2 instanceof qv0.j
            if (r3 == 0) goto L31
            qv0.j r2 = (qv0.j) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L2c
            goto L31
        L2c:
            if (r1 == r0) goto L32
            int r1 = r1 + 1
            goto L1b
        L31:
            r9 = 1
        L32:
            if (r9 == 0) goto L47
            android.view.View r2 = r7.itemView
            java.lang.String r7 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            boolean r3 = r8.getF52162g()
            r4 = 0
            r5 = 24
            r0 = r6
            r1 = r8
            or0.b.d(r0, r1, r2, r3, r4, r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate.q(koi.b, qv0.l, int, java.util.List):void");
    }
}
