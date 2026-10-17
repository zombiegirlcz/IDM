package com.revolut.feature.rewards.api.model.concierge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/concierge/Cell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Subtitle", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Cell implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Cell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Subtitle f84774c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/concierge/Cell$Subtitle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/rewards/api/model/concierge/a", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subtitle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Subtitle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.rewards.api.model.concierge.a f84776b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subtitle(parcel.readString(), com.revolut.feature.rewards.api.model.concierge.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subtitle[i];
            }
        }

        public Subtitle(String text, com.revolut.feature.rewards.api.model.concierge.a color) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            this.f84775a = text;
            this.f84776b = color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj2;
            return Intrinsics.f(this.f84775a, subtitle.f84775a) && this.f84776b == subtitle.f84776b;
        }

        public final int hashCode() {
            return this.f84776b.hashCode() + (this.f84775a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84775a);
            dest.writeString(this.f84776b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Cell(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Subtitle.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Cell[i];
        }
    }

    public Cell(String icon, String title, Subtitle subtitle, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f84772a = icon;
        this.f84773b = title;
        this.f84774c = subtitle;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Cell)) {
            return false;
        }
        Cell cell = (Cell) obj2;
        return Intrinsics.f(this.f84772a, cell.f84772a) && Intrinsics.f(this.f84773b, cell.f84773b) && Intrinsics.f(this.f84774c, cell.f84774c) && Intrinsics.f(this.d, cell.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f84772a.hashCode() * 31, 31, this.f84773b);
        Subtitle subtitle = this.f84774c;
        int iHashCode = (iC + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84772a);
        dest.writeString(this.f84773b);
        Subtitle subtitle = this.f84774c;
        if (subtitle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subtitle.writeToParcel(dest, i);
        }
        dest.writeString(this.d);
    }
}
