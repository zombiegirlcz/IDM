package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$SingleChoiceItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerSingleChoiceScreenContract$SingleChoiceItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerSingleChoiceScreenContract$SingleChoiceItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f73778b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerSingleChoiceScreenContract$SingleChoiceItem((Clause) parcel.readParcelable(FreelancerSingleChoiceScreenContract$SingleChoiceItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerSingleChoiceScreenContract$SingleChoiceItem[i];
        }
    }

    public FreelancerSingleChoiceScreenContract$SingleChoiceItem(Clause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f73777a = id10;
        this.f73778b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerSingleChoiceScreenContract$SingleChoiceItem)) {
            return false;
        }
        FreelancerSingleChoiceScreenContract$SingleChoiceItem freelancerSingleChoiceScreenContract$SingleChoiceItem = (FreelancerSingleChoiceScreenContract$SingleChoiceItem) obj2;
        return Intrinsics.f(this.f73777a, freelancerSingleChoiceScreenContract$SingleChoiceItem.f73777a) && Intrinsics.f(this.f73778b, freelancerSingleChoiceScreenContract$SingleChoiceItem.f73778b);
    }

    public final int hashCode() {
        return this.f73778b.hashCode() + (this.f73777a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73777a);
        dest.writeParcelable(this.f73778b, i);
    }
}
