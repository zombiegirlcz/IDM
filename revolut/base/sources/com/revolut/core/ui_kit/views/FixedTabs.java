package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.d6;
import mx0.f6;
import mx0.i6;
import mx0.j6;
import mx0.k6;
import mx0.l6;
import mx0.mc;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\u00020\u0001:\u0007()*+ \u0016,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010%¨\u0006-"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem;", "newItems", "", "selectedId", "", "setItems", "(Ljava/lang/Iterable;Ljava/lang/String;)V", "", "enabled", "setTabsEnabled", "(Z)V", "Lmx0/i6;", "style", "setStyle$ui_kit_components_release", "(Lmx0/i6;)V", "setStyle", "", "Lmx0/mc;", "extraActions", "setExtraActions", "(Ljava/util/List;)V", "Lmx0/l6;", "mode", "setFixedTabsWidthMode", "(Lmx0/l6;)V", "getUnselectedTextColorAttr", "()I", "getPaddingBasedOnMode", "Companion", "BaseItem", "Item", "IconItem", "mx0/f6", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FixedTabs extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny0.k f58552b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterable f58553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f58554h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CustomTabLayoutView f58555j;
    public final FrameLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final es0.j f58556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f6 f58557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i6 f58558n;
    public l6 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f58559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f58560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f58561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f58562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f58563t;
    public final int u;
    public final int v;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem;", "Landroid/os/Parcelable;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Style", "Lcom/revolut/core/ui_kit/views/FixedTabs$IconItem;", "Lcom/revolut/core/ui_kit/views/FixedTabs$Item;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BaseItem extends Parcelable, TrackableItem {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem$Style;", "Landroid/os/Parcelable;", "Default", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem$Style$Default;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Style extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem$Style$Default;", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem$Style;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default implements Style {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f58564a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f58564a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                private Default() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }
        }

        /* JADX INFO: renamed from: getId */
        String getF58568a();

        /* JADX INFO: renamed from: h */
        Style getF58570c();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs$IconItem;", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconItem implements BaseItem {

        @NotNull
        public static final Parcelable.Creator<IconItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f58566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f58567c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new IconItem(parcel.readParcelable(IconItem.class.getClassLoader()), (Image) parcel.readParcelable(IconItem.class.getClassLoader()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IconItem[i];
            }
        }

        public IconItem(Parcelable parcelable, Image image, String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f58565a = id10;
            this.f58566b = image;
            this.f58567c = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IconItem)) {
                return false;
            }
            IconItem iconItem = (IconItem) obj2;
            return Intrinsics.f(this.f58565a, iconItem.f58565a) && Intrinsics.f(this.f58566b, iconItem.f58566b) && Intrinsics.f(this.f58567c, iconItem.f58567c);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f58567c;
        }

        @Override // com.revolut.core.ui_kit.views.FixedTabs.BaseItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF58568a() {
            return this.f58565a;
        }

        @Override // com.revolut.core.ui_kit.views.FixedTabs.BaseItem
        /* JADX INFO: renamed from: h */
        public final BaseItem.Style getF58570c() {
            return BaseItem.Style.Default.f58564a;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f58566b, this.f58565a.hashCode() * 31, 31);
            Parcelable parcelable = this.f58567c;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58567c = parcelable;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f58565a);
            dest.writeParcelable(this.f58566b, i);
            dest.writeParcelable(this.f58567c, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.FixedTabs$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedTabs(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getPaddingBasedOnMode() {
        l6 l6Var = this.o;
        if (Intrinsics.f(l6Var, j6.f209780a)) {
            return 0;
        }
        if (Intrinsics.f(l6Var, k6.f209791a)) {
            return this.f58562s;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getUnselectedTextColorAttr() {
        return this.f58554h ? this.u : this.f58563t;
    }

    public static /* synthetic */ void setItems$default(FixedTabs fixedTabs, Iterable iterable, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        fixedTabs.setItems(iterable, str);
    }

    public final void g0() {
        l6 l6Var = this.o;
        if (!Intrinsics.f(l6Var, j6.f209780a)) {
            if (!Intrinsics.f(l6Var, k6.f209791a)) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(R$id.tabLayoutContainer, 7);
            constraintSet.applyTo(this);
            return;
        }
        es0.j jVar = this.f58556l;
        float f = jVar.b() != null ? 8.0f : BitmapDescriptorFactory.HUE_RED;
        int i = R$id.tabLayoutContainer;
        jVar.getClass();
        ConstraintSet constraintSet2 = new ConstraintSet();
        ConstraintLayout constraintLayout = jVar.f128831a;
        constraintSet2.clone(constraintLayout);
        jVar.a(constraintSet2, i, 7, f);
        constraintSet2.applyTo(constraintLayout);
    }

    public final void h0() {
        l6 l6Var = this.o;
        boolean zF = Intrinsics.f(l6Var, j6.f209780a);
        CustomTabLayoutView customTabLayoutView = this.f58555j;
        FrameLayout frameLayout = this.k;
        if (zF) {
            if (frameLayout.getLayoutParams().width != 0) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = 0;
                frameLayout.setLayoutParams(layoutParams);
            }
            if (customTabLayoutView.getTabGravity() != 0) {
                customTabLayoutView.setTabGravity(0);
                return;
            }
            return;
        }
        if (!Intrinsics.f(l6Var, k6.f209791a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (frameLayout.getLayoutParams().width != -2) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        if (customTabLayoutView.getTabGravity() != 1) {
            customTabLayoutView.setTabGravity(1);
        }
    }

    public final void i0(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        CustomTabLayoutView customTabLayoutView = this.f58555j;
        int tabCount = customTabLayoutView.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = customTabLayoutView.getTabAt(i);
            Object tag2 = tabAt != null ? tabAt.getTag() : null;
            BaseItem baseItem = tag2 instanceof BaseItem ? (BaseItem) tag2 : null;
            if (Intrinsics.f(baseItem != null ? baseItem.getF58568a() : null, itemId)) {
                tabAt.select();
                return;
            }
        }
        throw new IllegalArgumentException(j6.a.q("Can't find item with id ", itemId));
    }

    public final void j0(TabLayout.Tab tab2, int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        View customView = tab2.getCustomView();
        if (customView != null) {
            TextView textView = (TextView) customView.findViewById(R$id.tabText);
            if (textView != null) {
                textView.setTextColor(iS);
                return;
            }
            ImageView imageView = (ImageView) customView.findViewById(R$id.tabIcon);
            if (imageView != null) {
                rd0.e.q(imageView, Integer.valueOf(iS));
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58552b.b(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            FrameLayout frameLayout = this.k;
            if (frameLayout.getLayoutParams().width != -2) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -2;
                frameLayout.setLayoutParams(layoutParams);
            }
        } else if (mode == 0 || mode == 1073741824) {
            h0();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        this.i = bundle.getString("STATE_KEY_SELECTED");
        if (this.f58555j.getTabCount() > 0 && (str = this.i) != null) {
            i0(str);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putString("STATE_KEY_SELECTED", this.i);
        return bundle;
    }

    public final void setExtraActions(@NotNull List<? extends mc> extraActions) {
        Intrinsics.checkNotNullParameter(extraActions, "extraActions");
        if (this.f58556l.d(extraActions)) {
            g0();
        }
    }

    public final void setFixedTabsWidthMode(@NotNull l6 mode) {
        View customView;
        TextView textView;
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Intrinsics.f(this.o, mode)) {
            return;
        }
        this.o = mode;
        g0();
        h0();
        int paddingBasedOnMode = getPaddingBasedOnMode();
        CustomTabLayoutView customTabLayoutView = this.f58555j;
        int tabCount = customTabLayoutView.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = customTabLayoutView.getTabAt(i);
            if (tabAt != null && (customView = tabAt.getCustomView()) != null && (textView = (TextView) customView.findViewById(R$id.tabText)) != null && (textView.getPaddingStart() != paddingBasedOnMode || textView.getPaddingEnd() != paddingBasedOnMode)) {
                textView.setPaddingRelative(paddingBasedOnMode, 0, paddingBasedOnMode, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.material.tabs.TabLayout, com.revolut.core.ui_kit.views.CustomTabLayoutView] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, com.revolut.core.ui_kit.views.FixedTabs] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.material.tabs.TabLayout$Tab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.widget.ImageView, androidx.appcompat.widget.AppCompatImageView] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setItems(@NotNull Iterable<? extends BaseItem> newItems, String selectedId) {
        ?? appCompatImageView;
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (!Intrinsics.f(newItems, this.f58553g)) {
            ?? r06 = this.f58555j;
            r06.removeAllTabs();
            for (BaseItem baseItem : newItems) {
                if (baseItem instanceof Item) {
                    appCompatImageView = new AppCompatTextView(getContext(), null, R$attr.internal_textAppearanceEmphasis2);
                    appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    appCompatImageView.setId(R$id.tabText);
                    appCompatImageView.setSingleLine(true);
                    appCompatImageView.setEllipsize(TextUtils.TruncateAt.END);
                    int paddingBasedOnMode = getPaddingBasedOnMode();
                    if (paddingBasedOnMode != 0) {
                        appCompatImageView.setPaddingRelative(paddingBasedOnMode, 0, paddingBasedOnMode, 0);
                    }
                    ty0.c.b(or0.u.k(appCompatImageView).b0(), ((Item) baseItem).f58569b, appCompatImageView, null, null, 12);
                } else {
                    if (!(baseItem instanceof IconItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appCompatImageView = new AppCompatImageView(getContext());
                    appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(this.f58561r, -2));
                    appCompatImageView.setId(R$id.tabIcon);
                    int i = this.f58560q;
                    int i2 = this.f58559p;
                    appCompatImageView.setPadding(i, i2, i, i2);
                    yy0.f.e(or0.u.k(appCompatImageView).Q(), ((IconItem) baseItem).f58566b, appCompatImageView, null, null, 12);
                }
                ?? NewTab = r06.newTab();
                Intrinsics.checkNotNullExpressionValue(NewTab, "newTab(...)");
                NewTab.setCustomView(appCompatImageView);
                NewTab.view.setBackgroundResource(this.f58557m.c());
                j0(NewTab, getUnselectedTextColorAttr());
                NewTab.setTag(baseItem);
                r06.addTab(NewTab, false);
            }
            this.f58553g = newItems;
        }
        if (selectedId != null) {
            i0(selectedId);
            return;
        }
        BaseItem baseItem2 = (BaseItem) d0.c0(newItems);
        if (baseItem2 != null) {
            i0(baseItem2.getF58568a());
        }
    }

    public final void setStyle$ui_kit_components_release(@NotNull i6 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f58558n = style;
        this.k.setBackgroundResource(this.f58557m.a(style));
    }

    public final void setTabsEnabled(boolean enabled) {
        int i;
        int i2;
        if (this.f58554h == enabled) {
            return;
        }
        this.f58554h = enabled;
        CustomTabLayoutView customTabLayoutView = this.f58555j;
        int tabCount = customTabLayoutView.getTabCount();
        for (int i3 = 0; i3 < tabCount; i3++) {
            TabLayout.Tab tabAt = customTabLayoutView.getTabAt(i3);
            if (tabAt != null) {
                Object tag2 = tabAt.getTag();
                BaseItem baseItem = tag2 instanceof BaseItem ? (BaseItem) tag2 : null;
                if (baseItem != null) {
                    tabAt.view.setClickable(enabled);
                    j0(tabAt, getUnselectedTextColorAttr());
                    if (Intrinsics.f(baseItem.getF58568a(), this.i)) {
                        if (this.f58554h) {
                            ((BaseItem.Style.Default) baseItem.getF58570c()).getClass();
                            i = R$attr.uikit_colorForeground;
                        } else {
                            i = this.f58563t;
                        }
                        j0(tabAt, i);
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        if (this.f58554h) {
                            ((BaseItem.Style.Default) baseItem.getF58570c()).getClass();
                            i2 = R$attr.uikit_colorSegmentedActive;
                        } else {
                            i2 = this.v;
                        }
                        customTabLayoutView.setSelectedTabIndicatorColor(kli.a.s(i2, context));
                    } else {
                        j0(tabAt, getUnselectedTextColorAttr());
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedTabs(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedTabs(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.k kVar = new ny0.k(this);
        this.f58552b = kVar;
        this.f = v0.a.d("create(...)");
        this.f58553g = f0.f322471a;
        this.f58554h = true;
        this.f58557m = d6.f209646a;
        this.f58558n = i6.DARK;
        this.o = j6.f209780a;
        this.f58559p = kli.a.k(context, 8.0f);
        this.f58560q = kli.a.k(context, 4.0f);
        this.f58561r = kli.a.k(context, 40.0f);
        this.f58562s = kli.a.k(context, 12.0f);
        this.f58563t = R$attr.uikit_colorGreyTone20;
        this.u = R$attr.uikit_colorGreyTone50;
        this.v = R$attr.uikit_colorGreyTone5;
        View.inflate(context, R$layout.internal_view_fixed_tabs, this);
        View viewFindViewById = findViewById(R$id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CustomTabLayoutView customTabLayoutView = (CustomTabLayoutView) viewFindViewById;
        this.f58555j = customTabLayoutView;
        View viewFindViewById2 = findViewById(R$id.tabLayoutContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (FrameLayout) viewFindViewById2;
        this.f58556l = new es0.j(this);
        customTabLayoutView.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new k(this, context));
        kVar.d(true);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/FixedTabs$Item;", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements BaseItem {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f58569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BaseItem.Style f58570c;
        public Parcelable d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readString(), (Clause) parcel.readParcelable(Item.class.getClassLoader()), (BaseItem.Style) parcel.readParcelable(Item.class.getClassLoader()), parcel.readParcelable(Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String id10, Clause name, BaseItem.Style style, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f58568a = id10;
            this.f58569b = name;
            this.f58570c = style;
            this.d = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return Intrinsics.f(this.f58568a, item.f58568a) && Intrinsics.f(this.f58569b, item.f58569b) && Intrinsics.f(this.f58570c, item.f58570c) && Intrinsics.f(this.d, item.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.views.FixedTabs.BaseItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF58568a() {
            return this.f58568a;
        }

        @Override // com.revolut.core.ui_kit.views.FixedTabs.BaseItem
        /* JADX INFO: renamed from: h, reason: from getter */
        public final BaseItem.Style getF58570c() {
            return this.f58570c;
        }

        public final int hashCode() {
            int iHashCode = (this.f58570c.hashCode() + p.a.a(this.f58568a.hashCode() * 31, 31, this.f58569b)) * 31;
            Parcelable parcelable = this.d;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f58568a);
            dest.writeParcelable(this.f58569b, i);
            dest.writeParcelable(this.f58570c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ Item(String str, Clause clause, AnalyticsContext analyticsContext, int i) {
            this(str, clause, BaseItem.Style.Default.f58564a, (i & 8) != 0 ? null : analyticsContext);
        }
    }

    public /* synthetic */ FixedTabs(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
