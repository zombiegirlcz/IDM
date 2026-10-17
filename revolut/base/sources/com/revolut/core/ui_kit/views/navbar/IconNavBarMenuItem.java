package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.p0;
import tx0.q0;
import tx0.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\b\t\n\u000bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/IconNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "Companion", "tx0/r0", "tx0/p0", "tx0/q0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IconNavBarMenuItem extends NavBarMenuItem implements TrackableItem, oy0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f59237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59238c;
    public Parcelable d;
    public final NavBarMenuItemBadge e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimationRequest f59239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f59240h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<IconNavBarMenuItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static IconNavBarMenuItem a(Companion companion, String listId, ResourceImage icon, TextClause textClause, NavBarMenuItemBadge navBarMenuItemBadge, AnalyticsContext analyticsContext, int i) {
            TextClause textClause2 = (i & 4) != 0 ? null : textClause;
            NavBarMenuItemBadge badge = (i & 8) != 0 ? NavBarMenuItemBadge.None.f59309a : navBarMenuItemBadge;
            r0 style = r0.REGULAR;
            AnalyticsContext analyticsContext2 = (i & 32) != 0 ? null : analyticsContext;
            p0 appearance = p0.DEFAULT;
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Clause clause = textClause2;
            if (clause == null) {
                clause = icon.f59999h;
            }
            return new IconNavBarMenuItem(listId, icon, clause, analyticsContext2, badge, style, null, appearance);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IconNavBarMenuItem(parcel.readString(), (Image) parcel.readParcelable(IconNavBarMenuItem.class.getClassLoader()), (Clause) parcel.readParcelable(IconNavBarMenuItem.class.getClassLoader()), parcel.readParcelable(IconNavBarMenuItem.class.getClassLoader()), (NavBarMenuItemBadge) parcel.readParcelable(IconNavBarMenuItem.class.getClassLoader()), r0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AnimationRequest.CREATOR.createFromParcel(parcel), p0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IconNavBarMenuItem[i];
        }
    }

    public IconNavBarMenuItem(String str, Image image, Clause clause, Parcelable parcelable, NavBarMenuItemBadge navBarMenuItemBadge, r0 r0Var, AnimationRequest animationRequest, p0 p0Var) {
        this.f59236a = str;
        this.f59237b = image;
        this.f59238c = clause;
        this.d = parcelable;
        this.e = navBarMenuItemBadge;
        this.f = r0Var;
        this.f59239g = animationRequest;
        this.f59240h = p0Var;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final AnimationRequest getF59239g() {
        return this.f59239g;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final r0 getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p0 getF59240h() {
        return this.f59240h;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF58134a() {
        return this.f59236a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NavBarMenuItemBadge getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IconNavBarMenuItem)) {
            return false;
        }
        IconNavBarMenuItem iconNavBarMenuItem = (IconNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59236a, iconNavBarMenuItem.f59236a) && Intrinsics.f(this.f59237b, iconNavBarMenuItem.f59237b) && Intrinsics.f(this.f59238c, iconNavBarMenuItem.f59238c) && Intrinsics.f(this.d, iconNavBarMenuItem.d) && Intrinsics.f(this.e, iconNavBarMenuItem.e) && this.f == iconNavBarMenuItem.f && Intrinsics.f(this.f59239g, iconNavBarMenuItem.f59239g) && this.f59240h == iconNavBarMenuItem.f59240h;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF58137g() {
        return this.d;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF() {
        return this.f59238c;
    }

    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final Image getF59237b() {
        return this.f59237b;
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f59237b, this.f59236a.hashCode() * 31, 31);
        Clause clause = this.f59238c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Parcelable parcelable = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31)) * 31;
        AnimationRequest animationRequest = this.f59239g;
        return this.f59240h.hashCode() + ((iHashCode2 + (animationRequest != null ? animationRequest.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.d = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59236a);
        dest.writeParcelable(this.f59237b, i);
        dest.writeParcelable(this.f59238c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
        AnimationRequest animationRequest = this.f59239g;
        if (animationRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            animationRequest.writeToParcel(dest, i);
        }
        dest.writeString(this.f59240h.name());
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof IconNavBarMenuItem ? (IconNavBarMenuItem) oldItem : null) == null) {
            return null;
        }
        IconNavBarMenuItem iconNavBarMenuItem = (IconNavBarMenuItem) oldItem;
        return new q0(!Intrinsics.f(iconNavBarMenuItem.f59237b, this.f59237b), !Intrinsics.f(iconNavBarMenuItem.f59238c, this.f59238c), !Intrinsics.f(iconNavBarMenuItem.e, this.e), iconNavBarMenuItem.f != this.f, !Intrinsics.f(iconNavBarMenuItem.f59239g, this.f59239g), iconNavBarMenuItem.f59240h != this.f59240h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconNavBarMenuItem(String listId, ResourceImage icon, Clause contentDescription, NavBarMenuItemBadge navBarMenuItemBadge, int i) {
        r0 style = r0.REGULAR;
        NavBarMenuItemBadge badge = (i & 16) != 0 ? NavBarMenuItemBadge.None.f59309a : navBarMenuItemBadge;
        p0 appearance = p0.DEFAULT;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this(listId, icon, contentDescription, null, badge, style, null, appearance);
    }
}
