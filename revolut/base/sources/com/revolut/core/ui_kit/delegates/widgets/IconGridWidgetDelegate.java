package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.g7;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/IconGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/IconDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/g7;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/widgets/j2", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IconGridWidgetDelegate extends GridWidgetDelegate<IconDelegate.Model, g7> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/IconGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends GridWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final op0.q e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f55164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55165h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55166j;
        public final GridWidgetDelegate.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public op0.r f55167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f55168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f55169n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f55170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final py0.c f55171q;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.IconGridWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, Clause title, List items, a2 a2Var, int i) {
                a2 a2Var2 = (i & 16) != 0 ? null : a2Var;
                boolean z = (i & 32) != 0;
                boolean z3 = (i & 64) == 0;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                return new Model(listId, op0.q.DYNAMIC, title, items, false, -1, a2Var2, z, z3, 14336);
            }
        }

        public Model(String str, op0.q qVar, Clause clause, List list, boolean z, int i, GridWidgetDelegate.a aVar, boolean z3, boolean z4, int i2) {
            op0.r rVar = op0.r.SEEN;
            z3 = (i2 & 16384) != 0 ? true : z3;
            z4 = (i2 & 32768) != 0 ? false : z4;
            this.d = str;
            this.e = qVar;
            this.f = clause;
            this.f55164g = list;
            this.f55165h = z;
            this.i = i;
            this.f55166j = null;
            this.k = aVar;
            this.f55167l = rVar;
            this.f55168m = 4;
            this.f55169n = z3;
            this.o = z4;
            this.f55170p = 8.0f;
            this.f55171q = new py0.c(clause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: A, reason: from getter */
        public final boolean getO() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getO() {
            return this.f55169n;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getO() {
            return this.f55167l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55167l = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: E, reason: from getter */
        public final GridWidgetDelegate.a getK() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: F, reason: from getter */
        public final List getF55164g() {
            return this.f55164g;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: G */
        public final Clause getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getF55238h() {
            return this.f55165h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: I, reason: from getter */
        public final float getF55121m() {
            return this.f55170p;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: J */
        public final float getF55120l() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: K */
        public final float getK() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: M, reason: from getter */
        public final int getK() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: N, reason: from getter */
        public final int getI() {
            return this.f55168m;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: O */
        public final op0.c2 getF54953h() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: P */
        public final boolean getF55151b() {
            return false;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53837a() {
            return this.d;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55171q;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55164g, model.f55164g) && this.f55165h == model.f55165h && this.i == model.i && Intrinsics.f(this.f55166j, model.f55166j) && Intrinsics.f(this.k, model.k) && this.f55167l == model.f55167l && this.f55168m == model.f55168m && this.f55169n == model.f55169n && this.o == model.o;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f55166j;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.i, j6.a.c(p.a.d(j6.a.c(p.a.b(okl.m.b(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31, false), 31, this.f55164g), 31, this.f55165h), 31);
            Parcelable parcelable = this.f55166j;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 29791;
            GridWidgetDelegate.a aVar = this.k;
            return Boolean.hashCode(this.o) + j6.a.c(j6.a.b(this.f55168m, okl.m.c(this.f55167l, j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, false), 31), 31), 31, this.f55169n);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55166j = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x */
        public final boolean getF() {
            return false;
        }
    }

    public IconGridWidgetDelegate() {
        int i = R$id.internal_icon_grid_widget_view_type;
        op0.v0 rule = new op0.v0(16);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new IconDelegate(), new IconLoadingDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final op0.a2 u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new op0.a2(kli.a.k(context, 8.0f), kli.a.k(context, 8.0f));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final int v(Context context, GridWidgetDelegate.Model data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        int iS = GridWidgetDelegate.s(4, context, data);
        int size = data.getF55164g().size();
        return size < iS ? size : iS;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.IconDelegate");
        efm.r map = ((IconDelegate) obj2).p().map(new op0.x(20, new op0.g((o10.c) widgetModelProvider, 6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
