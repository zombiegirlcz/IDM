package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0006\u0007\b\t\n\u000b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/QuickActionWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/QuickActionWidgetDelegate$Model;", "Lop0/t3;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/c3", "com/revolut/core/ui_kit/delegates/widgets/f3", "com/revolut/core/ui_kit/delegates/widgets/b3", "com/revolut/core/ui_kit/delegates/widgets/a3", "Model", "op0/s3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuickActionWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.t3> {
    public QuickActionWidgetDelegate() {
        super(R$layout.internal_delegate_quick_action, new op0.v0(29));
    }

    public static void s(ImageView imageView, e3 e3Var) {
        ResourceImage resourceImage;
        imageView.setEnabled(e3Var != null ? e3Var.f55346b : false);
        if (e3Var != null) {
            resourceImage = new ResourceImage(e3Var.f55345a, (Integer) null, (Integer) null, Integer.valueOf(e3Var.f55346b ? R$attr.uikit_colorGrey50 : R$attr.uikit_colorGrey10), (List) null, (ImageTransformations) null, (Clause) null, 246);
        } else {
            resourceImage = null;
        }
        if (resourceImage != null) {
            imageView.setVisibility(0);
            yy0.f.e(or0.u.k(imageView).Q(), resourceImage, imageView, null, null, 12);
        } else {
            imageView.setVisibility(8);
            yy0.f.e(or0.u.k(imageView).Q(), null, imageView, null, null, 12);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.t3 t3Var = new op0.t3(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(t3Var, true);
        return t3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void p(op0.t3 holder, Model data, int i, List payloads) {
        boolean z;
        boolean z3;
        ?? r162;
        char c2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f227429n;
        TextView textView = holder.f227428m;
        ImageView imageView2 = holder.f227426j;
        TagView tagView = holder.f227434t;
        TagViewData tagViewData = data.f55220h;
        d3 d3Var = data.f55219g;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            z = zN;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Iterator it9 = it8;
            if (next instanceof op0.s3) {
                boolean z4 = z || ((op0.s3) next).f227412a;
                zN2 = zN2 || ((op0.s3) next).f227413b;
                zN3 = zN3 || ((op0.s3) next).d;
                zN4 = zN4 || ((op0.s3) next).e;
                zN5 = zN5 || ((op0.s3) next).f;
                zN6 = zN6 || ((op0.s3) next).f227415g;
                zN7 = zN7 || ((op0.s3) next).f227414c;
                zN = z4;
            } else {
                zN = z;
            }
            it8 = it9;
        }
        if (z) {
            yy0.f.e(or0.u.k(imageView2).Q(), data.f55218c, holder.f227426j, null, null, 12);
        }
        if (zN2) {
            yy0.f.e(or0.u.k(holder.k).Q(), data.d, holder.k, null, null, 12);
        }
        if (zN7) {
            yy0.f.e(or0.u.k(holder.f227427l).Q(), data.e, holder.f227427l, null, null, 12);
        }
        if (zN3) {
            ty0.c.b(or0.u.k(textView).b0(), data.f, holder.f227428m, null, null, 12);
        }
        if (zN4) {
            imageView.setEnabled(d3Var.f55328a.f55346b);
            yy0.f fVarQ = or0.u.k(imageView).Q();
            e3 e3Var = d3Var.f55328a;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i2 = e3Var.f55345a;
            boolean z6 = e3Var.f55346b;
            yy0.f.e(fVarQ, LayeredImage.Companion.b(companion, i2, Integer.valueOf(z6 ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorAccentNeutral_40), z6 ? R$attr.uikit_colorAccentNeutral_10 : R$attr.uikit_colorAccentNeutral_5, 8.0f, null, null, 48), holder.f227429n, null, null, 12);
            s(holder.o, d3Var.f55329b);
            s(holder.f227430p, d3Var.f55330c);
        }
        if (!zN5) {
            z3 = false;
        } else if (tagViewData != null) {
            z3 = false;
            tagView.setVisibility(0);
            tagView.setContent(tagViewData);
        } else {
            z3 = false;
            tagView.setVisibility(8);
        }
        if (zN6) {
            holder.F(data.i);
        }
        fp0.p pVar = holder.f227431q;
        Clause clause = data.f;
        boolean z11 = d3Var.f55328a.f55346b;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        fp0.p.b(pVar, z11);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z11) {
            c2 = 1;
            r162 = z3;
            view.setOnClickListener(new op0.u3(data, cVar, this, data, 1));
        } else {
            r162 = z3;
            c2 = 1;
            or0.u.o(view);
        }
        fp0.p pVar2 = holder.f227432r;
        e3 e3Var2 = d3Var.f55329b;
        ?? r62 = (e3Var2 == null || e3Var2.f55346b != c2) ? r162 : c2;
        py0.c cVar2 = clause != null ? new py0.c(clause) : null;
        fp0.p.b(pVar2, r62);
        View view2 = pVar2.f137029a;
        or0.m.a(view2);
        if (r62 != 0) {
            view2.setOnClickListener(new op0.u3(data, cVar2, this, data, 2));
        } else {
            or0.u.o(view2);
        }
        fp0.p pVar3 = holder.f227433s;
        e3 e3Var3 = d3Var.f55330c;
        ?? r64 = (e3Var3 == null || e3Var3.f55346b != c2) ? r162 : c2;
        py0.c cVar3 = clause != null ? new py0.c(clause) : null;
        fp0.p.b(pVar3, r64);
        View view3 = pVar3.f137029a;
        or0.m.a(view3);
        if (r64 != 0) {
            view3.setOnClickListener(new op0.u3(data, cVar3, this, data, 3));
        } else {
            or0.u.o(view3);
        }
        py0.c cVar4 = clause != null ? new py0.c(clause) : null;
        or0.m.a(imageView2);
        imageView2.setOnClickListener(new op0.u3(data, cVar4, this, data, 0));
        View[] viewArr = new View[2];
        viewArr[r162] = imageView2;
        viewArr[c2] = textView;
        imageView2.setOnTouchListener(new j01.e(viewArr));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/QuickActionWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/widgets/d3", "com/revolut/core/ui_kit/delegates/widgets/e3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f55218c;
        public final Image d;
        public final Image e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d3 f55219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TagViewData f55220h;
        public final op0.q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55221j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public op0.r f55222l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final py0.c f55223m;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Image image2, BulletImage bulletImage, Clause title, d3 actions, TagViewData tagViewData, Object obj2, int i) {
            Image image3 = (i & 4) != 0 ? null : image2;
            BulletImage bulletImage2 = (i & 8) != 0 ? null : bulletImage;
            TagViewData tagViewData2 = (i & 64) != 0 ? null : tagViewData;
            Object obj3 = (i & 128) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this(listId, image, image3, bulletImage2, title, actions, tagViewData2, op0.q.SMALL, obj3, null, op0.r.SEEN);
        }

        public static Model E(Model model, Object obj2) {
            String listId = model.f55217b;
            Image image = model.f55218c;
            Image image2 = model.d;
            Image image3 = model.e;
            Clause title = model.f;
            d3 actions = model.f55219g;
            TagViewData tagViewData = model.f55220h;
            op0.q widgetSize = model.i;
            Parcelable parcelable = model.k;
            op0.r widgetState = model.f55222l;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            return new Model(listId, image, image2, image3, title, actions, tagViewData, widgetSize, obj2, parcelable, widgetState);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getE() {
            return this.f55222l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55222l = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f55221j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54971b() {
            return this.f55217b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55223m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55217b, model.f55217b) && Intrinsics.f(this.f55218c, model.f55218c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55219g, model.f55219g) && Intrinsics.f(this.f55220h, model.f55220h) && this.i == model.i && Intrinsics.f(this.f55221j, model.f55221j) && Intrinsics.f(this.k, model.k) && this.f55222l == model.f55222l;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.k;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f55218c, this.f55217b.hashCode() * 31, 31);
            Image image = this.d;
            int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.e;
            int iHashCode2 = (this.f55219g.hashCode() + p.a.a((iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.f)) * 31;
            TagViewData tagViewData = this.f55220h;
            int iB = okl.m.b(this.i, (iHashCode2 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31, 31);
            Object obj2 = this.f55221j;
            int iHashCode3 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return this.f55222l.hashCode() + ((iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54972c() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.s3(!Intrinsics.f(r11.f55218c, this.f55218c), !Intrinsics.f(r11.d, this.d), !Intrinsics.f(r11.e, this.e), !Intrinsics.f(r11.f, this.f), !Intrinsics.f(r11.f55219g, this.f55219g), !Intrinsics.f(r11.f55220h, this.f55220h), ((Model) oldItem).i != this.i);
        }

        public Model(String str, Image image, Image image2, Image image3, Clause clause, d3 d3Var, TagViewData tagViewData, op0.q qVar, Object obj2, Parcelable parcelable, op0.r rVar) {
            this.f55217b = str;
            this.f55218c = image;
            this.d = image2;
            this.e = image3;
            this.f = clause;
            this.f55219g = d3Var;
            this.f55220h = tagViewData;
            this.i = qVar;
            this.f55221j = obj2;
            this.k = parcelable;
            this.f55222l = rVar;
            this.f55223m = new py0.c(clause);
        }
    }
}
