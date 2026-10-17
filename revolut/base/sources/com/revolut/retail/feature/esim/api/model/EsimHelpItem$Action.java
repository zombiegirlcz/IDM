package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/api/model/EsimHelpItem$Action", "Landroid/os/Parcelable;", "OpenLink", "ShowBottomSheet", "InstallEsim", "ReinstallEsim", "LostOrStolenDevice", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$InstallEsim;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$LostOrStolenDevice;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$OpenLink;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$ReinstallEsim;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$ShowBottomSheet;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimHelpItem$Action extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$InstallEsim;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstallEsim implements EsimHelpItem$Action {

        @NotNull
        public static final Parcelable.Creator<InstallEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100271a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstallEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallEsim[i];
            }
        }

        public InstallEsim(String simProfileId) {
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f100271a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstallEsim) && Intrinsics.f(this.f100271a, ((InstallEsim) obj2).f100271a);
        }

        public final int hashCode() {
            return this.f100271a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100271a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$LostOrStolenDevice;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LostOrStolenDevice implements EsimHelpItem$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LostOrStolenDevice f100272a = new LostOrStolenDevice();

        @NotNull
        public static final Parcelable.Creator<LostOrStolenDevice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LostOrStolenDevice.f100272a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LostOrStolenDevice[i];
            }
        }

        private LostOrStolenDevice() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$OpenLink;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenLink implements EsimHelpItem$Action {

        @NotNull
        public static final Parcelable.Creator<OpenLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100273a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenLink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenLink[i];
            }
        }

        public OpenLink(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f100273a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenLink) && Intrinsics.f(this.f100273a, ((OpenLink) obj2).f100273a);
        }

        public final int hashCode() {
            return this.f100273a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100273a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$ReinstallEsim;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReinstallEsim implements EsimHelpItem$Action {

        @NotNull
        public static final Parcelable.Creator<ReinstallEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReinstallEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReinstallEsim[i];
            }
        }

        public ReinstallEsim(String simProfileId) {
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f100274a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReinstallEsim) && Intrinsics.f(this.f100274a, ((ReinstallEsim) obj2).f100274a);
        }

        public final int hashCode() {
            return this.f100274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100274a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action$ShowBottomSheet;", "Lcom/revolut/retail/feature/esim/api/model/EsimHelpItem$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBottomSheet implements EsimHelpItem$Action {

        @NotNull
        public static final Parcelable.Creator<ShowBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimInfoBottomSheetData f100275a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBottomSheet(EsimInfoBottomSheetData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBottomSheet[i];
            }
        }

        public ShowBottomSheet(EsimInfoBottomSheetData content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f100275a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBottomSheet) && Intrinsics.f(this.f100275a, ((ShowBottomSheet) obj2).f100275a);
        }

        public final int hashCode() {
            return this.f100275a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100275a.writeToParcel(dest, i);
        }
    }
}
