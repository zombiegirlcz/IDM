package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/api/navigation/PseNavigation$Destination$AuthorisationRequest", "", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseNavigation$Destination$AuthorisationRequest implements KompotDestination, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PseNavigation$Destination$AuthorisationRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72356a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseNavigation$Destination$AuthorisationRequest(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseNavigation$Destination$AuthorisationRequest[i];
        }
    }

    public PseNavigation$Destination$AuthorisationRequest(String authorisationId) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        this.f72356a = authorisationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PseNavigation$Destination$AuthorisationRequest) && Intrinsics.f(this.f72356a, ((PseNavigation$Destination$AuthorisationRequest) obj2).f72356a);
    }

    public final int hashCode() {
        return this.f72356a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72356a);
    }
}
