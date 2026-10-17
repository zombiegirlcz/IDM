package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/PlusActionNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlusActionNavBarMenuItem extends NavBarMenuItem implements TrackableItem, oy0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59451c;
    public final Clause d;
    public Parcelable e;
    public final boolean f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PlusActionNavBarMenuItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static PlusActionNavBarMenuItem a(Companion companion, String listId, TextLocalisedClause textLocalisedClause, int i) {
            if ((i & 2) != 0) {
                textLocalisedClause = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            return new PlusActionNavBarMenuItem(listId, textLocalisedClause, false, null, null, false);
        }

        public static PlusActionNavBarMenuItem b(Companion companion, String listId, TextLocalisedClause contentDescription) {
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            return new PlusActionNavBarMenuItem(listId, null, false, contentDescription, null, false);
        }

        public static PlusActionNavBarMenuItem c(Companion companion, String listId, TextLocalisedClause text, TextLocalisedClause textLocalisedClause, int i) {
            if ((i & 8) != 0) {
                textLocalisedClause = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            return new PlusActionNavBarMenuItem(listId, text, false, textLocalisedClause, null, false);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Clause clause;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause2 = (Clause) parcel.readParcelable(PlusActionNavBarMenuItem.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            Clause clause3 = (Clause) parcel.readParcelable(PlusActionNavBarMenuItem.class.getClassLoader());
            Parcelable parcelable = parcel.readParcelable(PlusActionNavBarMenuItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                clause = clause3;
                z = true;
            } else {
                z = false;
                clause = clause3;
            }
            return new PlusActionNavBarMenuItem(string, clause2, z3, clause, parcelable, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlusActionNavBarMenuItem[i];
        }
    }

    public PlusActionNavBarMenuItem(String str, Clause clause, boolean z, Clause clause2, Parcelable parcelable, boolean z3) {
        this.f59449a = str;
        this.f59450b = clause;
        this.f59451c = z;
        this.d = clause2;
        this.e = parcelable;
        this.f = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF59449a() {
        return this.f59449a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlusActionNavBarMenuItem)) {
            return false;
        }
        PlusActionNavBarMenuItem plusActionNavBarMenuItem = (PlusActionNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59449a, plusActionNavBarMenuItem.f59449a) && Intrinsics.f(this.f59450b, plusActionNavBarMenuItem.f59450b) && this.f59451c == plusActionNavBarMenuItem.f59451c && Intrinsics.f(this.d, plusActionNavBarMenuItem.d) && Intrinsics.f(this.e, plusActionNavBarMenuItem.e) && this.f == plusActionNavBarMenuItem.f;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.e;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final Clause getF59450b() {
        return this.f59450b;
    }

    public final int hashCode() {
        int iHashCode = this.f59449a.hashCode() * 31;
        Clause clause = this.f59450b;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f59451c);
        Clause clause2 = this.d;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Parcelable parcelable = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59449a);
        dest.writeParcelable(this.f59450b, i);
        dest.writeInt(this.f59451c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
