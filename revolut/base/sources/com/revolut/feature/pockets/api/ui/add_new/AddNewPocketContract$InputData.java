package com.revolut.feature.pockets.api.ui.add_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/api/ui/add_new/AddNewPocketContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddNewPocketContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddNewPocketContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f80786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedAccountId f80787b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddNewPocketContract$InputData(l.valueOf(parcel.readString()), (ExtendedAccountId) parcel.readParcelable(AddNewPocketContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddNewPocketContract$InputData[i];
        }
    }

    public AddNewPocketContract$InputData(l pocketType, ExtendedAccountId accountId) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80786a = pocketType;
        this.f80787b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddNewPocketContract$InputData)) {
            return false;
        }
        AddNewPocketContract$InputData addNewPocketContract$InputData = (AddNewPocketContract$InputData) obj2;
        return this.f80786a == addNewPocketContract$InputData.f80786a && Intrinsics.f(this.f80787b, addNewPocketContract$InputData.f80787b);
    }

    public final int hashCode() {
        return this.f80787b.hashCode() + (this.f80786a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80786a.name());
        dest.writeParcelable(this.f80787b, i);
    }
}
