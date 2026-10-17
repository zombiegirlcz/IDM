package com.revolut.feature.apm.iris.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType", "Landroid/os/Parcelable;", "Area", "RecipientList", "NewContact", "Settings", "Pay", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Area;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$NewContact;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$RecipientList;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Settings;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IrisNavigation$StartType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Area;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType;", "<init>", "()V", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area implements IrisNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Area f62485a = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f62485a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$NewContact;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType;", "<init>", "()V", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact implements IrisNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f62486a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f62486a;
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType;", "Scanner", "Deeplink", "QrScan", "PendingAction", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$Deeplink;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$PendingAction;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$QrScan;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$Scanner;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Pay extends IrisNavigation$StartType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$Deeplink;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Deeplink implements Pay {

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62487a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Deeplink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Deeplink[i];
                }
            }

            public Deeplink(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f62487a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Deeplink) && Intrinsics.f(this.f62487a, ((Deeplink) obj2).f62487a);
            }

            public final int hashCode() {
                return this.f62487a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62487a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$PendingAction;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PendingAction implements Pay {

            @NotNull
            public static final Parcelable.Creator<PendingAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ApmPaymentAuthorisationSummary f62488a;

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
                this.f62488a = pendingAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PendingAction) && Intrinsics.f(this.f62488a, ((PendingAction) obj2).f62488a);
            }

            public final int hashCode() {
                return this.f62488a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62488a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$QrScan;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QrScan implements Pay {

            @NotNull
            public static final Parcelable.Creator<QrScan> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62489a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new QrScan(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QrScan[i];
                }
            }

            public QrScan(String qrCode) {
                Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                this.f62489a = qrCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof QrScan) && Intrinsics.f(this.f62489a, ((QrScan) obj2).f62489a);
            }

            public final int hashCode() {
                return this.f62489a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62489a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay$Scanner;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Pay;", "<init>", "()V", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Scanner implements Pay {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Scanner f62490a = new Scanner();

            @NotNull
            public static final Parcelable.Creator<Scanner> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Scanner.f62490a;
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$RecipientList;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType;", "<init>", "()V", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientList implements IrisNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientList f62491a = new RecipientList();

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientList.f62491a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType$Settings;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$StartType;", "<init>", "()V", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings implements IrisNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f62492a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f62492a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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
