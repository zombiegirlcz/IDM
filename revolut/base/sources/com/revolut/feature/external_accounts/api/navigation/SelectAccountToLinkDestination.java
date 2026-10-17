package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/SelectAccountToLinkDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAccountToLinkDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SelectAccountToLinkDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitutionAuthData f72358a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAccountToLinkDestination(ExternalInstitutionAuthData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAccountToLinkDestination[i];
        }
    }

    public SelectAccountToLinkDestination(ExternalInstitutionAuthData authData) {
        Intrinsics.checkNotNullParameter(authData, "authData");
        this.f72358a = authData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExternalInstitutionAuthData getF72358a() {
        return this.f72358a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SelectAccountToLinkDestination) && Intrinsics.f(this.f72358a, ((SelectAccountToLinkDestination) obj2).f72358a);
    }

    public final int hashCode() {
        return this.f72358a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f72358a.writeToParcel(dest, i);
    }
}
