package com.revolut.camerakit.ui.views.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.c;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.models.R$integer;
import com.revolut.camerakit.ui.models.R$layout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rz.b;
import rz.f;
import rz.l;
import rz.q;
import rz.r;
import rz.s;
import rz.t;
import ur2.a;
import uz.e;
import uz.j;
import vkm.j2;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020&¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u001f¨\u0006."}, d2 = {"Lcom/revolut/camerakit/ui/views/view/CameraKitView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "invertedColors", "", "setInvertedColors", "(Z)V", "activated", "setMaskBorderActivated", "", "margin", "setMaskHintMargin", "(F)V", "Lcom/revolut/camerakit/ui/models/Mask;", "mask", "setMask", "(Lcom/revolut/camerakit/ui/models/Mask;)V", "Lrz/b;", "face", "setDetectedFace", "(Lrz/b;)V", "backgroundColorRes", "setBackground", "(I)V", "Lrz/f;", "hintModel", "Lrz/l;", "variant", "setHint", "(Lrz/f;Lrz/l;)V", "Lrz/t;", "shutterButtonState", "setShutterButtonState", "(Lrz/t;)V", "getShutterButtonState", "()Lrz/t;", "contentDescription", "setShutterButtonContentDescription", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitView extends ConstraintLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50859b;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaskHintView f50860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f50861h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f50862j;
    public final CameraKitPreviewView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TrackingFaceMaskView f50863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f50864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Guideline f50865n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final t getShutterButtonState() {
        View view = this.f50862j;
        return (view.isActivated() && view.getVisibility() == 0) ? s.f258456a : view.getVisibility() == 0 ? new q(view.isEnabled()) : r.f258455a;
    }

    public final void setBackground(int backgroundColorRes) {
        int color = ContextCompat.getColor(getContext(), backgroundColorRes);
        this.f50861h.setBackgroundColor(color);
        this.i.setBackgroundColor(color);
        this.f50860g.setBackground(color);
    }

    public final void setDetectedFace(b face) {
        this.f50863l.setFace(face);
        j jVar = new j(face, this.k.getF50856a());
        j2 j2Var = this.f;
        j2Var.getClass();
        j2Var.g(null, jVar);
    }

    public final void setHint(f hintModel, @NotNull l variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f50860g.setHint(hintModel, variant, this.f50859b);
    }

    public final void setInvertedColors(boolean invertedColors) {
        this.f50859b = invertedColors;
        View view = this.f50861h;
        View view2 = this.i;
        MaskHintView maskHintView = this.f50860g;
        View view3 = this.f50862j;
        if (invertedColors) {
            view3.getBackground().setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -255.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, -255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED})));
            maskHintView.setInvertedColors(true);
            view2.setBackground(new ColorDrawable(-1));
            view.setBackground(new ColorDrawable(-1));
            return;
        }
        view3.getBackground().clearColorFilter();
        maskHintView.setInvertedColors(false);
        view2.setBackground(null);
        view.setBackground(null);
    }

    public final void setMask(@NotNull Mask mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Float f = mask instanceof Mask.Document ? ((Mask.Document) mask).e.d : mask instanceof Mask.DocumentZebra ? ((Mask.DocumentZebra) mask).e.d : null;
        this.f50865n.setGuidelinePercent(f != null ? f.floatValue() : ResourcesCompat.getFloat(getResources(), R$integer.cameraKitUi_topMarginGuideline_percent));
        this.f50863l.setVisibility(mask.getF() ? 0 : 8);
        this.f50860g.setMask(mask);
        j2 j2Var = this.f;
        j2Var.g(null, new j(((j) j2Var.getValue()).f284526a, this.k.getF50856a()));
    }

    public final void setMaskBorderActivated(boolean activated) {
        MaskHintView maskHintView = this.f50860g;
        maskHintView.setMaskBorderActivated(activated);
        this.f50863l.setMaskBorderActivated(activated, maskHintView.getAbsoluteMaskLocation());
    }

    public final void setMaskHintMargin(float margin) {
        MaskHintView maskHintView = this.f50860g;
        ViewGroup.LayoutParams layoutParams = maskHintView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        marginLayoutParams.topMargin = (int) jb3.l.g(context, margin);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        marginLayoutParams.bottomMargin = (int) jb3.l.g(context2, margin);
        maskHintView.setLayoutParams(marginLayoutParams);
    }

    public final void setShutterButtonContentDescription(int contentDescription) {
        this.f50862j.setContentDescription(getContext().getString(contentDescription));
    }

    public final void setShutterButtonState(@NotNull t shutterButtonState) {
        Intrinsics.checkNotNullParameter(shutterButtonState, "shutterButtonState");
        boolean z = shutterButtonState instanceof q;
        View view = this.f50862j;
        if (z) {
            view.setActivated(false);
            view.setVisibility(0);
            view.setEnabled(((q) shutterButtonState).f258454a);
        } else if (shutterButtonState instanceof r) {
            view.setVisibility(4);
        } else {
            if (!(shutterButtonState instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            view.setActivated(true);
            view.setVisibility(0);
            view.setEnabled(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        j2 j2VarC = vkm.q.c(new j(null, null));
        this.f = j2VarC;
        sz.b bVar = new sz.b(context, 0);
        setClipChildren(false);
        setClipToPadding(false);
        View.inflate(context, R$layout.camera_kit_view, this);
        View viewFindViewById = findViewById(R$id.cameraKitUi_maskHintView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        MaskHintView maskHintView = (MaskHintView) viewFindViewById;
        this.f50860g = maskHintView;
        View viewFindViewById2 = findViewById(R$id.cameraKitUi_bottomOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50861h = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.cameraKitUi_topOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.cameraKitUi_shutterBtnView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50862j = viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.cameraKitUi_previewView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (CameraKitPreviewView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.cameraKitUi_faceMaskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TrackingFaceMaskView trackingFaceMaskView = (TrackingFaceMaskView) viewFindViewById6;
        this.f50863l = trackingFaceMaskView;
        View viewFindViewById7 = findViewById(R$id.cameraKitUi_previewStubImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50864m = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.cameraKitUi_topMarginGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f50865n = (Guideline) viewFindViewById8;
        ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById4, new c(viewFindViewById4, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0, 5));
        trackingFaceMaskView.setModelsSource$camera_kit_ui_views_release(bVar);
        maskHintView.setModelsSource$camera_kit_ui_views_release(bVar);
        maskHintView.setMaskViewDelegateFactory$camera_kit_ui_views_release(new e(j2VarC));
        a action = new a(this, 8);
        Intrinsics.checkNotNullParameter(action, "action");
        addOnLayoutChangeListener(new androidx.camera.viewfinder.a(action, 25));
    }

    public /* synthetic */ CameraKitView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
