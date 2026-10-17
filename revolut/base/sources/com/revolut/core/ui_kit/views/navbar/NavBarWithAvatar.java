package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.os.Parcelable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import au0.z4;
import aw0.j8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayoutProxy;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ix0.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import tx0.e4;
import tx0.l2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001c\u0010\u001fJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0017J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u00104R\u001b\u0010@\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u00104R$\u0010H\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarWithAvatar;", "Lcom/google/android/material/appbar/AppBarLayoutProxy;", "Ltx0/e4;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "iconRes", "", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;", "image", "setNavigationButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setToolbarTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "setToolbarTitleBadge", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setToolbarDescription", "setAvatarImage", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;", "avatarModel", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;)V", "disclaimer", "setHeaderDisclaimer", "Law0/j8;", "navBarWithAvatarModel", "setModel", "(Law0/j8;)V", "Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "d", "Le8/q;", "getNavigationButton", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "navigationButton", "Lcom/revolut/core/ui_kit/views/AvatarView;", "e", "getAvatarImage", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "avatarImage", "Landroid/widget/TextView;", "f", "getToolbarTitle", "()Landroid/widget/TextView;", "toolbarTitle", "Landroid/widget/ImageView;", "g", "getToolbarTitleBadge", "()Landroid/widget/ImageView;", "toolbarTitleBadge", "h", "getToolbarDescription", "toolbarDescription", "i", "getHeaderDisclaimer", "headerDisclaimer", "Landroid/os/Parcelable;", "m", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithAvatar extends AppBarLayoutProxy implements e4, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f59338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f59339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f59340c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final e8.q navigationButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q avatarImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q toolbarTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarTitleBadge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarDescription;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q headerDisclaimer;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f59343j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z4 f59344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarWithAvatar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59338a = v0.a.d("create(...)");
        this.f59339b = v0.a.d("create(...)");
        this.f59340c = v0.a.d("create(...)");
        this.navigationButton = kli.a.J(R$id.navBarWithAvatar_navigationButton, this);
        this.avatarImage = kli.a.J(R$id.navBarWithAvatar_avatarImage, this);
        this.toolbarTitle = kli.a.J(R$id.navBarWithAvatar_toolbarTitle, this);
        this.toolbarTitleBadge = kli.a.J(R$id.navBarWithAvatar_toolbarTitleBadge, this);
        this.toolbarDescription = kli.a.J(R$id.navBarWithAvatar_toolbarDescription, this);
        this.headerDisclaimer = kli.a.J(R$id.navBarWithAvatar_headerDisclaimer, this);
        this.f59343j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f59344l = new z4(this);
        View.inflate(context, R$layout.internal_view_nav_bar_with_avatar, this);
        fp0.p clickHandler = getNavigationButton().getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new l2(this, 1));
        getAvatarImage().setupAvatarViewForNewNavbarDesign(context, i1.SIZE_40_40);
        final int i = 0;
        getAvatarImage().setOnClickListener(new View.OnClickListener(this) { // from class: tx0.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavBarWithAvatar f275174b;

            {
                this.f275174b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f275174b.f59339b.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f275174b.f59340c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i2 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: tx0.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavBarWithAvatar f275174b;

            {
                this.f275174b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f275174b.f59339b.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f275174b.f59340c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        setOutlineProvider(null);
        setStateListAnimator(null);
        setBackground(null);
    }

    private final AvatarView getAvatarImage() {
        return (AvatarView) this.avatarImage.f();
    }

    private final TextView getHeaderDisclaimer() {
        return (TextView) this.headerDisclaimer.f();
    }

    private final NavBarNavigationButtonView getNavigationButton() {
        return (NavBarNavigationButtonView) this.navigationButton.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getToolbarDescription() {
        return (TextView) this.toolbarDescription.f();
    }

    private final TextView getToolbarTitle() {
        return (TextView) this.toolbarTitle.f();
    }

    private final ImageView getToolbarTitleBadge() {
        return (ImageView) this.toolbarTitleBadge.f();
    }

    @Override // tx0.e4
    public final void d(int i) {
        View viewB = this.f59344l.b();
        if (viewB == null) {
            return;
        }
        ViewParent parent = getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        int measuredHeight = getMeasuredHeight() + (coordinatorLayout != null ? coordinatorLayout.getPaddingTop() : 0);
        if (i > measuredHeight) {
            i = measuredHeight;
        }
        float f = i / measuredHeight;
        viewB.setAlpha(f);
        viewB.setVisibility((f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) <= 0 ? 4 : 0);
        viewB.setY(getHeight());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF52429j() {
        return this.analyticsContext;
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setPadding(getPaddingLeft(), insets.getInsets(WindowInsetsCompat.Type.systemBars()).top, getPaddingRight(), getPaddingBottom());
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @yhm.d
    public final void setAvatarImage(Image image) {
        getAvatarImage().setVisibility(image != null ? 0 : 8);
        if (image == null) {
            return;
        }
        getAvatarImage().setModel$ui_kit_components_release(new AvatarModel.Default(image, null, null, null, null, null, 126), true);
    }

    public final void setHeaderDisclaimer(@NotNull Clause disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        ty0.c.b(or0.u.k(this).b0(), disclaimer, getHeaderDisclaimer(), new su0.c(1, this.k, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 27), null, 8);
        getHeaderDisclaimer().setVisibility(0);
        getHeaderDisclaimer().setMovementMethod(c0.f169220a);
        CharSequence text = getHeaderDisclaimer().getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), ix0.b0.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj2 : spans) {
                ((ix0.b0) obj2).k = getHeaderDisclaimer().getCurrentTextColor();
            }
        }
        if (getHeaderDisclaimer().getBackground() == null) {
            TextView headerDisclaimer = getHeaderDisclaimer();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            headerDisclaimer.setBackground(hx7.q.a(context));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(@NotNull j8 navBarWithAvatarModel) {
        Intrinsics.checkNotNullParameter(navBarWithAvatarModel, "navBarWithAvatarModel");
        setToolbarTitle(navBarWithAvatarModel.f10375a);
        setToolbarTitleBadge(null);
        setToolbarDescription(navBarWithAvatarModel.f10376b);
        setAvatarImage(navBarWithAvatarModel.f10377c);
    }

    public final void setNavigationButtonIcon(Integer iconRes) {
        setNavigationButtonImage(iconRes != null ? new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    public final void setNavigationButtonImage(ResourceImage image) {
        getNavigationButton().setVisibility(image != null ? 0 : 8);
        yy0.f.e(or0.u.k(this).Q(), image, getNavigationButton(), null, null, 12);
        getNavigationButton().setContentDescription(getNavigationButton().getContext().getString(R$string.uikit_navigate_up_description));
    }

    public final void setToolbarDescription(Clause text) {
        getToolbarDescription().setVisibility(text != null ? 0 : 8);
        ty0.c.b(or0.u.k(this).b0(), text, getToolbarDescription(), null, null, 12);
        TextView toolbarDescription = getToolbarDescription();
        boolean z = text != null;
        or0.m.a(toolbarDescription);
        if (z) {
            toolbarDescription.setOnClickListener(new l2(this, 0));
        } else {
            or0.u.o(toolbarDescription);
        }
    }

    public final void setToolbarTitle(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c.b(or0.u.k(this).b0(), text, getToolbarTitle(), null, null, 12);
        setTag(R$id.internal_nav_bar_title_clause, text);
    }

    public final void setToolbarTitleBadge(Image image) {
        if (image == null) {
            getToolbarTitleBadge().setVisibility(8);
        } else {
            getToolbarTitleBadge().setVisibility(0);
            yy0.f.e(or0.u.k(this).Q(), image, getToolbarTitleBadge(), null, null, 12);
        }
    }

    public final void setAvatarImage(AvatarModel.Default avatarModel) {
        getAvatarImage().setVisibility(avatarModel != null ? 0 : 8);
        if (avatarModel == null) {
            return;
        }
        getAvatarImage().setModel(avatarModel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithAvatar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
