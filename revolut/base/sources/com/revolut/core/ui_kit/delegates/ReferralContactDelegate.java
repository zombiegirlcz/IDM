package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ba0;
import ip0.ca0;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\t\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReferralContactDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ReferralContactDelegate$Model;", "Lip0/ca0;", "<init>", "()V", "Companion", "a", "Model", "ip0/ba0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralContactDelegate extends BaseRecyclerViewDelegate<Model, ca0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53160c;

    public ReferralContactDelegate() {
        super(R$layout.internal_delegate_referral_contact, new t90(3));
        this.f53160c = v0.a.d("create(...)");
    }

    public static void p(Model model, ca0 ca0Var) {
        View view = ca0Var.itemView;
        TagView tagView = ca0Var.k;
        Context context = view.getContext();
        TextView textView = ca0Var.i;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (model.k == null) {
            tagView.setVisibility(8);
            Intrinsics.h(context);
            int iK = kli.a.k(context, 8.0f);
            if (marginLayoutParams.topMargin == iK && marginLayoutParams.bottomMargin == 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = iK;
            marginLayoutParams2.bottomMargin = 0;
            textView.setLayoutParams(marginLayoutParams2);
            return;
        }
        tagView.setVisibility(0);
        tagView.setContent(model.k);
        Intrinsics.h(context);
        int iK2 = kli.a.k(context, 4.0f);
        int iK3 = kli.a.k(context, 2.0f);
        if (marginLayoutParams.topMargin != iK2 || marginLayoutParams.bottomMargin != iK3) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = iK2;
            marginLayoutParams3.bottomMargin = iK3;
            textView.setLayoutParams(marginLayoutParams3);
        }
        ViewGroup.LayoutParams layoutParams4 = tagView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.bottomMargin = kli.a.k(context, 4.0f);
        tagView.setLayoutParams(marginLayoutParams4);
    }

    public static void s(Model model, ca0 ca0Var) {
        int i;
        ViewGroup.LayoutParams layoutParams = ca0Var.f163707l.getLayoutParams();
        int i2 = layoutParams.width;
        int i3 = le.f54439a[model.f53164g.ordinal()];
        if (i3 == 1) {
            i = -2;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        layoutParams.width = i;
        if (i2 != i) {
            ca0Var.f163707l.setLayoutParams(layoutParams);
        }
        int iA = model.f53166j ? Integer.MAX_VALUE : com.google.android.gms.internal.mlkit_vision_face.a.a(ca0Var.itemView, "getContext(...)", 72.0f);
        ca0Var.i.setMaxWidth(iA);
        ca0Var.f163706j.setMaxWidth(iA);
    }

    public static void t(Model model, ca0 ca0Var) {
        AvatarModel.State e = model.f53162b.getE();
        int iD = 0;
        if (e instanceof AvatarModel.State.Enabled) {
            View view = ca0Var.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (iD < childCount) {
                iD = m72.b.d(viewGroup, iD, 1.0f, iD, 1);
            }
            return;
        }
        if (!(e instanceof AvatarModel.State.DisabledExceptBadge)) {
            throw new NoWhenBranchMatchedException();
        }
        View[] viewArr = {ca0Var.f163704g};
        View view2 = ca0Var.itemView;
        Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) view2;
        int childCount2 = viewGroup2.getChildCount();
        while (iD < childCount2) {
            View childAt = viewGroup2.getChildAt(iD);
            if (kotlin.collections.d.I(viewArr, childAt)) {
                childAt.setAlpha(1.0f);
            } else {
                childAt.setAlpha(0.5f);
            }
            iD++;
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ca0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_referral_contact));
    }

    public final efm.r q() {
        efm.r rVarHide = this.f53160c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(ca0 holder, Model data, int i, List list) {
        boolean z;
        List<ba0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        fp0.p pVar = holder.f163705h;
        AvatarView avatarView = holder.f163704g;
        TextView textView = holder.f163706j;
        TextView textView2 = holder.i;
        boolean z3 = data.i;
        AvatarModel avatarModel = data.f53162b;
        boolean z4 = data.f53165h;
        boolean z6 = data.f53166j;
        int i2 = data.f;
        int i3 = data.e;
        Clause clause = data.d;
        Clause clause2 = data.f53163c;
        fp0.p.b(pVar, z3);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z3) {
            z = z6;
            view.setOnClickListener(new au0.t1(data, 16, this, data));
        } else {
            z = z6;
            or0.u.o(view);
        }
        if (payloads.isEmpty()) {
            kli.a.b(textView2, clause2, ty0.f.f275450a);
            kli.a.b(textView, clause, ty0.f.f275450a);
            p(data, holder);
            jb3.l.e(textView2, z ? R$attr.internal_textAppearanceEmphasis2 : R$attr.internal_textAppearanceBody3);
            avatarView.setModel(avatarModel);
            textView2.setMaxLines(i3);
            textView.setMaxLines(i2);
            t(data, holder);
            holder.itemView.setEnabled(z4);
            s(data, holder);
            return;
        }
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof ba0)) {
                payloads = null;
                break;
            }
            i5++;
        }
        if (payloads != null) {
            for (ba0 ba0Var : payloads) {
                boolean z11 = ba0Var.f163568a;
                boolean z12 = ba0Var.f163572h;
                if (z11) {
                    kli.a.b(textView2, clause2, ty0.f.f275450a);
                }
                if (ba0Var.f163569b) {
                    kli.a.b(textView, clause, ty0.f.f275450a);
                }
                if (ba0Var.f163573j) {
                    p(data, holder);
                }
                if (ba0Var.f163570c) {
                    textView2.setMaxLines(i3);
                }
                if (ba0Var.d) {
                    textView.setMaxLines(i2);
                }
                if (ba0Var.e || z12) {
                    s(data, holder);
                }
                if (z12) {
                    jb3.l.e(textView2, z ? R$attr.internal_textAppearanceEmphasis2 : R$attr.internal_textAppearanceBody3);
                }
                if (ba0Var.f163571g) {
                    t(data, holder);
                }
                if (ba0Var.f) {
                    holder.itemView.setEnabled(z4);
                }
                if (ba0Var.i) {
                    avatarView.setModel(avatarModel);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\t\n\u000bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReferralContactDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/core/ui_kit/delegates/ke", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, qv0.q, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AvatarModel f53162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53163c;
        public final Clause d;
        public final int e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ke f53164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53165h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f53166j;
        public final TagViewData k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f53167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f53168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f53169n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53171q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53172r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53173s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f53174t;
        public final int u;
        public final int v;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0418a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0418a f53175a = new C0418a();

                private C0418a() {
                }
            }

            private a() {
            }
        }

        public Model(String listId, AvatarModel avatarModel, Clause clause, Clause clause2, int i, int i2, ke widthMode, boolean z, boolean z3, boolean z4, TagViewData tagViewData, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            this.f53161a = listId;
            this.f53162b = avatarModel;
            this.f53163c = clause;
            this.d = clause2;
            this.e = i;
            this.f = i2;
            this.f53164g = widthMode;
            this.f53165h = z;
            this.i = z3;
            this.f53166j = z4;
            this.k = tagViewData;
            this.f53167l = obj2;
            this.f53168m = parcelable;
            this.f53169n = c.d.f249513a;
            int i3 = R$attr.uikit_dp0;
            this.f53173s = i3;
            this.f53174t = i3;
            this.u = i3;
            this.v = i3;
        }

        public static Model e(Model model, String str, AvatarModel avatarModel, Clause clause, ke keVar, boolean z, Object obj2, int i) {
            String listId = (i & 1) != 0 ? model.f53161a : str;
            AvatarModel avatarModel2 = (i & 2) != 0 ? model.f53162b : avatarModel;
            Clause clause2 = model.f53163c;
            Clause clause3 = (i & 8) != 0 ? model.d : clause;
            int i2 = (i & 16) != 0 ? model.e : 1;
            int i3 = (i & 32) != 0 ? model.f : 1;
            ke widthMode = (i & 64) != 0 ? model.f53164g : keVar;
            boolean z3 = model.f53165h;
            boolean z4 = model.i;
            boolean z6 = (i & 512) != 0 ? model.f53166j : z;
            TagViewData tagViewData = model.k;
            Object obj3 = (i & 2048) != 0 ? model.f53167l : obj2;
            Parcelable parcelable = model.f53168m;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(avatarModel2, "avatarModel");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            return new Model(listId, avatarModel2, clause2, clause3, i2, i3, widthMode, z3, z4, z6, tagViewData, obj3, parcelable);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ReferralContactDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51787l() {
            return this.f53167l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51781a() {
            return this.f53161a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53161a, model.f53161a) && Intrinsics.f(this.f53162b, model.f53162b) && Intrinsics.f(this.f53163c, model.f53163c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f53164g == model.f53164g && this.f53165h == model.f53165h && this.i == model.i && this.f53166j == model.f53166j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53167l, model.f53167l) && Intrinsics.f(this.f53168m, model.f53168m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51793s() {
            return this.f53173s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53173s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51788m() {
            return this.f53168m;
        }

        public final int hashCode() {
            int iHashCode = (this.f53162b.hashCode() + (this.f53161a.hashCode() * 31)) * 31;
            Clause clause = this.f53163c;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iC = j6.a.c(j6.a.c(j6.a.c((this.f53164g.hashCode() + j6.a.b(this.f, j6.a.b(this.e, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31), 31)) * 31, 31, this.f53165h), 31, this.i), 31, this.f53166j);
            TagViewData tagViewData = this.k;
            int iHashCode3 = (iC + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
            Object obj2 = this.f53167l;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53168m;
            return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53169n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51790p() {
            return this.f53170p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53171q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51794t() {
            return this.f53174t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getV() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53174t = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51789n() {
            return this.f53169n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51792r() {
            return this.f53172r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51791q() {
            return this.f53171q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53168m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getU() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53170p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53172r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            Clause clause = model.f53163c;
            AvatarModel avatarModel = model.f53162b;
            boolean z4 = !Intrinsics.f(clause, this.f53163c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = false;
            boolean z12 = model.e != this.e;
            boolean z29 = model.f != this.f;
            if (model.f53164g != this.f53164g) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (model.f53165h != this.f53165h) {
                z3 = z;
                z = true;
            } else {
                z3 = z;
            }
            boolean z31 = !Intrinsics.f(avatarModel.getE(), this.f53162b.getE());
            if (model.f53166j != this.f53166j) {
                z3 = true;
            }
            return new ba0(z4, z6, z12, z29, z11, z, z31, z3, !Intrinsics.f(avatarModel, r11), !Intrinsics.f(model.k, this.k));
        }

        public /* synthetic */ Model(String str, AvatarModel avatarModel, Clause clause, Clause clause2, ke keVar, TagViewData tagViewData, Object obj2, AnalyticsContext analyticsContext, int i) {
            this(str, avatarModel, clause, (i & 8) != 0 ? null : clause2, 2, (i & 32) != 0 ? 1 : Integer.MAX_VALUE, (i & 64) != 0 ? ke.WRAP_CONTENT : keVar, true, true, (i & 512) == 0, (i & 1024) != 0 ? null : tagViewData, (i & 2048) != 0 ? null : obj2, (i & 4096) != 0 ? null : analyticsContext);
        }

        public /* synthetic */ Model(String str, Image image, Clause clause, Clause clause2, CircleBadgeModel circleBadgeModel, ke keVar, boolean z, ProgressStyle progressStyle, Object obj2, int i) {
            this(str, image, clause, (i & 8) != 0 ? null : clause2, null, circleBadgeModel, a.C0418a.f53175a, null, (i & 256) != 0 ? 2 : 1, 1, (i & 1024) != 0 ? ke.WRAP_CONTENT : keVar, true, (i & 4096) != 0 ? true : z, (i & 16384) != 0 ? null : progressStyle, (65536 & i) == 0, (i & 131072) != 0 ? null : obj2, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause clause, Clause clause2, TagViewData tagViewData, CircleBadgeModel circleBadgeModel, a closeBadge, RawImageBadge rawImageBadge, int i, int i2, ke widthMode, boolean z, boolean z3, ProgressStyle progressStyle, boolean z4, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(closeBadge, "closeBadge");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            AvatarModel.State.Enabled state = AvatarModel.State.Enabled.f58039a;
            Intrinsics.checkNotNullParameter(state, "state");
            je jeVar = closeBadge instanceof je ? (je) closeBadge : null;
            this(listId, new AvatarModel.Default(image, tagViewData, (AvatarModel.Border.StaticGradient) null, progressStyle, (AvatarModel.BadgeModel) null, circleBadgeModel, rawImageBadge, jeVar != null ? jeVar.f54332a : null, 544), clause, clause2, i, i2, widthMode, z, z3, z4, null, obj2, parcelable);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause clause, Clause clause2, TagViewData tagViewData, Image image2, a aVar, ke keVar, ProgressStyle progressStyle, Object obj2, Parcelable parcelable, int i) {
            Clause clause3 = (i & 8) != 0 ? null : clause2;
            TagViewData tagViewData2 = (i & 16) != 0 ? null : tagViewData;
            Image image3 = (i & 32) != 0 ? null : image2;
            a closeBadge = (i & 64) != 0 ? a.C0418a.f53175a : aVar;
            int i2 = (i & 256) != 0 ? 2 : 1;
            ke widthMode = (i & 1024) != 0 ? ke.WRAP_CONTENT : keVar;
            boolean z = (i & 4096) != 0;
            ProgressStyle progressStyle2 = (i & 16384) != 0 ? null : progressStyle;
            Object obj3 = (131072 & i) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 262144) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(closeBadge, "closeBadge");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            AvatarModel.State.Enabled state = AvatarModel.State.Enabled.f58039a;
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, image, clause, clause3, tagViewData2, image3 != null ? new RawImageBadge(image3) : null, closeBadge, null, i2, 1, widthMode, true, z, progressStyle2, false, obj3, parcelable2);
        }
    }
}
