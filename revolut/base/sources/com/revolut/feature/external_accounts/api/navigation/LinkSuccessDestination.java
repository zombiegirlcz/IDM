package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/LinkSuccessDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkSuccessDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<LinkSuccessDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f72334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72335c;
    public final ExternalAccountsFeatureConfig.LinkSuccess.UseCase d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkSuccessDestination(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (ExternalAccountsFeatureConfig.LinkSuccess.UseCase) parcel.readParcelable(LinkSuccessDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkSuccessDestination[i];
        }
    }

    public LinkSuccessDestination(String institutionId, boolean z, boolean z3, ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f72333a = institutionId;
        this.f72334b = z;
        this.f72335c = z3;
        this.d = useCase;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF72333a() {
        return this.f72333a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF72335c() {
        return this.f72335c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF72334b() {
        return this.f72334b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ExternalAccountsFeatureConfig.LinkSuccess.UseCase getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkSuccessDestination)) {
            return false;
        }
        LinkSuccessDestination linkSuccessDestination = (LinkSuccessDestination) obj2;
        return Intrinsics.f(this.f72333a, linkSuccessDestination.f72333a) && this.f72334b == linkSuccessDestination.f72334b && this.f72335c == linkSuccessDestination.f72335c && Intrinsics.f(this.d, linkSuccessDestination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f72333a.hashCode() * 31, 31, this.f72334b), 31, this.f72335c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72333a);
        dest.writeInt(this.f72334b ? 1 : 0);
        dest.writeInt(this.f72335c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
