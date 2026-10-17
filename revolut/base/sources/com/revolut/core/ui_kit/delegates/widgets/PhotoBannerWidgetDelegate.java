package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.la;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.pc0;
import ip0.r00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0007\b\t\n\u0003\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PhotoBannerWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/PhotoBannerWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/y2;", "<init>", "()V", "Companion", "b", "Model", "op0/m3", "op0/n3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhotoBannerWidgetDelegate extends BaseDraggableWidgetDelegate<Model, y2> {

    public static abstract class b extends BaseDraggableWidgetDelegate.a {
        private b() {
        }
    }

    public PhotoBannerWidgetDelegate() {
        super(R$id.internal_photo_banner_widget_view_type, new op0.v0(27));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PhotoBannerLargeDelegate photoBannerLargeDelegate = new PhotoBannerLargeDelegate();
        return new y2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_horizontal_scroller), new ScrollerDelegate(zhm.v.k(photoBannerLargeDelegate, new PhotoBannerLargeLoadingDelegate()), false), new ok7.c(photoBannerLargeDelegate, 22));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(y2 holder, Model model, int i, List list) {
        boolean z;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        ArrayList<qv0.i> arrayList = model.f55209c;
        op0.m3 m3Var = model.e;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.n3)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z3 = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.n3 n3Var = (op0.n3) payloads.get(i3);
            z3 = z3 || n3Var.f227359a;
            zIsEmpty = zIsEmpty || n3Var.f227360b;
        }
        if (zIsEmpty) {
            Intrinsics.checkNotNullParameter(model, "model");
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = m3Var.a();
            itemView.setLayoutParams(layoutParams);
            RecyclerView recyclerView = holder.f55556j;
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = m3Var.a();
            recyclerView.setLayoutParams(layoutParams2);
            holder.f227373h.setWidgetSize(m3Var.b(model.d));
        }
        if (z3) {
            String strR = a0.d.r(model.f55208b, "-scroller");
            aw0.x4 x4VarC = m3Var.c();
            gg.b bVar = new gg.b(arrayList.size() > 1, 2);
            pc0 pc0Var = new pc0(new ls0.e(0));
            if (arrayList.isEmpty()) {
                z = false;
                List items = zhm.u.c(new hg(strR, arrayList, 1, x4VarC, null, bVar, z, false, pc0Var, null, 0, 0, 0, 0, 32144));
                Intrinsics.checkNotNullParameter(items, "items");
                holder.k.c(items);
            } else {
                for (qv0.i iVar : arrayList) {
                    if ((iVar instanceof PhotoBannerLargeDelegate.Model) && ((PhotoBannerLargeDelegate.Model) iVar).f52907h) {
                        z = true;
                        break;
                    }
                }
                z = false;
                List items2 = zhm.u.c(new hg(strR, arrayList, 1, x4VarC, null, bVar, z, false, pc0Var, null, 0, 0, 0, 0, 32144));
                Intrinsics.checkNotNullParameter(items2, "items");
                holder.k.c(items2);
            }
        }
        holder.f55557l = new ood.k(this, model, 13);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PhotoBannerWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f55209c;
        public final op0.q d;
        public final op0.m3 e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final py0.d f55210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public op0.r f55211h;
        public final boolean i;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, op0.m3 m3Var, int i) {
                int i2 = (i & 2) != 0 ? 2 : 1;
                op0.m3 heightBehavior = (i & 4) != 0 ? op0.m3.FIXED_ASPECT_RATIO : m3Var;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(heightBehavior, "heightBehavior");
                IntRange intRange = new IntRange(1, i2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    r00 r00Var = new r00(com.google.android.gms.internal.mlkit_vision_face.a.k(it8.nextInt(), listId, "-loading-"));
                    yp0.b.l(r00Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(r00Var);
                }
                return new Model(listId, arrayList, op0.q.LARGE, heightBehavior, (py0.d) null);
            }
        }

        public Model(String listId, List items, op0.m3 heightBehavior, py0.c cVar, int i) {
            py0.c cVar2 = (i & 16) != 0 ? null : cVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(heightBehavior, "heightBehavior");
            List list = items;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                PhotoBannerLargeDelegate.Model model = (PhotoBannerLargeDelegate.Model) it8.next();
                ArrayList arrayList2 = arrayList;
                String listId2 = model.f52903a;
                Clause title = model.f52904b;
                Clause clause = model.f52905c;
                PhotoBannerLargeDelegate.Model.Background background = model.d;
                la row = model.e;
                boolean z = model.f;
                Object obj2 = model.f52906g;
                boolean z3 = model.f52907h;
                Parcelable parcelable = model.i;
                qv0.c positionInBox = model.f52908j;
                p31.c cVar3 = model.k;
                p31.c cVar4 = model.f52909l;
                p31.c cVar5 = model.f52910m;
                p31.c cVar6 = model.f52911n;
                Intrinsics.checkNotNullParameter(listId2, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(row, "row");
                Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
                PhotoBannerLargeDelegate.Model model2 = new PhotoBannerLargeDelegate.Model(listId2, title, clause, background, row, z, obj2, z3, parcelable, positionInBox, cVar3, cVar4, cVar5, cVar6, cVar2);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(model2);
                arrayList = arrayList2;
            }
            this(listId, arrayList, op0.q.LARGE, heightBehavior, cVar2);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55222l() {
            return this.f55211h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55211h = rVar;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55217b() {
            return this.f55208b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public final py0.d getO() {
            return this.f55210g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55208b, model.f55208b) && Intrinsics.f(this.f55209c, model.f55209c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55210g, model.f55210g) && this.f55211h == model.f55211h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + okl.m.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f55209c, this.f55208b.hashCode() * 31, 31), 31)) * 31;
            Parcelable parcelable = this.f;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            py0.d dVar = this.f55210g;
            return this.f55211h.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getI() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            op0.n3 n3Var = null;
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                ArrayList arrayList = model.f55209c;
                ArrayList arrayList2 = this.f55209c;
                qv0.i iVar = (qv0.i) zhm.d0.d0(arrayList2);
                Class<?> cls = iVar != null ? iVar.getClass() : null;
                qv0.i iVar2 = (qv0.i) zhm.d0.d0(arrayList);
                if (Intrinsics.f(cls, iVar2 != null ? iVar2.getClass() : null)) {
                    boolean zEquals = arrayList2.equals(arrayList);
                    boolean z = true;
                    boolean z3 = !zEquals;
                    if (this.d == model.d && this.e == model.e) {
                        z = false;
                    }
                    n3Var = new op0.n3(z3, z);
                }
            }
            return n3Var;
        }

        public Model(String str, ArrayList arrayList, op0.q qVar, op0.m3 m3Var, py0.d dVar) {
            op0.r rVar = op0.r.SEEN;
            this.f55208b = str;
            this.f55209c = arrayList;
            this.d = qVar;
            this.e = m3Var;
            this.f = null;
            this.f55210g = dVar;
            this.f55211h = rVar;
            this.i = true;
        }
    }
}
