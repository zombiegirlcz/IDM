package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Back", "RenewOrEdit", "RevokeClicked", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$Back;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$RenewOrEdit;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$RevokeClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LinkedAccountConsentDetailsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$Back;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Back extends LinkedAccountConsentDetailsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Back f72804a = new Back();

        @NotNull
        public static final Parcelable.Creator<Back> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Back.f72804a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Back[i];
            }
        }

        private Back() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$RenewOrEdit;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenewOrEdit extends LinkedAccountConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<RenewOrEdit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72806b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenewOrEdit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenewOrEdit[i];
            }
        }

        public RenewOrEdit(String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72805a = institutionId;
            this.f72806b = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RenewOrEdit)) {
                return false;
            }
            RenewOrEdit renewOrEdit = (RenewOrEdit) obj2;
            return Intrinsics.f(this.f72805a, renewOrEdit.f72805a) && Intrinsics.f(this.f72806b, renewOrEdit.f72806b);
        }

        public final int hashCode() {
            return this.f72806b.hashCode() + (this.f72805a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72805a);
            dest.writeString(this.f72806b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData$RevokeClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeClicked extends LinkedAccountConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<RevokeClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72808b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeClicked(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeClicked[i];
            }
        }

        public RevokeClicked(String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72807a = institutionId;
            this.f72808b = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeClicked)) {
                return false;
            }
            RevokeClicked revokeClicked = (RevokeClicked) obj2;
            return Intrinsics.f(this.f72807a, revokeClicked.f72807a) && Intrinsics.f(this.f72808b, revokeClicked.f72808b);
        }

        public final int hashCode() {
            return this.f72808b.hashCode() + (this.f72807a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72807a);
            dest.writeString(this.f72808b);
        }
    }

    private LinkedAccountConsentDetailsScreenContract$OutputData() {
    }
}
