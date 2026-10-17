package com.revolut.feature.freelancer.impl.ui.dialog.date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/dialog/date_picker/FreelancerDatePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerDatePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerDatePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f73770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f73771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f73772c;
    public final LocalDate d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerDatePickerScreenContract$InputData((Clause) parcel.readParcelable(FreelancerDatePickerScreenContract$InputData.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerDatePickerScreenContract$InputData[i];
        }
    }

    public FreelancerDatePickerScreenContract$InputData(Clause title, LocalDate presentedMonth, LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        this.f73770a = title;
        this.f73771b = presentedMonth;
        this.f73772c = localDate;
        this.d = localDate2;
        this.e = localDate3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerDatePickerScreenContract$InputData)) {
            return false;
        }
        FreelancerDatePickerScreenContract$InputData freelancerDatePickerScreenContract$InputData = (FreelancerDatePickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73770a, freelancerDatePickerScreenContract$InputData.f73770a) && Intrinsics.f(this.f73771b, freelancerDatePickerScreenContract$InputData.f73771b) && Intrinsics.f(this.f73772c, freelancerDatePickerScreenContract$InputData.f73772c) && Intrinsics.f(this.d, freelancerDatePickerScreenContract$InputData.d) && Intrinsics.f(this.e, freelancerDatePickerScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iA = y.a(this.f73770a.hashCode() * 31, 31, this.f73771b);
        LocalDate localDate = this.f73772c;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.e;
        return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73770a, i);
        dest.writeSerializable(this.f73771b);
        dest.writeSerializable(this.f73772c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }

    public /* synthetic */ FreelancerDatePickerScreenContract$InputData(TextLocalisedClause textLocalisedClause, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, int i) {
        this(textLocalisedClause, localDate, (i & 4) != 0 ? null : localDate2, (i & 8) != 0 ? null : localDate3, (i & 16) != 0 ? null : localDate4);
    }
}
