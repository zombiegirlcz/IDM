package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CenteredContentTileDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CenteredContentTileDelegate$Model;", "Lip0/n9;", "<init>", "()V", "Model", "ip0/f9", "ip0/m9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredContentTileDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.n9> {
    public final ihm.f e;

    public CenteredContentTileDelegate() {
        super(R$layout.internal_delegate_centered_content_tile, true, new ip0.h8(9));
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.n9(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_centered_content_tile));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.n9 holder, Model model, int i, List list) {
        String str;
        float f;
        boolean z;
        int i2;
        mx0.i1 i1Var;
        int iA;
        int i3;
        int i5;
        int i6;
        int iA2;
        int i21;
        boolean z3;
        boolean z4;
        int i22;
        Model data = model;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        NewBadgeView newBadgeView = holder.f165476j;
        TextView textView = holder.i;
        TextView textView2 = holder.f165475h;
        int size = payloads.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size) {
                break;
            }
            if (!(payloads.get(i32) instanceof ip0.f9)) {
                payloads = null;
                break;
            }
            i32++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z6 = zIsEmpty;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        for (int i33 = 0; i33 < size2; i33++) {
            ip0.f9 f9Var = (ip0.f9) payloads.get(i33);
            z6 = z6 || f9Var.f164216a;
            z11 = z11 || f9Var.f164217b;
            z12 = z12 || f9Var.f164218c;
            z29 = z29 || f9Var.d;
            z31 = z31 || f9Var.f164219g;
            zIsEmpty = zIsEmpty || f9Var.e;
            z41 = z41 || f9Var.f;
        }
        if (zIsEmpty || z6) {
            ip0.m9 m9Var = data.f51987h;
            AvatarView avatarView = holder.f165474g;
            avatarView.t0(null);
            if (m9Var instanceof ip0.l9) {
                f = 0.5f;
                str = "1:1";
            } else {
                if (!(m9Var instanceof ip0.i9)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "120:160";
                f = BitmapDescriptorFactory.HUE_RED;
            }
            ConstraintSet constraintSet = new ConstraintSet();
            ConstraintLayout constraintLayout = holder.f;
            constraintSet.clone(constraintLayout);
            z = z11;
            constraintSet.setDimensionRatio(constraintLayout.getId(), str);
            constraintSet.setVerticalBias(avatarView.getId(), f);
            constraintSet.applyTo(constraintLayout);
            if (Intrinsics.f(m9Var, ip0.g9.f164371a)) {
                int i43 = R$attr.internal_textAppearanceBody2;
                i21 = R$attr.internal_textAppearanceEmphasis2;
                i1Var = mx0.i1.SIZE_48_48;
                int iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f);
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 20.0f);
                i3 = iA3;
                i5 = i43;
                i6 = 2;
                iA2 = 0;
            } else if (Intrinsics.f(m9Var, ip0.h9.f164521a)) {
                int i59 = R$attr.internal_textAppearanceEmphasis1;
                i21 = R$attr.internal_textAppearanceBody3;
                mx0.i1 i1Var2 = mx0.i1.SIZE_64_64;
                int iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 16.0f);
                int iA5 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 12.0f);
                i3 = iA4;
                i1Var = i1Var2;
                i5 = i59;
                iA2 = iA5;
                i6 = 2;
            } else if (Intrinsics.f(m9Var, ip0.j9.f164805a)) {
                int i66 = R$attr.internal_textAppearanceEmphasis1;
                i21 = R$attr.internal_textAppearanceBody3;
                mx0.i1 i1Var3 = mx0.i1.SIZE_64_64;
                int iA6 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 16.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                i1Var = i1Var3;
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
                i5 = i66;
                i3 = iA6;
                i6 = 1;
            } else {
                if (!Intrinsics.f(m9Var, ip0.k9.f164977a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i74 = R$attr.internal_textAppearanceHeading2;
                i2 = R$attr.internal_textAppearanceEmphasis2;
                i1Var = mx0.i1.SIZE_48_48;
                int iA7 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f);
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
                i3 = iA7;
                i5 = i74;
                i6 = 1;
                iA2 = 0;
                View viewFindViewById = avatarView.findViewById(R$id.uikit_imageWithAnimatedBackgroundView_image);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                z3 = z12;
                z4 = z29;
                i22 = 0;
                rd0.e.r((ImageView) viewFindViewById, new yp0.o(yp0.n.FACTOR_60, 0));
                avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
                avatarView.setModel(data.f51984b);
                or0.u.z(holder.f165474g, 0, iA, 0, 0, false, 29);
                jb3.l.e(textView2, i5);
                textView2.setMaxLines(i6);
                or0.u.z(holder.f165475h, 0, i3, 0, 0, false, 29);
                jb3.l.e(textView, i2);
                or0.u.z(holder.i, 0, iA2, 0, 0, false, 29);
            }
            i2 = i21;
            View viewFindViewById2 = avatarView.findViewById(R$id.uikit_imageWithAnimatedBackgroundView_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            z3 = z12;
            z4 = z29;
            i22 = 0;
            rd0.e.r((ImageView) viewFindViewById2, new yp0.o(yp0.n.FACTOR_60, 0));
            avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
            avatarView.setModel(data.f51984b);
            or0.u.z(holder.f165474g, 0, iA, 0, 0, false, 29);
            jb3.l.e(textView2, i5);
            textView2.setMaxLines(i6);
            or0.u.z(holder.f165475h, 0, i3, 0, 0, false, 29);
            jb3.l.e(textView, i2);
            or0.u.z(holder.i, 0, iA2, 0, 0, false, 29);
        } else {
            z = z11;
            z3 = z12;
            z4 = z29;
            i22 = 0;
        }
        if (z) {
            kli.a.b(textView2, data.f51985c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (z4) {
            newBadgeView.setVisibility(data.e != null ? i22 : 8);
            NewBadgeContent newBadgeContent = data.e;
            if (newBadgeContent != null) {
                newBadgeView.setContent(newBadgeContent);
            }
        }
        if (z41) {
            boolean z49 = data.f51986g;
            holder.itemView.setEnabled(z49);
            float f4 = z49 ? 1.0f : 0.4f;
            View view = holder.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int iD = i22; iD < childCount; iD = m72.b.d(viewGroup, iD, f4, iD, 1)) {
            }
        }
        if (z31) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.f, null, 24);
            data = data;
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        py0.c cVar = new py0.c(data.f51985c);
        boolean z54 = data.f;
        or0.m.a(itemView2);
        if (z54) {
            itemView2.setOnClickListener(new au0.i3(data, cVar, this, model, 17));
        } else {
            or0.u.o(itemView2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CenteredContentTileDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AvatarModel.Default f51984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51985c;
        public final Clause d;
        public final NewBadgeContent e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f51986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ip0.m9 f51987h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f51988j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f51989l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51990m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f51991n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51992p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51993q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f51994r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f51995s;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, Image image, Clause title, TextClause textClause, boolean z, Object obj2, int i, int i2, int i3, int i5, int i6) {
                TextClause textClause2 = (i6 & 8) != 0 ? null : textClause;
                Object obj3 = (i6 & 1024) != 0 ? null : obj2;
                int i21 = (i6 & 2048) != 0 ? R$attr.uikit_dp8 : i;
                int i22 = (i6 & 4096) != 0 ? R$attr.uikit_dp18 : i2;
                int i32 = (i6 & 8192) != 0 ? R$attr.uikit_dp8 : i3;
                int i33 = (i6 & 16384) != 0 ? R$attr.uikit_dp8 : i5;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                ip0.h9 style = ip0.h9.f164521a;
                Intrinsics.checkNotNullParameter(style, "style");
                Object obj4 = obj3;
                int i43 = i21;
                TextClause textClause3 = textClause2;
                AvatarModel.Default avatarModel = new AvatarModel.Default(image, null, null, null, null, null, 102);
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(style, "style");
                return new Model(listId, avatarModel, title, textClause3, null, z, true, style, obj4, null, new c.e((qv0.h) null, 3), i43, i22, i32, i33, 491520);
            }

            public static Model b(Companion companion, String listId, Image image, Clause title, Clause description, CircleBadgeModel circleBadgeModel, boolean z, ProgressStyle progressStyle, AnalyticsContext analyticsContext, Object obj2, int i) {
                CircleBadgeModel circleBadgeModel2 = (i & 16) != 0 ? null : circleBadgeModel;
                ProgressStyle progressStyle2 = (i & 256) != 0 ? null : progressStyle;
                AnalyticsContext analyticsContext2 = (i & 1024) != 0 ? null : analyticsContext;
                int i2 = R$attr.uikit_dp18;
                int i3 = R$attr.uikit_dp8;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                ip0.j9 style = ip0.j9.f164805a;
                Intrinsics.checkNotNullParameter(style, "style");
                AvatarModel.Default avatarModel = new AvatarModel.Default(image, null, null, progressStyle2, circleBadgeModel2 != null ? new AvatarModel.BadgeModel(circleBadgeModel2, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, 102);
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(style, "style");
                return new Model(listId, avatarModel, title, description, null, z, true, style, obj2, analyticsContext2, new c.e((qv0.h) null, 3), i2, i2, i3, i3, 491520);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause title, Image image2, boolean z, AnalyticsContext analyticsContext, Object obj2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            ip0.g9 style = ip0.g9.f164371a;
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, new AvatarModel.Default(image, null, null, null, image2 != null ? new AvatarModel.BadgeModel(new RawImageBadge(image2), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, 102), title, null, null, z, true, style, obj2, analyticsContext, new c.e((qv0.h) null, 3), 0, 0, 0, 0, 522240);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CenteredContentTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51903b() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52218a() {
            return this.f51983a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51983a, model.f51983a) && Intrinsics.f(this.f51984b, model.f51984b) && Intrinsics.f(this.f51985c, model.f51985c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f51986g == model.f51986g && Intrinsics.f(this.f51987h, model.f51987h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51988j, model.f51988j) && Intrinsics.f(this.k, model.k) && this.f51989l == model.f51989l && this.f51990m == model.f51990m && this.f51991n == model.f51991n && this.o == model.o && Intrinsics.f(this.f51992p, model.f51992p) && Intrinsics.f(this.f51993q, model.f51993q) && Intrinsics.f(this.f51994r, model.f51994r) && Intrinsics.f(this.f51995s, model.f51995s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51906h() {
            return this.f51989l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51989l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f51988j;
        }

        public final int hashCode() {
            int iA = p.a.a((this.f51984b.hashCode() + (this.f51983a.hashCode() * 31)) * 31, 31, this.f51985c);
            Clause clause = this.d;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            NewBadgeContent newBadgeContent = this.e;
            int iHashCode2 = (this.f51987h.hashCode() + j6.a.c(j6.a.c((iHashCode + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31, 31, this.f), 31, this.f51986g)) * 31;
            Object obj2 = this.i;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51988j;
            int iB = j6.a.b(this.o, j6.a.b(this.f51991n, j6.a.b(this.f51990m, j6.a.b(this.f51989l, h30.l.i(this.k, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f51992p;
            int iHashCode4 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51993q;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51994r;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51995s;
            return iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51909m() {
            return this.f51992p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51910n() {
            return this.f51993q;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51994r = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.f51990m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51990m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51908l() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51911p() {
            return this.f51995s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f51994r;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51992p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51988j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51907j() {
            return this.f51991n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51993q = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51995s = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new ip0.f9(!Intrinsics.f(model.f51984b, this.f51984b), !Intrinsics.f(model.f51985c, this.f51985c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f51987h, this.f51987h), model.f51986g != this.f51986g, or0.b.l(this, model));
            }
            return null;
        }

        public Model(String str, AvatarModel.Default r62, Clause clause, Clause clause2, NewBadgeContent newBadgeContent, boolean z, boolean z3, ip0.m9 m9Var, Object obj2, Parcelable parcelable, c.e eVar, int i, int i2, int i3, int i5, int i6) {
            int i21 = (i6 & 2048) != 0 ? R$attr.uikit_dp8 : i;
            int i22 = (i6 & 4096) != 0 ? R$attr.uikit_dp18 : i2;
            int i32 = (i6 & 8192) != 0 ? R$attr.uikit_dp8 : i3;
            int i33 = (i6 & 16384) != 0 ? R$attr.uikit_dp8 : i5;
            this.f51983a = str;
            this.f51984b = r62;
            this.f51985c = clause;
            this.d = clause2;
            this.e = newBadgeContent;
            this.f = z;
            this.f51986g = z3;
            this.f51987h = m9Var;
            this.i = obj2;
            this.f51988j = parcelable;
            this.k = eVar;
            this.f51989l = i21;
            this.f51990m = i22;
            this.f51991n = i32;
            this.o = i33;
            this.f51992p = null;
            this.f51993q = null;
            this.f51994r = null;
            this.f51995s = null;
        }
    }
}
