package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ContactsWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/n0", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsWidgetDelegate extends HorizontalScrollerWidgetDelegate {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final op0.i2 f55085j;

    public ContactsWidgetDelegate() {
        super(R$id.internal_contacts_widget_view_type, new op0.v0(2));
        new ReferralContactDelegate();
        this.f55085j = op0.i2.WRAP_CONTENT;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final List s() {
        return zhm.v.k(new ReferralContactDelegate(), new AvatarLoadingDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    /* JADX INFO: renamed from: v, reason: from getter */
    public final op0.i2 getI() {
        return this.f55085j;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ReferralContactDelegate");
        efm.r map = ((ReferralContactDelegate) obj2).q().map(new op0.x(6, new op0.d1((o10.c) widgetModelProvider, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ContactsWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends HorizontalScrollerWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f55086c;
        public final op0.q d;
        public final Clause e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f55087g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55088h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55089j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final py0.c f55090l;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(String listId, Clause title, ip0.c2 shape, AnalyticsContext analyticsContext, zn.b bVar) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(shape, "shape");
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new ip0.d2(String.valueOf(it8.nextInt()), shape));
                }
                return new Model(listId, op0.q.MEDIUM, title, arrayList, false, true, analyticsContext, bVar, 272);
            }

            public static /* synthetic */ Model b(Companion companion, String str, Clause clause, ip0.c2 c2Var) {
                companion.getClass();
                return a(str, clause, c2Var, null, null);
            }
        }

        public Model(String listId, List items, Clause title, boolean z, AnalyticsContext analyticsContext, Object obj2, int i) {
            boolean z3 = false;
            boolean z4 = (i & 8) != 0 ? false : z;
            AnalyticsContext analyticsContext2 = (i & 16) != 0 ? null : analyticsContext;
            Object obj3 = (i & 32) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(title, "title");
            INSTANCE.getClass();
            List<ReferralContactDelegate.Model> list = items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        if (((ReferralContactDelegate.Model) it8.next()).d != null) {
                            z3 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (ReferralContactDelegate.Model model : list) {
                Clause clause = model.d;
                arrayList.add(ReferralContactDelegate.Model.e(model, null, null, (clause == null && z3) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : clause, ke.MATCH_PARENT, true, null, 7591));
            }
            this(listId, op0.q.MEDIUM, title, arrayList, z4, false, analyticsContext2, obj3, 256);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getE() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getF55087g() {
            return this.f55087g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        public final List F() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getE() {
            return this.e;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53564b() {
            return this.f55089j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55224b() {
            return this.f55086c;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.f55090l;
        }

        @Override // tw0.y
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF55114g() {
            return this.f55088h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55086c, model.f55086c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55087g == model.f55087g && this.f55088h == model.f55088h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55089j, model.f55089j) && this.k == model.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55163b() {
            return this.i;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.a(okl.m.b(this.d, this.f55086c.hashCode() * 31, 31), 31, this.e), 31), 31, this.f55087g), 31, this.f55088h);
            Parcelable parcelable = this.i;
            int iHashCode = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55089j;
            return this.k.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55225c() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(String str, op0.q qVar, Clause clause, ArrayList arrayList, boolean z, boolean z3, Parcelable parcelable, Object obj2, int i) {
            super(0);
            z = (i & 16) != 0 ? false : z;
            obj2 = (i & 128) != 0 ? null : obj2;
            op0.r rVar = op0.r.SEEN;
            this.f55086c = str;
            this.d = qVar;
            this.e = clause;
            this.f = arrayList;
            this.f55087g = z;
            this.f55088h = z3;
            this.i = parcelable;
            this.f55089j = obj2;
            this.k = rVar;
            this.f55090l = new py0.c(clause);
        }
    }
}
