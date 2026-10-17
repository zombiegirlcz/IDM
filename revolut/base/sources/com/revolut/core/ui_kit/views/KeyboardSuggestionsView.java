package com.revolut.core.ui_kit.views;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.c8;
import mx0.d8;
import mx0.f8;
import mx0.h8;
import mx0.i8;
import mx0.j8;
import mx0.k8;
import mx0.l8;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0007\u0018\u0019\u001a\u001b\u0010\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/views/KeyboardSuggestionsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/KeyboardSuggestionsView$c;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/KeyboardSuggestionsView$c;)V", "", "Lmx0/d8;", "value", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Companion", "mx0/h8", "b", "cam/f", "c", "a", "mx0/k8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KeyboardSuggestionsView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f58685j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cam.f f58686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8 f58687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k8 f58688c;
    public final ihm.f d;
    public final int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f58689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f58690h;
    public c i;

    public static final class a {
        private a() {
        }
    }

    public static final class b extends HorizontalScrollView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.widget.HorizontalScrollView, android.view.View
        public final float getLeftFadingEdgeStrength() {
            return getLayoutDirection() == 0 ? BitmapDescriptorFactory.HUE_RED : super.getLeftFadingEdgeStrength();
        }

        @Override // android.widget.HorizontalScrollView, android.view.View
        public final float getRightFadingEdgeStrength() {
            return getLayoutDirection() == 1 ? BitmapDescriptorFactory.HUE_RED : super.getRightFadingEdgeStrength();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f58691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d01.e f58692b;

        public c() {
            this((List) null, 3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f58691a, cVar.f58691a) && this.f58692b == cVar.f58692b;
        }

        public final int hashCode() {
            return this.f58692b.hashCode() + (this.f58691a.hashCode() * 31);
        }

        public c(List list, int i) {
            this((i & 1) != 0 ? f0.f322471a : list, d01.e.DEFAULT);
        }

        public c(List items, d01.e layoutStyle) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
            this.f58691a = items;
            this.f58692b = layoutStyle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardSuggestionsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setModel$lambda$0(KeyboardSuggestionsView keyboardSuggestionsView) {
        boolean z;
        List list;
        float f;
        int i;
        View view;
        float f4;
        int i2;
        float f5;
        LinearLayout.LayoutParams layoutParams;
        View view2;
        int i3;
        c cVar = keyboardSuggestionsView.i;
        c cVar2 = keyboardSuggestionsView.f58690h;
        List list2 = cVar.f58691a;
        List list3 = cVar2.f58691a;
        d01.e eVar = cVar2.f58692b;
        k8 k8Var = eVar.b() ? j8.f209781a : keyboardSuggestionsView.f58687b;
        int i5 = 1;
        boolean z3 = cVar.f58692b != eVar;
        if (list2.size() != list3.size()) {
            z = true;
            break;
        }
        int size = list3.size();
        for (int i6 = 0; i6 < size; i6++) {
            d8 d8Var = (d8) list3.get(i6);
            d8 d8Var2 = (d8) list2.get(i6);
            if (!Intrinsics.f(d8Var2.f209649a, d8Var.f209649a) || !Intrinsics.f(d8Var2.f209650b, d8Var.f209650b) || !Intrinsics.f(d8Var2.f209651c, d8Var.f209651c) || d8Var2.d != d8Var.d || !Intrinsics.f(d8Var2.f, d8Var.f)) {
                z = true;
                break;
            }
        }
        z = false;
        if (z3) {
            keyboardSuggestionsView.removeView(keyboardSuggestionsView.f58686a.p());
            cam.f fVarB = keyboardSuggestionsView.b(eVar);
            keyboardSuggestionsView.f58686a = fVarB;
            keyboardSuggestionsView.addView(fVarB.p(), new LinearLayout.LayoutParams(-1, -2));
        } else if (z) {
            ((LinearLayout) keyboardSuggestionsView.f58686a.f22677a).removeAllViews();
        }
        LinearLayout linearLayout = (LinearLayout) keyboardSuggestionsView.f58686a.f22677a;
        if (!Intrinsics.f(keyboardSuggestionsView.f58688c, k8Var)) {
            Context context = keyboardSuggestionsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            keyboardSuggestionsView.setBackgroundResource(kli.a.x(k8Var.a(), context));
            keyboardSuggestionsView.f58688c = k8Var;
        }
        boolean zIsEmpty = list3.isEmpty();
        Context context2 = keyboardSuggestionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, k8Var.e());
        linearLayout.setPaddingRelative(iK, linearLayout.getPaddingTop(), iK, zIsEmpty ? 0 : keyboardSuggestionsView.getResources().getDimensionPixelSize(k8Var.c()) - keyboardSuggestionsView.getResources().getDimensionPixelSize(k8Var.b()));
        int size2 = list3.size();
        int i21 = 0;
        while (i21 < size2) {
            d8 d8Var3 = (d8) list3.get(i21);
            int i22 = i21 == 0 ? i5 : 0;
            int i32 = i21 == list3.size() - i5 ? i5 : 0;
            d01.f fVar = d8Var3.d;
            boolean z4 = d8Var3.e;
            View childAt = linearLayout.getChildAt(i21);
            Object tag2 = childAt != null ? childAt.getTag(R$id.internal_keyboardSuggestion_style_tag) : null;
            int i33 = size2;
            View view3 = childAt;
            if (childAt != null) {
                view3 = childAt;
                if (tag2 != d8Var3.d) {
                    linearLayout.removeView(childAt);
                    view3 = null;
                }
            }
            if (view3 == null) {
                Context context3 = keyboardSuggestionsView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                if (!eVar.d() || (i3 = l8.f209804a[fVar.ordinal()]) == 1) {
                    f4 = k8Var.f();
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4 = k8Var.d();
                }
                int iK2 = kli.a.k(context3, f4);
                if (eVar.a()) {
                    i2 = iK2;
                    list = list3;
                    f5 = 1.0f;
                    layoutParams = new LinearLayout.LayoutParams(0, keyboardSuggestionsView.getResources().getDimensionPixelSize(k8Var.b()), 1.0f);
                } else {
                    i2 = iK2;
                    list = list3;
                    f5 = 1.0f;
                    layoutParams = new LinearLayout.LayoutParams(-2, keyboardSuggestionsView.getResources().getDimensionPixelSize(k8Var.b()));
                }
                layoutParams.setMarginStart(i22 != 0 ? 0 : i2 / 2);
                layoutParams.setMarginEnd(i32 != 0 ? 0 : i2 / 2);
                if (k8Var.equals(j8.f209781a)) {
                    Context context4 = keyboardSuggestionsView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    h8 h8Var = new h8(context4, eVar);
                    h8Var.setLayoutParams(layoutParams);
                    i = 1;
                    view2 = h8Var;
                } else {
                    if (!k8Var.equals(i8.f209755a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AppCompatTextView appCompatTextView = new AppCompatTextView(keyboardSuggestionsView.getContext());
                    Context context5 = appCompatTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int iK3 = kli.a.k(context5, 8.0f);
                    appCompatTextView.setId(R$id.keyboardSuggestion_text);
                    appCompatTextView.setPadding(iK3, 0, iK3, 0);
                    appCompatTextView.setTextColor(keyboardSuggestionsView.e);
                    appCompatTextView.setGravity(17);
                    i = 1;
                    appCompatTextView.setLines(1);
                    appCompatTextView.setIncludeFontPadding(true);
                    jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
                    appCompatTextView.setLayoutParams(layoutParams);
                    view2 = appCompatTextView;
                }
                view2.setOnTouchListener(new j01.e(new View[]{view2}));
                view2.setTag(R$id.internal_keyboardSuggestion_style_tag, fVar);
                linearLayout.addView(view2);
                float f6 = f5;
                view = view2;
                f = f6;
            } else {
                list = list3;
                f = 1.0f;
                i = 1;
                view = view3;
            }
            if (view instanceof h8) {
                ((h8) view).setModel(new f8(d8Var3.f209650b, d8Var3.f209651c, fVar, z4));
            } else if (view instanceof AppCompatTextView) {
                TextView textView = (TextView) view;
                ty0.c.b(or0.u.k(keyboardSuggestionsView).b0(), d8Var3.f209650b, textView, null, null, 12);
                or0.u.n(textView, z4);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view;
                if (!z4) {
                    f = 0.4f;
                }
                appCompatTextView2.setAlpha(f);
                appCompatTextView2.setEnabled(z4);
            }
            view.setOnClickListener(new kp0.l(keyboardSuggestionsView, d8Var3, 9));
            i21++;
            i5 = i;
            list3 = list;
            size2 = i33;
        }
        keyboardSuggestionsView.f = false;
        keyboardSuggestionsView.i = cVar2;
        if (linearLayout.getLayoutTransition() == null) {
            linearLayout.setLayoutTransition(new LayoutTransition());
        }
    }

    public final cam.f b(d01.e eVar) {
        if (eVar.a()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new c8(context);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new n(context2);
    }

    @NotNull
    public final List<d8> getItems() {
        return this.f58690h.f58691a;
    }

    public final void setItems(@NotNull List<d8> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setModel(new c(value, 2));
    }

    public final void setModel(@NotNull c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f58690h, model)) {
            return;
        }
        this.f58690h = model;
        if (this.f) {
            return;
        }
        this.f = true;
        this.f58689g.post(new kt0.d(this, 18));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardSuggestionsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public KeyboardSuggestionsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        k8 k8Var;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58686a = b(d01.e.DEFAULT);
        if (((Boolean) jo0.g.v.getValue()).booleanValue()) {
            k8Var = j8.f209781a;
        } else {
            k8Var = i8.f209755a;
        }
        this.f58687b = k8Var;
        this.f58688c = k8Var;
        this.d = v0.a.d("create(...)");
        this.e = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f58689g = new Handler(Looper.getMainLooper());
        this.f58690h = new c((List) null, 3);
        this.i = new c((List) null, 3);
        setOrientation(0);
        setBackgroundResource(kli.a.x(k8Var.a(), context));
        addView(this.f58686a.p(), new LinearLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ KeyboardSuggestionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
