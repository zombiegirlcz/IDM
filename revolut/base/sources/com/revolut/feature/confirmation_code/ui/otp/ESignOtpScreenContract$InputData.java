package com.revolut.feature.confirmation_code.ui.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.confirmation_code.data.OtpTask;
import com.revolut.kompot.common.IOData$Input;
import ft3.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ESignOtpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ESignOtpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f65951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OtpTask f65952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65953c;
    public final boolean d;
    public final ESignOtpScreenContract$OtpChannelConfig e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f65954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f65955h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsContext f65956j;
    public h1 k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode;", "Landroid/os/Parcelable;", "Synchronous", "Asynchronous", "Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode$Asynchronous;", "Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode$Synchronous;", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode$Asynchronous;", "Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Asynchronous implements Mode {

            @NotNull
            public static final Parcelable.Creator<Asynchronous> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f65957a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f65958b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f65959c;
            public final Clause d;
            public final Clause e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Asynchronous((Clause) parcel.readParcelable(Asynchronous.class.getClassLoader()), (Clause) parcel.readParcelable(Asynchronous.class.getClassLoader()), (Clause) parcel.readParcelable(Asynchronous.class.getClassLoader()), (Clause) parcel.readParcelable(Asynchronous.class.getClassLoader()), (Clause) parcel.readParcelable(Asynchronous.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Asynchronous[i];
                }
            }

            public Asynchronous(Clause dialogTitle, Clause generalErrorDialogTitle, Clause generalErrorDialogButton, Clause invalidCodeDialogTitle, Clause invalidCodeDialogButton) {
                Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
                Intrinsics.checkNotNullParameter(generalErrorDialogTitle, "generalErrorDialogTitle");
                Intrinsics.checkNotNullParameter(generalErrorDialogButton, "generalErrorDialogButton");
                Intrinsics.checkNotNullParameter(invalidCodeDialogTitle, "invalidCodeDialogTitle");
                Intrinsics.checkNotNullParameter(invalidCodeDialogButton, "invalidCodeDialogButton");
                this.f65957a = dialogTitle;
                this.f65958b = generalErrorDialogTitle;
                this.f65959c = generalErrorDialogButton;
                this.d = invalidCodeDialogTitle;
                this.e = invalidCodeDialogButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Asynchronous)) {
                    return false;
                }
                Asynchronous asynchronous = (Asynchronous) obj2;
                return Intrinsics.f(this.f65957a, asynchronous.f65957a) && Intrinsics.f(this.f65958b, asynchronous.f65958b) && Intrinsics.f(this.f65959c, asynchronous.f65959c) && Intrinsics.f(this.d, asynchronous.d) && Intrinsics.f(this.e, asynchronous.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + p.a.a(p.a.a(p.a.a(this.f65957a.hashCode() * 31, 31, this.f65958b), 31, this.f65959c), 31, this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f65957a, i);
                dest.writeParcelable(this.f65958b, i);
                dest.writeParcelable(this.f65959c, i);
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode$Synchronous;", "Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$InputData$Mode;", "<init>", "()V", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Synchronous implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Synchronous f65960a = new Synchronous();

            @NotNull
            public static final Parcelable.Creator<Synchronous> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Synchronous.f65960a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Synchronous[i];
                }
            }

            private Synchronous() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ESignOtpScreenContract$InputData((Mode) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), (OtpTask) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, ESignOtpScreenContract$OtpChannelConfig.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), (Image) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(ESignOtpScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ESignOtpScreenContract$InputData[i];
        }
    }

    public ESignOtpScreenContract$InputData(Mode mode, OtpTask otpTask, String phoneNumber, boolean z, ESignOtpScreenContract$OtpChannelConfig otpChannelConfig, Clause clause, Clause clause2, Image image, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(otpTask, "otpTask");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otpChannelConfig, "otpChannelConfig");
        this.f65951a = mode;
        this.f65952b = otpTask;
        this.f65953c = phoneNumber;
        this.d = z;
        this.e = otpChannelConfig;
        this.f = clause;
        this.f65954g = clause2;
        this.f65955h = image;
        this.i = analyticsProduct;
        this.f65956j = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ESignOtpScreenContract$InputData)) {
            return false;
        }
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = (ESignOtpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65951a, eSignOtpScreenContract$InputData.f65951a) && Intrinsics.f(this.f65952b, eSignOtpScreenContract$InputData.f65952b) && Intrinsics.f(this.f65953c, eSignOtpScreenContract$InputData.f65953c) && this.d == eSignOtpScreenContract$InputData.d && Intrinsics.f(this.e, eSignOtpScreenContract$InputData.e) && Intrinsics.f(this.f, eSignOtpScreenContract$InputData.f) && Intrinsics.f(this.f65954g, eSignOtpScreenContract$InputData.f65954g) && Intrinsics.f(this.f65955h, eSignOtpScreenContract$InputData.f65955h) && Intrinsics.f(this.i, eSignOtpScreenContract$InputData.i) && Intrinsics.f(this.f65956j, eSignOtpScreenContract$InputData.f65956j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.c(p.a.c((this.f65952b.hashCode() + (this.f65951a.hashCode() * 31)) * 31, 31, this.f65953c), 31, this.d)) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f65954g;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f65955h;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.i;
        int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f65956j;
        return iHashCode5 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65951a, i);
        dest.writeParcelable(this.f65952b, i);
        dest.writeString(this.f65953c);
        dest.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(dest, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f65954g, i);
        dest.writeParcelable(this.f65955h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f65956j, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ESignOtpScreenContract$InputData(Mode mode, OtpTask otpTask, String str, boolean z, ESignOtpScreenContract$OtpChannelConfig eSignOtpScreenContract$OtpChannelConfig, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ResourceImage resourceImage, AnalyticsProduct.Retail retail, int i) {
        nk3.a aVar = null;
        this(mode, otpTask, str, z, (i & 16) != 0 ? new ESignOtpScreenContract$OtpChannelConfig(aVar, aVar, 7) : eSignOtpScreenContract$OtpChannelConfig, (i & 32) != 0 ? null : textLocalisedClause, (i & 64) != 0 ? null : textLocalisedClause2, resourceImage, (i & 256) != 0 ? null : retail, (AnalyticsContext) null);
    }
}
