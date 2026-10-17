package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerSingleChoiceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerSingleChoiceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f73773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerSingleChoiceScreenContract$MenuItem f73774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f73775c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", FreelancerSingleChoiceScreenContract$InputData.class);
            FreelancerSingleChoiceScreenContract$MenuItem freelancerSingleChoiceScreenContract$MenuItem = (FreelancerSingleChoiceScreenContract$MenuItem) parcel.readParcelable(FreelancerSingleChoiceScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerSingleChoiceScreenContract$SingleChoiceItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FreelancerSingleChoiceScreenContract$InputData(clause, freelancerSingleChoiceScreenContract$MenuItem, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerSingleChoiceScreenContract$InputData[i];
        }
    }

    public FreelancerSingleChoiceScreenContract$InputData(Clause title, FreelancerSingleChoiceScreenContract$MenuItem freelancerSingleChoiceScreenContract$MenuItem, List items, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f73773a = title;
        this.f73774b = freelancerSingleChoiceScreenContract$MenuItem;
        this.f73775c = items;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerSingleChoiceScreenContract$InputData)) {
            return false;
        }
        FreelancerSingleChoiceScreenContract$InputData freelancerSingleChoiceScreenContract$InputData = (FreelancerSingleChoiceScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73773a, freelancerSingleChoiceScreenContract$InputData.f73773a) && Intrinsics.f(this.f73774b, freelancerSingleChoiceScreenContract$InputData.f73774b) && Intrinsics.f(this.f73775c, freelancerSingleChoiceScreenContract$InputData.f73775c) && Intrinsics.f(this.d, freelancerSingleChoiceScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f73773a.hashCode() * 31;
        FreelancerSingleChoiceScreenContract$MenuItem freelancerSingleChoiceScreenContract$MenuItem = this.f73774b;
        int iD = p.a.d((iHashCode + (freelancerSingleChoiceScreenContract$MenuItem == null ? 0 : freelancerSingleChoiceScreenContract$MenuItem.hashCode())) * 31, 31, this.f73775c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73773a, i);
        dest.writeParcelable(this.f73774b, i);
        Iterator itV = p.a.v(this.f73775c, dest);
        while (itV.hasNext()) {
            ((FreelancerSingleChoiceScreenContract$SingleChoiceItem) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
    }
}
