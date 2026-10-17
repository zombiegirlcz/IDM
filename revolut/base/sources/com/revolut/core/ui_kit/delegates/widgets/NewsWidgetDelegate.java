package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/NewsWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/NewsWidgetDelegate$Model;", "Lop0/f3;", "<init>", "()V", "Companion", "Model", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewsWidgetDelegate extends BaseDynamicWidgetDelegate<Model, op0.f3> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/NewsWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "Lqv0/m;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDynamicWidgetDelegate.Model implements qv0.m {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f55198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55199h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55200j;
        public op0.r k;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, TextLocalisedClause header, ArrayList items, TextLocalisedClause textLocalisedClause) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(header, "header");
                Intrinsics.checkNotNullParameter(items, "items");
                op0.q qVar = op0.q.DYNAMIC;
                aim.e eVarB = zhm.u.b();
                eVarB.add(new BaseDynamicWidgetDelegate.BigHeaderModel("header", header, null, false, null, 56));
                Companion companion2 = Model.INSTANCE;
                List listV0 = zhm.d0.V0(items, 10);
                companion2.getClass();
                int size = listV0.size();
                for (int i = 0; i < size; i++) {
                    ((qv0.i) listV0.get(i)).j(c.C1364c.f249512a);
                }
                eVarB.addAll(listV0);
                if (textLocalisedClause != null) {
                    Model.INSTANCE.getClass();
                    eVarB.add(new LargeActionButtonDelegate.Model("widget_footer", LargeActionButton.ButtonStyle.o, null, textLocalisedClause, false, null, null, null, null, 1000));
                }
                return new Model(listId, zhm.u.a(eVarB), false, qVar, new py0.c(header));
            }

            public static Model b(Companion companion, String listId, TextLocalisedClause title, int i) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
                s0Var.a(new op0.s(yh5.b.a(title), false));
                if (i > 10) {
                    i = 10;
                }
                sy[] syVarArr = new sy[i];
                for (int i2 = 0; i2 < i; i2++) {
                    syVarArr[i2] = new sy(String.valueOf(i2), null, 62);
                }
                s0Var.b(syVarArr);
                ArrayList arrayList = s0Var.f186433a;
                return new Model(listId, zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()])), true, op0.q.DYNAMIC, new py0.c(title));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(String str, List list, boolean z, op0.q qVar, py0.c cVar) {
            super(str, list, qVar, null, false);
            op0.r rVar = op0.r.SEEN;
            this.e = str;
            this.f = list;
            this.f55198g = z;
            this.f55199h = qVar;
            this.i = null;
            this.f55200j = cVar;
            this.k = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
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
            return this.f55198g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: H */
        public final boolean getD() {
            return false;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55228j() {
            return this.f55200j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55198g == model.f55198g && this.f55199h == model.f55199h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55200j, model.f55200j) && this.k == model.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.i;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f55199h, j6.a.c(p.a.d(this.e.hashCode() * 31, 31, this.f), 31, this.f55198g), 31);
            Parcelable parcelable = this.i;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            py0.c cVar = this.f55200j;
            return this.k.hashCode() + j6.a.c((iHashCode + (cVar == null ? 0 : cVar.f240642a.hashCode())) * 31, 31, false);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model, gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55199h() {
            return this.f55199h;
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

    public NewsWidgetDelegate() {
        super(R$id.internal_news_delegate_view_type, new op0.v0(24));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.f3 f3Var = new op0.f3(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_dynamic));
        p(f3Var, true);
        return f3Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate
    public final boolean s(koi.j listItem) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        return (listItem instanceof NewsDelegate.Model) || (listItem instanceof sy);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(op0.f3 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        t(holder, data, i, payloads);
        holder.f227248t = new op0.d3(this, data, 0);
        holder.u = new op0.d3(this, data, 1);
        holder.v = new op0.d3(this, data, 2);
        holder.f227249w = new op0.d3(this, data, 3);
        holder.f55427r = new op0.d3(this, data, 4);
    }
}
