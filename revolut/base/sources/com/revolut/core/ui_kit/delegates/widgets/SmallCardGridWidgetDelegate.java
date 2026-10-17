package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.pg;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SmallCardGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmallCardDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/pg;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/i4", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallCardGridWidgetDelegate extends GridWidgetDelegate<SmallCardDelegate.Model, pg> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SmallCardGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends GridWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final op0.q e;
        public final CompositeClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f55237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55238h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55239j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final py0.c f55240l;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.SmallCardGridWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, op0.q qVar, CompositeClause compositeClause, ArrayList arrayList, boolean z) {
            op0.r rVar = op0.r.SEEN;
            this.d = str;
            this.e = qVar;
            this.f = compositeClause;
            this.f55237g = arrayList;
            this.f55238h = z;
            this.i = 2;
            this.f55239j = null;
            this.k = rVar;
            this.f55240l = new py0.c(compositeClause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getO() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: E */
        public final GridWidgetDelegate.a getK() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: F */
        public final List getF55164g() {
            return this.f55237g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: G */
        public final Clause getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getF55238h() {
            return this.f55238h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: N, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: O */
        public final op0.c2 getF54953h() {
            return null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52903a() {
            return this.d;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55240l;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55237g, model.f55237g) && this.f55238h == model.f55238h && this.i == model.i && Intrinsics.f(this.f55239j, model.f55239j) && this.k == model.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f55239j;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.i, j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f55237g, h30.l.c(this.f, okl.m.b(this.e, this.d.hashCode() * 31, 31), 31), 961), 31, this.f55238h), 31);
            Parcelable parcelable = this.f55239j;
            return this.k.hashCode() + ((iB + (parcelable == null ? 0 : parcelable.hashCode())) * 29791);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55239j = parcelable;
        }
    }

    public SmallCardGridWidgetDelegate() {
        int i = R$id.internal_small_card_grid_widget_view_type;
        op0.v3 rule = new op0.v3(5);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new SmallCardDelegate(null), new SmallCardLoadingDelegate(null));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.SmallCardDelegate");
        efm.r map = ((SmallCardDelegate) obj2).d.map(new op0.o3(7, new op0.g((o10.c) widgetModelProvider, 7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
