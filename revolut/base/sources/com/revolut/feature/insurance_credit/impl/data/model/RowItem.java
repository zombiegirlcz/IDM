package com.revolut.feature.insurance_credit.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/RowItem;", "Lcom/revolut/feature/insurance_credit/impl/data/model/ContentItem;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RowItem implements ContentItem {

    @NotNull
    public static final Parcelable.Creator<RowItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75748b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RowItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RowItem[i];
        }
    }

    public RowItem(String name, String title) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f75747a = name;
        this.f75748b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RowItem)) {
            return false;
        }
        RowItem rowItem = (RowItem) obj2;
        return Intrinsics.f(this.f75747a, rowItem.f75747a) && Intrinsics.f(this.f75748b, rowItem.f75748b);
    }

    public final int hashCode() {
        return this.f75748b.hashCode() + (this.f75747a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75747a);
        dest.writeString(this.f75748b);
    }
}
