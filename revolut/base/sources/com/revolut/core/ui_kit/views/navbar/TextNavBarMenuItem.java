package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.r4;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/TextNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "tx0/r4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextNavBarMenuItem extends NavBarMenuItem implements TrackableItem {

    @NotNull
    public static final Parcelable.Creator<TextNavBarMenuItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4 f59490c;
    public Parcelable d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextNavBarMenuItem(parcel.readString(), (Clause) parcel.readParcelable(TextNavBarMenuItem.class.getClassLoader()), r4.valueOf(parcel.readString()), parcel.readParcelable(TextNavBarMenuItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextNavBarMenuItem[i];
        }
    }

    public TextNavBarMenuItem(String listId, Clause text, r4 variant, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f59488a = listId;
        this.f59489b = text;
        this.f59490c = variant;
        this.d = parcelable;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r4 getF59490c() {
        return this.f59490c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF59488a() {
        return this.f59488a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextNavBarMenuItem)) {
            return false;
        }
        TextNavBarMenuItem textNavBarMenuItem = (TextNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59488a, textNavBarMenuItem.f59488a) && Intrinsics.f(this.f59489b, textNavBarMenuItem.f59489b) && this.f59490c == textNavBarMenuItem.f59490c && Intrinsics.f(this.d, textNavBarMenuItem.d);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final Clause getF59489b() {
        return this.f59489b;
    }

    public final int hashCode() {
        int iHashCode = (this.f59490c.hashCode() + p.a.a(this.f59488a.hashCode() * 31, 31, this.f59489b)) * 31;
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
        dest.writeString(this.f59488a);
        dest.writeParcelable(this.f59489b, i);
        dest.writeString(this.f59490c.name());
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ TextNavBarMenuItem(String str, Clause clause, r4 r4Var, Parcelable parcelable, int i) {
        this(str, clause, (i & 4) != 0 ? r4.ACTION : r4Var, (i & 8) != 0 ? null : parcelable);
    }
}
