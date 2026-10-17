package com.revolut.feature.backend_driven_limits.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import il2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/api/model/RestrictedFundItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_backend_driven_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictedFundItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RestrictedFundItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f63200c;
    public final RestrictedAmount d;
    public final RestrictedAmount e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            Parcelable.Creator<RestrictedAmount> creator = RestrictedAmount.CREATOR;
            return new RestrictedFundItem(string, string2, fVarValueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestrictedFundItem[i];
        }
    }

    public RestrictedFundItem(String title, String icon, f state, RestrictedAmount restrictedFundsConverted, RestrictedAmount restrictedAmount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(restrictedFundsConverted, "restrictedFundsConverted");
        this.f63198a = title;
        this.f63199b = icon;
        this.f63200c = state;
        this.d = restrictedFundsConverted;
        this.e = restrictedAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RestrictedFundItem)) {
            return false;
        }
        RestrictedFundItem restrictedFundItem = (RestrictedFundItem) obj2;
        return Intrinsics.f(this.f63198a, restrictedFundItem.f63198a) && Intrinsics.f(this.f63199b, restrictedFundItem.f63199b) && this.f63200c == restrictedFundItem.f63200c && Intrinsics.f(this.d, restrictedFundItem.d) && Intrinsics.f(this.e, restrictedFundItem.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f63200c.hashCode() + p.a.c(this.f63198a.hashCode() * 31, 31, this.f63199b)) * 31)) * 31;
        RestrictedAmount restrictedAmount = this.e;
        return iHashCode + (restrictedAmount == null ? 0 : restrictedAmount.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63198a);
        dest.writeString(this.f63199b);
        dest.writeString(this.f63200c.name());
        this.d.writeToParcel(dest, i);
        RestrictedAmount restrictedAmount = this.e;
        if (restrictedAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            restrictedAmount.writeToParcel(dest, i);
        }
    }
}
