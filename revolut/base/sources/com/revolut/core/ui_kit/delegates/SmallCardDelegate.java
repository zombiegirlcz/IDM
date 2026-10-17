package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.stories.StoriesHorizontalStepsProgressView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.je0;
import ip0.kf0;
import ip0.lf0;
import ip0.mf0;
import ip0.ws;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\u0003\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmallCardDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/pg;", "Companion", "Model", "b", "ip0/kf0", "d", "e", "c", "ip0/lf0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallCardDelegate extends BaseRecyclerViewDelegate<Model, pg> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final aw0.d0 f53351j = new aw0.d0(167, 180);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d0 f53352c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f53354h;
    public final Object i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmallCardDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public final int hashCode() {
                return 0;
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmallCardDelegate$b$b, reason: collision with other inner class name */
        public static final class C0425b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f53372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f53373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final kf0 f53374c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0425b() {
                this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0425b)) {
                    return false;
                }
                C0425b c0425b = (C0425b) obj2;
                return Intrinsics.f(this.f53372a, c0425b.f53372a) && Intrinsics.f(this.f53373b, c0425b.f53373b) && this.f53374c == c0425b.f53374c;
            }

            public final int hashCode() {
                Clause clause = this.f53372a;
                int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
                Image image = this.f53373b;
                return this.f53374c.hashCode() + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31);
            }

            public C0425b(Clause clause, Image image, kf0 descriptionType) {
                Intrinsics.checkNotNullParameter(descriptionType, "descriptionType");
                this.f53372a = clause;
                this.f53373b = image;
                this.f53374c = descriptionType;
            }

            public /* synthetic */ C0425b(Clause clause, ResourceImage resourceImage, kf0 kf0Var, int i) {
                this((i & 1) != 0 ? null : clause, (i & 2) != 0 ? null : resourceImage, (i & 4) != 0 ? kf0.REGULAR : kf0Var);
            }
        }

        private b() {
        }
    }

    public static abstract class c {

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f53376a = new b();

            private b() {
            }
        }

        private c() {
        }

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f53375a;

            public a(boolean z) {
                this.f53375a = z;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f53375a == ((a) obj2).f53375a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f53375a);
            }

            public a() {
                this(false);
            }
        }
    }

    public static abstract class d {
        private d() {
        }
    }

    public static abstract class e {

        public static final class a extends e {
            private a() {
            }
        }

        private e() {
        }
    }

    public SmallCardDelegate() {
        this(null);
    }

    public static void r(pg pgVar, aw0.v1 v1Var, Media media) {
        int i;
        Context context = pgVar.itemView.getContext();
        if (media == null || v1Var == null) {
            i = R$attr.uikit_colorForeground;
        } else {
            int i2 = mf0.f165371a[v1Var.ordinal()];
            if (i2 == 1) {
                i = R$attr.uikit_colorBlack;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorWhite;
            }
        }
        TextView textView = pgVar.f54596g;
        Intrinsics.h(context);
        textView.setTextColor(kli.a.s(i, context));
        pgVar.f54597h.setTextColor(kli.a.s(i, context));
    }

    public static void s(pg pgVar, Model model) {
        d dVar = model.f53360j;
        if (dVar instanceof og) {
            View view = pgVar.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), ((og) model.f53360j).f54561a, pgVar.f, null, null, 12);
            pgVar.f.setVisibility(0);
            pgVar.f54606t.setVisibility(8);
            pgVar.u.setVisibility(8);
            return;
        }
        if (dVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        pgVar.u.setVisibility(8);
        pgVar.f54606t.setVisibility(8);
        pgVar.f.setVisibility(8);
    }

    public static void u(pg pgVar, boolean z) {
        View view = pgVar.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Integer[] elements = {Integer.valueOf(R$id.smallCard_topLeftTag), Integer.valueOf(R$id.smallCard_topLeftBadge), Integer.valueOf(R$id.foregroundRipple)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            childAt.setAlpha((!z || kotlin.collections.d.y0(elements).contains(Integer.valueOf(childAt.getId()))) ? 1.0f : 0.5f);
        }
    }

    public static void v(pg pgVar, aw0.v1 v1Var) {
        int i;
        View view = pgVar.f54599l;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Context context = pgVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = v1Var == null ? -1 : mf0.f165371a[v1Var.ordinal()];
        if (i2 == -1) {
            i = R$attr.uikit_colorBackground;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlack;
        }
        view.setBackground(new GradientDrawable(orientation, new int[]{0, io0.a.d(0.3f, kli.a.s(i, context))}));
    }

    public static void w(pg pgVar, aw0.v1 v1Var) {
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = pgVar.f54600m;
        Context context = storiesHorizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = v1Var == null ? -1 : mf0.f165371a[v1Var.ordinal()];
        int iS = kli.a.s((i == 1 || i == 2) ? R$attr.uikit_colorWhite : R$attr.uikit_colorForeground, context);
        storiesHorizontalStepsProgressView.setBaseColor(io0.a.d(0.2f, iS));
        storiesHorizontalStepsProgressView.setProgressColor(iS);
    }

    public static void y(ImageView imageView, float f) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, f);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 48.0f);
        Object parent = imageView.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer numValueOf = Integer.valueOf(marginLayoutParams.topMargin);
        Integer numValueOf2 = Integer.valueOf(marginLayoutParams.rightMargin);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int iAbs = Math.abs(iK2 - imageView.getWidth()) / 2;
        if (imageView.getLayoutParams().width != iK || imageView.getLayoutParams().height != iK) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = iK;
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = iK;
            imageView.setLayoutParams(layoutParams3);
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ip0.jh(imageView, iIntValue2, iAbs, iIntValue, view, 1));
            return;
        }
        Rect rect = new Rect();
        imageView.getHitRect(rect);
        int i = rect.right;
        rect.right = Math.min(iIntValue2, iAbs) + i + i;
        rect.top -= Math.min(iIntValue, iAbs);
        rect.left -= iAbs;
        rect.bottom += iAbs;
        TouchDelegate touchDelegate = new TouchDelegate(rect, imageView);
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        xv0.c cVar = touchDelegate2 instanceof xv0.c ? (xv0.c) touchDelegate2 : null;
        if (cVar != null) {
            cVar.a("closeButtonHitZone", touchDelegate);
            return;
        }
        xv0.c cVar2 = new xv0.c(imageView);
        cVar2.a("closeButtonHitZone", touchDelegate);
        view.setTouchDelegate(cVar2);
    }

    public static void z(pg pgVar) {
        pgVar.f54602p.setVisibility(8);
        ty0.c.b(or0.u.k(pgVar.f54602p).b0(), null, pgVar.f54602p, null, null, 12);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pg(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.pg r40, com.revolut.core.ui_kit.delegates.SmallCardDelegate.Model r41, int r42, java.util.List r43) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SmallCardDelegate.p(com.revolut.core.ui_kit.delegates.pg, com.revolut.core.ui_kit.delegates.SmallCardDelegate$Model, int, java.util.List):void");
    }

    public final void q(pg pgVar, Model model) {
        int i;
        int i2 = 8;
        pgVar.f54601n.setVisibility(8);
        TextView textView = pgVar.f54597h;
        textView.setVisibility(8);
        View view = pgVar.i;
        view.setVisibility(8);
        ImageView imageView = pgVar.f54598j;
        imageView.setVisibility(8);
        pgVar.f54605s.setVisibility(8);
        b bVar = model.d;
        if (bVar instanceof b.a) {
            pgVar.f54601n.setVisibility(8);
            return;
        }
        if (!(bVar instanceof b.C0425b)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        view.setVisibility(((b.C0425b) bVar).f53372a != null ? 0 : 8);
        b.C0425b c0425b = (b.C0425b) bVar;
        or0.b.e(this, c0425b.f53372a, textView, null, 12);
        Image image = c0425b.f53373b;
        if (image != null) {
            View view2 = pgVar.itemView;
            yy0.f.e(h30.l.z(view2, "itemView", view2), image, pgVar.f54598j, null, null, 12);
            i2 = 0;
        }
        imageView.setVisibility(i2);
        int i3 = mf0.f165372b[c0425b.f53374c.ordinal()];
        if (i3 == 1) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceBody3;
        }
        jb3.l.e(textView, i);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void t(pg pgVar, Model model) {
        int i;
        c cVar = model.f53363n;
        if (!(cVar instanceof c.a)) {
            if (!Intrinsics.f(cVar, c.b.f53376a)) {
                throw new NoWhenBranchMatchedException();
            }
            zi0.c.g(pgVar.o, (LayeredImage) this.i.getValue());
            y(pgVar.o, 40.0f);
            x(true, pgVar, model, false);
            z(pgVar);
            return;
        }
        e eVar = model.i;
        if (!(eVar instanceof e.a)) {
            if (eVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            x(false, pgVar, model, false);
            z(pgVar);
            return;
        }
        ImageView imageView = pgVar.o;
        int i2 = R$drawable.uikit_icn_16_cross_small;
        aw0.v1 v1Var = model.f53361l;
        if (v1Var != null) {
            int i3 = mf0.f165371a[v1Var.ordinal()];
            if (i3 == 1) {
                i = R$attr.uikit_colorBlack;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorWhite;
            }
        } else {
            i = R$attr.uikit_colorForeground;
        }
        zi0.c.g(imageView, new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246));
        y(pgVar.o, 16.0f);
        x(true, pgVar, model, true);
        z(pgVar);
    }

    public final void x(boolean z, pg pgVar, Model model, boolean z3) {
        ImageView imageView = pgVar.o;
        int i = 0;
        if (!z) {
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setClickable(false);
            i = 8;
        } else if (z3) {
            imageView.setOnClickListener(new ws(this, model, 22));
            imageView.setOnTouchListener(new j01.e(new View[]{imageView}));
        } else {
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setClickable(false);
        }
        imageView.setVisibility(i);
    }

    public SmallCardDelegate(aw0.d0 d0Var) {
        super(R$layout.internal_delegate_small_card, new je0(7));
        this.f53352c = d0Var;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f53353g = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        this.f53354h = new LinkedHashSet();
        this.i = te0.w.y0(new e70(10));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallCardDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53357c;
        public final b d;
        public final boolean e;
        public final Media f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ProgressStyle f53359h;
        public final e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f53360j;
        public final Float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final aw0.v1 f53361l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f53362m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final c f53363n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f53364p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f53365q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public qv0.c f53366r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53367s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53368t;
        public p31.c u;
        public p31.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f53369w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f53370x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f53371y;
        public final int z;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmallCardDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, TextClause titleClause, b.C0425b description, UrlImage urlImage, og ogVar, Float f, Object obj2, int i) {
                og ogVar2 = (i & 16) != 0 ? null : ogVar;
                Float f4 = (i & 32) != 0 ? null : f;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(titleClause, "titleClause");
                Intrinsics.checkNotNullParameter(description, "description");
                return new Model(listId, null, titleClause, description, urlImage, false, ogVar2, f4, null, null, obj2, 0, 0, 0, 0, 67072466);
            }
        }

        public Model(String str, Image image, Clause clause, b bVar, boolean z, Media media, boolean z3, ProgressStyle progressStyle, e eVar, d dVar, Float f, aw0.v1 v1Var, boolean z4, c cVar, boolean z6, Object obj2, Parcelable parcelable, qv0.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, p31.c cVar6, int i, int i2, int i3, int i5) {
            this.f53355a = str;
            this.f53356b = image;
            this.f53357c = clause;
            this.d = bVar;
            this.e = z;
            this.f = media;
            this.f53358g = z3;
            this.f53359h = progressStyle;
            this.i = eVar;
            this.f53360j = dVar;
            this.k = f;
            this.f53361l = v1Var;
            this.f53362m = z4;
            this.f53363n = cVar;
            this.o = z6;
            this.f53364p = obj2;
            this.f53365q = parcelable;
            this.f53366r = cVar2;
            this.f53367s = cVar3;
            this.f53368t = cVar4;
            this.u = cVar5;
            this.v = cVar6;
            this.f53369w = i;
            this.f53370x = i2;
            this.f53371y = i3;
            this.z = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmallCardDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52872l() {
            return this.f53364p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52866a() {
            return this.f53355a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53355a, model.f53355a) && Intrinsics.f(this.f53356b, model.f53356b) && Intrinsics.f(this.f53357c, model.f53357c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && this.f53358g == model.f53358g && Intrinsics.f(this.f53359h, model.f53359h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53360j, model.f53360j) && Intrinsics.f(this.k, model.k) && this.f53361l == model.f53361l && this.f53362m == model.f53362m && Intrinsics.f(this.f53363n, model.f53363n) && this.o == model.o && Intrinsics.f(this.f53364p, model.f53364p) && Intrinsics.f(this.f53365q, model.f53365q) && Intrinsics.f(this.f53366r, model.f53366r) && Intrinsics.f(this.f53367s, model.f53367s) && Intrinsics.f(this.f53368t, model.f53368t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && this.f53369w == model.f53369w && this.f53370x == model.f53370x && this.f53371y == model.f53371y && this.z == model.z;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52878s() {
            return this.f53369w;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53369w = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52873m() {
            return this.f53365q;
        }

        public final int hashCode() {
            int iHashCode = this.f53355a.hashCode() * 31;
            Image image = this.f53356b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.f53357c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            b bVar = this.d;
            int iC = j6.a.c((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e);
            Media media = this.f;
            int iC2 = j6.a.c((iC + (media == null ? 0 : media.hashCode())) * 31, 31, this.f53358g);
            ProgressStyle progressStyle = this.f53359h;
            int iHashCode4 = (iC2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
            e eVar = this.i;
            int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            d dVar = this.f53360j;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Float f = this.k;
            int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            aw0.v1 v1Var = this.f53361l;
            int iC3 = j6.a.c((this.f53363n.hashCode() + j6.a.c((iHashCode7 + (v1Var == null ? 0 : v1Var.hashCode())) * 31, 31, this.f53362m)) * 31, 31, this.o);
            Object obj2 = this.f53364p;
            int iHashCode8 = (iC3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53365q;
            int i = h30.l.i(this.f53366r, (iHashCode8 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53367s;
            int iHashCode9 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53368t;
            int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.u;
            int iHashCode11 = (iHashCode10 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.v;
            return Integer.hashCode(this.z) + j6.a.b(this.f53371y, j6.a.b(this.f53370x, j6.a.b(this.f53369w, (iHashCode11 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.f53367s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53366r = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52875p() {
            return this.f53368t;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.u = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52879t() {
            return this.f53370x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getV() {
            return this.z;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53370x = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52874n() {
            return this.f53366r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52877r() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52876q() {
            return this.u;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53367s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53365q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getU() {
            return this.f53371y;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53368t = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.v = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !Intrinsics.f(model.f53356b, this.f53356b);
            boolean z4 = !Intrinsics.f(model.f53357c, this.f53357c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = !Intrinsics.f(model.f, this.f);
            boolean z12 = false;
            if (model.f53358g != this.f53358g) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            return new lf0(z3, z4, z6, z11, z12, !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f53366r, this.f53366r), !Intrinsics.f(model.f53359h, this.f53359h), !Intrinsics.e(model.k, this.k), !Intrinsics.f(model.f53360j, this.f53360j), model.f53361l != this.f53361l ? true : z, model.f53362m != this.f53362m, !Intrinsics.f(model.f53363n, this.f53363n));
        }

        public /* synthetic */ Model(String str, Image image, Clause clause, b bVar, Media media, boolean z, d dVar, Float f, aw0.v1 v1Var, c cVar, Object obj2, int i, int i2, int i3, int i5, int i6) {
            this(str, (i6 & 2) != 0 ? null : image, clause, bVar, true, media, (i6 & 64) != 0 ? true : z, null, null, dVar, f, v1Var, false, (i6 & 8192) != 0 ? new c.a(false) : cVar, false, obj2, null, c.d.f249513a, null, null, null, null, (4194304 & i6) != 0 ? R$attr.uikit_dp0 : i, (8388608 & i6) != 0 ? R$attr.uikit_dp0 : i2, (16777216 & i6) != 0 ? R$attr.uikit_dp0 : i3, (i6 & 33554432) != 0 ? R$attr.uikit_dp0 : i5);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, UrlImage urlImage, Clause clause, b.C0425b c0425b, Media media, og ogVar, Float f, Object obj2, c cVar, int i) {
            og ogVar2;
            UrlImage urlImage2 = (i & 2) != 0 ? null : urlImage;
            Clause clause2 = (i & 4) != 0 ? null : clause;
            b.C0425b c0425b2 = (i & 8) != 0 ? null : c0425b;
            boolean z = (i & 64) != 0;
            if ((i & 512) != 0) {
                ogVar2 = urlImage2 != null ? new og(urlImage2) : null;
            } else {
                ogVar2 = ogVar;
            }
            Float f4 = (i & 1024) != 0 ? null : f;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            aw0.v1 colorScheme = aw0.v1.DARK;
            c state = (i & 524288) != 0 ? new c.a(false) : cVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, urlImage2, clause2, c0425b2, media, z, ogVar2, f4, colorScheme, state, obj3, i2, i2, i2, i2, 3948544);
        }
    }
}
