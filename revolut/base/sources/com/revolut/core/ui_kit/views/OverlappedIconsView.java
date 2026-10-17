package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ix0.k0;
import ix0.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.ab;
import mx0.bb;
import mx0.cb;
import mx0.db;
import mx0.eb;
import mx0.fb;
import mx0.ya;
import mx0.za;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u000b\u000f !\"#$%&\u0016\u0018'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001d\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "", "setupCutoutStages", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lmx0/db;", "model", "setModel", "(Lmx0/db;)V", "", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icons", "Lmx0/bb;", "imageSize", "Lmx0/cb;", "listOrderType", "listEndMargin", "", "spaced", "setIcons", "(Ljava/util/List;Lmx0/bb;Lmx0/cb;IZ)V", "Companion", "IconDelegate", "mx0/ya", "mx0/za", "mx0/ab", "mx0/eb", "b", "c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverlappedIconsView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f58813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z4l.j f58814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f58815c;
    public db d;
    public boolean e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f58816g;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/OverlappedIconsView$IconDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lmx0/ya;", "Lmx0/ab;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class IconDelegate extends BaseRecyclerViewDelegate<ya, ab> {
        public IconDelegate() {
            super(R$id.simpleImage_image, new mv5.h(10));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CutoutImageView cutoutImageView = new CutoutImageView(context, null, 6, 0);
            cutoutImageView.setId(R$id.simpleImage_image);
            cutoutImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            cutoutImageView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            return new ab(cutoutImageView);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(ab holder, ya data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            CutoutImageView cutoutImageView = holder.f;
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof za)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            if (payloads == null) {
                payloads = f0.f322471a;
            }
            boolean zIsEmpty = payloads.isEmpty();
            int size2 = payloads.size();
            boolean z = zIsEmpty;
            for (int i3 = 0; i3 < size2; i3++) {
                za zaVar = (za) payloads.get(i3);
                zIsEmpty = zIsEmpty || zaVar.f210146a;
                z = z || zaVar.f210147b;
            }
            if (zIsEmpty) {
                cutoutImageView.getCutoutReceiverController().g(null);
                View view = holder.itemView;
                yy0.f.e(h30.l.z(view, "itemView", view), data.f210129b, holder.f, null, null, 12);
            }
            if (z) {
                Context context = OverlappedIconsView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, data.f210130c.b());
                ViewGroup.LayoutParams layoutParams = cutoutImageView.getLayoutParams();
                if (layoutParams.width == iK && layoutParams.height == iK) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = cutoutImageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = iK;
                layoutParams2.height = iK;
                cutoutImageView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.OverlappedIconsView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public cb f58819b = cb.BOTTOM_TO_TOP;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f58820c;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void getItemOffsets(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.State r7) {
            /*
                r3 = this;
                java.lang.String r0 = "outRect"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                mx0.cb r7 = r3.f58819b
                int[] r0 = com.revolut.core.ui_kit.views.p.f59583a
                int r7 = r7.ordinal()
                r7 = r0[r7]
                r0 = 0
                r1 = 1
                if (r7 == r1) goto L31
                r2 = 2
                if (r7 != r2) goto L33
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.getAdapter()
                if (r7 == 0) goto L31
                int r7 = r7.getItemCount()
                int r7 = r7 - r1
                goto L39
            L31:
                r7 = r0
                goto L39
            L33:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            L39:
                int r5 = r6.getChildAdapterPosition(r5)
                r2 = -1
                if (r5 != r2) goto L41
                return
            L41:
                int r6 = r6.getLayoutDirection()
                if (r6 != r1) goto L48
                goto L49
            L48:
                r1 = r0
            L49:
                if (r5 == r7) goto L55
                boolean r5 = r3.f58820c
                if (r5 == 0) goto L52
                int r0 = r3.f58818a
                goto L55
            L52:
                int r5 = r3.f58818a
                int r0 = -r5
            L55:
                if (r1 == 0) goto L5a
                r4.right = r0
                return
            L5a:
                r4.left = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.OverlappedIconsView.b.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
        }
    }

    public static final class c extends UIKitRecyclerView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Context context) {
            super(context, null, 6, 0);
            Intrinsics.checkNotNullParameter(context, "context");
            setChildrenDrawingOrderEnabled(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final int getChildDrawingOrder(int i, int i2) {
            return (i - 1) - i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlappedIconsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setIcons$default(OverlappedIconsView overlappedIconsView, List list, bb bbVar, cb cbVar, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            bbVar = bb.REGULAR;
        }
        bb bbVar2 = bbVar;
        if ((i2 & 4) != 0) {
            cbVar = cb.BOTTOM_TO_TOP;
        }
        cb cbVar2 = cbVar;
        if ((i2 & 8) != 0) {
            i = 8;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = false;
        }
        overlappedIconsView.setIcons(list, bbVar2, cbVar2, i3, z);
    }

    private final void setupCutoutStages(RecyclerView rv4) {
        for (l0 l0Var : (Iterable) this.f) {
            f0 cutoutReceivers = f0.f322471a;
            ViewGroup viewGroup = l0Var.f169257a;
            Intrinsics.checkNotNullParameter(cutoutReceivers, "cutoutReceivers");
            if (!Intrinsics.f(cutoutReceivers, l0Var.f169258b)) {
                l0Var.f169258b = cutoutReceivers;
                viewGroup.invalidate();
                if (!l0Var.d && !l0Var.f169258b.isEmpty()) {
                    l0Var.d = true;
                    viewGroup.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(l0Var, 13));
                }
            }
        }
        this.f = f0.f322471a;
        int size = this.d.f209657a.size();
        if (size < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = size - 1;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            l0 l0Var2 = new l0(rv4, zhm.u.c(new k0(new et0.k(rv4, i3, 3))));
            l0Var2.a(new eb(rv4, i2, this.f58816g));
            arrayList.add(l0Var2);
            i2 = i3;
        }
        this.f = arrayList;
    }

    public final void setIcons(@NotNull List<? extends Image> icons, @NotNull bb imageSize, @NotNull cb listOrderType, int listEndMargin, boolean spaced) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(listOrderType, "listOrderType");
        setModel(new db(icons, imageSize, listOrderType, listEndMargin, spaced));
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    public final void setModel(@NotNull db model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.d, model)) {
            return;
        }
        this.d = model;
        List list = model.f209657a;
        bb bbVar = model.f209658b;
        cb cbVar = model.f209659c;
        boolean z3 = model.e;
        if (list.isEmpty()) {
            z4l.j jVar = this.f58814b;
            if (jVar != null) {
                jVar.c(f0.f322471a);
            }
            setVisibility(8);
            return;
        }
        c cVar = this.f58813a;
        boolean z4 = false;
        if (cVar == null) {
            this.f58814b = new z4l.j(7, zhm.u.c(new IconDelegate()), z4);
            this.f58815c = new b();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cVar = new c(context);
            cVar.setId(R$id.overlappedIcons_icons);
            cVar.setOverScrollMode(2);
            z4l.j jVar2 = this.f58814b;
            if (jVar2 == null) {
                Intrinsics.r("rvAdapter");
                throw null;
            }
            cVar.setAdapter(jVar2);
            cVar.setLayoutManager(new LinearLayoutManager(cVar.getContext(), 0, this.e));
            cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            b bVar = this.f58815c;
            if (bVar == null) {
                Intrinsics.r("decoration");
                throw null;
            }
            cVar.addItemDecoration(bVar);
            cVar.setConsumeTouchEvents(false);
            addView(cVar);
            this.f58813a = cVar;
        }
        RecyclerView recyclerView = cVar;
        int i = fb.f209704a[cbVar.ordinal()];
        if (i == 1) {
            z = false;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        if (this.e != z) {
            this.e = z;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.setReverseLayout(z);
            }
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        or0.u.z(recyclerView, 0, 0, kli.a.k(context2, model.d), 0, false, 27);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK = kli.a.k(context3, bbVar.a());
        b bVar2 = this.f58815c;
        if (bVar2 == null) {
            Intrinsics.r("decoration");
            throw null;
        }
        if (bVar2.f58818a != iK || bVar2.f58819b != cbVar || bVar2.f58820c != z3) {
            bVar2.f58818a = iK;
            Intrinsics.checkNotNullParameter(cbVar, "<set-?>");
            bVar2.f58819b = cbVar;
            b bVar3 = this.f58815c;
            if (bVar3 == null) {
                Intrinsics.r("decoration");
                throw null;
            }
            bVar3.f58820c = z3;
            recyclerView.invalidateItemDecorations();
        }
        z4l.j jVar3 = this.f58814b;
        if (jVar3 == null) {
            Intrinsics.r("rvAdapter");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(new ya(a0.d.n("icon_", i2), (Image) obj2, bbVar));
            i2 = i3;
        }
        jVar3.c(arrayList);
        if (!z3 && this.f.size() != list.size() - 1) {
            setupCutoutStages(recyclerView);
        } else if (z3 && !((Collection) this.f).isEmpty()) {
            for (l0 l0Var : (Iterable) this.f) {
                f0 cutoutReceivers = f0.f322471a;
                ViewGroup viewGroup = l0Var.f169257a;
                Intrinsics.checkNotNullParameter(cutoutReceivers, "cutoutReceivers");
                if (!Intrinsics.f(cutoutReceivers, l0Var.f169258b)) {
                    l0Var.f169258b = cutoutReceivers;
                    viewGroup.invalidate();
                    if (!l0Var.d && !l0Var.f169258b.isEmpty()) {
                        l0Var.d = true;
                        viewGroup.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(l0Var, 13));
                    }
                }
            }
            this.f = f0.f322471a;
        }
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlappedIconsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappedIconsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        f0 f0Var = f0.f322471a;
        this.d = new db((List) f0Var, (bb) null, 0, false, 30);
        this.e = true;
        this.f = f0Var;
        this.f58816g = kli.a.l(context, 2.0f);
    }

    public /* synthetic */ OverlappedIconsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
