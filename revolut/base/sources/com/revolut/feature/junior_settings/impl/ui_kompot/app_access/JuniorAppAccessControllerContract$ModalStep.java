package com.revolut.feature.junior_settings.impl.ui_kompot.app_access;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PersonalDataManagementConsent", "InvitationSharingProductArticle", "PhoneRemovalConfirmation", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$InvitationSharingProductArticle;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$PersonalDataManagementConsent;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$PhoneRemovalConfirmation;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAppAccessControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$InvitationSharingProductArticle;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationSharingProductArticle implements JuniorAppAccessControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InvitationSharingProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f77278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationSharingProductArticle((ProductArticleParams) parcel.readParcelable(InvitationSharingProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationSharingProductArticle[i];
            }
        }

        public InvitationSharingProductArticle(ProductArticleParams productArticleParam) {
            Intrinsics.checkNotNullParameter(productArticleParam, "productArticleParam");
            this.f77278a = productArticleParam;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvitationSharingProductArticle) && Intrinsics.f(this.f77278a, ((InvitationSharingProductArticle) obj2).f77278a);
        }

        public final int hashCode() {
            return this.f77278a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77278a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$PersonalDataManagementConsent;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalDataManagementConsent implements JuniorAppAccessControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PersonalDataManagementConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77279a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalDataManagementConsent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDataManagementConsent[i];
            }
        }

        public PersonalDataManagementConsent(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f77279a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PersonalDataManagementConsent) && Intrinsics.f(this.f77279a, ((PersonalDataManagementConsent) obj2).f77279a);
        }

        public final int hashCode() {
            return this.f77279a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77279a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep$PhoneRemovalConfirmation;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneRemovalConfirmation implements JuniorAppAccessControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneRemovalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod f77282c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneRemovalConfirmation(parcel.readString(), parcel.readString(), (PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod) parcel.readParcelable(PhoneRemovalConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneRemovalConfirmation[i];
            }
        }

        public PhoneRemovalConfirmation(String juniorId, String juniorFirstName, PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod phoneNumberRemovalMethod) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            Intrinsics.checkNotNullParameter(phoneNumberRemovalMethod, "phoneNumberRemovalMethod");
            this.f77280a = juniorId;
            this.f77281b = juniorFirstName;
            this.f77282c = phoneNumberRemovalMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneRemovalConfirmation)) {
                return false;
            }
            PhoneRemovalConfirmation phoneRemovalConfirmation = (PhoneRemovalConfirmation) obj2;
            return Intrinsics.f(this.f77280a, phoneRemovalConfirmation.f77280a) && Intrinsics.f(this.f77281b, phoneRemovalConfirmation.f77281b) && Intrinsics.f(this.f77282c, phoneRemovalConfirmation.f77282c);
        }

        public final int hashCode() {
            return this.f77282c.hashCode() + p.a.c(this.f77280a.hashCode() * 31, 31, this.f77281b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77280a);
            dest.writeString(this.f77281b);
            dest.writeParcelable(this.f77282c, i);
        }
    }
}
