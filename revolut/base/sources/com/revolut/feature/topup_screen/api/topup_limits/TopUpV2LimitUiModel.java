package com.revolut.feature.topup_screen.api.topup_limits;

import android.os.Parcel;
import android.os.Parcelable;
import aue.c;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel;", "Landroid/os/Parcelable;", "<init>", "()V", "UpperBoundLimitUiModel", "SingleValueLimitUiModel", "Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel$SingleValueLimitUiModel;", "Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel$UpperBoundLimitUiModel;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TopUpV2LimitUiModel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel$SingleValueLimitUiModel;", "Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleValueLimitUiModel extends TopUpV2LimitUiModel {

        @NotNull
        public static final Parcelable.Creator<SingleValueLimitUiModel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f90557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f90558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f90559c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleValueLimitUiModel(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleValueLimitUiModel[i];
            }
        }

        public SingleValueLimitUiModel(c type, d totalLimit, d dVar) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
            this.f90557a = type;
            this.f90558b = totalLimit;
            this.f90559c = dVar;
        }

        @Override // com.revolut.feature.topup_screen.api.topup_limits.TopUpV2LimitUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getF90560a() {
            return this.f90557a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleValueLimitUiModel)) {
                return false;
            }
            SingleValueLimitUiModel singleValueLimitUiModel = (SingleValueLimitUiModel) obj2;
            return this.f90557a == singleValueLimitUiModel.f90557a && Intrinsics.f(this.f90558b, singleValueLimitUiModel.f90558b) && Intrinsics.f(this.f90559c, singleValueLimitUiModel.f90559c);
        }

        public final int hashCode() {
            int iC = v7.c(this.f90557a.hashCode() * 31, 31, this.f90558b);
            d dVar = this.f90559c;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90557a.name());
            dest.writeSerializable(this.f90558b);
            dest.writeSerializable(this.f90559c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel$UpperBoundLimitUiModel;", "Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel;", "", "toString", "()Ljava/lang/String;", "LimitInTopUpCurrency", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpperBoundLimitUiModel extends TopUpV2LimitUiModel {

        @NotNull
        public static final Parcelable.Creator<UpperBoundLimitUiModel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f90560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f90561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f90562c;
        public final d d;
        public final LimitInTopUpCurrency e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpV2LimitUiModel$UpperBoundLimitUiModel$LimitInTopUpCurrency;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LimitInTopUpCurrency implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<LimitInTopUpCurrency> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f90563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f90564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f90565c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LimitInTopUpCurrency((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LimitInTopUpCurrency[i];
                }
            }

            public LimitInTopUpCurrency(d totalLimit, d usedLimit, d remainingLimit) {
                Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
                Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
                Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
                this.f90563a = totalLimit;
                this.f90564b = usedLimit;
                this.f90565c = remainingLimit;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LimitInTopUpCurrency)) {
                    return false;
                }
                LimitInTopUpCurrency limitInTopUpCurrency = (LimitInTopUpCurrency) obj2;
                return Intrinsics.f(this.f90563a, limitInTopUpCurrency.f90563a) && Intrinsics.f(this.f90564b, limitInTopUpCurrency.f90564b) && Intrinsics.f(this.f90565c, limitInTopUpCurrency.f90565c);
            }

            public final int hashCode() {
                return this.f90565c.hashCode() + v7.c(this.f90563a.hashCode() * 31, 31, this.f90564b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f90563a);
                dest.writeSerializable(this.f90564b);
                dest.writeSerializable(this.f90565c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpperBoundLimitUiModel(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : LimitInTopUpCurrency.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpperBoundLimitUiModel[i];
            }
        }

        public UpperBoundLimitUiModel(c type, d totalLimit, d usedLimit, d remainingLimit, LimitInTopUpCurrency limitInTopUpCurrency) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
            Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
            Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
            this.f90560a = type;
            this.f90561b = totalLimit;
            this.f90562c = usedLimit;
            this.d = remainingLimit;
            this.e = limitInTopUpCurrency;
        }

        @Override // com.revolut.feature.topup_screen.api.topup_limits.TopUpV2LimitUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getF90560a() {
            return this.f90560a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpperBoundLimitUiModel)) {
                return false;
            }
            UpperBoundLimitUiModel upperBoundLimitUiModel = (UpperBoundLimitUiModel) obj2;
            return this.f90560a == upperBoundLimitUiModel.f90560a && Intrinsics.f(this.f90561b, upperBoundLimitUiModel.f90561b) && Intrinsics.f(this.f90562c, upperBoundLimitUiModel.f90562c) && Intrinsics.f(this.d, upperBoundLimitUiModel.d) && Intrinsics.f(this.e, upperBoundLimitUiModel.e);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(v7.c(this.f90560a.hashCode() * 31, 31, this.f90561b), 31, this.f90562c), 31, this.d);
            LimitInTopUpCurrency limitInTopUpCurrency = this.e;
            return iC + (limitInTopUpCurrency == null ? 0 : limitInTopUpCurrency.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90560a.name());
            dest.writeSerializable(this.f90561b);
            dest.writeSerializable(this.f90562c);
            dest.writeSerializable(this.d);
            LimitInTopUpCurrency limitInTopUpCurrency = this.e;
            if (limitInTopUpCurrency == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                limitInTopUpCurrency.writeToParcel(dest, i);
            }
        }
    }

    private TopUpV2LimitUiModel() {
    }

    /* JADX INFO: renamed from: a */
    public abstract c getF90560a();
}
