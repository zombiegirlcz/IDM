package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult;", "Landroid/os/Parcelable;", "Success", "Decline", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult$Decline;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult$Success;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MtaCreateResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult$Decline;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Decline implements MtaCreateResult {

        @NotNull
        public static final Parcelable.Creator<Decline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f75247a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Decline(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Decline[i];
            }
        }

        public Decline(boolean z) {
            this.f75247a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Decline) && this.f75247a == ((Decline) obj2).f75247a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75247a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f75247a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult$Success;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaCreateResult;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements MtaCreateResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MtaQuote f75249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75250c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), MtaQuote.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String mtaId, MtaQuote mtaQuote, String applicationId) {
            Intrinsics.checkNotNullParameter(mtaId, "mtaId");
            Intrinsics.checkNotNullParameter(mtaQuote, "mtaQuote");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.f75248a = mtaId;
            this.f75249b = mtaQuote;
            this.f75250c = applicationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f75248a, success.f75248a) && Intrinsics.f(this.f75249b, success.f75249b) && Intrinsics.f(this.f75250c, success.f75250c);
        }

        public final int hashCode() {
            return this.f75250c.hashCode() + ((this.f75249b.hashCode() + (this.f75248a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75248a);
            this.f75249b.writeToParcel(dest, i);
            dest.writeString(this.f75250c);
        }
    }
}
