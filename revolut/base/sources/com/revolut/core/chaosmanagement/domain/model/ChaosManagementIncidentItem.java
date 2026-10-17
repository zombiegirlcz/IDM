package com.revolut.core.chaosmanagement.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/chaosmanagement/domain/model/ChaosManagementIncidentItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "nd0/a", "Banner", "core_chaos_management_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChaosManagementIncidentItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChaosManagementIncidentItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd0.a f51344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f51345c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/chaosmanagement/domain/model/ChaosManagementIncidentItem$Banner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ActionButton", "com/revolut/core/chaosmanagement/domain/model/a", "core_chaos_management_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Banner implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Banner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51348c;
        public final ActionButton d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/chaosmanagement/domain/model/ChaosManagementIncidentItem$Banner$ActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_chaos_management_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionButton implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ActionButton> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.revolut.core.chaosmanagement.domain.model.a f51351c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActionButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : com.revolut.core.chaosmanagement.domain.model.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActionButton[i];
                }
            }

            public ActionButton(String label, String str, com.revolut.core.chaosmanagement.domain.model.a aVar) {
                Intrinsics.checkNotNullParameter(label, "label");
                this.f51349a = label;
                this.f51350b = str;
                this.f51351c = aVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj2;
                return Intrinsics.f(this.f51349a, actionButton.f51349a) && Intrinsics.f(this.f51350b, actionButton.f51350b) && this.f51351c == actionButton.f51351c;
            }

            public final int hashCode() {
                int iHashCode = this.f51349a.hashCode() * 31;
                String str = this.f51350b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                com.revolut.core.chaosmanagement.domain.model.a aVar = this.f51351c;
                return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f51349a);
                dest.writeString(this.f51350b);
                com.revolut.core.chaosmanagement.domain.model.a aVar = this.f51351c;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar.name());
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Banner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Banner[i];
            }
        }

        public Banner(String title, String subtitle, String iconUrl, ActionButton actionButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            this.f51346a = title;
            this.f51347b = subtitle;
            this.f51348c = iconUrl;
            this.d = actionButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj2;
            return Intrinsics.f(this.f51346a, banner.f51346a) && Intrinsics.f(this.f51347b, banner.f51347b) && Intrinsics.f(this.f51348c, banner.f51348c) && Intrinsics.f(this.d, banner.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f51346a.hashCode() * 31, 31, this.f51347b), 31, this.f51348c);
            ActionButton actionButton = this.d;
            return iC + (actionButton == null ? 0 : actionButton.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51346a);
            dest.writeString(this.f51347b);
            dest.writeString(this.f51348c);
            ActionButton actionButton = this.d;
            if (actionButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            nd0.a aVarValueOf = nd0.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(nd0.a.valueOf(parcel.readString()), Banner.CREATOR.createFromParcel(parcel));
            }
            return new ChaosManagementIncidentItem(string, aVarValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChaosManagementIncidentItem[i];
        }
    }

    public ChaosManagementIncidentItem(String id10, nd0.a state, Map banners) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.f51343a = id10;
        this.f51344b = state;
        this.f51345c = banners;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChaosManagementIncidentItem)) {
            return false;
        }
        ChaosManagementIncidentItem chaosManagementIncidentItem = (ChaosManagementIncidentItem) obj2;
        return Intrinsics.f(this.f51343a, chaosManagementIncidentItem.f51343a) && this.f51344b == chaosManagementIncidentItem.f51344b && Intrinsics.f(this.f51345c, chaosManagementIncidentItem.f51345c);
    }

    public final int hashCode() {
        return this.f51345c.hashCode() + ((this.f51344b.hashCode() + (this.f51343a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51343a);
        dest.writeString(this.f51344b.name());
        Iterator itZ = j6.a.z(this.f51345c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((nd0.a) entry.getKey()).name());
            ((Banner) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
