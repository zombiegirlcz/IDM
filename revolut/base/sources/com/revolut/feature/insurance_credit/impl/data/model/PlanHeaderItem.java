package com.revolut.feature.insurance_credit.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/PlanHeaderItem;", "Lcom/revolut/feature/insurance_credit/impl/data/model/ContentItem;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanHeaderItem implements ContentItem {

    @NotNull
    public static final Parcelable.Creator<PlanHeaderItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75746c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanHeaderItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanHeaderItem[i];
        }
    }

    public PlanHeaderItem(String id10, String title, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f75744a = id10;
        this.f75745b = title;
        this.f75746c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanHeaderItem)) {
            return false;
        }
        PlanHeaderItem planHeaderItem = (PlanHeaderItem) obj2;
        return Intrinsics.f(this.f75744a, planHeaderItem.f75744a) && Intrinsics.f(this.f75745b, planHeaderItem.f75745b) && Intrinsics.f(this.f75746c, planHeaderItem.f75746c);
    }

    public final int hashCode() {
        return this.f75746c.hashCode() + p.a.c(this.f75744a.hashCode() * 31, 31, this.f75745b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75744a);
        dest.writeString(this.f75745b);
        dest.writeString(this.f75746c);
    }
}
