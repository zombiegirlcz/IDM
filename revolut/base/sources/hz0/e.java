package hz0;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.KeypadView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ihm.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.o8;
import mx0.r8;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yy0.h;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements c01.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f156938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156940c;
    public boolean d;
    public final f e;
    public c01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f156941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public KeypadView f156942h;

    public e(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f156938a = window;
        this.e = v0.a.d("create(...)");
        this.f156941g = w.y0(new a(this, 2));
    }

    public final void a() {
        d(false);
    }

    public final f b() {
        return this.e;
    }

    public final void c(c01.a aVar) {
        this.f = aVar;
        KeypadView keypadView = this.f156942h;
        if (keypadView != null) {
            f(keypadView);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f156941g.getValue();
        if (viewGroup != null) {
            if (z || this.f156942h != null) {
                KeypadView keypadView = this.f156942h;
                Window window = this.f156938a;
                if (keypadView == null) {
                    Context context = window.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    keypadView = new KeypadView(context, null, 6, i);
                    keypadView.setEndActionImage(new h(new TextLocalisedClause(R$string.uikit_keypad_delete_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_backspace, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                    keypadView.setupStyle(r8.VOLUMETRIC);
                    keypadView.setOnNumberClickListener(new hw9.a(this, 13));
                    keypadView.setOnEndActionClickListener(new a(this, 0));
                    keypadView.setOnStartActionClickListener(new a(this, 1));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    Context context2 = window.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    layoutParams.bottomMargin = kli.a.k(context2, 8.0f);
                    keypadView.setLayoutParams(layoutParams);
                    f(keypadView);
                    keypadView.setVisibility(8);
                    u.b(keypadView, true, new b(this, keypadView));
                    c8g.a.a(keypadView, ny0.a.f220589a, new b(keypadView, this));
                    this.f156942h = keypadView;
                }
                if ((window.getAttributes().softInputMode & 15) != 3) {
                    throw new IllegalStateException("Screen using secure keyboard must have windowSoftInputMode=\"adjustResize|stateAlwaysHidden\" in manifest");
                }
                i = z ? 0 : 8;
                if (i == keypadView.getVisibility()) {
                    return;
                }
                keypadView.setVisibility(i);
                if (i != 0) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = this.f156939b;
                    viewGroup.requestLayout();
                    return;
                }
                f(keypadView);
                ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                this.f156939b = ((FrameLayout.LayoutParams) layoutParams3).bottomMargin;
                g();
                if (keypadView.getParent() != null) {
                    return;
                }
                View decorView = window.getDecorView();
                Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                View viewFindViewById = ((ViewGroup) decorView).findViewById(R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
                viewGroup2.addView(keypadView);
                viewGroup2.requestLayout();
                viewGroup2.bringChildToFront(keypadView);
            }
        }
    }

    public final void e() {
        d(true);
    }

    public final void f(KeypadView keypadView) {
        h hVar;
        c01.a aVar = this.f;
        int i = aVar == null ? -1 : d.f156937a[aVar.ordinal()];
        h hVar2 = null;
        if (i == 1) {
            hVar = new h(new TextLocalisedClause(R$string.uikit_keypad_next_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_tab_key, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        } else {
            if (i != 2) {
                if (i == 3) {
                    hVar = new h(new TextLocalisedClause(R$string.uikit_keypad_hide_accessibility_label, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_chevron_down, R$attr.uikit_colorForeground, R$attr.uikit_colorPopoverBackground));
                }
                keypadView.setStartActionImage(hVar2);
            }
            hVar = new h(new TextLocalisedClause(R$string.uikit_keypad_done_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
        hVar2 = hVar;
        keypadView.setStartActionImage(hVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        KeypadView keypadView;
        ViewGroup viewGroup = (ViewGroup) this.f156941g.getValue();
        if (viewGroup == null || (keypadView = this.f156942h) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.d) {
            layoutParams2.bottomMargin = this.f156939b;
        } else {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            r8 r8Var = keypadView.z;
            Context context2 = keypadView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            r8Var.getClass();
            Intrinsics.checkNotNullParameter(context2, "context");
            o8 o8VarA = r8Var.a(context2);
            layoutParams2.bottomMargin = this.f156939b + kli.a.k(context, (o8VarA.d * 3) + (o8VarA.f209889b * 4) + 8.0f) + this.f156940c;
        }
        viewGroup.requestLayout();
    }
}
