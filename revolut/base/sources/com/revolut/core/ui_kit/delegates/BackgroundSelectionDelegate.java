package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.imageview.ShapeableImageView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0007\b\t\n\u000b\u0003\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BackgroundSelectionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/BackgroundSelectionDelegate$Model;", "Lip0/s2;", "<init>", "()V", "Companion", "Model", "ip0/m2", "ip0/r2", "ip0/o2", "ip0/n2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundSelectionDelegate extends BaseRecyclerViewDelegate<Model, ip0.s2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51692c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BackgroundSelectionDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f51694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51695c;
        public final ip0.o2 d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ip0.r2 f51696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51697h;
        public final ip0.m2 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f51698j;
        public Parcelable k;

        public Model(String listId, Image image, boolean z, ip0.o2 sizeMode, boolean z3, ip0.r2 r2Var, ip0.m2 m2Var, Object obj2, int i) {
            boolean z4 = (i & 16) == 0;
            z3 = (i & 32) != 0 ? false : z3;
            r2Var = (i & 64) != 0 ? null : r2Var;
            boolean z6 = (i & 256) == 0;
            m2Var = (i & 1024) != 0 ? null : m2Var;
            obj2 = (i & 2048) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(sizeMode, "sizeMode");
            ip0.q2 state = ip0.q2.f165913a;
            Intrinsics.checkNotNullParameter(state, "state");
            this.f51693a = listId;
            this.f51694b = image;
            this.f51695c = z;
            this.d = sizeMode;
            this.e = z4;
            this.f = z3;
            this.f51696g = r2Var;
            this.f51697h = z6;
            this.i = m2Var;
            this.f51698j = obj2;
            this.k = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new BackgroundSelectionDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.f51698j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53293a() {
            return this.f51693a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            if (!Intrinsics.f(this.f51693a, model.f51693a) || !this.f51694b.equals(model.f51694b) || this.f51695c != model.f51695c || this.d != model.d || this.e != model.e || this.f != model.f || !Intrinsics.f(this.f51696g, model.f51696g) || this.f51697h != model.f51697h) {
                return false;
            }
            Object obj3 = ip0.q2.f165913a;
            return obj3.equals(obj3) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51698j, model.f51698j) && Intrinsics.f(this.k, model.k);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.k;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c((this.d.hashCode() + j6.a.c(a10.b.c(this.f51694b, this.f51693a.hashCode() * 31, 31), 31, this.f51695c)) * 31, 31, this.e), 31, this.f);
            ip0.r2 r2Var = this.f51696g;
            int iHashCode = (ip0.q2.f165913a.hashCode() + j6.a.c((iC + (r2Var == null ? 0 : r2Var.hashCode())) * 961, 31, this.f51697h)) * 31;
            ip0.m2 m2Var = this.i;
            int iHashCode2 = (iHashCode + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
            Object obj2 = this.f51698j;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !model.f51694b.equals(this.f51694b);
            boolean z4 = false;
            boolean z6 = model.f51695c != this.f51695c;
            if (model.d != this.d) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            boolean z11 = model.e != this.e ? true : z;
            boolean z12 = model.f != this.f ? true : z;
            boolean z29 = !Intrinsics.f(model.f51696g, this.f51696g);
            boolean z31 = !true;
            boolean z41 = model.f51697h != this.f51697h ? true : z;
            Object obj2 = ip0.q2.f165913a;
            return new ip0.n2(z3, z6, z4, z11, z12, z29, z31, z41, !obj2.equals(obj2), !Intrinsics.f(model.i, this.i));
        }
    }

    public BackgroundSelectionDelegate() {
        super(R$layout.internal_delegate_background_selection_item, new ip0.c(24));
        this.f51692c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.s2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_background_selection_item));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.s2 holder, Model data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        py0.d dVar;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        float f;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShapeableImageView shapeableImageView = holder.f166269g;
        ImageView imageView = holder.f166273m;
        ImageView imageView2 = holder.k;
        ImageView imageView3 = holder.f166272l;
        TextView textView = holder.i;
        ImageView imageView4 = holder.f166270h;
        ShapeableImageView shapeableImageView2 = holder.f;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        boolean zN9 = ue0.e.n(payloads);
        boolean zN10 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            Iterator it9 = it8;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it9.next();
            boolean z31 = zN;
            if (next instanceof ip0.n2) {
                zN = z31 || ((ip0.n2) next).f165443a;
                zN2 = zN2 || ((ip0.n2) next).f165444b;
                zN3 = zN3 || ((ip0.n2) next).f165445c;
                zN4 = zN4 || ((ip0.n2) next).d;
                zN5 = zN5 || ((ip0.n2) next).e;
                zN6 = zN6 || ((ip0.n2) next).f;
                zN7 = zN7 || ((ip0.n2) next).f165446g;
                zN8 = zN8 || ((ip0.n2) next).f165447h;
                zN9 = zN9 || ((ip0.n2) next).i;
                zN10 = zN10 || ((ip0.n2) next).f165448j;
            } else {
                zN = z31;
            }
            it8 = it9;
        }
        if (zN) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.f51694b, holder.f, null, null, 12);
        }
        boolean z41 = zN2;
        if (zN8) {
            boolean z49 = data.f51697h;
            z = zN3;
            Context context = shapeableImageView2.getContext();
            if (z49) {
                Intrinsics.h(context);
                z3 = zN4;
                shapeableImageView2.setStrokeColor(kli.a.u(R$attr.uikit_colorGreyTone10, context));
                shapeableImageView2.setStrokeWidth(kli.a.k(context, 2.0f));
            } else {
                z3 = zN4;
                shapeableImageView2.setStrokeColor(null);
                shapeableImageView2.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
            }
            shapeableImageView2.setClipToOutline(z49);
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ColorStateList colorStateListU = kli.a.u(data.f51697h ? R$attr.uikit_colorForeground : R$attr.uikit_colorWhite, context2);
            imageView3.setImageTintList(colorStateListU);
            imageView2.setImageTintList(colorStateListU);
            imageView4.setImageTintList(colorStateListU);
            textView.setTextColor(colorStateListU);
        } else {
            z = zN3;
            z3 = zN4;
        }
        if (z41) {
            holder.f166271j.setVisibility(data.f51695c ? 0 : 8);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            pd.b.i(itemView, data.f51695c);
        }
        if (z) {
            int i2 = ip0.t2.f166421a[data.d.ordinal()];
            if (i2 == 1) {
                shapeableImageView2.getLayoutParams().width = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 72.0f);
                holder.itemView.getLayoutParams().width = -2;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                shapeableImageView2.getLayoutParams().width = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
                holder.itemView.getLayoutParams().width = -1;
            }
            shapeableImageView2.requestLayout();
        }
        if (z3) {
            imageView2.setVisibility((!data.e || jo0.i.f176844b) ? 8 : 0);
        }
        if (zN5) {
            imageView3.setVisibility(data.f ? 0 : 8);
        }
        if (zN6) {
            holder.f166274n.setVisibility(8);
            imageView.setVisibility(8);
            ip0.r2 r2Var = data.f51696g;
            if (r2Var != null) {
                if (!r2Var.equals(ip0.r2.f166084a)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setVisibility(0);
            }
        }
        if (zN7) {
            TextView textView2 = holder.o;
            data.getClass();
            kli.a.b(textView2, null, ty0.f.f275450a);
        }
        Object obj2 = ip0.q2.f165913a;
        ip0.p2 p2Var = ip0.p2.f165756a;
        if (zN9) {
            View view2 = holder.itemView;
            data.getClass();
            if (obj2.equals(obj2)) {
                f = 1.0f;
            } else {
                if (!obj2.equals(p2Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.4f;
            }
            view2.setAlpha(f);
        }
        if (zN10) {
            ip0.m2 m2Var = data.i;
            if (m2Var == null) {
                shapeableImageView.setVisibility(8);
                imageView4.setVisibility(8);
                dVar = null;
                imageView4.setImageDrawable(null);
                kli.a.b(textView, null, ty0.f.f275450a);
                z4 = false;
            } else {
                dVar = null;
                View view3 = holder.itemView;
                yy0.f.e(h30.l.z(view3, "itemView", view3), m2Var.f165302a, holder.f166270h, null, null, 12);
                kli.a.b(textView, null, ty0.f.f275450a);
                z4 = false;
                shapeableImageView.setVisibility(0);
                imageView4.setVisibility(0);
            }
        } else {
            z4 = false;
            dVar = null;
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        data.getClass();
        if (obj2.equals(obj2)) {
            z6 = true;
        } else {
            if (!obj2.equals(p2Var)) {
                throw new NoWhenBranchMatchedException();
            }
            z6 = z4;
        }
        or0.m.a(itemView2);
        if (z6) {
            z11 = z4;
            z12 = true;
            itemView2.setOnClickListener(new au0.i3(data, dVar, this, data, 6));
        } else {
            z11 = z4;
            z12 = true;
            or0.u.o(itemView2);
        }
        if (obj2.equals(obj2)) {
            z29 = z12;
        } else {
            if (!obj2.equals(p2Var)) {
                throw new NoWhenBranchMatchedException();
            }
            z29 = z11;
        }
        or0.m.a(imageView);
        if (z29) {
            imageView.setOnClickListener(new au0.r2(this, data, 4));
        } else {
            or0.u.o(imageView);
        }
    }
}
