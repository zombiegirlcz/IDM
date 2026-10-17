package yr0;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.view.WindowInsetsCompat;
import au0.c4;
import aw0.a0;
import aw0.b0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit_resources.R$attr;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends PopupWindow {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f316096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f316097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f316098c;
    public final FrameLayout d;
    public final FrameLayout e;
    public WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c4 f316099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppTipView f316100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, a0 popupSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(popupSize, "popupSize");
        this.f316096a = context;
        this.f316097b = popupSize;
        int iK = kli.a.k(context, 5.0f);
        this.f316098c = iK;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        this.f = new WeakReference(null);
        AppTipView appTipView = new AppTipView(context, null, 6, 0);
        this.f316100h = appTipView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        int i = iK * 2;
        frameLayout.setPadding(i, i, i, i);
        appTipView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout2.addView(appTipView);
        frameLayout.addView(frameLayout2);
        setOutsideTouchable(true);
        setContentView(frameLayout);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        float fW = kli.a.w(R$attr.uikit_box_corner_radius, context);
        int iK2 = kli.a.k(context, 4.0f);
        appTipView.setBackground(new RippleDrawable(colorStateListValueOf, shapeDrawable, dr0.b.h(fW, iK2, iK2, iK2, iK2)));
        setBackgroundDrawable(null);
        c8g.a.a(frameLayout, ny0.a.f220589a, new yo7.p(this, 10));
        setWidth(b());
    }

    public final AppTipView a() {
        return this.f316100h;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int b() {
        int i = t.f316094a[this.f316097b.ordinal()];
        if (i == 1) {
            return getWidth();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = this.f316096a;
        Intrinsics.checkNotNullParameter(context, "context");
        int iE = c8g.c.e(context, 720.0f);
        if (!((Boolean) jo0.g.f176833q.getValue()).booleanValue() || c8g.c.H(context) <= iE) {
            return -1;
        }
        return iE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(AppTipUIModel appTipUIModel) {
        Intrinsics.checkNotNullParameter(appTipUIModel, "appTipUIModel");
        AppTipView appTipView = this.f316100h;
        appTipView.setBoundModel(appTipUIModel);
        appTipView.setLabel(appTipUIModel.f57726b);
        appTipView.setTitle(appTipUIModel.f57727c);
        appTipView.setSubtitle(appTipUIModel.d);
        appTipView.setMinSubtitleWidth(170.0f);
        appTipView.setIcon(appTipUIModel.e);
        appTipView.setFooter(appTipUIModel.f57725a, appTipUIModel.f);
    }

    public final void d(View parent, b0 position) {
        float f;
        Window window;
        Intrinsics.checkNotNullParameter(parent, "anchorView");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f = new WeakReference(new p(parent, position));
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        View decorView = (activityI == null || (window = activityI.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        int height = viewGroup.getHeight();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(viewGroup.getRootWindowInsets());
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int i = height - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()).bottom;
        float fH = knm.b.h(parent, viewGroup);
        float height2 = parent.getHeight() + fH;
        float f4 = knm.b.f(parent, viewGroup) + (parent.getWidth() / 2);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(parent, "getContext(...)", 48.0f);
        int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(parent, "getContext(...)", 8.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        FrameLayout frameLayout = this.d;
        frameLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = frameLayout.getMeasuredHeight();
        boolean z = ((float) ((iA2 * 2) + measuredHeight)) <= ((float) i) - height2;
        float f5 = z ? height2 + iA2 : (fH - measuredHeight) - iA2;
        int i2 = t.f316095b[position.ordinal()];
        if (i2 == 1) {
            f = f4 - iA;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = knm.b.f(parent, viewGroup) + ((parent.getWidth() - frameLayout.getMeasuredWidth()) / 2);
        }
        int i3 = R$attr.uikit_box_corner_radius;
        Context context2 = this.f316096a;
        float fW = kli.a.w(i3, context2);
        int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context2);
        int iS2 = kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorPopupShadow, context2);
        ShapeAppearanceModel.Builder builder = ShapeAppearanceModel.builder();
        w wVar = new w(this.f316100h, parent, z);
        if (z) {
            builder.setTopEdge(wVar);
        } else {
            builder.setBottomEdge(wVar);
        }
        builder.setAllCornerSizes(fW);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(builder.build());
        materialShapeDrawable.setShadowCompatibilityMode(2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iS));
        materialShapeDrawable.setElevation(this.f316098c);
        materialShapeDrawable.setShadowColor(iS2);
        this.e.setBackground(materialShapeDrawable);
        int iC = rim.d.c(f);
        int iC2 = rim.d.c(f5);
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.showAtLocation(parent, 51, iC, iC2);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        c4 c4Var = this.f316099g;
        if (c4Var != null) {
            c4Var.cancel();
        }
        this.f.clear();
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.showAtLocation(parent, i, i2, i3);
    }
}
