package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.drawables.BorderGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeSelectorSmallDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AttributeSelectorSmallDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/u0;", "<init>", "()V", "Companion", "Model", "ip0/r1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AttributeSelectorSmallDelegate extends BaseRecyclerViewDelegate<Model, u0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51670c;

    public AttributeSelectorSmallDelegate() {
        super(R$layout.internal_delegate_attribute_selector_small, new ip0.c(17));
        this.f51670c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        u0 u0Var = new u0(kotlin.jvm.internal.s.r(parent, this.f98535a));
        u0Var.itemView.setClipToOutline(true);
        return u0Var;
    }

    public final efm.r p() {
        efm.r rVarHide = this.f51670c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(u0 holder, Model data, int i, List list) {
        Drawable borderGradientDrawable;
        ?? r110;
        float f;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f54797j;
        AppCompatImageView appCompatImageView = holder.i;
        TextView textView2 = holder.f54795g;
        TextView textView3 = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.r1)) {
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
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        int i3 = 0;
        while (i3 < size2) {
            ip0.r1 r1Var = (ip0.r1) payloads.get(i3);
            zIsEmpty = zIsEmpty || r1Var.f166078a;
            z = z || r1Var.f166079b;
            z3 = z3 || r1Var.f166080c;
            z4 = z4 || r1Var.d;
            z6 = z6 || r1Var.f166082h;
            List list2 = payloads;
            z11 = z11 || r1Var.f;
            z12 = z12 || r1Var.f166081g;
            z29 = z29 || r1Var.e;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty) {
            q0 q0Var = data.f51672b;
            p0 p0Var = q0Var instanceof p0 ? (p0) q0Var : null;
            kli.a.b(textView3, p0Var != null ? p0Var.f54567a : 0, ty0.f.f275450a);
        }
        if (z) {
            q0 q0Var2 = data.f51672b;
            p0 p0Var2 = q0Var2 instanceof p0 ? (p0) q0Var2 : null;
            kli.a.b(textView2, p0Var2 != null ? p0Var2.f54568b : null, ty0.f.f275450a);
        }
        if (z3) {
            q0 q0Var3 = data.f51672b;
            o0 o0Var = q0Var3 instanceof o0 ? (o0) q0Var3 : null;
            ResourceImage resourceImage = o0Var != null ? o0Var.f54524a : null;
            appCompatImageView.setVisibility(resourceImage != null ? 0 : 8);
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yy0.f.e(jh.d.f(context).Q(), resourceImage, holder.i, null, null, 12);
        }
        if (z4) {
            q0 q0Var4 = data.f51672b;
            o0 o0Var2 = q0Var4 instanceof o0 ? (o0) q0Var4 : null;
            kli.a.b(textView, o0Var2 != null ? o0Var2.f54525b : null, ty0.f.f275450a);
        }
        if (z6 || z11 || z12) {
            Intrinsics.checkNotNullParameter(data, "data");
            qv0.c cVar = data.f51675h;
            k0 k0Var = data.f;
            float fA = cVar instanceof c.f ? ((c.f) cVar).f249516a.a() : cVar instanceof c.a ? ((c.a) cVar).f249510a.a() : cVar instanceof c.e ? ((c.e) cVar).f249514a.a() : BitmapDescriptorFactory.HUE_RED;
            View view = holder.f54796h;
            r0 r0Var = data.e;
            if (r0Var != null) {
                List list3 = r0Var.f54654a;
                float fA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 2.0f);
                float fA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", fA);
                int size3 = list3.size();
                int[] iArr = new int[size3];
                int i5 = 0;
                while (i5 < size3) {
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iArr[i5] = kli.a.s(((Number) list3.get(i5)).intValue(), context2);
                    i5++;
                    k0Var = k0Var;
                }
                k0 k0Var2 = k0Var;
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                borderGradientDrawable = new BorderGradientDrawable(fA3, fA2, iArr, kli.a.s(k0Var2.a(), context3));
            } else {
                int iA = k0Var.a();
                Context context4 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Context context5 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context4, kli.a.s(iA, context5), 4);
                Context context6 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                roundedBackgroundDrawable.f(kli.a.k(context6, fA));
                borderGradientDrawable = roundedBackgroundDrawable;
            }
            view.setBackground(borderGradientDrawable);
        }
        if (z29) {
            s0 state = data.f51673c;
            Intrinsics.checkNotNullParameter(state, "state");
            int i6 = t0.f54723a[state.ordinal()];
            if (i6 == 1) {
                f = 1.0f;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.4f;
            }
            textView3.setAlpha(f);
            textView2.setAlpha(f);
            appCompatImageView.setAlpha(f);
            textView.setAlpha(f);
        }
        if (!data.d) {
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
            return;
        }
        q0 q0Var5 = data.f51672b;
        if (q0Var5 instanceof p0) {
            r110 = ((p0) q0Var5).f54567a;
        } else {
            if (!(q0Var5 instanceof o0)) {
                throw new NoWhenBranchMatchedException();
            }
            r110 = ((o0) q0Var5).f54525b;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar2 = new py0.c(r110);
        or0.m.a(itemView);
        itemView.setOnClickListener(new au0.i3(data, cVar2, this, data, 4));
        holder.itemView.setClickable(true);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0007\b\t\n\u000bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeSelectorSmallDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/s0", "com/revolut/core/ui_kit/delegates/k0", "com/revolut/core/ui_kit/delegates/q0", "com/revolut/core/ui_kit/delegates/n0", "com/revolut/core/ui_kit/delegates/r0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f51672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s0 f51673c;
        public final boolean d;
        public final r0 e;
        public final k0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f51674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f51675h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51676j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51677l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51678m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51679n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51680p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f51681q;

        public Model(String str, q0 q0Var, s0 s0Var, boolean z, r0 r0Var, k0 k0Var, Object obj2, Parcelable parcelable) {
            int i = R$attr.uikit_dp0;
            this.f51671a = str;
            this.f51672b = q0Var;
            this.f51673c = s0Var;
            this.d = z;
            this.e = r0Var;
            this.f = k0Var;
            this.f51674g = obj2;
            this.f51675h = c.d.f249513a;
            this.i = null;
            this.f51676j = null;
            this.k = null;
            this.f51677l = null;
            this.f51678m = i;
            this.f51679n = i;
            this.o = i;
            this.f51680p = i;
            this.f51681q = parcelable;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AttributeSelectorSmallDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f51674g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51938a() {
            return this.f51671a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51671a, model.f51671a) && Intrinsics.f(this.f51672b, model.f51672b) && this.f51673c == model.f51673c && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51674g, model.f51674g) && Intrinsics.f(this.f51675h, model.f51675h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51676j, model.f51676j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51677l, model.f51677l) && this.f51678m == model.f51678m && this.f51679n == model.f51679n && this.o == model.o && this.f51680p == model.f51680p && Intrinsics.f(this.f51681q, model.f51681q);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51945m() {
            return this.f51678m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51678m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f51681q;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f51673c.hashCode() + ((this.f51672b.hashCode() + (this.f51671a.hashCode() * 31)) * 961)) * 31, 31, this.d);
            r0 r0Var = this.e;
            int iHashCode = (this.f.hashCode() + ((iC + (r0Var == null ? 0 : r0Var.f54654a.hashCode())) * 31)) * 31;
            Object obj2 = this.f51674g;
            int i = h30.l.i(this.f51675h, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51676j;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51677l;
            int iB = j6.a.b(this.f51680p, j6.a.b(this.o, j6.a.b(this.f51679n, j6.a.b(this.f51678m, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f51681q;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51675h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51943j() {
            return this.f51676j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51946n() {
            return this.f51679n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51947p() {
            return this.f51680p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51679n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51941g() {
            return this.f51675h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51944l() {
            return this.f51677l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51681q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51676j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51677l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            q0 q0Var = model.f51672b;
            q0 q0Var2 = this.f51672b;
            boolean z3 = q0Var2 instanceof p0;
            p0 p0Var = z3 ? (p0) q0Var2 : null;
            Object obj2 = p0Var != null ? p0Var.f54567a : null;
            boolean z4 = q0Var instanceof p0;
            p0 p0Var2 = z4 ? (p0) q0Var : null;
            boolean zF = Intrinsics.f(obj2, p0Var2 != null ? p0Var2.f54567a : null);
            boolean z6 = true;
            boolean z11 = !zF;
            p0 p0Var3 = z3 ? (p0) q0Var2 : null;
            Clause clause = p0Var3 != null ? p0Var3.f54568b : null;
            p0 p0Var4 = z4 ? (p0) q0Var : null;
            boolean z12 = !Intrinsics.f(clause, p0Var4 != null ? p0Var4.f54568b : null);
            boolean z29 = q0Var2 instanceof o0;
            o0 o0Var = z29 ? (o0) q0Var2 : null;
            ResourceImage resourceImage = o0Var != null ? o0Var.f54524a : null;
            boolean z31 = q0Var instanceof o0;
            o0 o0Var2 = z31 ? (o0) q0Var : null;
            boolean z41 = !Intrinsics.f(resourceImage, o0Var2 != null ? o0Var2.f54524a : null);
            o0 o0Var3 = z29 ? (o0) q0Var2 : null;
            TextClause textClause = o0Var3 != null ? o0Var3.f54525b : null;
            o0 o0Var4 = z31 ? (o0) q0Var : null;
            boolean z49 = !Intrinsics.f(textClause, o0Var4 != null ? o0Var4.f54525b : null);
            if (this.f51673c != model.f51673c) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            return new ip0.r1(z11, z12, z41, z49, z6, Intrinsics.f(this.e, model.e) ^ z, this.f != model.f ? z : false, !Intrinsics.f(this.f51675h, model.f51675h));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, p0 contentMode, n0 n0Var, s0 s0Var, Object obj2, AnalyticsContext analyticsContext, int i) {
            s0 state = (i & 8) != 0 ? s0.NORMAL : s0Var;
            AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
            k0 backgroundColor = k0.ACTION_BACKGROUND_NEUTRAL;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(contentMode, "contentMode");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this(listId, contentMode, state, true, n0Var != null ? n0Var.f54489a : null, backgroundColor, obj2, analyticsContext2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, q0 contentMode, r0 r0Var, Object obj2) {
            s0 state = s0.NORMAL;
            k0 backgroundColor = k0.ACTION_BACKGROUND_NEUTRAL;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(contentMode, "contentMode");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this(listId, contentMode, state, true, r0Var, backgroundColor, obj2, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Clause clause2, r0 r0Var, s0 s0Var, boolean z, Object obj2, k0 k0Var, int i) {
            Clause clause3 = (i & 4) != 0 ? null : clause2;
            r0 r0Var2 = (i & 8) != 0 ? null : r0Var;
            s0 state = (i & 16) != 0 ? s0.NORMAL : s0Var;
            boolean z3 = (i & 32) != 0 ? true : z;
            Object obj3 = (i & 64) != 0 ? null : obj2;
            k0 backgroundColor = (i & 256) != 0 ? k0.ACTION_BACKGROUND_NEUTRAL : k0Var;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this(listId, new p0(clause, clause3), state, z3, r0Var2, backgroundColor, obj3, null);
        }
    }
}
