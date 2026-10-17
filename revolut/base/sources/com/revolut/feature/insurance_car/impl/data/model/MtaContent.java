package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kl7.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MtaContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f75244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsurableCar f75245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdditionalDriver f75246c;
    public final Survey.Licence d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaContent(a1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InsurableCar.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdditionalDriver.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Survey.Licence.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaContent[i];
        }
    }

    public MtaContent(a1 mtaType, InsurableCar insurableCar, AdditionalDriver additionalDriver, Survey.Licence licence) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        this.f75244a = mtaType;
        this.f75245b = insurableCar;
        this.f75246c = additionalDriver;
        this.d = licence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaContent)) {
            return false;
        }
        MtaContent mtaContent = (MtaContent) obj2;
        return this.f75244a == mtaContent.f75244a && Intrinsics.f(this.f75245b, mtaContent.f75245b) && Intrinsics.f(this.f75246c, mtaContent.f75246c) && Intrinsics.f(this.d, mtaContent.d);
    }

    public final int hashCode() {
        int iHashCode = this.f75244a.hashCode() * 31;
        InsurableCar insurableCar = this.f75245b;
        int iHashCode2 = (iHashCode + (insurableCar == null ? 0 : insurableCar.hashCode())) * 31;
        AdditionalDriver additionalDriver = this.f75246c;
        int iHashCode3 = (iHashCode2 + (additionalDriver == null ? 0 : additionalDriver.hashCode())) * 31;
        Survey.Licence licence = this.d;
        return iHashCode3 + (licence != null ? licence.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75244a.name());
        InsurableCar insurableCar = this.f75245b;
        if (insurableCar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insurableCar.writeToParcel(dest, i);
        }
        AdditionalDriver additionalDriver = this.f75246c;
        if (additionalDriver == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalDriver.writeToParcel(dest, i);
        }
        Survey.Licence licence = this.d;
        if (licence == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            licence.writeToParcel(dest, i);
        }
    }
}
