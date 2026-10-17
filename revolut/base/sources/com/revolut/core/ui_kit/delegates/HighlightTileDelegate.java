package com.revolut.core.ui_kit.delegates;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.dn;
import ip0.en;
import ip0.tm;
import ip0.um;
import ip0.vm;
import ip0.xm;
import ip0.zm;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\n\u0007\b\u0003\t\n\u000b\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HighlightTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/HighlightTileDelegate$Model;", "Lip0/en;", "<init>", "()V", "Companion", "Model", "ip0/zm", "ip0/vm", "ip0/tm", "ip0/an", "ip0/ym", "ip0/dn", "ip0/um", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HighlightTileDelegate extends BaseRecyclerViewDelegate<Model, en> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int d = R$attr.uikit_colorAccentNeutral_20;
    public static final int e = R$attr.uikit_colorAccentNeutral_40;
    public static final int f = R$attr.uikit_colorAccentNeutral;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52437c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HighlightTileDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f52440c;
        public final boolean d;
        public final boolean e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final vm f52441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final tm f52442h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52443j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52444l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52445m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52446n;
        public qv0.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52447p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52448q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52449r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52450s;

        public Model(String listId, Clause title, Image image, boolean z, Object obj2, AnalyticsContext analyticsContext, ResourceImage resourceImage, vm vmVar, tm tmVar, int i) {
            z = (i & 16) != 0 ? false : z;
            obj2 = (i & 32) != 0 ? null : obj2;
            analyticsContext = (i & 64) != 0 ? null : analyticsContext;
            resourceImage = (i & 128) != 0 ? null : resourceImage;
            vmVar = (i & 256) != 0 ? null : vmVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            int i2 = R$attr.uikit_dp0;
            this.f52438a = listId;
            this.f52439b = title;
            this.f52440c = image;
            this.d = true;
            this.e = z;
            this.f = resourceImage;
            this.f52441g = vmVar;
            this.f52442h = tmVar;
            this.i = obj2;
            this.f52443j = analyticsContext;
            this.k = i2;
            this.f52444l = i2;
            this.f52445m = i2;
            this.f52446n = i2;
            this.o = c.d.f249513a;
            this.f52447p = null;
            this.f52448q = null;
            this.f52449r = null;
            this.f52450s = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new HighlightTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52926a() {
            return this.f52438a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52438a, model.f52438a) && Intrinsics.f(this.f52439b, model.f52439b) && Intrinsics.f(this.f52440c, model.f52440c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52441g, model.f52441g) && Intrinsics.f(this.f52442h, model.f52442h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52443j, model.f52443j) && this.k == model.k && this.f52444l == model.f52444l && this.f52445m == model.f52445m && this.f52446n == model.f52446n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52447p, model.f52447p) && Intrinsics.f(this.f52448q, model.f52448q) && Intrinsics.f(this.f52449r, model.f52449r) && Intrinsics.f(this.f52450s, model.f52450s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52937r() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52932l() {
            return this.f52443j;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52438a.hashCode() * 31, 31, this.f52439b);
            Image image = this.f52440c;
            int iC = j6.a.c(j6.a.c((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.d), 31, this.e);
            Image image2 = this.f;
            int iHashCode = (iC + (image2 == null ? 0 : image2.hashCode())) * 31;
            vm vmVar = this.f52441g;
            int iHashCode2 = (iHashCode + (vmVar == null ? 0 : vmVar.f166848a.hashCode())) * 961;
            tm tmVar = this.f52442h;
            int iHashCode3 = (iHashCode2 + (tmVar == null ? 0 : tmVar.hashCode())) * 31;
            Object obj2 = this.i;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52443j;
            int i = h30.l.i(this.o, j6.a.b(this.f52446n, j6.a.b(this.f52445m, j6.a.b(this.f52444l, j6.a.b(this.k, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52447p;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52448q;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52449r;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52450s;
            return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52934n() {
            return this.f52447p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.o = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getO() {
            return this.f52448q;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52449r = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52938s() {
            return this.f52444l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getU() {
            return this.f52446n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52444l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52933m() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52936q() {
            return this.f52450s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52935p() {
            return this.f52449r;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52447p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52443j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52939t() {
            return this.f52445m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52448q = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52450s = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new zm(!Intrinsics.f(model.f52439b, this.f52439b), !Intrinsics.f(model.f52440c, this.f52440c), model.d != this.d, model.e != this.e, !Intrinsics.f(model.f52442h, this.f52442h), !Intrinsics.f(model.f, this.f), !Intrinsics.f(model.f52441g, this.f52441g), !true);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.HighlightTileDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public HighlightTileDelegate() {
        super(R$layout.internal_delegate_highlight_tile, new dk(11));
        this.f52437c = v0.a.d("create(...)");
    }

    public static um p() {
        return new um(new xm(R$attr.uikit_colorWidgetBackground), (dn) null, 5);
    }

    public static ShapeDrawable q(Function1 function1, float f4) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f4;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setAntiAlias(true);
        function1.invoke(shapeDrawable);
        return shapeDrawable;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new en(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_highlight_tile));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0319 A[LOOP:6: B:148:0x0313->B:150:0x0319, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036e  */
    /* JADX WARN: Type inference failed for: r7v30, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.en r33, com.revolut.core.ui_kit.delegates.HighlightTileDelegate.Model r34, int r35, java.util.List r36) {
        /*
            Method dump skipped, instruction units count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.HighlightTileDelegate.p(ip0.en, com.revolut.core.ui_kit.delegates.HighlightTileDelegate$Model, int, java.util.List):void");
    }
}
