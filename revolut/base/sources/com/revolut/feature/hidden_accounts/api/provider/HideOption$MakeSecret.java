package com.revolut.feature.hidden_accounts.api.provider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/hidden_accounts/api/provider/HideOption$MakeSecret", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HideOption$MakeSecret implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HideOption$MakeSecret f74651a = new HideOption$MakeSecret();

    @NotNull
    public static final Parcelable.Creator<HideOption$MakeSecret> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return HideOption$MakeSecret.f74651a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HideOption$MakeSecret[i];
        }
    }

    private HideOption$MakeSecret() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof HideOption$MakeSecret);
    }

    public final int hashCode() {
        return -1833851213;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
