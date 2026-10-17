package com.revolut.feature.transfer.models.withholding_tax;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qrf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/withholding_tax/WithholdingTaxTreatmentOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WithholdingTaxTreatmentOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithholdingTaxTreatmentOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92311c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithholdingTaxTreatmentOption(b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WithholdingTaxTreatmentOption[i];
        }
    }

    public WithholdingTaxTreatmentOption(b type, String title, String description, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f92309a = type;
        this.f92310b = title;
        this.f92311c = description;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WithholdingTaxTreatmentOption)) {
            return false;
        }
        WithholdingTaxTreatmentOption withholdingTaxTreatmentOption = (WithholdingTaxTreatmentOption) obj2;
        return this.f92309a == withholdingTaxTreatmentOption.f92309a && Intrinsics.f(this.f92310b, withholdingTaxTreatmentOption.f92310b) && Intrinsics.f(this.f92311c, withholdingTaxTreatmentOption.f92311c) && this.d == withholdingTaxTreatmentOption.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f92309a.hashCode() * 31, 31, this.f92310b), 31, this.f92311c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92309a.name());
        dest.writeString(this.f92310b);
        dest.writeString(this.f92311c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
