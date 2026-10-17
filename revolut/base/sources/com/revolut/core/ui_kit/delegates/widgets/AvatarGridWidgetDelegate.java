package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$integer;
import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.ca0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AvatarGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/ReferralContactDelegate$Model;", "Lip0/ca0;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/widgets/e", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvatarGridWidgetDelegate extends GridWidgetDelegate<ReferralContactDelegate.Model, ca0> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AvatarGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends GridWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final op0.q e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f54952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.c2 f54953h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f54954j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f54955l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f54956m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public op0.r f54957n;
        public final float o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f54958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float f54959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final py0.c f54960r;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, TextLocalisedClause title, ArrayList items, Object obj2, int i) {
                Object obj3 = (i & 32) != 0 ? null : obj2;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                op0.q qVar = op0.q.DYNAMIC;
                CompositeClause compositeClauseA = yh5.b.a(title);
                ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
                Iterator it8 = items.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ReferralContactDelegate.Model.e((ReferralContactDelegate.Model) it8.next(), null, null, null, ke.MATCH_PARENT, true, null, 7567));
                }
                return new Model(listId, qVar, compositeClauseA, arrayList, null, false, -1, obj3);
            }

            public static Model b(Companion companion, String listId, Clause title, ArrayList items, op0.c2 c2Var, Object obj2, int i) {
                Object obj3 = (i & 32) != 0 ? null : obj2;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                op0.q qVar = op0.q.LARGE;
                CompositeClause compositeClauseA = yh5.b.a(title);
                ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
                Iterator it8 = items.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ReferralContactDelegate.Model.e((ReferralContactDelegate.Model) it8.next(), null, null, null, ke.MATCH_PARENT, true, null, 7567));
                }
                return new Model(listId, qVar, compositeClauseA, arrayList, c2Var, false, 2, obj3);
            }

            public static Model c(Companion companion, String listId, Clause title, op0.c2 c2Var) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                op0.q qVar = op0.q.LARGE;
                ArrayList arrayList = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    arrayList.add(new ip0.d2(String.valueOf(i), ip0.c2.CIRCLE));
                }
                return new Model(listId, qVar, title, arrayList, c2Var, true, 2, null);
            }

            public static Model d(Companion companion, String listId, TextLocalisedClause title) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                op0.q qVar = op0.q.DYNAMIC;
                ArrayList arrayList = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    arrayList.add(new ip0.d2(String.valueOf(i), ip0.c2.CIRCLE));
                }
                return new Model(listId, qVar, title, arrayList, null, true, 2, null);
            }
        }

        public Model(String str, op0.q qVar, Clause clause, ArrayList arrayList, op0.c2 c2Var, boolean z, int i, Object obj2) {
            op0.r rVar = op0.r.SEEN;
            this.d = str;
            this.e = qVar;
            this.f = clause;
            this.f54952g = arrayList;
            this.f54953h = c2Var;
            this.i = z;
            this.f54954j = 4;
            this.k = i;
            this.f54955l = null;
            this.f54956m = obj2;
            this.f54957n = rVar;
            this.o = 8.0f;
            this.f54958p = 8.0f;
            this.f54959q = 8.0f;
            this.f54960r = new py0.c(clause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
            return this.f54957n;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f54957n = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: E */
        public final GridWidgetDelegate.a getK() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: F */
        public final List getF55164g() {
            return this.f54952g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getF55165h() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: I, reason: from getter */
        public final float getF55170p() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: J, reason: from getter */
        public final float getF54959q() {
            return this.f54959q;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: K, reason: from getter */
        public final float getF54958p() {
            return this.f54958p;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: M, reason: from getter */
        public final int getI() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: N, reason: from getter */
        public final int getF55168m() {
            return this.f54954j;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model
        /* JADX INFO: renamed from: O, reason: from getter */
        public final op0.c2 getF54953h() {
            return this.f54953h;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52464m() {
            return this.f54956m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51997a() {
            return this.d;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.f54960r;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f54952g, model.f54952g) && Intrinsics.f(this.f54953h, model.f54953h) && this.i == model.i && this.f54954j == model.f54954j && this.k == model.k && Intrinsics.f(this.f54955l, model.f54955l) && Intrinsics.f(this.f54956m, model.f54956m) && this.f54957n == model.f54957n;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52463l() {
            return this.f54955l;
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f54952g, p.a.a(okl.m.b(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31);
            op0.c2 c2Var = this.f54953h;
            int iB2 = j6.a.b(this.k, j6.a.b(this.f54954j, j6.a.c((iB + (c2Var == null ? 0 : c2Var.hashCode())) * 961, 31, this.i), 31), 31);
            Parcelable parcelable = this.f54955l;
            int iHashCode = (iB2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f54956m;
            return this.f54957n.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54998h() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f54955l = parcelable;
        }
    }

    public AvatarGridWidgetDelegate() {
        int i = R$id.internal_avatar_grid_widget_view_type;
        ood.g0 rule = new ood.g0(12);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new ReferralContactDelegate(), new AvatarLoadingDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final op0.a2 u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new op0.a2(kli.a.k(context, 16.0f), kli.a.k(context, 8.0f));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final int v(Context context, GridWidgetDelegate.Model data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return GridWidgetDelegate.s(context.getResources().getInteger(R$integer.internal_avatar_grid_span_count), context, data);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ReferralContactDelegate");
        efm.r map = ((ReferralContactDelegate) obj2).q().map(new oid.y(new op0.g((o10.c) widgetModelProvider, 0), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
