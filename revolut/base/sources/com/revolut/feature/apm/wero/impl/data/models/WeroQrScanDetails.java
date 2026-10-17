package com.revolut.feature.apm.wero.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.wero.impl.common.ApmTransferDestinationWero;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails;", "Landroid/os/Parcelable;", "Chat", "Pay", "Authorisation", "Redirection", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Authorisation;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Chat;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Pay;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Redirection;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroQrScanDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Authorisation;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Authorisation implements WeroQrScanDetails {

        @NotNull
        public static final Parcelable.Creator<Authorisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f63040a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Authorisation((ApmPaymentAuthorisationSummary) parcel.readParcelable(Authorisation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Authorisation[i];
            }
        }

        public Authorisation(ApmPaymentAuthorisationSummary authorisation) {
            Intrinsics.checkNotNullParameter(authorisation, "authorisation");
            this.f63040a = authorisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Authorisation) && Intrinsics.f(this.f63040a, ((Authorisation) obj2).f63040a);
        }

        public final int hashCode() {
            return this.f63040a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63040a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Chat;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat implements WeroQrScanDetails {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeroContact f63041a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((WeroContact) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(WeroContact recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f63041a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f63041a, ((Chat) obj2).f63041a);
        }

        public final int hashCode() {
            return this.f63041a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63041a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Pay;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pay implements WeroQrScanDetails {

        @NotNull
        public static final Parcelable.Creator<Pay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferRecipient.Outgoing f63042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmTransferDestinationWero f63043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeroQrScanParams f63044c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pay((ApmTransferRecipient.Outgoing) parcel.readParcelable(Pay.class.getClassLoader()), ApmTransferDestinationWero.CREATOR.createFromParcel(parcel), WeroQrScanParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pay[i];
            }
        }

        public Pay(ApmTransferRecipient.Outgoing recipient, ApmTransferDestinationWero destinationConfig, WeroQrScanParams details) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
            Intrinsics.checkNotNullParameter(details, "details");
            this.f63042a = recipient;
            this.f63043b = destinationConfig;
            this.f63044c = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pay)) {
                return false;
            }
            Pay pay = (Pay) obj2;
            return Intrinsics.f(this.f63042a, pay.f63042a) && Intrinsics.f(this.f63043b, pay.f63043b) && Intrinsics.f(this.f63044c, pay.f63044c);
        }

        public final int hashCode() {
            return this.f63044c.hashCode() + ((this.f63043b.hashCode() + (this.f63042a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63042a, i);
            this.f63043b.writeToParcel(dest, i);
            this.f63044c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails$Redirection;", "Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Redirection implements WeroQrScanDetails {

        @NotNull
        public static final Parcelable.Creator<Redirection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63045a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Redirection[i];
            }
        }

        public Redirection(String str) {
            this.f63045a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Redirection) && Intrinsics.f(this.f63045a, ((Redirection) obj2).f63045a);
        }

        public final int hashCode() {
            String str = this.f63045a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63045a);
        }
    }
}
