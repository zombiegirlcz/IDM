package com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/pickup_details/TravelExperiencesPickupDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesPickupDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesPickupDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93105b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(TravelExperiencesPickupDetailsScreenContract$InputData.class, parcel, arrayList, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(TravelExperiencesPickupDetailsScreenContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new TravelExperiencesPickupDetailsScreenContract$InputData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesPickupDetailsScreenContract$InputData[i];
        }
    }

    public TravelExperiencesPickupDetailsScreenContract$InputData(List questions, List currentAnswers) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(currentAnswers, "currentAnswers");
        this.f93104a = questions;
        this.f93105b = currentAnswers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesPickupDetailsScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesPickupDetailsScreenContract$InputData travelExperiencesPickupDetailsScreenContract$InputData = (TravelExperiencesPickupDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93104a, travelExperiencesPickupDetailsScreenContract$InputData.f93104a) && Intrinsics.f(this.f93105b, travelExperiencesPickupDetailsScreenContract$InputData.f93105b);
    }

    public final int hashCode() {
        return this.f93105b.hashCode() + (this.f93104a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f93104a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f93105b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
