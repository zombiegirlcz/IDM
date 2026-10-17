package com.revolut.core.ui_kit.chat.prompt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ap0.a;
import ap0.c;
import ap0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import dq0.b;
import ix0.x0;
import java.util.ArrayList;
import java.util.List;
import jb3.l;
import jq0.r;
import koi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import yp0.y;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u0014\u0010+\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/revolut/core/ui_kit/chat/prompt/ChatPromptView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldq0/b;", "getKeyboardAnimationCallback", "()Ldq0/b;", "offset", "", "setBottomOffset", "(I)V", "", "enabled", "setDeferredUpdatesMode", "(Z)V", "Lap0/a;", "model", "setModel", "(Lap0/a;)V", "", "value", "h", "F", "setTransitionProgress", "(F)V", "transitionProgress", "i", "setTitleTransitionAlpha", "titleTransitionAlpha", "k", "setImeVisibilityFraction", "imeVisibilityFraction", "l", "setImeTranslation", "imeTranslation", "getV3Mode", "()Z", "v3Mode", "Companion", "ap0/b", "a", "ui_kit_chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatPromptView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f51534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51536c;
    public a d;
    public ValueAnimator e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float transitionProgress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float titleTransitionAlpha;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51539j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float imeVisibilityFraction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float imeTranslation;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UIKitTextView f51541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f51542n;
    public final RowDelegate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f51543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f51544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final goi.h f51546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f51547t;
    public final int u;
    public final Rect v;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.chat.prompt.ChatPromptView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPromptView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getV3Mode() {
        a aVar = this.f51534a;
        return aVar != null && aVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImeTranslation(float f) {
        this.imeTranslation = f;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImeVisibilityFraction(float f) {
        this.imeVisibilityFraction = f;
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleTransitionAlpha(float f) {
        if (this.titleTransitionAlpha == f) {
            return;
        }
        this.titleTransitionAlpha = f;
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTransitionProgress(float f) {
        if (this.transitionProgress == f) {
            return;
        }
        this.transitionProgress = f;
        k();
    }

    public final int f() {
        if (getV3Mode()) {
            return this.f51544q.getHeight();
        }
        RecyclerView recyclerView = this.f51542n;
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return 0;
        }
        View childAt = recyclerView.getChildAt(0);
        Rect rect = this.v;
        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
        int i = rect.top;
        recyclerView.getDecoratedBoundsWithMargins(recyclerView.getChildAt(childCount - 1), rect);
        return f.g(rect.bottom - i, 0, recyclerView.getHeight());
    }

    public final boolean g() {
        a aVar;
        a aVar2;
        if (getV3Mode()) {
            if (this.f51544q.getSuggestionCount() <= 0 || (aVar2 = this.f51534a) == null || !aVar2.f8020c) {
                return false;
            }
        } else if (this.f51543p.f186375h.getItems().isEmpty() || (aVar = this.f51534a) == null || !aVar.f8020c) {
            return false;
        }
        return true;
    }

    @NotNull
    public final b getKeyboardAnimationCallback() {
        return new ap0.b(this);
    }

    public final void h() {
        int i = this.f51535b;
        goi.h hVar = this.f51546s;
        hVar.d = i;
        if (!hVar.f145169b) {
            hVar.a(i, true);
        }
        int height = getHeight() - (this.f51535b + f());
        int iJ = j(height);
        UIKitTextView uIKitTextView = this.f51541m;
        int top = iJ - uIKitTextView.getTop();
        if (top != 0) {
            uIKitTextView.offsetTopAndBottom(top);
        }
        boolean z = this.f51537g;
        boolean z3 = height < uIKitTextView.getBottom();
        this.f51537g = z3;
        if (z != z3) {
            if (this.f < 0) {
                this.f = isLaidOut() ? 300L : 0L;
                if (!isLayoutRequested()) {
                    i();
                }
            }
        }
        l();
        k();
    }

    public final void i() {
        a aVar;
        long j2 = this.f;
        this.f = -1L;
        if (j2 < 0) {
            return;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        UIKitTextView uIKitTextView = this.f51541m;
        uIKitTextView.animate().cancel();
        boolean v3Mode = getV3Mode();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!v3Mode) {
            float f4 = this.transitionProgress;
            float f5 = this.titleTransitionAlpha;
            float f6 = g() ? 1.0f : 0.0f;
            float f32 = (this.f51537g || (aVar = this.f51534a) == null || !aVar.f8020c) ? 0.0f : 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setDuration(j2);
            valueAnimatorOfFloat.setInterpolator(r.f177393b);
            c cVar = new c(valueAnimatorOfFloat, this, f4, f6, f5, f32);
            valueAnimatorOfFloat.addListener(cVar);
            valueAnimatorOfFloat.addUpdateListener(cVar);
            this.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            return;
        }
        n nVar = this.f51544q;
        boolean expanded = nVar.getExpanded();
        boolean zG = g();
        if (zG) {
            nVar.d();
        }
        if (zG && !this.f51537g) {
            f = 1.0f;
        }
        if (f == uIKitTextView.getAlpha()) {
            return;
        }
        ViewPropertyAnimator interpolator = uIKitTextView.animate().alpha(f).setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(interpolator, "setInterpolator(...)");
        if (f != 1.0f || expanded) {
            if (j2 > 150) {
                j2 = 150;
            }
            interpolator.setDuration(j2).setStartDelay(0L);
        } else {
            interpolator.setStartDelay(300L).setDuration(250L);
        }
        interpolator.start();
    }

    public final int j(int i) {
        boolean v3Mode = getV3Mode();
        UIKitTextView uIKitTextView = this.f51541m;
        return v3Mode ? Math.max(0, (i - uIKitTextView.getHeight()) - this.u) : Math.max(0, (i - uIKitTextView.getHeight()) / 2);
    }

    public final void k() {
        int iF = f();
        boolean v3Mode = getV3Mode();
        RecyclerView recyclerView = this.f51542n;
        if (v3Mode) {
            recyclerView.setTranslationY(this.imeTranslation);
            this.f51544q.setTranslationY(this.imeTranslation);
        } else {
            float f = this.transitionProgress;
            recyclerView.setAlpha(f);
            recyclerView.setTranslationY(((1.0f - f) * iF) + this.imeTranslation);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                float f4 = this.transitionProgress;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition == -1) {
                    childAdapterPosition = recyclerView.indexOfChild(childAt);
                }
                if (childAdapterPosition >= 0) {
                    childAt.setTranslationY((1.0f - f4) * this.f51547t * childAdapterPosition);
                }
            }
        }
        int iJ = j(getHeight() - (this.f51535b + iF));
        int height = getHeight() - this.f51535b;
        UIKitTextView uIKitTextView = this.f51541m;
        float fMax = (1.0f - this.transitionProgress) * (Math.max(0, (height - uIKitTextView.getHeight()) / 2) - iJ);
        if (getV3Mode()) {
            fMax = this.imeTranslation;
        }
        uIKitTextView.setTranslationY(fMax);
    }

    public final void l() {
        ValueAnimator valueAnimator;
        if (getV3Mode()) {
            return;
        }
        this.f51541m.setAlpha(this.titleTransitionAlpha * ((!this.f51537g || ((valueAnimator = this.e) != null && valueAnimator.isRunning())) ? 1.0f : BitmapDescriptorFactory.HUE_RED) * (1.0f - this.imeVisibilityFraction));
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!this.f51539j) {
            setImeVisibilityFraction(x0.c(insets) ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

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
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        h();
        i();
        if (this.f51545r) {
            this.f51545r = false;
            if (getV3Mode() || g()) {
                return;
            }
            for (int i6 = 0; i6 < 3; i6++) {
                int i21 = this.o.f58165c;
                h hVar = this.f51543p;
                RecyclerView recyclerView = this.f51542n;
                RecyclerView.ViewHolder viewHolderCreateViewHolder = hVar.createViewHolder(recyclerView, i21);
                Intrinsics.checkNotNullExpressionValue(viewHolderCreateViewHolder, "createViewHolder(...)");
                recyclerView.getRecycledViewPool().putRecycledView(viewHolderCreateViewHolder);
            }
        }
    }

    public final void setBottomOffset(int offset) {
        if (offset != this.f51535b) {
            this.f51535b = offset;
            n nVar = this.f51544q;
            ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.bottomMargin != offset) {
                layoutParams2.bottomMargin = offset;
                nVar.requestLayout();
            }
            h();
        }
    }

    public final void setDeferredUpdatesMode(boolean enabled) {
        a aVar;
        if (enabled == this.f51536c) {
            return;
        }
        this.f51536c = enabled;
        if (enabled || (aVar = this.d) == null) {
            return;
        }
        this.d = null;
        setModel(aVar);
    }

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
    public final void setModel(@NotNull a model) {
        int i;
        int i2;
        boolean z;
        boolean z3;
        int i3;
        int iK;
        Intrinsics.checkNotNullParameter(model, "model");
        if (this.f51536c) {
            this.d = model;
            return;
        }
        a aVar = this.f51534a;
        if (Intrinsics.f(model, aVar)) {
            return;
        }
        boolean zG = g();
        boolean z4 = aVar != null ? aVar.f8020c : true;
        boolean z6 = aVar != null && aVar.d == model.d;
        this.f51534a = model;
        n nVar = this.f51544q;
        UIKitTextView uIKitTextView = this.f51541m;
        if (!z6) {
            if (model.d) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 30.0f);
                i = 2;
                i3 = 8388691;
                i2 = 8388691;
                z = false;
                z3 = true;
            } else {
                i = 4;
                i2 = 49;
                z = true;
                z3 = false;
                i3 = 17;
                iK = 0;
            }
            this.f51542n.setVisibility(z ? 0 : 8);
            nVar.setVisibility(z3 ? 4 : 8);
            uIKitTextView.setGravity(i3);
            uIKitTextView.setTextAlignment(i);
            ViewGroup.LayoutParams layoutParams = uIKitTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i2;
            layoutParams2.setMarginStart(iK);
            uIKitTextView.setLayoutParams(layoutParams2);
        }
        Clause clause = model.f8018a;
        boolean z11 = model.f8020c;
        List<ChatPromptSuggestion> list = model.f8019b;
        if (!Intrinsics.f(clause, aVar != null ? aVar.f8018a : null)) {
            kli.a.b(uIKitTextView, model.f8018a, ty0.f.f275450a);
        }
        boolean z12 = (aVar != null && Intrinsics.f(list, aVar.f8019b) && z11 == aVar.f8020c && z6) ? false : true;
        if (z12) {
            if (getV3Mode()) {
                nVar.setSuggestions(list);
            } else {
                pf pfVar = new pf(null, new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, 508);
                List<ChatPromptSuggestion> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                int i5 = 0;
                for (Object obj2 : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    ChatPromptSuggestion chatPromptSuggestion = (ChatPromptSuggestion) obj2;
                    RowDelegate.Model model2 = new RowDelegate.Model(chatPromptSuggestion.f51531a, new RowDelegate.Model.MainImage.Image40(chatPromptSuggestion.f51532b, null, null, false, null, false, 62), chatPromptSuggestion.f51533c, null, 0, null, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, chatPromptSuggestion, chatPromptSuggestion.e, 0, 0, 0, 0, 524286968);
                    yp0.b.l(model2, R$attr.uikit_dp4, i5 == v.j(list) ? R$attr.uikit_dp8 : R$attr.uikit_dp4, 0, 0, null, false, 60);
                    arrayList.add(model2);
                    i5 = i6;
                }
                this.f51543p.c(arrayList);
            }
        }
        boolean z29 = zG != g();
        boolean z31 = z4 != z11;
        if (z29 || z31 || !z6) {
            this.f = !isLaidOut() ? 0L : !z6 ? 300L : z12 ? 700L : 500L;
            if (isLayoutRequested()) {
                return;
            }
            i();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPromptView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f = -1L;
        this.titleTransitionAlpha = 1.0f;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.o = rowDelegate;
        koi.c cVar = new koi.c(0);
        cVar.a(rowDelegate);
        h hVar = new h(cVar, false, false, 4);
        this.f51543p = hVar;
        n nVar = new n(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        nVar.setLayoutParams(layoutParams);
        nVar.setVisibility(8);
        this.f51544q = nVar;
        this.f51545r = true;
        this.f51547t = kli.a.k(context, 60.0f);
        this.u = kli.a.k(context, 32.0f);
        this.v = new Rect();
        kli.a.k(context, 24.0f);
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 49;
        uIKitTextView.setLayoutParams(layoutParams2);
        uIKitTextView.setGravity(17);
        uIKitTextView.setTextAlignment(4);
        l.e(uIKitTextView, R$attr.internal_textAppearanceMarketingDisplay3_noXmlUsage);
        uIKitTextView.setMaxWidth(kli.a.k(context, 300.0f));
        uIKitTextView.setTextColor(iS);
        uIKitTextView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f51541m = uIKitTextView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.chatPrompt_recyclerView);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(context);
        uIKitLinearLayoutManager.setStackFromEnd(true);
        y.h(recyclerView, hVar, uIKitLinearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f51542n = recyclerView;
        this.f51546s = new goi.h(recyclerView);
        addView(uIKitTextView);
        addView(recyclerView);
        addView(nVar);
    }

    public /* synthetic */ ChatPromptView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
