package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ActionNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class ActionNavBarMenuItem extends NavBarMenuItem implements TrackableItem, oy0.b {

    @NotNull
    public static final Parcelable.Creator<ActionNavBarMenuItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f59200c;
    public final Image d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActionNavBarMenuItem(parcel.readString(), (Clause) parcel.readParcelable(ActionNavBarMenuItem.class.getClassLoader()), parcel.readParcelable(ActionNavBarMenuItem.class.getClassLoader()), (Image) parcel.readParcelable(ActionNavBarMenuItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionNavBarMenuItem[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionNavBarMenuItem(Clause contentDescription, Image icon, String listId) {
        this(listId, contentDescription, null, icon);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF59198a() {
        return this.f59198a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActionNavBarMenuItem)) {
            return false;
        }
        ActionNavBarMenuItem actionNavBarMenuItem = (ActionNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59198a, actionNavBarMenuItem.f59198a) && Intrinsics.f(this.f59199b, actionNavBarMenuItem.f59199b) && Intrinsics.f(this.f59200c, actionNavBarMenuItem.f59200c) && Intrinsics.f(this.d, actionNavBarMenuItem.d);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF59200c() {
        return this.f59200c;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59199b() {
        return this.f59199b;
    }

    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final Image getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f59198a.hashCode() * 31;
        Clause clause = this.f59199b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Parcelable parcelable = this.f59200c;
        return this.d.hashCode() + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f59200c = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59198a);
        dest.writeParcelable(this.f59199b, i);
        dest.writeParcelable(this.f59200c, i);
        dest.writeParcelable(this.d, i);
    }

    public ActionNavBarMenuItem(String str, Clause clause, Parcelable parcelable, Image image) {
        this.f59198a = str;
        this.f59199b = clause;
        this.f59200c = parcelable;
        this.d = image;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionNavBarMenuItem(String listId, Image icon) {
        this(listId, icon.getF59199b(), null, icon);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
    }
}
