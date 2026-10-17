package com.revolut.core.ui_kit.internal.views.box;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_resources.R$attr;
import iv0.s;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013R,\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00148\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00148\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "Lcom/revolut/core/ui_kit/views/ProgressSwitcher;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setAutoClipOutline", "(Z)V", "Lcom/revolut/core/ui/models/Color;", "Lcom/revolut/core/ui/models/UIKitColor;", "newShadowColor", "setShadowColor", "(Lcom/revolut/core/ui/models/Color;)V", "", "value", "j", "F", "getShadowElevation", "()F", "setShadowElevation", "(F)V", "shadowElevation", "k", "getCornersRadius", "setCornersRadius", "cornersRadius", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ShadowLayout extends ProgressSwitcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Color f56560h;
    public s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float cornersRadius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float getCornersRadius() {
        return this.cornersRadius;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final void setAutoClipOutline(boolean enabled) {
        if (getClipToOutline() == enabled) {
            return;
        }
        setClipToOutline(enabled);
    }

    public final void setCornersRadius(float f) {
        if (this.cornersRadius == f) {
            return;
        }
        this.cornersRadius = f;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            setOutlineProvider(null);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = a.k(context, this.cornersRadius);
        s sVar = this.i;
        if (sVar == null) {
            sVar = new s(iK, false);
            this.i = sVar;
        }
        sVar.f168696a = iK;
        setOutlineProvider(sVar);
        invalidateOutline();
    }

    public final void setShadowColor(@NotNull Color newShadowColor) {
        Intrinsics.checkNotNullParameter(newShadowColor, "newShadowColor");
        if (Intrinsics.f(this.f56560h, newShadowColor)) {
            return;
        }
        this.f56560h = newShadowColor;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iC = io0.a.c(context, newShadowColor);
        setOutlineAmbientShadowColor(iC);
        setOutlineSpotShadowColor(iC);
    }

    public final void setShadowElevation(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.shadowElevation = f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setElevation(this.f56559g ? a.k(r2, this.shadowElevation) : BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setShadowColor(new Color.Solid(R$attr.uikit_colorGreyTone50));
        setClipToOutline(true);
        this.f56559g = true;
    }

    public /* synthetic */ ShadowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
