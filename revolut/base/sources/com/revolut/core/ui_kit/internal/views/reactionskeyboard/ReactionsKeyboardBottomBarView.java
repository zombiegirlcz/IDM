package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.ImageViewCompat;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import e8.q;
import ihm.f;
import ip0.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.l;
import lkf.f0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R)\u0010/\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00100\u00100*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010.R)\u00102\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\n0\n0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010.¨\u00063"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardBottomBarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "iconRes", "", "setStartItem", "(Ljava/lang/Integer;)V", "", "Llu0/b;", "items", "", "selectedId", "setSelectableItems", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "a", "Le8/q;", "getStartIcon", "()Landroid/widget/ImageView;", "startIcon", "b", "getEndIcon", "endIcon", "Landroid/view/ViewGroup;", "c", "getSelectableIconsContainer", "()Landroid/view/ViewGroup;", "selectableIconsContainer", "d", "Lkotlin/Lazy;", "getSelectedColor", "()I", "selectedColor", "e", "getNonSelectedColor", "nonSelectedColor", "Lihm/f;", "kotlin.jvm.PlatformType", "g", "getOnItemSelectedSubject", "()Lihm/f;", "onItemSelectedSubject", "h", "getOnStartItemClickedSubject", "onStartItemClickedSubject", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardBottomBarView extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q startIcon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q endIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q selectableIconsContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Lazy selectedColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Lazy nonSelectedColor;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f57478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f57479h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardBottomBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startIcon = kli.a.J(R$id.ReactionsKeyboardBottomBarView_startIcon, this);
        this.endIcon = kli.a.J(R$id.ReactionsKeyboardBottomBarView_endIcon, this);
        this.selectableIconsContainer = kli.a.J(R$id.ReactionsKeyboardBottomBarView_selectableIconsContainer, this);
        this.selectedColor = j.b(new lu0.a(context, 0));
        this.nonSelectedColor = j.b(new lu0.a(context, 1));
        k kVar = k.NONE;
        this.f57478g = j.c(kVar, new f0(20));
        this.f57479h = j.c(kVar, new f0(21));
        View.inflate(context, R$layout.internal_reactions_keyboard_bottom_bar_view, this);
    }

    public static void a(ReactionsKeyboardBottomBarView reactionsKeyboardBottomBarView) {
        reactionsKeyboardBottomBarView.getOnStartItemClickedSubject().onNext(Unit.f186387a);
    }

    private final ImageView getEndIcon() {
        return (ImageView) this.endIcon.f();
    }

    private final int getNonSelectedColor() {
        return ((Number) this.nonSelectedColor.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final f getOnItemSelectedSubject() {
        return (f) this.f57478g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final f getOnStartItemClickedSubject() {
        return (f) this.f57479h.getValue();
    }

    private final ViewGroup getSelectableIconsContainer() {
        return (ViewGroup) this.selectableIconsContainer.f();
    }

    private final int getSelectedColor() {
        return ((Number) this.selectedColor.getValue()).intValue();
    }

    private final ImageView getStartIcon() {
        return (ImageView) this.startIcon.f();
    }

    public static /* synthetic */ void setSelectableItems$default(ReactionsKeyboardBottomBarView reactionsKeyboardBottomBarView, List list, String str, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        reactionsKeyboardBottomBarView.setSelectableItems(list, str);
    }

    public final f b() {
        return getOnItemSelectedSubject();
    }

    public final f c() {
        return getOnStartItemClickedSubject();
    }

    public final void d(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        String str = this.f;
        if (Intrinsics.f(itemId, str)) {
            return;
        }
        ImageView imageView = (ImageView) getSelectableIconsContainer().findViewWithTag(str);
        if (imageView != null) {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(getNonSelectedColor()));
        }
        this.f = itemId;
        ImageView imageView2 = (ImageView) getSelectableIconsContainer().findViewWithTag(itemId);
        if (imageView2 != null) {
            ImageViewCompat.setImageTintList(imageView2, ColorStateList.valueOf(getSelectedColor()));
        }
        getOnItemSelectedSubject().onNext(itemId);
    }

    public final void setSelectableItems(@NotNull List<lu0.b> items, String selectedId) {
        String str;
        Object next;
        lu0.b bVar;
        Intrinsics.checkNotNullParameter(items, "items");
        getSelectableIconsContainer().removeAllViews();
        List<lu0.b> list = items;
        Iterator<T> it8 = list.iterator();
        while (true) {
            str = null;
            if (it8.hasNext()) {
                next = it8.next();
                if (((lu0.b) next).f199982a.equals(selectedId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        lu0.b bVar2 = (lu0.b) next;
        if (bVar2 != null) {
            str = bVar2.f199982a;
        } else {
            List<lu0.b> list2 = !items.isEmpty() ? items : null;
            if (list2 != null && (bVar = (lu0.b) d0.b0(list2)) != null) {
                str = bVar.f199982a;
            }
        }
        this.f = str;
        if (items.isEmpty()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iX = kli.a.x(R.attr.selectableItemBackgroundBorderless, context);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.internal_reactions_keyboard_bottom_bar_item_size);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R$dimen.internal_reactions_keyboard_bottom_bar_item_padding);
        for (lu0.b bVar3 : list) {
            ImageView imageView = new ImageView(getContext());
            imageView.setTag(bVar3.f199982a);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            imageView.setImageResource(bVar3.f199983b);
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(bVar3.f199982a.equals(this.f) ? getSelectedColor() : getNonSelectedColor()));
            imageView.setBackgroundResource(iX);
            imageView.setOnClickListener(new l(this, bVar3, 3));
            getSelectableIconsContainer().addView(imageView);
        }
    }

    public final void setStartItem(Integer iconRes) {
        ImageView startIcon = getStartIcon();
        if (iconRes != null) {
            startIcon.setVisibility(0);
            startIcon.setImageResource(iconRes.intValue());
        } else {
            startIcon.setVisibility(4);
            startIcon.setImageDrawable(null);
        }
        getStartIcon().setOnClickListener(new g0(this, 15));
    }
}
