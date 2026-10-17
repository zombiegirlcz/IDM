package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/api/navigation/PixAreaNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixAreaNavigation$InputData implements PixNavigation$InputData {

    @NotNull
    public static final Parcelable.Creator<PixAreaNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80496a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixAreaNavigation$InputData((AccountId) parcel.readParcelable(PixAreaNavigation$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAreaNavigation$InputData[i];
        }
    }

    public PixAreaNavigation$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PixAreaNavigation$InputData) && Intrinsics.f(this.f80496a, ((PixAreaNavigation$InputData) obj2).f80496a);
    }

    public final int hashCode() {
        return this.f80496a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80496a, i);
    }

    public PixAreaNavigation$InputData(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80496a = accountId;
    }

    public /* synthetic */ PixAreaNavigation$InputData(int i) {
        this(AccountId.Personal.f51414a);
    }
}
