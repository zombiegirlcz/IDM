package com.revolut.core.ui_kit.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.browser.InAppBrowserBottomBarView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import ihm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import v0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/browser/InAppBrowserBottomBarView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setForwardButtonEnabled", "(Z)V", "Lwo0/a;", "actionButtonData", "setActionButton", "(Lwo0/a;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setOptionsButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroidx/appcompat/widget/AppCompatImageButton;", "e", "Le8/q;", "getBackButton", "()Landroidx/appcompat/widget/AppCompatImageButton;", "backButton", "f", "getForwardButton", "forwardButton", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "g", "getActionButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "actionButton", "h", "getOptionsButton", "optionsButton", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InAppBrowserBottomBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f51508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f51509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f51510c;
    public final f d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q backButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q forwardButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q actionButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q optionsButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserBottomBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51508a = a.d("create(...)");
        this.f51509b = a.d("create(...)");
        this.f51510c = a.d("create(...)");
        this.d = a.d("create(...)");
        this.backButton = kli.a.J(R$id.inAppBrowserBottomBar_backButton, this);
        this.forwardButton = kli.a.J(R$id.inAppBrowserBottomBar_forwardButton, this);
        this.actionButton = kli.a.J(R$id.inAppBrowserBottomBar_actionButton, this);
        this.optionsButton = kli.a.J(R$id.inAppBrowserBottomBar_optionsButton, this);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_bottom_bar, this);
        getForwardButton().setEnabled(false);
        final int i = 0;
        getBackButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i2 = 1;
        getForwardButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 2;
        getActionButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 3;
        getOptionsButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    private final SmallActionButton getActionButton() {
        return (SmallActionButton) this.actionButton.f();
    }

    private final AppCompatImageButton getBackButton() {
        return (AppCompatImageButton) this.backButton.f();
    }

    private final AppCompatImageButton getForwardButton() {
        return (AppCompatImageButton) this.forwardButton.f();
    }

    private final AppCompatImageButton getOptionsButton() {
        return (AppCompatImageButton) this.optionsButton.f();
    }

    public void setActionButton(wo0.a actionButtonData) {
        getActionButton().setVisibility(8);
    }

    public final void setForwardButtonEnabled(boolean isEnabled) {
        getForwardButton().setEnabled(isEnabled);
    }

    public void setOptionsButtonImage(Image image) {
        getOptionsButton().setVisibility(image != null ? 0 : 8);
        yy0.f.e(u.k(this).Q(), image, getOptionsButton(), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserBottomBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51508a = a.d("create(...)");
        this.f51509b = a.d("create(...)");
        this.f51510c = a.d("create(...)");
        this.d = a.d("create(...)");
        this.backButton = kli.a.J(R$id.inAppBrowserBottomBar_backButton, this);
        this.forwardButton = kli.a.J(R$id.inAppBrowserBottomBar_forwardButton, this);
        this.actionButton = kli.a.J(R$id.inAppBrowserBottomBar_actionButton, this);
        this.optionsButton = kli.a.J(R$id.inAppBrowserBottomBar_optionsButton, this);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_bottom_bar, this);
        getForwardButton().setEnabled(false);
        final int i = 0;
        getBackButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i2 = 1;
        getForwardButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 2;
        getActionButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 3;
        getOptionsButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserBottomBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51508a = a.d("create(...)");
        this.f51509b = a.d("create(...)");
        this.f51510c = a.d("create(...)");
        this.d = a.d("create(...)");
        this.backButton = kli.a.J(R$id.inAppBrowserBottomBar_backButton, this);
        this.forwardButton = kli.a.J(R$id.inAppBrowserBottomBar_forwardButton, this);
        this.actionButton = kli.a.J(R$id.inAppBrowserBottomBar_actionButton, this);
        this.optionsButton = kli.a.J(R$id.inAppBrowserBottomBar_optionsButton, this);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser_bottom_bar, this);
        getForwardButton().setEnabled(false);
        final int i2 = 0;
        getBackButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 1;
        getForwardButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 2;
        getActionButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i6 = 3;
        getOptionsButton().setOnClickListener(new View.OnClickListener(this) { // from class: wo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppBrowserBottomBarView f298856b;

            {
                this.f298856b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f298856b.f51508a.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f298856b.f51509b.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f298856b.d.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f298856b.f51510c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setClipToPadding(false);
        setClipChildren(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
