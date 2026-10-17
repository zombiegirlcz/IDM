package yr0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import au0.p2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.popups.PopupMenuItemDelegate;
import com.revolut.core.ui_kit.internal.popups.PopupMenuSectionHeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FastOutSlowInInterpolator f316069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PopupMenuItemDelegate f316070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PopupMenuSectionHeaderDelegate f316071c;
    public final ArrayList d;
    public final RecyclerView.RecycledViewPool e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f316072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function1 f316073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f316069a = new FastOutSlowInInterpolator();
        this.f316070b = new PopupMenuItemDelegate(this);
        this.f316071c = new PopupMenuSectionHeaderDelegate();
        this.d = new ArrayList();
        this.e = new RecyclerView.RecycledViewPool();
    }

    public static final void a(final k kVar, View view, View view2, boolean z) {
        int i2;
        ViewPropertyAnimator duration = view.animate().translationX(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(300L);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = kVar.f316069a;
        duration.setInterpolator(fastOutSlowInInterpolator).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
        if (z) {
            viewPropertyAnimatorAnimate = viewPropertyAnimatorAnimate.alpha(0.2f);
        }
        float width = kVar.getWidth();
        if (z) {
            width = -(width * 0.25f);
        }
        viewPropertyAnimatorAnimate.translationX(width).setInterpolator(fastOutSlowInInterpolator).setDuration(300L).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final int height = view2.getHeight();
        final int width2 = view2.getWidth();
        final int height2 = view.getHeight();
        final int width3 = view.getWidth();
        View childAt = kVar.getChildAt(kVar.getChildCount() - 1);
        Drawable background = kVar.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        childAt.setBackgroundColor(colorDrawable != null ? colorDrawable.getColor() : 0);
        h hVar = kVar.f316072g;
        if (hVar != null) {
            o oVar = (o) hVar;
            k kVar2 = oVar.d;
            a aVar = oVar.e;
            if (aVar != null) {
                int height3 = aVar.getHeight();
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                i2 = height3 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            } else {
                i2 = 0;
            }
            oVar.f316081j = oVar.c(height2 + i2) - oVar.c(height + i2);
            oVar.f316082l = height2 > height;
            oVar.k = oVar.b(width3) - oVar.b(width2);
            oVar.f316083m = width3 > width2;
            View childAt2 = kVar2.getChildAt(0);
            View childAt3 = kVar2.getChildAt(1);
            if (childAt2 == null || childAt3 == null || childAt2.getHeight() == childAt3.getHeight()) {
                oVar.o = null;
                oVar.f316084n = null;
            } else if (childAt2.getHeight() > childAt3.getHeight()) {
                oVar.f316084n = childAt3;
                oVar.o = childAt2;
            } else {
                oVar.f316084n = childAt2;
                oVar.o = childAt3;
            }
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yr0.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = k.i;
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                int iC = rim.d.c(((width3 - r0) * fFloatValue) + width2);
                int iC2 = rim.d.c(((height2 - r1) * fFloatValue) + height);
                h hVar2 = kVar.f316072g;
                if (hVar2 != null) {
                    o oVar2 = (o) hVar2;
                    a aVar2 = oVar2.e;
                    k kVar3 = oVar2.d;
                    float f = oVar2.f316081j;
                    float f4 = f * fFloatValue;
                    float f5 = oVar2.f316082l ? f4 - f : f4;
                    float f6 = oVar2.f316083m ? (fFloatValue - 1.0f) * oVar2.k : fFloatValue * oVar2.k;
                    if (aVar2 != null) {
                        aVar2.setTranslationY(f5);
                    }
                    if (aVar2 != null) {
                        aVar2.setTranslationX(f6);
                    }
                    kVar3.setTranslationY(f5);
                    kVar3.setTranslationX(f6);
                    iv0.s sVar = oVar2.f316078c;
                    sVar.f168698c = iC2;
                    sVar.d = iC;
                    kVar3.invalidateOutline();
                    View view3 = oVar2.f316084n;
                    View view4 = oVar2.o;
                    if (view3 == null || view4 == null) {
                        return;
                    }
                    view3.setTranslationY(oVar2.f316082l ? -f4 : oVar2.f316081j - f4);
                    view4.setTranslationY(-f5);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new byl.i(kVar, 9, childAt, view2));
        valueAnimatorOfFloat.setInterpolator(fastOutSlowInInterpolator);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    public final void b(PopupMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f) {
            return;
        }
        if (!(item instanceof PopupMenuItem.Cell)) {
            if (!(item instanceof PopupMenuItem.NestedParent)) {
                throw new NoWhenBranchMatchedException();
            }
            PopupMenuItem.NestedParent nestedParent = (PopupMenuItem.NestedParent) item;
            c(nestedParent, nestedParent.e);
            return;
        }
        Function1 function1 = this.f316073h;
        if (function1 != null) {
            function1.invoke(item);
        }
        h hVar = this.f316072g;
        if (hVar != null) {
            ((o) hVar).dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v34, types: [com.revolut.core.ui_kit.models.popup.PopupMenuItem$NestedParent] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36, types: [com.revolut.core.ui_kit.models.popup.PopupMenuItem$Cell] */
    /* JADX WARN: Type inference failed for: r13v37, types: [com.revolut.core.ui_kit.models.popup.PopupMenuItem$Cell] */
    public final void c(PopupMenuItem.NestedParent nestedParent, List sections) {
        boolean z;
        ArrayList arrayList;
        qv0.o oVarE;
        boolean z3;
        ?? E;
        View view;
        if (this.f) {
            return;
        }
        j jVar = new j(this);
        Intrinsics.checkNotNullParameter(sections, "sections");
        c cVar = jVar.f316068c;
        boolean z4 = true;
        LinearLayout linearLayout = jVar.d;
        if (nestedParent != null) {
            if (cVar == null) {
                cVar = new c(linearLayout);
                jVar.f316068c = cVar;
                this.f316070b.p(cVar, nestedParent);
                fp0.p pVar = cVar.f316056m;
                fp0.p.b(pVar, true);
                View view2 = pVar.f137029a;
                or0.m.a(view2);
                view2.setOnClickListener(new p2(this, 17));
                zi0.c.g(cVar.f316052g, nestedParent.f58136c);
                int i2 = R$drawable.uikit_icn_24_chevron_down;
                ImageView imageView = cVar.f316055l;
                imageView.setImageResource(i2);
                imageView.setVisibility(0);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ShapeDrawable shapeDrawableD = dr0.l.d(kli.a.s(R$attr.uikit_colorForeground_20, context));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 1.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK2 = kli.a.k(context3, 16.0f);
                Drawable background = cVar.itemView.getBackground();
                if (background == null) {
                    background = new ColorDrawable(0);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{background, shapeDrawableD});
                layerDrawable.setLayerGravity(1, 80);
                layerDrawable.setLayerHeight(1, iK);
                layerDrawable.setLayerInset(1, iK2, 0, iK2, iK);
                layerDrawable.setPadding(cVar.itemView.getPaddingLeft(), cVar.itemView.getPaddingTop(), cVar.itemView.getPaddingRight(), cVar.itemView.getPaddingTop() + iK);
                cVar.itemView.setBackground(layerDrawable);
                linearLayout.addView(cVar.itemView, 0);
            }
            kli.a.b(cVar.f316053h, nestedParent.f58135b, ty0.f.f275450a);
            kli.a.b(cVar.i, nestedParent.d, ty0.f.f275450a);
            View itemView = cVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setVisibility(0);
        } else if (cVar != null && (view = cVar.itemView) != null) {
            view.setVisibility(8);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = sections.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = sections.get(i3);
            if (!((mw0.p) obj2).f209297a.isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList3.addAll(((mw0.p) arrayList2.get(i5)).f209297a);
        }
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 < size3) {
                PopupMenuItem popupMenuItem = (PopupMenuItem) arrayList3.get(i6);
                if (!(popupMenuItem instanceof PopupMenuItem.Cell)) {
                    popupMenuItem = null;
                }
                PopupMenuItem.Cell cell = (PopupMenuItem.Cell) popupMenuItem;
                if ((cell != null ? cell.f58125h : null) == mw0.g.Selected) {
                    arrayList = new ArrayList(arrayList3.size());
                    int size4 = arrayList3.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        PopupMenuItem popupMenuItem2 = (PopupMenuItem) arrayList3.get(i21);
                        if (popupMenuItem2 instanceof PopupMenuItem.Cell) {
                            E = (PopupMenuItem.Cell) popupMenuItem2;
                            mw0.g gVar = E.f58125h;
                            if ((gVar == null ? -1 : i.f316065a[gVar.ordinal()]) != 1) {
                                E = PopupMenuItem.Cell.e(E, mw0.g.Unselected);
                            }
                        } else {
                            if (!(popupMenuItem2 instanceof PopupMenuItem.NestedParent)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            E = PopupMenuItem.NestedParent.e((PopupMenuItem.NestedParent) popupMenuItem2, true);
                        }
                        arrayList.add(E);
                    }
                } else {
                    i6++;
                }
            } else {
                int size5 = arrayList3.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        z = false;
                        break;
                    }
                    PopupMenuItem popupMenuItem3 = (PopupMenuItem) arrayList3.get(i22);
                    if (!(popupMenuItem3 instanceof PopupMenuItem.Cell)) {
                        popupMenuItem3 = null;
                    }
                    PopupMenuItem.Cell cell2 = (PopupMenuItem.Cell) popupMenuItem3;
                    if ((cell2 != null ? cell2.f58125h : null) == mw0.g.Unselected) {
                        z = true;
                        break;
                    }
                    i22++;
                }
                if (z) {
                    arrayList = new ArrayList(arrayList3.size());
                    int size6 = arrayList3.size();
                    for (int i32 = 0; i32 < size6; i32++) {
                        PopupMenuItem popupMenuItem4 = (PopupMenuItem) arrayList3.get(i32);
                        if (popupMenuItem4 instanceof PopupMenuItem.Cell) {
                            oVarE = PopupMenuItem.Cell.e((PopupMenuItem.Cell) popupMenuItem4, null);
                        } else {
                            if (!(popupMenuItem4 instanceof PopupMenuItem.NestedParent)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oVarE = PopupMenuItem.NestedParent.e((PopupMenuItem.NestedParent) popupMenuItem4, false);
                        }
                        arrayList.add(oVarE);
                    }
                } else {
                    arrayList = arrayList3;
                }
            }
        }
        int size7 = arrayList3.size();
        int i33 = 0;
        while (true) {
            if (i33 >= size7) {
                z3 = false;
                break;
            }
            PopupMenuItem popupMenuItem5 = (PopupMenuItem) arrayList3.get(i33);
            if (!(popupMenuItem5 instanceof PopupMenuItem.Cell)) {
                popupMenuItem5 = null;
            }
            PopupMenuItem.Cell cell3 = (PopupMenuItem.Cell) popupMenuItem5;
            if ((cell3 != null ? cell3.f58125h : null) == mw0.g.Selected) {
                z3 = true;
                break;
            }
            i33++;
        }
        ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList3.size());
        ArrayList arrayList5 = new ArrayList();
        int size8 = arrayList2.size();
        int i43 = 0;
        int i59 = 0;
        while (i43 < size8) {
            mw0.p pVar2 = (mw0.p) arrayList2.get(i43);
            if (!arrayList4.isEmpty()) {
                arrayList5.add(Integer.valueOf(zhm.v.j(arrayList4)));
            }
            Clause clause = pVar2.f209298b;
            boolean z6 = z4;
            if (clause != null) {
                arrayList4.add(new d(clause, a0.d.n("popup_section_header_", i43), z3));
            }
            int size9 = pVar2.f209297a.size();
            int i66 = 0;
            while (i66 < size9) {
                arrayList4.add(arrayList.get(i59));
                i66++;
                i59++;
            }
            i43++;
            z4 = z6;
        }
        boolean z11 = z4;
        jVar.f316066a.c(arrayList4);
        RecyclerView recyclerView = jVar.f316067b;
        for (int itemDecorationCount = recyclerView.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            RecyclerView.ItemDecoration itemDecorationAt = recyclerView.getItemDecorationAt(itemDecorationCount);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            if (itemDecorationAt instanceof sq0.e) {
                recyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
        if (!arrayList5.isEmpty()) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            recyclerView.addItemDecoration(new sq0.e(context4, d0.c1(arrayList5)));
        }
        this.d.add(jVar);
        d(linearLayout, z11);
    }

    public final void d(LinearLayout linearLayout, boolean z) {
        View childAt = getChildAt(getChildCount() - 1);
        addView(linearLayout, z ? getChildCount() : 0);
        if (childAt != null) {
            this.f = true;
            float width = getWidth();
            if (!z) {
                width = -(width * 0.25f);
            }
            linearLayout.setTranslationX(width);
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new jt0.d(this, linearLayout, childAt, z));
            } else {
                a(this, linearLayout, childAt, z);
            }
        }
    }

    public final h getCallback() {
        return this.f316072g;
    }

    public final Function1<PopupMenuItem, Unit> getClickListener() {
        return this.f316073h;
    }

    public final int getStackSize() {
        return this.d.size();
    }

    public final void setCallback(h hVar) {
        this.f316072g = hVar;
    }

    public final void setClickListener(Function1<? super PopupMenuItem, Unit> function1) {
        this.f316073h = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
