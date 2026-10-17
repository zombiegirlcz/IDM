package com.revolut.core.ui_kit.internal.views.gridselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.gridselector.GridHeaderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import ihm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import rd0.e;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0012J\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0012R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010:R\u001b\u0010A\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010:¨\u0006D"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gridselector/GridHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "enabled", "setNavigateToPrevEnabled", "(Z)V", "setNavigateToNextEnabled", "contentDescription", "setNavigatePrevContentDescription", "setNavigateNextContentDescription", "", "customId", "setNavigatePrevE2ETestsCustomId", "(Ljava/lang/String;)V", "setNavigateNextE2ETestsCustomId", "isVisible", "setDropdownVisible", "isOpen", "animate", "setDropdownOpen", "(ZZ)V", "visible", "setNavigationArrowsVisible", "Landroid/widget/FrameLayout;", "h", "Le8/q;", "getNavigatePrev", "()Landroid/widget/FrameLayout;", "navigatePrev", "i", "getNavigateNext", "navigateNext", "Landroid/view/ViewGroup;", "j", "getTitleContainer", "()Landroid/view/ViewGroup;", "titleContainer", "Landroid/widget/TextView;", "k", "getTitle", "()Landroid/widget/TextView;", "title", "Landroid/widget/ImageView;", "l", "getDropdown", "()Landroid/widget/ImageView;", "dropdown", "m", "getNavigatePrevIcon", "navigatePrevIcon", "n", "getNavigateNextIcon", "navigateNextIcon", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridHeaderView extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f57197b;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f57198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q navigatePrev;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q navigateNext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q titleContainer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q dropdown;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q navigatePrevIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q navigateNextIcon;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(FrameLayout frameLayout, boolean z, ImageView imageView) {
        frameLayout.setEnabled(z);
        int i = z ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorGreyTone10;
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e.q(imageView, Integer.valueOf(kli.a.s(i, context)));
    }

    private final ImageView getDropdown() {
        return (ImageView) this.dropdown.f();
    }

    private final FrameLayout getNavigateNext() {
        return (FrameLayout) this.navigateNext.f();
    }

    private final ImageView getNavigateNextIcon() {
        return (ImageView) this.navigateNextIcon.f();
    }

    private final FrameLayout getNavigatePrev() {
        return (FrameLayout) this.navigatePrev.f();
    }

    private final ImageView getNavigatePrevIcon() {
        return (ImageView) this.navigatePrevIcon.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    private final ViewGroup getTitleContainer() {
        return (ViewGroup) this.titleContainer.f();
    }

    public final void setDropdownOpen(boolean isOpen, boolean animate) {
        getDropdown().animate().cancel();
        float f = isOpen ? 180.0f : BitmapDescriptorFactory.HUE_RED;
        if (animate) {
            getDropdown().animate().rotation(f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        } else {
            getDropdown().setRotation(f);
        }
    }

    public final void setDropdownVisible(boolean isVisible) {
        getDropdown().setVisibility(isVisible ? 0 : 8);
    }

    public final void setNavigateNextContentDescription(Clause contentDescription) {
        b.p(getNavigateNext(), contentDescription);
    }

    public final void setNavigateNextE2ETestsCustomId(String customId) {
        hx7.b.v(getNavigateNext(), customId);
    }

    public final void setNavigatePrevContentDescription(Clause contentDescription) {
        b.p(getNavigatePrev(), contentDescription);
    }

    public final void setNavigatePrevE2ETestsCustomId(String customId) {
        hx7.b.v(getNavigatePrev(), customId);
    }

    public final void setNavigateToNextEnabled(boolean enabled) {
        f0(getNavigateNext(), enabled, getNavigateNextIcon());
    }

    public final void setNavigateToPrevEnabled(boolean enabled) {
        f0(getNavigatePrev(), enabled, getNavigatePrevIcon());
    }

    public final void setNavigationArrowsVisible(boolean visible) {
        getNavigatePrevIcon().setVisibility(visible ? 0 : 8);
        getNavigateNextIcon().setVisibility(visible ? 0 : 8);
        setNavigateToPrevEnabled(visible);
        setNavigateToNextEnabled(visible);
    }

    public final void setTitle(Clause clause) {
        c.b(u.k(getTitle()).b0(), clause, getTitle(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57197b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f57198g = v0.a.d("create(...)");
        this.navigatePrev = kli.a.J(R$id.gridHeader_navigatePrev, this);
        this.navigateNext = kli.a.J(R$id.gridHeader_navigateNext, this);
        this.titleContainer = kli.a.J(R$id.gridHeader_titleContainer, this);
        this.title = kli.a.J(R$id.gridHeader_title, this);
        this.dropdown = kli.a.J(R$id.gridHeader_titleDropdown, this);
        this.navigatePrevIcon = kli.a.J(R$id.gridHeader_navigatePrev_icon, this);
        this.navigateNextIcon = kli.a.J(R$id.gridHeader_navigateNext_icon, this);
        View.inflate(context, R$layout.internal_view_grid_header, this);
        final int i2 = 0;
        getNavigatePrev().setOnClickListener(new View.OnClickListener(this) { // from class: rt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GridHeaderView f257150b;

            {
                this.f257150b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f257150b.f57197b.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f257150b.f.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f257150b.f57198g.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 1;
        getNavigateNext().setOnClickListener(new View.OnClickListener(this) { // from class: rt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GridHeaderView f257150b;

            {
                this.f257150b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f257150b.f57197b.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f257150b.f.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f257150b.f57198g.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 2;
        getTitleContainer().setOnClickListener(new View.OnClickListener(this) { // from class: rt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GridHeaderView f257150b;

            {
                this.f257150b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f257150b.f57197b.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f257150b.f.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f257150b.f57198g.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setPadding(0, 0, 0, kli.a.w(R$attr.uikit_dp4, context));
    }

    public /* synthetic */ GridHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
