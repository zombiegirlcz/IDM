package com.revolut.feature.apm.wero.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType", "Landroid/os/Parcelable;", "Area", "PaymentArea", "NewContact", "RecipientList", "Pay", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Area;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$NewContact;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$PaymentArea;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$RecipientList;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroNavigation$StartType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Area;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area implements WeroNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Area f63019a = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f63019a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        private Area() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$NewContact;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact implements WeroNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f63020a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f63020a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        private NewContact() {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType;", "URL", "Scanner", "ScannerDetails", "ShowUserCode", "RequestLinkDetails", "CreateRequestLink", "PendingAction", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$CreateRequestLink;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$PendingAction;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$RequestLinkDetails;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$Scanner;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$ScannerDetails;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$ShowUserCode;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$URL;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Pay extends WeroNavigation$StartType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$CreateRequestLink;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CreateRequestLink implements Pay {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CreateRequestLink f63021a = new CreateRequestLink();

            @NotNull
            public static final Parcelable.Creator<CreateRequestLink> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CreateRequestLink.f63021a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreateRequestLink[i];
                }
            }

            private CreateRequestLink() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$PendingAction;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PendingAction implements Pay {

            @NotNull
            public static final Parcelable.Creator<PendingAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ApmPaymentAuthorisationSummary f63022a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingAction((ApmPaymentAuthorisationSummary) parcel.readParcelable(PendingAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PendingAction[i];
                }
            }

            public PendingAction(ApmPaymentAuthorisationSummary pendingAction) {
                Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
                this.f63022a = pendingAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PendingAction) && Intrinsics.f(this.f63022a, ((PendingAction) obj2).f63022a);
            }

            public final int hashCode() {
                return this.f63022a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f63022a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$RequestLinkDetails;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestLinkDetails implements Pay {

            @NotNull
            public static final Parcelable.Creator<RequestLinkDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63023a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RequestLinkDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RequestLinkDetails[i];
                }
            }

            public RequestLinkDetails(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f63023a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RequestLinkDetails) && Intrinsics.f(this.f63023a, ((RequestLinkDetails) obj2).f63023a);
            }

            public final int hashCode() {
                return this.f63023a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63023a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$Scanner;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Scanner implements Pay {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Scanner f63024a = new Scanner();

            @NotNull
            public static final Parcelable.Creator<Scanner> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Scanner.f63024a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Scanner[i];
                }
            }

            private Scanner() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$ScannerDetails;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ScannerDetails implements Pay {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ScannerDetails f63025a = new ScannerDetails();

            @NotNull
            public static final Parcelable.Creator<ScannerDetails> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ScannerDetails.f63025a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ScannerDetails[i];
                }
            }

            private ScannerDetails() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$ShowUserCode;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ShowUserCode implements Pay {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ShowUserCode f63026a = new ShowUserCode();

            @NotNull
            public static final Parcelable.Creator<ShowUserCode> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowUserCode.f63026a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowUserCode[i];
                }
            }

            private ShowUserCode() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay$URL;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class URL implements Pay {

            @NotNull
            public static final Parcelable.Creator<URL> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63027a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new URL(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new URL[i];
                }
            }

            public URL(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f63027a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof URL) && Intrinsics.f(this.f63027a, ((URL) obj2).f63027a);
            }

            public final int hashCode() {
                return this.f63027a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63027a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$PaymentArea;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentArea implements WeroNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentArea f63028a = new PaymentArea();

        @NotNull
        public static final Parcelable.Creator<PaymentArea> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentArea.f63028a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentArea[i];
            }
        }

        private PaymentArea() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType$RecipientList;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$StartType;", "<init>", "()V", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientList implements WeroNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientList f63029a = new RecipientList();

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientList.f63029a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientList[i];
            }
        }

        private RecipientList() {
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
}
