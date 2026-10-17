package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\n\u0007\b\u0003\t\n\u000b\f\r\u000e\u000fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/RowsWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/RowsWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/y3;", "<init>", "()V", "Companion", "Model", "op0/z3", "op0/y3", "b", "op0/a4", "op0/b4", "SmallRowDelegate", "SmallRowLoadingDelegate", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowsWidgetDelegate extends BaseDynamicWidgetDelegate<Model, y3> {
    public final ok7.b i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/RowsWidgetDelegate$SmallRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lop0/a4;", "Lcom/revolut/core/ui_kit/delegates/widgets/w3;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SmallRowDelegate extends BaseRecyclerViewDelegate<op0.a4, w3> {
        public SmallRowDelegate() {
            super(R$layout.internal_delegate_vertical_list_item_small, new op0.v3(2));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View itemView = kotlin.jvm.internal.s.r(parent, this.f98535a);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            w3 w3Var = new w3(itemView);
            View viewFindViewById = itemView.findViewById(R$id.internalDelegateVerticalListItemSmall_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateVerticalListItemSmall_subtitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateVerticalListItemSmall_valuePrimary);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            View viewFindViewById4 = itemView.findViewById(R$id.internalDelegateVerticalListItemSmall_valueSecondary);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            return w3Var;
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
            p((w3) viewHolder, i, list);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
            p((w3) bVar, i, list);
        }

        public final void p(w3 holder, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(null, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, null, i, payloads);
            boolean zIsEmpty = payloads.isEmpty();
            boolean zIsEmpty2 = payloads.isEmpty();
            boolean zIsEmpty3 = payloads.isEmpty();
            boolean zIsEmpty4 = payloads.isEmpty();
            boolean zIsEmpty5 = payloads.isEmpty();
            ArrayList arrayList = new ArrayList();
            Iterator it8 = payloads.iterator();
            while (it8.hasNext()) {
                it8.next();
            }
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (it9.next() != null) {
                    throw new ClassCastException();
                }
                if (!zIsEmpty) {
                    throw null;
                }
                if (!zIsEmpty2) {
                    throw null;
                }
                if (!zIsEmpty3) {
                    throw null;
                }
                if (!zIsEmpty4) {
                    throw null;
                }
                zIsEmpty4 = true;
                zIsEmpty = true;
                zIsEmpty2 = true;
                zIsEmpty3 = true;
            }
            if (zIsEmpty || zIsEmpty2 || zIsEmpty3 || zIsEmpty4) {
                throw null;
            }
            if (zIsEmpty5) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                or0.b.c(this, null, itemView, false, null, 24);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/RowsWidgetDelegate$SmallRowLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lop0/b4;", "Lcom/revolut/core/ui_kit/delegates/widgets/x3;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SmallRowLoadingDelegate extends BaseRecyclerViewDelegate<op0.b4, x3> {
        public SmallRowLoadingDelegate() {
            super(R$layout.internal_delegate_vertical_list_loading_item_small, new op0.v3(3));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new x3(kotlin.jvm.internal.s.r(parent, this.f98535a));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(x3 holder, op0.b4 data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ifk.b.r(holder.f);
            if (payloads.isEmpty()) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                or0.b.c(this, data, itemView, false, null, 28);
            }
        }
    }

    public static abstract class b extends BaseDraggableWidgetDelegate.a {
        private b() {
        }
    }

    public RowsWidgetDelegate() {
        ok7.b delegateBlurProcessorFactory = new ok7.b(24);
        Intrinsics.checkNotNullParameter(delegateBlurProcessorFactory, "delegateBlurProcessorFactory");
        super(R$layout.internal_delegate_widget_rows, new op0.v3(1));
        this.i = delegateBlurProcessorFactory;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        y3 y3Var = new y3(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_dynamic), this.i);
        p(y3Var, true);
        return y3Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        y3 holder = (y3) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ro0.y yVar = holder.A;
        if (yVar != null) {
            yVar.i++;
            yVar.c();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        y3 holder = (y3) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.K();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        y3 holder = (y3) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.K();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        y3 holder = (y3) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ro0.y yVar = holder.A;
        if (yVar != null) {
            yVar.i++;
            yVar.c();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate
    public final boolean s(koi.j listItem) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        return (listItem instanceof RowDelegate.Model) || (listItem instanceof pb0) || (listItem instanceof wh);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.widgets.y3 r7, com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model r8, int r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.p(com.revolut.core.ui_kit.delegates.widgets.y3, com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model, int, java.util.List):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0003\u0007\b\tJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/RowsWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/core/ui_kit/delegates/widgets/v3", "com/revolut/core/ui_kit/delegates/widgets/s3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDynamicWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f55226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55227h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.d f55228j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f55229l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public op0.r f55230m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f55231n;
        public final s3 o;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, Clause header, List items, boolean z, p3 p3Var, int i) {
                boolean z3 = (i & 8) != 0 ? true : z;
                p3 p3Var2 = (i & 16) != 0 ? null : p3Var;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(header, "header");
                Intrinsics.checkNotNullParameter(items, "items");
                t3 subtitleMode = t3.f55514a;
                Intrinsics.checkNotNullParameter(subtitleMode, "subtitleMode");
                return d(companion, listId, new BaseDynamicWidgetDelegate.BigHeaderModel("header", header, null, z3, null, 48), items, p3Var2, null, null, subtitleMode, 32);
            }

            public static Model b(Companion companion, String listId, Clause title, int i, AnalyticsContext analyticsContext, int i2) {
                int i3 = (i2 & 4) != 0 ? 3 : i;
                boolean z = (i2 & 8) == 0;
                AnalyticsContext analyticsContext2 = (i2 & 16) != 0 ? null : analyticsContext;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
                s0Var.a(new op0.s(yh5.b.a(title), z));
                if (i3 > 10) {
                    i3 = 10;
                }
                op0.q qVar = op0.q.DYNAMIC;
                s0Var.b(f(i3, qVar));
                ArrayList arrayList = s0Var.f186433a;
                return new Model(listId, zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()])), true, qVar, analyticsContext2, new py0.c(title), false, null, null, 1920);
            }

            public static Model c(String listId, BaseDynamicWidgetDelegate.BigHeaderModel header, List items, p3 p3Var, Parcelable parcelable, Object obj2, v3 subtitleMode) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(header, "header");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(subtitleMode, "subtitleMode");
                op0.q qVar = op0.q.DYNAMIC;
                aim.e eVarB = zhm.u.b();
                eVarB.add(header);
                eVarB.addAll(i(Model.INSTANCE, zhm.d0.V0(items, 10), qVar, subtitleMode));
                if (p3Var != null) {
                    eVarB.add(e(p3Var));
                }
                return new Model(listId, zhm.u.a(eVarB), false, qVar, parcelable, new py0.c(header.f54992b), header.e, obj2, null, 1280);
            }

            public static /* synthetic */ Model d(Companion companion, String str, BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel, List list, p3 p3Var, AnalyticsContext analyticsContext, Object obj2, v3 v3Var, int i) {
                if ((i & 8) != 0) {
                    p3Var = null;
                }
                if ((i & 16) != 0) {
                    analyticsContext = null;
                }
                if ((i & 32) != 0) {
                    obj2 = null;
                }
                if ((i & 64) != 0) {
                    v3Var = t3.f55514a;
                }
                companion.getClass();
                return c(str, bigHeaderModel, list, p3Var, analyticsContext, obj2, v3Var);
            }

            public static koi.j e(p3 p3Var) {
                if (p3Var instanceof n3) {
                    n3 n3Var = (n3) p3Var;
                    return new LargeActionButtonDelegate.Model("widget_footer", LargeActionButton.ButtonStyle.o, null, n3Var.f55440a, false, null, null, n3Var.f55441b, null, 744);
                }
                if (!(p3Var instanceof o3)) {
                    throw new NoWhenBranchMatchedException();
                }
                o3 o3Var = (o3) p3Var;
                SmallActionButtonDelegate.Model model = new SmallActionButtonDelegate.Model("widget_footer", ms0.h4.ACCENT, null, null, o3Var.f55451a, null, ms0.j4.f208300a, o3Var.f55452b, null, 0, 0, 0, 0, 32088);
                int i = R$attr.uikit_dp16;
                yp0.b.p(model, i, i, i, i);
                return model;
            }

            public static pb0[] f(int i, op0.q qVar) {
                int i2 = r3.f55492a[qVar.ordinal()] == 1 ? R$attr.uikit_dp16 : R$attr.uikit_dp8;
                IntRange intRange = new IntRange(1, i, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, String.valueOf(it8.nextInt()), false, i2, false, 26));
                }
                return (pb0[]) arrayList.toArray(new pb0[0]);
            }

            public static Model g(Companion companion, String listId, TextLocalisedClause title) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("header", (Image) null, (Clause) yh5.b.a(title), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                c.C1364c c1364c = c.C1364c.f249512a;
                Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
                model.f52717p = c1364c;
                int i = R$attr.uikit_dp12;
                model.v = i;
                model.u = i;
                Unit unit = Unit.f186387a;
                s0Var.a(model);
                op0.q qVar = op0.q.MEDIUM;
                s0Var.b(f(2, qVar));
                ArrayList arrayList = s0Var.f186433a;
                return new Model(listId, zhm.v.k(arrayList.toArray(new Object[arrayList.size()])), true, qVar, null, new py0.c(title), false, null, null, 1920);
            }

            public static RowDelegate.Model h(RowDelegate.Model model, op0.q qVar, int i, v3 v3Var) {
                int i2;
                if (Intrinsics.f(v3Var, t3.f55514a)) {
                    i2 = qVar == op0.q.DYNAMIC ? 2 : 1;
                } else {
                    if (!Intrinsics.f(v3Var, u3.f55521a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 6;
                }
                int i3 = i2;
                RowDelegate.Model.c cVarA = model.k;
                if (cVarA instanceof RowDelegate.Model.c.b) {
                    cVarA = RowDelegate.Model.c.b.a((RowDelegate.Model.c.b) cVarA, null, 79);
                }
                return RowDelegate.Model.x(model, null, null, null, null, null, i3, cVarA, false, null, null, i, i, 0, 0, null, -1610614545, 15);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3, types: [qv0.i] */
            /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v7, types: [com.revolut.core.ui_kit.delegates.wh] */
            /* JADX WARN: Type inference failed for: r2v8, types: [com.revolut.core.ui_kit.delegates.wh] */
            public static ArrayList i(Companion companion, List list, op0.q qVar, v3 v3Var) {
                list.size();
                companion.getClass();
                int i = r3.f55492a[qVar.ordinal()] == 1 ? R$attr.uikit_dp16 : R$attr.uikit_dp8;
                List<??> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (?? H : list2) {
                    if (H instanceof wh) {
                        H = (wh) H;
                        qv0.i iVar = H.f54925b;
                        if (iVar instanceof RowDelegate.Model) {
                            Model.INSTANCE.getClass();
                            H = wh.a(H, h((RowDelegate.Model) iVar, qVar, i, v3Var), null, null, 16381);
                        }
                    } else if (H instanceof RowDelegate.Model) {
                        Model.INSTANCE.getClass();
                        H = h((RowDelegate.Model) H, qVar, i, v3Var);
                    }
                    arrayList.add(H);
                }
                ArrayList<qv0.i> arrayListE0 = zhm.d0.E0(zhm.f0.f322471a, arrayList);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListE0, 10));
                for (qv0.i iVar2 : arrayListE0) {
                    Model.INSTANCE.getClass();
                    iVar2.j(c.C1364c.f249512a);
                    arrayList2.add(iVar2);
                }
                return arrayList2;
            }
        }

        public Model(String str, List list, boolean z, op0.q qVar, Parcelable parcelable, py0.d dVar, boolean z3, boolean z4, op0.r rVar, Object obj2, s3 s3Var) {
            super(str, list, qVar, parcelable, z3);
            this.e = str;
            this.f = list;
            this.f55226g = z;
            this.f55227h = qVar;
            this.i = parcelable;
            this.f55228j = dVar;
            this.k = z3;
            this.f55229l = z4;
            this.f55230m = rVar;
            this.f55231n = obj2;
            this.o = s3Var;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55122n() {
            return this.f55230m;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55230m = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: E, reason: from getter */
        public final List getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean getF54997g() {
            return this.f55226g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getD() {
            return this.k;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54968n() {
            return this.f55231n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53422a() {
            return this.e;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public final py0.d getF54970q() {
            return this.f55228j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55226g == model.f55226g && this.f55227h == model.f55227h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55228j, model.f55228j) && this.k == model.k && this.f55229l == model.f55229l && this.f55230m == model.f55230m && Intrinsics.f(this.f55231n, model.f55231n) && Intrinsics.f(this.o, model.o);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53433r() {
            return this.i;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f55227h, j6.a.c(p.a.d(this.e.hashCode() * 31, 31, this.f), 31, this.f55226g), 31);
            Parcelable parcelable = this.i;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            py0.d dVar = this.f55228j;
            int iC = okl.m.c(this.f55230m, j6.a.c(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.k), 31, this.f55229l), 31);
            Object obj2 = this.f55231n;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            s3 s3Var = this.o;
            return iHashCode2 + (s3Var != null ? s3Var.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model, gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getE() {
            return this.f55227h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF() {
            return this.f55229l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model, koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (oldItem instanceof Model) {
                Object objZ = super.z(oldItem);
                op0.w wVar = objZ != null ? (op0.w) objZ : null;
                if (wVar != null) {
                    return new op0.z3(wVar, !Intrinsics.f(((Model) oldItem).o, this.o));
                }
            }
            return null;
        }

        public /* synthetic */ Model(String str, List list, boolean z, op0.q qVar, Parcelable parcelable, py0.c cVar, boolean z3, Object obj2, s3 s3Var, int i) {
            this(str, list, z, qVar, parcelable, cVar, false, (i & 128) != 0 ? true : z3, op0.r.SEEN, (i & 512) != 0 ? null : obj2, (i & 1024) != 0 ? null : s3Var);
        }
    }
}
