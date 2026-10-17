package com.revolut.feature.apm.core.models.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "Landroid/os/Parcelable;", "AANI", "ALIPAY_PLUS", "BIZUM", "BLIK_P2P", "BREB", "IRIS", "MBWAY", "PIX", "GIRO_QVIK", "GIRO_ALIAS", "UPI", "WERO", "BPAY", "F24", "MBREF", "TAPI", "TAPI_CO", "PSE", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$AANI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$ALIPAY_PLUS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BIZUM;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BLIK_P2P;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BPAY;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BREB;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$F24;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$GIRO_ALIAS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$GIRO_QVIK;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$IRIS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$MBREF;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$MBWAY;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$PIX;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$PSE;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$TAPI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$TAPI_CO;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$UPI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$WERO;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmPaymentMethod extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$AANI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AANI implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AANI f62162a = new AANI();

        @NotNull
        public static final Parcelable.Creator<AANI> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AANI.f62162a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AANI[i];
            }
        }

        private AANI() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "AANI";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$ALIPAY_PLUS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ALIPAY_PLUS implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ALIPAY_PLUS f62163a = new ALIPAY_PLUS();

        @NotNull
        public static final Parcelable.Creator<ALIPAY_PLUS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ALIPAY_PLUS.f62163a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ALIPAY_PLUS[i];
            }
        }

        private ALIPAY_PLUS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "ALIPAY_PLUS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BIZUM;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BIZUM implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BIZUM f62164a = new BIZUM();

        @NotNull
        public static final Parcelable.Creator<BIZUM> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BIZUM.f62164a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BIZUM[i];
            }
        }

        private BIZUM() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "BIZUM";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BLIK_P2P;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BLIK_P2P implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BLIK_P2P f62165a = new BLIK_P2P();

        @NotNull
        public static final Parcelable.Creator<BLIK_P2P> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BLIK_P2P.f62165a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BLIK_P2P[i];
            }
        }

        private BLIK_P2P() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "BLIK_P2P";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BPAY;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BPAY implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BPAY f62166a = new BPAY();

        @NotNull
        public static final Parcelable.Creator<BPAY> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BPAY.f62166a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BPAY[i];
            }
        }

        private BPAY() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "BPAY";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$BREB;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BREB implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BREB f62167a = new BREB();

        @NotNull
        public static final Parcelable.Creator<BREB> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BREB.f62167a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BREB[i];
            }
        }

        private BREB() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "BREB";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$F24;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class F24 implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final F24 f62168a = new F24();

        @NotNull
        public static final Parcelable.Creator<F24> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return F24.f62168a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new F24[i];
            }
        }

        private F24() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "F24";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$GIRO_ALIAS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GIRO_ALIAS implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GIRO_ALIAS f62169a = new GIRO_ALIAS();

        @NotNull
        public static final Parcelable.Creator<GIRO_ALIAS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GIRO_ALIAS.f62169a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GIRO_ALIAS[i];
            }
        }

        private GIRO_ALIAS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "GIRO_ALIAS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$GIRO_QVIK;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GIRO_QVIK implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GIRO_QVIK f62170a = new GIRO_QVIK();

        @NotNull
        public static final Parcelable.Creator<GIRO_QVIK> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GIRO_QVIK.f62170a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GIRO_QVIK[i];
            }
        }

        private GIRO_QVIK() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "GIRO_QVIK";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$IRIS;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IRIS implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IRIS f62171a = new IRIS();

        @NotNull
        public static final Parcelable.Creator<IRIS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IRIS.f62171a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IRIS[i];
            }
        }

        private IRIS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "IRIS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$MBREF;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MBREF implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MBREF f62172a = new MBREF();

        @NotNull
        public static final Parcelable.Creator<MBREF> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MBREF.f62172a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MBREF[i];
            }
        }

        private MBREF() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "MBREF";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$MBWAY;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MBWAY implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MBWAY f62173a = new MBWAY();

        @NotNull
        public static final Parcelable.Creator<MBWAY> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MBWAY.f62173a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MBWAY[i];
            }
        }

        private MBWAY() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "MBWAY";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$PIX;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PIX implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PIX f62174a = new PIX();

        @NotNull
        public static final Parcelable.Creator<PIX> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PIX.f62174a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PIX[i];
            }
        }

        private PIX() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "PIX";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$PSE;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PSE implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PSE f62175a = new PSE();

        @NotNull
        public static final Parcelable.Creator<PSE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PSE.f62175a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PSE[i];
            }
        }

        private PSE() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "PSE";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$TAPI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TAPI implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TAPI f62176a = new TAPI();

        @NotNull
        public static final Parcelable.Creator<TAPI> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TAPI.f62176a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TAPI[i];
            }
        }

        private TAPI() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "TAPI";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$TAPI_CO;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TAPI_CO implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TAPI_CO f62177a = new TAPI_CO();

        @NotNull
        public static final Parcelable.Creator<TAPI_CO> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TAPI_CO.f62177a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TAPI_CO[i];
            }
        }

        private TAPI_CO() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "TAPI_CO";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$UPI;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UPI implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UPI f62178a = new UPI();

        @NotNull
        public static final Parcelable.Creator<UPI> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UPI.f62178a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UPI[i];
            }
        }

        private UPI() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "UPI";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod$WERO;", "Lcom/revolut/feature/apm/core/models/transfers/ApmPaymentMethod;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WERO implements ApmPaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WERO f62179a = new WERO();

        @NotNull
        public static final Parcelable.Creator<WERO> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WERO.f62179a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WERO[i];
            }
        }

        private WERO() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod
        public final String getValue() {
            return "WERO";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    String getValue();
}
