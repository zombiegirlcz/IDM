package com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/details/section_details/SectionDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SectionDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SectionDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f78706b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SectionDetailsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new SectionDetailsScreenContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SectionDetailsScreenContract$InputData[i];
        }
    }

    public SectionDetailsScreenContract$InputData(String title, ArrayList fields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f78705a = title;
        this.f78706b = fields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SectionDetailsScreenContract$InputData)) {
            return false;
        }
        SectionDetailsScreenContract$InputData sectionDetailsScreenContract$InputData = (SectionDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78705a, sectionDetailsScreenContract$InputData.f78705a) && this.f78706b.equals(sectionDetailsScreenContract$InputData.f78706b);
    }

    public final int hashCode() {
        return this.f78706b.hashCode() + (this.f78705a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78705a);
        Iterator itY = j6.a.y(this.f78706b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
