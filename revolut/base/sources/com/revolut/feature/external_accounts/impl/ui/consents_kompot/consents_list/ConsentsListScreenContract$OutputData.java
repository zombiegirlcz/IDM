package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "ConsentClicked", "RevokeClicked", "InactiveConsentsClicked", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$ConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$InactiveConsentsClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$RevokeClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsentsListScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$ConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentClicked extends ConsentsListScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<ConsentClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingConsent f72783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72784b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentClicked((OpenBankingConsent) parcel.readParcelable(ConsentClicked.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentClicked[i];
            }
        }

        public ConsentClicked(OpenBankingConsent consent, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f72783a = consent;
            this.f72784b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentClicked)) {
                return false;
            }
            ConsentClicked consentClicked = (ConsentClicked) obj2;
            return Intrinsics.f(this.f72783a, consentClicked.f72783a) && this.f72784b == consentClicked.f72784b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72784b) + (this.f72783a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72783a, i);
            dest.writeInt(this.f72784b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$InactiveConsentsClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InactiveConsentsClicked extends ConsentsListScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InactiveConsentsClicked f72785a = new InactiveConsentsClicked();

        @NotNull
        public static final Parcelable.Creator<InactiveConsentsClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InactiveConsentsClicked.f72785a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InactiveConsentsClicked[i];
            }
        }

        private InactiveConsentsClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData$RevokeClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeClicked extends ConsentsListScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<RevokeClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingConsent f72786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72787b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeClicked((OpenBankingConsent) parcel.readParcelable(RevokeClicked.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeClicked[i];
            }
        }

        public RevokeClicked(OpenBankingConsent consent, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f72786a = consent;
            this.f72787b = z;
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
            return Intrinsics.f(this.f72786a, revokeClicked.f72786a) && this.f72787b == revokeClicked.f72787b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72787b) + (this.f72786a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72786a, i);
            dest.writeInt(this.f72787b ? 1 : 0);
        }
    }

    private ConsentsListScreenContract$OutputData() {
    }
}
