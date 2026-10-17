package com.revolut.feature.rewards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/SortCategory;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SortCategory implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SortCategory> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f84768c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SortCategory(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SortCategory[i];
        }
    }

    public SortCategory(int i, String id10, String name, List perkIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(perkIds, "perkIds");
        this.f84766a = id10;
        this.f84767b = name;
        this.f84768c = perkIds;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SortCategory)) {
            return false;
        }
        SortCategory sortCategory = (SortCategory) obj2;
        return Intrinsics.f(this.f84766a, sortCategory.f84766a) && Intrinsics.f(this.f84767b, sortCategory.f84767b) && Intrinsics.f(this.f84768c, sortCategory.f84768c) && this.d == sortCategory.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(p.a.c(this.f84766a.hashCode() * 31, 31, this.f84767b), 31, this.f84768c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84766a);
        dest.writeString(this.f84767b);
        dest.writeStringList(this.f84768c);
        dest.writeInt(this.d);
    }
}
