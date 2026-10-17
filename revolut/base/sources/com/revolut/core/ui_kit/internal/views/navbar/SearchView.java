package com.revolut.core.ui_kit.internal.views.navbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j;
import au0.a2;
import au0.l4;
import au0.m4;
import au0.n4;
import au0.o4;
import au0.q4;
import au0.r4;
import au0.s4;
import au0.t1;
import au0.t4;
import au0.u4;
import au0.v4;
import au0.w4;
import aw0.e4;
import aw0.k9;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import e8.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lw0.o;
import or0.k;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rx0.m;
import zhm.d0;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u00014J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\nJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u0007J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010\u001eJ\u0015\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\u001bH\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u001bH\u0001¢\u0006\u0004\b0\u0010.J\u0017\u00102\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u0010\u0007R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010IR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00105\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00105\u001a\u0004\bY\u0010IR$\u0010b\u001a\u0004\u0018\u00010[8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/SearchView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lcom/revolut/core/ui_kit/models/Clause;", "input", "", "setSearchInput", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setSearchInputSilently", "", "(Ljava/lang/String;)V", "", "Landroid/text/InputFilter;", "filters", "setSearchInputFilters", "(Ljava/util/List;)V", "", "getSearchInputFilters", "()[Landroid/text/InputFilter;", "hint", "setHint", "getHints", "()Ljava/util/List;", "hints", "setHints", "clause", "setSearchContentDescription", "", "index", "setSearchInputSelection", "(I)V", "Law0/k9;", "buttons", "setActionButtons", "(Law0/k9;)V", "Law0/e4;", "state", "setFiltersState", "(Law0/e4;)V", "visibility", "setVisibility", "Llw0/o;", "mode", "setMode", "(Llw0/o;)V", "getSelectionStart$ui_kit_components_release", "()I", "getSelectionStart", "getSelectionEnd$ui_kit_components_release", "getSelectionEnd", "setSearchInputKeepingSelection", "Landroid/widget/ImageButton;", "a", "Le8/q;", "getClear", "()Landroid/widget/ImageButton;", "clear", "b", "getBack", "back", "Landroid/view/View;", "c", "getSearchContainer", "()Landroid/view/View;", "searchContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "getRootContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rootContainer", "Landroid/widget/ImageView;", "e", "getLeftActionIcon", "()Landroid/widget/ImageView;", "leftActionIcon", "f", "getRightActionIcon", "rightActionIcon", "Lcom/revolut/core/ui_kit/internal/views/TrackableEditText;", "g", "getSearch", "()Lcom/revolut/core/ui_kit/internal/views/TrackableEditText;", "search", "Landroid/widget/TextSwitcher;", "h", "getHintSwitcher", "()Landroid/widget/TextSwitcher;", "hintSwitcher", "i", "getFilterIcon", "filterIcon", "Landroid/os/Parcelable;", "k", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchView extends FrameLayout implements TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q clear;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q back;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q searchContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q rootContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q leftActionIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q rightActionIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q search;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q hintSwitcher;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q filterIcon;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f57335j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f57336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f57337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f57338n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f57339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f57340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f57341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f57342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f57343t;
    public boolean u;
    public float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f57344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final iv0.d f57345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final KeyListener f57346y;
    public boolean z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.SearchView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(SearchView searchView, boolean z) {
        searchView.getSearchContainer().setActivated(z);
    }

    public static void b(SearchView searchView, boolean z) {
        searchView.getSearchContainer().refreshDrawableState();
        if (z) {
            searchView.getSearch().setKeyListener(searchView.f57346y);
            if (searchView.z) {
                searchView.A = true;
            } else {
                searchView.getSearch().setEllipsize(null);
            }
        } else {
            searchView.getSearch().setKeyListener(null);
            searchView.getSearch().setEllipsize(TextUtils.TruncateAt.END);
        }
        searchView.postDelayed(new n4(searchView, z, 0), 50L);
    }

    private final ImageButton getBack() {
        return (ImageButton) this.back.f();
    }

    private final ImageButton getClear() {
        return (ImageButton) this.clear.f();
    }

    private final ImageView getFilterIcon() {
        return (ImageView) this.filterIcon.f();
    }

    private final TextSwitcher getHintSwitcher() {
        return (TextSwitcher) this.hintSwitcher.f();
    }

    private final ImageView getLeftActionIcon() {
        return (ImageView) this.leftActionIcon.f();
    }

    private final ImageView getRightActionIcon() {
        return (ImageView) this.rightActionIcon.f();
    }

    private final ConstraintLayout getRootContainer() {
        return (ConstraintLayout) this.rootContainer.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackableEditText getSearch() {
        return (TrackableEditText) this.search.f();
    }

    private final View getSearchContainer() {
        return this.searchContainer.f();
    }

    private final void setSearchInputKeepingSelection(Clause input) {
        int selectionStart = getSearch().getSelectionStart();
        int selectionEnd = getSearch().getSelectionEnd();
        Editable text = getSearch().getText();
        boolean z = (text != null ? text.length() : 0) == selectionStart;
        ty0.c.b(u.k(this).b0(), input, getSearch(), null, null, 12);
        Editable text2 = getSearch().getText();
        if (text2 == null) {
            return;
        }
        int length = text2.length();
        if (z) {
            Selection.setSelection(text2, length, length);
        } else if (selectionStart >= 0 || selectionEnd >= 0) {
            Selection.setSelection(text2, Math.max(0, Math.min(selectionStart, length)), Math.max(0, Math.min(selectionEnd, length)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        this.z = true;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev10);
        if (ev10.getAction() == 1 && this.A) {
            this.A = false;
            getSearch().setEllipsize(null);
        }
        this.z = false;
        return zDispatchTouchEvent;
    }

    public final void e(boolean z) {
        this.f57342s = !z;
        getClear().setVisibility(!z ? 0 : 8);
        i();
        q();
    }

    public final void f(ImageView imageView, aw0.c cVar) {
        imageView.setVisibility(!this.f57342s ? 0 : 8);
        yy0.f.e(u.k(imageView).Q(), cVar.f10252b, imageView, null, null, 12);
        or0.m.a(imageView);
        imageView.setOnClickListener(new t1(this, 1, this, cVar));
    }

    public final RectF g(MotionEvent lastMotionEvent) {
        Intrinsics.checkNotNullParameter(lastMotionEvent, "lastMotionEvent");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 30.0f);
        float x3 = (lastMotionEvent.getX() - (iK / 2)) - getLeft();
        float width = iK + x3;
        if (x3 < BitmapDescriptorFactory.HUE_RED) {
            x3 = 0.0f;
        }
        if (width > getWidth()) {
            width = getWidth();
        }
        return new RectF(x3, BitmapDescriptorFactory.HUE_RED, width, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF52814l() {
        return this.analyticsContext;
    }

    @NotNull
    public final List<Clause> getHints() {
        return this.f57345x.f168669c;
    }

    @NotNull
    public final InputFilter[] getSearchInputFilters() {
        InputFilter[] filters = getSearch().getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        return filters;
    }

    public final int getSelectionEnd$ui_kit_components_release() {
        return getSearch().getSelectionEnd();
    }

    public final int getSelectionStart$ui_kit_components_release() {
        return getSearch().getSelectionStart();
    }

    public final void i() {
        getLeftActionIcon().setVisibility(!this.f57342s && this.f57343t ? 0 : 8);
        getRightActionIcon().setVisibility(!this.f57342s && this.u ? 0 : 8);
    }

    public final void j() {
        String string;
        TrackableEditText search = getSearch();
        Editable text = search.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        search.f56469b = string;
        Editable text2 = search.getText();
        if (text2 != null) {
            text2.clear();
        }
    }

    public final AnimatorSet k(boolean z, RectF animationRect, Function0 onStart, Function1 onProgress, Function1 onEnd) {
        ValueAnimator valueAnimatorOfFloat;
        Intrinsics.checkNotNullParameter(animationRect, "animationRect");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        final int i = 1;
        final int i2 = 0;
        if (z) {
            final float f = animationRect.left;
            final float width = getWidth() - animationRect.right;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: au0.p4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SearchView f9313b;

                {
                    this.f9313b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    float f4 = width;
                    float f5 = f;
                    SearchView searchView = this.f9313b;
                    switch (i3) {
                        case 0:
                            SearchView.Companion companion = SearchView.INSTANCE;
                            searchView.p(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue(), f5, f4);
                            searchView.invalidate();
                            searchView.invalidateOutline();
                            break;
                        default:
                            SearchView.Companion companion2 = SearchView.INSTANCE;
                            searchView.p(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue(), f5, f4);
                            searchView.invalidate();
                            searchView.invalidateOutline();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new v4(this, f, width, 1));
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            valueAnimatorOfFloat.setDuration(400L);
        } else {
            final float f4 = animationRect.left;
            final float width2 = getWidth() - animationRect.right;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: au0.p4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SearchView f9313b;

                {
                    this.f9313b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    float f42 = width2;
                    float f5 = f4;
                    SearchView searchView = this.f9313b;
                    switch (i3) {
                        case 0:
                            SearchView.Companion companion = SearchView.INSTANCE;
                            searchView.p(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue(), f5, f42);
                            searchView.invalidate();
                            searchView.invalidateOutline();
                            break;
                        default:
                            SearchView.Companion companion2 = SearchView.INSTANCE;
                            searchView.p(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue(), f5, f42);
                            searchView.invalidate();
                            searchView.invalidateOutline();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new v4(this, f4, width2, 0));
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            valueAnimatorOfFloat.setDuration(400L);
        }
        valueAnimatorOfFloat.addListener(new s4(this, z));
        ValueAnimator valueAnimatorOfFloat2 = z ? ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f) : ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.setDuration(400L);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.addUpdateListener(new o4(i2, onProgress));
        valueAnimatorOfFloat2.addListener(new t4(onStart, onEnd, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    public final ValueAnimator l(boolean z, Function0 onStart, Function1 onProgress, Function1 onEnd) {
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f) : ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new j(this, onProgress, 3));
        valueAnimatorOfFloat.addListener(new u4(this, onStart, z, onEnd));
        return valueAnimatorOfFloat;
    }

    public final boolean m() {
        return getSearch().hasFocus();
    }

    public final void n(boolean z) {
        getHintSwitcher().setVisibility(z ? 0 : 8);
        this.f57345x.a();
    }

    public final void o() {
        getSearch().requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57345x.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        iv0.d dVar = this.f57345x;
        dVar.f = false;
        dVar.f168667a.removeCallbacks(dVar.f168670g);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f57345x.a();
    }

    public final void p(float f, float f4, float f5) {
        float f6 = 1 - f;
        this.v = f4 * f6;
        this.f57344w = f5 * f6;
        setAlpha(f > 0.15f ? 1.0f : f / 0.15f);
    }

    public final void q() {
        String string;
        List list = this.f57345x.f168669c;
        if (this.f57342s) {
            string = null;
        } else if (list.size() == 1) {
            ty0.c cVarB0 = u.k(this).b0();
            Clause clause = (Clause) d0.b0(list);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            string = ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        } else {
            string = "searchBarTextField";
        }
        hx7.b.v(getSearch(), string);
    }

    public final void setActionButtons(@NotNull k9 buttons) {
        boolean z;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        aw0.c cVar = buttons.f10397a;
        aw0.c cVar2 = buttons.f10398b;
        boolean z3 = false;
        if (cVar != null) {
            f(getLeftActionIcon(), buttons.f10397a);
            z = true;
        } else {
            z = false;
        }
        this.f57343t = z;
        if (cVar2 != null) {
            f(getRightActionIcon(), cVar2);
            z3 = true;
        }
        this.u = z3;
        i();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setFiltersState(@NotNull e4 state) {
        Image resourceImage;
        Intrinsics.checkNotNullParameter(state, "state");
        LayeredImage layeredImageB = null;
        if (state == e4.GONE) {
            getFilterIcon().setVisibility(8);
            getFilterIcon().setOnClickListener(null);
            return;
        }
        int i = r4.f9340a[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
            }
            getFilterIcon().setVisibility(0);
            yy0.f.e(u.k(this).Q(), resourceImage, getFilterIcon(), null, null, 12);
            ImageView filterIcon = getFilterIcon();
            or0.m.a(filterIcon);
            filterIcon.setOnClickListener(new w4(this, this, 0));
        }
        layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_filter, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), R$attr.uikit_colorAccentNeutral, 4.0f, null, null, 48);
        resourceImage = layeredImageB;
        getFilterIcon().setVisibility(0);
        yy0.f.e(u.k(this).Q(), resourceImage, getFilterIcon(), null, null, 12);
        ImageView filterIcon2 = getFilterIcon();
        or0.m.a(filterIcon2);
        filterIcon2.setOnClickListener(new w4(this, this, 0));
    }

    public final void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(hint));
    }

    public final void setHints(@NotNull List<? extends Clause> hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.f57345x.b(hints);
        q();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, kotlin.Lazy] */
    public final void setMode(@NotNull o mode) {
        AiBorderDrawableDecorator aiBorderDrawableDecorator;
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = r4.f9341b[mode.ordinal()];
        if (i == 1) {
            Drawable background = getSearchContainer().getBackground();
            AiBorderDrawableDecorator aiBorderDrawableDecorator2 = background instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background : null;
            if (aiBorderDrawableDecorator2 != null) {
                ((ir0.g) aiBorderDrawableDecorator2.f56039m.getValue()).i(false);
            }
            Drawable background2 = getSearchContainer().getBackground();
            aiBorderDrawableDecorator = background2 instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background2 : null;
            if (aiBorderDrawableDecorator != null) {
                aiBorderDrawableDecorator.c();
            }
            setClipToOutline(true);
            setClipChildren(true);
            getRootContainer().setClipToOutline(true);
            getRootContainer().setClipChildren(true);
            return;
        }
        if (i == 2) {
            Drawable background3 = getSearchContainer().getBackground();
            AiBorderDrawableDecorator aiBorderDrawableDecorator3 = background3 instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background3 : null;
            if (aiBorderDrawableDecorator3 != null) {
                ((ir0.g) aiBorderDrawableDecorator3.f56039m.getValue()).i(false);
            }
            setClipToOutline(false);
            setClipChildren(false);
            getRootContainer().setClipToOutline(false);
            getRootContainer().setClipChildren(false);
            Drawable background4 = getSearchContainer().getBackground();
            aiBorderDrawableDecorator = background4 instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background4 : null;
            if (aiBorderDrawableDecorator != null) {
                aiBorderDrawableDecorator.d();
                return;
            }
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        setClipToOutline(false);
        setClipChildren(false);
        getRootContainer().setClipToOutline(false);
        getRootContainer().setClipChildren(false);
        Drawable background5 = getSearchContainer().getBackground();
        AiBorderDrawableDecorator aiBorderDrawableDecorator4 = background5 instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background5 : null;
        if (aiBorderDrawableDecorator4 != null) {
            aiBorderDrawableDecorator4.d();
        }
        Drawable background6 = getSearchContainer().getBackground();
        aiBorderDrawableDecorator = background6 instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background6 : null;
        if (aiBorderDrawableDecorator != null) {
            ((ir0.g) aiBorderDrawableDecorator.f56039m.getValue()).i(true);
        }
    }

    public final void setSearchContentDescription(Clause clause) {
        SpannableStringBuilder spannableStringBuilderA;
        TrackableEditText search = getSearch();
        if (clause != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ty0.c cVarB0 = jh.d.f(context).b0();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilderA = ty0.c.a(cVarB0, clause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            spannableStringBuilderA = null;
        }
        search.setContentDescription(spannableStringBuilderA);
    }

    public final void setSearchInput(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        setSearchInputKeepingSelection(input);
    }

    public final void setSearchInputFilters(@NotNull List<? extends InputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        getSearch().setFilters((InputFilter[]) ue0.e.J(this.f57341r, filters).toArray(new InputFilter[0]));
    }

    public final void setSearchInputSelection(int index) {
        getSearch().setSelection(index);
    }

    public final void setSearchInputSilently(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TrackableEditText search = getSearch();
        a2 a2Var = this.f57340q;
        search.removeTextChangedListener(a2Var);
        setSearchInputKeepingSelection(input);
        Editable text = getSearch().getText();
        boolean z = text == null || text.length() == 0;
        n(z);
        e(z);
        getSearch().addTextChangedListener(a2Var);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        this.f57345x.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHint(new TextClause(hint, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final void setSearchInput(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        setSearchInput(new TextClause(input, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = 0;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.clear = kli.a.J(R$id.searchView_clear, this);
        this.back = kli.a.J(R$id.searchView_back, this);
        this.searchContainer = kli.a.J(R$id.searchView_searchContainer, this);
        this.rootContainer = kli.a.J(R$id.searchView_rootContainer, this);
        this.leftActionIcon = kli.a.J(R$id.searchView_leftButton, this);
        this.rightActionIcon = kli.a.J(R$id.searchView_rightButton, this);
        this.search = kli.a.J(R$id.searchView_search, this);
        this.hintSwitcher = kli.a.J(R$id.searchView_hint, this);
        this.filterIcon = kli.a.J(R$id.searchView_filterIcon, this);
        this.f57335j = kli.a.w(R$attr.uikit_search_input_corner_radius, context);
        this.f57336l = v0.a.d("create(...)");
        this.f57337m = v0.a.d("create(...)");
        this.f57338n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f57339p = v0.a.d("create(...)");
        int i5 = 1;
        a2 a2Var = new a2(this, i5);
        this.f57340q = a2Var;
        m mVar = new m();
        this.f57341r = mVar;
        View.inflate(context, R$layout.internal_view_search_layout, this);
        rr0.j.a(context, getSearchContainer());
        getBack().setContentDescription(context.getString(R$string.uikit_navigate_up_description));
        getBack().setOnTouchListener(new j01.e(new View[]{getBack()}));
        ImageButton back = getBack();
        or0.m.a(back);
        back.setOnClickListener(new w4(this, this, i5));
        getClear().setOnTouchListener(new j01.e(new View[]{getClear()}));
        ImageButton clear = getClear();
        Object obj2 = u.f228038a;
        Intrinsics.checkNotNullParameter(clear, "<this>");
        k kVarJ = u.j(clear);
        kVarJ.c(null);
        kVarJ.a();
        ImageButton clear2 = getClear();
        or0.m.a(clear2);
        clear2.setOnClickListener(new w4(this, this, 2));
        this.f57346y = getSearch().getKeyListener();
        getSearch().addTextChangedListener(a2Var);
        TrackableEditText search = getSearch();
        InputFilter[] filters = search.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        search.setFilters((InputFilter[]) p.y(mVar, filters));
        getSearch().setOnEditorActionListener(new l4(this, 0));
        getSearch().setOnFocusChangeListener(new m4(this, i3));
        setClipToOutline(true);
        setOutlineProvider(new q4(this, 0));
        this.f57345x = new iv0.d(this, getHintSwitcher());
        forceHasOverlappingRendering(false);
        q();
    }
}
