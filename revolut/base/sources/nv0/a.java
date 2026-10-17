package nv0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$style;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends View {

    @NotNull
    private static final C1220a Companion = new C1220a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f219338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f219339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219340c;
    public final int d;
    public final int e;
    public final GradientDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f219341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f219342h;

    /* JADX INFO: renamed from: nv0.a$a, reason: collision with other inner class name */
    public static final class C1220a {
        private C1220a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f219341g < BitmapDescriptorFactory.HUE_RED) {
            super.draw(canvas);
            return;
        }
        Path path = this.f219338a;
        path.reset();
        float f = -this.f219342h;
        float f4 = this.f219341g;
        float width = this.f219342h + getWidth();
        float height = getHeight();
        float f5 = this.f219339b;
        path.addRoundRect(f, f4, width, height, f5, f5, Path.Direction.CW);
        int iSave = canvas.save();
        canvas.clipOutPath(path);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void setModel(@NotNull c model) {
        int i;
        Intrinsics.checkNotNullParameter(model, "model");
        i iVar = model.f219346b;
        if (iVar.equals(h.f219352a)) {
            i = this.e;
        } else if (iVar.equals(f.f219350a)) {
            i = this.d;
        } else {
            if (!iVar.equals(g.f219351a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.f219340c;
        }
        this.f.setColor(i);
        float f = model.f219345a;
        if (this.f219341g == f && this.f219342h == 16.0f) {
            return;
        }
        this.f219341g = f;
        this.f219342h = 16.0f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f219338a = new Path();
        float fV = kli.a.v(R$attr.uikit_box_corner_radius, context);
        this.f219339b = fV;
        int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
        this.f219340c = iS;
        this.d = kli.a.s(R$attr.uikit_colorPopoverBackground, new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Night));
        this.e = kli.a.s(R$attr.uikit_colorPopoverBackground, new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Day));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fV);
        gradientDrawable.setColor(iS);
        this.f = gradientDrawable;
        this.f219341g = -1.0f;
        setBackground(gradientDrawable);
        setForeground(b.a(fV, kli.a.l(context, 1.0f)));
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
