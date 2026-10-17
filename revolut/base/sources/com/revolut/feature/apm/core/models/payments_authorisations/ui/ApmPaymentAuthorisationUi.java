package com.revolut.feature.apm.core.models.payments_authorisations.ui;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ui/ApmPaymentAuthorisationUi;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "TimerInfo", "MerchantInfo", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentAuthorisationUi implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentAuthorisationUi> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimerInfo f62086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MerchantInfo f62087b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ui/ApmPaymentAuthorisationUi$MerchantInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f62090c;
        public final Image d;
        public final long e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantInfo(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Image) parcel.readParcelable(MerchantInfo.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantInfo[i];
            }
        }

        public MerchantInfo(String name, String str, d dVar, Image logo, long j2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.f62088a = name;
            this.f62089b = str;
            this.f62090c = dVar;
            this.d = logo;
            this.e = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) obj2;
            return Intrinsics.f(this.f62088a, merchantInfo.f62088a) && Intrinsics.f(this.f62089b, merchantInfo.f62089b) && Intrinsics.f(this.f62090c, merchantInfo.f62090c) && Intrinsics.f(this.d, merchantInfo.d) && this.e == merchantInfo.e;
        }

        public final int hashCode() {
            int iHashCode = this.f62088a.hashCode() * 31;
            String str = this.f62089b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f62090c;
            return Long.hashCode(this.e) + b.c(this.d, (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62088a);
            dest.writeString(this.f62089b);
            dest.writeSerializable(this.f62090c);
            dest.writeParcelable(this.d, i);
            dest.writeLong(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ui/ApmPaymentAuthorisationUi$TimerInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimerInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TimerInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62092b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimerInfo(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimerInfo[i];
            }
        }

        public TimerInfo(long j2, long j3) {
            this.f62091a = j2;
            this.f62092b = j3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TimerInfo)) {
                return false;
            }
            TimerInfo timerInfo = (TimerInfo) obj2;
            return this.f62091a == timerInfo.f62091a && this.f62092b == timerInfo.f62092b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62092b) + (Long.hashCode(this.f62091a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f62091a);
            dest.writeLong(this.f62092b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentAuthorisationUi(parcel.readInt() == 0 ? null : TimerInfo.CREATOR.createFromParcel(parcel), MerchantInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentAuthorisationUi[i];
        }
    }

    public ApmPaymentAuthorisationUi(TimerInfo timerInfo, MerchantInfo merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f62086a = timerInfo;
        this.f62087b = merchant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentAuthorisationUi)) {
            return false;
        }
        ApmPaymentAuthorisationUi apmPaymentAuthorisationUi = (ApmPaymentAuthorisationUi) obj2;
        return Intrinsics.f(this.f62086a, apmPaymentAuthorisationUi.f62086a) && Intrinsics.f(this.f62087b, apmPaymentAuthorisationUi.f62087b);
    }

    public final int hashCode() {
        TimerInfo timerInfo = this.f62086a;
        return this.f62087b.hashCode() + ((timerInfo == null ? 0 : timerInfo.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TimerInfo timerInfo = this.f62086a;
        if (timerInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            timerInfo.writeToParcel(dest, i);
        }
        this.f62087b.writeToParcel(dest, i);
    }
}
