package com.revolut.core.ui_kit.views.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import aw0.c;
import aw0.e4;
import aw0.k9;
import aw0.o9;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import fp0.p;
import ihm.f;
import java.util.Iterator;
import java.util.List;
import jo0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lw0.n;
import m72.b;
import or0.m;
import or0.u;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import ox0.a0;
import ox0.y;
import ox0.z;
import rr0.j;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b-\u0010\u001cJ\u0017\u00103\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010DR\u001b\u0010K\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010DR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010DR\u001b\u0010V\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010=\u001a\u0004\bU\u0010DR$\u0010^\u001a\u0004\u0018\u00010W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R.\u0010\r\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bd\u0010e\u001a\u0004\ba\u0010b\"\u0004\b\u000f\u0010cR\u0016\u0010i\u001a\u0004\u0018\u00010f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "Landroid/widget/LinearLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/k9;", "buttons", "setActionButtons", "(Law0/k9;)V", "Law0/e4;", "state", "setFiltersState", "(Law0/e4;)V", "", "enabled", "setSortingEnabled", "(Z)V", "", "expandRatio", "setExpandRatio", "(F)V", "clickable", "setClickable", "textColor", "backgroundColor", "setColors$ui_kit_components_release", "(II)V", "setColors", "alpha", "baseColor", "setBackgroundAlpha$ui_kit_components_release", "(FI)V", "setBackgroundAlpha", "setReflectiveOuterBorderEnabled$ui_kit_components_release", "setReflectiveOuterBorderEnabled", "Llw0/n;", "mode", "setMode$ui_kit_components_release", "(Llw0/n;)V", "setMode", "Law0/v1;", "colorScheme", "setReflectiveSurfaceColorScheme", "(Law0/v1;)V", "color", "setReflectiveSurfaceForegroundColor", "(I)V", "Landroid/widget/TextView;", "e", "Le8/q;", "getSearchText", "()Landroid/widget/TextView;", "searchText", "Landroid/widget/ImageView;", "f", "getIconSearch", "()Landroid/widget/ImageView;", "iconSearch", "g", "getLeftActionIcon", "leftActionIcon", "h", "getRightActionIcon", "rightActionIcon", "Landroid/view/View;", "i", "getSearchContainer", "()Landroid/view/View;", "searchContainer", "j", "getFilterIcon", "filterIcon", "k", "getSortingIcon", "sortingIcon", "Landroid/os/Parcelable;", "l", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "", "value", "getText", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getText$annotations", "()V", "Lcom/revolut/core/ui_kit/internal/drawables/RoundedBackgroundDrawable;", "getRoundedBackgroundDrawable", "()Lcom/revolut/core/ui_kit/internal/drawables/RoundedBackgroundDrawable;", "roundedBackgroundDrawable", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchButton extends LinearLayout implements TrackableItem, ur0.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1 f58995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f58996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58997c;
    public final Paint d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q searchText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q iconSearch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q leftActionIcon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q rightActionIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q searchContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q filterIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q sortingIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f59002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f59003n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f59004p;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getFilterIcon() {
        return (ImageView) this.filterIcon.f();
    }

    private final ImageView getIconSearch() {
        return (ImageView) this.iconSearch.f();
    }

    private final ImageView getLeftActionIcon() {
        return (ImageView) this.leftActionIcon.f();
    }

    private final ImageView getRightActionIcon() {
        return (ImageView) this.rightActionIcon.f();
    }

    private final RoundedBackgroundDrawable getRoundedBackgroundDrawable() {
        Drawable background = getSearchContainer().getBackground();
        AiBorderDrawableDecorator aiBorderDrawableDecorator = background instanceof AiBorderDrawableDecorator ? (AiBorderDrawableDecorator) background : null;
        Drawable drawable = aiBorderDrawableDecorator != null ? aiBorderDrawableDecorator.getDrawable() : null;
        if (drawable instanceof RoundedBackgroundDrawable) {
            return (RoundedBackgroundDrawable) drawable;
        }
        return null;
    }

    private final View getSearchContainer() {
        return this.searchContainer.f();
    }

    private final TextView getSearchText() {
        return (TextView) this.searchText.f();
    }

    private final ImageView getSortingIcon() {
        return (ImageView) this.sortingIcon.f();
    }

    @d
    public static /* synthetic */ void getText$annotations() {
    }

    private final void setReflectiveSurfaceColorScheme(v1 colorScheme) {
        Object background = getSearchContainer().getBackground();
        fr0.f fVar = background instanceof fr0.f ? (fr0.f) background : null;
        if (fVar != null) {
            fVar.a(colorScheme);
        }
        invalidate();
    }

    private final void setReflectiveSurfaceForegroundColor(int color) {
        getSearchText().setTextColor(color);
        getIconSearch().setColorFilter(color);
        getLeftActionIcon().setColorFilter(color);
        getRightActionIcon().setColorFilter(color);
        getFilterIcon().setColorFilter(color);
        getSortingIcon().setColorFilter(color);
        invalidate();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF53309j() {
        return this.analyticsContext;
    }

    public final String getText() {
        return getSearchText().getText().toString();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f58996b < 1.0f) {
            float height = getHeight() - (getHeight() * this.f58996b);
            float width = getWidth();
            float height2 = getHeight();
            float f = this.f58997c;
            canvas2 = canvas;
            canvas2.drawRoundRect(BitmapDescriptorFactory.HUE_RED, height, width, height2, f, f, this.d);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f58995a == colorScheme) {
            return;
        }
        this.f58995a = colorScheme;
        if (((Boolean) g.D.getValue()).booleanValue()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(colorScheme.a(), context);
            setReflectiveSurfaceColorScheme(colorScheme);
            setReflectiveSurfaceForegroundColor(iS);
        }
    }

    public final void setActionButtons(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        c cVar = buttons.f10397a;
        c cVar2 = buttons.f10398b;
        if (cVar != null) {
            ImageView leftActionIcon = getLeftActionIcon();
            leftActionIcon.setVisibility(0);
            yy0.f.e(u.k(leftActionIcon).Q(), buttons.f10397a.f10252b, leftActionIcon, null, null, 12);
            m.a(leftActionIcon);
            leftActionIcon.setOnClickListener(new z(this, this, buttons, 0));
        } else {
            getLeftActionIcon().setVisibility(8);
        }
        if (cVar2 == null) {
            getRightActionIcon().setVisibility(8);
            return;
        }
        ImageView rightActionIcon = getRightActionIcon();
        rightActionIcon.setVisibility(0);
        yy0.f.e(u.k(rightActionIcon).Q(), cVar2.f10252b, rightActionIcon, null, null, 12);
        m.a(rightActionIcon);
        rightActionIcon.setOnClickListener(new z(this, this, buttons, 1));
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setBackgroundAlpha$ui_kit_components_release(float alpha, int baseColor) {
        int iD = io0.a.d(alpha, baseColor);
        Paint paint = this.d;
        if (paint.getColor() == iD) {
            return;
        }
        paint.setColor(iD);
        RoundedBackgroundDrawable roundedBackgroundDrawable = getRoundedBackgroundDrawable();
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.e(iD);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        super.setClickable(clickable);
        Iterator it8 = ViewGroupKt.getChildren(this).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setClickable(clickable);
        }
        getLeftActionIcon().setClickable(clickable);
        getRightActionIcon().setClickable(clickable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setColors$ui_kit_components_release(int textColor, int backgroundColor) {
        if (((Boolean) g.D.getValue()).booleanValue()) {
            return;
        }
        if (getRoundedBackgroundDrawable() == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.a(context, getSearchContainer());
        }
        this.d.setColor(backgroundColor);
        RoundedBackgroundDrawable roundedBackgroundDrawable = getRoundedBackgroundDrawable();
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.d(textColor, backgroundColor);
        }
        getSearchText().setTextColor(textColor);
        getIconSearch().setColorFilter(textColor);
        invalidate();
    }

    public final void setExpandRatio(float expandRatio) {
        this.f58996b = expandRatio;
        if (expandRatio < 1.0f) {
            if (getSearchContainer().getBackgroundTintList() == null) {
                getSearchContainer().setBackgroundTintList(ColorStateList.valueOf(0));
            }
        } else if (getSearchContainer().getBackgroundTintList() != null) {
            getSearchContainer().setBackgroundTintList(null);
        }
        float fA = b.a(getHeight(), expandRatio, getHeight(), 2.0f);
        getSearchText().setTranslationY(fA);
        getIconSearch().setTranslationY(fA);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = expandRatio > 0.5f ? (expandRatio - 0.5f) / 0.5f : 0.0f;
        getSearchText().setAlpha(f4);
        getIconSearch().setAlpha(f4);
        float f5 = expandRatio > 0.5f ? 0.8f + (((expandRatio - 0.5f) * 0.19999999f) / 0.5f) : 0.8f;
        getSearchText().setPivotX(BitmapDescriptorFactory.HUE_RED);
        getSearchText().setPivotY((getSearchText().getHeight() / 2) * f5);
        getSearchText().setScaleX(f5);
        getSearchText().setScaleY(f5);
        getIconSearch().setScaleX(f5);
        getIconSearch().setScaleY(f5);
        if (expandRatio > 0.1f) {
            f = (expandRatio - 0.1f) / 0.9f;
        }
        setAlpha(f);
        invalidate();
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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.uikit_search_button_filters_content_description, null, null, 14);
        int i = y.f230519a[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, textLocalisedClause, LDSFile.EF_DG4_TAG);
            }
            getFilterIcon().setVisibility(0);
            yy0.f.e(u.k(this).Q(), resourceImage, getFilterIcon(), null, null, 12);
            ImageView filterIcon = getFilterIcon();
            m.a(filterIcon);
            filterIcon.setOnClickListener(new a0(this, this, 0));
        }
        layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_filter, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), R$attr.uikit_colorAccentNeutral, 4.0f, null, textLocalisedClause, 16);
        resourceImage = layeredImageB;
        getFilterIcon().setVisibility(0);
        yy0.f.e(u.k(this).Q(), resourceImage, getFilterIcon(), null, null, 12);
        ImageView filterIcon2 = getFilterIcon();
        m.a(filterIcon2);
        filterIcon2.setOnClickListener(new a0(this, this, 0));
    }

    public final void setMode$ui_kit_components_release(@NotNull n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getIconSearch().setImageResource(mode.a());
        int i = y.f230520b[mode.ordinal()];
        if (i == 1) {
            Drawable background = getSearchContainer().getBackground();
            Intrinsics.i(background, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator");
            ((AiBorderDrawableDecorator) background).c();
            invalidate();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable background2 = getSearchContainer().getBackground();
        Intrinsics.i(background2, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator");
        ((AiBorderDrawableDecorator) background2).d();
    }

    public final void setReflectiveOuterBorderEnabled$ui_kit_components_release(boolean enabled) {
        RoundedBackgroundDrawable roundedBackgroundDrawable = getRoundedBackgroundDrawable();
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.q(enabled);
        }
    }

    public final void setSortingEnabled(boolean enabled) {
        getSortingIcon().setVisibility(enabled ? 0 : 8);
        if (!enabled) {
            getSortingIcon().setOnClickListener(null);
            return;
        }
        ImageView sortingIcon = getSortingIcon();
        m.a(sortingIcon);
        sortingIcon.setOnClickListener(new a0(this, this, 1));
    }

    public final void setText(Clause text) {
        ty0.c.b(u.k(this).b0(), text, getSearchText(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setText(String str) {
        ty0.c.b(u.k(this).b0(), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, getSearchText(), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, kotlin.Lazy] */
    public SearchButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58996b = 1.0f;
        this.f58997c = kli.a.w(R$attr.uikit_search_input_corner_radius, context);
        this.searchText = kli.a.J(R$id.searchButton_searchText, this);
        this.iconSearch = kli.a.J(R$id.searchButton_iconSearch, this);
        this.leftActionIcon = kli.a.J(R$id.searchButton_leftButton, this);
        this.rightActionIcon = kli.a.J(R$id.searchButton_rightButton, this);
        this.searchContainer = kli.a.J(R$id.searchButton_searchContainer, this);
        this.filterIcon = kli.a.J(R$id.searchButton_filterIcon, this);
        this.sortingIcon = kli.a.J(R$id.searchButton_sortingIcon, this);
        this.f59002m = v0.a.d("create(...)");
        this.f59003n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f59004p = v0.a.d("create(...)");
        setBaselineAligned(false);
        setOrientation(0);
        View.inflate(context, R$layout.internal_view_search_button, this);
        setClickable(true);
        j.a(context, getSearchContainer());
        fp0.m mVar = p.Companion;
        View searchContainer = getSearchContainer();
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = fp0.m.a(searchContainer, gVar);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        m.a(view);
        view.setOnClickListener(new a0(this, this, 2));
        setExpandRatio(1.0f);
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        if (((Boolean) g.D.getValue()).booleanValue()) {
            paint.setColor(io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorElevatedPopoverBackground, context)));
        } else {
            paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone8, context));
        }
        setMode$ui_kit_components_release(n.REGULAR_SEARCH);
    }

    public /* synthetic */ SearchButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
