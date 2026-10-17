package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CompactCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CompactCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/b4;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class CompactCellDelegate extends BaseRecyclerViewDelegate<Model, b4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52103c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CompactCellDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "Lgx0/a;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, TrackableItem, qv0.p, gx0.a {
    }

    public CompactCellDelegate() {
        super(R$layout.internal_delegate_compact_cell, new ip0.h8(27));
        this.f52103c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        ihm.f fVarD = v0.a.d("create(...)");
        this.e = fVarD;
        this.f = v0.a.d("create(...)");
        new i4g.g(1, fVarD, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 16);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_compact_cell));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((b4) viewHolder, i, list);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((b4) bVar, i, list);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.b4 r13, int r14, java.util.List r15) {
        /*
            r12 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "data"
            r1 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            super.p(r13, r1, r14, r15)
            r13 = r15
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r14 = r13 instanceof java.util.Collection
            if (r14 == 0) goto L24
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L24
            goto L33
        L24:
            java.util.Iterator r13 = r13.iterator()
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L33
            r13.next()
            r13 = r1
            goto L34
        L33:
            r13 = r15
        L34:
            if (r13 != 0) goto L38
            zhm.f0 r13 = zhm.f0.f322471a
        L38:
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.CompactCellDelegate.Payload>"
            kotlin.jvm.internal.Intrinsics.i(r13, r14)
            boolean r14 = r13.isEmpty()
            java.util.Collection r15 = (java.util.Collection) r15
            int r15 = r15.size()
            r0 = 0
            r2 = r14
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r0
            r0 = r9
        L52:
            if (r10 >= r15) goto L8b
            java.lang.Object r11 = r13.get(r10)
            if (r11 != 0) goto L85
            if (r0 == 0) goto L84
            if (r2 == 0) goto L83
            if (r14 == 0) goto L82
            if (r5 == 0) goto L81
            if (r8 == 0) goto L80
            if (r4 == 0) goto L7f
            if (r3 == 0) goto L7e
            if (r6 == 0) goto L7d
            if (r7 == 0) goto L7c
            if (r9 == 0) goto L7b
            int r10 = r10 + 1
            r9 = 1
            r14 = r9
            r0 = r14
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            goto L52
        L7b:
            throw r1
        L7c:
            throw r1
        L7d:
            throw r1
        L7e:
            throw r1
        L7f:
            throw r1
        L80:
            throw r1
        L81:
            throw r1
        L82:
            throw r1
        L83:
            throw r1
        L84:
            throw r1
        L85:
            java.lang.ClassCastException r13 = new java.lang.ClassCastException
            r13.<init>()
            throw r13
        L8b:
            if (r14 != 0) goto La8
            if (r0 != 0) goto La7
            if (r2 != 0) goto La6
            if (r3 != 0) goto La5
            if (r4 != 0) goto La5
            if (r5 != 0) goto La4
            if (r6 != 0) goto La4
            if (r7 != 0) goto La4
            if (r8 != 0) goto La3
            if (r6 != 0) goto La3
            if (r9 == 0) goto La2
            goto La3
        La2:
            throw r1
        La3:
            throw r1
        La4:
            throw r1
        La5:
            throw r1
        La6:
            throw r1
        La7:
            throw r1
        La8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.CompactCellDelegate.p(com.revolut.core.ui_kit.delegates.b4, int, java.util.List):void");
    }
}
