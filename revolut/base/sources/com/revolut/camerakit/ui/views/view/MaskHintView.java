package com.revolut.camerakit.ui.views.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.camerakit.ui.models.Mask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny0.i;
import org.jetbrains.annotations.NotNull;
import rz.g;
import rz.l;
import rz.u;
import sz.a;
import uu9.b;
import uz.c;
import uz.d;
import uz.e;
import uz.f;
import uz.g0;
import uz.h0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%R.\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010'\u001a\u00020/8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/MaskHintView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "invertedColors", "", "setInvertedColors", "(Z)V", "activated", "setMaskBorderActivated", "Lcom/revolut/camerakit/ui/models/Mask;", "mask", "setMask", "(Lcom/revolut/camerakit/ui/models/Mask;)V", "backgroundColor", "setBackground", "(I)V", "Lrz/f;", "hintModel", "Lrz/l;", "variant", "setHint", "(Lrz/f;Lrz/l;Z)V", "Lrz/u;", "getAbsoluteMaskLocation", "()Lrz/u;", "enabled", "setZebraCaptureBackgroundCleared", "setHintViewsVisibility", "getHintContainerHeightForMask", "()I", "Lsz/a;", "value", "m", "Lsz/a;", "getModelsSource$camera_kit_ui_views_release", "()Lsz/a;", "setModelsSource$camera_kit_ui_views_release", "(Lsz/a;)V", "modelsSource", "Luz/e;", "getMaskViewDelegateFactory$camera_kit_ui_views_release", "()Luz/e;", "setMaskViewDelegateFactory$camera_kit_ui_views_release", "(Luz/e;)V", "maskViewDelegateFactory", "uz/g0", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MaskHintView extends ViewGroup {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f50866n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f50867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f50868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraKitHintView f50869c;
    public final f d;
    public l e;
    public Mask f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f50871h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50872j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g0 f50873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public a modelsSource;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskHintView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void d(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.topMargin;
        int i3 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i);
        marginLayoutParams.bottomMargin = i3;
        view.setLayoutParams(marginLayoutParams);
    }

    private final int getHintContainerHeightForMask() {
        int measuredHeight = this.f50868b.getMeasuredHeight();
        Mask mask = this.f;
        if (!(mask instanceof Mask.FaceZebra) && !(mask instanceof Mask.DocumentZebra)) {
            return measuredHeight;
        }
        CameraKitHintView cameraKitHintView = this.f50869c;
        int minimumHeight = cameraKitHintView.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams = cameraKitHintView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = minimumHeight + (marginLayoutParams == null ? 0 : marginLayoutParams.bottomMargin + marginLayoutParams.topMargin);
        return measuredHeight < i ? i : measuredHeight;
    }

    private final void setHintViewsVisibility(Mask mask) {
        boolean z = (mask instanceof Mask.FaceZebra) || (mask instanceof Mask.DocumentZebra);
        this.f50869c.setVisibility(z ? 8 : 4);
        this.d.setVisibility(z ? 4 : 8);
    }

    private final void setZebraCaptureBackgroundCleared(boolean enabled) {
        if (this.f50870g == enabled) {
            return;
        }
        this.f50870g = enabled;
        FrameLayout frameLayout = this.f50868b;
        if (enabled) {
            this.f50871h = frameLayout.getBackground();
            frameLayout.setBackground(null);
        } else {
            frameLayout.setBackground(this.f50871h);
            this.f50871h = null;
        }
    }

    public final void a() {
        int iG;
        int i = h0.f284523a[this.f50873l.ordinal()];
        if (i == 1) {
            iG = 0;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float f = i.c(context) ? 48.0f : 120.0f;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iG = (int) jb3.l.g(context2, f);
        }
        this.f50869c.setMinimumHeight(iG);
    }

    public final void b(long j2) {
        Mask mask = this.f;
        setZebraCaptureBackgroundCleared((mask instanceof Mask.FaceZebra) || (mask instanceof Mask.DocumentZebra));
        c cVar = this.f50867a.f284502c;
        if (cVar != null) {
            cVar.m(j2);
        }
    }

    public final void c() {
        c cVar = this.f50867a.f284502c;
        if (cVar != null) {
            cVar.o();
        }
        setZebraCaptureBackgroundCleared(false);
    }

    public final u getAbsoluteMaskLocation() {
        return this.f50867a.getAbsoluteMaskLocation();
    }

    @NotNull
    public final e getMaskViewDelegateFactory$camera_kit_ui_views_release() {
        return this.f50867a.getMaskViewDelegateFactory$camera_kit_ui_views_release();
    }

    /* JADX INFO: renamed from: getModelsSource$camera_kit_ui_views_release, reason: from getter */
    public final a getModelsSource() {
        return this.modelsSource;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        d dVar = this.f50867a;
        dVar.layout(0, 0, dVar.getMeasuredWidth(), dVar.getMeasuredHeight());
        int measuredHeight = dVar.getMeasuredHeight();
        FrameLayout frameLayout = this.f50868b;
        if (frameLayout.getVisibility() == 8) {
            return;
        }
        int i6 = h0.f284523a[this.f50873l.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            frameLayout.layout(0, measuredHeight, frameLayout.getMeasuredWidth(), getMeasuredHeight());
        } else {
            int measuredHeight2 = getMeasuredHeight() - frameLayout.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            frameLayout.layout(0, measuredHeight2 - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), frameLayout.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FrameLayout frameLayout = this.f50868b;
        if (frameLayout.getVisibility() != 8) {
            measureChild(frameLayout, i, i2);
        }
        int hintContainerHeightForMask = getHintContainerHeightForMask();
        int visibility = frameLayout.getVisibility();
        d dVar = this.f50867a;
        if (visibility != 8 && hintContainerHeightForMask > 0) {
            dVar.measure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - hintContainerHeightForMask, Integer.MIN_VALUE));
        } else {
            measureChild(dVar, i, i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void setBackground(int backgroundColor) {
        if (this.f50870g) {
            this.f50871h = new ColorDrawable(backgroundColor);
        } else {
            this.f50868b.setBackgroundColor(backgroundColor);
        }
    }

    public final void setHint(rz.f hintModel, @NotNull l variant, boolean invertedColors) {
        int i;
        Intrinsics.checkNotNullParameter(variant, "variant");
        f fVar = this.d;
        fVar.h0(invertedColors);
        FrameLayout frameLayout = this.f50868b;
        if (hintModel == null) {
            frameLayout.setVisibility(4);
            return;
        }
        boolean z = false;
        if (hintModel.f258444a == null) {
            frameLayout.setVisibility(0);
            return;
        }
        Mask mask = this.f;
        g gVar = mask != null ? ((mask instanceof Mask.FaceZebra) || (mask instanceof Mask.DocumentZebra)) ? g.ZEBRA : g.DEFAULT : null;
        g gVar2 = g.ZEBRA;
        CameraKitHintView cameraKitHintView = this.f50869c;
        View view = (gVar != gVar2 || hintModel.d == null) ? cameraKitHintView : fVar;
        if (Intrinsics.f(view, fVar)) {
            cameraKitHintView.setVisibility(8);
            fVar.setVisibility(0);
            fVar.setHint(hintModel);
        } else {
            fVar.setVisibility(8);
            cameraKitHintView.setVisibility(0);
            cameraKitHintView.setHint(hintModel);
        }
        frameLayout.setVisibility(view.getVisibility());
        if (variant != this.e) {
            this.e = variant;
            int[] iArr = h0.f284524b;
            int i2 = iArr[variant.ordinal()];
            int i3 = this.i;
            if (i2 == 1) {
                i = this.f50872j;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i3;
            }
            int i5 = iArr[variant.ordinal()];
            if (i5 == 1) {
                i3 = this.k;
            } else if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d(i, cameraKitHintView);
            d(i3, fVar);
        }
        if (variant == l.Footer && invertedColors) {
            z = true;
        }
        cameraKitHintView.f50854b.setTextColor(z ? -16777216 : -1);
    }

    public final void setInvertedColors(boolean invertedColors) {
        this.f50867a.setInvertedColors(invertedColors);
        this.d.h0(invertedColors);
        ColorDrawable colorDrawable = invertedColors ? new ColorDrawable(-1) : null;
        if (this.f50870g) {
            this.f50871h = colorDrawable;
        } else {
            this.f50868b.setBackground(colorDrawable);
        }
        l lVar = this.e;
        int i = lVar == null ? -1 : h0.f284524b[lVar.ordinal()];
        if (i != -1) {
            CameraKitHintView cameraKitHintView = this.f50869c;
            if (i == 1) {
                cameraKitHintView.f50854b.setTextColor(-1);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraKitHintView.f50854b.setTextColor(invertedColors ? -16777216 : -1);
            }
        }
    }

    public final void setMask(@NotNull Mask mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f = mask;
        setHintViewsVisibility(mask);
        setZebraCaptureBackgroundCleared(false);
        this.f50867a.setMask(mask);
        g0 g0Var = this.f50873l;
        g0 g0Var2 = mask instanceof Mask.ActiveLiveness ? g0.PIN_TO_BOTTOM : g0.PIN_TO_MASK;
        this.f50873l = g0Var2;
        if (g0Var != g0Var2) {
            a();
        }
    }

    public final void setMaskBorderActivated(boolean activated) {
        this.f50867a.setBorderActivated(activated);
    }

    public final void setMaskViewDelegateFactory$camera_kit_ui_views_release(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f50867a.setMaskViewDelegateFactory$camera_kit_ui_views_release(value);
    }

    public final void setModelsSource$camera_kit_ui_views_release(a aVar) {
        this.modelsSource = aVar;
        this.f50867a.setModelsSource$camera_kit_ui_views_release(aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskHintView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskHintView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iG = (int) jb3.l.g(context, 16.0f);
        this.i = iG;
        this.f50872j = (int) jb3.l.g(context, 52.0f);
        this.k = iG;
        this.f50873l = g0.PIN_TO_MASK;
        setClipChildren(false);
        setClipToPadding(false);
        d dVar = new d(context, attributeSet);
        this.f50867a = dVar;
        dVar.setModelsSource$camera_kit_ui_views_release(this.modelsSource);
        addView(dVar);
        CameraKitHintView cameraKitHintView = new CameraKitHintView(context, attributeSet, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iG;
        layoutParams.bottomMargin = iG;
        cameraKitHintView.setLayoutParams(layoutParams);
        this.f50869c = cameraKitHintView;
        f fVar = new f(context, attributeSet, i);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = iG;
        layoutParams2.bottomMargin = iG;
        fVar.setLayoutParams(layoutParams2);
        fVar.setVisibility(8);
        this.d = fVar;
        a();
        FrameLayout frameLayout = new FrameLayout(context, attributeSet, i);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(cameraKitHintView);
        frameLayout.addView(fVar);
        this.f50868b = frameLayout;
        addView(frameLayout);
        c8g.a.a(this, ny0.a.f220589a, new b(this, 16));
    }

    public /* synthetic */ MaskHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
