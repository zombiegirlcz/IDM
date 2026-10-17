package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/pix/api/navigation/PixAliasNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "Registration", "Lcom/revolut/feature/pix/api/navigation/PixAliasNavigation$InputData$Registration;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixAliasNavigation$InputData extends PixNavigation$InputData {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixAliasNavigation$InputData$Registration;", "Lcom/revolut/feature/pix/api/navigation/PixAliasNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registration implements PixAliasNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f80492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AliasRegistrationType f80493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80494c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registration((AccountId) parcel.readParcelable(Registration.class.getClassLoader()), (AliasRegistrationType) parcel.readParcelable(Registration.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registration[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Registration() {
            this((AliasRegistrationType.RandomKey) null, (d) (0 == true ? 1 : 0), 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Registration)) {
                return false;
            }
            Registration registration = (Registration) obj2;
            return Intrinsics.f(this.f80492a, registration.f80492a) && Intrinsics.f(this.f80493b, registration.f80493b) && Intrinsics.f(this.f80494c, registration.f80494c);
        }

        public final int hashCode() {
            int iHashCode = this.f80492a.hashCode() * 31;
            AliasRegistrationType aliasRegistrationType = this.f80493b;
            int iHashCode2 = (iHashCode + (aliasRegistrationType == null ? 0 : aliasRegistrationType.hashCode())) * 31;
            d dVar = this.f80494c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80492a, i);
            dest.writeParcelable(this.f80493b, i);
            dest.writeSerializable(this.f80494c);
        }

        public Registration(AccountId accountId, AliasRegistrationType aliasRegistrationType, d dVar) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80492a = accountId;
            this.f80493b = aliasRegistrationType;
            this.f80494c = dVar;
        }

        public /* synthetic */ Registration(AliasRegistrationType.RandomKey randomKey, d dVar, int i) {
            this(AccountId.Personal.f51414a, (i & 2) != 0 ? null : randomKey, (i & 4) != 0 ? null : dVar);
        }
    }
}
