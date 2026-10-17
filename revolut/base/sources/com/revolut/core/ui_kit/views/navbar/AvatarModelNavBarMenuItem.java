package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/AvatarModelNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvatarModelNavBarMenuItem extends NavBarMenuItem implements TrackableItem, oy0.b {

    @NotNull
    public static final Parcelable.Creator<AvatarModelNavBarMenuItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel f59202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59203c;
    public Parcelable d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AvatarModelNavBarMenuItem(parcel.readString(), (AvatarModel) parcel.readParcelable(AvatarModelNavBarMenuItem.class.getClassLoader()), (Clause) parcel.readParcelable(AvatarModelNavBarMenuItem.class.getClassLoader()), parcel.readParcelable(AvatarModelNavBarMenuItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvatarModelNavBarMenuItem[i];
        }
    }

    public AvatarModelNavBarMenuItem(String listId, AvatarModel avatar, Clause contentDescription, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f59201a = listId;
        this.f59202b = avatar;
        this.f59203c = contentDescription;
        this.d = parcelable;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF59201a() {
        return this.f59201a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AvatarModelNavBarMenuItem)) {
            return false;
        }
        AvatarModelNavBarMenuItem avatarModelNavBarMenuItem = (AvatarModelNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59201a, avatarModelNavBarMenuItem.f59201a) && Intrinsics.f(this.f59202b, avatarModelNavBarMenuItem.f59202b) && Intrinsics.f(this.f59203c, avatarModelNavBarMenuItem.f59203c) && Intrinsics.f(this.d, avatarModelNavBarMenuItem.d);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getD() {
        return this.d;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59203c() {
        return this.f59203c;
    }

    public final int hashCode() {
        int iA = p.a.a((this.f59202b.hashCode() + (this.f59201a.hashCode() * 31)) * 31, 31, this.f59203c);
        Parcelable parcelable = this.d;
        return iA + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.d = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59201a);
        dest.writeParcelable(this.f59202b, i);
        dest.writeParcelable(this.f59203c, i);
        dest.writeParcelable(this.d, i);
    }
}
