package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.k1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import efm.r;
import ix0.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import or0.u;
import org.jetbrains.annotations.NotNull;
import tpl.o;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R\u001b\u0010\f\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u00105R\u001b\u0010;\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u00105¨\u0006<"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ChartHeaderView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/k1;", "chartHeader", "", "clicksEnabled", "setChartHeader", "(Law0/k1;Z)V", "enabled", "setFloatingStyleEnabled", "(Z)V", "centerX", "setFloatingPosition", "(I)V", "Landroid/os/Parcelable;", "a", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Landroid/widget/ImageView;", "f", "Le8/q;", "getEndImage", "()Landroid/widget/ImageView;", "endImage", "g", "getEndImageSecondary", "endImageSecondary", "Landroidx/constraintlayout/widget/ConstraintLayout;", "h", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroid/widget/TextView;", "i", "getSectionTitle", "()Landroid/widget/TextView;", "sectionTitle", "j", "getTitle", "k", "getSubtitle", "subtitle", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartHeaderView extends FrameLayout implements TrackableItem {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f56607l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f56609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f56610c;
    public final ihm.f d;
    public final ihm.f e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q endImage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q endImageSecondary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q container;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q sectionTitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q subtitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ConstraintLayout getContainer() {
        return (ConstraintLayout) this.container.f();
    }

    private final ImageView getEndImage() {
        return (ImageView) this.endImage.f();
    }

    private final ImageView getEndImageSecondary() {
        return (ImageView) this.endImageSecondary.f();
    }

    private final TextView getSectionTitle() {
        return (TextView) this.sectionTitle.f();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    public static /* synthetic */ void setChartHeader$default(ChartHeaderView chartHeaderView, k1 k1Var, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        chartHeaderView.setChartHeader(k1Var, z);
    }

    private final void setTitle(Clause title) {
        ty0.c.b(u.k(this).b0(), title, getTitle(), null, null, 12);
    }

    public final r a() {
        r rVarHide = this.f56609b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF51813h() {
        return this.analyticsContext;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setChartHeader(@NotNull k1 chartHeader, boolean clicksEnabled) {
        Intrinsics.checkNotNullParameter(chartHeader, "chartHeader");
        setClickable(clicksEnabled);
        chartHeader.getClass();
        getSectionTitle().setVisibility(8);
        getSectionTitle().setClickable(clicksEnabled);
        getSectionTitle().setTag(null);
        ty0.c.b(u.k(this).b0(), null, getSectionTitle(), null, null, 12);
        if (clicksEnabled) {
            u.u(getSectionTitle(), this, new j01.c(new View[]{getSectionTitle()}, Unit.f186387a, this.d, null, 24));
        } else {
            u.o(getSectionTitle());
        }
        int i = R$id.chartHeaderView_title;
        int i2 = R$id.chartHeaderView_title;
        ImageView endImageSecondary = getEndImageSecondary();
        ViewGroup.LayoutParams layoutParams = endImageSecondary.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.startToEnd = R$id.chartHeaderView_title;
        layoutParams2.topToTop = i;
        layoutParams2.bottomToBottom = i2;
        endImageSecondary.setLayoutParams(layoutParams2);
        ImageView endImage = getEndImage();
        ViewGroup.LayoutParams layoutParams3 = endImage.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.topToTop = i;
        layoutParams4.bottomToBottom = i2;
        endImage.setLayoutParams(layoutParams4);
        setTitle(chartHeader.f10385a);
        ?? r56 = chartHeader.f10386b;
        getSubtitle().setVisibility(0);
        getSubtitle().setClickable(clicksEnabled);
        ty0.c.b(u.k(this).b0(), r56, getSubtitle(), clicksEnabled ? new o(this, 6) : null, null, 8);
        TextView subtitle = getSubtitle();
        c0 c0Var = c0.f169220a;
        if (!clicksEnabled) {
            c0Var = null;
        }
        subtitle.setMovementMethod(c0Var);
        Image image = chartHeader.f10387c;
        getEndImage().setEnabled(image != null);
        getEndImage().setTag(null);
        yy0.f.e(u.k(this).Q(), image, getEndImage(), null, null, 12);
        ImageView endImage2 = getEndImage();
        m.a(endImage2);
        if (clicksEnabled) {
            endImage2.setOnClickListener(new ts0.m(this, 0));
        } else {
            u.o(endImage2);
        }
        getEndImageSecondary().setEnabled(false);
        yy0.f.e(u.k(this).Q(), null, getEndImageSecondary(), null, null, 12);
        ImageView endImageSecondary2 = getEndImageSecondary();
        m.a(endImageSecondary2);
        if (clicksEnabled) {
            endImageSecondary2.setOnClickListener(new ts0.m(this, 1));
        } else {
            u.o(endImageSecondary2);
        }
    }

    public final void setFloatingPosition(int centerX) {
        getContainer().setTranslationX(BitmapDescriptorFactory.HUE_RED);
        if (getContainer().getWidth() == 0 || centerX == 0) {
            return;
        }
        getContainer().setTranslationX(Math.max(0, Math.min((r0 / 2) + centerX, getWidth()) - r0) - getContainer().getLeft());
    }

    public final void setFloatingStyleEnabled(boolean enabled) {
        getEndImage().setVisibility(!enabled ? 0 : 8);
        getEndImageSecondary().setVisibility(enabled ? 8 : 0);
        ConstraintLayout container = getContainer();
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = enabled ? -2 : -1;
        container.setLayoutParams(layoutParams);
        if (enabled) {
            getContainer().setBackgroundResource(R$drawable.internal_chart_header_bubble);
            return;
        }
        getContainer().setBackground(null);
        ConstraintLayout container2 = getContainer();
        container2.setPaddingRelative(0, container2.getPaddingTop(), 0, container2.getPaddingBottom());
        getContainer().setTranslationX(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56609b = v0.a.d("create(...)");
        this.f56610c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.endImage = kli.a.J(R$id.chartHeaderView_endImage, this);
        this.endImageSecondary = kli.a.J(R$id.chartHeaderView_endImageSecondary, this);
        this.container = kli.a.J(R$id.chartHeaderView_container, this);
        this.sectionTitle = kli.a.J(R$id.chartHeaderView_sectionTitle, this);
        this.title = kli.a.J(R$id.chartHeaderView_title, this);
        this.subtitle = kli.a.J(R$id.chartHeaderView_subtitle, this);
        View.inflate(context, R$layout.internal_chart_header_view, this);
        setFloatingStyleEnabled(false);
    }

    public /* synthetic */ ChartHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
