package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationAmendment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "j02/a", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentAuthorisationAmendment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentAuthorisationAmendment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j02.a f61984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f61985c;
    public final LocalDate d;
    public final ApmPaymentAuthorisationPaymentMethod e;
    public final ApmPaymentAuthorisationSummary f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Changes f61986g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentAuthorisationAmendment(parcel.readString(), parcel.readInt() == 0 ? null : j02.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : ApmPaymentAuthorisationPaymentMethod.CREATOR.createFromParcel(parcel), ApmPaymentAuthorisationSummary.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Changes.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentAuthorisationAmendment[i];
        }
    }

    public ApmPaymentAuthorisationAmendment(String id10, j02.a aVar, LocalDate createdDate, LocalDate localDate, ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, ApmPaymentAuthorisationSummary paymentAuthorisation, Changes changes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
        this.f61983a = id10;
        this.f61984b = aVar;
        this.f61985c = createdDate;
        this.d = localDate;
        this.e = apmPaymentAuthorisationPaymentMethod;
        this.f = paymentAuthorisation;
        this.f61986g = changes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentAuthorisationAmendment)) {
            return false;
        }
        ApmPaymentAuthorisationAmendment apmPaymentAuthorisationAmendment = (ApmPaymentAuthorisationAmendment) obj2;
        return Intrinsics.f(this.f61983a, apmPaymentAuthorisationAmendment.f61983a) && this.f61984b == apmPaymentAuthorisationAmendment.f61984b && Intrinsics.f(this.f61985c, apmPaymentAuthorisationAmendment.f61985c) && Intrinsics.f(this.d, apmPaymentAuthorisationAmendment.d) && this.e == apmPaymentAuthorisationAmendment.e && Intrinsics.f(this.f, apmPaymentAuthorisationAmendment.f) && Intrinsics.f(this.f61986g, apmPaymentAuthorisationAmendment.f61986g);
    }

    public final int hashCode() {
        int iHashCode = this.f61983a.hashCode() * 31;
        j02.a aVar = this.f61984b;
        int iA = y.a((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f61985c);
        LocalDate localDate = this.d;
        int iHashCode2 = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (apmPaymentAuthorisationPaymentMethod == null ? 0 : apmPaymentAuthorisationPaymentMethod.hashCode())) * 31)) * 31;
        Changes changes = this.f61986g;
        return iHashCode3 + (changes != null ? changes.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61983a);
        j02.a aVar = this.f61984b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f61985c);
        dest.writeSerializable(this.d);
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = this.e;
        if (apmPaymentAuthorisationPaymentMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmPaymentAuthorisationPaymentMethod.writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
        Changes changes = this.f61986g;
        if (changes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            changes.writeToParcel(dest, i);
        }
    }
}
