package com.revolut.feature.freelancer.common.models.tax_hub;

import android.os.Parcel;
import android.os.Parcelable;
import ds6.n;
import ds6.o;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubAssessmentStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubAssessmentStep implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f73481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f73482c;
    public final LocalDate d;

    @NotNull
    public static final Parcelable.Creator<TaxHubAssessmentStep> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubAssessmentStep(parcel.readString(), o.valueOf(parcel.readString()), n.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubAssessmentStep[i];
        }
    }

    public TaxHubAssessmentStep(String id10, o type, n state, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f73480a = id10;
        this.f73481b = type;
        this.f73482c = state;
        this.d = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubAssessmentStep)) {
            return false;
        }
        TaxHubAssessmentStep taxHubAssessmentStep = (TaxHubAssessmentStep) obj2;
        return Intrinsics.f(this.f73480a, taxHubAssessmentStep.f73480a) && this.f73481b == taxHubAssessmentStep.f73481b && this.f73482c == taxHubAssessmentStep.f73482c && Intrinsics.f(this.d, taxHubAssessmentStep.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f73482c.hashCode() + ((this.f73481b.hashCode() + (this.f73480a.hashCode() * 31)) * 31)) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73480a);
        dest.writeString(this.f73481b.name());
        dest.writeString(this.f73482c.name());
        dest.writeSerializable(this.d);
    }
}
