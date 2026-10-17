package com.revolut.retail.feature.balance.picker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/TeenInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TeenInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TeenInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99461b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TeenInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TeenInfo[i];
        }
    }

    public TeenInfo(String id10, String firstName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f99460a = id10;
        this.f99461b = firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TeenInfo)) {
            return false;
        }
        TeenInfo teenInfo = (TeenInfo) obj2;
        return Intrinsics.f(this.f99460a, teenInfo.f99460a) && Intrinsics.f(this.f99461b, teenInfo.f99461b);
    }

    public final int hashCode() {
        return this.f99461b.hashCode() + (this.f99460a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99460a);
        dest.writeString(this.f99461b);
    }
}
