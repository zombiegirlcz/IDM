package com.revolut.feature.referrals.common.data.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/BenefitItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BenefitItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BenefitItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final owa.a f81685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81687c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BenefitItem(owa.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BenefitItem[i];
        }
    }

    public BenefitItem(owa.a code, String title, String description) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f81685a = code;
        this.f81686b = title;
        this.f81687c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BenefitItem)) {
            return false;
        }
        BenefitItem benefitItem = (BenefitItem) obj2;
        return this.f81685a == benefitItem.f81685a && Intrinsics.f(this.f81686b, benefitItem.f81686b) && Intrinsics.f(this.f81687c, benefitItem.f81687c);
    }

    public final int hashCode() {
        return this.f81687c.hashCode() + p.a.c(this.f81685a.hashCode() * 31, 31, this.f81686b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81685a.name());
        dest.writeString(this.f81686b);
        dest.writeString(this.f81687c);
    }
}
