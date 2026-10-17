package com.revolut.core.ui_kit.views.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import au0.p2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$bool;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.m;
import fp0.p;
import gp0.g;
import ihm.f;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.a;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/GooglePayButton;", "Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "n", "Lkotlin/Lazy;", "getShadowEnabled", "()Z", "shadowEnabled", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayButton extends ShadowLayout implements w0 {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f58992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f58993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f58994n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getShadowEnabled() {
        return ((Boolean) this.f58994n.getValue()).booleanValue();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58992l.a(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58992l = new c2(this);
        this.f58993m = a.d("create(...)");
        m mVar = p.Companion;
        g gVar = new g(0);
        mVar.getClass();
        p pVarA = m.a(this, gVar);
        this.f58994n = j.c(k.NONE, new lu0.a(context, 17));
        if (context.getResources().getBoolean(R$bool.google_pay_button_background_light_enabled)) {
            i2 = R$drawable.internal_google_pay_button_background_light;
        } else {
            i2 = R$drawable.internal_google_pay_button_background_dark;
        }
        View.inflate(context, R$layout.internal_google_pay_button, this);
        setBackgroundResource(i2);
        int iK = kli.a.k(context, 14.0f);
        int iK2 = kli.a.k(context, 20.0f);
        setPadding(iK2, iK, iK2, iK);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 9));
        setShadowColor(new Color.Solid(R$attr.uikit_colorBlack));
        setShadowElevation((getShadowEnabled() && isEnabled()) ? 4.0f : BitmapDescriptorFactory.HUE_RED);
        setCornersRadius(kli.a.v(R$attr.uikit_large_button_corner_radius, context));
    }

    public /* synthetic */ GooglePayButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
