package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import ip0.b5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CalendarListWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/CalendarListWidgetDelegate$Model;", "Lop0/a0;", "<init>", "()V", "Companion", "b", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CalendarListWidgetDelegate extends BaseDynamicWidgetDelegate<Model, op0.a0> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CalendarListWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDynamicWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f54997g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f54998h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f54999j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f55000l;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, BaseDynamicWidgetDelegate.BigHeaderModel header, ArrayList items, TextLocalisedClause textLocalisedClause, int i) {
                aim.e eVar;
                TextLocalisedClause textLocalisedClause2 = (i & 8) != 0 ? null : textLocalisedClause;
                FreelancerWidgetClickData.TaxHub.C0496TaxHub c0496TaxHub = (i & 32) != 0 ? null : FreelancerWidgetClickData.TaxHub.C0496TaxHub.f74461a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(header, "header");
                Intrinsics.checkNotNullParameter(items, "items");
                op0.q qVar = op0.q.DYNAMIC;
                aim.e eVarB = zhm.u.b();
                eVarB.add(header);
                Companion companion2 = Model.INSTANCE;
                List listV0 = zhm.d0.V0(items, 10);
                companion2.getClass();
                int i2 = R$attr.uikit_dp4;
                List list = listV0;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    CalendarRowDelegate.Model model = (CalendarRowDelegate.Model) obj2;
                    model.f51762q = i2;
                    model.f51763r = i3 == zhm.v.j(listV0) ? R$attr.uikit_dp8 : i2;
                    c.C1364c c1364c = c.C1364c.f249512a;
                    Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
                    model.f51758l = c1364c;
                    arrayList.add(model);
                    i3 = i5;
                }
                eVarB.addAll(arrayList);
                if (textLocalisedClause2 != null) {
                    Model.INSTANCE.getClass();
                    eVar = eVarB;
                    eVar.add(new LargeActionButtonDelegate.Model("widget_footer", LargeActionButton.ButtonStyle.o, null, textLocalisedClause2, false, null, null, null, null, 1000));
                } else {
                    eVar = eVarB;
                }
                return new Model(listId, zhm.u.a(eVar), false, qVar, new py0.c(header.f54992b), c0496TaxHub, 64);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(String str, List list, boolean z, op0.q qVar, py0.c cVar, Object obj2, int i) {
            super(str, list, qVar, null, false);
            op0.r rVar = op0.r.SEEN;
            obj2 = (i & 128) != 0 ? null : obj2;
            this.e = str;
            this.f = list;
            this.f54997g = z;
            this.f54998h = qVar;
            this.i = null;
            this.f54999j = cVar;
            this.k = rVar;
            this.f55000l = obj2;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55236j() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: E, reason: from getter */
        public final List getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean getF55198g() {
            return this.f54997g;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.f55000l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52808a() {
            return this.e;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.f54999j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f54997g == model.f54997g && this.f54998h == model.f54998h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f54999j, model.f54999j) && this.k == model.k && Intrinsics.f(this.f55000l, model.f55000l);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52814l() {
            return this.i;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f54998h, j6.a.c(p.a.d(this.e.hashCode() * 31, 31, this.f), 31, this.f54997g), 31);
            Parcelable parcelable = this.i;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            py0.c cVar = this.f54999j;
            int iC = okl.m.c(this.k, (iHashCode + (cVar == null ? 0 : cVar.f240642a.hashCode())) * 31, 31);
            Object obj2 = this.f55000l;
            return iC + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model, gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55234g() {
            return this.f54998h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }
    }

    public static abstract class b extends BaseDraggableWidgetDelegate.a {
        private b() {
        }
    }

    public CalendarListWidgetDelegate() {
        super(R$id.internal_calendar_row_delegate_view_type, new ood.g0(19));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.a0 a0Var = new op0.a0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_dynamic));
        p(a0Var, true);
        return a0Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate
    public final boolean s(koi.j listItem) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        return (listItem instanceof Model) || (listItem instanceof b5);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(op0.a0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        t(holder, data, i, payloads);
        holder.f227156t = new op0.z(this, data, 0);
        holder.f55427r = new op0.z(this, data, 1);
    }
}
