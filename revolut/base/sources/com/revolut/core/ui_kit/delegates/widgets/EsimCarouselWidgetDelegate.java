package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EsimCarouselWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/r0", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimCarouselWidgetDelegate extends HorizontalScrollerWidgetDelegate {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f55105m = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final op0.i2 f55106j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RowDelegate f55107l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0002\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EsimCarouselWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/core/ui_kit/delegates/widgets/u0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends HorizontalScrollerWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f55108c;
        public final TextLocalisedClause d;
        public final ArrayList e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f55109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55110h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55111j;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.EsimCarouselWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public Model(TextLocalisedClause title, String listId, ArrayList items) {
            super(0);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f55108c = listId;
            this.d = title;
            this.e = items;
            this.f = null;
            INSTANCE.getClass();
            ArrayList arrayList = new ArrayList(items.size());
            int size = items.size();
            for (int i = 0; i < size; i++) {
                u0 u0Var = (u0) items.get(i);
                String str = u0Var.f55517a;
                ?? r92 = u0Var.f55518b;
                ?? r122 = u0Var.f55519c;
                t0 t0Var = u0Var.d;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(t0Var.f55510a, t0Var.f55511b, null, false, null, false, 60);
                s0 s0Var = u0Var.e;
                Object[] objArr = 0 == true ? 1 : 0;
                arrayList.add(new RowDelegate.Model(str, image40, r92, null, 1, r122, null, null, 1, new pf(s0Var.f55499a, objArr, s0Var.f55500b, s0Var.f55501c, null, null, 384), false, null, false, null, null, null, null, null, null, u0Var.f, null, 0, 0, 0, 0, 524284616));
            }
            this.f55109g = arrayList;
            this.f55110h = op0.q.MEDIUM;
            this.i = op0.r.SEEN;
            this.f55111j = new py0.c(this.d);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54983r() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        /* JADX INFO: renamed from: E */
        public final boolean getF55087g() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        public final List F() {
            return this.f55109g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        /* JADX INFO: renamed from: G */
        public final Clause getE() {
            return this.d;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new EsimCarouselWidgetDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF54982q() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52302a() {
            return this.f55108c;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55111j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55108c, model.f55108c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52303b() {
            return this.f;
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, t61.a.a(this.f55108c.hashCode() * 31, 31, this.d), 31);
            Parcelable parcelable = this.f;
            return (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54980n() {
            return this.f55110h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }
    }

    public EsimCarouselWidgetDelegate() {
        super(R$id.internal_esim_carousel_widget_view_type, new op0.v0(6));
        this.f55106j = op0.i2.WRAP_CONTENT;
        this.k = 1;
        this.f55107l = new RowDelegate(null, null, 7);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final List s() {
        return zhm.u.c(this.f55107l);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    /* JADX INFO: renamed from: t */
    public final float getF55162h() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final Integer u() {
        return Integer.valueOf(this.k);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    /* JADX INFO: renamed from: v, reason: from getter */
    public final op0.i2 getI() {
        return this.f55106j;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        RowDelegate rowDelegate = this.f55107l;
        o10.c cVar = (o10.c) widgetModelProvider;
        efm.r rVarMerge = efm.r.merge(rowDelegate.f53218h.map(new op0.x(9, new op0.d1(cVar, 1))), rowDelegate.f53220l.map(new op0.x(10, new op0.d1(cVar, 2))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }
}
