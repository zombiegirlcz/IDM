package com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.assessment_period;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import fs6.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/vat_reminder/dialog/assessment_period/FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74438b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(b.valueOf(parcel.readString()));
            }
            return new FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData(linkedHashSet, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData[i];
        }
    }

    public FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData(Set assessmentPeriods, b bVar) {
        Intrinsics.checkNotNullParameter(assessmentPeriods, "assessmentPeriods");
        this.f74437a = assessmentPeriods;
        this.f74438b = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData)) {
            return false;
        }
        FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData = (FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74437a, freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData.f74437a) && this.f74438b == freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData.f74438b;
    }

    public final int hashCode() {
        int iHashCode = this.f74437a.hashCode() * 31;
        b bVar = this.f74438b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f74437a, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        b bVar = this.f74438b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
