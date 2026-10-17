package com.revolut.uicomponent.swipe_layout;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import av8.n;
import azl.e;
import azl.f;
import azl.h;
import azl.i;
import azl.k;
import azl.l;
import azl.m;
import azl.p;
import azl.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0005\rO<PQB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R*\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R<\u00100\u001a\u001c\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010'j\u0004\u0018\u0001`)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R<\u00104\u001a\u001c\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010'j\u0004\u0018\u0001`)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010;\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010A\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020<8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bB\u0010\u0017R$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u00108R\u0014\u0010N\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u00108¨\u0006R"}, d2 = {"Lcom/revolut/uicomponent/swipe_layout/SwipeToActionLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "swipeActions", "Lazl/l;", "dragDirection", "", "isFullSwipeActionAllowed", "", "setItems", "(Ljava/util/List;Lazl/l;Z)V", "a", "Z", "isDragLocked", "()Z", "setDragLocked", "(Z)V", "b", "getUserInteractionDisabled", "setUserInteractionDisabled", "userInteractionDisabled", "", "value", "c", "F", "getThresholdToOpenView", "()F", "setThresholdToOpenView", "(F)V", "thresholdToOpenView", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/revolut/uicomponent/swipe_layout/OnActionClickListener;", "d", "Lkotlin/jvm/functions/Function2;", "getOnActionClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnActionClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onActionClickListener", "e", "getOnLongActionClickListener", "setOnLongActionClickListener", "onLongActionClickListener", "q", "I", "getMaxActionsWidth$core_ui_release", "()I", "setMaxActionsWidth$core_ui_release", "(I)V", "maxActionsWidth", "Lazl/m;", "t", "Lazl/m;", "setState", "(Lazl/m;)V", "state", "getClickAvailable", "clickAvailable", "Lazl/f;", "onSwipeListener", "Lazl/f;", "getOnSwipeListener", "()Lazl/f;", "setOnSwipeListener", "(Lazl/f;)V", "getOverscrollThreshold", "overscrollThreshold", "getDistToClosestEdge", "distToClosestEdge", "azl/k", "azl/n", "azl/p", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class SwipeToActionLayout extends ViewGroup {
    public static final /* synthetic */ int z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isDragLocked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean userInteractionDisabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float thresholdToOpenView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function2 onActionClickListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Function2 onLongActionClickListener;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f107261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f107262h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f107263j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f107264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f107265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f107266n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f107267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int maxActionsWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f107270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public m state;
    public k u;
    public float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f107272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewDragHelper f107273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final GestureDetectorCompat f107274y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeToActionLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean e(MotionEvent motionEvent, View view) {
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return ((((float) view.getTop()) > y2 ? 1 : (((float) view.getTop()) == y2 ? 0 : -1)) <= 0 && (y2 > ((float) view.getBottom()) ? 1 : (y2 == ((float) view.getBottom()) ? 0 : -1)) <= 0) && ((((float) view.getLeft()) > x3 ? 1 : (((float) view.getLeft()) == x3 ? 0 : -1)) <= 0 && (x3 > ((float) view.getRight()) ? 1 : (x3 == ((float) view.getRight()) ? 0 : -1)) <= 0);
    }

    public static void g(SwipeToActionLayout swipeToActionLayout) {
        k kVar = swipeToActionLayout.u;
        ViewDragHelper viewDragHelper = swipeToActionLayout.f107273x;
        Rect rect = swipeToActionLayout.f107267p;
        swipeToActionLayout.setState(m.OPENING);
        View view = swipeToActionLayout.f;
        if (view == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        int i = q.f11493a[kVar.ordinal()];
        viewDragHelper.smoothSlideViewTo(view, i != 1 ? i != 2 ? 0 : rect.left - swipeToActionLayout.maxActionsWidth : rect.left + swipeToActionLayout.maxActionsWidth, rect.top);
        ViewCompat.postInvalidateOnAnimation(swipeToActionLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDistToClosestEdge() {
        int i = q.f11493a[this.u.ordinal()];
        Rect rect = this.f107267p;
        if (i == 1) {
            int i2 = rect.left + this.maxActionsWidth;
            View view = this.f;
            if (view == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            int left = view.getLeft() - rect.left;
            View view2 = this.f;
            if (view2 != null) {
                return Math.min(left, i2 - view2.getLeft());
            }
            Intrinsics.r("mainView");
            throw null;
        }
        if (i != 2) {
            if (i == 3) {
                return 0;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i3 = rect.right - this.maxActionsWidth;
        View view3 = this.f;
        if (view3 == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        int right = view3.getRight() - i3;
        int i5 = rect.right;
        View view4 = this.f;
        if (view4 != null) {
            return Math.min(right, i5 - view4.getRight());
        }
        Intrinsics.r("mainView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOverscrollThreshold() {
        return (int) ((getWidth() - this.maxActionsWidth) * 0.3f);
    }

    public static /* synthetic */ void setItems$default(SwipeToActionLayout swipeToActionLayout, List list, l lVar, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = l.BOTH;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        swipeToActionLayout.setItems(list, lVar, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
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
    public final void setState(m mVar) {
        ?? r56;
        m mVar2 = this.state;
        if (mVar != mVar2) {
            this.isDragLocked = mVar == m.CLOSING || mVar == m.OPENING;
            m mVar3 = m.CLOSE;
            ArrayList arrayList = this.f107265m;
            ArrayList arrayList2 = this.o;
            if (mVar2 == mVar3 && mVar == m.OPENING) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    View view = (View) arrayList.get(i);
                    i++;
                    view.offsetLeftAndRight((-view.getWidth()) * i);
                }
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    View view2 = (View) arrayList2.get(i2);
                    view2.offsetLeftAndRight((arrayList2.size() - i2) * view2.getWidth());
                }
            } else {
                m mVar4 = m.DRAG_FULLY_OPENED;
                e eVar = this.k;
                if (mVar2 != mVar4 && mVar == mVar4 && this.i) {
                    View actionView = (View) (this.u == k.LEFT_TO_RIGHT ? d0.d0(arrayList) : d0.o0(arrayList2));
                    if (actionView != null) {
                        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(VibrationEffect.createOneShot(50L, 128));
                        }
                        k direction = this.u;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(actionView, "actionView");
                        Intrinsics.checkNotNullParameter(direction, "direction");
                        int i3 = azl.d.f11481a[direction.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                LinearLayout linearLayout = eVar.f11483b;
                                if (linearLayout == null) {
                                    Intrinsics.r("leftActionView");
                                    throw null;
                                }
                                linearLayout.setVisibility(0);
                                LinearLayout linearLayout2 = eVar.f11484c;
                                if (linearLayout2 == null) {
                                    Intrinsics.r("rightActionView");
                                    throw null;
                                }
                                linearLayout2.setVisibility(4);
                            } else if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r56 = 0;
                        } else {
                            LinearLayout linearLayout3 = eVar.f11483b;
                            if (linearLayout3 == null) {
                                Intrinsics.r("leftActionView");
                                throw null;
                            }
                            linearLayout3.setVisibility(4);
                            LinearLayout linearLayout4 = eVar.f11484c;
                            if (linearLayout4 == null) {
                                Intrinsics.r("rightActionView");
                                throw null;
                            }
                            r56 = 0;
                            linearLayout4.setVisibility(0);
                        }
                        eVar.setVisibility(r56);
                        eVar.a(actionView, r56, direction).start();
                    }
                } else if (mVar2 == mVar4 && mVar == m.CLOSING_MANUALLY && this.i) {
                    View actionView2 = (View) (this.u == k.LEFT_TO_RIGHT ? d0.o0(arrayList2) : d0.d0(arrayList));
                    if (actionView2 != null) {
                        Vibrator vibrator2 = (Vibrator) getContext().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(VibrationEffect.createOneShot(50L, 128));
                        }
                        k direction2 = this.u;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(actionView2, "actionView");
                        Intrinsics.checkNotNullParameter(direction2, "direction");
                        int i5 = azl.d.f11481a[direction2.ordinal()];
                        if (i5 == 1) {
                            LinearLayout linearLayout5 = eVar.f11483b;
                            if (linearLayout5 == null) {
                                Intrinsics.r("leftActionView");
                                throw null;
                            }
                            linearLayout5.setVisibility(0);
                            LinearLayout linearLayout6 = eVar.f11484c;
                            if (linearLayout6 == null) {
                                Intrinsics.r("rightActionView");
                                throw null;
                            }
                            linearLayout6.setVisibility(4);
                        } else if (i5 == 2) {
                            LinearLayout linearLayout7 = eVar.f11483b;
                            if (linearLayout7 == null) {
                                Intrinsics.r("leftActionView");
                                throw null;
                            }
                            linearLayout7.setVisibility(4);
                            LinearLayout linearLayout8 = eVar.f11484c;
                            if (linearLayout8 == null) {
                                Intrinsics.r("rightActionView");
                                throw null;
                            }
                            linearLayout8.setVisibility(0);
                        } else if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Drawable background = actionView2.getBackground();
                        Intrinsics.i(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                        eVar.setBackgroundColor(((ColorDrawable) background).getColor());
                        Animator animatorA = eVar.a(actionView2, true, direction2);
                        animatorA.addListener(new aq0.k(eVar, 1));
                        animatorA.start();
                    }
                } else if (mVar == mVar3 && eVar.getVisibility() != 4) {
                    eVar.setVisibility(4);
                }
            }
        }
        this.state = mVar;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f107273x.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void d() {
        m mVar;
        m mVar2 = this.state;
        if (mVar2 == m.CLOSE || mVar2 == (mVar = m.CLOSING)) {
            return;
        }
        View view = this.f;
        if (view == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        int left = view.getLeft();
        Rect rect = this.f107267p;
        if (left == rect.left) {
            return;
        }
        setState(mVar);
        View view2 = this.f;
        if (view2 == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        this.f107273x.smoothSlideViewTo(view2, rect.left, rect.top);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void f() {
        ArrayList arrayList = this.f107265m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view = (View) arrayList.get(i);
            View view2 = this.f;
            if (view2 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            i++;
            view.offsetLeftAndRight(((int) Math.ceil(MathUtils.clamp(((double) view2.getLeft()) / ((double) this.maxActionsWidth), 0.0d, 1.0d) * ((double) (this.f107269r * i)))) - view.getRight());
        }
        ArrayList arrayList2 = this.o;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            View view3 = (View) arrayList2.get(i2);
            double d = this.maxActionsWidth;
            Rect rect = this.f107267p;
            int i3 = rect.right;
            View view4 = this.f;
            if (view4 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            double dClamp = MathUtils.clamp(((double) (i3 - view4.getRight())) / d, 0.0d, 1.0d);
            int i5 = this.f107269r * i2;
            int i6 = rect.right;
            int i21 = this.maxActionsWidth;
            view3.offsetLeftAndRight((((i6 - i21) + i5) + ((int) Math.ceil((((double) 1) - dClamp) * ((double) (i21 - i5))))) - view3.getLeft());
        }
    }

    public final boolean getClickAvailable() {
        m mVar = this.state;
        return (mVar == m.OPENING || mVar == m.CLOSE || mVar == m.CLOSING_MANUALLY) ? false : true;
    }

    /* JADX INFO: renamed from: getMaxActionsWidth$core_ui_release, reason: from getter */
    public final int getMaxActionsWidth() {
        return this.maxActionsWidth;
    }

    public final Function2<View, Object, Unit> getOnActionClickListener() {
        return this.onActionClickListener;
    }

    public final Function2<View, Object, Unit> getOnLongActionClickListener() {
        return this.onLongActionClickListener;
    }

    public final f getOnSwipeListener() {
        return null;
    }

    public final float getThresholdToOpenView() {
        return this.thresholdToOpenView;
    }

    public final boolean getUserInteractionDisabled() {
        return this.userInteractionDisabled;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        this.f = childAt;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        e eVar = this.k;
        addView(eVar, layoutParams);
        eVar.setSwipeActionViewFactory(this.f107263j);
        LinearLayout linearLayoutA = eVar.getSwipeActionViewFactory().a(h.LEFT);
        eVar.f11483b = linearLayoutA;
        linearLayoutA.setVisibility(4);
        LinearLayout linearLayoutA2 = eVar.getSwipeActionViewFactory().a(h.RIGHT);
        eVar.f11484c = linearLayoutA2;
        linearLayoutA2.setVisibility(4);
        LinearLayout linearLayout = eVar.f11483b;
        if (linearLayout == null) {
            Intrinsics.r("leftActionView");
            throw null;
        }
        eVar.addView(linearLayout, linearLayout.getLayoutParams());
        LinearLayout linearLayout2 = eVar.f11484c;
        if (linearLayout2 != null) {
            eVar.addView(linearLayout2, linearLayout2.getLayoutParams());
        } else {
            Intrinsics.r("rightActionView");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.uicomponent.swipe_layout.SwipeToActionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i2, int i3, int i5) {
        int i6 = i3 - i;
        int i21 = i5 - i2;
        l lVar = this.f107262h;
        l lVar2 = l.BOTH;
        ArrayList arrayList = this.f107264l;
        if (lVar == lVar2 || lVar == l.FROM_LEFT_TO_RIGHT) {
            this.f107263j.c(i6, i21, arrayList, this.f107265m, h.LEFT);
        }
        l lVar3 = this.f107262h;
        if (lVar3 == lVar2 || lVar3 == l.FROM_RIGHT_TO_LEFT) {
            this.f107263j.c(i6, i21, this.f107266n, this.o, h.RIGHT);
        }
        this.k.layout(0, 0, i6, i21);
        int i22 = this.f107263j.d.f11477a;
        this.f107269r = i22;
        this.maxActionsWidth = arrayList.size() * i22;
        if (this.state != m.CLOSE) {
            View view = this.f;
            if (view == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            int i32 = this.f107261g;
            view.layout(i32, 0, i32 + i6, i21);
            View view2 = this.f;
            if (view2 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            view2.setLeft(this.f107261g);
            View view3 = this.f;
            if (view3 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            view3.setRight(this.f107261g + i6);
            if (this.f107261g != 0) {
                f();
            }
        } else {
            View view4 = this.f;
            if (view4 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            view4.layout(0, 0, i6, i21);
        }
        this.f107267p.set(0, 0, i6, i21);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f;
        if (view == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        view.measure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        View view2 = this.f;
        if (view2 == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        int measuredHeight = view2.getMeasuredHeight();
        l lVar = this.f107262h;
        l lVar2 = l.BOTH;
        if (lVar == lVar2 || lVar == l.FROM_LEFT_TO_RIGHT) {
            this.f107263j.d(size, measuredHeight, this.f107264l, this.f107265m, h.LEFT);
        }
        l lVar3 = this.f107262h;
        if (lVar3 == lVar2 || lVar3 == l.FROM_RIGHT_TO_LEFT) {
            this.f107263j.d(size, measuredHeight, this.f107266n, this.o, h.RIGHT);
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.userInteractionDisabled) {
            return false;
        }
        this.f107274y.onTouchEvent(event);
        this.f107273x.processTouchEvent(event);
        return true;
    }

    public final void setDragLocked(boolean z3) {
        this.isDragLocked = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setItems(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Object> r11, @org.jetbrains.annotations.NotNull azl.l r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.uicomponent.swipe_layout.SwipeToActionLayout.setItems(java.util.List, azl.l, boolean):void");
    }

    public final void setMaxActionsWidth$core_ui_release(int i) {
        this.maxActionsWidth = i;
    }

    public final void setOnActionClickListener(Function2<? super View, Object, Unit> function2) {
        this.onActionClickListener = function2;
    }

    public final void setOnLongActionClickListener(Function2<? super View, Object, Unit> function2) {
        this.onLongActionClickListener = function2;
    }

    public final void setOnSwipeListener(f fVar) {
    }

    public final void setThresholdToOpenView(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalStateException("Threshold cannot be outside of 0..1 range");
        }
        this.thresholdToOpenView = f;
    }

    public final void setUserInteractionDisabled(boolean z3) {
        this.userInteractionDisabled = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeToActionLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.thresholdToOpenView = 0.5f;
        this.f107262h = l.BOTH;
        this.i = true;
        this.f107263j = new i(this, new n(this, 9));
        this.k = new e(context, null, 6, 0);
        this.f107264l = new ArrayList();
        this.f107265m = new ArrayList();
        this.f107266n = new ArrayList();
        this.o = new ArrayList();
        azl.n nVar = new azl.n(this);
        p pVar = new p(this);
        this.f107267p = new Rect();
        this.state = m.CLOSE;
        this.u = k.NONE;
        this.f107272w = -1.0f;
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 1.0f, pVar);
        Intrinsics.checkNotNullExpressionValue(viewDragHelperCreate, "create(...)");
        this.f107273x = viewDragHelperCreate;
        viewDragHelperCreate.setEdgeTrackingEnabled(1);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, nVar);
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.f107274y = gestureDetectorCompat;
    }

    public /* synthetic */ SwipeToActionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
