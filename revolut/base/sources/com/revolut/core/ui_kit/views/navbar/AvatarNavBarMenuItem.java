package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/AvatarNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvatarNavBarMenuItem extends NavBarMenuItem implements TrackableItem, oy0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f59205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f59206c;
    public Parcelable d;
    public final Clause e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AvatarNavBarMenuItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AvatarNavBarMenuItem a(Companion companion, String listId, Image image, CircleBadgeModel circleBadgeModel, int i) {
            if ((i & 4) != 0) {
                circleBadgeModel = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            return new AvatarNavBarMenuItem(listId, image, circleBadgeModel, null, image.getF59868g());
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AvatarNavBarMenuItem(parcel.readString(), (Image) parcel.readParcelable(AvatarNavBarMenuItem.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(AvatarNavBarMenuItem.class.getClassLoader()), parcel.readParcelable(AvatarNavBarMenuItem.class.getClassLoader()), (Clause) parcel.readParcelable(AvatarNavBarMenuItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvatarNavBarMenuItem[i];
        }
    }

    public AvatarNavBarMenuItem(String str, Image image, CircleBadgeModel circleBadgeModel, Parcelable parcelable, Clause clause) {
        this.f59204a = str;
        this.f59205b = image;
        this.f59206c = circleBadgeModel;
        this.d = parcelable;
        this.e = clause;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CircleBadgeModel getF59206c() {
        return this.f59206c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52866a() {
        return this.f59204a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AvatarNavBarMenuItem)) {
            return false;
        }
        AvatarNavBarMenuItem avatarNavBarMenuItem = (AvatarNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59204a, avatarNavBarMenuItem.f59204a) && Intrinsics.f(this.f59205b, avatarNavBarMenuItem.f59205b) && Intrinsics.f(this.f59206c, avatarNavBarMenuItem.f59206c) && Intrinsics.f(this.d, avatarNavBarMenuItem.d) && Intrinsics.f(this.e, avatarNavBarMenuItem.e);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF52873m() {
        return this.d;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF60005c() {
        return this.e;
    }

    /* JADX INFO: renamed from: getImage, reason: from getter */
    public final Image getF59205b() {
        return this.f59205b;
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f59205b, this.f59204a.hashCode() * 31, 31);
        CircleBadgeModel circleBadgeModel = this.f59206c;
        int iHashCode = (iC + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
        Parcelable parcelable = this.d;
        int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.d = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59204a);
        dest.writeParcelable(this.f59205b, i);
        dest.writeParcelable(this.f59206c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
