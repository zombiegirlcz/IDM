package com.revolut.core.ui_kit.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import au0.g2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.ImageDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.a9;
import mx0.x8;
import mx0.y8;
import mx0.z8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00029:B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u001d\u001a\u00020\u000e2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/revolut/core/ui_kit/views/LightboxGalleryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lau0/g2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lkoi/j;", "items", "", "setGalleryItems", "(Ljava/util/List;)V", "position", "", "smooth", "setViewPagerToPosition", "(IZ)V", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setNavigationButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setToolbarTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Le8/q;", "getImagesViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "imagesViewPager", "Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", "f", "getNavBarWithToolbar", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", "navBarWithToolbar", "Landroidx/recyclerview/widget/RecyclerView;", "g", "Lkotlin/Lazy;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Companion", "mx0/y8", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LightboxGalleryView extends ConstraintLayout implements g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q imagesViewPager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f58753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z4l.j f58754h;
    public final ihm.b i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightboxGalleryView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit f0(LightboxGalleryView lightboxGalleryView, xv0.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = z8.f210143b[event.ordinal()];
        if (i == 1) {
            lightboxGalleryView.getNavBarWithToolbar().animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(300L).setInterpolator(new AccelerateInterpolator()).start();
            Context context = lightboxGalleryView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityI = z92.f.i(context);
            if (activityI != null) {
                activityI.getWindow().getDecorView().setSystemUiVisibility(6);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lightboxGalleryView.getNavBarWithToolbar().animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator()).start();
            Context context2 = lightboxGalleryView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Activity activityI2 = z92.f.i(context2);
            if (activityI2 != null) {
                activityI2.getWindow().getDecorView().setSystemUiVisibility(0);
            }
        }
        return Unit.f186387a;
    }

    public static RecyclerView g0(LightboxGalleryView lightboxGalleryView) {
        for (Object obj2 : ViewGroupKt.getChildren(lightboxGalleryView.getImagesViewPager())) {
            if (((View) obj2) instanceof RecyclerView) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                return (RecyclerView) obj2;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final ViewPager2 getImagesViewPager() {
        return (ViewPager2) this.imagesViewPager.f();
    }

    private final NavBarWithToolbar getNavBarWithToolbar() {
        return (NavBarWithToolbar) this.navBarWithToolbar.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.f58753g.getValue();
    }

    public static /* synthetic */ void setViewPagerToPosition$default(LightboxGalleryView lightboxGalleryView, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        lightboxGalleryView.setViewPagerToPosition(i, z);
    }

    @Override // au0.g2
    public final efm.r b() {
        return getNavBarWithToolbar().o.f57403b;
    }

    public final efm.r h0() {
        return getNavBarWithToolbar().f59410q;
    }

    public final void setGalleryItems(@NotNull List<? extends koi.j> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f58754h.c(items);
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        getNavBarWithToolbar().setMenuItems(menuItems, imageDisplayer);
    }

    public final void setNavigationButtonIcon(Integer iconRes) {
        getNavBarWithToolbar().setNavigationButtonIcon(iconRes);
    }

    public final void setNavigationButtonImage(Image image) {
        getNavBarWithToolbar().setNavigationButtonImage(image);
    }

    public final void setToolbarTitle(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        getNavBarWithToolbar().setToolbarTitle(clause);
    }

    public final void setViewPagerToPosition(int position, boolean smooth) {
        if (getImagesViewPager().getCurrentItem() == position) {
            return;
        }
        getImagesViewPager().setCurrentItem(position, smooth);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightboxGalleryView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        getNavBarWithToolbar().setMenuItems(menuItems);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightboxGalleryView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imagesViewPager = kli.a.J(R$id.lightboxGallery_viewPager, this);
        this.navBarWithToolbar = kli.a.J(R$id.lightboxGallery_navBarWithToolbar, this);
        this.f58753g = te0.w.y0(new x8(this, 0));
        ImageDelegate imageDelegate = new ImageDelegate();
        PdfDelegate pdfDelegate = new PdfDelegate();
        koi.c cVar = new koi.c(0);
        cVar.a(imageDelegate);
        cVar.a(pdfDelegate);
        z4l.j jVar = new z4l.j(cVar, false, 14);
        this.f58754h = jVar;
        this.i = j6.a.h("create(...)");
        View.inflate(context, R$layout.internal_lightbox_gallery_view, this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_LightboxGalleryView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = z8.f210142a[y8.values()[typedArrayObtainStyledAttributes.getInt(R$styleable.uikit_LightboxGalleryView_uikit_LightboxGalleryViewStyle, y8.GALLERY.ordinal())].ordinal()];
        if (i2 == 1) {
            ViewParent parent = getImagesViewPager().getParent();
            Intrinsics.i(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ((ConstraintLayout) parent).setClipChildren(false);
            getImagesViewPager().setClipChildren(false);
            RecyclerView recyclerView = getRecyclerView();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            recyclerView.addOnItemTouchListener(new xv0.l(context2, zhm.u.c(imageDelegate), new a7(this, 2)));
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        typedArrayObtainStyledAttributes.recycle();
        getNavBarWithToolbar().j0(false);
        getImagesViewPager().setAdapter(jVar);
        getImagesViewPager().registerOnPageChangeCallback(new a9(this));
    }

    public /* synthetic */ LightboxGalleryView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
