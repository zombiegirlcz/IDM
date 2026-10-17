package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.wi;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import ip0.tn0;
import ip0.un0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/VoucherExtraSmallTileDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/wi;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/j4", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TileGridWidgetDelegate extends GridWidgetDelegate<VoucherExtraSmallTileDelegate.Model, wi> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends GridWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final op0.q e;
        public final CompositeClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f55241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55242h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55243j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public op0.r f55244l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final py0.c f55245m;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, TextLocalisedClause title) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                CompositeClause compositeClauseA = yh5.b.a(title);
                op0.q qVar = op0.q.MEDIUM;
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    un0 un0Var = new un0(String.valueOf(it8.nextInt()), tn0.MATCH_PARENT);
                    yp0.b.l(un0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(un0Var);
                }
                return new Model(listId, qVar, compositeClauseA, arrayList, true, null);
            }

            public static Model b(Companion companion, String listId, TextLocalisedClause title, List items, int i) {
                FreelancerWidgetClickData.ProPerks.AllPerks allPerks = (i & 16) != 0 ? null : FreelancerWidgetClickData.ProPerks.AllPerks.f74453a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                op0.q qVar = op0.q.MEDIUM;
                CompositeClause compositeClauseA = yh5.b.a(title);
                List<VoucherExtraSmallTileDelegate.Model> list = items;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (VoucherExtraSmallTileDelegate.Model model : list) {
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                }
                return new Model(listId, qVar, compositeClauseA, arrayList, false, allPerks);
            }
        }

        public Model(String str, op0.q qVar, CompositeClause compositeClause, ArrayList arrayList, boolean z, Object obj2) {
            op0.r rVar = op0.r.SEEN;
            this.d = str;
            this.e = qVar;
            this.f = compositeClause;
            this.f55241g = arrayList;
            this.f55242h = z;
            this.i = 3;
            this.f55243j = null;
            this.k = obj2;
            this.f55244l = rVar;
            this.f55245m = new py0.c(compositeClause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getD() {
            return this.f55244l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55244l = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: E */
        public final GridWidgetDelegate.a getK() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: F */
        public final List getF55164g() {
            return this.f55241g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: G */
        public final Clause getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getF55165h() {
            return this.f55242h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: N, reason: from getter */
        public final int getF55168m() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: O */
        public final op0.c2 getF54953h() {
            return null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55191g() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.d;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55245m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55241g, model.f55241g) && this.f55242h == model.f55242h && this.i == model.i && Intrinsics.f(this.f55243j, model.f55243j) && Intrinsics.f(this.k, model.k) && this.f55244l == model.f55244l;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55278c() {
            return this.f55243j;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.i, j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f55241g, h30.l.c(this.f, okl.m.b(this.e, this.d.hashCode() * 31, 31), 31), 961), 31, this.f55242h), 31);
            Parcelable parcelable = this.f55243j;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.k;
            return this.f55244l.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55243j = parcelable;
        }
    }

    public TileGridWidgetDelegate() {
        int i = R$id.internal_tile_grid_widget_view_type;
        op0.v3 rule = new op0.v3(10);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new VoucherExtraSmallTileDelegate(0), new VoucherExtraSmallLoadingDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate");
        int i = 8;
        efm.r map = ((VoucherExtraSmallTileDelegate) obj2).f53594c.map(new op0.o3(i, new op0.g((o10.c) widgetModelProvider, i)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
