package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0006\u0007\b\t\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/v2;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/q2", "com/revolut/core/ui_kit/delegates/widgets/p2", "Model", "op0/g3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkWidgetDelegate extends BaseDraggableWidgetDelegate<Model, v2> {
    public PaymentLinkWidgetDelegate() {
        super(R$layout.internal_delegate_widget_payment_link, new op0.v0(25));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        v2 v2Var = new v2(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(v2Var, true);
        return v2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, com.revolut.core.ui_kit.views.LabelButtonView] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(v2 holder, Model data, int i, List payloads) {
        gp0.i hVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        fp0.p pVar = holder.o;
        TextView textView = holder.k;
        ImageView imageView = holder.f55530j;
        u2 state = data.f55202c;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof op0.g3) {
                zN = zN || ((op0.g3) obj2).f227271a;
                zN2 = zN2 || ((op0.g3) obj2).f227272b;
                zN3 = zN3 || ((op0.g3) obj2).f227273c;
                zN4 = zN4 || ((op0.g3) obj2).d;
                zN5 = zN5 || ((op0.g3) obj2).e;
            }
        }
        if (zN) {
            if (state instanceof t2) {
                View view = holder.itemView;
                yy0.f.e(h30.l.z(view, "itemView", view), ((t2) state).f55513a, holder.f55530j, null, null, 12);
                textView.setVisibility(8);
                imageView.setBackground(null);
                or0.b.j(this, c.d.f249513a, imageView);
            } else {
                if (!(state instanceof s2)) {
                    throw new NoWhenBranchMatchedException();
                }
                View view2 = holder.itemView;
                yy0.f.e(h30.l.z(view2, "itemView", view2), new CdnImage("blurred_qr_code_light", "mobile/youth/widgets/blurred_qr_code", null, null, null, "blurred_qr_code_dark", 172), holder.f55530j, null, null, 12);
                textView.setVisibility(0);
                ty0.c.b(or0.u.k(textView).b0(), ((s2) state).f55504a, holder.k, null, null, 12);
                or0.b.j(this, new c.e(qv0.h.LARGE, 2), imageView);
            }
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof t2) {
                hVar = new gp0.g(0);
            } else {
                if (!(state instanceof s2)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                hVar = new gp0.h(new hp0.c(new ColorDrawable(kli.a.s(R$attr.uikit_colorAccentNeutral_10, context)), null, 2), new gp0.f((gp0.c) null, 3), new fp0.g(new Color.Solid(R$attr.uikit_colorForeground)));
            }
            pVar.c(hVar);
        }
        if (zN2) {
            View view3 = holder.itemView;
            ty0.c.b(h30.l.x(view3, "itemView", view3), data.d, holder.f55531l, null, null, 12);
        }
        if (zN3) {
            View view4 = holder.itemView;
            ty0.c.b(h30.l.x(view4, "itemView", view4), data.e, holder.f55532m, null, null, 12);
        }
        if (zN4) {
            r2 r2Var = data.f;
            boolean z = r2Var != null;
            ?? r56 = holder.f55533n;
            r56.setVisibility(z ? 0 : 8);
            r56.setText(r2Var != null ? r2Var.f55490a : 0);
            r56.setStartIcon(r2Var != null ? r2Var.f55491b : null);
            ConstraintLayout constraintLayout = holder.f55534p;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "constraintLayout");
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.setVerticalBias(holder.f55532m.getId(), z ? BitmapDescriptorFactory.HUE_RED : 1.0f);
            constraintSet.applyTo(constraintLayout);
        }
        if (zN5) {
            holder.F(data.f55205j);
        }
        boolean z3 = state instanceof s2;
        fp0.p.b(pVar, z3);
        View view5 = pVar.f137029a;
        or0.m.a(view5);
        if (z3) {
            view5.setOnClickListener(new au0.r2(this, data, 21));
        } else {
            or0.u.o(view5);
        }
        holder.f55535q = new oa2.b(this, data, 25);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/u2", "com/revolut/core/ui_kit/delegates/widgets/r2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u2 f55202c;
        public final TextLocalisedClause d;
        public final TextLocalisedClause e;
        public final r2 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f55203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55204h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final op0.q f55205j;
        public final py0.c k;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Model(String listId, QrCodeImage image, TextLocalisedClause title, TextLocalisedClause description, r2 r2Var, Object obj2) {
            this(listId, new t2(image), title, description, r2Var, obj2);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55230m() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getU() {
            return this.f55203g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51752a() {
            return this.f55201b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55228j() {
            return this.k;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55201b, model.f55201b) && Intrinsics.f(this.f55202c, model.f55202c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55203g, model.f55203g) && Intrinsics.f(this.f55204h, model.f55204h);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getV() {
            return this.f55204h;
        }

        public final int hashCode() {
            int iA = t61.a.a(t61.a.a((this.f55202c.hashCode() + (this.f55201b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
            r2 r2Var = this.f;
            int iHashCode = (iA + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
            Object obj2 = this.f55203g;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f55204h;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55227h() {
            return this.f55205j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55204h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.g3(!Intrinsics.f(r9.f55202c, this.f55202c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f, this.f), ((Model) oldItem).f55205j != this.f55205j);
        }

        public /* synthetic */ Model(String str, s2 s2Var, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, r2 r2Var, r88.i iVar, int i) {
            this(str, s2Var, textLocalisedClause, textLocalisedClause2, r2Var, (i & 32) != 0 ? null : iVar);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public Model(String listId, u2 state, TextLocalisedClause title, TextLocalisedClause description, r2 r2Var, Object obj2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f55201b = listId;
            this.f55202c = state;
            this.d = title;
            this.e = description;
            this.f = r2Var;
            this.f55203g = obj2;
            this.f55204h = null;
            this.i = op0.r.SEEN;
            this.f55205j = op0.q.MEDIUM;
            this.k = r2Var != null ? new py0.c(r2Var.f55490a) : null;
        }
    }
}
