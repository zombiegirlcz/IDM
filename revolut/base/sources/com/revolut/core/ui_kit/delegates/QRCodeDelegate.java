package com.revolut.core.ui_kit.delegates;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.e70;
import ip0.f70;
import ip0.g70;
import ip0.kt;
import ip0.l40;
import ip0.ws;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/QRCodeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/QRCodeDelegate$Model;", "Lip0/g70;", "<init>", "()V", "Companion", "Model", "ip0/f70", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QRCodeDelegate extends BaseRecyclerViewDelegate<Model, g70> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final List f = zhm.v.k(Integer.valueOf(R$attr.uikit_colorGreen_5), Integer.valueOf(R$attr.uikit_colorGreen_10), Integer.valueOf(R$attr.uikit_colorGreen), Integer.valueOf(R$attr.uikit_colorGreen_10), Integer.valueOf(R$attr.uikit_colorGreen_5));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CdnImage f53120g = new CdnImage("blurred_qr_code_light", "mobile/lounges/blurred_code", null, null, null, null, Constants.TAG_FC_SPEED_MODE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CdnImage f53121h = new CdnImage("blurred_qr_code_dark", "mobile/lounges/blurred_code", null, null, null, null, Constants.TAG_FC_SPEED_MODE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f53122c;
    public final Object d;
    public final Object e;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.QRCodeDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public QRCodeDelegate() {
        super(R$layout.internal_delegate_qrcode, new l40(17));
        this.d = te0.w.y0(new il9.p(29));
        this.e = te0.w.y0(new e70(0));
    }

    public static void p(Model model, g70 g70Var) {
        View view = g70Var.itemView;
        View view2 = g70Var.o;
        TextView textView = g70Var.f164362j;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorWhite, context);
        Context context2 = g70Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS2 = kli.a.s(R$attr.uikit_colorBlack, context2);
        Context context3 = g70Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iS3 = kli.a.s(R$attr.uikit_colorForeground, context3);
        qv0.c cVar = model.f53132p;
        boolean z = model.f53127h;
        if (Intrinsics.f(cVar, c.d.f249513a)) {
            if (z) {
                view2.setBackgroundResource(R$drawable.internal_qr_code_plain_white_background);
                textView.setTextColor(iS2);
                return;
            } else {
                view2.setBackgroundResource(R$drawable.internal_qr_code_plain_background);
                textView.setTextColor(iS3);
                return;
            }
        }
        if (z) {
            g70Var.f164367q.setBackgroundColor(iS);
            textView.setTextColor(iS2);
        } else {
            view2.setBackground(null);
            textView.setTextColor(iS3);
        }
    }

    public static void q(Model model, g70 g70Var) {
        model.getClass();
        Drawable background = g70Var.o.getBackground();
        AiBorderDrawableDecorator aiBorderDrawableDecorator = background instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background : null;
        if (aiBorderDrawableDecorator != null) {
            aiBorderDrawableDecorator.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static void t(g70 g70Var, Model.a aVar) {
        CdnImage cdnImage;
        wd wdVar = aVar instanceof wd ? (wd) aVar : null;
        g70Var.f164360g.setVisibility(wdVar != null ? 0 : 8);
        yy0.f.e(or0.u.k(g70Var.f164360g).Q(), wdVar != null ? wdVar.f54921a : 0, g70Var.f164360g, null, null, 12);
        vd vdVar = aVar instanceof vd ? (vd) aVar : null;
        kli.a.b(g70Var.f164361h, vdVar != null ? vdVar.f54865a : null, ty0.f.f275450a);
        kli.a.b(g70Var.i, vdVar != null ? vdVar.f54866b : null, ty0.f.f275450a);
        ud udVar = aVar instanceof ud ? (ud) aVar : null;
        View view = g70Var.f164366p;
        ImageView imageView = g70Var.f164363l;
        view.setVisibility(udVar != null ? 0 : 8);
        if (udVar != null) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cdnImage = kli.a.q(context) ? f53121h : f53120g;
        } else {
            cdnImage = null;
        }
        yy0.f.e(or0.u.k(imageView).Q(), cdnImage, g70Var.f164363l, null, null, 12);
        kli.a.b(g70Var.f164364m, udVar != null ? udVar.f54830a : null, ty0.f.f275450a);
        kli.a.b(g70Var.f164365n, udVar != null ? udVar.f54831b : null, ty0.f.f275450a);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new g70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_qrcode));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ObjectAnimator objectAnimator = this.f53122c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void r(Model model, g70 g70Var) {
        if (!model.f53126g) {
            g70Var.k.setOnTouchListener(null);
            g70Var.k.setOnClickListener(null);
            return;
        }
        j01.d dVar = j01.e.Companion;
        TextView textView = g70Var.k;
        dVar.getClass();
        j01.d.a(textView);
        TextView textView2 = g70Var.k;
        Clause clause = model.e;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(textView2);
        textView2.setOnClickListener(new kt(model, cVar, this, model, 14));
    }

    public final void s(Model model, ImageView imageView) {
        ObjectAnimator objectAnimator = this.f53122c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!model.i || model.f53124b == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.8f));
        objectAnimatorOfPropertyValuesHolder.setDuration(800L);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f53122c = objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f u() {
        return (ihm.f) this.d.getValue();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void p(g70 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.k;
        TextView textView2 = holder.f164362j;
        ImageView imageView = holder.f;
        if (payloads.isEmpty()) {
            or0.b.f(this, data.f53124b, imageView);
            t(holder, data.f53125c);
            or0.b.e(this, data.d, textView2, null, 12);
            or0.b.e(this, data.e, textView, null, 12);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            p(data, holder);
            if (data.f) {
                holder.itemView.setOnClickListener(new ws(this, data, 16));
            } else {
                holder.itemView.setOnClickListener(null);
            }
            r(data, holder);
            q(data, holder);
            s(data, imageView);
            return;
        }
        ArrayList<f70> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof f70) {
                arrayList.add(obj2);
            }
        }
        for (f70 f70Var : arrayList) {
            if (f70Var.f164208c) {
                or0.b.f(this, data.f53124b, imageView);
            }
            if (f70Var.d) {
                t(holder, data.f53125c);
            }
            if (f70Var.f164206a) {
                or0.b.e(this, data.d, textView2, null, 12);
            }
            if (f70Var.f164207b) {
                or0.b.e(this, data.e, textView, null, 12);
            }
            if (f70Var.e) {
                if (data.f) {
                    holder.itemView.setOnClickListener(new ws(this, data, 16));
                } else {
                    holder.itemView.setOnClickListener(null);
                }
            }
            if (f70Var.f) {
                r(data, holder);
            }
            if (f70Var.i || f70Var.f164209g) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
                p(data, holder);
            }
            if (f70Var.f164210h) {
                q(data, holder);
            }
            if (f70Var.f164211j) {
                s(data, imageView);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/QRCodeDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f53125c;
        public final Clause d;
        public final Clause e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53126g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53127h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f53128j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53130m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53131n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f53132p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53133q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53134r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53135s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53136t;

        public static abstract class a {
            private a() {
            }
        }

        public Model(String str, Image image, a aVar, Clause clause, Clause clause2, boolean z, boolean z3, boolean z4, boolean z6, Object obj2, int i, int i2, int i3, int i5) {
            this.f53123a = str;
            this.f53124b = image;
            this.f53125c = aVar;
            this.d = clause;
            this.e = clause2;
            this.f = z;
            this.f53126g = z3;
            this.f53127h = z4;
            this.i = z6;
            this.f53128j = obj2;
            this.k = null;
            this.f53129l = i;
            this.f53130m = i2;
            this.f53131n = i3;
            this.o = i5;
            this.f53132p = c.d.f249513a;
            this.f53133q = null;
            this.f53134r = null;
            this.f53135s = null;
            this.f53136t = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new QRCodeDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getP() {
            return this.f53128j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52580a() {
            return this.f53123a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53123a, model.f53123a) && Intrinsics.f(this.f53124b, model.f53124b) && Intrinsics.f(this.f53125c, model.f53125c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53126g == model.f53126g && this.f53127h == model.f53127h && this.i == model.i && Intrinsics.f(this.f53128j, model.f53128j) && Intrinsics.f(this.k, model.k) && this.f53129l == model.f53129l && this.f53130m == model.f53130m && this.f53131n == model.f53131n && this.o == model.o && Intrinsics.f(this.f53132p, model.f53132p) && Intrinsics.f(this.f53133q, model.f53133q) && Intrinsics.f(this.f53134r, model.f53134r) && Intrinsics.f(this.f53135s, model.f53135s) && Intrinsics.f(this.f53136t, model.f53136t);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getW() {
            return this.f53129l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53129l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getQ() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = this.f53123a.hashCode() * 31;
            Image image = this.f53124b;
            int iHashCode2 = (this.f53125c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31;
            Clause clause = this.d;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f), 31, this.f53126g), 31, this.f53127h), 31, false), 31, this.i);
            Object obj2 = this.f53128j;
            int iHashCode4 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            int i = h30.l.i(this.f53132p, j6.a.b(this.o, j6.a.b(this.f53131n, j6.a.b(this.f53130m, j6.a.b(this.f53129l, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f53133q;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53134r;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53135s;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53136t;
            return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getV() {
            return this.f53133q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53132p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getS() {
            return this.f53134r;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53135s = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getX() {
            return this.f53130m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getZ() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53130m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getR() {
            return this.f53132p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getU() {
            return this.f53136t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getT() {
            return this.f53135s;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53133q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getY() {
            return this.f53131n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53134r = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53136t = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !Intrinsics.f(model.d, this.d);
            boolean z4 = !Intrinsics.f(model.e, this.e);
            boolean z6 = !Intrinsics.f(model.f53125c, this.f53125c);
            boolean z11 = !Intrinsics.f(model.f53124b, this.f53124b);
            boolean z12 = false;
            if (model.f != this.f) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            return new f70(z3, z4, z11, z6, z12, model.f53126g != this.f53126g ? true : z, model.f53127h != this.f53127h ? true : z, false, (Intrinsics.f(model.f53133q, this.f53133q) && Intrinsics.f(model.f53134r, this.f53134r) && Intrinsics.f(model.f53135s, this.f53135s) && Intrinsics.f(model.f53136t, this.f53136t)) ? z : true, model.i != this.i ? true : z);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Image image2, Clause clause, TextLocalisedClause textLocalisedClause, PurchasedTransitTicket.Activated activated, int i, int i2, int i3, int i5, int i6) {
            Image image3 = (i6 & 2) != 0 ? null : image;
            Clause clause2 = (i6 & 8) != 0 ? null : clause;
            TextLocalisedClause textLocalisedClause2 = (i6 & 16) != 0 ? null : textLocalisedClause;
            boolean z = (i6 & 32) == 0;
            boolean z3 = (i6 & 128) == 0;
            PurchasedTransitTicket.Activated activated2 = (i6 & 256) != 0 ? null : activated;
            int i21 = (i6 & 1024) != 0 ? R$attr.uikit_dp32 : i;
            int i22 = (i6 & 2048) != 0 ? R$attr.uikit_dp32 : i2;
            int i32 = (i6 & 4096) != 0 ? R$attr.uikit_dp32 : i3;
            int i33 = (i6 & 8192) != 0 ? R$attr.uikit_dp32 : i5;
            boolean z4 = (i6 & 32768) == 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image2, "image");
            this(listId, image3, new wd(image2), clause2, textLocalisedClause2, z, false, z3, z4, activated2, i21, i22, i32, i33);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, CdnImage cdnImage, a state, TextClause textClause, TextLocalisedQuantityClause textLocalisedQuantityClause, int i, int i2, int i3, int i5, int i6) {
            CdnImage cdnImage2 = (i6 & 2) != 0 ? null : cdnImage;
            TextClause textClause2 = (i6 & 8) != 0 ? null : textClause;
            TextLocalisedQuantityClause textLocalisedQuantityClause2 = (i6 & 16) != 0 ? null : textLocalisedQuantityClause;
            boolean z = (i6 & 32) == 0;
            boolean z3 = (i6 & 64) == 0;
            int i21 = (i6 & 1024) != 0 ? R$attr.uikit_dp32 : i;
            int i22 = (i6 & 4096) != 0 ? R$attr.uikit_dp32 : i3;
            int i32 = (i6 & 8192) != 0 ? R$attr.uikit_dp32 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, cdnImage2, state, textClause2, textLocalisedQuantityClause2, z, z3, false, false, null, i21, i2, i22, i32);
        }
    }
}
