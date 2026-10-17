package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardLoadingDelegate;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ExtraSmallCardScrollerWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/v0", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraSmallCardScrollerWidgetDelegate extends HorizontalScrollerWidgetDelegate {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f55112j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ExtraSmallCardScrollerWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends HorizontalScrollerWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f55113c;
        public final op0.q d;
        public final TextLocalisedClause e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f55114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55115h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55116j;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.ExtraSmallCardScrollerWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(String str, op0.q qVar, TextLocalisedClause textLocalisedClause, ArrayList arrayList, boolean z) {
            super(0);
            op0.r rVar = op0.r.SEEN;
            this.f55113c = str;
            this.d = qVar;
            this.e = textLocalisedClause;
            this.f = arrayList;
            this.f55114g = z;
            this.f55115h = null;
            this.i = rVar;
            this.f55116j = new py0.c(textLocalisedClause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getO() {
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
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model
        /* JADX INFO: renamed from: G */
        public final Clause getE() {
            return this.e;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55076n() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55069b() {
            return this.f55113c;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55116j;
        }

        @Override // tw0.y
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF55088h() {
            return this.f55114g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55113c, model.f55113c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55114g == model.f55114g && Intrinsics.f(this.f55115h, model.f55115h) && this.i == model.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55075m() {
            return this.f55115h;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, t61.a.a(okl.m.b(this.d, this.f55113c.hashCode() * 31, 31), 31, this.e), 31), 31, false), 31, this.f55114g);
            Parcelable parcelable = this.f55115h;
            return this.i.hashCode() + ((iC + (parcelable != null ? parcelable.hashCode() : 0)) * 961);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model, com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55115h = parcelable;
        }
    }

    public ExtraSmallCardScrollerWidgetDelegate() {
        super(R$id.internal_extra_small_card_scroller_widget_view_type, new op0.v0(7));
        this.f55112j = 8.0f;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final List s() {
        return zhm.v.k(new ExtraSmallCardDelegate(3), new ExtraSmallCardLoadingDelegate(0));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getF55162h() {
        return this.f55112j;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate");
        efm.r map = ((ExtraSmallCardDelegate) obj2).d.map(new op0.x(11, new op0.d1((o10.c) widgetModelProvider, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
