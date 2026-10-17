package com.revolut.feature.freelancer.common.models.vat_reminders;

import android.os.Parcel;
import android.os.Parcelable;
import fs6.b;
import java.time.Month;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatReminder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerVatReminder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerVatReminder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f73499c;
    public final Month d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerVatReminder(parcel.readString(), parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Month.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerVatReminder[i];
        }
    }

    public FreelancerVatReminder(String id10, boolean z, b assessmentPeriod, Month month) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        this.f73497a = id10;
        this.f73498b = z;
        this.f73499c = assessmentPeriod;
        this.d = month;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerVatReminder)) {
            return false;
        }
        FreelancerVatReminder freelancerVatReminder = (FreelancerVatReminder) obj2;
        return Intrinsics.f(this.f73497a, freelancerVatReminder.f73497a) && this.f73498b == freelancerVatReminder.f73498b && this.f73499c == freelancerVatReminder.f73499c && this.d == freelancerVatReminder.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f73499c.hashCode() + j6.a.c(this.f73497a.hashCode() * 31, 31, this.f73498b)) * 31;
        Month month = this.d;
        return iHashCode + (month == null ? 0 : month.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73497a);
        dest.writeInt(this.f73498b ? 1 : 0);
        dest.writeString(this.f73499c.name());
        Month month = this.d;
        if (month == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(month.name());
        }
    }
}
