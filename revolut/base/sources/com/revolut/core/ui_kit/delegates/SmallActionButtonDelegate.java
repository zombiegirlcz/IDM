package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.hf0;
import ip0.if0;
import ip0.je0;
import ip0.jf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallActionButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmallActionButtonDelegate$Model;", "Lip0/jf0;", "<init>", "()V", "Model", "ip0/if0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallActionButtonDelegate extends BaseRecyclerViewDelegate<Model, jf0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53336c;
    public final e01.a d;

    public SmallActionButtonDelegate() {
        super(R$layout.internal_delegate_small_action_button, new je0(6));
        this.f53336c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new jf0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_small_action_button));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(jf0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ArrayList<if0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof if0) {
                arrayList.add(obj2);
            }
        }
        SmallActionButton smallActionButton = holder.f164833g;
        Parcelable parcelable = data.k;
        ms0.l4 l4Var = data.f53341h;
        String str = data.i;
        ms0.e4 e4Var = data.f53340g;
        Clause clause = data.f;
        boolean z = data.e;
        Image image = data.d;
        Image image2 = data.f53339c;
        ms0.h4 h4Var = data.f53338b;
        smallActionButton.setAnalyticsContext(parcelable);
        if (arrayList.isEmpty()) {
            smallActionButton.i(h4Var);
            smallActionButton.setIcon(image2);
            smallActionButton.setEndIcon(image);
            smallActionButton.setIconsColorFilterEnabled(z);
            smallActionButton.setText(clause);
            smallActionButton.setState(e4Var);
            smallActionButton.setLoadingButtonTag(str);
            holder.F(l4Var);
        } else {
            for (if0 if0Var : arrayList) {
                if (if0Var.f164684a) {
                    smallActionButton.setIcon(image2);
                }
                if (if0Var.f164685b) {
                    smallActionButton.setEndIcon(image);
                }
                if (if0Var.f164686c) {
                    smallActionButton.setIconsColorFilterEnabled(z);
                }
                if (if0Var.d) {
                    smallActionButton.setText(clause);
                }
                if (if0Var.e) {
                    smallActionButton.i(h4Var);
                }
                if (if0Var.f) {
                    smallActionButton.setState(e4Var);
                }
                if (if0Var.f164687g) {
                    holder.F(l4Var);
                }
                if (if0Var.f164688h) {
                    smallActionButton.setLoadingButtonTag(str);
                }
            }
        }
        efm.r map = smallActionButton.f56386h.map(new e30(new hf0(data, 0), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53336c.a(map, holder);
        efm.r map2 = smallActionButton.i.map(new e30(new hf0(data, 1), 27));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallActionButtonDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ms0.h4 f53338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53339c;
        public final Image d;
        public final boolean e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ms0.e4 f53340g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ms0.l4 f53341h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f53342j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f53343l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f53344m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f53345n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53346p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f53347q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53348r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f53349s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f53350t;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, ms0.h4 style, ResourceImage icon, Clause text) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            ms0.e4 e4Var = ms0.e4.EnabledClickable;
            int i = R$attr.uikit_dp0;
            this(listId, style, icon, null, true, text, e4Var, ms0.k4.f208313a, null, null, c.d.f249513a, i, i, i, i, 61440);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmallActionButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55137g() {
            return this.f53342j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55135b() {
            return this.f53337a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53337a, model.f53337a) && this.f53338b == model.f53338b && Intrinsics.f(this.f53339c, model.f53339c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && this.f53340g == model.f53340g && Intrinsics.f(this.f53341h, model.f53341h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53342j, model.f53342j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53343l, model.f53343l) && Intrinsics.f(this.f53344m, model.f53344m) && Intrinsics.f(this.f53345n, model.f53345n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53346p, model.f53346p) && this.f53347q == model.f53347q && this.f53348r == model.f53348r && this.f53349s == model.f53349s && this.f53350t == model.f53350t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53029l() {
            return this.f53347q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53347q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = (this.f53338b.hashCode() + (this.f53337a.hashCode() * 31)) * 31;
            Image image = this.f53339c;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.d;
            int iC = j6.a.c((iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.e);
            Clause clause = this.f;
            int iHashCode3 = (this.f53341h.hashCode() + ((this.f53340g.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
            String str = this.i;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Object obj2 = this.f53342j;
            int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            int i = h30.l.i(this.f53343l, (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53344m;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53345n;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.o;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53346p;
            return Integer.hashCode(this.f53350t) + j6.a.b(this.f53349s, j6.a.b(this.f53348r, j6.a.b(this.f53347q, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f53344m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53343l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53027h() {
            return this.f53345n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53030m() {
            return this.f53348r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.f53350t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53348r = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53026g() {
            return this.f53343l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53028j() {
            return this.f53346p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53344m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53031n() {
            return this.f53349s;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53345n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53346p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            Image image = model.f53339c;
            boolean z3 = !Intrinsics.f(this.f53339c, image);
            boolean z4 = !Intrinsics.f(this.d, image);
            boolean z6 = false;
            boolean z11 = this.e != model.e;
            boolean z12 = !Intrinsics.f(this.f, model.f);
            if (this.f53338b != model.f53338b) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (this.f53340g != model.f53340g) {
                z = true;
            }
            return new if0(z3, z4, z11, z12, z6, z, !Intrinsics.f(this.f53341h, model.f53341h), !Intrinsics.f(this.i, model.i));
        }

        public Model(String listId, ms0.h4 style, Image image, Image image2, boolean z, Clause clause, ms0.e4 e4Var, ms0.l4 widthMode, Object obj2, Parcelable parcelable, qv0.c positionInBox, int i, int i2, int i3, int i5, int i6) {
            image2 = (i6 & 8) != 0 ? null : image2;
            boolean z3 = (i6 & 16) != 0 ? true : z;
            ms0.e4 state = (i6 & 64) != 0 ? ms0.e4.EnabledClickable : e4Var;
            Object obj3 = (i6 & 512) != 0 ? null : obj2;
            Parcelable parcelable2 = (i6 & 1024) != 0 ? null : parcelable;
            int i21 = (i6 & 65536) != 0 ? R$attr.uikit_dp0 : i;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53337a = listId;
            this.f53338b = style;
            this.f53339c = image;
            this.d = image2;
            this.e = z3;
            this.f = clause;
            this.f53340g = state;
            this.f53341h = widthMode;
            this.i = null;
            this.f53342j = obj3;
            this.k = parcelable2;
            this.f53343l = positionInBox;
            this.f53344m = null;
            this.f53345n = null;
            this.o = null;
            this.f53346p = null;
            this.f53347q = i21;
            this.f53348r = i2;
            this.f53349s = i3;
            this.f53350t = i5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, ms0.h4 style, Image image, ResourceImage resourceImage, Clause clause, ms0.e4 e4Var, ms0.l4 l4Var, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            boolean z = (i6 & 8) != 0;
            ResourceImage resourceImage2 = (i6 & 16) != 0 ? null : resourceImage;
            ms0.e4 state = (i6 & 64) != 0 ? ms0.e4.EnabledClickable : e4Var;
            ms0.l4 widthMode = (i6 & 128) != 0 ? ms0.k4.f208313a : l4Var;
            Object obj3 = (i6 & 512) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 1024) != 0 ? null : analyticsContext;
            int i21 = (i6 & 2048) != 0 ? R$attr.uikit_dp0 : i;
            int i22 = (i6 & 4096) != 0 ? R$attr.uikit_dp0 : i2;
            int i32 = (i6 & 8192) != 0 ? R$attr.uikit_dp0 : i3;
            int i33 = (i6 & 16384) != 0 ? R$attr.uikit_dp0 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            this(listId, style, image, resourceImage2, z, clause, state, widthMode, obj3, analyticsContext2, c.d.f249513a, i21, i22, i32, i33, 61440);
        }
    }
}
