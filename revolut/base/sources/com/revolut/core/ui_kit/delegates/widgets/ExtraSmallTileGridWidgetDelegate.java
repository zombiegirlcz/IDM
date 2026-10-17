package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ExtraSmallLoadingTileDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.oh;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ExtraSmallTileGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExtraSmallTileDelegate$Model;", "Lip0/oh;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/widgets/w0", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraSmallTileGridWidgetDelegate extends GridWidgetDelegate<ExtraSmallTileDelegate.Model, oh> {

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ExtraSmallTileGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends GridWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final op0.q e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f55117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55118h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55119j;
        public final float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f55120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f55121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public op0.r f55122n;
        public final py0.c o;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.ExtraSmallTileGridWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, op0.q qVar, Clause clause, ArrayList arrayList) {
            op0.r rVar = op0.r.SEEN;
            this.d = str;
            this.e = qVar;
            this.f = clause;
            this.f55117g = arrayList;
            this.f55118h = true;
            this.i = 2;
            this.f55119j = null;
            this.k = 4.0f;
            this.f55120l = 4.0f;
            this.f55121m = 4.0f;
            this.f55122n = rVar;
            this.o = new py0.c(clause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54983r() {
            return this.f55122n;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55122n = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: E */
        public final GridWidgetDelegate.a getK() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: F */
        public final List getF55164g() {
            return this.f55117g;
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
            return this.f55118h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: I, reason: from getter */
        public final float getF55121m() {
            return this.f55121m;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: J, reason: from getter */
        public final float getF55120l() {
            return this.f55120l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: K, reason: from getter */
        public final float getK() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        public final float L() {
            return BitmapDescriptorFactory.HUE_RED;
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

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: P */
        public final boolean getF55151b() {
            return false;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF54982q() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52302a() {
            return this.d;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.o;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55117g, model.f55117g) && this.f55118h == model.f55118h && this.i == model.i && Intrinsics.f(this.f55119j, model.f55119j) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.k, model.k) == 0 && Float.compare(this.f55120l, model.f55120l) == 0 && Float.compare(this.f55121m, model.f55121m) == 0 && this.f55122n == model.f55122n;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52303b() {
            return this.f55119j;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.b(this.i, j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f55117g, p.a.b(okl.m.b(this.e, this.d.hashCode() * 31, 31), 31, this.f), 961), 31, this.f55118h), 31), 31, false);
            Parcelable parcelable = this.f55119j;
            return this.f55122n.hashCode() + m72.b.b(this.f55121m, m72.b.b(this.f55120l, m72.b.b(this.k, m72.b.b(BitmapDescriptorFactory.HUE_RED, (iC + (parcelable != null ? parcelable.hashCode() : 0)) * 29791, 31), 31), 31), 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54980n() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55119j = parcelable;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ExtraSmallTileGridWidgetDelegate() {
        int i = R$id.internal_extra_small_tile_grid_widget_view_type;
        op0.v0 rule = new op0.v0(8);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new ExtraSmallTileDelegate(), new ExtraSmallLoadingTileDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final op0.a2 u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 8.0f);
        return new op0.a2(iK, iK);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ExtraSmallTileDelegate");
        efm.r map = ((ExtraSmallTileDelegate) obj2).e.map(new op0.x(12, new op0.g((o10.c) widgetModelProvider, 5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
