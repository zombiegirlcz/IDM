package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.DynamicInsetDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.r0;
import et0.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.c4;
import mx0.e4;
import mx0.o4;
import mx0.r3;
import mx0.s3;
import mx0.v3;
import org.jetbrains.annotations.NotNull;
import ro0.e0;
import ro0.q;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ[\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00101\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u00108\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00100\u001a\u0004\b5\u00106R \u0010?\u001a\u0002098\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/revolut/core/ui_kit/views/ChatInputLayoutView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "status", "", "", "suggestions", "Lgw0/q;", "replyToState", "", "inputVisible", "Lgw0/h;", "attachments", "Lgw0/s;", "searchNavigator", "", "setContent", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/util/List;Lgw0/q;ZLjava/util/List;Lgw0/s;)V", "Lmx0/r3;", "listener", "setListener", "(Lmx0/r3;)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "getTotalInputHeight", "()I", "Lcom/revolut/core/ui_kit/views/ChatInputView;", "a", "Lcom/revolut/core/ui_kit/views/ChatInputView;", "getInputView", "()Lcom/revolut/core/ui_kit/views/ChatInputView;", "inputView", "Lmx0/o4;", "b", "Lmx0/o4;", "getSuggestionsView", "()Lmx0/o4;", "getSuggestionsView$annotations", "()V", "suggestionsView", "Let0/t0;", "c", "Let0/t0;", "getStatusMessageView", "()Let0/t0;", "getStatusMessageView$annotations", "statusMessageView", "Let0/r0;", "d", "Let0/r0;", "getSearchNavigatorView$ui_kit_components_release", "()Let0/r0;", "getSearchNavigatorView$ui_kit_components_release$annotations", "searchNavigatorView", "mx0/v3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatInputLayoutView extends ViewGroup {
    public gw0.s A;
    public v3 B;
    public boolean C;
    public boolean D;
    public final boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ChatInputView inputView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final o4 suggestionsView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final t0 statusMessageView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final r0 searchNavigatorView;
    public final View e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58432h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f58433j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f58436n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f58437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r3 f58438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ro0.q f58439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ro0.p f58440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LayerDrawable f58441t;
    public boolean u;
    public Clause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f58442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public gw0.q f58443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f58444y;
    public List z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputLayoutView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getSearchNavigatorView$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getStatusMessageView$annotations() {
    }

    public static /* synthetic */ void getSuggestionsView$annotations() {
    }

    private final int getTotalInputHeight() {
        return Math.max(this.f58434l, this.f58436n) + this.f58435m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setContent$default(ChatInputLayoutView chatInputLayoutView, Clause clause, List list, gw0.q qVar, boolean z, List list2, gw0.s sVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            clause = null;
        }
        if ((i & 2) != 0) {
            list = f0.f322471a;
        }
        if ((i & 4) != 0) {
            qVar = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            list2 = f0.f322471a;
        }
        if ((i & 32) != 0) {
            sVar = null;
        }
        chatInputLayoutView.setContent(clause, list, qVar, z, list2, sVar);
    }

    public final void a() {
        if (this.f58437p) {
            return;
        }
        int height = getHeight();
        int i = this.o;
        int totalInputHeight = ((((height - i) - getTotalInputHeight()) - this.i) - this.f58431g) - this.f58432h;
        if (totalInputHeight < 0) {
            totalInputHeight = 0;
        }
        this.k = totalInputHeight;
        this.e.setTranslationY(totalInputHeight);
        ro0.p pVar = this.f58440s;
        if (pVar != null) {
            pVar.c();
        }
        r3 r3Var = this.f58438q;
        if (r3Var != null) {
            r3Var.a(this.f58431g + this.f58432h + this.f58435m, Math.max(this.f58434l, this.f58436n) + this.i + i);
        }
    }

    @NotNull
    public final ChatInputView getInputView() {
        return this.inputView;
    }

    @NotNull
    /* JADX INFO: renamed from: getSearchNavigatorView$ui_kit_components_release, reason: from getter */
    public final r0 getSearchNavigatorView() {
        return this.searchNavigatorView;
    }

    @NotNull
    public final t0 getStatusMessageView() {
        return this.statusMessageView;
    }

    @NotNull
    public final o4 getSuggestionsView() {
        return this.suggestionsView;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!getFitsSystemWindows()) {
            WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
            return windowInsetsOnApplyWindowInsets;
        }
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        int i2 = windowInsetsCompat.getInsets(iSystemBars).bottom;
        if (i != this.f58433j || i2 != this.i) {
            this.f58433j = i;
            this.i = i2;
            requestLayout();
        }
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build().toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ChatInputLayoutView chatInputLayoutView;
        GradientDrawable gradientDrawable;
        ShapeDrawable shapeDrawableD;
        super.onAttachedToWindow();
        boolean z = this.E;
        e0 e0Var = z ? e0.REFLECTIVE_SURFACE : e0.CHAT_INPUT;
        if (this.f58439r == null) {
            ro0.q.Companion.getClass();
            this.f58439r = q.a.a(this, e0Var);
        }
        ro0.p pVarE = this.f58440s;
        if (pVarE == null) {
            ro0.q qVar = this.f58439r;
            if (qVar != null) {
                chatInputLayoutView = this;
                pVarE = ro0.q.e(qVar, chatInputLayoutView, new kye.e(this, 17), new ro0.k(ro0.j.BLURRED_BOTTOM), null, new s3(this, 1), 40);
            } else {
                chatInputLayoutView = this;
                pVarE = null;
            }
        } else {
            chatInputLayoutView = this;
        }
        chatInputLayoutView.f58440s = pVarE;
        boolean z3 = chatInputLayoutView.u;
        boolean z4 = pVarE != null;
        chatInputLayoutView.u = z4;
        boolean z6 = z4 && z;
        ChatInputView chatInputView = chatInputLayoutView.inputView;
        chatInputView.setReflectiveSurfaceEnabled(z6);
        if (chatInputLayoutView.f58441t == null || chatInputLayoutView.u != z3) {
            boolean z11 = chatInputLayoutView.u;
            int i = chatInputLayoutView.f;
            if (!z11) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{0, i});
                gradientDrawable.setShape(0);
                shapeDrawableD = dr0.l.d(i);
            } else if (z) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setGradientCenter(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                gradientDrawable.setColors(new int[]{0, io0.a.b(0.4f, i), io0.a.b(0.7f, i)}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.35f, 1.0f});
                shapeDrawableD = dr0.l.d(io0.a.b(0.7f, i));
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setGradientCenter(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                gradientDrawable.setColors(new int[]{0, io0.a.b(0.7f, i), i}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.35f, 1.0f});
                shapeDrawableD = dr0.l.d(i);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawableD});
            layerDrawable.setLayerGravity(0, 48);
            chatInputLayoutView.f58441t = layerDrawable;
            chatInputLayoutView.e.setBackground(layerDrawable);
            if (z) {
                return;
            }
            if (chatInputLayoutView.u) {
                chatInputView.setBaseInputBackground(io0.a.b(0.7f, i));
                return;
            }
            DynamicInsetDrawable dynamicInsetDrawable = chatInputView.y0;
            Drawable drawable = dynamicInsetDrawable != null ? dynamicInsetDrawable.getDrawable() : null;
            ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
            if (shapeDrawable == null) {
                Drawable background = chatInputView.getInputContainer$ui_kit_components_release().getBackground();
                shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            }
            if (shapeDrawable != null) {
                shapeDrawable.setTintMode(null);
                shapeDrawable.getPaint().setColor(-16777216);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ro0.p pVar = this.f58440s;
        if (pVar != null) {
            pVar.e();
        }
        this.f58440s = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int iG;
        int i6;
        this.f58437p = true;
        LayerDrawable layerDrawable = this.f58441t;
        int height = this.o;
        if (layerDrawable != null) {
            if (this.f58440s != null) {
                iG = getTotalInputHeight() + height + this.f58433j;
                i6 = 0;
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iG = kotlin.ranges.f.g(kli.a.k(context, 8.0f), 0, height);
                i6 = height - iG;
            }
            layerDrawable.setLayerInset(0, 0, i6, 0, 0);
            layerDrawable.setLayerHeight(0, iG);
            layerDrawable.setLayerInset(1, 0, i6 + iG, 0, 0);
        }
        this.e.layout(0, 0, getWidth(), getHeight());
        Rect rect = rr0.c.f256608a;
        t0 t0Var = this.statusMessageView;
        if (t0Var != null && rr0.c.e(t0Var)) {
            t0Var.layout(0, height, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight() + height);
            height += t0Var.getHeight();
        }
        o4 o4Var = this.suggestionsView;
        if (o4Var != null && rr0.c.e(o4Var)) {
            o4Var.layout(0, height, o4Var.getMeasuredWidth(), o4Var.getMeasuredHeight() + height);
            height += o4Var.getHeight();
        }
        ChatInputView chatInputView = this.inputView;
        if (chatInputView != null && rr0.c.e(chatInputView)) {
            chatInputView.layout(0, height, chatInputView.getMeasuredWidth(), chatInputView.getMeasuredHeight() + height);
        }
        r0 r0Var = this.searchNavigatorView;
        if (r0Var != null && rr0.c.e(r0Var)) {
            r0Var.layout(0, height, r0Var.getMeasuredWidth(), r0Var.getMeasuredHeight() + height);
        }
        this.f58437p = false;
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        Rect rect = rr0.c.f256608a;
        int measuredHeight4 = 0;
        t0 t0Var = this.statusMessageView;
        if (t0Var == null || !rr0.c.e(t0Var)) {
            measuredHeight = 0;
        } else {
            rr0.i.b(t0Var, i, i2, 0, 0);
            measuredHeight = t0Var.getMeasuredHeight();
        }
        o4 o4Var = this.suggestionsView;
        if (o4Var == null || !rr0.c.e(o4Var)) {
            measuredHeight2 = 0;
        } else {
            rr0.i.b(o4Var, i, i2, 0, 0);
            measuredHeight2 = o4Var.getMeasuredHeight();
        }
        ChatInputView chatInputView = this.inputView;
        if (chatInputView == null || !rr0.c.e(chatInputView)) {
            measuredHeight3 = 0;
        } else {
            rr0.i.b(chatInputView, i, i2, 0, 0);
            measuredHeight3 = chatInputView.getMeasuredHeight();
        }
        r0 r0Var = this.searchNavigatorView;
        if (r0Var != null && rr0.c.e(r0Var)) {
            rr0.i.b(r0Var, i, i2, 0, 0);
            measuredHeight4 = r0Var.getMeasuredHeight();
        }
        this.f58436n = measuredHeight4;
        int iMax = Math.max(measuredHeight3, measuredHeight4) + measuredHeight2 + measuredHeight + this.i + this.o;
        int size = View.MeasureSpec.getSize(i);
        rr0.i.a(this.e, size, iMax);
        setMeasuredDimension(size, iMax);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            this.D = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        super.setBackground(null);
    }

    public final void setContent(Clause status, @NotNull final List<Object> suggestions, gw0.q replyToState, boolean inputVisible, @NotNull final List<? extends gw0.h> attachments, gw0.s searchNavigator) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        boolean z = searchNavigator != null;
        if (z) {
            status = null;
        }
        if (z) {
            suggestions = f0.f322471a;
        }
        if (z) {
            replyToState = null;
        }
        boolean z3 = !z && inputVisible;
        if (z) {
            attachments = f0.f322471a;
        }
        boolean z4 = (Intrinsics.f(status, this.v) && Intrinsics.f(suggestions, this.f58442w) && Intrinsics.f(replyToState, this.f58443x) && z3 == this.f58444y && Intrinsics.f(attachments, this.z)) ? false : true;
        boolean zF = Intrinsics.f(searchNavigator, this.A);
        if (z4 || !zF) {
            boolean z6 = this.f58444y;
            this.v = status;
            this.f58442w = suggestions;
            this.f58443x = replyToState;
            this.f58444y = z3;
            this.z = attachments;
            this.A = searchNavigator;
            v3 v3Var = this.B;
            if (v3Var != null) {
                v3Var.f210043b = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!zF) {
                mt9.c cVar = new mt9.c(this, searchNavigator, 8);
                if (searchNavigator != null) {
                    arrayList.add(cVar);
                } else {
                    arrayList2.add(cVar);
                }
            }
            if (z4) {
                boolean z11 = replyToState != null;
                mt9.c cVar2 = new mt9.c(this, replyToState, 9);
                if (z11) {
                    arrayList.add(cVar2);
                } else {
                    arrayList2.add(cVar2);
                }
                boolean zIsEmpty = attachments.isEmpty();
                final int i = 1;
                Function1 function1 = new Function1(this) { // from class: mx0.t3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ChatInputLayoutView f210010b;

                    {
                        this.f210010b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Function0<Unit> function0 = (Function0) obj2;
                        switch (i) {
                            case 0:
                                this.f210010b.suggestionsView.setContent(attachments, function0);
                                break;
                            default:
                                this.f210010b.inputView.setAttachments(attachments, function0);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                if (zIsEmpty) {
                    arrayList2.add(function1);
                } else {
                    arrayList.add(function1);
                }
                if (z6 != z3) {
                    l3d.f fVar = new l3d.f(this, z3, 8);
                    if (z3) {
                        arrayList.add(fVar);
                    } else {
                        arrayList2.add(fVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    suggestions = null;
                }
                if (suggestions == null) {
                    suggestions = f0.f322471a;
                }
                final int i2 = 0;
                Function1 function12 = new Function1(this) { // from class: mx0.t3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ChatInputLayoutView f210010b;

                    {
                        this.f210010b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Function0<Unit> function0 = (Function0) obj2;
                        switch (i2) {
                            case 0:
                                this.f210010b.suggestionsView.setContent(suggestions, function0);
                                break;
                            default:
                                this.f210010b.inputView.setAttachments(suggestions, function0);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                if (suggestions.isEmpty()) {
                    arrayList2.add(function12);
                } else {
                    arrayList.add(function12);
                }
                if (!arrayList.isEmpty()) {
                    status = null;
                }
                mt9.c cVar3 = new mt9.c(this, status, 7);
                if (status != null) {
                    arrayList.add(cVar3);
                } else {
                    arrayList2.add(cVar3);
                }
            }
            v3 v3Var2 = new v3(arrayList, arrayList2);
            this.B = v3Var2;
            if (v3Var2.f210043b) {
                return;
            }
            if (arrayList2.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((Function1) it8.next()).invoke(null);
                }
            } else {
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    ((Function1) it9.next()).invoke(v3Var2);
                }
            }
        }
    }

    public final void setListener(@NotNull r3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f58438q = listener;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        super.suppressLayout(z);
        this.C = z;
        if (z || !this.D) {
            return;
        }
        this.D = false;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputLayoutView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    public ChatInputLayoutView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i2 = 6;
        int i3 = 0;
        ChatInputView chatInputView = new ChatInputView(context, attributeSet2, i2, i3);
        this.inputView = chatInputView;
        o4 o4Var = new o4(context, attributeSet2, i2, i3);
        this.suggestionsView = o4Var;
        t0 t0Var = new t0(context, attributeSet2, i2, i3);
        this.statusMessageView = t0Var;
        r0 r0Var = new r0(context, attributeSet2, i2, i3);
        this.searchNavigatorView = r0Var;
        View view = new View(context);
        this.e = view;
        this.f = kli.a.s(R$attr.uikit_windowBackground, context);
        this.o = kli.a.k(context, 12.0f);
        f0 f0Var = f0.f322471a;
        this.f58442w = f0Var;
        this.f58444y = true;
        this.z = f0Var;
        this.E = ((Boolean) jo0.g.D.getValue()).booleanValue();
        addView(view, -1, -1);
        addView(o4Var, -1, -2);
        addView(t0Var, -1, -2);
        addView(chatInputView, -1, -2);
        addView(r0Var, -1, -2);
        final s3 s3Var = new s3(this, 0);
        final int i5 = 0;
        o4Var.setHeightListener(new Function1(this) { // from class: mx0.u3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatInputLayoutView f210031b;

            {
                this.f210031b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = i5;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i6) {
                    case 0:
                        ChatInputLayoutView chatInputLayoutView = this.f210031b;
                        if (iIntValue != chatInputLayoutView.f58431g) {
                            chatInputLayoutView.f58431g = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    case 1:
                        ChatInputLayoutView chatInputLayoutView2 = this.f210031b;
                        if (iIntValue != chatInputLayoutView2.f58432h) {
                            chatInputLayoutView2.f58432h = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    default:
                        ChatInputLayoutView chatInputLayoutView3 = this.f210031b;
                        if (iIntValue != chatInputLayoutView3.f58436n) {
                            chatInputLayoutView3.f58436n = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i6 = 1;
        t0Var.setHeightListener(new Function1(this) { // from class: mx0.u3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatInputLayoutView f210031b;

            {
                this.f210031b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i66 = i6;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i66) {
                    case 0:
                        ChatInputLayoutView chatInputLayoutView = this.f210031b;
                        if (iIntValue != chatInputLayoutView.f58431g) {
                            chatInputLayoutView.f58431g = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    case 1:
                        ChatInputLayoutView chatInputLayoutView2 = this.f210031b;
                        if (iIntValue != chatInputLayoutView2.f58432h) {
                            chatInputLayoutView2.f58432h = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    default:
                        ChatInputLayoutView chatInputLayoutView3 = this.f210031b;
                        if (iIntValue != chatInputLayoutView3.f58436n) {
                            chatInputLayoutView3.f58436n = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i21 = 2;
        chatInputView.setHeightListener$ui_kit_components_release(new kp0.b(this, s3Var, i21));
        r0Var.setHeightListener(new Function1(this) { // from class: mx0.u3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatInputLayoutView f210031b;

            {
                this.f210031b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i66 = i21;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i66) {
                    case 0:
                        ChatInputLayoutView chatInputLayoutView = this.f210031b;
                        if (iIntValue != chatInputLayoutView.f58431g) {
                            chatInputLayoutView.f58431g = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    case 1:
                        ChatInputLayoutView chatInputLayoutView2 = this.f210031b;
                        if (iIntValue != chatInputLayoutView2.f58432h) {
                            chatInputLayoutView2.f58432h = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                    default:
                        ChatInputLayoutView chatInputLayoutView3 = this.f210031b;
                        if (iIntValue != chatInputLayoutView3.f58436n) {
                            chatInputLayoutView3.f58436n = iIntValue;
                            s3Var.invoke();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        chatInputView.setBackground(null);
        setFitsSystemWindows(true);
        chatInputView.setFixedState(e4.ONLY_TEXT);
        chatInputView.setStartButtonRotationEnabled(false);
        chatInputView.setMode(c4.CHAT);
    }

    public /* synthetic */ ChatInputLayoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
