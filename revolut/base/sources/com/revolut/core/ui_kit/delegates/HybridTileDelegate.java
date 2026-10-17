package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.flexbox.FlexboxLayout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.bp;
import ip0.dk;
import ip0.to;
import ip0.vo;
import ip0.wk;
import ip0.wo;
import ip0.zo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0007\u0003\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HybridTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/HybridTileDelegate$Model;", "Lip0/zo;", "<init>", "()V", "Companion", "Model", "ip0/vo", "ip0/wo", "ip0/xo", "ip0/uo", "ip0/to", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HybridTileDelegate extends BaseRecyclerViewDelegate<Model, zo> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aw0.d0 f52465g = new aw0.d0(4, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aw0.d0 f52466h = new aw0.d0(1, 1);
    public static final aw0.d0 i = new aw0.d0(343, 150);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52467c;
    public final ihm.f d;
    public final ihm.f e;
    public to f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HybridTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/a7", "com/revolut/core/ui_kit/delegates/z6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f52469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52470c;
        public final Clause d;
        public final UrlImage e;
        public final wo f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a7 f52471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final x6 f52472h;
        public final z6 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ew0.c f52473j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52474l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f52475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52476n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52477p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52478q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52479r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f52480s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f52481t;
        public final int u;

        public Model(String listId, Clause title, TextClause subtitle, TextClause textClause, UrlImage backgroundImage, wo backgroundImageRatio, a7 a7Var, x6 x6Var, y6 y6Var, AnalyticsContext analyticsContext, Object obj2, int i) {
            textClause = (i & 8) != 0 ? null : textClause;
            backgroundImageRatio = (i & 32) != 0 ? wo.SQUARE : backgroundImageRatio;
            y6Var = (i & 256) != 0 ? null : y6Var;
            ew0.c backgroundType = (i & 1024) != 0 ? ew0.a.f129982a : ew0.b.f129983a;
            analyticsContext = (i & 2048) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(backgroundImageRatio, "backgroundImageRatio");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            int i2 = R$attr.uikit_dp0;
            this.f52468a = listId;
            this.f52469b = title;
            this.f52470c = subtitle;
            this.d = textClause;
            this.e = backgroundImage;
            this.f = backgroundImageRatio;
            this.f52471g = a7Var;
            this.f52472h = x6Var;
            this.i = y6Var;
            this.f52473j = backgroundType;
            this.k = obj2;
            this.f52474l = analyticsContext;
            this.f52475m = c.d.f249513a;
            this.f52476n = null;
            this.o = null;
            this.f52477p = null;
            this.f52478q = null;
            this.f52479r = i2;
            this.f52480s = i2;
            this.f52481t = i2;
            this.u = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new HybridTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55076n() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55265b() {
            return this.f52468a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52468a, model.f52468a) && Intrinsics.f(this.f52469b, model.f52469b) && Intrinsics.f(this.f52470c, model.f52470c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52471g, model.f52471g) && Intrinsics.f(this.f52472h, model.f52472h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52473j, model.f52473j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52474l, model.f52474l) && Intrinsics.f(this.f52475m, model.f52475m) && Intrinsics.f(this.f52476n, model.f52476n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52477p, model.f52477p) && Intrinsics.f(this.f52478q, model.f52478q) && this.f52479r == model.f52479r && this.f52480s == model.f52480s && this.f52481t == model.f52481t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52633g() {
            return this.f52479r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52479r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f52474l;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(p.a.b(this.f52468a.hashCode() * 31, 31, this.f52469b), 31, this.f52470c);
            Clause clause = this.d;
            int iHashCode = (this.f.hashCode() + ip0.v7.g(this.e, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31)) * 31;
            a7 a7Var = this.f52471g;
            int iHashCode2 = (iHashCode + (a7Var == null ? 0 : a7Var.hashCode())) * 31;
            x6 x6Var = this.f52472h;
            int iHashCode3 = (iHashCode2 + (x6Var == null ? 0 : x6Var.f55595a.hashCode())) * 31;
            z6 z6Var = this.i;
            int iHashCode4 = (this.f52473j.hashCode() + ((iHashCode3 + (z6Var == null ? 0 : z6Var.hashCode())) * 961)) * 31;
            Object obj2 = this.k;
            int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52474l;
            int i = h30.l.i(this.f52475m, (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52476n;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52477p;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52478q;
            return Integer.hashCode(this.u) + j6.a.b(this.f52481t, j6.a.b(this.f52480s, j6.a.b(this.f52479r, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52638n() {
            return this.f52476n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52475m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52477p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52634h() {
            return this.f52480s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52635j() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52480s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f52475m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52637m() {
            return this.f52478q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52636l() {
            return this.f52477p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52476n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52474l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.f52481t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52478q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new vo(!Intrinsics.f(r0.f52469b, this.f52469b), !Intrinsics.f(r0.f52470c, this.f52470c), !Intrinsics.f(r0.d, this.d), !Intrinsics.f(r0.f52472h, this.f52472h), !Intrinsics.f(r0.e, this.e), !Intrinsics.f(r0.f52471g, this.f52471g), ((Model) oldItem).f != this.f, !true, or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(r0.i, this.i));
        }
    }

    public HybridTileDelegate() {
        super(R$id.hybridTileDelegate_root, new dk(21));
        this.f52467c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        v0.a.d("create(...)");
        v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        to toVar = this.f;
        if (toVar == null) {
            toVar = new to(context);
            this.f = toVar;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.hybridTile_backgroundImage);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_END);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FadeBottomImageView image = new FadeBottomImageView(context, null, 6, 0);
        image.setId(R$id.hybridTile_foregroundImage);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        UIKitFrameLayout container = new UIKitFrameLayout(context, null, 6, 0);
        container.setId(R$id.hybridTile_foregroundImageContainer);
        container.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        container.addView(image);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(image, "image");
        AppCompatImageView iconImage = new AppCompatImageView(context);
        iconImage.setId(R$id.hybridTile_headerIconImage);
        int i2 = toVar.e;
        iconImage.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
        AppCompatTextView title = new AppCompatTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        title.setId(R$id.hybridTile_headerTitle);
        title.setMaxLines(1);
        title.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = toVar.f166549b;
        title.setPaddingRelative(i3, 0, 0, 0);
        title.setTextColor(ContextCompat.getColor(context, R$color.internal_white));
        title.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout wrapper = new LinearLayout(context);
        wrapper.setOrientation(0);
        wrapper.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        int i5 = toVar.d;
        layoutParams.setMarginStart(i5);
        layoutParams.topMargin = i5;
        wrapper.setLayoutParams(layoutParams);
        wrapper.addView(iconImage);
        wrapper.addView(title);
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(title, "title");
        AppCompatImageView favoriteIcon = new AppCompatImageView(context);
        favoriteIcon.setId(R$id.hybridTile_favoriteIcon);
        favoriteIcon.setColorFilter(ContextCompat.getColor(context, R$color.internal_white));
        favoriteIcon.setImageResource(R$drawable.uikit_icn_24_heart);
        favoriteIcon.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AppCompatImageView shareIcon = new AppCompatImageView(context);
        shareIcon.setId(R$id.hybridTile_shareIcon);
        shareIcon.setColorFilter(ContextCompat.getColor(context, R$color.internal_white));
        shareIcon.setImageResource(R$drawable.uikit_icn_24_share);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(i2);
        shareIcon.setLayoutParams(layoutParams2);
        LinearLayout wrapper2 = new LinearLayout(context);
        wrapper2.setOrientation(0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388661;
        layoutParams3.topMargin = i5;
        layoutParams3.setMarginEnd(i5);
        wrapper2.setLayoutParams(layoutParams3);
        wrapper2.addView(favoriteIcon);
        wrapper2.addView(shareIcon);
        Intrinsics.checkNotNullParameter(wrapper2, "wrapper");
        Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
        Intrinsics.checkNotNullParameter(shareIcon, "shareIcon");
        ArrayList arrayList = new ArrayList(3);
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(R$id.hybridTile_badgeContainer);
        flexboxLayout.setFlexDirection(0);
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setDividerDrawable(ContextCompat.getDrawable(context, com.revolut.core.ui_kit.R$drawable.internal_divider_feed_post_badges));
        flexboxLayout.setShowDivider(3);
        int i6 = toVar.f166550c;
        flexboxLayout.setPaddingRelative(i6, 0, i6, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int i21 = toVar.f166548a;
        layoutParams4.topMargin = i21;
        flexboxLayout.setLayoutParams(layoutParams4);
        int i22 = 0;
        while (i22 < 3) {
            AppCompatImageView appCompatImageView2 = iconImage;
            AttributeSet attributeSet = null;
            TagView tagView = new TagView(context, attributeSet, 6, 0);
            tagView.setVisibility(8);
            flexboxLayout.addView(tagView);
            arrayList.add(tagView);
            i22++;
            iconImage = appCompatImageView2;
        }
        AppCompatImageView appCompatImageView3 = iconImage;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceHeading3);
        uIKitTextView.setId(R$id.hybridTile_title);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uIKitTextView.setEllipsize(truncateAt);
        uIKitTextView.setPaddingRelative(i5, 0, i5, 0);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setTextColor(ContextCompat.getColor(context, R$color.internal_background));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = i3;
        uIKitTextView.setLayoutParams(layoutParams5);
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        uIKitTextView2.setId(R$id.hybridTile_subtitle);
        uIKitTextView2.setEllipsize(truncateAt);
        uIKitTextView2.setPaddingRelative(i5, 0, i5, 0);
        uIKitTextView2.setTextAlignment(5);
        uIKitTextView2.setTextColor(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorWhite, context)));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.bottomMargin = i5;
        uIKitTextView2.setLayoutParams(layoutParams6);
        UIKitTextView uIKitTextView3 = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        uIKitTextView3.setId(R$id.hybridTile_priceLine);
        uIKitTextView3.setEllipsize(truncateAt);
        uIKitTextView3.setPaddingRelative(i5, i3, i5, uIKitTextView3.getPaddingBottom());
        uIKitTextView3.setTextAlignment(5);
        uIKitTextView3.setTextColor(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorWhite, context)));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.bottomMargin = i5;
        uIKitTextView3.setLayoutParams(layoutParams7);
        UIKitTextView titleView = new UIKitTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        titleView.setId(R$id.hybridTile_footerTitle);
        titleView.setEllipsize(truncateAt);
        titleView.setMaxLines(1);
        titleView.setTextAlignment(5);
        titleView.setTextColor(ContextCompat.getColor(context, R$color.internal_white));
        titleView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        OverlappedIconsView overlappedIconsView = new OverlappedIconsView(context, null, 6, 0);
        overlappedIconsView.setId(R$id.hybridTile_footerIcons);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.setMarginStart(i21);
        overlappedIconsView.setLayoutParams(layoutParams8);
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        AppCompatImageView chevron = new AppCompatImageView(context);
        chevron.setId(R$id.hybridTile_footerChevron);
        chevron.setColorFilter(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorWhite, context)));
        chevron.setImageResource(R$drawable.uikit_icn_16_chevron_right);
        chevron.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout row = new LinearLayout(context);
        row.setId(R$id.hybridTile_footerForeground);
        row.setOrientation(0);
        row.setGravity(16);
        row.setClickable(true);
        row.setFocusable(true);
        int i32 = dr0.b.f117045a;
        Intrinsics.checkNotNullParameter(context, "context");
        row.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context)), null, dr0.b.e(context, c.b.f249511a)));
        row.setPaddingRelative(i5, i5, i5, i5);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.topMargin = i21;
        row.setLayoutParams(layoutParams9);
        row.addView(titleView);
        row.addView(overlappedIconsView);
        row.addView(space);
        row.addView(chevron);
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(overlappedIconsView, "overlappedIconsView");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        UIKitFrameLayout uIKitFrameLayout = new UIKitFrameLayout(context, null, 6, 0);
        uIKitFrameLayout.setId(R$id.hybridTile_bottomImageOverlay);
        uIKitFrameLayout.setForeground(ContextCompat.getDrawable(context, com.revolut.core.ui_kit.R$drawable.internal_gradient_bottom_to_top_dark));
        uIKitFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        View view = new View(context);
        view.setId(R$id.hybridTile_topImageOverlay);
        view.setBackground(ContextCompat.getDrawable(context, com.revolut.core.ui_kit.R$drawable.internal_gradient_top_to_bottom_dark));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, kli.a.k(context, 144.0f)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout2.addView(container);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams10.topMargin = -kli.a.k(context, 11.5f);
        linearLayout.setLayoutParams(layoutParams10);
        linearLayout.addView(flexboxLayout);
        linearLayout.addView(uIKitTextView);
        linearLayout.addView(uIKitTextView2);
        linearLayout.addView(uIKitTextView3);
        linearLayout.addView(row);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout2.addView(frameLayout2);
        linearLayout2.addView(linearLayout);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(uIKitFrameLayout);
        frameLayout.addView(linearLayout2);
        frameLayout.addView(view);
        frameLayout.addView(wrapper);
        frameLayout.addView(wrapper2);
        return new zo(frameLayout, frameLayout, appCompatImageView, container, image, uIKitFrameLayout, uIKitTextView, uIKitTextView2, appCompatImageView3, title, favoriteIcon, shareIcon, uIKitTextView3, flexboxLayout, arrayList, titleView, overlappedIconsView, chevron, row);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        zo zoVar = holder instanceof zo ? (zo) holder : null;
        if (zoVar != null) {
            zoVar.i.setImageDrawable(null);
            zoVar.f167511g.setImageDrawable(null);
            ArrayList arrayList = zoVar.f167520s;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                or0.u.o((TagView) arrayList.get(i2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [py0.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.revolut.core.ui_kit.delegates.x6] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(zo holder, Model model, int i2, List list) {
        char c2;
        HybridTileDelegate hybridTileDelegate;
        AppCompatImageView appCompatImageView;
        int i3;
        y6 y6Var;
        Model data = model;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i2, list);
        AppCompatImageView appCompatImageView2 = holder.v;
        UIKitTextView uIKitTextView = holder.f167521t;
        OverlappedIconsView overlappedIconsView = holder.u;
        AppCompatImageView appCompatImageView3 = holder.f167517p;
        AppCompatImageView appCompatImageView4 = holder.o;
        ArrayList arrayList = holder.f167520s;
        FlexboxLayout flexboxLayout = holder.f167519r;
        UIKitTextView uIKitTextView2 = holder.f167518q;
        LinearLayout linearLayout = holder.f167522w;
        UIKitTextView uIKitTextView3 = holder.f167514l;
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof vo)) {
                payloads = null;
                break;
            }
            i5++;
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
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        int i6 = 0;
        while (i6 < size2) {
            vo voVar = (vo) payloads.get(i6);
            List list2 = payloads;
            z = z || voVar.f166856a;
            z49 = z49 || voVar.f166857b;
            z3 = z3 || voVar.f166858c;
            z11 = z11 || voVar.d;
            z4 = z4 || voVar.e;
            z12 = z12 || voVar.f;
            z6 = z6 || voVar.f166859g;
            z31 = z31 || voVar.f166860h;
            z41 = z41 || voVar.i;
            z29 = z29 || voVar.f166861j;
            i6++;
            payloads = list2;
        }
        if (z) {
            kli.a.b(holder.k, data.f52469b, ty0.f.f275450a);
        }
        if (z49) {
            kli.a.b(uIKitTextView3, data.f52470c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(uIKitTextView2, data.d, ty0.f.f275450a);
        }
        if (z4 || z6) {
            xv0.m.e0(holder, data.e, holder.i, new wk(holder, data, 3), 12);
        }
        if (z11) {
            x6 x6Var = data.f52472h;
            if (x6Var == null) {
                x6Var = null;
            }
            List list3 = x6Var != null ? x6Var.f55595a : null;
            List list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                flexboxLayout.setVisibility(8);
            } else {
                flexboxLayout.setVisibility(0);
                int size3 = arrayList.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    TagView tagView = (TagView) arrayList.get(i21);
                    if (i21 < list3.size()) {
                        tagView.setContent((TagViewData) list3.get(i21));
                        tagView.setVisibility(0);
                    } else {
                        tagView.setVisibility(8);
                    }
                }
            }
        }
        if (z6) {
            holder.F(data.f);
        }
        if (z12) {
            AppCompatImageView appCompatImageView5 = holder.f167515m;
            a7 a7Var = data.f52471g;
            zi0.c.g(appCompatImageView5, a7Var != null ? a7Var.f53667a : null);
            AppCompatTextView appCompatTextView = holder.f167516n;
            a7 a7Var2 = data.f52471g;
            kli.a.b(appCompatTextView, a7Var2 != null ? a7Var2.f53668b : null, ty0.f.f275450a);
        }
        if (z31) {
            data.getClass();
            c2 = '\b';
            appCompatImageView4.setVisibility(8);
            appCompatImageView3.setVisibility(8);
        } else {
            c2 = '\b';
        }
        if (z41) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            appCompatImageView = appCompatImageView3;
            i3 = 0;
            or0.b.c(this, data, itemView, false, null, 28);
            hybridTileDelegate = this;
        } else {
            hybridTileDelegate = this;
            appCompatImageView = appCompatImageView3;
            i3 = 0;
        }
        if (z29) {
            z6 z6Var = data.i;
            if (z6Var instanceof y6) {
                overlappedIconsView.setVisibility(i3);
                appCompatImageView2.setVisibility(i3);
                linearLayout.setVisibility(i3);
                y6 y6Var2 = (y6) z6Var;
                kli.a.b(uIKitTextView, y6Var2.f55624b, ty0.f.f275450a);
                linearLayout.setContentDescription(or0.m.b(uIKitTextView));
                OverlappedIconsView.setIcons$default(holder.u, y6Var2.f55623a, mx0.bb.SMALL, mx0.cb.TOP_TO_BOTTOM, 0, false, 24, null);
                y6Var = null;
            } else {
                if (z6Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                overlappedIconsView.setVisibility(8);
                uIKitTextView.setVisibility(8);
                appCompatImageView2.setVisibility(8);
                linearLayout.setVisibility(8);
                or0.u.o(linearLayout);
                y6Var = null;
                linearLayout.setContentDescription(null);
            }
        } else {
            y6Var = null;
        }
        if (z3 || z29) {
            Context context = uIKitTextView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            to toVar = hybridTileDelegate.f;
            if (toVar == null) {
                toVar = new to(context);
                hybridTileDelegate.f = toVar;
            }
            int i22 = toVar.d;
            int i32 = data.i != null ? 1 : i3;
            int i33 = data.d != null ? 1 : i3;
            ViewGroup.LayoutParams layoutParams = uIKitTextView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = (i33 == 0 && i32 == 0) ? i22 : i3;
            uIKitTextView3.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = uIKitTextView2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            if (i32 != 0) {
                i22 = i3;
            }
            layoutParams4.bottomMargin = i22;
            uIKitTextView2.setLayoutParams(layoutParams4);
        }
        fp0.p pVar = holder.f167523x;
        py0.c cVar = new py0.c(data.f52469b);
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.i3(data, cVar, hybridTileDelegate, model, 27));
        z6 z6Var2 = data.i;
        boolean z54 = z6Var2 instanceof y6;
        y6 y6Var3 = z54 ? (y6) z6Var2 : y6Var;
        ?? cVar2 = y6Var3 != null ? new py0.c(y6Var3.f55624b) : y6Var;
        int i43 = z6Var2 != null ? 1 : i3;
        or0.m.a(linearLayout);
        if (i43 != 0) {
            linearLayout.setOnClickListener(new au0.i3(data, cVar2, this, model, 28));
        } else {
            or0.u.o(linearLayout);
        }
        y6 y6Var4 = z54 ? (y6) z6Var2 : y6Var;
        hx7.b.v(linearLayout, y6Var4 != null ? y6Var4.f55625c : y6Var);
        or0.m.a(appCompatImageView4);
        or0.u.o(appCompatImageView4);
        or0.m.a(appCompatImageView);
        or0.u.o(appCompatImageView);
        x6 x6Var2 = data.f52472h;
        ?? r4 = x6Var2;
        if (x6Var2 == null) {
            r4 = y6Var;
        }
        ?? r42 = r4 != 0 ? r4.f55595a : y6Var;
        if (r42 == 0) {
            r42 = zhm.f0.f322471a;
        }
        int size4 = arrayList.size();
        int i59 = i3;
        while (i59 < size4) {
            TagView tagView2 = (TagView) arrayList.get(i59);
            ?? r2 = i59 < r42.size() ? 1 : i3;
            or0.m.a(tagView2);
            if (r2 != 0) {
                tagView2.setOnClickListener(new bp(data, r2, this, r42, i59));
            } else {
                or0.u.o(tagView2);
            }
            i59++;
            data = model;
        }
    }
}
