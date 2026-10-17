package com.revolut.feature.freelancer.common.models.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/onboarding/BusinessCategory;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BusinessCategory implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BusinessCategory> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73444c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BusinessCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BusinessCategory[i];
        }
    }

    public BusinessCategory(String id10, String name, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f73442a = id10;
        this.f73443b = name;
        this.f73444c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BusinessCategory)) {
            return false;
        }
        BusinessCategory businessCategory = (BusinessCategory) obj2;
        return Intrinsics.f(this.f73442a, businessCategory.f73442a) && Intrinsics.f(this.f73443b, businessCategory.f73443b) && this.f73444c == businessCategory.f73444c && Intrinsics.f(this.d, businessCategory.d) && Intrinsics.f(this.e, businessCategory.e) && Intrinsics.f(this.f, businessCategory.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f73442a.hashCode() * 31, 31, this.f73443b), 31, this.f73444c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73442a);
        dest.writeString(this.f73443b);
        dest.writeInt(this.f73444c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
