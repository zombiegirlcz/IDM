package com.revolut.retail.feature.plan_rewards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/plan_rewards/api/model/MonthlyDrawHub$BottomSheetItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MonthlyDrawHub$BottomSheetItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MonthlyDrawHub$BottomSheetItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102530c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MonthlyDrawHub$BottomSheetItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MonthlyDrawHub$BottomSheetItem[i];
        }
    }

    public MonthlyDrawHub$BottomSheetItem(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f102528a = str;
        this.f102529b = title;
        this.f102530c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MonthlyDrawHub$BottomSheetItem)) {
            return false;
        }
        MonthlyDrawHub$BottomSheetItem monthlyDrawHub$BottomSheetItem = (MonthlyDrawHub$BottomSheetItem) obj2;
        return Intrinsics.f(this.f102528a, monthlyDrawHub$BottomSheetItem.f102528a) && Intrinsics.f(this.f102529b, monthlyDrawHub$BottomSheetItem.f102529b) && Intrinsics.f(this.f102530c, monthlyDrawHub$BottomSheetItem.f102530c);
    }

    public final int hashCode() {
        String str = this.f102528a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f102529b);
        String str2 = this.f102530c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102528a);
        dest.writeString(this.f102529b);
        dest.writeString(this.f102530c);
    }
}
