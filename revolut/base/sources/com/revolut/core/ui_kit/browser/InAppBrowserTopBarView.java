package com.revolut.core.ui_kit.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.browser.InAppBrowserTopBarView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import ihm.f;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/browser/InAppBrowserTopBarView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setUrlText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "isSecured", "setUrlSecured", "(Z)V", "isEnabled", "setRefreshButtonEnabled", "Landroidx/appcompat/widget/AppCompatImageButton;", "a", "Le8/q;", "getCloseButton", "()Landroidx/appcompat/widget/AppCompatImageButton;", "closeButton", "b", "getRefreshButton", "refreshButton", "Landroidx/appcompat/widget/AppCompatImageView;", "c", "getUrlIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "urlIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "d", "getUrlTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "urlTextView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InAppBrowserTopBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q closeButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q refreshButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q urlIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q urlTextView;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserTopBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.closeButton = a.J(R$id.inAppBrowserTopBar_closeButton, this);
        this.refreshButton = a.J(R$id.inAppBrowserTopBar_refreshButton, this);
        this.urlIcon = a.J(R$id.inAppBrowserTopBar_urlIcon, this);
        this.urlTextView = a.J(R$id.inAppBrowserTopBar_url, this);
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f51516g = true;
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_top_bar, this);
        final int i = 0;
        getCloseButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i2 = 1;
        getRefreshButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    private final AppCompatImageButton getCloseButton() {
        return (AppCompatImageButton) this.closeButton.f();
    }

    private final AppCompatImageButton getRefreshButton() {
        return (AppCompatImageButton) this.refreshButton.f();
    }

    private final AppCompatImageView getUrlIcon() {
        return (AppCompatImageView) this.urlIcon.f();
    }

    private final AppCompatTextView getUrlTextView() {
        return (AppCompatTextView) this.urlTextView.f();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        setPadding(getPaddingLeft(), insets2.top, getPaddingRight(), getPaddingBottom());
        return insets;
    }

    public final void setRefreshButtonEnabled(boolean isEnabled) {
        getRefreshButton().setEnabled(isEnabled);
    }

    public final void setUrlSecured(boolean isSecured) {
        if (this.f51516g != isSecured) {
            this.f51516g = isSecured;
            yy0.f.e(u.k(this).Q(), isSecured ? new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 12, 12, 31), (Clause) null, 190) : new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 12, 12, 31), (Clause) null, 190), getUrlIcon(), null, null, 12);
        }
    }

    public final void setUrlText(Clause clause) {
        c.b(u.k(this).b0(), clause, getUrlTextView(), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserTopBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.closeButton = a.J(R$id.inAppBrowserTopBar_closeButton, this);
        this.refreshButton = a.J(R$id.inAppBrowserTopBar_refreshButton, this);
        this.urlIcon = a.J(R$id.inAppBrowserTopBar_urlIcon, this);
        this.urlTextView = a.J(R$id.inAppBrowserTopBar_url, this);
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f51516g = true;
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_top_bar, this);
        final int i = 0;
        getCloseButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i2 = 1;
        getRefreshButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserTopBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.closeButton = a.J(R$id.inAppBrowserTopBar_closeButton, this);
        this.refreshButton = a.J(R$id.inAppBrowserTopBar_refreshButton, this);
        this.urlIcon = a.J(R$id.inAppBrowserTopBar_urlIcon, this);
        this.urlTextView = a.J(R$id.inAppBrowserTopBar_url, this);
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f51516g = true;
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_top_bar, this);
        final int i2 = 0;
        getCloseButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 1;
        getRefreshButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserTopBarView f298858b;

            {
                this.f298858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f298858b.e.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298858b.f.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
