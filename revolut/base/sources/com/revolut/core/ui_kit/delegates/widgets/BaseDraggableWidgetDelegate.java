package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.p;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0007\u0006\u0007\b\t\n\u000b\u0003¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "T", "Lop0/p;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "op0/q", "op0/r", "Model", "a", "com/revolut/core/ui_kit/delegates/widgets/i", "com/revolut/core/ui_kit/delegates/widgets/j", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseDraggableWidgetDelegate<T extends Model, VH extends op0.p> extends BaseRecyclerViewDelegate<T, VH> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54986c;
    public boolean d;
    public boolean e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tw0.l1 f54987g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lgx0/c;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Model implements koi.j, TrackableItem, gx0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f54988a;

        public boolean A() {
            return false;
        }

        /* JADX INFO: renamed from: B */
        public boolean getF55149l() {
            return true;
        }

        /* JADX INFO: renamed from: C */
        public abstract op0.r getK();

        public abstract void D(op0.r rVar);

        /* JADX INFO: renamed from: x */
        public boolean getF() {
            return true;
        }

        public boolean y() {
            return false;
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Model f54989a;

        public abstract String a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDraggableWidgetDelegate(int i, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f54986c = i;
        this.f = v0.a.d("create(...)");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF98535a() {
        return this.f54986c;
    }

    public final void p(op0.p holder, boolean z) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        c.e eVar = new c.e((qv0.h) null, 3);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.b(this, eVar, itemView, z || this.e, null, (this.e || this.d) ? dr0.j.f117053a : null, null, 40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(op0.p r6, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model r7, int r8, java.util.List r9) {
        /*
            r5 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            super.p(r6, r7, r8, r9)
            com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout r8 = r6.f227373h
            boolean r9 = r5.e
            r0 = 0
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L34
            boolean r9 = r7.getF()
            if (r9 == 0) goto L32
            boolean r9 = r7 instanceof tw0.y
            if (r9 == 0) goto L29
            r9 = r7
            tw0.y r9 = (tw0.y) r9
            goto L2a
        L29:
            r9 = r1
        L2a:
            if (r9 == 0) goto L34
            boolean r9 = r9.e()
            if (r9 != r2) goto L34
        L32:
            r9 = r0
            goto L35
        L34:
            r9 = r2
        L35:
            boolean r3 = r7.getF55149l()
            if (r3 == 0) goto L49
            ag.p r1 = new ag.p
            r3 = 12
            r1.<init>(r5, r3, r6, r7)
            r8.setOnLongTapListener(r1)
            or0.u.p(r8)
            goto L70
        L49:
            boolean r3 = r7.A()
            if (r3 == 0) goto L6a
            ky4.f r1 = new ky4.f
            r3 = 21
            r1.<init>(r5, r3, r6, r7)
            oid.y r3 = new oid.y
            r4 = 29
            r3.<init>(r1, r4)
            r8.setOnLongTapListener(r3)
            et0.f0 r3 = new et0.f0
            r4 = 3
            r3.<init>(r1, r4)
            r8.setOnLongClickListener(r3)
            goto L70
        L6a:
            r8.setOnLongTapListener(r1)
            or0.u.p(r8)
        L70:
            fp0.p r1 = r6.i
            fp0.p.b(r1, r9)
            android.view.View r1 = r1.f137029a
            or0.m.a(r1)
            if (r9 == 0) goto L87
            au0.r2 r9 = new au0.r2
            r3 = 20
            r9.<init>(r5, r7, r3)
            r1.setOnClickListener(r9)
            goto L8a
        L87:
            or0.u.o(r1)
        L8a:
            boolean r9 = r5.e
            r8.setPreviewMode(r9)
            boolean r9 = r5.e
            r6.f227372g = r9
            boolean r6 = r7.y()
            if (r6 == 0) goto L9d
            r8.setClipToOutline(r0)
            goto La0
        L9d:
            r8.setClipToOutline(r2)
        La0:
            boolean r6 = r5.d
            boolean r7 = r5.e
            r6 = r6 | r7
            r8.setElevated(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.p(op0.p, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model, int, java.util.List):void");
    }

    public final void r(Model data, a event) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(event, "event");
        event.f54989a = data;
        this.f.onNext(event);
    }
}
