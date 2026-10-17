package com.revolut.feature.external_accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/ExternalInstitutionAuthData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionAuthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExternalInstitutionAuthData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72215c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalInstitutionAuthData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalInstitutionAuthData[i];
        }
    }

    public ExternalInstitutionAuthData(String institutionId, String state, String authToken) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        this.f72213a = institutionId;
        this.f72214b = state;
        this.f72215c = authToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalInstitutionAuthData)) {
            return false;
        }
        ExternalInstitutionAuthData externalInstitutionAuthData = (ExternalInstitutionAuthData) obj2;
        return Intrinsics.f(this.f72213a, externalInstitutionAuthData.f72213a) && Intrinsics.f(this.f72214b, externalInstitutionAuthData.f72214b) && Intrinsics.f(this.f72215c, externalInstitutionAuthData.f72215c);
    }

    public final int hashCode() {
        return this.f72215c.hashCode() + p.a.c(this.f72213a.hashCode() * 31, 31, this.f72214b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72213a);
        dest.writeString(this.f72214b);
        dest.writeString(this.f72215c);
    }
}
