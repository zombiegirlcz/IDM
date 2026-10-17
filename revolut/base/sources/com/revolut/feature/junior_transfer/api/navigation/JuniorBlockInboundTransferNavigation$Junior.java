package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Junior", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorBlockInboundTransferNavigation$Junior implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorBlockInboundTransferNavigation$Junior> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77409b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorBlockInboundTransferNavigation$Junior(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorBlockInboundTransferNavigation$Junior[i];
        }
    }

    public JuniorBlockInboundTransferNavigation$Junior(String id10, String firstName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f77408a = id10;
        this.f77409b = firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorBlockInboundTransferNavigation$Junior)) {
            return false;
        }
        JuniorBlockInboundTransferNavigation$Junior juniorBlockInboundTransferNavigation$Junior = (JuniorBlockInboundTransferNavigation$Junior) obj2;
        return Intrinsics.f(this.f77408a, juniorBlockInboundTransferNavigation$Junior.f77408a) && Intrinsics.f(this.f77409b, juniorBlockInboundTransferNavigation$Junior.f77409b);
    }

    public final int hashCode() {
        return this.f77409b.hashCode() + (this.f77408a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77408a);
        dest.writeString(this.f77409b);
    }
}
